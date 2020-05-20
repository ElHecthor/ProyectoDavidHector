package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p048x.C2158a;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
final class C2290e8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ boolean f6379f;

    /* renamed from: g */
    private final /* synthetic */ boolean f6380g;

    /* renamed from: h */
    private final /* synthetic */ C2435r f6381h;

    /* renamed from: i */
    private final /* synthetic */ C2244aa f6382i;

    /* renamed from: j */
    private final /* synthetic */ String f6383j;

    /* renamed from: k */
    private final /* synthetic */ C2465t7 f6384k;

    C2290e8(C2465t7 t7Var, boolean z, boolean z2, C2435r rVar, C2244aa aaVar, String str) {
        this.f6384k = t7Var;
        this.f6379f = z;
        this.f6380g = z2;
        this.f6381h = rVar;
        this.f6382i = aaVar;
        this.f6383j = str;
    }

    public final void run() {
        C2428q3 d = this.f6384k.f6968d;
        if (d == null) {
            this.f6384k.mo7098j().mo7815t().mo7088a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6379f) {
            this.f6384k.mo7639a(d, (C2158a) this.f6380g ? null : this.f6381h, this.f6382i);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6383j)) {
                    d.mo7387a(this.f6381h, this.f6382i);
                } else {
                    d.mo7388a(this.f6381h, this.f6383j, this.f6384k.mo7098j().mo7811C());
                }
            } catch (RemoteException e) {
                this.f6384k.mo7098j().mo7815t().mo7089a("Failed to send event to the service", e);
            }
        }
        this.f6384k.m9926K();
    }
}
