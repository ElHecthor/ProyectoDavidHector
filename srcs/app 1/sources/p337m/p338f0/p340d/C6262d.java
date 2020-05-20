package p337m.p338f0.p340d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;

/* renamed from: m.f0.d.d */
public final class C6262d {

    /* renamed from: h */
    public static final C6262d f15453h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Logger f15454i;

    /* renamed from: j */
    public static final C6264b f15455j = new C6264b(null);

    /* renamed from: a */
    private int f15456a = 10000;

    /* renamed from: b */
    private boolean f15457b;

    /* renamed from: c */
    private long f15458c;

    /* renamed from: d */
    private final List<C6261c> f15459d = new ArrayList();

    /* renamed from: e */
    private final List<C6261c> f15460e = new ArrayList();

    /* renamed from: f */
    private final Runnable f15461f = new C6266d(this);

    /* renamed from: g */
    private final C6263a f15462g;

    /* renamed from: m.f0.d.d$a */
    public interface C6263a {
        /* renamed from: a */
        long mo16132a();

        /* renamed from: a */
        void mo16133a(C6262d dVar);

        /* renamed from: a */
        void mo16134a(C6262d dVar, long j);

        void execute(Runnable runnable);
    }

    /* renamed from: m.f0.d.d$b */
    public static final class C6264b {
        private C6264b() {
        }

        public /* synthetic */ C6264b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Logger mo16136a() {
            return C6262d.f15454i;
        }
    }

    /* renamed from: m.f0.d.d$c */
    public static final class C6265c implements C6263a {

        /* renamed from: a */
        private final ThreadPoolExecutor f15463a;

        public C6265c(ThreadFactory threadFactory) {
            C5942k.m22327b(threadFactory, "threadFactory");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
            this.f15463a = threadPoolExecutor;
        }

        /* renamed from: a */
        public long mo16132a() {
            return System.nanoTime();
        }

        /* renamed from: a */
        public void mo16133a(C6262d dVar) {
            C5942k.m22327b(dVar, "taskRunner");
            dVar.notify();
        }

        /* renamed from: a */
        public void mo16134a(C6262d dVar, long j) {
            C5942k.m22327b(dVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                dVar.wait(j2, (int) j3);
            }
        }

        public void execute(Runnable runnable) {
            C5942k.m22327b(runnable, "runnable");
            this.f15463a.execute(runnable);
        }
    }

    /* renamed from: m.f0.d.d$d */
    public static final class C6266d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6262d f15464f;

        C6266d(C6262d dVar) {
            this.f15464f = dVar;
        }

        public void run() {
            C6259a a;
            while (true) {
                synchronized (this.f15464f) {
                    a = this.f15464f.mo16128a();
                }
                if (a != null) {
                    C6261c d = a.mo16111d();
                    if (d != null) {
                        long j = -1;
                        boolean isLoggable = C6262d.f15455j.mo16136a().isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = d.mo16125h().mo16130b().mo16132a();
                            C6260b.m23502b(a, d, "starting");
                        }
                        try {
                            this.f15464f.m23520b(a);
                            C5812t tVar = C5812t.f14872a;
                            if (isLoggable) {
                                long a2 = d.mo16125h().mo16130b().mo16132a() - j;
                                StringBuilder sb = new StringBuilder();
                                sb.append("finished run in ");
                                sb.append(C6260b.m23500a(a2));
                                C6260b.m23502b(a, d, sb.toString());
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                long a3 = d.mo16125h().mo16130b().mo16132a() - j;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("failed a run in ");
                                sb2.append(C6260b.m23500a(a3));
                                C6260b.m23502b(a, d, sb2.toString());
                            }
                            throw th;
                        }
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C6250b.f15422h);
        sb.append(" TaskRunner");
        f15453h = new C6262d(new C6265c(C6250b.m23453a(sb.toString(), true)));
        Logger logger = Logger.getLogger(C6262d.class.getName());
        C5942k.m22324a((Object) logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f15454i = logger;
    }

    public C6262d(C6263a aVar) {
        C5942k.m22327b(aVar, "backend");
        this.f15462g = aVar;
    }

    /* renamed from: a */
    private final void m23517a(C6259a aVar) {
        if (!C6250b.f15421g || Thread.holdsLock(this)) {
            aVar.mo16106a(-1);
            C6261c d = aVar.mo16111d();
            if (d != null) {
                d.mo16122e().remove(aVar);
                this.f15460e.remove(d);
                d.mo16115a(aVar);
                this.f15459d.add(d);
                return;
            }
            C5942k.m22323a();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    private final void m23518a(C6259a aVar, long j) {
        if (!C6250b.f15421g || Thread.holdsLock(this)) {
            C6261c d = aVar.mo16111d();
            if (d != null) {
                if (d.mo16120c() == aVar) {
                    boolean d2 = d.mo16121d();
                    d.mo16117a(false);
                    d.mo16115a((C6259a) null);
                    this.f15459d.remove(d);
                    if (j != -1 && !d2 && !d.mo16124g()) {
                        d.mo16118a(aVar, j, true);
                    }
                    if (!d.mo16122e().isEmpty()) {
                        this.f15460e.add(d);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            C5942k.m22323a();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23520b(C6259a aVar) {
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.mo16109b());
            try {
                long e = aVar.mo16112e();
                synchronized (this) {
                    m23518a(aVar, e);
                    C5812t tVar = C5812t.f14872a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    m23518a(aVar, -1);
                    C5812t tVar2 = C5812t.f14872a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            C5942k.m22324a((Object) currentThread2, "Thread.currentThread()");
            sb.append(currentThread2.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: e */
    private final void m23522e() {
        for (int size = this.f15459d.size() - 1; size >= 0; size--) {
            ((C6261c) this.f15460e.get(size)).mo16119b();
        }
        for (int size2 = this.f15460e.size() - 1; size2 >= 0; size2--) {
            C6261c cVar = (C6261c) this.f15460e.get(size2);
            cVar.mo16119b();
            if (cVar.mo16122e().isEmpty()) {
                this.f15460e.remove(size2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:34|35|36|39|40|47|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r15.f15457b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p337m.p338f0.p340d.C6259a mo16128a() {
        /*
            r15 = this;
            boolean r0 = p337m.p338f0.C6250b.f15421g
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r15)
            if (r0 == 0) goto L_0x000b
            goto L_0x0037
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.util.List<m.f0.d.c> r0 = r15.f15460e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            return r1
        L_0x0041:
            m.f0.d.d$a r0 = r15.f15462g
            long r2 = r0.mo16132a()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<m.f0.d.c> r0 = r15.f15460e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x0053:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0085
            java.lang.Object r7 = r0.next()
            m.f0.d.c r7 = (p337m.p338f0.p340d.C6261c) r7
            java.util.List r7 = r7.mo16122e()
            java.lang.Object r7 = r7.get(r9)
            m.f0.d.a r7 = (p337m.p338f0.p340d.C6259a) r7
            long r10 = r7.mo16110c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x007f
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x0053
        L_0x007f:
            if (r6 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0086
        L_0x0083:
            r6 = r7
            goto L_0x0053
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r6 == 0) goto L_0x00a2
            r15.m23517a(r6)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r15.f15457b
            if (r0 != 0) goto L_0x00a1
            java.util.List<m.f0.d.c> r0 = r15.f15460e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00a1
        L_0x009a:
            m.f0.d.d$a r0 = r15.f15462g
            java.lang.Runnable r1 = r15.f15461f
            r0.execute(r1)
        L_0x00a1:
            return r6
        L_0x00a2:
            boolean r0 = r15.f15457b
            if (r0 == 0) goto L_0x00b3
            long r6 = r15.f15458c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            m.f0.d.d$a r0 = r15.f15462g
            r0.mo16133a(r15)
        L_0x00b2:
            return r1
        L_0x00b3:
            r15.f15457b = r8
            long r2 = r2 + r4
            r15.f15458c = r2
            m.f0.d.d$a r0 = r15.f15462g     // Catch:{ InterruptedException -> 0x00c3 }
            r0.mo16134a(r15, r4)     // Catch:{ InterruptedException -> 0x00c3 }
        L_0x00bd:
            r15.f15457b = r9
            goto L_0x0037
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c3:
            r15.m23522e()     // Catch:{ all -> 0x00c1 }
            goto L_0x00bd
        L_0x00c7:
            r15.f15457b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p340d.C6262d.mo16128a():m.f0.d.a");
    }

    /* renamed from: a */
    public final void mo16129a(C6261c cVar) {
        C5942k.m22327b(cVar, "taskQueue");
        if (!C6250b.f15421g || Thread.holdsLock(this)) {
            if (cVar.mo16120c() == null) {
                if (!cVar.mo16122e().isEmpty()) {
                    C6250b.m23459a(this.f15460e, cVar);
                } else {
                    this.f15460e.remove(cVar);
                }
            }
            if (this.f15457b) {
                this.f15462g.mo16133a(this);
            } else {
                this.f15462g.execute(this.f15461f);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: b */
    public final C6263a mo16130b() {
        return this.f15462g;
    }

    /* renamed from: c */
    public final C6261c mo16131c() {
        int i;
        synchronized (this) {
            i = this.f15456a;
            this.f15456a = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new C6261c(this, sb.toString());
    }
}
