package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p071f.p097h.p104i.C3277a;
import p071f.p097h.p104i.C3277a.C3278a;
import p071f.p097h.p108m.C3376s;
import p071f.p120m.C3447a;
import p071f.p120m.C3448b;

/* renamed from: androidx.fragment.app.e */
class C0431e {

    /* renamed from: androidx.fragment.app.e$a */
    static class C0432a implements C3278a {

        /* renamed from: a */
        final /* synthetic */ Fragment f1974a;

        C0432a(Fragment fragment) {
            this.f1974a = fragment;
        }

        /* renamed from: a */
        public void mo2694a() {
            if (this.f1974a.mo2556j() != null) {
                View j = this.f1974a.mo2556j();
                this.f1974a.mo2505a((View) null);
                j.clearAnimation();
            }
            this.f1974a.mo2494a((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    static class C0433b implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1975a;

        /* renamed from: b */
        final /* synthetic */ Fragment f1976b;

        /* renamed from: c */
        final /* synthetic */ C0475g f1977c;

        /* renamed from: d */
        final /* synthetic */ C3277a f1978d;

        /* renamed from: androidx.fragment.app.e$b$a */
        class C0434a implements Runnable {
            C0434a() {
            }

            public void run() {
                if (C0433b.this.f1976b.mo2556j() != null) {
                    C0433b.this.f1976b.mo2505a((View) null);
                    C0433b bVar = C0433b.this;
                    bVar.f1977c.mo2827a(bVar.f1976b, bVar.f1978d);
                }
            }
        }

        C0433b(ViewGroup viewGroup, Fragment fragment, C0475g gVar, C3277a aVar) {
            this.f1975a = viewGroup;
            this.f1976b = fragment;
            this.f1977c = gVar;
            this.f1978d = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f1975a.post(new C0434a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.e$c */
    static class C0435c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f1980a;

        /* renamed from: b */
        final /* synthetic */ View f1981b;

        /* renamed from: c */
        final /* synthetic */ Fragment f1982c;

        /* renamed from: d */
        final /* synthetic */ C0475g f1983d;

        /* renamed from: e */
        final /* synthetic */ C3277a f1984e;

        C0435c(ViewGroup viewGroup, View view, Fragment fragment, C0475g gVar, C3277a aVar) {
            this.f1980a = viewGroup;
            this.f1981b = view;
            this.f1982c = fragment;
            this.f1983d = gVar;
            this.f1984e = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1980a.endViewTransition(this.f1981b);
            Animator k = this.f1982c.mo2559k();
            this.f1982c.mo2494a((Animator) null);
            if (k != null && this.f1980a.indexOfChild(this.f1981b) < 0) {
                this.f1983d.mo2827a(this.f1982c, this.f1984e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$d */
    static class C0436d {

        /* renamed from: a */
        public final Animation f1985a;

        /* renamed from: b */
        public final Animator f1986b;

        C0436d(Animator animator) {
            this.f1985a = null;
            this.f1986b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C0436d(Animation animation) {
            this.f1985a = animation;
            this.f1986b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e */
    private static class C0437e extends AnimationSet implements Runnable {

        /* renamed from: f */
        private final ViewGroup f1987f;

        /* renamed from: g */
        private final View f1988g;

        /* renamed from: h */
        private boolean f1989h;

        /* renamed from: i */
        private boolean f1990i;

        /* renamed from: j */
        private boolean f1991j = true;

        C0437e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1987f = viewGroup;
            this.f1988g = view;
            addAnimation(animation);
            this.f1987f.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f1991j = true;
            if (this.f1989h) {
                return !this.f1990i;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1989h = true;
                C3376s.m13761a(this.f1987f, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f1991j = true;
            if (this.f1989h) {
                return !this.f1990i;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1989h = true;
                C3376s.m13761a(this.f1987f, this);
            }
            return true;
        }

        public void run() {
            if (this.f1989h || !this.f1991j) {
                this.f1987f.endViewTransition(this.f1988g);
                this.f1990i = true;
                return;
            }
            this.f1991j = false;
            this.f1987f.post(this);
        }
    }

    /* renamed from: a */
    private static int m2304a(int i, boolean z) {
        if (i == 4097) {
            return z ? C3447a.fragment_open_enter : C3447a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C3447a.fragment_fade_enter : C3447a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C3447a.fragment_close_enter : C3447a.fragment_close_exit;
    }

    /* renamed from: a */
    static C0436d m2305a(Context context, C0438f fVar, Fragment fragment, boolean z) {
        int w = fragment.mo2587w();
        int v = fragment.mo2586v();
        boolean z2 = false;
        fragment.mo2515b(0);
        View a = fVar.mo2593a(fragment.f1858B);
        if (!(a == null || a.getTag(C3448b.visible_removing_fragment_view_tag) == null)) {
            a.setTag(C3448b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup = fragment.f1867K;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation a2 = fragment.mo2489a(w, z, v);
        if (a2 != null) {
            return new C0436d(a2);
        }
        Animator b = fragment.mo2514b(w, z, v);
        if (b != null) {
            return new C0436d(b);
        }
        if (v != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(v));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, v);
                    if (loadAnimation != null) {
                        return new C0436d(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, v);
                    if (loadAnimator != null) {
                        return new C0436d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, v);
                        if (loadAnimation2 != null) {
                            return new C0436d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (w == 0) {
            return null;
        }
        int a3 = m2304a(w, z);
        if (a3 < 0) {
            return null;
        }
        return new C0436d(AnimationUtils.loadAnimation(context, a3));
    }

    /* renamed from: a */
    static void m2306a(Fragment fragment, C0436d dVar, C0475g gVar) {
        View view = fragment.f1868L;
        ViewGroup viewGroup = fragment.f1867K;
        viewGroup.startViewTransition(view);
        C3277a aVar = new C3277a();
        aVar.mo10626a(new C0432a(fragment));
        gVar.mo2828b(fragment, aVar);
        if (dVar.f1985a != null) {
            C0437e eVar = new C0437e(dVar.f1985a, viewGroup, view);
            fragment.mo2505a(fragment.f1868L);
            eVar.setAnimationListener(new C0433b(viewGroup, fragment, gVar, aVar));
            fragment.f1868L.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f1986b;
        fragment.mo2494a(animator);
        C0435c cVar = new C0435c(viewGroup, view, fragment, gVar, aVar);
        animator.addListener(cVar);
        animator.setTarget(fragment.f1868L);
        animator.start();
    }
}
