package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f8212b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C2796a extends AnimatorListenerAdapter {
        C2796a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f8212b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9380a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f8212b != null;
        if (z3) {
            this.f8212b.cancel();
        }
        AnimatorSet b = mo9383b(view, view2, z, z3);
        this.f8212b = b;
        b.addListener(new C2796a());
        this.f8212b.start();
        if (!z2) {
            this.f8212b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo9383b(View view, View view2, boolean z, boolean z2);
}
