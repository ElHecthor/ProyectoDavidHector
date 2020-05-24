package com.wiki.game.wizardlabs.Activities;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wiki.game.wizardlabs.Adapters.CommentAdapter;
import com.wiki.game.wizardlabs.Models.Comment;
import com.wiki.game.wizardlabs.R;

import java.util.ArrayList;
import java.util.List;

public class GameDetailActivity extends AppCompatActivity {

    ImageView imgGame, imgCurrentUser;
    TextView txtGameNameDetail, txtGenre, txtPlayers, txtPlatform, txtDescription;
    EditText edComment;
    Button btnAddComment;
    String GameKey;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    FirebaseDatabase firebaseDatabase;

    RecyclerView RvComment;
    CommentAdapter commentAdapter;
    List<Comment> listComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);

        // Barra de arriba
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getSupportActionBar().hide();

        // ini views
        RvComment = findViewById(R.id.rv_detail);
        imgGame = findViewById(R.id.iv_detail);
        imgCurrentUser = findViewById(R.id.iv_CurrentUserComment);
        txtGameNameDetail = findViewById(R.id.tv_detailTitle);
        txtGenre = findViewById(R.id.tv_detailGenre);
        txtPlayers = findViewById(R.id.tv_detailPlayers);
        txtPlatform = findViewById(R.id.tv_detailPlatform);
        txtDescription = findViewById(R.id.tv_detailDescription);
        edComment = findViewById(R.id.ed_detailComment);
        btnAddComment = findViewById(R.id.btn_detailAddComment);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();

        String gameImage = getIntent().getExtras().getString("cover");
        Glide.with(this).load(gameImage).into(imgGame);
        String gameName = (String) getIntent().getExtras().get("name");
        txtGameNameDetail.setText(gameName);
        String gameGenre = (String) getIntent().getExtras().get("genre");
        txtGenre.setText(gameGenre);
        String gamePlayers = (String) getIntent().getExtras().get("players");
        txtPlayers.setText(gamePlayers);
        String gamePlatform = (String) getIntent().getExtras().get("platform");
        txtPlatform.setText(gamePlatform);

        String gameDescription = (String) getIntent().getExtras().get("description");
        txtDescription.setText(gameDescription);

        Glide.with(this).load(firebaseUser.getPhotoUrl()).into(imgCurrentUser);
        GameKey = getIntent().getExtras().getString("gameKey");

        // Añadir comentarios
        btnAddComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnAddComment.setVisibility(View.INVISIBLE);

                DatabaseReference commentReference = firebaseDatabase.getReference("comments").child(GameKey).push();
                String comment_content = edComment.getText().toString();
                String uid = firebaseUser.getUid();
                String uname = firebaseUser.getDisplayName();
                String uimg = firebaseUser.getPhotoUrl().toString();
                Comment comment = new Comment(comment_content, uid, uimg, uname);

                commentReference.setValue(comment).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        showMessage("Comment Added");
                        edComment.setText("");
                        btnAddComment.setVisibility(View.VISIBLE);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        showMessage("Fail To Add Comment: " + e.getMessage());
                    }
                });
            }
        });

        // ini RecyclerView, inflate
        iniRvComment();
    }

    private void iniRvComment() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        layoutManager.setReverseLayout(true);
        RvComment.setLayoutManager(layoutManager);

        DatabaseReference commentRef = firebaseDatabase.getReference("comments").child(GameKey);
        commentRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listComment = new ArrayList<>();
                for (DataSnapshot snap: dataSnapshot.getChildren()){
                    Comment comment = snap.getValue(Comment.class);
                    listComment.add(comment);
                }
                commentAdapter = new CommentAdapter(getApplicationContext(), listComment);
                RvComment.setAdapter(commentAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }

    private void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
