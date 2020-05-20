package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
public final class C2528z4 extends C2507x5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f7115l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2275d5 f7116c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2275d5 f7117d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C2239a5<?>> f7118e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    private final BlockingQueue<C2239a5<?>> f7119f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final UncaughtExceptionHandler f7120g = new C2251b5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final UncaughtExceptionHandler f7121h = new C2251b5(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f7122i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f7123j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f7124k;

    C2528z4(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: a */
    private final void m10178a(C2239a5<?> a5Var) {
        synchronized (this.f7122i) {
            this.f7118e.add(a5Var);
            if (this.f7116c == null) {
                C2275d5 d5Var = new C2275d5(this, "Measurement Worker", this.f7118e);
                this.f7116c = d5Var;
                d5Var.setUncaughtExceptionHandler(this.f7120g);
                this.f7116c.start();
            } else {
                this.f7116c.mo7236a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = r4.concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.mo7088a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = mo7098j().mo7818w();
        r4 = "Interrupted waiting for ";
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = r4.concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.mo7088a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = mo7098j().mo7818w();
        r4 = "Timed out waiting for ";
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo7839a(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.z4 r0 = r1.mo7097i()     // Catch:{ all -> 0x005a }
            r0.mo7841a(r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.y3 r3 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7818w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.mo7088a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.y3 r3 = r1.mo7098j()     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7818w()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005a }
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.mo7088a(r4)     // Catch:{ all -> 0x005a }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2528z4.mo7839a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: a */
    public final <V> Future<V> mo7840a(Callable<V> callable) {
        mo7742o();
        C2148s.m8834a(callable);
        C2239a5 a5Var = new C2239a5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7116c) {
            if (!this.f7118e.isEmpty()) {
                mo7098j().mo7818w().mo7088a("Callable skipped the worker queue.");
            }
            a5Var.run();
        } else {
            m10178a(a5Var);
        }
        return a5Var;
    }

    /* renamed from: a */
    public final void mo7841a(Runnable runnable) {
        mo7742o();
        C2148s.m8834a(runnable);
        m10178a(new C2239a5<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final <V> Future<V> mo7842b(Callable<V> callable) {
        mo7742o();
        C2148s.m8834a(callable);
        C2239a5 a5Var = new C2239a5(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f7116c) {
            a5Var.run();
        } else {
            m10178a(a5Var);
        }
        return a5Var;
    }

    /* renamed from: b */
    public final void mo7822b() {
        if (Thread.currentThread() != this.f7117d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: b */
    public final void mo7843b(Runnable runnable) {
        mo7742o();
        C2148s.m8834a(runnable);
        C2239a5 a5Var = new C2239a5(this, runnable, false, "Task exception on network thread");
        synchronized (this.f7122i) {
            this.f7119f.add(a5Var);
            if (this.f7117d == null) {
                C2275d5 d5Var = new C2275d5(this, "Measurement Network", this.f7119f);
                this.f7117d = d5Var;
                d5Var.setUncaughtExceptionHandler(this.f7121h);
                this.f7117d.start();
            } else {
                this.f7117d.mo7236a();
            }
        }
    }

    /* renamed from: c */
    public final void mo7274c() {
        if (Thread.currentThread() != this.f7116c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo7397r() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo7844t() {
        return Thread.currentThread() == this.f7116c;
    }
}
