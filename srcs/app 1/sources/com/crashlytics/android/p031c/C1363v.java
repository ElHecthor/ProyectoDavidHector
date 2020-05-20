package com.crashlytics.android.p031c;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.crashlytics.android.c.v */
class C1363v implements C1354m {

    /* renamed from: b */
    static final Set<C1331c> f4422b = new C1364a();

    /* renamed from: a */
    final int f4423a;

    /* renamed from: com.crashlytics.android.c.v$a */
    static class C1364a extends HashSet<C1331c> {
        C1364a() {
            add(C1331c.START);
            add(C1331c.RESUME);
            add(C1331c.PAUSE);
            add(C1331c.STOP);
        }
    }

    public C1363v(int i) {
        this.f4423a = i;
    }

    /* renamed from: a */
    public boolean mo5458a(C1328a0 a0Var) {
        return (f4422b.contains(a0Var.f4323c) && a0Var.f4321a.f4351e == null) && (Math.abs(a0Var.f4321a.f4349c.hashCode() % this.f4423a) != 0);
    }
}
