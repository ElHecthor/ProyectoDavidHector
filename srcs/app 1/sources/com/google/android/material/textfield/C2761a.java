package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout.C2757f;
import p071f.p072a.p073k.p074a.C3103a;
import p147g.p156d.p157a.p185c.C4409e;
import p147g.p156d.p157a.p185c.C4414j;
import p147g.p156d.p157a.p185c.p189m.C4417a;

/* renamed from: com.google.android.material.textfield.a */
class C2761a extends C2783e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f8126d = new C2762a();

    /* renamed from: e */
    private final C2757f f8127e = new C2763b();

    /* renamed from: f */
    private AnimatorSet f8128f;

    /* renamed from: g */
    private ValueAnimator f8129g;

    /* renamed from: com.google.android.material.textfield.a$a */
    class C2762a implements TextWatcher {
        C2762a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C2761a.this.f8165a.getSuffixText() == null) {
                C2761a.this.m11527b(C2761a.m11528b(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    class C2763b implements C2757f {

        /* renamed from: com.google.android.material.textfield.a$b$a */
        class C2764a implements OnFocusChangeListener {
            C2764a() {
            }

            public void onFocusChange(View view, boolean z) {
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
                C2761a aVar = C2761a.this;
                if (!z3 || !z) {
                    z2 = false;
                }
                aVar.m11527b(z2);
            }
        }

        C2763b() {
        }

        /* renamed from: a */
        public void mo9312a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C2761a.m11528b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(new C2764a());
            editText.removeTextChangedListener(C2761a.this.f8126d);
            editText.addTextChangedListener(C2761a.this.f8126d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    class C2765c implements OnClickListener {
        C2765c() {
        }

        public void onClick(View view) {
            C2761a.this.f8165a.getEditText().setText(null);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    class C2766d extends AnimatorListenerAdapter {
        C2766d() {
        }

        public void onAnimationStart(Animator animator) {
            C2761a.this.f8165a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    class C2767e extends AnimatorListenerAdapter {
        C2767e() {
        }

        public void onAnimationEnd(Animator animator) {
            C2761a.this.f8165a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    class C2768f implements AnimatorUpdateListener {
        C2768f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2761a.this.f8167c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    class C2769g implements AnimatorUpdateListener {
        C2769g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2761a.this.f8167c.setScaleX(floatValue);
            C2761a.this.f8167c.setScaleY(floatValue);
        }
    }

    C2761a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private ValueAnimator m11523a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C4417a.f11712a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C2768f());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11527b(boolean z) {
        boolean z2 = this.f8165a.mo9173a() == z;
        if (z) {
            this.f8129g.cancel();
            this.f8128f.start();
            if (z2) {
                this.f8128f.end();
                return;
            }
            return;
        }
        this.f8128f.cancel();
        this.f8129g.start();
        if (z2) {
            this.f8129g.end();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m11528b(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: c */
    private ValueAnimator m11529c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C4417a.f11715d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C2769g());
        return ofFloat;
    }

    /* renamed from: d */
    private void m11530d() {
        ValueAnimator c = m11529c();
        ValueAnimator a = m11523a(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8128f = animatorSet;
        animatorSet.playTogether(new Animator[]{c, a});
        this.f8128f.addListener(new C2766d());
        ValueAnimator a2 = m11523a(1.0f, 0.0f);
        this.f8129g = a2;
        a2.addListener(new C2767e());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9318a() {
        this.f8165a.setEndIconDrawable(C3103a.m12557c(this.f8166b, C4409e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f8165a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C4414j.clear_text_end_icon_content_description));
        this.f8165a.setEndIconOnClickListener(new C2765c());
        this.f8165a.mo9170a(this.f8127e);
        m11530d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9319a(boolean z) {
        if (this.f8165a.getSuffixText() != null) {
            m11527b(z);
        }
    }
}
