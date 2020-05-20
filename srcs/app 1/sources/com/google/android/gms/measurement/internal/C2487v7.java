package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.p048x.C2158a;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
final class C2487v7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f7028f;

    /* renamed from: g */
    private final /* synthetic */ C2478u9 f7029g;

    /* renamed from: h */
    private final /* synthetic */ C2244aa f7030h;

    /* renamed from: i */
    private final /* synthetic */ C2465t7 f7031i;

    C2487v7(C2465t7 t7Var, boolean z, C2478u9 u9Var, C2244aa aaVar) {
        this.f7031i = t7Var;
        this.f7028f = z;
        this.f7029g = u9Var;
        this.f7030h = aaVar;
    }

    public final void run() {
        C2428q3 d = this.f7031i.f6968d;
        if (d == null) {
            this.f7031i.mo7098j().mo7815t().mo7088a("Discarding data. Failed to set user property");
            return;
        }
        this.f7031i.mo7639a(d, (C2158a) this.f7028f ? null : this.f7029g, this.f7030h);
        this.f7031i.m9926K();
    }
}
