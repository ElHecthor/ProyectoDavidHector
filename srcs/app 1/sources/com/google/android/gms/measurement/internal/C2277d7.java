package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C2277d7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ long f6362f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f6363g;

    C2277d7(C2348j6 j6Var, long j) {
        this.f6363g = j6Var;
        this.f6362f = j;
    }

    public final void run() {
        this.f6363g.mo7826l().f6633p.mo7571a(this.f6362f);
        this.f6363g.mo7098j().mo7809A().mo7089a("Minimum session duration set", Long.valueOf(this.f6362f));
    }
}
