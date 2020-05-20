package p350n;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.d */
public class C6475d extends C6507z {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final long f16082h = TimeUnit.SECONDS.toMillis(60);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f16083i = TimeUnit.MILLISECONDS.toNanos(f16082h);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C6475d f16084j;

    /* renamed from: k */
    public static final C6476a f16085k = new C6476a(null);

    /* renamed from: e */
    private boolean f16086e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6475d f16087f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f16088g;

    /* renamed from: n.d$a */
    public static final class C6476a {
        private C6476a() {
        }

        public /* synthetic */ C6476a(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[LOOP:0: B:17:0x004a->B:26:0x0065, LOOP_START, PHI: r11 
          PHI: (r11v2 n.d) = (r11v1 n.d), (r11v3 n.d) binds: [B:16:0x0048, B:26:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[SYNTHETIC, Splitter:B:39:0x0085] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m24494a(p350n.C6475d r8, long r9, boolean r11) {
            /*
                r7 = this;
                java.lang.Class<n.d> r0 = p350n.C6475d.class
                monitor-enter(r0)
                n.d r1 = p350n.C6475d.f16084j     // Catch:{ all -> 0x008f }
                if (r1 != 0) goto L_0x0019
                n.d r1 = new n.d     // Catch:{ all -> 0x008f }
                r1.<init>()     // Catch:{ all -> 0x008f }
                p350n.C6475d.f16084j = r1     // Catch:{ all -> 0x008f }
                n.d$b r1 = new n.d$b     // Catch:{ all -> 0x008f }
                r1.<init>()     // Catch:{ all -> 0x008f }
                r1.start()     // Catch:{ all -> 0x008f }
            L_0x0019:
                long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008f }
                r3 = 0
                int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x0033
                if (r11 == 0) goto L_0x0033
                long r3 = r8.mo16884c()     // Catch:{ all -> 0x008f }
                long r3 = r3 - r1
                long r9 = java.lang.Math.min(r9, r3)     // Catch:{ all -> 0x008f }
            L_0x002e:
                long r9 = r9 + r1
                r8.f16088g = r9     // Catch:{ all -> 0x008f }
                goto L_0x003f
            L_0x0033:
                if (r5 == 0) goto L_0x0036
                goto L_0x002e
            L_0x0036:
                if (r11 == 0) goto L_0x0089
                long r9 = r8.mo16884c()     // Catch:{ all -> 0x008f }
                r8.f16088g = r9     // Catch:{ all -> 0x008f }
            L_0x003f:
                long r9 = r8.m24480b(r1)     // Catch:{ all -> 0x008f }
                n.d r11 = p350n.C6475d.f16084j     // Catch:{ all -> 0x008f }
                r3 = 0
                if (r11 == 0) goto L_0x0085
            L_0x004a:
                n.d r4 = r11.f16087f     // Catch:{ all -> 0x008f }
                if (r4 == 0) goto L_0x006e
                n.d r4 = r11.f16087f     // Catch:{ all -> 0x008f }
                if (r4 == 0) goto L_0x006a
                long r4 = r4.m24480b(r1)     // Catch:{ all -> 0x008f }
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x005f
                goto L_0x006e
            L_0x005f:
                n.d r11 = r11.f16087f     // Catch:{ all -> 0x008f }
                if (r11 == 0) goto L_0x0066
                goto L_0x004a
            L_0x0066:
                p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x008f }
                throw r3
            L_0x006a:
                p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x008f }
                throw r3
            L_0x006e:
                n.d r9 = r11.f16087f     // Catch:{ all -> 0x008f }
                r8.f16087f = r9     // Catch:{ all -> 0x008f }
                r11.f16087f = r8     // Catch:{ all -> 0x008f }
                n.d r8 = p350n.C6475d.f16084j     // Catch:{ all -> 0x008f }
                if (r11 != r8) goto L_0x0081
                r0.notify()     // Catch:{ all -> 0x008f }
            L_0x0081:
                k.t r8 = p308k.C5812t.f14872a     // Catch:{ all -> 0x008f }
                monitor-exit(r0)
                return
            L_0x0085:
                p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x008f }
                throw r3
            L_0x0089:
                java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x008f }
                r8.<init>()     // Catch:{ all -> 0x008f }
                throw r8     // Catch:{ all -> 0x008f }
            L_0x008f:
                r8 = move-exception
                monitor-exit(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p350n.C6475d.C6476a.m24494a(n.d, long, boolean):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m24496a(C6475d dVar) {
            boolean z;
            synchronized (C6475d.class) {
                C6475d j = C6475d.f16084j;
                while (true) {
                    if (j == null) {
                        z = true;
                        break;
                    } else if (j.f16087f == dVar) {
                        j.f16087f = dVar.f16087f;
                        dVar.f16087f = null;
                        z = false;
                        break;
                    } else {
                        j = j.f16087f;
                    }
                }
            }
            return z;
        }

        /* renamed from: a */
        public final C6475d mo16773a() {
            Class<C6475d> cls = C6475d.class;
            C6475d j = C6475d.f16084j;
            C6475d dVar = null;
            if (j != null) {
                C6475d a = j.f16087f;
                long nanoTime = System.nanoTime();
                if (a == null) {
                    cls.wait(C6475d.f16082h);
                    C6475d j2 = C6475d.f16084j;
                    if (j2 != null) {
                        if (j2.f16087f == null && System.nanoTime() - nanoTime >= C6475d.f16083i) {
                            dVar = C6475d.f16084j;
                        }
                        return dVar;
                    }
                    C5942k.m22323a();
                    throw null;
                }
                long a2 = a.m24480b(nanoTime);
                if (a2 > 0) {
                    long j3 = a2 / 1000000;
                    cls.wait(j3, (int) (a2 - (1000000 * j3)));
                    return null;
                }
                C6475d j4 = C6475d.f16084j;
                if (j4 != null) {
                    j4.f16087f = a.f16087f;
                    a.f16087f = null;
                    return a;
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: n.d$b */
    private static final class C6477b extends Thread {
        public C6477b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.mo16195i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<n.d> r0 = p350n.C6475d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                n.d$a r1 = p350n.C6475d.f16085k     // Catch:{ all -> 0x001e }
                n.d r1 = r1.mo16773a()     // Catch:{ all -> 0x001e }
                n.d r2 = p350n.C6475d.f16084j     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p350n.C6475d.f16084j = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                k.t r2 = p308k.C5812t.f14872a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo16195i()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p350n.C6475d.C6477b.run():void");
        }
    }

    /* renamed from: n.d$c */
    public static final class C6478c implements C6504w {

        /* renamed from: f */
        final /* synthetic */ C6475d f16089f;

        /* renamed from: g */
        final /* synthetic */ C6504w f16090g;

        C6478c(C6475d dVar, C6504w wVar) {
            this.f16089f = dVar;
            this.f16090g = wVar;
        }

        /* renamed from: a */
        public void mo16159a(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "source");
            C6474c.m24474a(eVar.mo16834x(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C6500t tVar = eVar.f16093f;
                    if (tVar != null) {
                        while (true) {
                            if (j2 >= ((long) 65536)) {
                                break;
                            }
                            j2 += (long) (tVar.f16130c - tVar.f16129b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            tVar = tVar.f16133f;
                            if (tVar == null) {
                                C5942k.m22323a();
                                throw null;
                            }
                        }
                        C6475d dVar = this.f16089f;
                        dVar.mo16771g();
                        try {
                            this.f16090g.mo16159a(eVar, j2);
                            C5812t tVar2 = C5812t.f14872a;
                            if (!dVar.mo16772h()) {
                                j -= j2;
                            } else {
                                throw dVar.mo16768a((IOException) null);
                            }
                        } catch (IOException e) {
                            e = e;
                            if (dVar.mo16772h()) {
                                e = dVar.mo16768a(e);
                            }
                            throw e;
                        } finally {
                            boolean h = dVar.mo16772h();
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

        /* renamed from: b */
        public C6475d m24500b() {
            return this.f16089f;
        }

        public void close() {
            C6475d dVar = this.f16089f;
            dVar.mo16771g();
            try {
                this.f16090g.close();
                C5812t tVar = C5812t.f14872a;
                if (dVar.mo16772h()) {
                    throw dVar.mo16768a((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.mo16772h()) {
                    e = dVar.mo16768a(e);
                }
                throw e;
            } finally {
                boolean h = dVar.mo16772h();
            }
        }

        public void flush() {
            C6475d dVar = this.f16089f;
            dVar.mo16771g();
            try {
                this.f16090g.flush();
                C5812t tVar = C5812t.f14872a;
                if (dVar.mo16772h()) {
                    throw dVar.mo16768a((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.mo16772h()) {
                    e = dVar.mo16768a(e);
                }
                throw e;
            } finally {
                boolean h = dVar.mo16772h();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.sink(");
            sb.append(this.f16090g);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: n.d$d */
    public static final class C6479d implements C6506y {

        /* renamed from: f */
        final /* synthetic */ C6475d f16091f;

        /* renamed from: g */
        final /* synthetic */ C6506y f16092g;

        C6479d(C6475d dVar, C6506y yVar) {
            this.f16091f = dVar;
            this.f16092g = yVar;
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            C6475d dVar = this.f16091f;
            dVar.mo16771g();
            try {
                long b = this.f16092g.mo16163b(eVar, j);
                if (!dVar.mo16772h()) {
                    return b;
                }
                throw dVar.mo16768a((IOException) null);
            } catch (IOException e) {
                e = e;
                if (dVar.mo16772h()) {
                    e = dVar.mo16768a(e);
                }
                throw e;
            } finally {
                boolean h = dVar.mo16772h();
            }
        }

        /* renamed from: b */
        public C6475d m24503b() {
            return this.f16091f;
        }

        public void close() {
            C6475d dVar = this.f16091f;
            dVar.mo16771g();
            try {
                this.f16092g.close();
                C5812t tVar = C5812t.f14872a;
                if (dVar.mo16772h()) {
                    throw dVar.mo16768a((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (dVar.mo16772h()) {
                    e = dVar.mo16768a(e);
                }
                throw e;
            } finally {
                boolean h = dVar.mo16772h();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.source(");
            sb.append(this.f16092g);
            sb.append(')');
            return sb.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final long m24480b(long j) {
        return this.f16088g - j;
    }

    /* renamed from: a */
    public final IOException mo16768a(IOException iOException) {
        return mo16403b(iOException);
    }

    /* renamed from: a */
    public final C6504w mo16769a(C6504w wVar) {
        C5942k.m22327b(wVar, "sink");
        return new C6478c(this, wVar);
    }

    /* renamed from: a */
    public final C6506y mo16770a(C6506y yVar) {
        C5942k.m22327b(yVar, "source");
        return new C6479d(this, yVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IOException mo16403b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: g */
    public final void mo16771g() {
        if (!this.f16086e) {
            long f = mo16887f();
            boolean d = mo16885d();
            if (f != 0 || d) {
                this.f16086e = true;
                f16085k.m24494a(this, f, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* renamed from: h */
    public final boolean mo16772h() {
        if (!this.f16086e) {
            return false;
        }
        this.f16086e = false;
        return f16085k.m24496a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo16195i() {
    }
}
