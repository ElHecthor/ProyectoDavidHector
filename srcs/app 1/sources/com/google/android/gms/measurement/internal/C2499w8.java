package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w8 */
final class C2499w8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2399n9 f7056f;

    /* renamed from: g */
    private final /* synthetic */ Runnable f7057g;

    C2499w8(C2444r8 r8Var, C2399n9 n9Var, Runnable runnable) {
        this.f7056f = n9Var;
        this.f7057g = runnable;
    }

    public final void run() {
        this.f7056f.mo7559r();
        this.f7056f.mo7539a(this.f7057g);
        this.f7056f.mo7558q();
    }
}
