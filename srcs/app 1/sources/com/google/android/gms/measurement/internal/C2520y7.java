package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
final class C2520y7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f7103f;

    /* renamed from: g */
    private final /* synthetic */ C4317zc f7104g;

    /* renamed from: h */
    private final /* synthetic */ C2465t7 f7105h;

    C2520y7(C2465t7 t7Var, C2244aa aaVar, C4317zc zcVar) {
        this.f7105h = t7Var;
        this.f7103f = aaVar;
        this.f7104g = zcVar;
    }

    public final void run() {
        String str = "Failed to get app instance id";
        String str2 = null;
        try {
            C2428q3 d = this.f7105h.f6968d;
            if (d == null) {
                this.f7105h.mo7098j().mo7815t().mo7088a(str);
            } else {
                str2 = d.mo7392b(this.f7103f);
                if (str2 != null) {
                    this.f7105h.mo7277p().mo7428a(str2);
                    this.f7105h.mo7826l().f6629l.mo7590a(str2);
                }
                this.f7105h.m9926K();
            }
        } catch (RemoteException e) {
            this.f7105h.mo7098j().mo7815t().mo7089a(str, e);
        } catch (Throwable th) {
            this.f7105h.mo7825k().mo7694a(this.f7104g, (String) null);
            throw th;
        }
        this.f7105h.mo7825k().mo7694a(this.f7104g, str2);
    }
}
