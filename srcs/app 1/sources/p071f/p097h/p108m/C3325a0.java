package p071f.p097h.p108m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: f.h.m.a0 */
public final class C3325a0 {

    /* renamed from: a */
    private WeakReference<View> f9504a;

    /* renamed from: b */
    Runnable f9505b = null;

    /* renamed from: c */
    Runnable f9506c = null;

    /* renamed from: d */
    int f9507d = -1;

    /* renamed from: f.h.m.a0$a */
    class C3326a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3332b0 f9508a;

        /* renamed from: b */
        final /* synthetic */ View f9509b;

        C3326a(C3325a0 a0Var, C3332b0 b0Var, View view) {
            this.f9508a = b0Var;
            this.f9509b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f9508a.mo1260a(this.f9509b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f9508a.mo330b(this.f9509b);
        }

        public void onAnimationStart(Animator animator) {
            this.f9508a.mo331c(this.f9509b);
        }
    }

    /* renamed from: f.h.m.a0$b */
    class C3327b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C3340d0 f9510a;

        /* renamed from: b */
        final /* synthetic */ View f9511b;

        C3327b(C3325a0 a0Var, C3340d0 d0Var, View view) {
            this.f9510a = d0Var;
            this.f9511b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f9510a.mo400a(this.f9511b);
        }
    }

    /* renamed from: f.h.m.a0$c */
    static class C3328c implements C3332b0 {

        /* renamed from: a */
        C3325a0 f9512a;

        /* renamed from: b */
        boolean f9513b;

        C3328c(C3325a0 a0Var) {
            this.f9512a = a0Var;
        }

        /* renamed from: a */
        public void mo1260a(View view) {
            Object tag = view.getTag(2113929216);
            C3332b0 b0Var = tag instanceof C3332b0 ? (C3332b0) tag : null;
            if (b0Var != null) {
                b0Var.mo1260a(view);
            }
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: b */
        public void mo330b(View view) {
            int i = this.f9512a.f9507d;
            C3332b0 b0Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f9512a.f9507d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f9513b) {
                C3325a0 a0Var = this.f9512a;
                Runnable runnable = a0Var.f9506c;
                if (runnable != null) {
                    a0Var.f9506c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C3332b0) {
                    b0Var = (C3332b0) tag;
                }
                if (b0Var != null) {
                    b0Var.mo330b(view);
                }
                this.f9513b = true;
            }
        }

        /* renamed from: c */
        public void mo331c(View view) {
            this.f9513b = false;
            C3332b0 b0Var = null;
            if (this.f9512a.f9507d > -1) {
                view.setLayerType(2, null);
            }
            C3325a0 a0Var = this.f9512a;
            Runnable runnable = a0Var.f9505b;
            if (runnable != null) {
                a0Var.f9505b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C3332b0) {
                b0Var = (C3332b0) tag;
            }
            if (b0Var != null) {
                b0Var.mo331c(view);
            }
        }
    }

    C3325a0(View view) {
        this.f9504a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m13567a(View view, C3332b0 b0Var) {
        if (b0Var != null) {
            view.animate().setListener(new C3326a(this, b0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C3325a0 mo10708a(float f) {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C3325a0 mo10709a(long j) {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C3325a0 mo10710a(Interpolator interpolator) {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public C3325a0 mo10711a(C3332b0 b0Var) {
        View view = (View) this.f9504a.get();
        if (view != null) {
            if (VERSION.SDK_INT < 16) {
                view.setTag(2113929216, b0Var);
                b0Var = new C3328c(this);
            }
            m13567a(view, b0Var);
        }
        return this;
    }

    /* renamed from: a */
    public C3325a0 mo10712a(C3340d0 d0Var) {
        View view = (View) this.f9504a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C3327b bVar = null;
            if (d0Var != null) {
                bVar = new C3327b(this, d0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public void mo10713a() {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long mo10714b() {
        View view = (View) this.f9504a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: b */
    public C3325a0 mo10715b(float f) {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C3325a0 mo10716b(long j) {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void mo10717c() {
        View view = (View) this.f9504a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
