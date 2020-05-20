package p378p;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6236c0;
import p337m.C6244e;
import p337m.C6244e.C6245a;
import p337m.C6248f;
import p337m.C6455v;
import p337m.C6467z;
import p350n.C6480e;
import p350n.C6484g;
import p350n.C6488j;
import p350n.C6493o;
import p350n.C6506y;

/* renamed from: p.n */
final class C6635n<T> implements C6604d<T> {

    /* renamed from: f */
    private final C6661s f16286f;

    /* renamed from: g */
    private final Object[] f16287g;

    /* renamed from: h */
    private final C6245a f16288h;

    /* renamed from: i */
    private final C6614h<C6236c0, T> f16289i;

    /* renamed from: j */
    private volatile boolean f16290j;
    @GuardedBy("this")
    @Nullable

    /* renamed from: k */
    private C6244e f16291k;
    @GuardedBy("this")
    @Nullable

    /* renamed from: l */
    private Throwable f16292l;
    @GuardedBy("this")

    /* renamed from: m */
    private boolean f16293m;

    /* renamed from: p.n$a */
    class C6636a implements C6248f {

        /* renamed from: f */
        final /* synthetic */ C6607f f16294f;

        C6636a(C6607f fVar) {
            this.f16294f = fVar;
        }

        /* renamed from: a */
        private void m24959a(Throwable th) {
            try {
                this.f16294f.mo17082a((C6604d<T>) C6635n.this, th);
            } catch (Throwable th2) {
                C6670y.m25066a(th2);
                th2.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo4565a(C6244e eVar, IOException iOException) {
            m24959a(iOException);
        }

        /* renamed from: a */
        public void mo4566a(C6244e eVar, C6232b0 b0Var) {
            try {
                try {
                    this.f16294f.mo17083a((C6604d<T>) C6635n.this, C6635n.this.mo17097a(b0Var));
                } catch (Throwable th) {
                    C6670y.m25066a(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C6670y.m25066a(th2);
                m24959a(th2);
            }
        }
    }

    /* renamed from: p.n$b */
    static final class C6637b extends C6236c0 {

        /* renamed from: h */
        private final C6236c0 f16296h;

        /* renamed from: i */
        private final C6484g f16297i;
        @Nullable

        /* renamed from: j */
        IOException f16298j;

        /* renamed from: p.n$b$a */
        class C6638a extends C6488j {
            C6638a(C6506y yVar) {
                super(yVar);
            }

            /* renamed from: b */
            public long mo16163b(C6480e eVar, long j) {
                try {
                    return super.mo16163b(eVar, j);
                } catch (IOException e) {
                    C6637b.this.f16298j = e;
                    throw e;
                }
            }
        }

        C6637b(C6236c0 c0Var) {
            this.f16296h = c0Var;
            this.f16297i = C6493o.m24623a((C6506y) new C6638a(c0Var.mo16063h()));
        }

        public void close() {
            this.f16296h.close();
        }

        /* renamed from: f */
        public long mo16061f() {
            return this.f16296h.mo16061f();
        }

        /* renamed from: g */
        public C6455v mo16062g() {
            return this.f16296h.mo16062g();
        }

        /* renamed from: h */
        public C6484g mo16063h() {
            return this.f16297i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo17098l() {
            IOException iOException = this.f16298j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: p.n$c */
    static final class C6639c extends C6236c0 {
        @Nullable

        /* renamed from: h */
        private final C6455v f16300h;

        /* renamed from: i */
        private final long f16301i;

        C6639c(@Nullable C6455v vVar, long j) {
            this.f16300h = vVar;
            this.f16301i = j;
        }

        /* renamed from: f */
        public long mo16061f() {
            return this.f16301i;
        }

        /* renamed from: g */
        public C6455v mo16062g() {
            return this.f16300h;
        }

        /* renamed from: h */
        public C6484g mo16063h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C6635n(C6661s sVar, Object[] objArr, C6245a aVar, C6614h<C6236c0, T> hVar) {
        this.f16286f = sVar;
        this.f16287g = objArr;
        this.f16288h = aVar;
        this.f16289i = hVar;
    }

    /* renamed from: b */
    private C6244e m24953b() {
        C6244e a = this.f16288h.mo16097a(this.f16286f.mo17123a(this.f16287g));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    /* renamed from: c */
    private C6244e m24954c() {
        C6244e eVar = this.f16291k;
        if (eVar != null) {
            return eVar;
        }
        Throwable th = this.f16292l;
        if (th == null) {
            try {
                C6244e b = m24953b();
                this.f16291k = b;
                return b;
            } catch (IOException | Error | RuntimeException e) {
                C6670y.m25066a(e);
                this.f16292l = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6663t<T> mo17097a(C6232b0 b0Var) {
        C6236c0 a = b0Var.mo16018a();
        C6233a q = b0Var.mo16029q();
        q.mo16041a((C6236c0) new C6639c(a.mo16062g(), a.mo16061f()));
        C6232b0 a2 = q.mo16046a();
        int g = a2.mo16022g();
        if (g < 200 || g >= 300) {
            try {
                return C6663t.m25030a(C6670y.m25065a(a), a2);
            } finally {
                a.close();
            }
        } else if (g == 204 || g == 205) {
            a.close();
            return C6663t.m25029a(null, a2);
        } else {
            C6637b bVar = new C6637b(a);
            try {
                return C6663t.m25029a(this.f16289i.mo17068a(bVar), a2);
            } catch (RuntimeException e) {
                bVar.mo17098l();
                throw e;
            }
        }
    }

    /* renamed from: a */
    public void mo17074a(C6607f<T> fVar) {
        C6244e eVar;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            if (!this.f16293m) {
                this.f16293m = true;
                eVar = this.f16291k;
                th = this.f16292l;
                if (eVar == null && th == null) {
                    try {
                        C6244e b = m24953b();
                        this.f16291k = b;
                        eVar = b;
                    } catch (Throwable th2) {
                        th = th2;
                        C6670y.m25066a(th);
                        this.f16292l = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            fVar.mo17082a((C6604d<T>) this, th);
            return;
        }
        if (this.f16290j) {
            eVar.cancel();
        }
        eVar.mo16092a(new C6636a(fVar));
    }

    public void cancel() {
        C6244e eVar;
        this.f16290j = true;
        synchronized (this) {
            eVar = this.f16291k;
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public C6635n<T> clone() {
        return new C6635n<>(this.f16286f, this.f16287g, this.f16288h, this.f16289i);
    }

    /* renamed from: g */
    public synchronized C6467z mo17077g() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m24954c().mo16094g();
    }

    /* renamed from: i */
    public boolean mo17078i() {
        boolean z = true;
        if (this.f16290j) {
            return true;
        }
        synchronized (this) {
            if (this.f16291k == null || !this.f16291k.mo16096i()) {
                z = false;
            }
        }
        return z;
    }
}
