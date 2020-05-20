package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
final class C2441r5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2478u9 f6836f;

    /* renamed from: g */
    private final /* synthetic */ C2244aa f6837g;

    /* renamed from: h */
    private final /* synthetic */ C2335i5 f6838h;

    C2441r5(C2335i5 i5Var, C2478u9 u9Var, C2244aa aaVar) {
        this.f6838h = i5Var;
        this.f6836f = u9Var;
        this.f6837g = aaVar;
    }

    public final void run() {
        this.f6838h.f6519a.mo7559r();
        if (this.f6836f.mo7665a() == null) {
            this.f6838h.f6519a.mo7546b(this.f6836f, this.f6837g);
        } else {
            this.f6838h.f6519a.mo7538a(this.f6836f, this.f6837g);
        }
    }
}
