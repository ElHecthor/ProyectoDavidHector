package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
final class C2253b7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6285f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f6286g;

    C2253b7(C2348j6 j6Var, boolean z) {
        this.f6286g = j6Var;
        this.f6285f = z;
    }

    public final void run() {
        boolean c = this.f6286g.f7100a.mo7204c();
        boolean b = this.f6286g.f7100a.mo7203b();
        this.f6286g.f7100a.mo7202a(this.f6285f);
        if (b == this.f6285f) {
            this.f6286g.f7100a.mo7098j().mo7810B().mo7089a("Default data collection state already set to", Boolean.valueOf(this.f6285f));
        }
        if (this.f6286g.f7100a.mo7204c() == c || this.f6286g.f7100a.mo7204c() != this.f6286g.f7100a.mo7203b()) {
            this.f6286g.f7100a.mo7098j().mo7820y().mo7090a("Default data collection is different than actual status", Boolean.valueOf(this.f6285f), Boolean.valueOf(c));
        }
        this.f6286g.m9494M();
    }
}
