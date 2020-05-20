package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.b1 */
final class C2016b1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ LifecycleCallback f5849f;

    /* renamed from: g */
    private final /* synthetic */ String f5850g;

    /* renamed from: h */
    private final /* synthetic */ C2020c1 f5851h;

    C2016b1(C2020c1 c1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f5851h = c1Var;
        this.f5849f = lifecycleCallback;
        this.f5850g = str;
    }

    public final void run() {
        if (this.f5851h.f5859c0 > 0) {
            this.f5849f.mo6643a(this.f5851h.f5860d0 != null ? this.f5851h.f5860d0.getBundle(this.f5850g) : null);
        }
        if (this.f5851h.f5859c0 >= 2) {
            this.f5849f.mo6648d();
        }
        if (this.f5851h.f5859c0 >= 3) {
            this.f5849f.mo6647c();
        }
        if (this.f5851h.f5859c0 >= 4) {
            this.f5849f.mo6649e();
        }
        if (this.f5851h.f5859c0 >= 5) {
            this.f5849f.mo6645b();
        }
    }
}
