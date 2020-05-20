package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
final class C2532z8 {

    /* renamed from: a */
    private C2267c9 f7130a;

    /* renamed from: b */
    final /* synthetic */ C2521y8 f7131b;

    C2532z8(C2521y8 y8Var) {
        this.f7131b = y8Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7847a() {
        this.f7131b.mo7274c();
        if (this.f7131b.mo7827m().mo7108a(C2457t.f6939q0) && this.f7130a != null) {
            this.f7131b.f7106c.removeCallbacks(this.f7130a);
        }
        if (this.f7131b.mo7827m().mo7108a(C2457t.f6871E0)) {
            this.f7131b.mo7826l().f6641x.mo7516a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7848a(long j) {
        if (this.f7131b.mo7827m().mo7108a(C2457t.f6939q0)) {
            C2267c9 c9Var = new C2267c9(this, this.f7131b.mo7095g().mo6988b(), j);
            this.f7130a = c9Var;
            this.f7131b.f7106c.postDelayed(this.f7130a, 2000);
        }
    }
}
