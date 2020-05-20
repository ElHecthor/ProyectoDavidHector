package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
final class C2509x7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f7079f;

    /* renamed from: g */
    private final /* synthetic */ C2465t7 f7080g;

    C2509x7(C2465t7 t7Var, C2244aa aaVar) {
        this.f7080g = t7Var;
        this.f7079f = aaVar;
    }

    public final void run() {
        C2428q3 d = this.f7080g.f6968d;
        if (d == null) {
            this.f7080g.mo7098j().mo7815t().mo7088a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            d.mo7393c(this.f7079f);
        } catch (RemoteException e) {
            this.f7080g.mo7098j().mo7815t().mo7089a("Failed to reset data on the service: remote exception", e);
        }
        this.f7080g.m9926K();
    }
}
