package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p071f.p097h.p108m.C3364g;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4416l;

/* renamed from: com.google.android.material.internal.c */
public class C2702c extends ViewGroup {

    /* renamed from: f */
    private int f7866f;

    /* renamed from: g */
    private int f7867g;

    /* renamed from: h */
    private boolean f7868h;

    public C2702c(Context context) {
        this(context, null);
    }

    public C2702c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2702c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7868h = false;
        m11252a(context, attributeSet);
    }

    @TargetApi(21)
    public C2702c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7868h = false;
        m11252a(context, attributeSet);
    }

    /* renamed from: a */
    private static int m11251a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: a */
    private void m11252a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4416l.FlowLayout, 0, 0);
        this.f7866f = obtainStyledAttributes.getDimensionPixelSize(C4416l.FlowLayout_lineSpacing, 0);
        this.f7867g = obtainStyledAttributes.getDimensionPixelSize(C4416l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public boolean mo8439a() {
        return this.f7868h;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f7867g;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f7866f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (C3379v.m13829p(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i5 = C3364g.m13720b(marginLayoutParams);
                        i6 = C3364g.m13718a(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f7868h && measuredWidth > i7) {
                        i9 = this.f7866f + paddingTop;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        i11 = i7 - measuredWidth2;
                        measuredWidth2 = (i7 - i8) - i5;
                    }
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f7867g;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo8439a()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f7866f + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f7867g;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m11251a(size, mode, i8 + getPaddingRight()), m11251a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f7867g = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f7866f = i;
    }

    public void setSingleLine(boolean z) {
        this.f7868h = z;
    }
}
