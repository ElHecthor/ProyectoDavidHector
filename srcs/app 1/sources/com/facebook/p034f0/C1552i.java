package com.facebook.p034f0;

import com.facebook.C1787m;
import com.facebook.internal.C1661j;
import com.facebook.internal.C1661j.C1664c;
import com.facebook.internal.C1661j.C1665d;
import com.facebook.p034f0.p035q.C1565a;
import com.facebook.p034f0.p039t.C1625a;

/* renamed from: com.facebook.f0.i */
public class C1552i {

    /* renamed from: com.facebook.f0.i$a */
    static class C1553a implements C1664c {
        C1553a() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1565a.m6952c();
            }
        }
    }

    /* renamed from: com.facebook.f0.i$b */
    static class C1554b implements C1664c {
        C1554b() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1625a.m7148a();
            }
        }
    }

    /* renamed from: a */
    public static void m6911a() {
        if (C1787m.m7747h()) {
            C1661j.m7223a(C1665d.AAM, new C1553a());
            C1661j.m7223a(C1665d.RestrictiveDataFiltering, new C1554b());
        }
    }
}
