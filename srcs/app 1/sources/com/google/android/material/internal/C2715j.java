package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3375r;
import p071f.p097h.p108m.C3379v;

/* renamed from: com.google.android.material.internal.j */
public class C2715j {

    /* renamed from: com.google.android.material.internal.j$a */
    static class C2716a implements C3375r {

        /* renamed from: a */
        final /* synthetic */ C2718c f7892a;

        /* renamed from: b */
        final /* synthetic */ C2719d f7893b;

        C2716a(C2718c cVar, C2719d dVar) {
            this.f7892a = cVar;
            this.f7893b = dVar;
        }

        /* renamed from: a */
        public C3343e0 mo325a(View view, C3343e0 e0Var) {
            this.f7892a.mo8042a(view, e0Var, new C2719d(this.f7893b));
            return e0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    static class C2717b implements OnAttachStateChangeListener {
        C2717b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C3379v.m13773I(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.j$c */
    public interface C2718c {
        /* renamed from: a */
        C3343e0 mo8042a(View view, C3343e0 e0Var, C2719d dVar);
    }

    /* renamed from: com.google.android.material.internal.j$d */
    public static class C2719d {

        /* renamed from: a */
        public int f7894a;

        /* renamed from: b */
        public int f7895b;

        /* renamed from: c */
        public int f7896c;

        /* renamed from: d */
        public int f7897d;

        public C2719d(int i, int i2, int i3, int i4) {
            this.f7894a = i;
            this.f7895b = i2;
            this.f7896c = i3;
            this.f7897d = i4;
        }

        public C2719d(C2719d dVar) {
            this.f7894a = dVar.f7894a;
            this.f7895b = dVar.f7895b;
            this.f7896c = dVar.f7896c;
            this.f7897d = dVar.f7897d;
        }

        /* renamed from: a */
        public void mo9005a(View view) {
            C3379v.m13783a(view, this.f7894a, this.f7895b, this.f7896c, this.f7897d);
        }
    }

    /* renamed from: a */
    public static float m11285a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static float m11286a(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C3379v.m13825l((View) parent);
        }
        return f;
    }

    /* renamed from: a */
    public static Mode m11287a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static void m11288a(View view, C2718c cVar) {
        C3379v.m13792a(view, (C3375r) new C2716a(cVar, new C2719d(C3379v.m13834u(view), view.getPaddingTop(), C3379v.m13833t(view), view.getPaddingBottom())));
        m11290c(view);
    }

    /* renamed from: b */
    public static boolean m11289b(View view) {
        return C3379v.m13829p(view) == 1;
    }

    /* renamed from: c */
    public static void m11290c(View view) {
        if (C3379v.m13767C(view)) {
            C3379v.m13773I(view);
        } else {
            view.addOnAttachStateChangeListener(new C2717b());
        }
    }
}
