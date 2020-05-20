package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import java.util.ArrayList;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p107l.C3321h;
import p147g.p156d.p157a.p185c.C4405c;
import p147g.p156d.p157a.p185c.p186a0.C4374b;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p203z.C4468b;

/* renamed from: com.google.android.material.floatingactionbutton.e */
class C2692e extends C2679d {

    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    static class C2693a extends C4382g {
        C2693a(C4389k kVar) {
            super(kVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    C2692e(FloatingActionButton floatingActionButton, C4374b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: a */
    private Animator m11163a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7776y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f7776y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C2679d.f7740F);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2676c mo8906a(int i, ColorStateList colorStateList) {
        Context context = this.f7776y.getContext();
        C4389k kVar = this.f7752a;
        C3321h.m13543a(kVar);
        C2676c cVar = new C2676c(kVar);
        cVar.mo8829a(C3236a.m13263a(context, C4405c.design_fab_stroke_top_outer_color), C3236a.m13263a(context, C4405c.design_fab_stroke_top_inner_color), C3236a.m13263a(context, C4405c.design_fab_stroke_end_inner_color), C3236a.m13263a(context, C4405c.design_fab_stroke_end_outer_color));
        cVar.mo8828a((float) i);
        cVar.mo8830a(colorStateList);
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4382g mo8844a() {
        C4389k kVar = this.f7752a;
        C3321h.m13543a(kVar);
        return new C2693a(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8846a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.f7776y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C2679d.f7741G, m11163a(f, f3));
            stateListAnimator.addState(C2679d.f7742H, m11163a(f, f2));
            stateListAnimator.addState(C2679d.f7743I, m11163a(f, f2));
            stateListAnimator.addState(C2679d.f7744J, m11163a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f7776y, "elevation", new float[]{f}).setDuration(0));
            int i = VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f7776y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f7776y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C2679d.f7740F);
            stateListAnimator.addState(C2679d.f7745K, animatorSet);
            stateListAnimator.addState(C2679d.f7746L, m11163a(0.0f, 0.0f));
            this.f7776y.setStateListAnimator(stateListAnimator);
        }
        if (mo8888t()) {
            mo8892x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8850a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C4382g a = mo8844a();
        this.f7753b = a;
        a.setTintList(colorStateList);
        if (mode != null) {
            this.f7753b.setTintMode(mode);
        }
        this.f7753b.mo13058a(this.f7776y.getContext());
        if (i > 0) {
            this.f7755d = mo8906a(i, colorStateList);
            C2676c cVar = this.f7755d;
            C3321h.m13543a(cVar);
            C4382g gVar = this.f7753b;
            C3321h.m13543a(gVar);
            drawable = new LayerDrawable(new Drawable[]{cVar, gVar});
        } else {
            this.f7755d = null;
            drawable = this.f7753b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C4468b.m18201b(colorStateList2), drawable, null);
        this.f7754c = rippleDrawable;
        this.f7756e = rippleDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8852a(Rect rect) {
        if (this.f7777z.mo8814a()) {
            super.mo8852a(rect);
            return;
        }
        int sizeDimension = !mo8889u() ? (this.f7762k - this.f7776y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8858a(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (VERSION.SDK_INT == 21) {
            float f = 0.0f;
            if (this.f7776y.isEnabled()) {
                this.f7776y.setElevation(this.f7759h);
                if (this.f7776y.isPressed()) {
                    floatingActionButton = this.f7776y;
                    f = this.f7761j;
                } else if (this.f7776y.isFocused() || this.f7776y.isHovered()) {
                    floatingActionButton = this.f7776y;
                    f = this.f7760i;
                }
                floatingActionButton.setTranslationZ(f);
            }
            this.f7776y.setElevation(0.0f);
            floatingActionButton = this.f7776y;
            floatingActionButton.setTranslationZ(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8863b(ColorStateList colorStateList) {
        Drawable drawable = this.f7754c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C4468b.m18201b(colorStateList));
        } else {
            super.mo8863b(colorStateList);
        }
    }

    /* renamed from: c */
    public float mo8868c() {
        return this.f7776y.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo8880l() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo8882n() {
        mo8892x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo8887s() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo8888t() {
        return this.f7777z.mo8814a() || !mo8889u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo8890v() {
    }
}
