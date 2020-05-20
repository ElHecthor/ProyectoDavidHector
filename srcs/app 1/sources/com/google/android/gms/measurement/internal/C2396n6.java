package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n6 */
final class C2396n6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f6713f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f6714g;

    C2396n6(C2348j6 j6Var, long j) {
        this.f6714g = j6Var;
        this.f6713f = j;
    }

    public final void run() {
        this.f6714g.mo7826l().f6634q.mo7571a(this.f6713f);
        this.f6714g.mo7098j().mo7809A().mo7089a("Session timeout duration set", Long.valueOf(this.f6713f));
    }
}
