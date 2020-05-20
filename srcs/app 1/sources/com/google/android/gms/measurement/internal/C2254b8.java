package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.p048x.C2158a;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
final class C2254b8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f6287f;

    /* renamed from: g */
    private final /* synthetic */ C2465t7 f6288g;

    C2254b8(C2465t7 t7Var, C2244aa aaVar) {
        this.f6288g = t7Var;
        this.f6287f = aaVar;
    }

    public final void run() {
        C2428q3 d = this.f6288g.f6968d;
        if (d == null) {
            this.f6288g.mo7098j().mo7815t().mo7088a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo7394d(this.f6287f);
            this.f6288g.mo7281t().mo7654D();
            this.f6288g.mo7639a(d, (C2158a) null, this.f6287f);
            this.f6288g.m9926K();
        } catch (RemoteException e) {
            this.f6288g.mo7098j().mo7815t().mo7089a("Failed to send app launch to the service", e);
        }
    }
}
