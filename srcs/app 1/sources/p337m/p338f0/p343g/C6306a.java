package p337m.p338f0.p343g;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6427m;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6448t;
import p337m.C6462x;
import p337m.C6467z;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6277f;
import p337m.p338f0.p342f.C6295d;
import p337m.p338f0.p342f.C6297e;
import p337m.p338f0.p342f.C6301i;
import p337m.p338f0.p342f.C6304k;
import p350n.C6480e;
import p350n.C6483f;
import p350n.C6484g;
import p350n.C6489k;
import p350n.C6504w;
import p350n.C6506y;
import p350n.C6507z;

/* renamed from: m.f0.g.a */
public final class C6306a implements C6295d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15590a;

    /* renamed from: b */
    private long f15591b = ((long) 262144);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6445s f15592c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6462x f15593d;

    /* renamed from: e */
    private final C6277f f15594e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6484g f15595f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6483f f15596g;

    /* renamed from: m.f0.g.a$a */
    private abstract class C6307a implements C6506y {

        /* renamed from: f */
        private final C6489k f15597f;

        /* renamed from: g */
        private boolean f15598g;

        public C6307a() {
            this.f15597f = new C6489k(C6306a.this.f15595f.mo16270b());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo16268a(boolean z) {
            this.f15598g = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo16269a() {
            return this.f15598g;
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            try {
                return C6306a.this.f15595f.mo16163b(eVar, j);
            } catch (IOException e) {
                C6306a.this.mo16246c().mo16218k();
                mo16271d();
                throw e;
            }
        }

        /* renamed from: b */
        public C6507z mo16270b() {
            return this.f15597f;
        }

        /* renamed from: d */
        public final void mo16271d() {
            if (C6306a.this.f15590a != 6) {
                if (C6306a.this.f15590a == 5) {
                    C6306a.this.m23715a(this.f15597f);
                    C6306a.this.f15590a = 6;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(C6306a.this.f15590a);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: m.f0.g.a$b */
    private final class C6308b implements C6504w {

        /* renamed from: f */
        private final C6489k f15600f;

        /* renamed from: g */
        private boolean f15601g;

        public C6308b() {
            this.f15600f = new C6489k(C6306a.this.f15596g.mo16272b());
        }

        /* renamed from: a */
        public void mo16159a(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "source");
            if (!(!this.f15601g)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                C6306a.this.f15596g.mo16783a(j);
                String str = "\r\n";
                C6306a.this.f15596g.mo16784a(str);
                C6306a.this.f15596g.mo16159a(eVar, j);
                C6306a.this.f15596g.mo16784a(str);
            }
        }

        /* renamed from: b */
        public C6507z mo16272b() {
            return this.f15600f;
        }

        public synchronized void close() {
            if (!this.f15601g) {
                this.f15601g = true;
                C6306a.this.f15596g.mo16784a("0\r\n\r\n");
                C6306a.this.m23715a(this.f15600f);
                C6306a.this.f15590a = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f15601g) {
                C6306a.this.f15596g.flush();
            }
        }
    }

    /* renamed from: m.f0.g.a$c */
    private final class C6309c extends C6307a {

        /* renamed from: i */
        private long f15603i = -1;

        /* renamed from: j */
        private boolean f15604j = true;

        /* renamed from: k */
        private final C6448t f15605k;

        /* renamed from: l */
        final /* synthetic */ C6306a f15606l;

        public C6309c(C6306a aVar, C6448t tVar) {
            C5942k.m22327b(tVar, "url");
            this.f15606l = aVar;
            super();
            this.f15605k = tVar;
        }

        /* renamed from: f */
        private final void m23745f() {
            if (this.f15603i != -1) {
                this.f15606l.f15595f.mo16798e();
            }
            try {
                this.f15603i = this.f15606l.f15595f.mo16811n();
                String e = this.f15606l.f15595f.mo16798e();
                if (e != null) {
                    String obj = C5788q.m22032f(e).toString();
                    if (this.f15603i >= 0) {
                        if (!(obj.length() > 0) || C5787p.m21980b(obj, ";", false, 2, null)) {
                            if (this.f15603i == 0) {
                                this.f15604j = false;
                                C6306a aVar = this.f15606l;
                                aVar.f15592c = aVar.m23727h();
                                C6462x a = this.f15606l.f15593d;
                                if (a != null) {
                                    C6427m n = a.mo16696n();
                                    C6448t tVar = this.f15605k;
                                    C6445s e2 = this.f15606l.f15592c;
                                    if (e2 != null) {
                                        C6297e.m23676a(n, tVar, e2);
                                        mo16271d();
                                        return;
                                    }
                                    C5942k.m22323a();
                                    throw null;
                                }
                                C5942k.m22323a();
                                throw null;
                            }
                            return;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions");
                    sb.append(" but was \"");
                    sb.append(this.f15603i);
                    sb.append(obj);
                    sb.append('\"');
                    throw new ProtocolException(sb.toString());
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e3) {
                throw new ProtocolException(e3.getMessage());
            }
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!(true ^ mo16269a())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.f15604j) {
                return -1;
            } else {
                long j2 = this.f15603i;
                if (j2 == 0 || j2 == -1) {
                    m23745f();
                    if (!this.f15604j) {
                        return -1;
                    }
                }
                long b = super.mo16163b(eVar, Math.min(j, this.f15603i));
                if (b != -1) {
                    this.f15603i -= b;
                    return b;
                }
                this.f15606l.mo16246c().mo16218k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo16271d();
                throw protocolException;
            }
        }

        public void close() {
            if (!mo16269a()) {
                if (this.f15604j && !C6250b.m23464a((C6506y) this, 100, TimeUnit.MILLISECONDS)) {
                    this.f15606l.mo16246c().mo16218k();
                    mo16271d();
                }
                mo16268a(true);
            }
        }
    }

    /* renamed from: m.f0.g.a$d */
    public static final class C6310d {
        private C6310d() {
        }

        public /* synthetic */ C6310d(C5938g gVar) {
            this();
        }
    }

    /* renamed from: m.f0.g.a$e */
    private final class C6311e extends C6307a {

        /* renamed from: i */
        private long f15607i;

        public C6311e(long j) {
            super();
            this.f15607i = j;
            if (j == 0) {
                mo16271d();
            }
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (true ^ mo16269a()) {
                long j2 = this.f15607i;
                if (j2 == 0) {
                    return -1;
                }
                long b = super.mo16163b(eVar, Math.min(j2, j));
                if (b != -1) {
                    long j3 = this.f15607i - b;
                    this.f15607i = j3;
                    if (j3 == 0) {
                        mo16271d();
                    }
                    return b;
                }
                C6306a.this.mo16246c().mo16218k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo16271d();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public void close() {
            if (!mo16269a()) {
                if (this.f15607i != 0 && !C6250b.m23464a((C6506y) this, 100, TimeUnit.MILLISECONDS)) {
                    C6306a.this.mo16246c().mo16218k();
                    mo16271d();
                }
                mo16268a(true);
            }
        }
    }

    /* renamed from: m.f0.g.a$f */
    private final class C6312f implements C6504w {

        /* renamed from: f */
        private final C6489k f15609f;

        /* renamed from: g */
        private boolean f15610g;

        public C6312f() {
            this.f15609f = new C6489k(C6306a.this.f15596g.mo16272b());
        }

        /* renamed from: a */
        public void mo16159a(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "source");
            if (!this.f15610g) {
                C6250b.m23456a(eVar.mo16834x(), 0, j);
                C6306a.this.f15596g.mo16159a(eVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        /* renamed from: b */
        public C6507z mo16272b() {
            return this.f15609f;
        }

        public void close() {
            if (!this.f15610g) {
                this.f15610g = true;
                C6306a.this.m23715a(this.f15609f);
                C6306a.this.f15590a = 3;
            }
        }

        public void flush() {
            if (!this.f15610g) {
                C6306a.this.f15596g.flush();
            }
        }
    }

    /* renamed from: m.f0.g.a$g */
    private final class C6313g extends C6307a {

        /* renamed from: i */
        private boolean f15612i;

        public C6313g(C6306a aVar) {
            super();
        }

        /* renamed from: b */
        public long mo16163b(C6480e eVar, long j) {
            C5942k.m22327b(eVar, "sink");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!(!mo16269a())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.f15612i) {
                return -1;
            } else {
                long b = super.mo16163b(eVar, j);
                if (b != -1) {
                    return b;
                }
                this.f15612i = true;
                mo16271d();
                return -1;
            }
        }

        public void close() {
            if (!mo16269a()) {
                if (!this.f15612i) {
                    mo16271d();
                }
                mo16268a(true);
            }
        }
    }

    static {
        new C6310d(null);
    }

    public C6306a(C6462x xVar, C6277f fVar, C6484g gVar, C6483f fVar2) {
        C5942k.m22327b(fVar, "connection");
        C5942k.m22327b(gVar, "source");
        C5942k.m22327b(fVar2, "sink");
        this.f15593d = xVar;
        this.f15594e = fVar;
        this.f15595f = gVar;
        this.f15596g = fVar2;
    }

    /* renamed from: a */
    private final C6506y m23710a(long j) {
        if (this.f15590a == 4) {
            this.f15590a = 5;
            return new C6311e(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f15590a);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    private final C6506y m23711a(C6448t tVar) {
        if (this.f15590a == 4) {
            this.f15590a = 5;
            return new C6309c(this, tVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f15590a);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23715a(C6489k kVar) {
        C6507z g = kVar.mo16888g();
        kVar.mo16879a(C6507z.f16142d);
        g.mo16880a();
        g.mo16883b();
    }

    /* renamed from: b */
    private final boolean m23717b(C6467z zVar) {
        return C5787p.m21979b("chunked", zVar.mo16748a("Transfer-Encoding"), true);
    }

    /* renamed from: d */
    private final C6504w m23720d() {
        boolean z = true;
        if (this.f15590a != 1) {
            z = false;
        }
        if (z) {
            this.f15590a = 2;
            return new C6308b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f15590a);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: d */
    private final boolean m23721d(C6232b0 b0Var) {
        return C5787p.m21979b("chunked", C6232b0.m23339a(b0Var, "Transfer-Encoding", null, 2, null), true);
    }

    /* renamed from: e */
    private final C6504w m23723e() {
        boolean z = true;
        if (this.f15590a != 1) {
            z = false;
        }
        if (z) {
            this.f15590a = 2;
            return new C6312f();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f15590a);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: f */
    private final C6506y m23725f() {
        if (this.f15590a == 4) {
            this.f15590a = 5;
            mo16246c().mo16218k();
            return new C6313g(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f15590a);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: g */
    private final String m23726g() {
        String f = this.f15595f.mo16801f(this.f15591b);
        this.f15591b -= (long) f.length();
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final C6445s m23727h() {
        C6446a aVar = new C6446a();
        while (true) {
            String g = m23726g();
            if (!(g.length() > 0)) {
                return aVar.mo16614a();
            }
            aVar.mo16612a(g);
        }
    }

    /* renamed from: a */
    public long mo16239a(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "response");
        if (!C6297e.m23677a(b0Var)) {
            return 0;
        }
        if (m23721d(b0Var)) {
            return -1;
        }
        return C6250b.m23444a(b0Var);
    }

    /* renamed from: a */
    public C6233a mo16240a(boolean z) {
        int i = this.f15590a;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                C6304k a = C6304k.f15586d.mo16265a(m23726g());
                C6233a aVar = new C6233a();
                aVar.mo16044a(a.f15587a);
                aVar.mo16036a(a.f15588b);
                aVar.mo16038a(a.f15589c);
                aVar.mo16043a(m23727h());
                if (z && a.f15588b == 100) {
                    return null;
                }
                if (a.f15588b == 100) {
                    this.f15590a = 3;
                    return aVar;
                }
                this.f15590a = 4;
                return aVar;
            } catch (EOFException e) {
                String m = mo16246c().mo16219l().mo16085a().mo16005k().mo16636m();
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(m);
                throw new IOException(sb.toString(), e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.f15590a);
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    /* renamed from: a */
    public C6504w mo16241a(C6467z zVar, long j) {
        C5942k.m22327b(zVar, "request");
        if (zVar.mo16749a() != null && zVar.mo16749a().mo16010c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (m23717b(zVar)) {
            return m23720d();
        } else {
            if (j != -1) {
                return m23723e();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: a */
    public void mo16242a() {
        this.f15596g.flush();
    }

    /* renamed from: a */
    public final void mo16266a(C6445s sVar, String str) {
        C5942k.m22327b(sVar, "headers");
        C5942k.m22327b(str, "requestLine");
        if (this.f15590a == 0) {
            String str2 = "\r\n";
            this.f15596g.mo16784a(str).mo16784a(str2);
            int size = sVar.size();
            for (int i = 0; i < size; i++) {
                this.f15596g.mo16784a(sVar.mo16604c(i)).mo16784a(": ").mo16784a(sVar.mo16606d(i)).mo16784a(str2);
            }
            this.f15596g.mo16784a(str2);
            this.f15590a = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f15590a);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public void mo16243a(C6467z zVar) {
        C5942k.m22327b(zVar, "request");
        C6301i iVar = C6301i.f15584a;
        Type type = mo16246c().mo16219l().mo16086b().type();
        C5942k.m22324a((Object) type, "connection.route().proxy.type()");
        mo16266a(zVar.mo16752d(), iVar.mo16263a(zVar, type));
    }

    /* renamed from: b */
    public C6506y mo16244b(C6232b0 b0Var) {
        long a;
        C5942k.m22327b(b0Var, "response");
        if (!C6297e.m23677a(b0Var)) {
            a = 0;
        } else if (m23721d(b0Var)) {
            return m23711a(b0Var.mo16034v().mo16756h());
        } else {
            a = C6250b.m23444a(b0Var);
            if (a == -1) {
                return m23725f();
            }
        }
        return m23710a(a);
    }

    /* renamed from: b */
    public void mo16245b() {
        this.f15596g.flush();
    }

    /* renamed from: c */
    public C6277f mo16246c() {
        return this.f15594e;
    }

    /* renamed from: c */
    public final void mo16267c(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "response");
        long a = C6250b.m23444a(b0Var);
        if (a != -1) {
            C6506y a2 = m23710a(a);
            C6250b.m23472b(a2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a2.close();
        }
    }

    public void cancel() {
        mo16246c().mo16208b();
    }
}
