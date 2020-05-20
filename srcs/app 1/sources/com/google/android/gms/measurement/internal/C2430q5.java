package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q5 */
final class C2430q5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2435r f6803f;

    /* renamed from: g */
    private final /* synthetic */ C2244aa f6804g;

    /* renamed from: h */
    private final /* synthetic */ C2335i5 f6805h;

    C2430q5(C2335i5 i5Var, C2435r rVar, C2244aa aaVar) {
        this.f6805h = i5Var;
        this.f6803f = rVar;
        this.f6804g = aaVar;
    }

    public final void run() {
        C2435r b = this.f6805h.mo7391b(this.f6803f, this.f6804g);
        this.f6805h.f6519a.mo7559r();
        this.f6805h.f6519a.mo7536a(b, this.f6804g);
    }
}
