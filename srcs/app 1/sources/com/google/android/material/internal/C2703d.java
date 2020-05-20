package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0212e0;
import p147g.p156d.p157a.p185c.C4416l;

/* renamed from: com.google.android.material.internal.d */
public class C2703d extends C0212e0 {

    /* renamed from: u */
    private Drawable f7869u;

    /* renamed from: v */
    private final Rect f7870v;

    /* renamed from: w */
    private final Rect f7871w;

    /* renamed from: x */
    private int f7872x;

    /* renamed from: y */
    protected boolean f7873y;

    /* renamed from: z */
    boolean f7874z;

    public C2703d(Context context) {
        this(context, null);
    }

    public C2703d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2703d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7870v = new Rect();
        this.f7871w = new Rect();
        this.f7872x = 119;
        this.f7873y = true;
        this.f7874z = false;
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f7872x = c.getInt(C4416l.ForegroundLinearLayout_android_foregroundGravity, this.f7872x);
        Drawable drawable = c.getDrawable(C4416l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7873y = c.getBoolean(C4416l.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7869u;
        if (drawable != null) {
            if (this.f7874z) {
                this.f7874z = false;
                Rect rect = this.f7870v;
                Rect rect2 = this.f7871w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7873y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7872x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f7869u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7869u;
        if (drawable != null && drawable.isStateful()) {
            this.f7869u.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f7869u;
    }

    public int getForegroundGravity() {
        return this.f7872x;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7869u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7874z = z | this.f7874z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7874z = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7869u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f7869u);
            }
            this.f7869u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7872x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f7872x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f7872x = i;
            if (i == 119 && this.f7869u != null) {
                this.f7869u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7869u;
    }
}
