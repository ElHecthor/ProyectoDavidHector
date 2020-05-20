package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
final class C2278d8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2435r f6364f;

    /* renamed from: g */
    private final /* synthetic */ String f6365g;

    /* renamed from: h */
    private final /* synthetic */ C4317zc f6366h;

    /* renamed from: i */
    private final /* synthetic */ C2465t7 f6367i;

    C2278d8(C2465t7 t7Var, C2435r rVar, String str, C4317zc zcVar) {
        this.f6367i = t7Var;
        this.f6364f = rVar;
        this.f6365g = str;
        this.f6366h = zcVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C2428q3 d = this.f6367i.f6968d;
            if (d == null) {
                this.f6367i.mo7098j().mo7815t().mo7088a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = d.mo7390a(this.f6364f, this.f6365g);
                this.f6367i.m9926K();
            }
        } catch (RemoteException e) {
            this.f6367i.mo7098j().mo7815t().mo7089a("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f6367i.mo7825k().mo7697a(this.f6366h, bArr);
            throw th;
        }
        this.f6367i.mo7825k().mo7697a(this.f6366h, bArr);
    }
}
