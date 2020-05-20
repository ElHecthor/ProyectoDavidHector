package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
final class C2359k5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2388ma f6588f;

    /* renamed from: g */
    private final /* synthetic */ C2335i5 f6589g;

    C2359k5(C2335i5 i5Var, C2388ma maVar) {
        this.f6589g = i5Var;
        this.f6588f = maVar;
    }

    public final void run() {
        this.f6589g.f6519a.mo7559r();
        if (this.f6588f.f6682h.mo7665a() == null) {
            this.f6589g.f6519a.mo7544b(this.f6588f);
        } else {
            this.f6589g.f6519a.mo7534a(this.f6588f);
        }
    }
}
