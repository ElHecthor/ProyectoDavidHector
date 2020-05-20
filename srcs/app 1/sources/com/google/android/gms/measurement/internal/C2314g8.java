package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
final class C2314g8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f6472f;

    /* renamed from: g */
    private final /* synthetic */ C2465t7 f6473g;

    C2314g8(C2465t7 t7Var, C2244aa aaVar) {
        this.f6473g = t7Var;
        this.f6472f = aaVar;
    }

    public final void run() {
        C2428q3 d = this.f6473g.f6968d;
        if (d == null) {
            this.f6473g.mo7098j().mo7815t().mo7088a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo7384a(this.f6472f);
            this.f6473g.m9926K();
        } catch (RemoteException e) {
            this.f6473g.mo7098j().mo7815t().mo7089a("Failed to send measurementEnabled to the service", e);
        }
    }
}
