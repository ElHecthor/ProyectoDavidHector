package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
final /* synthetic */ class C2372l6 implements Runnable {

    /* renamed from: f */
    private final C2348j6 f6648f;

    C2372l6(C2348j6 j6Var) {
        this.f6648f = j6Var;
    }

    public final void run() {
        C2348j6 j6Var = this.f6648f;
        j6Var.mo7274c();
        if (j6Var.mo7826l().f6642y.mo7517a()) {
            j6Var.mo7098j().mo7809A().mo7088a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = j6Var.mo7826l().f6643z.mo7570a();
        j6Var.mo7826l().f6643z.mo7571a(1 + a);
        if (a >= 5) {
            j6Var.mo7098j().mo7818w().mo7088a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            j6Var.mo7826l().f6642y.mo7516a(true);
            return;
        }
        j6Var.f7100a.mo7210n();
    }
}
