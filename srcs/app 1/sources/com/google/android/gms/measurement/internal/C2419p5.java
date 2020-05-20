package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
final class C2419p5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2435r f6786f;

    /* renamed from: g */
    private final /* synthetic */ String f6787g;

    /* renamed from: h */
    private final /* synthetic */ C2335i5 f6788h;

    C2419p5(C2335i5 i5Var, C2435r rVar, String str) {
        this.f6788h = i5Var;
        this.f6786f = rVar;
        this.f6787g = str;
    }

    public final void run() {
        this.f6788h.f6519a.mo7559r();
        this.f6788h.f6519a.mo7537a(this.f6786f, this.f6787g);
    }
}
