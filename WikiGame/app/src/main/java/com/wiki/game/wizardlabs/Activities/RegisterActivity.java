package com.wiki.game.wizardlabs.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.wiki.game.wizardlabs.R;

public class RegisterActivity extends AppCompatActivity {

    ImageView img_userPhoto;
    static int PReqCode = 1;
    static int REQUESTCODE = 1;
    Uri pickedImgUri;

    private EditText userEmail, userPassword, userPassword2, userName;
    private ProgressBar loadingProgressBar;
    private Button regBtn;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Codigo para cambiar la foto
        img_userPhoto = findViewById(R.id.img_userPhoto);
        Resources res = getApplicationContext().getResources();
        pickedImgUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + res.getResourcePackageName(R.drawable.userphoto)
                + '/' + res.getResourceTypeName(R.drawable.userphoto)
                + '/' + res.getResourceEntryName(R.drawable.userphoto));

        img_userPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 4000) {
                    checkAndRequestPermission();
                } else {
                    openGallery();
                }
            }
        });

        // Guardar Usuario en FireBase
        userEmail = findViewById(R.id.ed_regMail);
        userName = findViewById(R.id.ed_regName);
        userPassword = findViewById(R.id.ed_regPasswd);
        userPassword2 = findViewById(R.id.ed_regPasswd2);
        loadingProgressBar = findViewById(R.id.pb_reg);
        loadingProgressBar.setVisibility(View.INVISIBLE);
        regBtn = findViewById(R.id.btn_reg);

        mAuth = FirebaseAuth.getInstance();

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regBtn.setVisibility(View.INVISIBLE);
                loadingProgressBar.setVisibility(View.VISIBLE);
                final String email = userEmail.getText().toString();
                final String password = userPassword.getText().toString();
                final String password2 = userPassword2.getText().toString();
                final String name = userName.getText().toString();

                if (email.isEmpty() || name.isEmpty() || password.isEmpty() || !password.equals(password2)) {
                    // Algo ha ido mal rellenando los campos
                    showMessage("Please Verify All Fields");
                    regBtn.setVisibility(View.VISIBLE);
                    loadingProgressBar.setVisibility(View.INVISIBLE);

                } else {
                    // todos los campos estan rellenados y las passwords coinciden
                    createUserAccount(email, name, password);
                }
            }
        });
    }

    private void createUserAccount(String email, final String name, String password) {
        // Crea un usuario
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Crear un usuario a concluido
                            // Despues de crear la cuenta de usuario necesitamos actualizar su imagen de perfil y nombre
                            updateUserInfo( name, pickedImgUri, mAuth.getCurrentUser());

                        } else {
                            // Crear un usuario a fallado
                            showMessage("Account Creation Failed");
                            regBtn.setVisibility(View.VISIBLE);
                            loadingProgressBar.setVisibility(View.INVISIBLE);
                        }
                    }
                });
    }

    private void updateUserInfo(final String name, Uri pickedImgUri, final FirebaseUser currentUser) {
        showMessage("1");
        StorageReference mStorage = FirebaseStorage.getInstance().getReference().child("users_photos");
        showMessage("2");
        final StorageReference imageFilePath = mStorage.child(pickedImgUri.getLastPathSegment());
        showMessage("3");
        imageFilePath.putFile(pickedImgUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                // Imagen cargada correctamente
                imageFilePath.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        // Uri tiene la imagen
                        UserProfileChangeRequest profileUpdate = new UserProfileChangeRequest.Builder()
                                .setDisplayName(name)
                                .setPhotoUri(uri)
                                .build();

                        currentUser.updateProfile(profileUpdate)
                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()) {
                                            showMessage("Register Complete");
                                            updateUI();
                                        }
                                    }
                                });
                    }
                });
            }
        });
    }

    private void updateUI() {
        Intent homeActivity = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(homeActivity);
        finish();
    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    private void openGallery() {
        // coger una imagen de la galeria
        Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
        galleryIntent.setType("image/*");
        startActivityForResult(galleryIntent, REQUESTCODE);
    }

    private void checkAndRequestPermission() {
        // Pedir permiso para acceder a la STORAGE
        if (ContextCompat.checkSelfPermission(RegisterActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(RegisterActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                Toast.makeText(RegisterActivity.this, "Please accept for required permission", Toast.LENGTH_SHORT).show();
            } else {
                ActivityCompat.requestPermissions(RegisterActivity.this,
                        new String[] {Manifest.permission.READ_EXTERNAL_STORAGE},
                        PReqCode);
            }
        } else {
            openGallery();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUESTCODE && data != null) {
            // El usuario a podido coger una imagen
            // necesitamos guardar la referencia en una variable URI
            pickedImgUri = data.getData();
            img_userPhoto.setImageURI(pickedImgUri);
        }
    }
}
