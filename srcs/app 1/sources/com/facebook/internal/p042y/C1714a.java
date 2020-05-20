package com.facebook.internal.p042y;

import com.facebook.C1787m;
import com.facebook.internal.C1661j;
import com.facebook.internal.C1661j.C1664c;
import com.facebook.internal.C1661j.C1665d;
import com.facebook.internal.p042y.p043c.C1719a;
import com.facebook.internal.p042y.p044d.C1724b;

/* renamed from: com.facebook.internal.y.a */
public class C1714a {

    /* renamed from: com.facebook.internal.y.a$a */
    static class C1715a implements C1664c {
        C1715a() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1719a.m7482a();
            }
        }
    }

    /* renamed from: com.facebook.internal.y.a$b */
    static class C1716b implements C1664c {
        C1716b() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1724b.m7497a();
            }
        }
    }

    /* renamed from: a */
    public static void m7470a() {
        if (C1787m.m7747h()) {
            C1661j.m7223a(C1665d.CrashReport, new C1715a());
            C1661j.m7223a(C1665d.ErrorReport, new C1716b());
        }
    }
}
