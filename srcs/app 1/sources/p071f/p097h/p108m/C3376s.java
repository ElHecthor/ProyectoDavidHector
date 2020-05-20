package p071f.p097h.p108m;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: f.h.m.s */
public final class C3376s implements OnPreDrawListener, OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f9579f;

    /* renamed from: g */
    private ViewTreeObserver f9580g;

    /* renamed from: h */
    private final Runnable f9581h;

    private C3376s(View view, Runnable runnable) {
        this.f9579f = view;
        this.f9580g = view.getViewTreeObserver();
        this.f9581h = runnable;
    }

    /* renamed from: a */
    public static C3376s m13761a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C3376s sVar = new C3376s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return sVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: a */
    public void mo10836a() {
        (this.f9580g.isAlive() ? this.f9580g : this.f9579f.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f9579f.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo10836a();
        this.f9581h.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f9580g = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo10836a();
    }
}
