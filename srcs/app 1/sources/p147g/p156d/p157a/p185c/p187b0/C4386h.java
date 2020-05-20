package p147g.p156d.p157a.p185c.p187b0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C2715j;

/* renamed from: g.d.a.c.b0.h */
public class C4386h {
    /* renamed from: a */
    static C4379d m17873a() {
        return new C4388j();
    }

    /* renamed from: a */
    static C4379d m17874a(int i) {
        return i != 0 ? i != 1 ? m17873a() : new C4380e() : new C4388j();
    }

    /* renamed from: a */
    public static void m17875a(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C4382g) {
            m17877a(view, (C4382g) background);
        }
    }

    /* renamed from: a */
    public static void m17876a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C4382g) {
            ((C4382g) background).mo13064b(f);
        }
    }

    /* renamed from: a */
    public static void m17877a(View view, C4382g gVar) {
        if (gVar.mo13091r()) {
            gVar.mo13070d(C2715j.m11286a(view));
        }
    }

    /* renamed from: b */
    static C4381f m17878b() {
        return new C4381f();
    }
}
