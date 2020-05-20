package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.C0371a;
import com.google.android.material.internal.C2715j;
import com.google.android.material.theme.p054a.C2794a;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4459c;

/* renamed from: com.google.android.material.snackbar.d */
public class C2724d extends FrameLayout {

    /* renamed from: m */
    private static final OnTouchListener f7905m = new C2725a();

    /* renamed from: f */
    private C2723c f7906f;

    /* renamed from: g */
    private C2722b f7907g;

    /* renamed from: h */
    private int f7908h;

    /* renamed from: i */
    private final float f7909i;

    /* renamed from: j */
    private final float f7910j;

    /* renamed from: k */
    private ColorStateList f7911k;

    /* renamed from: l */
    private Mode f7912l;

    /* renamed from: com.google.android.material.snackbar.d$a */
    static class C2725a implements OnTouchListener {
        C2725a() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected C2724d(Context context) {
        this(context, null);
    }

    protected C2724d(Context context, AttributeSet attributeSet) {
        super(C2794a.m11644b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C4416l.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C4416l.SnackbarLayout_elevation)) {
            C3379v.m13780a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C4416l.SnackbarLayout_elevation, 0));
        }
        this.f7908h = obtainStyledAttributes.getInt(C4416l.SnackbarLayout_animationMode, 0);
        this.f7909i = obtainStyledAttributes.getFloat(C4416l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(C4459c.m18175a(context2, obtainStyledAttributes, C4416l.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(C2715j.m11287a(obtainStyledAttributes.getInt(C4416l.SnackbarLayout_backgroundTintMode, -1), Mode.SRC_IN));
        this.f7910j = obtainStyledAttributes.getFloat(C4416l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f7905m);
        setFocusable(true);
        if (getBackground() == null) {
            C3379v.m13787a((View) this, m11302a());
        }
    }

    /* renamed from: a */
    private Drawable m11302a() {
        float dimension = getResources().getDimension(C4408d.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(C4445a.m18122a(this, C4375b.colorSurface, C4375b.colorOnSurface, getBackgroundOverlayColorAlpha()));
        if (this.f7911k == null) {
            return C0371a.m1913i(gradientDrawable);
        }
        Drawable i = C0371a.m1913i(gradientDrawable);
        C0371a.m1898a(i, this.f7911k);
        return i;
    }

    /* access modifiers changed from: 0000 */
    public float getActionTextColorAlpha() {
        return this.f7910j;
    }

    /* access modifiers changed from: 0000 */
    public int getAnimationMode() {
        return this.f7908h;
    }

    /* access modifiers changed from: 0000 */
    public float getBackgroundOverlayColorAlpha() {
        return this.f7909i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2722b bVar = this.f7907g;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C3379v.m13773I(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2722b bVar = this.f7907g;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2723c cVar = this.f7906f;
        if (cVar != null) {
            cVar.mo9022a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationMode(int i) {
        this.f7908h = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f7911k == null)) {
            drawable = C0371a.m1913i(drawable.mutate());
            C0371a.m1898a(drawable, this.f7911k);
            C0371a.m1901a(drawable, this.f7912l);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f7911k = colorStateList;
        if (getBackground() != null) {
            Drawable i = C0371a.m1913i(getBackground().mutate());
            C0371a.m1898a(i, colorStateList);
            C0371a.m1901a(i, this.f7912l);
            if (i != getBackground()) {
                super.setBackgroundDrawable(i);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        this.f7912l = mode;
        if (getBackground() != null) {
            Drawable i = C0371a.m1913i(getBackground().mutate());
            C0371a.m1901a(i, mode);
            if (i != getBackground()) {
                super.setBackgroundDrawable(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnAttachStateChangeListener(C2722b bVar) {
        this.f7907g = bVar;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f7905m);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: 0000 */
    public void setOnLayoutChangeListener(C2723c cVar) {
        this.f7906f = cVar;
    }
}
