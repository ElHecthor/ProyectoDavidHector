package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q8 */
final class C2433q8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2428q3 f6813f;

    /* renamed from: g */
    private final /* synthetic */ C2374l8 f6814g;

    C2433q8(C2374l8 l8Var, C2428q3 q3Var) {
        this.f6814g = l8Var;
        this.f6813f = q3Var;
    }

    public final void run() {
        synchronized (this.f6814g) {
            this.f6814g.f6649a = false;
            if (!this.f6814g.f6651c.mo7628B()) {
                this.f6814g.f6651c.mo7098j().mo7809A().mo7088a("Connected to remote service");
                this.f6814g.f6651c.mo7638a(this.f6813f);
            }
        }
    }
}
