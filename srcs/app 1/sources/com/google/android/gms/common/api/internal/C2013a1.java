package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
final class C2013a1 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ LifecycleCallback f5840f;

    /* renamed from: g */
    private final /* synthetic */ String f5841g;

    /* renamed from: h */
    private final /* synthetic */ C2069z0 f5842h;

    C2013a1(C2069z0 z0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f5842h = z0Var;
        this.f5840f = lifecycleCallback;
        this.f5841g = str;
    }

    public final void run() {
        if (this.f5842h.f5959g > 0) {
            this.f5840f.mo6643a(this.f5842h.f5960h != null ? this.f5842h.f5960h.getBundle(this.f5841g) : null);
        }
        if (this.f5842h.f5959g >= 2) {
            this.f5840f.mo6648d();
        }
        if (this.f5842h.f5959g >= 3) {
            this.f5840f.mo6647c();
        }
        if (this.f5842h.f5959g >= 4) {
            this.f5840f.mo6649e();
        }
        if (this.f5842h.f5959g >= 5) {
            this.f5840f.mo6645b();
        }
    }
}
