package kotlinx.coroutines.p331d3;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C6157l0;
import kotlinx.coroutines.C6161m0;
import kotlinx.coroutines.C6206v2;
import kotlinx.coroutines.C6210w2;
import kotlinx.coroutines.internal.C6139v;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d3.a */
public final class C6048a implements Executor, Closeable {

    /* renamed from: n */
    private static final AtomicLongFieldUpdater f15099n = AtomicLongFieldUpdater.newUpdater(C6048a.class, "parkedWorkersStack");

    /* renamed from: o */
    static final AtomicLongFieldUpdater f15100o = AtomicLongFieldUpdater.newUpdater(C6048a.class, "controlState");

    /* renamed from: p */
    private static final AtomicIntegerFieldUpdater f15101p = AtomicIntegerFieldUpdater.newUpdater(C6048a.class, "_isTerminated");
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final int f15102q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final int f15103r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final int f15104s = ((int) TimeUnit.SECONDS.toNanos(1));
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final int f15105t = ((int) C5736g.m21873b(C5736g.m21868a(C6063m.f15151a / ((long) 4), 10), (long) f15104s));
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C6139v f15106u = new C6139v("NOT_IN_STACK");
    private volatile int _isTerminated;
    volatile long controlState;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6055e f15107f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Semaphore f15108g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6050b[] f15109h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Random f15110i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f15111j;

    /* renamed from: k */
    private final int f15112k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f15113l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final String f15114m;
    private volatile long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.d3.a$a */
    public static final class C6049a {
        private C6049a() {
        }

        public /* synthetic */ C6049a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.d3.a$b */
    public final class C6050b extends Thread {

        /* renamed from: m */
        private static final AtomicIntegerFieldUpdater f15115m = AtomicIntegerFieldUpdater.newUpdater(C6050b.class, "terminationState");

        /* renamed from: f */
        private final C6065o f15116f;

        /* renamed from: g */
        private long f15117g;

        /* renamed from: h */
        private long f15118h;

        /* renamed from: i */
        private int f15119i;
        private volatile int indexInArray;

        /* renamed from: j */
        private int f15120j;

        /* renamed from: k */
        private int f15121k;
        private volatile Object nextParkedWorker;
        private volatile int spins;
        private volatile C6051c state;
        private volatile int terminationState;

        private C6050b() {
            setDaemon(true);
            this.f15116f = new C6065o();
            this.state = C6051c.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = C6048a.f15106u;
            this.f15119i = C6048a.f15105t;
            this.f15120j = C6048a.this.f15110i.nextInt();
        }

        public C6050b(C6048a aVar, int i) {
            this();
            mo15784b(i);
        }

        /* renamed from: a */
        private final void m22765a(C6062l lVar) {
            if (lVar != C6062l.NON_BLOCKING) {
                C6048a.f15100o.addAndGet(C6048a.this, -2097152);
                C6051c cVar = this.state;
                if (cVar != C6051c.TERMINATED) {
                    if (C6157l0.m23149a()) {
                        if (!(cVar == C6051c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.state = C6051c.RETIRING;
                }
            }
        }

        /* renamed from: a */
        private final void m22766a(C6062l lVar, long j) {
            if (lVar != C6062l.NON_BLOCKING) {
                C6048a.f15100o.addAndGet(C6048a.this, 2097152);
                if (mo15782a(C6051c.BLOCKING)) {
                    C6048a.this.m22760p();
                }
            } else if (C6048a.this.f15108g.availablePermits() != 0) {
                long a = C6063m.f15156f.mo15805a();
                long j2 = a - j;
                long j3 = C6063m.f15151a;
                if (j2 >= j3 && a - this.f15118h >= j3 * ((long) 5)) {
                    this.f15118h = a;
                    C6048a.this.m22760p();
                }
            }
        }

        /* renamed from: a */
        private final boolean m22767a(long j) {
            C6048a.this.m22743b(this);
            if (!m22769k()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        /* renamed from: b */
        private final void m22768b(C6062l lVar) {
            this.f15117g = 0;
            this.f15121k = 0;
            if (this.state == C6051c.PARKING) {
                if (C6157l0.m23149a()) {
                    if (!(lVar == C6062l.PROBABLY_BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.state = C6051c.BLOCKING;
                this.f15119i = C6048a.f15105t;
            }
            this.spins = 0;
        }

        /* renamed from: k */
        private final boolean m22769k() {
            C6059i a = C6048a.this.f15107f.mo15800a(C6062l.PROBABLY_BLOCKING);
            if (a == null) {
                return true;
            }
            this.f15116f.mo15811a(a, C6048a.this.f15107f);
            return false;
        }

        /* renamed from: l */
        private final void m22770l() {
            mo15782a(C6051c.PARKING);
            if (m22769k()) {
                this.terminationState = 0;
                if (this.f15117g == 0) {
                    this.f15117g = System.nanoTime() + C6048a.this.f15113l;
                }
                if (m22767a(C6048a.this.f15113l) && System.nanoTime() - this.f15117g >= 0) {
                    this.f15117g = 0;
                    m22774p();
                }
            }
        }

        /* renamed from: m */
        private final void m22771m() {
            int i = this.spins;
            if (i <= C6048a.f15103r) {
                this.spins = i + 1;
                if (i >= C6048a.f15102q) {
                    Thread.yield();
                    return;
                }
                return;
            }
            if (this.f15119i < C6048a.f15104s) {
                this.f15119i = C5736g.m21872b((this.f15119i * 3) >>> 1, C6048a.f15104s);
            }
            mo15782a(C6051c.PARKING);
            m22767a((long) this.f15119i);
        }

        /* renamed from: n */
        private final C6059i m22772n() {
            boolean z = mo15779a(C6048a.this.f15111j * 2) == 0;
            if (z) {
                C6059i a = C6048a.this.f15107f.mo15800a(C6062l.NON_BLOCKING);
                if (a != null) {
                    return a;
                }
            }
            C6059i b = this.f15116f.mo15813b();
            if (b != null) {
                return b;
            }
            if (!z) {
                C6059i iVar = (C6059i) C6048a.this.f15107f.mo15916c();
                if (iVar != null) {
                    return iVar;
                }
            }
            return m22773o();
        }

        /* renamed from: o */
        private final C6059i m22773o() {
            int c = C6048a.this.m22758m();
            if (c < 2) {
                return null;
            }
            int i = this.f15121k;
            if (i == 0) {
                i = mo15779a(c);
            }
            int i2 = 1;
            int i3 = i + 1;
            if (i3 <= c) {
                i2 = i3;
            }
            this.f15121k = i2;
            C6050b bVar = C6048a.this.f15109h[i2];
            if (bVar == null || bVar == this || !this.f15116f.mo15812a(bVar.f15116f, C6048a.this.f15107f)) {
                return null;
            }
            return this.f15116f.mo15813b();
        }

        /* renamed from: p */
        private final void m22774p() {
            synchronized (C6048a.this.f15109h) {
                if (!C6048a.this.isTerminated()) {
                    if (C6048a.this.m22758m() > C6048a.this.f15111j) {
                        if (m22769k()) {
                            if (f15115m.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                mo15784b(0);
                                C6048a.this.m22736a(this, i, 0);
                                int andDecrement = (int) (C6048a.f15100o.getAndDecrement(C6048a.this) & 2097151);
                                if (andDecrement != i) {
                                    C6050b bVar = C6048a.this.f15109h[andDecrement];
                                    if (bVar != null) {
                                        C6048a.this.f15109h[i] = bVar;
                                        bVar.mo15784b(i);
                                        C6048a.this.m22736a(bVar, andDecrement, i);
                                    } else {
                                        C5942k.m22323a();
                                        throw null;
                                    }
                                }
                                C6048a.this.f15109h[andDecrement] = null;
                                C5812t tVar = C5812t.f14872a;
                                this.state = C6051c.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final int mo15779a(int i) {
            int i2 = this.f15120j;
            int i3 = i2 ^ (i2 << 13);
            this.f15120j = i3;
            int i4 = i3 ^ (i3 >> 17);
            this.f15120j = i4;
            int i5 = i4 ^ (i4 << 5);
            this.f15120j = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        public final C6059i mo15780a() {
            if (mo15792i()) {
                return m22772n();
            }
            C6059i b = this.f15116f.mo15813b();
            if (b == null) {
                b = C6048a.this.f15107f.mo15800a(C6062l.PROBABLY_BLOCKING);
            }
            return b;
        }

        /* renamed from: a */
        public final void mo15781a(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: a */
        public final boolean mo15782a(C6051c cVar) {
            C5942k.m22327b(cVar, "newState");
            C6051c cVar2 = this.state;
            boolean z = cVar2 == C6051c.CPU_ACQUIRED;
            if (z) {
                C6048a.this.f15108g.release();
            }
            if (cVar2 != cVar) {
                this.state = cVar;
            }
            return z;
        }

        /* renamed from: b */
        public final int mo15783b() {
            return this.indexInArray;
        }

        /* renamed from: b */
        public final void mo15784b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6048a.this.f15114m);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: c */
        public final C6065o mo15785c() {
            return this.f15116f;
        }

        /* renamed from: d */
        public final Object mo15786d() {
            return this.nextParkedWorker;
        }

        /* renamed from: e */
        public final C6048a mo15787e() {
            return C6048a.this;
        }

        /* renamed from: f */
        public final void mo15788f() {
            this.f15119i = C6048a.f15105t;
            this.spins = 0;
        }

        /* renamed from: g */
        public final boolean mo15789g() {
            return this.state == C6051c.BLOCKING;
        }

        public final C6051c getState() {
            return this.state;
        }

        /* renamed from: h */
        public final boolean mo15791h() {
            return this.state == C6051c.PARKING;
        }

        /* renamed from: i */
        public final boolean mo15792i() {
            if (this.state == C6051c.CPU_ACQUIRED) {
                return true;
            }
            if (!C6048a.this.f15108g.tryAcquire()) {
                return false;
            }
            this.state = C6051c.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: j */
        public final boolean mo15793j() {
            int i = this.terminationState;
            if (i == 1 || i == -1) {
                return false;
            }
            if (i == 0) {
                return f15115m.compareAndSet(this, 0, -1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid terminationState = ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }

        public void run() {
            boolean z = false;
            while (!C6048a.this.isTerminated() && this.state != C6051c.TERMINATED) {
                C6059i a = mo15780a();
                if (a == null) {
                    if (this.state == C6051c.CPU_ACQUIRED) {
                        m22771m();
                    } else {
                        m22770l();
                    }
                    z = true;
                } else {
                    C6062l a2 = a.mo15806a();
                    if (z) {
                        m22768b(a2);
                        z = false;
                    }
                    m22766a(a2, a.f15145f);
                    C6048a.this.m22741a(a);
                    m22765a(a2);
                }
            }
            mo15782a(C6051c.TERMINATED);
        }
    }

    /* renamed from: kotlinx.coroutines.d3.a$c */
    public enum C6051c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    static {
        new C6049a(null);
        int a = C6142y.m23091a("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);
        f15102q = a;
        f15103r = a + C6142y.m23091a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null);
    }

    public C6048a(int i, int i2, long j, String str) {
        C5942k.m22327b(str, "schedulerName");
        this.f15111j = i;
        this.f15112k = i2;
        this.f15113l = j;
        this.f15114m = str;
        if (i >= 1) {
            String str2 = "Max pool size ";
            if (this.f15112k >= this.f15111j) {
                if (this.f15112k <= 2097150) {
                    if (this.f15113l > 0) {
                        this.f15107f = new C6055e();
                        this.f15108g = new Semaphore(this.f15111j, false);
                        this.parkedWorkersStack = 0;
                        this.f15109h = new C6050b[(this.f15112k + 1)];
                        this.controlState = 0;
                        this.f15110i = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Idle worker keep alive time ");
                    sb.append(this.f15113l);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f15112k);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(this.f15112k);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(this.f15111j);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Core pool size ");
        sb4.append(this.f15111j);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    /* renamed from: a */
    private final int m22733a(C6050b bVar) {
        int b;
        do {
            Object d = bVar.mo15786d();
            if (d == f15106u) {
                return -1;
            }
            if (d == null) {
                return 0;
            }
            bVar = (C6050b) d;
            b = bVar.mo15783b();
        } while (b == 0);
        return b;
    }

    /* renamed from: a */
    private final int m22735a(C6059i iVar, boolean z) {
        C6050b l = m22757l();
        if (l == null || l.getState() == C6051c.TERMINATED) {
            return 1;
        }
        int i = -1;
        if (iVar.mo15806a() == C6062l.NON_BLOCKING) {
            if (l.mo15789g()) {
                i = 0;
            } else if (!l.mo15792i()) {
                return 1;
            }
        }
        if (!(z ? l.mo15785c().mo15814b(iVar, this.f15107f) : l.mo15785c().mo15811a(iVar, this.f15107f)) || l.mo15785c().mo15809a() > C6063m.f15152b) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22736a(C6050b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m22733a(bVar) : i2;
            }
            if (i3 >= 0) {
                if (f15099n.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m22737a(C6048a aVar, Runnable runnable, C6060j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C6058h.f15144g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo15774a(runnable, jVar, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22741a(C6059i iVar) {
        C6206v2 a;
        try {
            iVar.run();
            a = C6210w2.m23278a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            C6206v2 a2 = C6210w2.m23278a();
            if (a2 != null) {
                a2.mo15982c();
            }
            throw th;
        }
        a.mo15982c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22743b(C6050b bVar) {
        long j;
        long j2;
        int b;
        if (bVar.mo15786d() == f15106u) {
            do {
                j = this.parkedWorkersStack;
                int i = (int) (2097151 & j);
                j2 = (2097152 + j) & -2097152;
                b = bVar.mo15783b();
                if (C6157l0.m23149a()) {
                    if (!(b != 0)) {
                        throw new AssertionError();
                    }
                }
                bVar.mo15781a((Object) this.f15109h[i]);
            } while (!f15099n.compareAndSet(this, j, ((long) b) | j2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return r1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22754i() {
        /*
            r10 = this;
            kotlinx.coroutines.d3.a$b[] r0 = r10.f15109h
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x000c
            r1 = -1
        L_0x000a:
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007c }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007c }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007c }
            int r1 = r6 - r2
            int r2 = r10.f15111j     // Catch:{ all -> 0x007c }
            r5 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r5
        L_0x0027:
            int r2 = r10.f15112k     // Catch:{ all -> 0x007c }
            if (r6 >= r2) goto L_0x007a
            java.util.concurrent.Semaphore r2 = r10.f15108g     // Catch:{ all -> 0x007c }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x0034
            goto L_0x007a
        L_0x0034:
            long r6 = r10.controlState     // Catch:{ all -> 0x007c }
            long r6 = r6 & r3
            int r2 = (int) r6     // Catch:{ all -> 0x007c }
            r6 = 1
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0044
            kotlinx.coroutines.d3.a$b[] r7 = r10.f15109h     // Catch:{ all -> 0x007c }
            r7 = r7[r2]     // Catch:{ all -> 0x007c }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x006e
            kotlinx.coroutines.d3.a$b r7 = new kotlinx.coroutines.d3.a$b     // Catch:{ all -> 0x007c }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x007c }
            r7.start()     // Catch:{ all -> 0x007c }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f15100o     // Catch:{ all -> 0x007c }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007c }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007c }
            if (r2 != r4) goto L_0x005a
            r5 = 1
        L_0x005a:
            if (r5 == 0) goto L_0x0062
            kotlinx.coroutines.d3.a$b[] r3 = r10.f15109h     // Catch:{ all -> 0x007c }
            r3[r2] = r7     // Catch:{ all -> 0x007c }
            int r1 = r1 + r6
            goto L_0x000a
        L_0x0062:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r2     // Catch:{ all -> 0x007c }
        L_0x006e:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007c }
            r2.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r2     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)
            return r5
        L_0x007c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p331d3.C6048a.m22754i():int");
    }

    /* access modifiers changed from: private */
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    /* renamed from: l */
    private final C6050b m22757l() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C6050b)) {
            currentThread = null;
        }
        C6050b bVar = (C6050b) currentThread;
        if (bVar == null || !C5942k.m22326a((Object) bVar.mo15787e(), (Object) this)) {
            return null;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final int m22758m() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: o */
    private final C6050b m22759o() {
        while (true) {
            long j = this.parkedWorkersStack;
            C6050b bVar = this.f15109h[(int) (2097151 & j)];
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int a = m22733a(bVar);
            if (a >= 0) {
                if (f15099n.compareAndSet(this, j, ((long) a) | j2)) {
                    bVar.mo15781a((Object) f15106u);
                    return bVar;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m22760p() {
        if (this.f15108g.availablePermits() == 0) {
            m22761q();
        } else if (!m22761q()) {
            long j = this.controlState;
            if (((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)) < this.f15111j) {
                int i = m22754i();
                if (i == 1 && this.f15111j > 1) {
                    m22754i();
                }
                if (i > 0) {
                    return;
                }
            }
            m22761q();
        }
    }

    /* renamed from: q */
    private final boolean m22761q() {
        while (true) {
            C6050b o = m22759o();
            if (o == null) {
                return false;
            }
            o.mo15788f();
            boolean h = o.mo15791h();
            LockSupport.unpark(o);
            if (h && o.mo15793j()) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public final C6059i mo15773a(Runnable runnable, C6060j jVar) {
        C5942k.m22327b(runnable, "block");
        C5942k.m22327b(jVar, "taskContext");
        long a = C6063m.f15156f.mo15805a();
        if (!(runnable instanceof C6059i)) {
            return new C6061k(runnable, a, jVar);
        }
        C6059i iVar = (C6059i) runnable;
        iVar.f15145f = a;
        iVar.f15146g = jVar;
        return iVar;
    }

    /* renamed from: a */
    public final void mo15774a(Runnable runnable, C6060j jVar, boolean z) {
        C5942k.m22327b(runnable, "block");
        C5942k.m22327b(jVar, "taskContext");
        C6206v2 a = C6210w2.m23278a();
        if (a != null) {
            a.mo15984e();
        }
        C6059i a2 = mo15773a(runnable, jVar);
        int a3 = m22735a(a2, z);
        if (a3 == -1) {
            return;
        }
        if (a3 == 1 && !this.f15107f.mo15914a(a2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15114m);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
        m22760p();
    }

    public void close() {
        mo15776d(10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r9 != null) goto L_0x0075;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15776d(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f15101p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.d3.a$b r0 = r8.m22757l()
            kotlinx.coroutines.d3.a$b[] r3 = r8.f15109h
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00a3 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x005f
            r3 = 1
        L_0x001d:
            kotlinx.coroutines.d3.a$b[] r4 = r8.f15109h
            r4 = r4[r3]
            if (r4 == 0) goto L_0x005a
            if (r4 == r0) goto L_0x0055
        L_0x0025:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0032
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L_0x0025
        L_0x0032:
            kotlinx.coroutines.d3.a$c r6 = r4.getState()
            boolean r7 = kotlinx.coroutines.C6157l0.m23149a()
            if (r7 == 0) goto L_0x004c
            kotlinx.coroutines.d3.a$c r7 = kotlinx.coroutines.p331d3.C6048a.C6051c.TERMINATED
            if (r6 != r7) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x004c:
            kotlinx.coroutines.d3.o r4 = r4.mo15785c()
            kotlinx.coroutines.d3.e r6 = r8.f15107f
            r4.mo15810a(r6)
        L_0x0055:
            if (r3 == r5) goto L_0x005f
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005a:
            p308k.p323z.p325d.C5942k.m22323a()
            r9 = 0
            throw r9
        L_0x005f:
            kotlinx.coroutines.d3.e r9 = r8.f15107f
            r9.mo15913a()
        L_0x0064:
            if (r0 == 0) goto L_0x006d
            kotlinx.coroutines.d3.i r9 = r0.mo15780a()
            if (r9 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            kotlinx.coroutines.d3.e r9 = r8.f15107f
            java.lang.Object r9 = r9.mo15916c()
            kotlinx.coroutines.d3.i r9 = (kotlinx.coroutines.p331d3.C6059i) r9
        L_0x0075:
            if (r9 == 0) goto L_0x007b
            r8.m22741a(r9)
            goto L_0x0064
        L_0x007b:
            if (r0 == 0) goto L_0x0082
            kotlinx.coroutines.d3.a$c r9 = kotlinx.coroutines.p331d3.C6048a.C6051c.TERMINATED
            r0.mo15782a(r9)
        L_0x0082:
            boolean r9 = kotlinx.coroutines.C6157l0.m23149a()
            if (r9 == 0) goto L_0x009c
            java.util.concurrent.Semaphore r9 = r8.f15108g
            int r9 = r9.availablePermits()
            int r10 = r8.f15111j
            if (r9 != r10) goto L_0x0093
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x009c:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00a3:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p331d3.C6048a.mo15776d(long):void");
    }

    public void execute(Runnable runnable) {
        C5942k.m22327b(runnable, "command");
        m22737a(this, runnable, null, false, 6, null);
    }

    public String toString() {
        C6050b[] bVarArr;
        String str;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C6050b bVar : this.f15109h) {
            if (bVar != null) {
                int c = bVar.mo15785c().mo15815c();
                int i6 = C6052b.f15129a[bVar.getState().ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        i2++;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        str = "b";
                    } else if (i6 == 3) {
                        i++;
                        sb = new StringBuilder();
                        sb.append(String.valueOf(c));
                        str = "c";
                    } else if (i6 == 4) {
                        i4++;
                        if (c > 0) {
                            sb = new StringBuilder();
                            sb.append(String.valueOf(c));
                            str = "r";
                        }
                    } else if (i6 == 5) {
                        i5++;
                    }
                    sb.append(str);
                    arrayList.add(sb.toString());
                } else {
                    i3++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15114m);
        sb2.append('@');
        sb2.append(C6161m0.m23159b(this));
        sb2.append('[');
        sb2.append("Pool Size {");
        sb2.append("core = ");
        sb2.append(this.f15111j);
        String str2 = ", ";
        sb2.append(str2);
        sb2.append("max = ");
        sb2.append(this.f15112k);
        String str3 = "}, ";
        sb2.append(str3);
        sb2.append("Worker States {");
        sb2.append("CPU = ");
        sb2.append(i);
        sb2.append(str2);
        String str4 = "blocking = ";
        sb2.append(str4);
        sb2.append(i2);
        sb2.append(str2);
        sb2.append("parked = ");
        sb2.append(i3);
        sb2.append(str2);
        sb2.append("retired = ");
        sb2.append(i4);
        sb2.append(str2);
        sb2.append("terminated = ");
        sb2.append(i5);
        sb2.append(str3);
        sb2.append("running workers queues = ");
        sb2.append(arrayList);
        sb2.append(str2);
        sb2.append("global queue size = ");
        sb2.append(this.f15107f.mo15915b());
        sb2.append(str2);
        sb2.append("Control State Workers {");
        sb2.append("created = ");
        sb2.append((int) (2097151 & j));
        sb2.append(str2);
        sb2.append(str4);
        sb2.append((int) ((j & 4398044413952L) >> 21));
        sb2.append('}');
        sb2.append("]");
        return sb2.toString();
    }
}
