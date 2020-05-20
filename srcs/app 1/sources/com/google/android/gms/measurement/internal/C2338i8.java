package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p048x.C2158a;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
final class C2338i8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6525f;

    /* renamed from: g */
    private final /* synthetic */ boolean f6526g;

    /* renamed from: h */
    private final /* synthetic */ C2388ma f6527h;

    /* renamed from: i */
    private final /* synthetic */ C2244aa f6528i;

    /* renamed from: j */
    private final /* synthetic */ C2388ma f6529j;

    /* renamed from: k */
    private final /* synthetic */ C2465t7 f6530k;

    C2338i8(C2465t7 t7Var, boolean z, boolean z2, C2388ma maVar, C2244aa aaVar, C2388ma maVar2) {
        this.f6530k = t7Var;
        this.f6525f = z;
        this.f6526g = z2;
        this.f6527h = maVar;
        this.f6528i = aaVar;
        this.f6529j = maVar2;
    }

    public final void run() {
        C2428q3 d = this.f6530k.f6968d;
        if (d == null) {
            this.f6530k.mo7098j().mo7815t().mo7088a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f6525f) {
            this.f6530k.mo7639a(d, (C2158a) this.f6526g ? null : this.f6527h, this.f6528i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6529j.f6680f)) {
                    d.mo7386a(this.f6527h, this.f6528i);
                } else {
                    d.mo7385a(this.f6527h);
                }
            } catch (RemoteException e) {
                this.f6530k.mo7098j().mo7815t().mo7089a("Failed to send conditional user property to the service", e);
            }
        }
        this.f6530k.m9926K();
    }
}
