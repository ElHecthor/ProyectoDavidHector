package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
final class C2485v5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2388ma f7020f;

    /* renamed from: g */
    private final /* synthetic */ C2244aa f7021g;

    /* renamed from: h */
    private final /* synthetic */ C2335i5 f7022h;

    C2485v5(C2335i5 i5Var, C2388ma maVar, C2244aa aaVar) {
        this.f7022h = i5Var;
        this.f7020f = maVar;
        this.f7021g = aaVar;
    }

    public final void run() {
        this.f7022h.f6519a.mo7559r();
        if (this.f7020f.f6682h.mo7665a() == null) {
            this.f7022h.f6519a.mo7545b(this.f7020f, this.f7021g);
        } else {
            this.f7022h.f6519a.mo7535a(this.f7020f, this.f7021g);
        }
    }
}
