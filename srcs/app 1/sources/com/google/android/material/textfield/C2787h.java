package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout.C2757f;
import com.google.android.material.textfield.TextInputLayout.C2758g;
import p071f.p072a.p073k.p074a.C3103a;
import p147g.p156d.p157a.p185c.C4409e;
import p147g.p156d.p157a.p185c.C4414j;

/* renamed from: com.google.android.material.textfield.h */
class C2787h extends C2783e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f8195d = new C2788a();

    /* renamed from: e */
    private final C2757f f8196e = new C2789b();

    /* renamed from: f */
    private final C2758g f8197f = new C2790c(this);

    /* renamed from: com.google.android.material.textfield.h$a */
    class C2788a implements TextWatcher {
        C2788a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C2787h hVar = C2787h.this;
            hVar.f8167c.setChecked(!hVar.m11623c());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    class C2789b implements C2757f {
        C2789b() {
        }

        /* renamed from: a */
        public void mo9312a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            C2787h hVar = C2787h.this;
            hVar.f8167c.setChecked(!hVar.m11623c());
            editText.removeTextChangedListener(C2787h.this.f8195d);
            editText.addTextChangedListener(C2787h.this.f8195d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    class C2790c implements C2758g {
        C2790c(C2787h hVar) {
        }

        /* renamed from: a */
        public void mo9313a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    class C2791d implements OnClickListener {
        C2791d() {
        }

        public void onClick(View view) {
            EditText editText = C2787h.this.f8165a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C2787h.this.m11623c() ? null : PasswordTransformationMethod.getInstance());
                editText.setSelection(selectionEnd);
            }
        }
    }

    C2787h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m11623c() {
        EditText editText = this.f8165a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9318a() {
        this.f8165a.setEndIconDrawable(C3103a.m12557c(this.f8166b, C4409e.design_password_eye));
        TextInputLayout textInputLayout = this.f8165a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C4414j.password_toggle_content_description));
        this.f8165a.setEndIconOnClickListener(new C2791d());
        this.f8165a.mo9170a(this.f8196e);
        this.f8165a.mo9171a(this.f8197f);
    }
}
