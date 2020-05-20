package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.o8 */
final class C2411o8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2428q3 f6773f;

    /* renamed from: g */
    private final /* synthetic */ C2374l8 f6774g;

    C2411o8(C2374l8 l8Var, C2428q3 q3Var) {
        this.f6774g = l8Var;
        this.f6773f = q3Var;
    }

    public final void run() {
        synchronized (this.f6774g) {
            this.f6774g.f6649a = false;
            if (!this.f6774g.f6651c.mo7628B()) {
                this.f6774g.f6651c.mo7098j().mo7810B().mo7088a("Connected to service");
                this.f6774g.f6651c.mo7638a(this.f6773f);
            }
        }
    }
}
