package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p052q.C2202a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4350h;

/* renamed from: com.google.firebase.iid.l0 */
public final class C2962l0 implements ServiceConnection {

    /* renamed from: a */
    private final Context f8510a;

    /* renamed from: b */
    private final Intent f8511b;

    /* renamed from: c */
    private final ScheduledExecutorService f8512c;

    /* renamed from: d */
    private final Queue<C2959k0> f8513d;

    /* renamed from: e */
    private C2947g0 f8514e;

    /* renamed from: f */
    private boolean f8515f;

    public C2962l0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C2202a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private C2962l0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f8513d = new ArrayDeque();
        this.f8515f = false;
        this.f8510a = context.getApplicationContext();
        this.f8511b = new Intent(str).setPackage(this.f8510a.getPackageName());
        this.f8512c = scheduledExecutorService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m12164a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.k0> r0 = r6.f8513d     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0028:
            com.google.firebase.iid.g0 r0 = r6.f8514e     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            com.google.firebase.iid.g0 r0 = r6.f8514e     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0043:
            java.util.Queue<com.google.firebase.iid.k0> r0 = r6.f8513d     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ab }
            com.google.firebase.iid.k0 r0 = (com.google.firebase.iid.C2959k0) r0     // Catch:{ all -> 0x00ab }
            com.google.firebase.iid.g0 r2 = r6.f8514e     // Catch:{ all -> 0x00ab }
            r2.mo9662a(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r3 = r6.f8515f     // Catch:{ all -> 0x00ab }
            if (r3 != 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00ab }
            r5.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00ab }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ab }
        L_0x007a:
            boolean r0 = r6.f8515f     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a7
            r6.f8515f = r2     // Catch:{ all -> 0x00ab }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C2179a.m8953a()     // Catch:{ SecurityException -> 0x009a }
            android.content.Context r2 = r6.f8510a     // Catch:{ SecurityException -> 0x009a }
            android.content.Intent r3 = r6.f8511b     // Catch:{ SecurityException -> 0x009a }
            r4 = 65
            boolean r0 = r0.mo6977a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x009a }
            if (r0 == 0) goto L_0x0092
            monitor-exit(r6)
            return
        L_0x0092:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00ab }
        L_0x00a2:
            r6.f8515f = r1     // Catch:{ all -> 0x00ab }
            r6.m12165b()     // Catch:{ all -> 0x00ab }
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            monitor-exit(r6)
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2962l0.m12164a():void");
    }

    /* renamed from: b */
    private final void m12165b() {
        while (!this.f8513d.isEmpty()) {
            ((C2959k0) this.f8513d.poll()).mo9672b();
        }
    }

    /* renamed from: a */
    public final synchronized C4350h<Void> mo9676a(Intent intent) {
        C2959k0 k0Var;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        k0Var = new C2959k0(intent);
        ScheduledExecutorService scheduledExecutorService = this.f8512c;
        k0Var.mo9671a().mo13007a((Executor) scheduledExecutorService, (C4343c<TResult>) new C2965m0<TResult>(scheduledExecutorService.schedule(new C2967n0(k0Var), 9000, TimeUnit.MILLISECONDS)));
        this.f8513d.add(k0Var);
        m12164a();
        return k0Var.mo9671a();
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f8515f = false;
        if (!(iBinder instanceof C2947g0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            m12165b();
            return;
        }
        this.f8514e = (C2947g0) iBinder;
        m12164a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d(str, sb.toString());
        }
        m12164a();
    }
}
