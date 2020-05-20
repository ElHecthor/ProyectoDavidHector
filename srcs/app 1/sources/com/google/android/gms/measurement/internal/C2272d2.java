package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d2 */
final class C2272d2 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6353f;

    /* renamed from: g */
    private final /* synthetic */ long f6354g;

    /* renamed from: h */
    private final /* synthetic */ C2246b0 f6355h;

    C2272d2(C2246b0 b0Var, String str, long j) {
        this.f6355h = b0Var;
        this.f6353f = str;
        this.f6354g = j;
    }

    public final void run() {
        this.f6355h.m9147d(this.f6353f, this.f6354g);
    }
}
