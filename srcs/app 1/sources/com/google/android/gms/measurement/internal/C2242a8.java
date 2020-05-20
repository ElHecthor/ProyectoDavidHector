package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
final class C2242a8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2410o7 f6238f;

    /* renamed from: g */
    private final /* synthetic */ C2465t7 f6239g;

    C2242a8(C2465t7 t7Var, C2410o7 o7Var) {
        this.f6239g = t7Var;
        this.f6238f = o7Var;
    }

    public final void run() {
        long j;
        String str;
        String str2;
        String packageName;
        C2428q3 d = this.f6239g.f6968d;
        if (d == null) {
            this.f6239g.mo7098j().mo7815t().mo7088a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f6238f == null) {
                j = 0;
                str = null;
                str2 = null;
                packageName = this.f6239g.mo7096h().getPackageName();
            } else {
                j = this.f6238f.f6770c;
                str = this.f6238f.f6768a;
                str2 = this.f6238f.f6769b;
                packageName = this.f6239g.mo7096h().getPackageName();
            }
            d.mo7383a(j, str, str2, packageName);
            this.f6239g.m9926K();
        } catch (RemoteException e) {
            this.f6239g.mo7098j().mo7815t().mo7089a("Failed to send current screen to the service", e);
        }
    }
}
