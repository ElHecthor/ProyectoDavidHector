package p337m.p338f0.p344h;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p337m.C6445s;
import p337m.p338f0.C6250b;
import p350n.C6475d;
import p350n.C6480e;
import p350n.C6484g;
import p350n.C6504w;
import p350n.C6506y;
import p350n.C6507z;

/* renamed from: m.f0.h.i */
public final class C6348i {

    /* renamed from: a */
    private long f15754a;

    /* renamed from: b */
    private long f15755b;

    /* renamed from: c */
    private long f15756c;

    /* renamed from: d */
    private long f15757d;

    /* renamed from: e */
    private final ArrayDeque<C6445s> f15758e = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f15759f;

    /* renamed from: g */
    private final C6351c f15760g;

    /* renamed from: h */
    private final C6350b f15761h;

    /* renamed from: i */
    private final C6352d f15762i;

    /* renamed from: j */
    private final C6352d f15763j;

    /* renamed from: k */
    private C6315b f15764k;

    /* renamed from: l */
    private IOException f15765l;

    /* renamed from: m */
    private final int f15766m;

    /* renamed from: n */
    private final C6323f f15767n;

    /* renamed from: m.f0.h.i$a */
    public static final class C6349a {
        private C6349a() {
        }

        public /* synthetic */ C6349a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: m.f0.h.i$b */
    public final class C6350b implements C6504w {

        /* renamed from: f */
        private final C6480e f15768f = new C6480e();

        /* renamed from: g */
        private C6445s f15769g;

        /* renamed from: h */
        private boolean f15770h;

        /* renamed from: i */
        private boolean f15771i;

        public C6350b(boolean z) {
            this.f15771i = z;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private final void m23957a(boolean z) {
            long min;
            boolean z2;
            synchronized (C6348i.this) {
                C6348i.this.mo16389o().mo16771g();
                while (C6348i.this.mo16388n() >= C6348i.this.mo16387m() && !this.f15771i && !this.f15770h && C6348i.this.mo16377d() == null) {
                    try {
                        C6348i.this.mo16394t();
                    } catch (Throwable th) {
                        C6348i.this.mo16389o().mo16404m();
                        throw th;
                    }
                }
                C6348i.this.mo16389o().mo16404m();
                C6348i.this.mo16372b();
                min = Math.min(C6348i.this.mo16387m() - C6348i.this.mo16388n(), this.f15768f.mo16834x());
                C6348i iVar = C6348i.this;
                iVar.mo16378d(iVar.mo16388n() + min);
                z2 = z && min == this.f15768f.mo16834x() && C6348i.this.mo16377d() == null;
                C5812t tVar = C5812t.f14872a;
            }
            C6348i.this.mo16389o().mo16771g();
            try {
                C6348i.this.mo16375c().mo16301a(C6348i.this.mo16380f(), z2, this.f15768f, min);
            } finally {
                C6348i.this.mo16389o().mo16404m();
            }
        }

        /* renamed from: a */
        public void mo16159a(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "source");
            C6348i iVar = C6348i.this;
            if (!C6250b.f15421g || !Thread.holdsLock(iVar)) {
                this.f15768f.mo16159a(eVar, j);
                while (this.f15768f.mo16834x() >= 16384) {
                    m23957a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: a */
        public final boolean mo16396a() {
            return this.f15770h;
        }

        /* renamed from: b */
        public C6507z mo16272b() {
            return C6348i.this.mo16389o();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.f15772j.mo16385k().f15771i != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.f15768f.mo16834x() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.f15769g == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            if (r4 == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            if (r10.f15768f.mo16834x() <= 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            m23957a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = r10.f15772j.mo16375c();
            r2 = r10.f15772j.mo16380f();
            r4 = r10.f15769g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
            if (r4 == null) goto L_0x009a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
            r0.mo16300a(r2, r1, p337m.p338f0.C6250b.m23450a(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
            p308k.p323z.p325d.C5942k.m22323a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
            if (r0 == false) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
            if (r10.f15768f.mo16834x() <= 0) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
            m23957a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
            if (r1 == false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
            r10.f15772j.mo16375c().mo16301a(r10.f15772j.mo16380f(), true, (p350n.C6480e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
            r0 = r10.f15772j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r10.f15770h = true;
            r1 = p308k.C5812t.f14872a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
            r10.f15772j.mo16375c().flush();
            r10.f15772j.mo16366a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                boolean r1 = p337m.p338f0.C6250b.f15421g
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                p308k.p323z.p325d.C5942k.m22324a(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                monitor-enter(r0)
                boolean r1 = r10.f15770h     // Catch:{ all -> 0x00de }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                m.f0.h.i r1 = p337m.p338f0.p344h.C6348i.this     // Catch:{ all -> 0x00de }
                m.f0.h.b r1 = r1.mo16377d()     // Catch:{ all -> 0x00de }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                k.t r4 = p308k.C5812t.f14872a     // Catch:{ all -> 0x00de }
                monitor-exit(r0)
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                m.f0.h.i$b r0 = r0.mo16385k()
                boolean r0 = r0.f15771i
                if (r0 != 0) goto L_0x00c4
                n.e r0 = r10.f15768f
                long r4 = r0.mo16834x()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = 1
                goto L_0x006b
            L_0x006a:
                r0 = 0
            L_0x006b:
                m.s r4 = r10.f15769g
                if (r4 == 0) goto L_0x0071
                r4 = 1
                goto L_0x0072
            L_0x0071:
                r4 = 0
            L_0x0072:
                if (r4 == 0) goto L_0x009f
            L_0x0074:
                n.e r0 = r10.f15768f
                long r4 = r0.mo16834x()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r10.m23957a(r2)
                goto L_0x0074
            L_0x0082:
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                m.f0.h.f r0 = r0.mo16375c()
                m.f0.h.i r2 = p337m.p338f0.p344h.C6348i.this
                int r2 = r2.mo16380f()
                m.s r4 = r10.f15769g
                if (r4 == 0) goto L_0x009a
                java.util.List r4 = p337m.p338f0.C6250b.m23450a(r4)
                r0.mo16300a(r2, r1, r4)
                goto L_0x00c4
            L_0x009a:
                p308k.p323z.p325d.C5942k.m22323a()
                r0 = 0
                throw r0
            L_0x009f:
                if (r0 == 0) goto L_0x00af
            L_0x00a1:
                n.e r0 = r10.f15768f
                long r0 = r0.mo16834x()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x00c4
                r10.m23957a(r3)
                goto L_0x00a1
            L_0x00af:
                if (r1 == 0) goto L_0x00c4
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                m.f0.h.f r4 = r0.mo16375c()
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                int r5 = r0.mo16380f()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.mo16301a(r5, r6, r7, r8)
            L_0x00c4:
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                monitor-enter(r0)
                r10.f15770h = r3     // Catch:{ all -> 0x00db }
                k.t r1 = p308k.C5812t.f14872a     // Catch:{ all -> 0x00db }
                monitor-exit(r0)
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                m.f0.h.f r0 = r0.mo16375c()
                r0.flush()
                m.f0.h.i r0 = p337m.p338f0.p344h.C6348i.this
                r0.mo16366a()
                return
            L_0x00db:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00de:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6348i.C6350b.close():void");
        }

        /* renamed from: d */
        public final boolean mo16397d() {
            return this.f15771i;
        }

        public void flush() {
            C6348i iVar = C6348i.this;
            if (!C6250b.f15421g || !Thread.holdsLock(iVar)) {
                synchronized (C6348i.this) {
                    C6348i.this.mo16372b();
                    C5812t tVar = C5812t.f14872a;
                }
                while (this.f15768f.mo16834x() > 0) {
                    m23957a(false);
                    C6348i.this.mo16375c().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: m.f0.h.i$c */
    public final class C6351c implements C6506y {

        /* renamed from: f */
        private final C6480e f15773f = new C6480e();

        /* renamed from: g */
        private final C6480e f15774g = new C6480e();

        /* renamed from: h */
        private boolean f15775h;

        /* renamed from: i */
        private final long f15776i;

        /* renamed from: j */
        private boolean f15777j;

        public C6351c(long j, boolean z) {
            this.f15776i = j;
            this.f15777j = z;
        }

        /* renamed from: d */
        private final void m23962d(long j) {
            C6348i iVar = C6348i.this;
            if (!C6250b.f15421g || !Thread.holdsLock(iVar)) {
                C6348i.this.mo16375c().mo16319g(j);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: a */
        public final void mo16398a(C6445s sVar) {
        }

        /* renamed from: a */
        public final void mo16399a(C6484g gVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C5942k.m22327b(gVar, "source");
            C6348i iVar = C6348i.this;
            if (!C6250b.f15421g || !Thread.holdsLock(iVar)) {
                while (j > 0) {
                    synchronized (C6348i.this) {
                        z = this.f15777j;
                        z2 = true;
                        z3 = this.f15774g.mo16834x() + j > this.f15776i;
                        C5812t tVar = C5812t.f14872a;
                    }
                    if (z3) {
                        gVar.skip(j);
                        C6348i.this.mo16368a(C6315b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        gVar.skip(j);
                        return;
                    } else {
                        long b = gVar.mo16163b(this.f15773f, j);
                        if (b != -1) {
                            j -= b;
                            synchronized (C6348i.this) {
                                if (this.f15775h) {
                                    j2 = this.f15773f.mo16834x();
                                    this.f15773f.mo16797d();
                                } else {
                                    if (this.f15774g.mo16834x() != 0) {
                                        z2 = false;
                                    }
                                    this.f15774g.mo16780a((C6506y) this.f15773f);
                                    if (z2) {
                                        C6348i iVar2 = C6348i.this;
                                        if (iVar2 != null) {
                                            iVar2.notifyAll();
                                        } else {
                                            throw new C5809q("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                                C5812t tVar2 = C5812t.f14872a;
                            }
                            if (j2 > 0) {
                                m23962d(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(iVar);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: a */
        public final void mo16400a(boolean z) {
            this.f15777j = z;
        }

        /* renamed from: a */
        public final boolean mo16401a() {
            return this.f15775h;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            Throwable th;
            boolean z;
            long j2;
            C6480e eVar2 = eVar;
            long j3 = j;
            C5942k.m22327b(eVar2, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                while (true) {
                    synchronized (C6348i.this) {
                        C6348i.this.mo16383i().mo16771g();
                        try {
                            if (C6348i.this.mo16377d() != null) {
                                th = C6348i.this.mo16379e();
                                if (th == null) {
                                    C6315b d = C6348i.this.mo16377d();
                                    if (d != null) {
                                        th = new C6362n(d);
                                    } else {
                                        C5942k.m22323a();
                                        throw null;
                                    }
                                }
                            } else {
                                th = null;
                            }
                            if (!this.f15775h) {
                                if (this.f15774g.mo16834x() > j4) {
                                    j2 = this.f15774g.mo16163b(eVar2, Math.min(j3, this.f15774g.mo16834x()));
                                    C6348i iVar = C6348i.this;
                                    iVar.mo16376c(iVar.mo16382h() + j2);
                                    long h = C6348i.this.mo16382h() - C6348i.this.mo16381g();
                                    if (th == null && h >= ((long) (C6348i.this.mo16375c().mo16321i().mo16434b() / 2))) {
                                        C6348i.this.mo16375c().mo16295a(C6348i.this.mo16380f(), h);
                                        C6348i.this.mo16373b(C6348i.this.mo16382h());
                                    }
                                } else if (this.f15777j || th != null) {
                                    j2 = -1;
                                } else {
                                    C6348i.this.mo16394t();
                                    j2 = -1;
                                    z = true;
                                    C6348i.this.mo16383i().mo16404m();
                                    C5812t tVar = C5812t.f14872a;
                                }
                                z = false;
                                C6348i.this.mo16383i().mo16404m();
                                C5812t tVar2 = C5812t.f14872a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            C6348i.this.mo16383i().mo16404m();
                            throw th2;
                        }
                    }
                    if (z) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        m23962d(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        if (th == null) {
                            C5942k.m22323a();
                            throw null;
                        }
                        throw th;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j3);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }

        /* renamed from: b */
        public C6507z mo16270b() {
            return C6348i.this.mo16383i();
        }

        public void close() {
            long x;
            synchronized (C6348i.this) {
                this.f15775h = true;
                x = this.f15774g.mo16834x();
                this.f15774g.mo16797d();
                C6348i iVar = C6348i.this;
                if (iVar != null) {
                    iVar.notifyAll();
                    C5812t tVar = C5812t.f14872a;
                } else {
                    throw new C5809q("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (x > 0) {
                m23962d(x);
            }
            C6348i.this.mo16366a();
        }

        /* renamed from: d */
        public final boolean mo16402d() {
            return this.f15777j;
        }
    }

    /* renamed from: m.f0.h.i$d */
    public final class C6352d extends C6475d {
        public C6352d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public IOException mo16403b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo16195i() {
            C6348i.this.mo16368a(C6315b.CANCEL);
            C6348i.this.mo16375c().mo16326q();
        }

        /* renamed from: m */
        public final void mo16404m() {
            if (mo16772h()) {
                throw mo16403b(null);
            }
        }
    }

    static {
        new C6349a(null);
    }

    public C6348i(int i, C6323f fVar, boolean z, boolean z2, C6445s sVar) {
        C5942k.m22327b(fVar, "connection");
        this.f15766m = i;
        this.f15767n = fVar;
        this.f15757d = (long) fVar.mo16322l().mo16434b();
        this.f15760g = new C6351c((long) this.f15767n.mo16321i().mo16434b(), z2);
        this.f15761h = new C6350b(z);
        this.f15762i = new C6352d();
        this.f15763j = new C6352d();
        boolean p = mo16390p();
        if (sVar != null) {
            if (!p) {
                this.f15758e.add(sVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!p) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: b */
    private final boolean m23926b(C6315b bVar, IOException iOException) {
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f15764k != null) {
                    return false;
                }
                if (this.f15760g.mo16402d() && this.f15761h.mo16397d()) {
                    return false;
                }
                this.f15764k = bVar;
                this.f15765l = iOException;
                notifyAll();
                C5812t tVar = C5812t.f14872a;
                this.f15767n.mo16310c(this.f15766m);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final void mo16366a() {
        boolean z;
        boolean q;
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f15760g.mo16402d() && this.f15760g.mo16401a() && (this.f15761h.mo16397d() || this.f15761h.mo16396a());
                q = mo16391q();
                C5812t tVar = C5812t.f14872a;
            }
            if (z) {
                mo16369a(C6315b.CANCEL, (IOException) null);
            } else if (!q) {
                this.f15767n.mo16310c(this.f15766m);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo16367a(long j) {
        this.f15757d += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo16368a(C6315b bVar) {
        C5942k.m22327b(bVar, "errorCode");
        if (m23926b(bVar, null)) {
            this.f15767n.mo16311c(this.f15766m, bVar);
        }
    }

    /* renamed from: a */
    public final void mo16369a(C6315b bVar, IOException iOException) {
        C5942k.m22327b(bVar, "rstStatusCode");
        if (m23926b(bVar, iOException)) {
            this.f15767n.mo16308b(this.f15766m, bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16370a(p337m.C6445s r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p308k.p323z.p325d.C5942k.m22327b(r3, r0)
            boolean r0 = p337m.p338f0.C6250b.f15421g
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            p308k.p323z.p325d.C5942k.m22324a(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f15759f     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            m.f0.h.i$c r0 = r2.f15760g     // Catch:{ all -> 0x006d }
            r0.mo16398a(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x004b:
            r2.f15759f = r1     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque<m.s> r0 = r2.f15758e     // Catch:{ all -> 0x006d }
            r0.add(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            m.f0.h.i$c r3 = r2.f15760g     // Catch:{ all -> 0x006d }
            r3.mo16400a(r1)     // Catch:{ all -> 0x006d }
        L_0x0059:
            boolean r3 = r2.mo16391q()     // Catch:{ all -> 0x006d }
            r2.notifyAll()     // Catch:{ all -> 0x006d }
            k.t r4 = p308k.C5812t.f14872a     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            m.f0.h.f r3 = r2.f15767n
            int r4 = r2.f15766m
            r3.mo16310c(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6348i.mo16370a(m.s, boolean):void");
    }

    /* renamed from: a */
    public final void mo16371a(C6484g gVar, int i) {
        C5942k.m22327b(gVar, "source");
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            this.f15760g.mo16399a(gVar, (long) i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    public final void mo16372b() {
        if (this.f15761h.mo16396a()) {
            throw new IOException("stream closed");
        } else if (this.f15761h.mo16397d()) {
            throw new IOException("stream finished");
        } else if (this.f15764k != null) {
            Throwable th = this.f15765l;
            if (th == null) {
                C6315b bVar = this.f15764k;
                if (bVar == null) {
                    C5942k.m22323a();
                    throw null;
                }
                th = new C6362n(bVar);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo16373b(long j) {
        this.f15755b = j;
    }

    /* renamed from: b */
    public final synchronized void mo16374b(C6315b bVar) {
        C5942k.m22327b(bVar, "errorCode");
        if (this.f15764k == null) {
            this.f15764k = bVar;
            notifyAll();
        }
    }

    /* renamed from: c */
    public final C6323f mo16375c() {
        return this.f15767n;
    }

    /* renamed from: c */
    public final void mo16376c(long j) {
        this.f15754a = j;
    }

    /* renamed from: d */
    public final synchronized C6315b mo16377d() {
        return this.f15764k;
    }

    /* renamed from: d */
    public final void mo16378d(long j) {
        this.f15756c = j;
    }

    /* renamed from: e */
    public final IOException mo16379e() {
        return this.f15765l;
    }

    /* renamed from: f */
    public final int mo16380f() {
        return this.f15766m;
    }

    /* renamed from: g */
    public final long mo16381g() {
        return this.f15755b;
    }

    /* renamed from: h */
    public final long mo16382h() {
        return this.f15754a;
    }

    /* renamed from: i */
    public final C6352d mo16383i() {
        return this.f15762i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p350n.C6504w mo16384j() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f15759f     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.mo16390p()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            k.t r0 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            m.f0.h.i$b r0 = r2.f15761h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6348i.mo16384j():n.w");
    }

    /* renamed from: k */
    public final C6350b mo16385k() {
        return this.f15761h;
    }

    /* renamed from: l */
    public final C6351c mo16386l() {
        return this.f15760g;
    }

    /* renamed from: m */
    public final long mo16387m() {
        return this.f15757d;
    }

    /* renamed from: n */
    public final long mo16388n() {
        return this.f15756c;
    }

    /* renamed from: o */
    public final C6352d mo16389o() {
        return this.f15763j;
    }

    /* renamed from: p */
    public final boolean mo16390p() {
        return this.f15767n.mo16307a() == ((this.f15766m & 1) == 1);
    }

    /* renamed from: q */
    public final synchronized boolean mo16391q() {
        if (this.f15764k != null) {
            return false;
        }
        return (!this.f15760g.mo16402d() && !this.f15760g.mo16401a()) || (!this.f15761h.mo16397d() && !this.f15761h.mo16396a()) || !this.f15759f;
    }

    /* renamed from: r */
    public final C6507z mo16392r() {
        return this.f15762i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: s */
    public final synchronized C6445s mo16393s() {
        Object removeFirst;
        this.f15762i.mo16771g();
        while (this.f15758e.isEmpty() && this.f15764k == null) {
            try {
                mo16394t();
            } catch (Throwable th) {
                this.f15762i.mo16404m();
                throw th;
            }
        }
        this.f15762i.mo16404m();
        if (!this.f15758e.isEmpty()) {
            removeFirst = this.f15758e.removeFirst();
            C5942k.m22324a(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th2 = this.f15765l;
            if (th2 == null) {
                C6315b bVar = this.f15764k;
                if (bVar == null) {
                    C5942k.m22323a();
                    throw null;
                }
                th2 = new C6362n(bVar);
            }
            throw th2;
        }
        return (C6445s) removeFirst;
    }

    /* renamed from: t */
    public final void mo16394t() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: u */
    public final C6507z mo16395u() {
        return this.f15763j;
    }
}
