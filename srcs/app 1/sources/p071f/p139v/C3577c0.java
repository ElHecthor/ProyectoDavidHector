package p071f.p139v;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import p071f.p097h.p108m.C3379v;

/* renamed from: f.v.c0 */
class C3577c0 {

    /* renamed from: a */
    private static final C3597i0 f10065a;

    /* renamed from: b */
    static final Property<View, Float> f10066b = new C3578a(Float.class, "translationAlpha");

    /* renamed from: f.v.c0$a */
    static class C3578a extends Property<View, Float> {
        C3578a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C3577c0.m14573c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C3577c0.m14567a(view, f.floatValue());
        }
    }

    /* renamed from: f.v.c0$b */
    static class C3579b extends Property<View, Rect> {
        C3579b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C3379v.m13823j(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C3379v.m13786a(view, rect);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        C3597i0 i0Var = i >= 29 ? new C3595h0() : i >= 23 ? new C3593g0() : i >= 22 ? new C3591f0() : i >= 21 ? new C3589e0() : i >= 19 ? new C3583d0() : new C3597i0();
        f10065a = i0Var;
        new C3579b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m14566a(View view) {
        f10065a.mo11323a(view);
    }

    /* renamed from: a */
    static void m14567a(View view, float f) {
        f10065a.mo11324a(view, f);
    }

    /* renamed from: a */
    static void m14568a(View view, int i) {
        f10065a.mo11332a(view, i);
    }

    /* renamed from: a */
    static void m14569a(View view, int i, int i2, int i3, int i4) {
        f10065a.mo11330a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    static void m14570a(View view, Matrix matrix) {
        f10065a.mo11328a(view, matrix);
    }

    /* renamed from: b */
    static C3564b0 m14571b(View view) {
        return VERSION.SDK_INT >= 18 ? new C3562a0(view) : C3632z.m14785c(view);
    }

    /* renamed from: b */
    static void m14572b(View view, Matrix matrix) {
        f10065a.mo11329b(view, matrix);
    }

    /* renamed from: c */
    static float m14573c(View view) {
        return f10065a.mo11325b(view);
    }

    /* renamed from: d */
    static C3614m0 m14574d(View view) {
        return VERSION.SDK_INT >= 18 ? new C3606l0(view) : new C3604k0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m14575e(View view) {
        f10065a.mo11326c(view);
    }
}
