package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
final class C2443r7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2410o7 f6841f;

    /* renamed from: g */
    private final /* synthetic */ long f6842g;

    /* renamed from: h */
    private final /* synthetic */ C2397n7 f6843h;

    C2443r7(C2397n7 n7Var, C2410o7 o7Var, long j) {
        this.f6843h = n7Var;
        this.f6841f = o7Var;
        this.f6842g = j;
    }

    public final void run() {
        this.f6843h.m9638a(this.f6841f, false, this.f6842g);
        C2397n7 n7Var = this.f6843h;
        n7Var.f6717e = null;
        n7Var.mo7279r().mo7637a((C2410o7) null);
    }
}
