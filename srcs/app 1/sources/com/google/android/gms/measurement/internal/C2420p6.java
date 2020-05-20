package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import p147g.p156d.p157a.p167b.p173d.p180g.C3973da;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
final class C2420p6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f6789f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f6790g;

    C2420p6(C2348j6 j6Var, long j) {
        this.f6790g = j6Var;
        this.f6789f = j;
    }

    public final void run() {
        C2348j6 j6Var = this.f6790g;
        long j = this.f6789f;
        j6Var.mo7274c();
        j6Var.mo7273a();
        j6Var.mo7245x();
        j6Var.mo7098j().mo7809A().mo7088a("Resetting analytics data (FE)");
        C2521y8 u = j6Var.mo7282u();
        u.mo7274c();
        u.f7108e.mo7266a();
        boolean c = j6Var.f7100a.mo7204c();
        C2370l4 l = j6Var.mo7826l();
        l.f6627j.mo7571a(j);
        if (!TextUtils.isEmpty(l.mo7826l().f6616A.mo7589a())) {
            l.f6616A.mo7590a(null);
        }
        if (C3973da.m16224b() && l.mo7827m().mo7108a(C2457t.f6953x0)) {
            l.f6639v.mo7571a(0);
        }
        if (!l.mo7827m().mo7124q()) {
            l.mo7475c(!c);
        }
        l.f6617B.mo7590a(null);
        l.f6618C.mo7571a(0);
        l.f6619D.mo7579a(null);
        j6Var.mo7279r().mo7630D();
        if (C3973da.m16224b() && j6Var.mo7827m().mo7108a(C2457t.f6953x0)) {
            j6Var.mo7282u().f7107d.mo7371a();
        }
        j6Var.f6556i = !c;
        this.f6790g.mo7279r().mo7646a(new AtomicReference<>());
    }
}
