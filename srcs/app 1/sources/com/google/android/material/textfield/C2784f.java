package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0391i;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p189m.C4418b;

/* renamed from: com.google.android.material.textfield.f */
final class C2784f {

    /* renamed from: a */
    private final Context f8168a;

    /* renamed from: b */
    private final TextInputLayout f8169b;

    /* renamed from: c */
    private LinearLayout f8170c;

    /* renamed from: d */
    private int f8171d;

    /* renamed from: e */
    private FrameLayout f8172e;

    /* renamed from: f */
    private int f8173f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Animator f8174g;

    /* renamed from: h */
    private final float f8175h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f8176i;

    /* renamed from: j */
    private int f8177j;

    /* renamed from: k */
    private CharSequence f8178k;

    /* renamed from: l */
    private boolean f8179l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f8180m;

    /* renamed from: n */
    private CharSequence f8181n;

    /* renamed from: o */
    private int f8182o;

    /* renamed from: p */
    private ColorStateList f8183p;

    /* renamed from: q */
    private CharSequence f8184q;

    /* renamed from: r */
    private boolean f8185r;

    /* renamed from: s */
    private TextView f8186s;

    /* renamed from: t */
    private int f8187t;

    /* renamed from: u */
    private ColorStateList f8188u;

    /* renamed from: v */
    private Typeface f8189v;

    /* renamed from: com.google.android.material.textfield.f$a */
    class C2785a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f8190a;

        /* renamed from: b */
        final /* synthetic */ TextView f8191b;

        /* renamed from: c */
        final /* synthetic */ int f8192c;

        /* renamed from: d */
        final /* synthetic */ TextView f8193d;

        C2785a(int i, TextView textView, int i2, TextView textView2) {
            this.f8190a = i;
            this.f8191b = textView;
            this.f8192c = i2;
            this.f8193d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            C2784f.this.f8176i = this.f8190a;
            C2784f.this.f8174g = null;
            TextView textView = this.f8191b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f8192c == 1 && C2784f.this.f8180m != null) {
                    C2784f.this.f8180m.setText(null);
                }
            }
            TextView textView2 = this.f8193d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f8193d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f8193d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C2784f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f8168a = context;
        this.f8169b = textInputLayout;
        this.f8175h = (float) context.getResources().getDimensionPixelSize(C4408d.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    private ObjectAnimator m11582a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f8175h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C4417a.f11715d);
        return ofFloat;
    }

    /* renamed from: a */
    private ObjectAnimator m11583a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C4417a.f11712a);
        return ofFloat;
    }

    /* renamed from: a */
    private void m11585a(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView d = m11591d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView d2 = m11591d(i);
                if (d2 != null) {
                    d2.setVisibility(4);
                    if (i == 1) {
                        d2.setText(null);
                    }
                }
            }
            this.f8176i = i2;
        }
    }

    /* renamed from: a */
    private void m11586a(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f8174g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m11589a(arrayList2, this.f8185r, this.f8186s, 2, i3, i4);
                m11589a(arrayList2, this.f8179l, this.f8180m, 1, i3, i4);
                C4418b.m18007a(animatorSet, arrayList);
                C2785a aVar = new C2785a(i2, m11591d(i), i, m11591d(i2));
                animatorSet.addListener(aVar);
                animatorSet.start();
            } else {
                m11585a(i, i2);
            }
            this.f8169b.mo9183f();
            this.f8169b.mo9172a(z2);
            this.f8169b.mo9184g();
        }
    }

    /* renamed from: a */
    private void m11587a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m11588a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    private void m11589a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m11583a(textView, i3 == i));
                if (i3 == i) {
                    list.add(m11582a(textView));
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m11590a(TextView textView, CharSequence charSequence) {
        return C3379v.m13768D(this.f8169b) && this.f8169b.isEnabled() && (this.f8177j != this.f8176i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: d */
    private TextView m11591d(int i) {
        if (i == 1) {
            return this.f8180m;
        }
        if (i != 2) {
            return null;
        }
        return this.f8186s;
    }

    /* renamed from: e */
    private boolean m11592e(int i) {
        return i == 1 && this.f8180m != null && !TextUtils.isEmpty(this.f8178k);
    }

    /* renamed from: n */
    private boolean m11593n() {
        return (this.f8170c == null || this.f8169b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9343a() {
        if (m11593n()) {
            C3379v.m13783a(this.f8170c, C3379v.m13834u(this.f8169b.getEditText()), 0, C3379v.m13833t(this.f8169b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9344a(ColorStateList colorStateList) {
        this.f8183p = colorStateList;
        TextView textView = this.f8180m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9345a(Typeface typeface) {
        if (typeface != this.f8189v) {
            this.f8189v = typeface;
            m11588a(this.f8180m, typeface);
            m11588a(this.f8186s, typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9346a(TextView textView, int i) {
        if (this.f8170c == null && this.f8172e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f8168a);
            this.f8170c = linearLayout;
            linearLayout.setOrientation(0);
            this.f8169b.addView(this.f8170c, -1, -2);
            this.f8172e = new FrameLayout(this.f8168a);
            this.f8170c.addView(this.f8172e, new LayoutParams(0, -2, 1.0f));
            if (this.f8169b.getEditText() != null) {
                mo9343a();
            }
        }
        if (mo9349a(i)) {
            this.f8172e.setVisibility(0);
            this.f8172e.addView(textView);
            this.f8173f++;
        } else {
            this.f8170c.addView(textView, new LayoutParams(-2, -2));
        }
        this.f8170c.setVisibility(0);
        this.f8171d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9347a(CharSequence charSequence) {
        this.f8181n = charSequence;
        TextView textView = this.f8180m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9348a(boolean z) {
        if (this.f8179l != z) {
            mo9350b();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f8168a);
                this.f8180m = appCompatTextView;
                appCompatTextView.setId(C4410f.textinput_error);
                if (VERSION.SDK_INT >= 17) {
                    this.f8180m.setTextAlignment(5);
                }
                Typeface typeface = this.f8189v;
                if (typeface != null) {
                    this.f8180m.setTypeface(typeface);
                }
                mo9351b(this.f8182o);
                mo9344a(this.f8183p);
                mo9347a(this.f8181n);
                this.f8180m.setVisibility(4);
                C3379v.m13818g(this.f8180m, 1);
                mo9346a(this.f8180m, 0);
            } else {
                mo9365j();
                mo9353b(this.f8180m, 0);
                this.f8180m = null;
                this.f8169b.mo9183f();
                this.f8169b.mo9184g();
            }
            this.f8179l = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9349a(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9350b() {
        Animator animator = this.f8174g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9351b(int i) {
        this.f8182o = i;
        TextView textView = this.f8180m;
        if (textView != null) {
            this.f8169b.mo9169a(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9352b(ColorStateList colorStateList) {
        this.f8188u = colorStateList;
        TextView textView = this.f8186s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9353b(TextView textView, int i) {
        if (this.f8170c != null) {
            if (mo9349a(i)) {
                FrameLayout frameLayout = this.f8172e;
                if (frameLayout != null) {
                    int i2 = this.f8173f - 1;
                    this.f8173f = i2;
                    m11587a((ViewGroup) frameLayout, i2);
                    this.f8172e.removeView(textView);
                    int i3 = this.f8171d - 1;
                    this.f8171d = i3;
                    m11587a((ViewGroup) this.f8170c, i3);
                }
            }
            this.f8170c.removeView(textView);
            int i32 = this.f8171d - 1;
            this.f8171d = i32;
            m11587a((ViewGroup) this.f8170c, i32);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9354b(CharSequence charSequence) {
        mo9350b();
        this.f8178k = charSequence;
        this.f8180m.setText(charSequence);
        if (this.f8176i != 1) {
            this.f8177j = 1;
        }
        m11586a(this.f8176i, this.f8177j, m11590a(this.f8180m, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9355b(boolean z) {
        if (this.f8185r != z) {
            mo9350b();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f8168a);
                this.f8186s = appCompatTextView;
                appCompatTextView.setId(C4410f.textinput_helper_text);
                if (VERSION.SDK_INT >= 17) {
                    this.f8186s.setTextAlignment(5);
                }
                Typeface typeface = this.f8189v;
                if (typeface != null) {
                    this.f8186s.setTypeface(typeface);
                }
                this.f8186s.setVisibility(4);
                C3379v.m13818g(this.f8186s, 1);
                mo9356c(this.f8187t);
                mo9352b(this.f8188u);
                mo9346a(this.f8186s, 1);
            } else {
                mo9366k();
                mo9353b(this.f8186s, 1);
                this.f8186s = null;
                this.f8169b.mo9183f();
                this.f8169b.mo9184g();
            }
            this.f8185r = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9356c(int i) {
        this.f8187t = i;
        TextView textView = this.f8186s;
        if (textView != null) {
            C0391i.m2039d(textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo9357c(CharSequence charSequence) {
        mo9350b();
        this.f8184q = charSequence;
        this.f8186s.setText(charSequence);
        if (this.f8176i != 2) {
            this.f8177j = 2;
        }
        m11586a(this.f8176i, this.f8177j, m11590a(this.f8186s, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo9358c() {
        return m11592e(this.f8177j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public CharSequence mo9359d() {
        return this.f8181n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public CharSequence mo9360e() {
        return this.f8178k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo9361f() {
        TextView textView = this.f8180m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public ColorStateList mo9362g() {
        TextView textView = this.f8180m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public CharSequence mo9363h() {
        return this.f8184q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo9364i() {
        TextView textView = this.f8186s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo9365j() {
        this.f8178k = null;
        mo9350b();
        if (this.f8176i == 1) {
            this.f8177j = (!this.f8185r || TextUtils.isEmpty(this.f8184q)) ? 0 : 2;
        }
        m11586a(this.f8176i, this.f8177j, m11590a(this.f8180m, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo9366k() {
        mo9350b();
        if (this.f8176i == 2) {
            this.f8177j = 0;
        }
        m11586a(this.f8176i, this.f8177j, m11590a(this.f8186s, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo9367l() {
        return this.f8179l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo9368m() {
        return this.f8185r;
    }
}
