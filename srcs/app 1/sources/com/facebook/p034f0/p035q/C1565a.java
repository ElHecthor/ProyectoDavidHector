package com.facebook.p034f0.p035q;

import android.app.Activity;
import com.facebook.C1787m;
import com.facebook.internal.C1633a;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1698v;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.f0.q.a */
public final class C1565a {

    /* renamed from: a */
    private static final String f4861a = "com.facebook.f0.q.a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f4862b = new AtomicBoolean(false);

    /* renamed from: com.facebook.f0.q.a$a */
    static class C1566a implements Runnable {
        C1566a() {
        }

        public void run() {
            if (!C1633a.m7173g(C1787m.m7744e())) {
                C1565a.f4862b.set(true);
                C1565a.m6953d();
            }
        }
    }

    /* renamed from: a */
    public static void m6950a(Activity activity) {
        try {
            if (!f4862b.get()) {
                return;
            }
            if (!C1568c.m6961d().isEmpty()) {
                C1569d.m6966a(activity);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static void m6952c() {
        try {
            C1787m.m7751l().execute(new C1566a());
        } catch (Exception e) {
            C1698v.m7380a(f4861a, e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m6953d() {
        C1670l a = C1672m.m7260a(C1787m.m7745f(), false);
        if (a != null) {
            String f = a.mo5910f();
            if (f != null) {
                C1568c.m6959a(f);
            }
        }
    }
}
