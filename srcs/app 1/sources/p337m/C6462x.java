package p337m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p308k.p323z.p325d.C5942k;
import p337m.C6244e.C6245a;
import p337m.C6434p.C6437c;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6273e;
import p337m.p338f0.p341e.C6285i;
import p337m.p338f0.p345i.C6380h;
import p337m.p338f0.p348k.C6403c;
import p337m.p338f0.p348k.C6405d;

/* renamed from: m.x */
public class C6462x implements Cloneable, C6245a {
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final List<C6465y> f15998I = C6250b.m23451a((T[]) new C6465y[]{C6465y.HTTP_2, C6465y.HTTP_1_1});
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static final List<C6422k> f15999J = C6250b.m23451a((T[]) new C6422k[]{C6422k.f15902g, C6422k.f15903h});

    /* renamed from: K */
    public static final C6464b f16000K = new C6464b(null);

    /* renamed from: A */
    private final C6407g f16001A;

    /* renamed from: B */
    private final C6403c f16002B;

    /* renamed from: C */
    private final int f16003C;

    /* renamed from: D */
    private final int f16004D;

    /* renamed from: E */
    private final int f16005E;

    /* renamed from: F */
    private final int f16006F;

    /* renamed from: G */
    private final int f16007G;

    /* renamed from: H */
    private final C6285i f16008H;

    /* renamed from: f */
    private final C6430n f16009f;

    /* renamed from: g */
    private final C6421j f16010g;

    /* renamed from: h */
    private final List<C6452u> f16011h;

    /* renamed from: i */
    private final List<C6452u> f16012i;

    /* renamed from: j */
    private final C6437c f16013j;

    /* renamed from: k */
    private final boolean f16014k;

    /* renamed from: l */
    private final C6229b f16015l;

    /* renamed from: m */
    private final boolean f16016m;

    /* renamed from: n */
    private final boolean f16017n;

    /* renamed from: o */
    private final C6427m f16018o;

    /* renamed from: p */
    private final C6234c f16019p;

    /* renamed from: q */
    private final C6431o f16020q;

    /* renamed from: r */
    private final Proxy f16021r;

    /* renamed from: s */
    private final ProxySelector f16022s;

    /* renamed from: t */
    private final C6229b f16023t;

    /* renamed from: u */
    private final SocketFactory f16024u;

    /* renamed from: v */
    private final SSLSocketFactory f16025v;

    /* renamed from: w */
    private final X509TrustManager f16026w;

    /* renamed from: x */
    private final List<C6422k> f16027x;

    /* renamed from: y */
    private final List<C6465y> f16028y;

    /* renamed from: z */
    private final HostnameVerifier f16029z;

    /* renamed from: m.x$a */
    public static final class C6463a {

        /* renamed from: A */
        private int f16030A;

        /* renamed from: B */
        private int f16031B;

        /* renamed from: C */
        private C6285i f16032C;

        /* renamed from: a */
        private C6430n f16033a = new C6430n();

        /* renamed from: b */
        private C6421j f16034b = new C6421j();

        /* renamed from: c */
        private final List<C6452u> f16035c = new ArrayList();

        /* renamed from: d */
        private final List<C6452u> f16036d = new ArrayList();

        /* renamed from: e */
        private C6437c f16037e = C6250b.m23454a(C6434p.f15935a);

        /* renamed from: f */
        private boolean f16038f = true;

        /* renamed from: g */
        private C6229b f16039g = C6229b.f15345a;

        /* renamed from: h */
        private boolean f16040h = true;

        /* renamed from: i */
        private boolean f16041i = true;

        /* renamed from: j */
        private C6427m f16042j = C6427m.f15926a;

        /* renamed from: k */
        private C6234c f16043k;

        /* renamed from: l */
        private C6431o f16044l = C6431o.f15934a;

        /* renamed from: m */
        private Proxy f16045m;

        /* renamed from: n */
        private ProxySelector f16046n;

        /* renamed from: o */
        private C6229b f16047o = C6229b.f15345a;

        /* renamed from: p */
        private SocketFactory f16048p;

        /* renamed from: q */
        private SSLSocketFactory f16049q;

        /* renamed from: r */
        private X509TrustManager f16050r;

        /* renamed from: s */
        private List<C6422k> f16051s;

        /* renamed from: t */
        private List<? extends C6465y> f16052t;

        /* renamed from: u */
        private HostnameVerifier f16053u;

        /* renamed from: v */
        private C6407g f16054v;

        /* renamed from: w */
        private C6403c f16055w;

        /* renamed from: x */
        private int f16056x;

        /* renamed from: y */
        private int f16057y;

        /* renamed from: z */
        private int f16058z;

        public C6463a() {
            SocketFactory socketFactory = SocketFactory.getDefault();
            C5942k.m22324a((Object) socketFactory, "SocketFactory.getDefault()");
            this.f16048p = socketFactory;
            this.f16051s = C6462x.f16000K.mo16743a();
            this.f16052t = C6462x.f16000K.mo16744b();
            this.f16053u = C6405d.f15859a;
            this.f16054v = C6407g.f15860c;
            this.f16057y = 10000;
            this.f16058z = 10000;
            this.f16030A = 10000;
        }

        /* renamed from: A */
        public final SocketFactory mo16709A() {
            return this.f16048p;
        }

        /* renamed from: B */
        public final SSLSocketFactory mo16710B() {
            return this.f16049q;
        }

        /* renamed from: C */
        public final int mo16711C() {
            return this.f16030A;
        }

        /* renamed from: D */
        public final X509TrustManager mo16712D() {
            return this.f16050r;
        }

        /* renamed from: a */
        public final C6463a mo16713a(long j, TimeUnit timeUnit) {
            C5942k.m22327b(timeUnit, "unit");
            this.f16057y = C6250b.m23437a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public final C6463a mo16714a(C6452u uVar) {
            C5942k.m22327b(uVar, "interceptor");
            this.f16035c.add(uVar);
            return this;
        }

        /* renamed from: a */
        public final C6462x mo16715a() {
            return new C6462x(this);
        }

        /* renamed from: b */
        public final C6229b mo16716b() {
            return this.f16039g;
        }

        /* renamed from: b */
        public final C6463a mo16717b(long j, TimeUnit timeUnit) {
            C5942k.m22327b(timeUnit, "unit");
            this.f16058z = C6250b.m23437a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public final C6234c mo16718c() {
            return this.f16043k;
        }

        /* renamed from: c */
        public final C6463a mo16719c(long j, TimeUnit timeUnit) {
            C5942k.m22327b(timeUnit, "unit");
            this.f16030A = C6250b.m23437a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: d */
        public final int mo16720d() {
            return this.f16056x;
        }

        /* renamed from: e */
        public final C6403c mo16721e() {
            return this.f16055w;
        }

        /* renamed from: f */
        public final C6407g mo16722f() {
            return this.f16054v;
        }

        /* renamed from: g */
        public final int mo16723g() {
            return this.f16057y;
        }

        /* renamed from: h */
        public final C6421j mo16724h() {
            return this.f16034b;
        }

        /* renamed from: i */
        public final List<C6422k> mo16725i() {
            return this.f16051s;
        }

        /* renamed from: j */
        public final C6427m mo16726j() {
            return this.f16042j;
        }

        /* renamed from: k */
        public final C6430n mo16727k() {
            return this.f16033a;
        }

        /* renamed from: l */
        public final C6431o mo16728l() {
            return this.f16044l;
        }

        /* renamed from: m */
        public final C6437c mo16729m() {
            return this.f16037e;
        }

        /* renamed from: n */
        public final boolean mo16730n() {
            return this.f16040h;
        }

        /* renamed from: o */
        public final boolean mo16731o() {
            return this.f16041i;
        }

        /* renamed from: p */
        public final HostnameVerifier mo16732p() {
            return this.f16053u;
        }

        /* renamed from: q */
        public final List<C6452u> mo16733q() {
            return this.f16035c;
        }

        /* renamed from: r */
        public final List<C6452u> mo16734r() {
            return this.f16036d;
        }

        /* renamed from: s */
        public final int mo16735s() {
            return this.f16031B;
        }

        /* renamed from: t */
        public final List<C6465y> mo16736t() {
            return this.f16052t;
        }

        /* renamed from: u */
        public final Proxy mo16737u() {
            return this.f16045m;
        }

        /* renamed from: v */
        public final C6229b mo16738v() {
            return this.f16047o;
        }

        /* renamed from: w */
        public final ProxySelector mo16739w() {
            return this.f16046n;
        }

        /* renamed from: x */
        public final int mo16740x() {
            return this.f16058z;
        }

        /* renamed from: y */
        public final boolean mo16741y() {
            return this.f16038f;
        }

        /* renamed from: z */
        public final C6285i mo16742z() {
            return this.f16032C;
        }
    }

    /* renamed from: m.x$b */
    public static final class C6464b {
        private C6464b() {
        }

        public /* synthetic */ C6464b(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final SSLSocketFactory m24429a(X509TrustManager x509TrustManager) {
            try {
                SSLContext a = C6380h.f15831c.mo16477a().mo16457a();
                a.init(null, new TrustManager[]{x509TrustManager}, null);
                SSLSocketFactory socketFactory = a.getSocketFactory();
                C5942k.m22324a((Object) socketFactory, "sslContext.socketFactory");
                return socketFactory;
            } catch (GeneralSecurityException e) {
                throw new AssertionError("No System TLS", e);
            }
        }

        /* renamed from: a */
        public final List<C6422k> mo16743a() {
            return C6462x.f15999J;
        }

        /* renamed from: b */
        public final List<C6465y> mo16744b() {
            return C6462x.f15998I;
        }
    }

    public C6462x() {
        this(new C6463a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0072, code lost:
        if (r0 != null) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6462x(p337m.C6462x.C6463a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "builder"
            p308k.p323z.p325d.C5942k.m22327b(r5, r0)
            r4.<init>()
            m.n r0 = r5.mo16727k()
            r4.f16009f = r0
            m.j r0 = r5.mo16724h()
            r4.f16010g = r0
            java.util.List r0 = r5.mo16733q()
            java.util.List r0 = p337m.p338f0.C6250b.m23471b(r0)
            r4.f16011h = r0
            java.util.List r0 = r5.mo16734r()
            java.util.List r0 = p337m.p338f0.C6250b.m23471b(r0)
            r4.f16012i = r0
            m.p$c r0 = r5.mo16729m()
            r4.f16013j = r0
            boolean r0 = r5.mo16741y()
            r4.f16014k = r0
            m.b r0 = r5.mo16716b()
            r4.f16015l = r0
            boolean r0 = r5.mo16730n()
            r4.f16016m = r0
            boolean r0 = r5.mo16731o()
            r4.f16017n = r0
            m.m r0 = r5.mo16726j()
            r4.f16018o = r0
            m.c r0 = r5.mo16718c()
            r4.f16019p = r0
            m.o r0 = r5.mo16728l()
            r4.f16020q = r0
            java.net.Proxy r0 = r5.mo16737u()
            r4.f16021r = r0
            java.net.Proxy r0 = r5.mo16737u()
            if (r0 == 0) goto L_0x0067
        L_0x0064:
            m.f0.j.a r0 = p337m.p338f0.p347j.C6399a.f15855a
            goto L_0x0074
        L_0x0067:
            java.net.ProxySelector r0 = r5.mo16739w()
            if (r0 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x0072:
            if (r0 == 0) goto L_0x0064
        L_0x0074:
            r4.f16022s = r0
            m.b r0 = r5.mo16738v()
            r4.f16023t = r0
            javax.net.SocketFactory r0 = r5.mo16709A()
            r4.f16024u = r0
            java.util.List r0 = r5.mo16725i()
            r4.f16027x = r0
            java.util.List r0 = r5.mo16736t()
            r4.f16028y = r0
            javax.net.ssl.HostnameVerifier r0 = r5.mo16732p()
            r4.f16029z = r0
            int r0 = r5.mo16720d()
            r4.f16003C = r0
            int r0 = r5.mo16723g()
            r4.f16004D = r0
            int r0 = r5.mo16740x()
            r4.f16005E = r0
            int r0 = r5.mo16711C()
            r4.f16006F = r0
            int r0 = r5.mo16735s()
            r4.f16007G = r0
            m.f0.e.i r0 = r5.mo16742z()
            if (r0 == 0) goto L_0x00b9
            goto L_0x00be
        L_0x00b9:
            m.f0.e.i r0 = new m.f0.e.i
            r0.<init>()
        L_0x00be:
            r4.f16008H = r0
            javax.net.ssl.SSLSocketFactory r0 = r5.mo16710B()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0128
            java.util.List<m.k> r0 = r4.f16027x
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x00d6
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x00d6
        L_0x00d4:
            r0 = 1
            goto L_0x00ed
        L_0x00d6:
            java.util.Iterator r0 = r0.iterator()
        L_0x00da:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d4
            java.lang.Object r3 = r0.next()
            m.k r3 = (p337m.C6422k) r3
            boolean r3 = r3.mo16536b()
            if (r3 == 0) goto L_0x00da
            r0 = 0
        L_0x00ed:
            if (r0 == 0) goto L_0x00f0
            goto L_0x0128
        L_0x00f0:
            m.f0.i.h$a r0 = p337m.p338f0.p345i.C6380h.f15831c
            m.f0.i.h r0 = r0.mo16477a()
            javax.net.ssl.X509TrustManager r0 = r0.mo16458b()
            r4.f16026w = r0
            m.f0.i.h$a r0 = p337m.p338f0.p345i.C6380h.f15831c
            m.f0.i.h r0 = r0.mo16477a()
            javax.net.ssl.X509TrustManager r3 = r4.f16026w
            r0.mo16462c(r3)
            m.x$b r0 = f16000K
            javax.net.ssl.X509TrustManager r3 = r4.f16026w
            if (r3 == 0) goto L_0x0124
            javax.net.ssl.SSLSocketFactory r0 = r0.m24429a(r3)
            r4.f16025v = r0
            m.f0.k.c$a r0 = p337m.p338f0.p348k.C6403c.f15858a
            javax.net.ssl.X509TrustManager r3 = r4.f16026w
            if (r3 == 0) goto L_0x0120
            m.f0.k.c r0 = r0.mo16503a(r3)
            r4.f16002B = r0
            goto L_0x013a
        L_0x0120:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r1
        L_0x0124:
            p308k.p323z.p325d.C5942k.m22323a()
            throw r1
        L_0x0128:
            javax.net.ssl.SSLSocketFactory r0 = r5.mo16710B()
            r4.f16025v = r0
            m.f0.k.c r0 = r5.mo16721e()
            r4.f16002B = r0
            javax.net.ssl.X509TrustManager r0 = r5.mo16712D()
            r4.f16026w = r0
        L_0x013a:
            javax.net.ssl.SSLSocketFactory r0 = r4.f16025v
            if (r0 == 0) goto L_0x0149
            m.f0.i.h$a r0 = p337m.p338f0.p345i.C6380h.f15831c
            m.f0.i.h r0 = r0.mo16477a()
            javax.net.ssl.SSLSocketFactory r3 = r4.f16025v
            r0.mo16461a(r3)
        L_0x0149:
            m.g r5 = r5.mo16722f()
            m.f0.k.c r0 = r4.f16002B
            m.g r5 = r5.mo16509a(r0)
            r4.f16001A = r5
            java.util.List<m.u> r5 = r4.f16011h
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r5.contains(r1)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0191
            java.util.List<m.u> r5 = r4.f16012i
            if (r5 == 0) goto L_0x018b
            boolean r5 = r5.contains(r1)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x016e
            return
        L_0x016e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Null network interceptor: "
            r5.append(r0)
            java.util.List<m.u> r0 = r4.f16012i
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L_0x018b:
            k.q r5 = new k.q
            r5.<init>(r0)
            throw r5
        L_0x0191:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Null interceptor: "
            r5.append(r0)
            java.util.List<m.u> r0 = r4.f16011h
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L_0x01ae:
            k.q r5 = new k.q
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.C6462x.<init>(m.x$a):void");
    }

    /* renamed from: A */
    public final C6229b mo16681A() {
        return this.f16023t;
    }

    /* renamed from: B */
    public final ProxySelector mo16682B() {
        return this.f16022s;
    }

    /* renamed from: C */
    public final int mo16683C() {
        return this.f16005E;
    }

    /* renamed from: D */
    public final boolean mo16684D() {
        return this.f16014k;
    }

    /* renamed from: E */
    public final SocketFactory mo16685E() {
        return this.f16024u;
    }

    /* renamed from: F */
    public final SSLSocketFactory mo16686F() {
        SSLSocketFactory sSLSocketFactory = this.f16025v;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: G */
    public final int mo16687G() {
        return this.f16006F;
    }

    /* renamed from: a */
    public C6244e mo16097a(C6467z zVar) {
        C5942k.m22327b(zVar, "request");
        return new C6273e(this, zVar, false);
    }

    /* renamed from: b */
    public final C6229b mo16688b() {
        return this.f16015l;
    }

    /* renamed from: c */
    public final C6234c mo16689c() {
        return this.f16019p;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public final int mo16691d() {
        return this.f16003C;
    }

    /* renamed from: e */
    public final C6407g mo16692e() {
        return this.f16001A;
    }

    /* renamed from: j */
    public final int mo16693j() {
        return this.f16004D;
    }

    /* renamed from: k */
    public final C6421j mo16694k() {
        return this.f16010g;
    }

    /* renamed from: l */
    public final List<C6422k> mo16695l() {
        return this.f16027x;
    }

    /* renamed from: n */
    public final C6427m mo16696n() {
        return this.f16018o;
    }

    /* renamed from: o */
    public final C6430n mo16697o() {
        return this.f16009f;
    }

    /* renamed from: p */
    public final C6431o mo16698p() {
        return this.f16020q;
    }

    /* renamed from: q */
    public final C6437c mo16699q() {
        return this.f16013j;
    }

    /* renamed from: r */
    public final boolean mo16700r() {
        return this.f16016m;
    }

    /* renamed from: s */
    public final boolean mo16701s() {
        return this.f16017n;
    }

    /* renamed from: t */
    public final C6285i mo16702t() {
        return this.f16008H;
    }

    /* renamed from: u */
    public final HostnameVerifier mo16703u() {
        return this.f16029z;
    }

    /* renamed from: v */
    public final List<C6452u> mo16704v() {
        return this.f16011h;
    }

    /* renamed from: w */
    public final List<C6452u> mo16705w() {
        return this.f16012i;
    }

    /* renamed from: x */
    public final int mo16706x() {
        return this.f16007G;
    }

    /* renamed from: y */
    public final List<C6465y> mo16707y() {
        return this.f16028y;
    }

    /* renamed from: z */
    public final Proxy mo16708z() {
        return this.f16021r;
    }
}
