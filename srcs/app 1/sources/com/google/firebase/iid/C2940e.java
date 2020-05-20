package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p052q.C2202a;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p173d.p179f.C3888a;
import p147g.p156d.p157a.p167b.p173d.p179f.C3893f;
import p147g.p156d.p157a.p167b.p184g.C4350h;

/* renamed from: com.google.firebase.iid.e */
public final class C2940e {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    private static C2940e f8465e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8466a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f8467b;
    @GuardedBy("this")

    /* renamed from: c */
    private C2943f f8468c = new C2943f(this);
    @GuardedBy("this")

    /* renamed from: d */
    private int f8469d = 1;

    private C2940e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8467b = scheduledExecutorService;
        this.f8466a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m12124a() {
        int i;
        i = this.f8469d;
        this.f8469d = i + 1;
        return i;
    }

    /* renamed from: a */
    public static synchronized C2940e m12126a(Context context) {
        C2940e eVar;
        synchronized (C2940e.class) {
            if (f8465e == null) {
                f8465e = new C2940e(context, C3888a.m15641a().mo12034a(1, new C2202a("MessengerIpcClient"), C3893f.f10793a));
            }
            eVar = f8465e;
        }
        return eVar;
    }

    /* renamed from: a */
    private final synchronized <T> C4350h<T> m12127a(C2972q<T> qVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(qVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f8468c.mo9650a(qVar)) {
            C2943f fVar = new C2943f(this);
            this.f8468c = fVar;
            fVar.mo9650a(qVar);
        }
        return qVar.f8528b.mo13025a();
    }

    /* renamed from: a */
    public final C4350h<Void> mo9641a(int i, Bundle bundle) {
        return m12127a((C2972q<T>) new C2966n<T>(m12124a(), 2, bundle));
    }

    /* renamed from: b */
    public final C4350h<Bundle> mo9642b(int i, Bundle bundle) {
        return m12127a((C2972q<T>) new C2976s<T>(m12124a(), 1, bundle));
    }
}
