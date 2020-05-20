package com.google.firebase.iid;

import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p183f.C4336a;

/* renamed from: com.google.firebase.iid.h0 */
public final class C2950h0 {

    /* renamed from: a */
    private static final long f8495a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f8496b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    private static C4336a f8497c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m12153a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f8496b
            monitor-enter(r0)
            g.d.a.b.f.a r1 = f8497c     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            g.d.a.b.f.a r1 = new g.d.a.b.f.a     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0032 }
            f8497c = r1     // Catch:{ all -> 0x0032 }
            r1.mo12998a(r2)     // Catch:{ all -> 0x0032 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0032 }
            m12155a(r5, r2)     // Catch:{ all -> 0x0032 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0032 }
            if (r4 != 0) goto L_0x0027
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0027:
            if (r1 != 0) goto L_0x0030
            g.d.a.b.f.a r5 = f8497c     // Catch:{ all -> 0x0032 }
            long r1 = f8495a     // Catch:{ all -> 0x0032 }
            r5.mo12997a(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2950h0.m12153a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    public static void m12154a(Intent intent) {
        synchronized (f8496b) {
            if (f8497c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                m12155a(intent, false);
                f8497c.mo12996a();
            }
        }
    }

    /* renamed from: a */
    private static void m12155a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }
}
