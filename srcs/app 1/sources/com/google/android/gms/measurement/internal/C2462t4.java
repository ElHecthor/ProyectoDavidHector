package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p147g.p156d.p157a.p167b.p173d.p180g.C4079k5;
import p147g.p156d.p157a.p167b.p173d.p180g.C4091l2;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
public final class C2462t4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6961a;

    /* renamed from: b */
    final /* synthetic */ C2473u4 f6962b;

    C2462t4(C2473u4 u4Var, String str) {
        this.f6962b = u4Var;
        this.f6961a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f6962b.f6983a.mo7098j().mo7818w().mo7088a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C4091l2 a = C4079k5.m16700a(iBinder);
            if (a == null) {
                this.f6962b.f6983a.mo7098j().mo7818w().mo7088a("Install Referrer Service implementation was not found");
                return;
            }
            this.f6962b.f6983a.mo7098j().mo7810B().mo7088a("Install Referrer Service connected");
            this.f6962b.f6983a.mo7097i().mo7841a((Runnable) new C2495w4(this, a, this));
        } catch (Exception e) {
            this.f6962b.f6983a.mo7098j().mo7818w().mo7089a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6962b.f6983a.mo7098j().mo7810B().mo7088a("Install Referrer Service disconnected");
    }
}
