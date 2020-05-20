package p071f.p139v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p071f.p097h.p108m.C3379v;
import p071f.p139v.C3607m.C3613f;

/* renamed from: f.v.d */
public class C3580d extends C3599j0 {

    /* renamed from: f.v.d$a */
    class C3581a extends C3615n {

        /* renamed from: a */
        final /* synthetic */ View f10067a;

        C3581a(C3580d dVar, View view) {
            this.f10067a = view;
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            C3577c0.m14567a(this.f10067a, 1.0f);
            C3577c0.m14566a(this.f10067a);
            mVar.mo11366b((C3613f) this);
        }
    }

    /* renamed from: f.v.d$b */
    private static class C3582b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f10068a;

        /* renamed from: b */
        private boolean f10069b = false;

        C3582b(View view) {
            this.f10068a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C3577c0.m14567a(this.f10068a, 1.0f);
            if (this.f10069b) {
                this.f10068a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C3379v.m13839z(this.f10068a) && this.f10068a.getLayerType() == 0) {
                this.f10069b = true;
                this.f10068a.setLayerType(2, null);
            }
        }
    }

    public C3580d(int i) {
        mo11337a(i);
    }

    /* renamed from: a */
    private static float m14580a(C3624s sVar, float f) {
        if (sVar == null) {
            return f;
        }
        Float f2 = (Float) sVar.f10177a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    /* renamed from: a */
    private Animator m14581a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C3577c0.m14567a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C3577c0.f10066b, new float[]{f2});
        ofFloat.addListener(new C3582b(view));
        mo11354a((C3613f) new C3581a(this, view));
        return ofFloat;
    }

    /* renamed from: a */
    public Animator mo11319a(ViewGroup viewGroup, View view, C3624s sVar, C3624s sVar2) {
        float f = 0.0f;
        float a = m14580a(sVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m14581a(view, f, 1.0f);
    }

    /* renamed from: b */
    public Animator mo11320b(ViewGroup viewGroup, View view, C3624s sVar, C3624s sVar2) {
        C3577c0.m14575e(view);
        return m14581a(view, m14580a(sVar, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo9001c(C3624s sVar) {
        super.mo9001c(sVar);
        sVar.f10177a.put("android:fade:transitionAlpha", Float.valueOf(C3577c0.m14573c(sVar.f10178b)));
    }
}
