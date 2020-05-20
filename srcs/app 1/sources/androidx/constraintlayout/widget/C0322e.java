package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout.C0306b;

/* renamed from: androidx.constraintlayout.widget.e */
public class C0322e extends ViewGroup {

    /* renamed from: f */
    C0316d f1545f;

    /* renamed from: androidx.constraintlayout.widget.e$a */
    public static class C0323a extends C0306b {

        /* renamed from: A0 */
        public float f1546A0;

        /* renamed from: o0 */
        public float f1547o0;

        /* renamed from: p0 */
        public boolean f1548p0;

        /* renamed from: q0 */
        public float f1549q0;

        /* renamed from: r0 */
        public float f1550r0;

        /* renamed from: s0 */
        public float f1551s0;

        /* renamed from: t0 */
        public float f1552t0;

        /* renamed from: u0 */
        public float f1553u0;

        /* renamed from: v0 */
        public float f1554v0;

        /* renamed from: w0 */
        public float f1555w0;

        /* renamed from: x0 */
        public float f1556x0;

        /* renamed from: y0 */
        public float f1557y0;

        /* renamed from: z0 */
        public float f1558z0;

        public C0323a(int i, int i2) {
            super(i, i2);
            this.f1547o0 = 1.0f;
            this.f1548p0 = false;
            this.f1549q0 = 0.0f;
            this.f1550r0 = 0.0f;
            this.f1551s0 = 0.0f;
            this.f1552t0 = 0.0f;
            this.f1553u0 = 1.0f;
            this.f1554v0 = 1.0f;
            this.f1555w0 = 0.0f;
            this.f1556x0 = 0.0f;
            this.f1557y0 = 0.0f;
            this.f1558z0 = 0.0f;
            this.f1546A0 = 0.0f;
        }

        public C0323a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1547o0 = 1.0f;
            this.f1548p0 = false;
            this.f1549q0 = 0.0f;
            this.f1550r0 = 0.0f;
            this.f1551s0 = 0.0f;
            this.f1552t0 = 0.0f;
            this.f1553u0 = 1.0f;
            this.f1554v0 = 1.0f;
            this.f1555w0 = 0.0f;
            this.f1556x0 = 0.0f;
            this.f1557y0 = 0.0f;
            this.f1558z0 = 0.0f;
            this.f1546A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0328j.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0328j.ConstraintSet_android_alpha) {
                    this.f1547o0 = obtainStyledAttributes.getFloat(index, this.f1547o0);
                } else if (index == C0328j.ConstraintSet_android_elevation) {
                    if (VERSION.SDK_INT >= 21) {
                        this.f1549q0 = obtainStyledAttributes.getFloat(index, this.f1549q0);
                        this.f1548p0 = true;
                    }
                } else if (index == C0328j.ConstraintSet_android_rotationX) {
                    this.f1551s0 = obtainStyledAttributes.getFloat(index, this.f1551s0);
                } else if (index == C0328j.ConstraintSet_android_rotationY) {
                    this.f1552t0 = obtainStyledAttributes.getFloat(index, this.f1552t0);
                } else if (index == C0328j.ConstraintSet_android_rotation) {
                    this.f1550r0 = obtainStyledAttributes.getFloat(index, this.f1550r0);
                } else if (index == C0328j.ConstraintSet_android_scaleX) {
                    this.f1553u0 = obtainStyledAttributes.getFloat(index, this.f1553u0);
                } else if (index == C0328j.ConstraintSet_android_scaleY) {
                    this.f1554v0 = obtainStyledAttributes.getFloat(index, this.f1554v0);
                } else if (index == C0328j.ConstraintSet_android_transformPivotX) {
                    this.f1555w0 = obtainStyledAttributes.getFloat(index, this.f1555w0);
                } else if (index == C0328j.ConstraintSet_android_transformPivotY) {
                    this.f1556x0 = obtainStyledAttributes.getFloat(index, this.f1556x0);
                } else if (index == C0328j.ConstraintSet_android_translationX) {
                    this.f1557y0 = obtainStyledAttributes.getFloat(index, this.f1557y0);
                } else if (index == C0328j.ConstraintSet_android_translationY) {
                    this.f1558z0 = obtainStyledAttributes.getFloat(index, this.f1558z0);
                } else if (index == C0328j.ConstraintSet_android_translationZ && VERSION.SDK_INT >= 21) {
                    this.f1546A0 = obtainStyledAttributes.getFloat(index, this.f1546A0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0323a generateDefaultLayoutParams() {
        return new C0323a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0306b(layoutParams);
    }

    public C0323a generateLayoutParams(AttributeSet attributeSet) {
        return new C0323a(getContext(), attributeSet);
    }

    public C0316d getConstraintSet() {
        if (this.f1545f == null) {
            this.f1545f = new C0316d();
        }
        this.f1545f.mo2014a(this);
        return this.f1545f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
