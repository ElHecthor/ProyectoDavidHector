package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import p147g.p156d.p157a.p185c.p189m.C4417a;

public class HideBottomViewOnScrollBehavior<V extends View> extends C0332c<V> {

    /* renamed from: a */
    private int f7196a = 0;

    /* renamed from: b */
    private int f7197b = 2;

    /* renamed from: c */
    private int f7198c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f7199d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C2549a extends AnimatorListenerAdapter {
        C2549a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f7199d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m10313a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f7199d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C2549a());
    }

    /* renamed from: a */
    public void mo7946a(V v) {
        if (this.f7197b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f7199d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f7197b = 1;
            m10313a(v, this.f7196a + this.f7198c, 175, C4417a.f11714c);
        }
    }

    /* renamed from: a */
    public void mo7947a(V v, int i) {
        this.f7198c = i;
        if (this.f7197b == 1) {
            v.setTranslationY((float) (this.f7196a + i));
        }
    }

    /* renamed from: a */
    public void mo2100a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo7946a(v);
        } else if (i2 < 0) {
            mo7948b(v);
        }
    }

    /* renamed from: a */
    public boolean mo2106a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f7196a = v.getMeasuredHeight() + ((MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2106a(coordinatorLayout, v, i);
    }

    /* renamed from: b */
    public void mo7948b(V v) {
        if (this.f7197b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f7199d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f7197b = 2;
            m10313a(v, 0, 225, C4417a.f11715d);
        }
    }

    /* renamed from: b */
    public boolean mo2118b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }
}
