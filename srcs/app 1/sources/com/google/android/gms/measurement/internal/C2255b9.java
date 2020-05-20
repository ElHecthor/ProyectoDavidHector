package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
final /* synthetic */ class C2255b9 implements Runnable {

    /* renamed from: f */
    private final C2267c9 f6289f;

    C2255b9(C2267c9 c9Var) {
        this.f6289f = c9Var;
    }

    public final void run() {
        C2267c9 c9Var = this.f6289f;
        C2532z8 z8Var = c9Var.f6350h;
        long j = c9Var.f6348f;
        long j2 = c9Var.f6349g;
        z8Var.f7131b.mo7274c();
        z8Var.f7131b.mo7098j().mo7809A().mo7088a("Application going to the background");
        if (z8Var.f7131b.mo7827m().mo7108a(C2457t.f6871E0)) {
            z8Var.f7131b.mo7826l().f6641x.mo7516a(true);
        }
        if (!z8Var.f7131b.mo7827m().mo7126s().booleanValue()) {
            z8Var.f7131b.f7108e.mo7270b(j2);
            z8Var.f7131b.mo7830a(false, false, j2);
        }
        z8Var.f7131b.mo7277p().mo7429a("auto", "_ab", j, new Bundle());
    }
}
