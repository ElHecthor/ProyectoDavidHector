package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6184r0.C6185a;
import kotlinx.coroutines.internal.C6105c0;
import kotlinx.coroutines.internal.C6107d0;
import kotlinx.coroutines.internal.C6128m;
import p308k.C5809q;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.e1 */
public abstract class C6069e1 extends C6086f1 implements C6184r0 {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f15163i;

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f15164j;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.e1$a */
    private static final class C6070a extends C6071b {

        /* renamed from: i */
        private final Runnable f15165i;

        public C6070a(long j, Runnable runnable) {
            C5942k.m22327b(runnable, "block");
            super(j);
            this.f15165i = runnable;
        }

        public void run() {
            this.f15165i.run();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.f15165i.toString());
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.e1$b */
    public static abstract class C6071b implements Runnable, Comparable<C6071b>, C5959a1, C6107d0 {

        /* renamed from: f */
        private Object f15166f;

        /* renamed from: g */
        private int f15167g = -1;

        /* renamed from: h */
        public long f15168h;

        public C6071b(long j) {
            this.f15168h = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x004a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized int mo15830a(long r8, kotlinx.coroutines.C6069e1.C6072c r10, kotlinx.coroutines.C6069e1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.String r0 = "delayed"
                p308k.p323z.p325d.C5942k.m22327b(r10, r0)     // Catch:{ all -> 0x0057 }
                java.lang.String r0 = "eventLoop"
                p308k.p323z.p325d.C5942k.m22327b(r11, r0)     // Catch:{ all -> 0x0057 }
                java.lang.Object r0 = r7.f15166f     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.internal.v r1 = kotlinx.coroutines.C6094h1.f15185a     // Catch:{ all -> 0x0057 }
                if (r0 != r1) goto L_0x0016
                r8 = 2
            L_0x0014:
                monitor-exit(r7)
                return r8
            L_0x0016:
                monitor-enter(r10)     // Catch:{ all -> 0x0057 }
                kotlinx.coroutines.internal.d0 r0 = r10.mo15868a()     // Catch:{ all -> 0x0054 }
                kotlinx.coroutines.e1$b r0 = (kotlinx.coroutines.C6069e1.C6071b) r0     // Catch:{ all -> 0x0054 }
                boolean r11 = r11.isCompleted     // Catch:{ all -> 0x0054 }
                if (r11 == 0) goto L_0x0027
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                monitor-exit(r7)
                return r8
            L_0x0027:
                r1 = 0
                if (r0 != 0) goto L_0x002e
            L_0x002b:
                r10.f15169b = r8     // Catch:{ all -> 0x0054 }
                goto L_0x0041
            L_0x002e:
                long r3 = r0.f15168h     // Catch:{ all -> 0x0054 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x0037
                goto L_0x0038
            L_0x0037:
                r8 = r3
            L_0x0038:
                long r3 = r10.f15169b     // Catch:{ all -> 0x0054 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0041
                goto L_0x002b
            L_0x0041:
                long r8 = r7.f15168h     // Catch:{ all -> 0x0054 }
                long r3 = r10.f15169b     // Catch:{ all -> 0x0054 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x004e
                long r8 = r10.f15169b     // Catch:{ all -> 0x0054 }
                r7.f15168h = r8     // Catch:{ all -> 0x0054 }
            L_0x004e:
                r10.mo15870a(r7)     // Catch:{ all -> 0x0054 }
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                r8 = 0
                goto L_0x0014
            L_0x0054:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x0057 }
                throw r8     // Catch:{ all -> 0x0057 }
            L_0x0057:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6069e1.C6071b.mo15830a(long, kotlinx.coroutines.e1$c, kotlinx.coroutines.e1):int");
        }

        /* renamed from: a */
        public int compareTo(C6071b bVar) {
            C5942k.m22327b(bVar, "other");
            int i = ((this.f15168h - bVar.f15168h) > 0 ? 1 : ((this.f15168h - bVar.f15168h) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: a */
        public void mo15832a(int i) {
            this.f15167g = i;
        }

        /* renamed from: a */
        public void mo15833a(C6105c0<?> c0Var) {
            if (this.f15166f != C6094h1.f15185a) {
                this.f15166f = c0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public final boolean mo15834a(long j) {
            return j - this.f15168h >= 0;
        }

        /* renamed from: f */
        public final synchronized void mo15639f() {
            Object obj = this.f15166f;
            if (obj != C6094h1.f15185a) {
                if (!(obj instanceof C6072c)) {
                    obj = null;
                }
                C6072c cVar = (C6072c) obj;
                if (cVar != null) {
                    cVar.mo15872b(this);
                }
                this.f15166f = C6094h1.f15185a;
            }
        }

        /* renamed from: g */
        public int mo15836g() {
            return this.f15167g;
        }

        /* renamed from: h */
        public C6105c0<?> mo15837h() {
            Object obj = this.f15166f;
            if (!(obj instanceof C6105c0)) {
                obj = null;
            }
            return (C6105c0) obj;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Delayed[nanos=");
            sb.append(this.f15168h);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.e1$c */
    public static final class C6072c extends C6105c0<C6071b> {

        /* renamed from: b */
        public long f15169b;

        public C6072c(long j) {
            this.f15169b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C6069e1> cls2 = C6069e1.class;
        f15163i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f15164j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: A */
    private final Runnable m22832A() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C6128m) {
                if (obj != null) {
                    C6128m mVar = (C6128m) obj;
                    Object e = mVar.mo15922e();
                    if (e != C6128m.f15232g) {
                        return (Runnable) e;
                    }
                    f15163i.compareAndSet(this, obj, mVar.mo15921d());
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C6094h1.f15186b) {
                return null;
            } else {
                if (f15163i.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: B */
    private final void m22833B() {
        C6206v2 a = C6210w2.m23278a();
        long a2 = a != null ? a.mo15977a() : System.nanoTime();
        while (true) {
            C6072c cVar = (C6072c) this._delayed;
            if (cVar != null) {
                C6071b bVar = (C6071b) cVar.mo15875e();
                if (bVar != null) {
                    mo15854a(a2, bVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m22834a(C6071b bVar) {
        C6072c cVar = (C6072c) this._delayed;
        return (cVar != null ? (C6071b) cVar.mo15874d() : null) == bVar;
    }

    /* renamed from: b */
    private final boolean m22836b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f15163i.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C6128m) {
                if (obj != null) {
                    C6128m mVar = (C6128m) obj;
                    int a = mVar.mo15917a(runnable);
                    if (a == 0) {
                        return true;
                    }
                    if (a == 1) {
                        f15163i.compareAndSet(this, obj, mVar.mo15921d());
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C6094h1.f15186b) {
                return false;
            } else {
                C6128m mVar2 = new C6128m(8, true);
                if (obj != null) {
                    mVar2.mo15917a((Runnable) obj);
                    mVar2.mo15917a(runnable);
                    if (f15163i.compareAndSet(this, obj, mVar2)) {
                        return true;
                    }
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: c */
    private final int m22837c(long j, C6071b bVar) {
        if (this.isCompleted) {
            return 1;
        }
        C6072c cVar = (C6072c) this._delayed;
        if (cVar == null) {
            f15164j.compareAndSet(this, null, new C6072c(j));
            Object obj = this._delayed;
            if (obj != null) {
                cVar = (C6072c) obj;
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
        return bVar.mo15830a(j, cVar, this);
    }

    /* renamed from: z */
    private final void m22838z() {
        if (!C6157l0.m23149a() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f15163i.compareAndSet(this, null, C6094h1.f15186b)) {
                        return;
                    }
                } else if (obj instanceof C6128m) {
                    ((C6128m) obj).mo15918a();
                    return;
                } else if (obj != C6094h1.f15186b) {
                    C6128m mVar = new C6128m(8, true);
                    if (obj != null) {
                        mVar.mo15917a((Runnable) obj);
                        if (f15163i.compareAndSet(this, obj, mVar)) {
                            return;
                        }
                    } else {
                        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C5959a1 mo15710a(long j, Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        return C6185a.m23205a(this, j, runnable);
    }

    /* renamed from: a */
    public final void mo15823a(Runnable runnable) {
        C5942k.m22327b(runnable, "task");
        if (m22836b(runnable)) {
            mo15855w();
        } else {
            C6165n0.f15278l.mo15823a(runnable);
        }
    }

    /* renamed from: a */
    public final void mo15711a(C5871g gVar, Runnable runnable) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        mo15823a(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5959a1 mo15824b(long j, Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        long a = C6094h1.m22910a(j);
        if (a >= 4611686018427387903L) {
            return C6095h2.f15187f;
        }
        C6206v2 a2 = C6210w2.m23278a();
        long a3 = a2 != null ? a2.mo15977a() : System.nanoTime();
        C6070a aVar = new C6070a(a + a3, runnable);
        mo15825b(a3, (C6071b) aVar);
        return aVar;
    }

    /* renamed from: b */
    public final void mo15825b(long j, C6071b bVar) {
        C5942k.m22327b(bVar, "delayedTask");
        int c = m22837c(j, bVar);
        if (c != 0) {
            if (c == 1) {
                mo15854a(j, bVar);
            } else if (c != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m22834a(bVar)) {
            mo15855w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public long mo15766o() {
        if (super.mo15766o() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C6128m)) {
                return obj == C6094h1.f15186b ? Long.MAX_VALUE : 0;
            }
            if (!((C6128m) obj).mo15920c()) {
                return 0;
            }
        }
        C6072c cVar = (C6072c) this._delayed;
        if (cVar != null) {
            C6071b bVar = (C6071b) cVar.mo15874d();
            if (bVar != null) {
                long j = bVar.f15168h;
                C6206v2 a = C6210w2.m23278a();
                return C5736g.m21868a(j - (a != null ? a.mo15977a() : System.nanoTime()), 0);
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo15769s() {
        /*
            r7 = this;
            boolean r0 = r7.mo15771t()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.mo15766o()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.e1$c r0 = (kotlinx.coroutines.C6069e1.C6072c) r0
            if (r0 == 0) goto L_0x004d
            boolean r1 = r0.mo15873c()
            if (r1 != 0) goto L_0x004d
            kotlinx.coroutines.v2 r1 = kotlinx.coroutines.C6210w2.m23278a()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.mo15977a()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            kotlinx.coroutines.internal.d0 r3 = r0.mo15868a()     // Catch:{ all -> 0x004a }
            r4 = 0
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.e1$b r3 = (kotlinx.coroutines.C6069e1.C6071b) r3     // Catch:{ all -> 0x004a }
            boolean r5 = r3.mo15834a(r1)     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r3 = r7.m22836b(r3)     // Catch:{ all -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.internal.d0 r3 = r0.mo15869a(r6)     // Catch:{ all -> 0x004a }
            r4 = r3
        L_0x0044:
            monitor-exit(r0)
            kotlinx.coroutines.e1$b r4 = (kotlinx.coroutines.C6069e1.C6071b) r4
            if (r4 == 0) goto L_0x004d
            goto L_0x0026
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r7.m22832A()
            if (r0 == 0) goto L_0x0056
            r0.run()
        L_0x0056:
            long r0 = r7.mo15766o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6069e1.mo15769s():long");
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        C6202u2.f15311b.mo15970c();
        this.isCompleted = true;
        m22838z();
        do {
        } while (mo15769s() <= 0);
        m22833B();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == kotlinx.coroutines.C6094h1.m22911a()) goto L_0x001a;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo15826x() {
        /*
            r4 = this;
            boolean r0 = r4.mo15768q()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.e1$c r0 = (kotlinx.coroutines.C6069e1.C6072c) r0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo15873c()
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.Object r0 = r4._queue
            r2 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x002e
        L_0x001c:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.C6128m
            if (r3 == 0) goto L_0x0027
            kotlinx.coroutines.internal.m r0 = (kotlinx.coroutines.internal.C6128m) r0
            boolean r1 = r0.mo15920c()
            goto L_0x002e
        L_0x0027:
            kotlinx.coroutines.internal.v r3 = kotlinx.coroutines.C6094h1.f15186b
            if (r0 != r3) goto L_0x002e
            goto L_0x001a
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6069e1.mo15826x():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo15827y() {
        this._queue = null;
        this._delayed = null;
    }
}
