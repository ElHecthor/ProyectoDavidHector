package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
final class C2233a implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6222f;

    /* renamed from: g */
    private final /* synthetic */ long f6223g;

    /* renamed from: h */
    private final /* synthetic */ C2246b0 f6224h;

    C2233a(C2246b0 b0Var, String str, long j) {
        this.f6224h = b0Var;
        this.f6222f = str;
        this.f6223g = j;
    }

    public final void run() {
        this.f6224h.m9146c(this.f6222f, this.f6223g);
    }
}
