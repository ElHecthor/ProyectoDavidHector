package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
final class C2386m8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6672f;

    /* renamed from: g */
    private final /* synthetic */ String f6673g;

    /* renamed from: h */
    private final /* synthetic */ boolean f6674h;

    /* renamed from: i */
    private final /* synthetic */ C2244aa f6675i;

    /* renamed from: j */
    private final /* synthetic */ C4317zc f6676j;

    /* renamed from: k */
    private final /* synthetic */ C2465t7 f6677k;

    C2386m8(C2465t7 t7Var, String str, String str2, boolean z, C2244aa aaVar, C4317zc zcVar) {
        this.f6677k = t7Var;
        this.f6672f = str;
        this.f6673g = str2;
        this.f6674h = z;
        this.f6675i = aaVar;
        this.f6676j = zcVar;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C2428q3 d = this.f6677k.f6968d;
            if (d == null) {
                this.f6677k.mo7098j().mo7815t().mo7090a("Failed to get user properties; not connected to service", this.f6672f, this.f6673g);
            } else {
                bundle = C2489v9.m10006a(d.mo7382a(this.f6672f, this.f6673g, this.f6674h, this.f6675i));
                this.f6677k.m9926K();
            }
        } catch (RemoteException e) {
            this.f6677k.mo7098j().mo7815t().mo7090a("Failed to get user properties; remote exception", this.f6672f, e);
        } catch (Throwable th) {
            this.f6677k.mo7825k().mo7693a(this.f6676j, bundle);
            throw th;
        }
        this.f6677k.mo7825k().mo7693a(this.f6676j, bundle);
    }
}
