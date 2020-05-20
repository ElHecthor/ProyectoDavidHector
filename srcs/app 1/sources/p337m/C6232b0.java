package p337m;

import java.io.Closeable;
import p308k.p323z.p325d.C5942k;
import p337m.C6445s.C6446a;
import p337m.p338f0.p341e.C6269c;

/* renamed from: m.b0 */
public final class C6232b0 implements Closeable {

    /* renamed from: f */
    private C6240d f15346f;

    /* renamed from: g */
    private final C6467z f15347g;

    /* renamed from: h */
    private final C6465y f15348h;

    /* renamed from: i */
    private final String f15349i;

    /* renamed from: j */
    private final int f15350j;

    /* renamed from: k */
    private final C6441r f15351k;

    /* renamed from: l */
    private final C6445s f15352l;

    /* renamed from: m */
    private final C6236c0 f15353m;

    /* renamed from: n */
    private final C6232b0 f15354n;

    /* renamed from: o */
    private final C6232b0 f15355o;

    /* renamed from: p */
    private final C6232b0 f15356p;

    /* renamed from: q */
    private final long f15357q;

    /* renamed from: r */
    private final long f15358r;

    /* renamed from: s */
    private final C6269c f15359s;

    /* renamed from: m.b0$a */
    public static class C6233a {

        /* renamed from: a */
        private C6467z f15360a;

        /* renamed from: b */
        private C6465y f15361b;

        /* renamed from: c */
        private int f15362c;

        /* renamed from: d */
        private String f15363d;

        /* renamed from: e */
        private C6441r f15364e;

        /* renamed from: f */
        private C6446a f15365f;

        /* renamed from: g */
        private C6236c0 f15366g;

        /* renamed from: h */
        private C6232b0 f15367h;

        /* renamed from: i */
        private C6232b0 f15368i;

        /* renamed from: j */
        private C6232b0 f15369j;

        /* renamed from: k */
        private long f15370k;

        /* renamed from: l */
        private long f15371l;

        /* renamed from: m */
        private C6269c f15372m;

        public C6233a() {
            this.f15362c = -1;
            this.f15365f = new C6446a();
        }

        public C6233a(C6232b0 b0Var) {
            C5942k.m22327b(b0Var, "response");
            this.f15362c = -1;
            this.f15360a = b0Var.mo16034v();
            this.f15361b = b0Var.mo16031t();
            this.f15362c = b0Var.mo16022g();
            this.f15363d = b0Var.mo16027o();
            this.f15364e = b0Var.mo16024i();
            this.f15365f = b0Var.mo16025l().mo16605c();
            this.f15366g = b0Var.mo16018a();
            this.f15367h = b0Var.mo16028p();
            this.f15368i = b0Var.mo16021f();
            this.f15369j = b0Var.mo16030s();
            this.f15370k = b0Var.mo16035w();
            this.f15371l = b0Var.mo16033u();
            this.f15372m = b0Var.mo16023h();
        }

        /* renamed from: a */
        private final void m23357a(String str, C6232b0 b0Var) {
            if (b0Var != null) {
                boolean z = true;
                if (b0Var.mo16018a() == null) {
                    if (b0Var.mo16028p() == null) {
                        if (b0Var.mo16021f() == null) {
                            if (b0Var.mo16030s() != null) {
                                z = false;
                            }
                            if (!z) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(".priorResponse != null");
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(".cacheResponse != null");
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".networkResponse != null");
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".body != null");
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }

        /* renamed from: d */
        private final void m23358d(C6232b0 b0Var) {
            if (b0Var != null) {
                if (!(b0Var.mo16018a() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        /* renamed from: a */
        public C6233a mo16036a(int i) {
            this.f15362c = i;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16037a(long j) {
            this.f15371l = j;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16038a(String str) {
            C5942k.m22327b(str, "message");
            this.f15363d = str;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16039a(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            this.f15365f.mo16613a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C6233a mo16040a(C6232b0 b0Var) {
            m23357a("cacheResponse", b0Var);
            this.f15368i = b0Var;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16041a(C6236c0 c0Var) {
            this.f15366g = c0Var;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16042a(C6441r rVar) {
            this.f15364e = rVar;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16043a(C6445s sVar) {
            C5942k.m22327b(sVar, "headers");
            this.f15365f = sVar.mo16605c();
            return this;
        }

        /* renamed from: a */
        public C6233a mo16044a(C6465y yVar) {
            C5942k.m22327b(yVar, "protocol");
            this.f15361b = yVar;
            return this;
        }

        /* renamed from: a */
        public C6233a mo16045a(C6467z zVar) {
            C5942k.m22327b(zVar, "request");
            this.f15360a = zVar;
            return this;
        }

        /* renamed from: a */
        public C6232b0 mo16046a() {
            if (this.f15362c >= 0) {
                C6467z zVar = this.f15360a;
                if (zVar != null) {
                    C6465y yVar = this.f15361b;
                    if (yVar != null) {
                        String str = this.f15363d;
                        if (str != null) {
                            C6232b0 b0Var = new C6232b0(zVar, yVar, str, this.f15362c, this.f15364e, this.f15365f.mo16614a(), this.f15366g, this.f15367h, this.f15368i, this.f15369j, this.f15370k, this.f15371l, this.f15372m);
                            return b0Var;
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("code < 0: ");
            sb.append(this.f15362c);
            throw new IllegalStateException(sb.toString().toString());
        }

        /* renamed from: a */
        public final void mo16047a(C6269c cVar) {
            C5942k.m22327b(cVar, "deferredTrailers");
            this.f15372m = cVar;
        }

        /* renamed from: b */
        public final int mo16048b() {
            return this.f15362c;
        }

        /* renamed from: b */
        public C6233a mo16049b(long j) {
            this.f15370k = j;
            return this;
        }

        /* renamed from: b */
        public C6233a mo16050b(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            this.f15365f.mo16618c(str, str2);
            return this;
        }

        /* renamed from: b */
        public C6233a mo16051b(C6232b0 b0Var) {
            m23357a("networkResponse", b0Var);
            this.f15367h = b0Var;
            return this;
        }

        /* renamed from: c */
        public C6233a mo16052c(C6232b0 b0Var) {
            m23358d(b0Var);
            this.f15369j = b0Var;
            return this;
        }
    }

    public C6232b0(C6467z zVar, C6465y yVar, String str, int i, C6441r rVar, C6445s sVar, C6236c0 c0Var, C6232b0 b0Var, C6232b0 b0Var2, C6232b0 b0Var3, long j, long j2, C6269c cVar) {
        C6467z zVar2 = zVar;
        C6465y yVar2 = yVar;
        String str2 = str;
        C6445s sVar2 = sVar;
        C5942k.m22327b(zVar, "request");
        C5942k.m22327b(yVar, "protocol");
        C5942k.m22327b(str, "message");
        C5942k.m22327b(sVar, "headers");
        this.f15347g = zVar2;
        this.f15348h = yVar2;
        this.f15349i = str2;
        this.f15350j = i;
        this.f15351k = rVar;
        this.f15352l = sVar2;
        this.f15353m = c0Var;
        this.f15354n = b0Var;
        this.f15355o = b0Var2;
        this.f15356p = b0Var3;
        this.f15357q = j;
        this.f15358r = j2;
        this.f15359s = cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ String m23339a(C6232b0 b0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return b0Var.mo16017a(str, str2);
    }

    /* renamed from: a */
    public final String mo16017a(String str, String str2) {
        C5942k.m22327b(str, "name");
        String a = this.f15352l.mo16602a(str);
        return a != null ? a : str2;
    }

    /* renamed from: a */
    public final C6236c0 mo16018a() {
        return this.f15353m;
    }

    public void close() {
        C6236c0 c0Var = this.f15353m;
        if (c0Var != null) {
            c0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: d */
    public final C6240d mo16020d() {
        C6240d dVar = this.f15346f;
        if (dVar != null) {
            return dVar;
        }
        C6240d a = C6240d.f15382n.mo16084a(this.f15352l);
        this.f15346f = a;
        return a;
    }

    /* renamed from: f */
    public final C6232b0 mo16021f() {
        return this.f15355o;
    }

    /* renamed from: g */
    public final int mo16022g() {
        return this.f15350j;
    }

    /* renamed from: h */
    public final C6269c mo16023h() {
        return this.f15359s;
    }

    /* renamed from: i */
    public final C6441r mo16024i() {
        return this.f15351k;
    }

    /* renamed from: l */
    public final C6445s mo16025l() {
        return this.f15352l;
    }

    /* renamed from: m */
    public final boolean mo16026m() {
        int i = this.f15350j;
        return 200 <= i && 299 >= i;
    }

    /* renamed from: o */
    public final String mo16027o() {
        return this.f15349i;
    }

    /* renamed from: p */
    public final C6232b0 mo16028p() {
        return this.f15354n;
    }

    /* renamed from: q */
    public final C6233a mo16029q() {
        return new C6233a(this);
    }

    /* renamed from: s */
    public final C6232b0 mo16030s() {
        return this.f15356p;
    }

    /* renamed from: t */
    public final C6465y mo16031t() {
        return this.f15348h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.f15348h);
        sb.append(", code=");
        sb.append(this.f15350j);
        sb.append(", message=");
        sb.append(this.f15349i);
        sb.append(", url=");
        sb.append(this.f15347g.mo16756h());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final long mo16033u() {
        return this.f15358r;
    }

    /* renamed from: v */
    public final C6467z mo16034v() {
        return this.f15347g;
    }

    /* renamed from: w */
    public final long mo16035w() {
        return this.f15357q;
    }
}
