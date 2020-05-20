package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
final class C2432q7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2410o7 f6808f;

    /* renamed from: g */
    private final /* synthetic */ C2410o7 f6809g;

    /* renamed from: h */
    private final /* synthetic */ long f6810h;

    /* renamed from: i */
    private final /* synthetic */ boolean f6811i;

    /* renamed from: j */
    private final /* synthetic */ C2397n7 f6812j;

    C2432q7(C2397n7 n7Var, C2410o7 o7Var, C2410o7 o7Var2, long j, boolean z) {
        this.f6812j = n7Var;
        this.f6808f = o7Var;
        this.f6809g = o7Var2;
        this.f6810h = j;
        this.f6811i = z;
    }

    public final void run() {
        this.f6812j.m9637a(this.f6808f, this.f6809g, this.f6810h, this.f6811i, null);
    }
}
