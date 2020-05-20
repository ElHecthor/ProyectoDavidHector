package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
final class C2275d5 extends Thread {

    /* renamed from: f */
    private final Object f6358f;

    /* renamed from: g */
    private final BlockingQueue<C2239a5<?>> f6359g;

    /* renamed from: h */
    private boolean f6360h = false;

    /* renamed from: i */
    private final /* synthetic */ C2528z4 f6361i;

    public C2275d5(C2528z4 z4Var, String str, BlockingQueue<C2239a5<?>> blockingQueue) {
        this.f6361i = z4Var;
        C2148s.m8834a(str);
        C2148s.m8834a(blockingQueue);
        this.f6358f = new Object();
        this.f6359g = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    private final void m9282a(InterruptedException interruptedException) {
        this.f6361i.mo7098j().mo7818w().mo7089a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: b */
    private final void m9283b() {
        synchronized (this.f6361i.f7122i) {
            if (!this.f6360h) {
                this.f6361i.f7123j.release();
                this.f6361i.f7122i.notifyAll();
                if (this == this.f6361i.f7116c) {
                    this.f6361i.f7116c = null;
                } else if (this == this.f6361i.f7117d) {
                    this.f6361i.f7117d = null;
                } else {
                    this.f6361i.mo7098j().mo7815t().mo7088a("Current scheduler thread is neither worker nor network");
                }
                this.f6360h = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo7236a() {
        synchronized (this.f6358f) {
            this.f6358f.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        m9283b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.z4 r1 = r5.f6361i     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f7123j     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.m9282a(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.a5<?>> r1 = r5.f6359g     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.a5 r1 = (com.google.android.gms.measurement.internal.C2239a5) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f6234g     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f6358f     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.a5<?>> r2 = r5.f6359g     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            com.google.android.gms.measurement.internal.z4 r2 = r5.f6361i     // Catch:{ all -> 0x007e }
            boolean r2 = r2.f7124k     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f6358f     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.m9282a(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.z4 r1 = r5.f6361i     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.f7122i     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.a5<?>> r2 = r5.f6359g     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.z4 r0 = r5.f6361i     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.b r0 = r0.mo7827m()     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6957z0     // Catch:{ all -> 0x007b }
            boolean r0 = r0.mo7108a(r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.m9283b()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.m9283b()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.m9283b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2275d5.run():void");
    }
}
