package p337m.p338f0.p341e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p337m.C6224a;
import p337m.C6232b0;
import p337m.C6244e;
import p337m.C6248f;
import p337m.C6407g;
import p337m.C6430n;
import p337m.C6434p;
import p337m.C6448t;
import p337m.C6462x;
import p337m.C6467z;
import p337m.p338f0.C6250b;
import p337m.p338f0.p342f.C6295d;
import p337m.p338f0.p342f.C6299g;
import p337m.p338f0.p345i.C6380h;
import p350n.C6475d;

/* renamed from: m.f0.e.e */
public final class C6273e implements C6244e {

    /* renamed from: f */
    private final C6282h f15498f;

    /* renamed from: g */
    private final C6434p f15499g = this.f15512t.mo16699q().mo16100a(this);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6276c f15500h;

    /* renamed from: i */
    private Object f15501i;

    /* renamed from: j */
    private C6272d f15502j;

    /* renamed from: k */
    private C6277f f15503k;

    /* renamed from: l */
    private C6269c f15504l;

    /* renamed from: m */
    private boolean f15505m;

    /* renamed from: n */
    private boolean f15506n;

    /* renamed from: o */
    private boolean f15507o;

    /* renamed from: p */
    private boolean f15508p;

    /* renamed from: q */
    private boolean f15509q;

    /* renamed from: r */
    private boolean f15510r;

    /* renamed from: s */
    private C6269c f15511s;

    /* renamed from: t */
    private final C6462x f15512t;

    /* renamed from: u */
    private final C6467z f15513u;

    /* renamed from: v */
    private final boolean f15514v;

    /* renamed from: m.f0.e.e$a */
    public final class C6274a implements Runnable {

        /* renamed from: f */
        private volatile AtomicInteger f15515f = new AtomicInteger(0);

        /* renamed from: g */
        private final C6248f f15516g;

        /* renamed from: h */
        final /* synthetic */ C6273e f15517h;

        public C6274a(C6273e eVar, C6248f fVar) {
            C5942k.m22327b(fVar, "responseCallback");
            this.f15517h = eVar;
            this.f15516g = fVar;
        }

        /* renamed from: a */
        public final C6273e mo16188a() {
            return this.f15517h;
        }

        /* renamed from: a */
        public final void mo16189a(ExecutorService executorService) {
            C5942k.m22327b(executorService, "executorService");
            C6430n o = this.f15517h.mo16177b().mo16697o();
            if (!C6250b.f15421g || !Thread.holdsLock(o)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f15517h.mo16171a((IOException) interruptedIOException);
                    this.f15516g.mo4565a((C6244e) this.f15517h, (IOException) interruptedIOException);
                    this.f15517h.mo16177b().mo16697o().mo16563b(this);
                } catch (Throwable th) {
                    this.f15517h.mo16177b().mo16697o().mo16563b(this);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(o);
                throw new AssertionError(sb.toString());
            }
        }

        /* renamed from: a */
        public final void mo16190a(C6274a aVar) {
            C5942k.m22327b(aVar, "other");
            this.f15515f = aVar.f15515f;
        }

        /* renamed from: b */
        public final AtomicInteger mo16191b() {
            return this.f15515f;
        }

        /* renamed from: c */
        public final String mo16192c() {
            return this.f15517h.mo16182j().mo16756h().mo16629g();
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                m.f0.e.e r1 = r6.f15517h
                java.lang.String r1 = r1.mo16184l()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p308k.p323z.p325d.C5942k.m22324a(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                m.f0.e.e r3 = r6.f15517h     // Catch:{ all -> 0x00c9 }
                m.f0.e.e$c r3 = r3.f15500h     // Catch:{ all -> 0x00c9 }
                r3.mo16771g()     // Catch:{ all -> 0x00c9 }
                m.f0.e.e r3 = r6.f15517h     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                m.b0 r0 = r3.mo16183k()     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                r3 = 1
                m.f r4 = r6.f15516g     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                m.f0.e.e r5 = r6.f15517h     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                r4.mo4566a(r5, r0)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                m.f0.e.e r0 = r6.f15517h     // Catch:{ all -> 0x00c9 }
                m.x r0 = r0.mo16177b()     // Catch:{ all -> 0x00c9 }
                m.n r0 = r0.mo16697o()     // Catch:{ all -> 0x00c9 }
            L_0x0049:
                r0.mo16563b(r6)     // Catch:{ all -> 0x00c9 }
                goto L_0x00b7
            L_0x004d:
                r0 = move-exception
                goto L_0x0054
            L_0x004f:
                r0 = move-exception
                goto L_0x0081
            L_0x0051:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0054:
                m.f0.e.e r4 = r6.f15517h     // Catch:{ all -> 0x007c }
                r4.cancel()     // Catch:{ all -> 0x007c }
                if (r3 != 0) goto L_0x007b
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                r4.append(r0)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r3.<init>(r4)     // Catch:{ all -> 0x007c }
                r3.addSuppressed(r0)     // Catch:{ all -> 0x007c }
                m.f r4 = r6.f15516g     // Catch:{ all -> 0x007c }
                m.f0.e.e r5 = r6.f15517h     // Catch:{ all -> 0x007c }
                r4.mo4565a(r5, r3)     // Catch:{ all -> 0x007c }
            L_0x007b:
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                goto L_0x00bb
            L_0x007e:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0081:
                if (r3 == 0) goto L_0x00a5
                m.f0.i.h$a r3 = p337m.p338f0.p345i.C6380h.f15831c     // Catch:{ all -> 0x007c }
                m.f0.i.h r3 = r3.mo16477a()     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                m.f0.e.e r5 = r6.f15517h     // Catch:{ all -> 0x007c }
                java.lang.String r5 = r5.m23577r()     // Catch:{ all -> 0x007c }
                r4.append(r5)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r5 = 4
                r3.mo16440a(r4, r5, r0)     // Catch:{ all -> 0x007c }
                goto L_0x00ac
            L_0x00a5:
                m.f r3 = r6.f15516g     // Catch:{ all -> 0x007c }
                m.f0.e.e r4 = r6.f15517h     // Catch:{ all -> 0x007c }
                r3.mo4565a(r4, r0)     // Catch:{ all -> 0x007c }
            L_0x00ac:
                m.f0.e.e r0 = r6.f15517h     // Catch:{ all -> 0x00c9 }
                m.x r0 = r0.mo16177b()     // Catch:{ all -> 0x00c9 }
                m.n r0 = r0.mo16697o()     // Catch:{ all -> 0x00c9 }
                goto L_0x0049
            L_0x00b7:
                r1.setName(r2)
                return
            L_0x00bb:
                m.f0.e.e r3 = r6.f15517h     // Catch:{ all -> 0x00c9 }
                m.x r3 = r3.mo16177b()     // Catch:{ all -> 0x00c9 }
                m.n r3 = r3.mo16697o()     // Catch:{ all -> 0x00c9 }
                r3.mo16563b(r6)     // Catch:{ all -> 0x00c9 }
                throw r0     // Catch:{ all -> 0x00c9 }
            L_0x00c9:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6273e.C6274a.run():void");
        }
    }

    /* renamed from: m.f0.e.e$b */
    public static final class C6275b extends WeakReference<C6273e> {

        /* renamed from: a */
        private final Object f15518a;

        public C6275b(C6273e eVar, Object obj) {
            C5942k.m22327b(eVar, "referent");
            super(eVar);
            this.f15518a = obj;
        }

        /* renamed from: a */
        public final Object mo16194a() {
            return this.f15518a;
        }
    }

    /* renamed from: m.f0.e.e$c */
    public static final class C6276c extends C6475d {

        /* renamed from: l */
        final /* synthetic */ C6273e f15519l;

        C6276c(C6273e eVar) {
            this.f15519l = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo16195i() {
            this.f15519l.cancel();
        }
    }

    public C6273e(C6462x xVar, C6467z zVar, boolean z) {
        C5942k.m22327b(xVar, "client");
        C5942k.m22327b(zVar, "originalRequest");
        this.f15512t = xVar;
        this.f15513u = zVar;
        this.f15514v = z;
        this.f15498f = xVar.mo16694k().mo16532a();
        C6276c cVar = new C6276c(this);
        cVar.mo16882a((long) this.f15512t.mo16691d(), TimeUnit.MILLISECONDS);
        this.f15500h = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x007b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <E extends java.io.IOException> E m23571a(E r8, boolean r9) {
        /*
            r7 = this;
            k.z.d.r r0 = new k.z.d.r
            r0.<init>()
            m.f0.e.h r1 = r7.f15498f
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x0016
            m.f0.e.c r4 = r7.f15504l     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r4 = 0
            goto L_0x0017
        L_0x0013:
            r8 = move-exception
            goto L_0x0087
        L_0x0016:
            r4 = 1
        L_0x0017:
            if (r4 == 0) goto L_0x007b
            m.f0.e.f r4 = r7.f15503k     // Catch:{ all -> 0x0013 }
            r0.f14947f = r4     // Catch:{ all -> 0x0013 }
            m.f0.e.f r4 = r7.f15503k     // Catch:{ all -> 0x0013 }
            r5 = 0
            if (r4 == 0) goto L_0x0031
            m.f0.e.c r4 = r7.f15504l     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0031
            if (r9 != 0) goto L_0x002c
            boolean r9 = r7.f15509q     // Catch:{ all -> 0x0013 }
            if (r9 == 0) goto L_0x0031
        L_0x002c:
            java.net.Socket r9 = r7.mo16185n()     // Catch:{ all -> 0x0013 }
            goto L_0x0032
        L_0x0031:
            r9 = r5
        L_0x0032:
            m.f0.e.f r4 = r7.f15503k     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0038
            r0.f14947f = r5     // Catch:{ all -> 0x0013 }
        L_0x0038:
            boolean r4 = r7.f15509q     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0042
            m.f0.e.c r4 = r7.f15504l     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            k.t r6 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            if (r9 == 0) goto L_0x004b
            p337m.p338f0.C6250b.m23458a(r9)
        L_0x004b:
            T r9 = r0.f14947f
            r0 = r9
            m.i r0 = (p337m.C6420i) r0
            if (r0 == 0) goto L_0x0060
            m.p r0 = r7.f15499g
            m.i r9 = (p337m.C6420i) r9
            if (r9 == 0) goto L_0x005c
            r0.mo16583b(r7, r9)
            goto L_0x0060
        L_0x005c:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r5
        L_0x0060:
            if (r4 == 0) goto L_0x007a
            if (r8 == 0) goto L_0x0065
            r2 = 1
        L_0x0065:
            java.io.IOException r8 = r7.m23574b((E) r8)
            m.p r9 = r7.f15499g
            if (r2 == 0) goto L_0x0077
            if (r8 == 0) goto L_0x0073
            r9.mo16568a(r7, r8)
            goto L_0x007a
        L_0x0073:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r5
        L_0x0077:
            r9.mo16566a(r7)
        L_0x007a:
            return r8
        L_0x007b:
            java.lang.String r8 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0013 }
            r9.<init>(r8)     // Catch:{ all -> 0x0013 }
            throw r9     // Catch:{ all -> 0x0013 }
        L_0x0087:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6273e.m23571a(java.io.IOException, boolean):java.io.IOException");
    }

    /* renamed from: a */
    private final C6224a m23572a(C6448t tVar) {
        C6407g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (tVar.mo16630h()) {
            SSLSocketFactory F = this.f15512t.mo16686F();
            hostnameVerifier = this.f15512t.mo16703u();
            sSLSocketFactory = F;
            gVar = this.f15512t.mo16692e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        C6224a aVar = new C6224a(tVar.mo16629g(), tVar.mo16634k(), this.f15512t.mo16698p(), this.f15512t.mo16685E(), sSLSocketFactory, hostnameVerifier, gVar, this.f15512t.mo16681A(), this.f15512t.mo16708z(), this.f15512t.mo16707y(), this.f15512t.mo16695l(), this.f15512t.mo16682B());
        return aVar;
    }

    /* renamed from: b */
    private final <E extends IOException> E m23574b(E e) {
        if (this.f15508p || !this.f15500h.mo16772h()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    /* renamed from: q */
    private final void m23576q() {
        this.f15501i = C6380h.f15831c.mo16477a().mo16446a("response.body().close()");
        this.f15499g.mo16580b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final String m23577r() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo16096i() ? "canceled " : "");
        sb.append(this.f15514v ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo16184l());
        return sb.toString();
    }

    /* renamed from: a */
    public final IOException mo16171a(IOException iOException) {
        synchronized (this.f15498f) {
            this.f15509q = true;
            C5812t tVar = C5812t.f14872a;
        }
        return m23571a((E) iOException, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (r1 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        r7 = m23571a(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo16172a(p337m.p338f0.p341e.C6269c r4, boolean r5, boolean r6, E r7) {
        /*
            r3 = this;
            java.lang.String r0 = "exchange"
            p308k.p323z.p325d.C5942k.m22327b(r4, r0)
            m.f0.e.h r0 = r3.f15498f
            monitor-enter(r0)
            m.f0.e.c r1 = r3.f15504l     // Catch:{ all -> 0x0054 }
            boolean r4 = p308k.p323z.p325d.C5942k.m22326a(r4, r1)     // Catch:{ all -> 0x0054 }
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0014
            monitor-exit(r0)
            return r7
        L_0x0014:
            r4 = 0
            if (r5 == 0) goto L_0x001d
            boolean r5 = r3.f15505m     // Catch:{ all -> 0x0054 }
            r5 = r5 ^ r1
            r3.f15505m = r1     // Catch:{ all -> 0x0054 }
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            if (r6 == 0) goto L_0x0027
            boolean r6 = r3.f15506n     // Catch:{ all -> 0x0054 }
            if (r6 != 0) goto L_0x0025
            r5 = 1
        L_0x0025:
            r3.f15506n = r1     // Catch:{ all -> 0x0054 }
        L_0x0027:
            boolean r6 = r3.f15505m     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0049
            boolean r6 = r3.f15506n     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            m.f0.e.c r5 = r3.f15504l     // Catch:{ all -> 0x0054 }
            r6 = 0
            if (r5 == 0) goto L_0x0045
            m.f0.e.f r5 = r5.mo16151f()     // Catch:{ all -> 0x0054 }
            int r2 = r5.mo16214g()     // Catch:{ all -> 0x0054 }
            int r2 = r2 + r1
            r5.mo16198a(r2)     // Catch:{ all -> 0x0054 }
            r3.f15504l = r6     // Catch:{ all -> 0x0054 }
            goto L_0x004a
        L_0x0045:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x0054 }
            throw r6
        L_0x0049:
            r1 = 0
        L_0x004a:
            k.t r5 = p308k.C5812t.f14872a     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0053
            java.io.IOException r7 = r3.m23571a((E) r7, r4)
        L_0x0053:
            return r7
        L_0x0054:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6273e.mo16172a(m.f0.e.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: a */
    public final C6269c mo16173a(C6299g gVar) {
        C5942k.m22327b(gVar, "chain");
        synchronized (this.f15498f) {
            boolean z = true;
            if (!this.f15509q) {
                if (this.f15504l != null) {
                    z = false;
                }
                if (z) {
                    C5812t tVar = C5812t.f14872a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        C6272d dVar = this.f15502j;
        if (dVar != null) {
            C6295d a = dVar.mo16166a(this.f15512t, gVar);
            C6434p pVar = this.f15499g;
            C6272d dVar2 = this.f15502j;
            if (dVar2 != null) {
                C6269c cVar = new C6269c(this, pVar, dVar2, a);
                this.f15511s = cVar;
                synchronized (this.f15498f) {
                    this.f15504l = cVar;
                    this.f15505m = false;
                    this.f15506n = false;
                }
                return cVar;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public final void mo16174a(C6277f fVar) {
        C5942k.m22327b(fVar, "connection");
        C6282h hVar = this.f15498f;
        if (!C6250b.f15421g || Thread.holdsLock(hVar)) {
            if (this.f15503k == null) {
                this.f15503k = fVar;
                fVar.mo16210c().add(new C6275b(this, this.f15501i));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public void mo16092a(C6248f fVar) {
        C5942k.m22327b(fVar, "responseCallback");
        synchronized (this) {
            if (!this.f15510r) {
                this.f15510r = true;
                C5812t tVar = C5812t.f14872a;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        m23576q();
        this.f15512t.mo16697o().mo16560a(new C6274a(this, fVar));
    }

    /* renamed from: a */
    public final void mo16175a(C6467z zVar, boolean z) {
        C5942k.m22327b(zVar, "request");
        boolean z2 = true;
        if (this.f15511s == null) {
            if (this.f15504l != null) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            } else if (z) {
                this.f15502j = new C6272d(this.f15498f, m23572a(zVar.mo16756h()), this, this.f15499g);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: a */
    public final void mo16176a(boolean z) {
        boolean z2 = true;
        if (!this.f15509q) {
            if (z) {
                C6269c cVar = this.f15504l;
                if (cVar != null) {
                    cVar.mo16146b();
                }
                if (this.f15504l != null) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            this.f15511s = null;
            return;
        }
        throw new IllegalStateException("released".toString());
    }

    /* renamed from: b */
    public final C6462x mo16177b() {
        return this.f15512t;
    }

    /* renamed from: c */
    public final C6277f mo16178c() {
        return this.f15503k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        r1.mo16144a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        if (r2 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        r2.mo16208b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        r4.f15499g.mo16584c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r4 = this;
            m.f0.e.h r0 = r4.f15498f
            monitor-enter(r0)
            boolean r1 = r4.f15507o     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 1
            r4.f15507o = r1     // Catch:{ all -> 0x002f }
            m.f0.e.c r1 = r4.f15504l     // Catch:{ all -> 0x002f }
            m.f0.e.d r2 = r4.f15502j     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0019
            m.f0.e.f r2 = r2.mo16165a()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            m.f0.e.f r2 = r4.f15503k     // Catch:{ all -> 0x002f }
        L_0x001b:
            k.t r3 = p308k.C5812t.f14872a     // Catch:{ all -> 0x002f }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0024
            r1.mo16144a()
            goto L_0x0029
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            r2.mo16208b()
        L_0x0029:
            m.p r0 = r4.f15499g
            r0.mo16584c(r4)
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6273e.cancel():void");
    }

    public C6273e clone() {
        return new C6273e(this.f15512t, this.f15513u, this.f15514v);
    }

    /* renamed from: d */
    public final boolean mo16180d() {
        return this.f15514v;
    }

    /* renamed from: e */
    public final C6269c mo16181e() {
        return this.f15511s;
    }

    /* renamed from: g */
    public C6467z mo16094g() {
        return this.f15513u;
    }

    /* renamed from: h */
    public C6232b0 mo16095h() {
        synchronized (this) {
            if (!this.f15510r) {
                this.f15510r = true;
                C5812t tVar = C5812t.f14872a;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        this.f15500h.mo16771g();
        m23576q();
        try {
            this.f15512t.mo16697o().mo16561a(this);
            return mo16183k();
        } finally {
            this.f15512t.mo16697o().mo16564b(this);
        }
    }

    /* renamed from: i */
    public boolean mo16096i() {
        boolean z;
        synchronized (this.f15498f) {
            z = this.f15507o;
        }
        return z;
    }

    /* renamed from: j */
    public final C6467z mo16182j() {
        return this.f15513u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p337m.C6232b0 mo16183k() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            m.x r0 = r10.f15512t
            java.util.List r0 = r0.mo16704v()
            p308k.p314u.C5842q.m22169a(r2, r0)
            m.f0.f.j r0 = new m.f0.f.j
            m.x r1 = r10.f15512t
            r0.<init>(r1)
            r2.add(r0)
            m.f0.f.a r0 = new m.f0.f.a
            m.x r1 = r10.f15512t
            m.m r1 = r1.mo16696n()
            r0.<init>(r1)
            r2.add(r0)
            m.f0.c.a r0 = new m.f0.c.a
            m.x r1 = r10.f15512t
            m.c r1 = r1.mo16689c()
            r0.<init>(r1)
            r2.add(r0)
            m.f0.e.a r0 = p337m.p338f0.p341e.C6267a.f15465b
            r2.add(r0)
            boolean r0 = r10.f15514v
            if (r0 != 0) goto L_0x0046
            m.x r0 = r10.f15512t
            java.util.List r0 = r0.mo16705w()
            p308k.p314u.C5842q.m22169a(r2, r0)
        L_0x0046:
            m.f0.f.b r0 = new m.f0.f.b
            boolean r1 = r10.f15514v
            r0.<init>(r1)
            r2.add(r0)
            m.f0.f.g r9 = new m.f0.f.g
            r3 = 0
            r4 = 0
            m.z r5 = r10.f15513u
            m.x r0 = r10.f15512t
            int r6 = r0.mo16693j()
            m.x r0 = r10.f15512t
            int r7 = r0.mo16683C()
            m.x r0 = r10.f15512t
            int r8 = r0.mo16687G()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            m.z r2 = r10.f15513u     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            m.b0 r2 = r9.mo16251a(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            boolean r3 = r10.mo16096i()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x007f
            r10.mo16171a(r1)
            return r2
        L_0x007f:
            p337m.p338f0.C6250b.m23457a(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            throw r2     // Catch:{ IOException -> 0x008c, all -> 0x008a }
        L_0x008a:
            r2 = move-exception
            goto L_0x00a0
        L_0x008c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.mo16171a(r0)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x009c
            k.q r0 = new k.q     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a0:
            if (r0 != 0) goto L_0x00a5
            r10.mo16171a(r1)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6273e.mo16183k():m.b0");
    }

    /* renamed from: l */
    public final String mo16184l() {
        return this.f15513u.mo16756h().mo16636m();
    }

    /* renamed from: n */
    public final Socket mo16185n() {
        C6282h hVar = this.f15498f;
        if (!C6250b.f15421g || Thread.holdsLock(hVar)) {
            C6277f fVar = this.f15503k;
            if (fVar != null) {
                Iterator it = fVar.mo16210c().iterator();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C5942k.m22326a((Object) (C6273e) ((Reference) it.next()).get(), (Object) this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    z = true;
                }
                if (z) {
                    C6277f fVar2 = this.f15503k;
                    if (fVar2 != null) {
                        fVar2.mo16210c().remove(i);
                        this.f15503k = null;
                        if (fVar2.mo16210c().isEmpty()) {
                            fVar2.mo16200a(System.nanoTime());
                            if (this.f15498f.mo16224a(fVar2)) {
                                return fVar2.mo16220m();
                            }
                        }
                        return null;
                    }
                    C5942k.m22323a();
                    throw null;
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
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: o */
    public final boolean mo16186o() {
        C6272d dVar = this.f15502j;
        if (dVar != null) {
            return dVar.mo16170c();
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: p */
    public final void mo16187p() {
        if (!this.f15508p) {
            this.f15508p = true;
            this.f15500h.mo16772h();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
