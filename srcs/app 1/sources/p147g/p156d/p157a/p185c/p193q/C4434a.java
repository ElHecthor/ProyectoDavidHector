package p147g.p156d.p157a.p185c.p193q;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4440b;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4441c;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4443e;

/* renamed from: g.d.a.c.q.a */
public final class C4434a {

    /* renamed from: g.d.a.c.q.a$a */
    static class C4435a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4438d f11768a;

        C4435a(C4438d dVar) {
            this.f11768a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11768a.mo13219a();
        }

        public void onAnimationStart(Animator animator) {
            this.f11768a.mo13220b();
        }
    }

    /* renamed from: a */
    public static AnimatorListener m18092a(C4438d dVar) {
        return new C4435a(dVar);
    }

    /* renamed from: a */
    public static Animator m18093a(C4438d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C4441c.f11773a, C4440b.f11771b, new C4443e[]{new C4443e(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C4443e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f11777c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
