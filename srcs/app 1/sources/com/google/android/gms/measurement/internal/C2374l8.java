package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.internal.C2095c.C2096a;
import com.google.android.gms.common.internal.C2095c.C2097b;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.stats.C2179a;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
public final class C2374l8 implements ServiceConnection, C2096a, C2097b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f6649a;

    /* renamed from: b */
    private volatile C2527z3 f6650b;

    /* renamed from: c */
    final /* synthetic */ C2465t7 f6651c;

    protected C2374l8(C2465t7 t7Var) {
        this.f6651c = t7Var;
    }

    /* renamed from: a */
    public final void mo7487a() {
        if (this.f6650b != null && (this.f6650b.mo6827a() || this.f6650b.mo6831f())) {
            this.f6650b.mo6834i();
        }
        this.f6650b = null;
    }

    /* renamed from: a */
    public final void mo6816a(int i) {
        C2148s.m8840a("MeasurementServiceConnection.onConnectionSuspended");
        this.f6651c.mo7098j().mo7809A().mo7088a("Service connection suspended");
        this.f6651c.mo7097i().mo7841a((Runnable) new C2422p8(this));
    }

    /* renamed from: a */
    public final void mo7488a(Intent intent) {
        this.f6651c.mo7274c();
        Context h = this.f6651c.mo7096h();
        C2179a a = C2179a.m8953a();
        synchronized (this) {
            if (this.f6649a) {
                this.f6651c.mo7098j().mo7810B().mo7088a("Connection attempt already in progress");
                return;
            }
            this.f6651c.mo7098j().mo7810B().mo7088a("Using local app measurement service");
            this.f6649a = true;
            a.mo6977a(h, intent, this.f6651c.f6967c, 129);
        }
    }

    /* renamed from: a */
    public final void mo6850a(C2078b bVar) {
        C2148s.m8840a("MeasurementServiceConnection.onConnectionFailed");
        C2516y3 q = this.f6651c.f7100a.mo7213q();
        if (q != null) {
            q.mo7818w().mo7089a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f6649a = false;
            this.f6650b = null;
        }
        this.f6651c.mo7097i().mo7841a((Runnable) new C2455s8(this));
    }

    /* renamed from: b */
    public final void mo7489b() {
        this.f6651c.mo7274c();
        Context h = this.f6651c.mo7096h();
        synchronized (this) {
            if (this.f6649a) {
                this.f6651c.mo7098j().mo7810B().mo7088a("Connection attempt already in progress");
            } else if (this.f6650b == null || (!this.f6650b.mo6831f() && !this.f6650b.mo6827a())) {
                this.f6650b = new C2527z3(h, Looper.getMainLooper(), this, this);
                this.f6651c.mo7098j().mo7810B().mo7088a("Connecting to remote service");
                this.f6649a = true;
                this.f6650b.mo6836m();
            } else {
                this.f6651c.mo7098j().mo7810B().mo7088a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: c */
    public final void mo6817c(Bundle bundle) {
        C2148s.m8840a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f6651c.mo7097i().mo7841a((Runnable) new C2433q8(this, (C2428q3) this.f6650b.mo6846w()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f6650b = null;
                this.f6649a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f6651c.mo7098j().mo7815t().mo7088a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C2148s.m8840a(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f6649a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t7 r4 = r3.f6651c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo7098j()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.a4 r4 = r4.mo7815t()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo7088a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C2428q3     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.q3 r1 = (com.google.android.gms.measurement.internal.C2428q3) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.s3 r1 = new com.google.android.gms.measurement.internal.s3     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.t7 r5 = r3.f6651c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7810B()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo7088a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.t7 r5 = r3.f6651c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo7089a(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.t7 r5 = r3.f6651c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo7088a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f6649a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C2179a.m8953a()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.t7 r5 = r3.f6651c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.mo7096h()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.t7 r0 = r3.f6651c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.l8 r0 = r0.f6967c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo6976a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.t7 r4 = r3.f6651c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.z4 r4 = r4.mo7097i()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.o8 r5 = new com.google.android.gms.measurement.internal.o8     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo7841a(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2374l8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C2148s.m8840a("MeasurementServiceConnection.onServiceDisconnected");
        this.f6651c.mo7098j().mo7809A().mo7088a("Service disconnected");
        this.f6651c.mo7097i().mo7841a((Runnable) new C2398n8(this, componentName));
    }
}
