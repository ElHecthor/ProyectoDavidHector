package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
final class C2323h5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f6498f;

    /* renamed from: g */
    private final /* synthetic */ C2335i5 f6499g;

    C2323h5(C2335i5 i5Var, C2244aa aaVar) {
        this.f6499g = i5Var;
        this.f6498f = aaVar;
    }

    public final void run() {
        this.f6499g.f6519a.mo7559r();
        C2399n9 a = this.f6499g.f6519a;
        C2244aa aaVar = this.f6498f;
        a.mo7097i().mo7274c();
        a.mo7557p();
        C2148s.m8844b(aaVar.f6243f);
        a.mo7547c(aaVar);
    }
}
