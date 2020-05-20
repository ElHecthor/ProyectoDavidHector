package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
final class C2362k8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6597f;

    /* renamed from: g */
    private final /* synthetic */ String f6598g;

    /* renamed from: h */
    private final /* synthetic */ C2244aa f6599h;

    /* renamed from: i */
    private final /* synthetic */ C4317zc f6600i;

    /* renamed from: j */
    private final /* synthetic */ C2465t7 f6601j;

    C2362k8(C2465t7 t7Var, String str, String str2, C2244aa aaVar, C4317zc zcVar) {
        this.f6601j = t7Var;
        this.f6597f = str;
        this.f6598g = str2;
        this.f6599h = aaVar;
        this.f6600i = zcVar;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            C2428q3 d = this.f6601j.f6968d;
            if (d == null) {
                this.f6601j.mo7098j().mo7815t().mo7090a("Failed to get conditional properties; not connected to service", this.f6597f, this.f6598g);
            } else {
                arrayList = C2489v9.m10021b(d.mo7379a(this.f6597f, this.f6598g, this.f6599h));
                this.f6601j.m9926K();
            }
        } catch (RemoteException e) {
            this.f6601j.mo7098j().mo7815t().mo7091a("Failed to get conditional properties; remote exception", this.f6597f, this.f6598g, e);
        } catch (Throwable th) {
            this.f6601j.mo7825k().mo7695a(this.f6600i, arrayList);
            throw th;
        }
        this.f6601j.mo7825k().mo7695a(this.f6600i, arrayList);
    }
}
