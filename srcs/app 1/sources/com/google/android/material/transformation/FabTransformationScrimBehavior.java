package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p147g.p156d.p157a.p185c.p189m.C4418b;
import p147g.p156d.p157a.p185c.p189m.C4425i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C4425i f8229c = new C4425i(75, 150);

    /* renamed from: d */
    private final C4425i f8230d = new C4425i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C2802a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f8231a;

        /* renamed from: b */
        final /* synthetic */ View f8232b;

        C2802a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f8231a = z;
            this.f8232b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f8231a) {
                this.f8232b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f8231a) {
                this.f8232b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m11679a(View view, boolean z, boolean z2, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C4425i iVar = z ? this.f8229c : this.f8230d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo13180a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: a */
    public boolean mo2111a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo9383b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m11679a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C4418b.m18007a(animatorSet, arrayList);
        animatorSet.addListener(new C2802a(this, z, view2));
        return animatorSet;
    }

    /* renamed from: b */
    public boolean mo2115b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2115b(coordinatorLayout, view, motionEvent);
    }
}
