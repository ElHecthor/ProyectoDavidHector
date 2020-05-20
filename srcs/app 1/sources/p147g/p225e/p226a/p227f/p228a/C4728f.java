package p147g.p225e.p226a.p227f.p228a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.f.a.f */
public final class C4728f {

    /* renamed from: g.e.a.f.a.f$a */
    public static final class C4729a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5918l f12373a;

        /* renamed from: b */
        final /* synthetic */ C5918l f12374b;

        C4729a(C5918l lVar, C5918l lVar2) {
            this.f12373a = lVar;
            this.f12374b = lVar2;
        }

        public void onAnimationEnd(Animator animator) {
            C5918l lVar = this.f12373a;
            if (lVar != null) {
                C5812t tVar = (C5812t) lVar.mo4090d(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            C5918l lVar = this.f12374b;
            if (lVar != null) {
                C5812t tVar = (C5812t) lVar.mo4090d(animator);
            }
        }
    }

    /* renamed from: a */
    public static final ViewPropertyAnimator m19057a(ViewPropertyAnimator viewPropertyAnimator, C5918l<? super Animator, C5812t> lVar, C5918l<? super Animator, C5812t> lVar2) {
        C5942k.m22327b(viewPropertyAnimator, "$receiver");
        return viewPropertyAnimator.setListener(new C4729a(lVar, lVar2));
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ ViewPropertyAnimator m19058a(ViewPropertyAnimator viewPropertyAnimator, C5918l lVar, C5918l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        if ((i & 2) != 0) {
            lVar2 = null;
        }
        return m19057a(viewPropertyAnimator, lVar, lVar2);
    }
}
