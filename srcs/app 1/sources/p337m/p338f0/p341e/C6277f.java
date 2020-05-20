package p337m.p338f0.p341e;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p337m.C6224a;
import p337m.C6225a0;
import p337m.C6232b0;
import p337m.C6232b0.C6233a;
import p337m.C6243d0;
import p337m.C6244e;
import p337m.C6407g;
import p337m.C6420i;
import p337m.C6434p;
import p337m.C6441r;
import p337m.C6448t;
import p337m.C6462x;
import p337m.C6465y;
import p337m.C6467z;
import p337m.C6467z.C6468a;
import p337m.p338f0.C6250b;
import p337m.p338f0.p340d.C6262d;
import p337m.p338f0.p342f.C6295d;
import p337m.p338f0.p342f.C6299g;
import p337m.p338f0.p343g.C6306a;
import p337m.p338f0.p344h.C6314a;
import p337m.p338f0.p344h.C6315b;
import p337m.p338f0.p344h.C6323f;
import p337m.p338f0.p344h.C6323f.C6325b;
import p337m.p338f0.p344h.C6323f.C6327d;
import p337m.p338f0.p344h.C6342g;
import p337m.p338f0.p344h.C6348i;
import p337m.p338f0.p344h.C6360m;
import p337m.p338f0.p344h.C6362n;
import p337m.p338f0.p345i.C6380h;
import p337m.p338f0.p348k.C6403c;
import p337m.p338f0.p348k.C6405d;
import p350n.C6483f;
import p350n.C6484g;
import p350n.C6493o;

/* renamed from: m.f0.e.f */
public final class C6277f extends C6327d implements C6420i {

    /* renamed from: b */
    private Socket f15520b;

    /* renamed from: c */
    private Socket f15521c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6441r f15522d;

    /* renamed from: e */
    private C6465y f15523e;

    /* renamed from: f */
    private C6323f f15524f;

    /* renamed from: g */
    private C6484g f15525g;

    /* renamed from: h */
    private C6483f f15526h;

    /* renamed from: i */
    private boolean f15527i;

    /* renamed from: j */
    private boolean f15528j;

    /* renamed from: k */
    private int f15529k;

    /* renamed from: l */
    private int f15530l;

    /* renamed from: m */
    private int f15531m;

    /* renamed from: n */
    private int f15532n = 1;

    /* renamed from: o */
    private final List<Reference<C6273e>> f15533o = new ArrayList();

    /* renamed from: p */
    private long f15534p = Long.MAX_VALUE;

    /* renamed from: q */
    private final C6282h f15535q;

    /* renamed from: r */
    private final C6243d0 f15536r;

    /* renamed from: m.f0.e.f$a */
    public static final class C6278a {
        private C6278a() {
        }

        public /* synthetic */ C6278a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: m.f0.e.f$b */
    static final class C6279b extends C5943l implements C5907a<List<? extends Certificate>> {

        /* renamed from: g */
        final /* synthetic */ C6407g f15537g;

        /* renamed from: h */
        final /* synthetic */ C6441r f15538h;

        /* renamed from: i */
        final /* synthetic */ C6224a f15539i;

        C6279b(C6407g gVar, C6441r rVar, C6224a aVar) {
            this.f15537g = gVar;
            this.f15538h = rVar;
            this.f15539i = aVar;
            super(0);
        }

        public final List<Certificate> invoke() {
            C6403c a = this.f15537g.mo16508a();
            if (a != null) {
                return a.mo16479a(this.f15538h.mo16596c(), this.f15539i.mo16005k().mo16629g());
            }
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: m.f0.e.f$c */
    static final class C6280c extends C5943l implements C5907a<List<? extends X509Certificate>> {

        /* renamed from: g */
        final /* synthetic */ C6277f f15540g;

        C6280c(C6277f fVar) {
            this.f15540g = fVar;
            super(0);
        }

        public final List<X509Certificate> invoke() {
            C6441r a = this.f15540g.f15522d;
            if (a != null) {
                List<Certificate> c = a.mo16596c();
                ArrayList arrayList = new ArrayList(C5838m.m22166a(c, 10));
                for (Certificate certificate : c) {
                    if (certificate != null) {
                        arrayList.add((X509Certificate) certificate);
                    } else {
                        throw new C5809q("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                }
                return arrayList;
            }
            C5942k.m22323a();
            throw null;
        }
    }

    static {
        new C6278a(null);
    }

    public C6277f(C6282h hVar, C6243d0 d0Var) {
        C5942k.m22327b(hVar, "connectionPool");
        C5942k.m22327b(d0Var, "route");
        this.f15535q = hVar;
        this.f15536r = d0Var;
    }

    /* renamed from: a */
    private final C6467z m23606a(int i, int i2, C6467z zVar, C6448t tVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(C6250b.m23447a(tVar, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            C6484g gVar = this.f15525g;
            if (gVar != null) {
                C6483f fVar = this.f15526h;
                if (fVar != null) {
                    C6306a aVar = new C6306a(null, this, gVar, fVar);
                    gVar.mo16270b().mo16882a((long) i, TimeUnit.MILLISECONDS);
                    fVar.mo16272b().mo16882a((long) i2, TimeUnit.MILLISECONDS);
                    aVar.mo16266a(zVar.mo16752d(), sb2);
                    aVar.mo16242a();
                    C6233a a = aVar.mo16240a(false);
                    if (a != null) {
                        a.mo16045a(zVar);
                        C6232b0 a2 = a.mo16046a();
                        aVar.mo16267c(a2);
                        int g = a2.mo16022g();
                        if (g != 200) {
                            if (g == 407) {
                                C6467z a3 = this.f15536r.mo16085a().mo16000g().mo16016a(this.f15536r, a2);
                                if (a3 != null) {
                                    if (C5787p.m21979b("close", C6232b0.m23339a(a2, "Connection", null, 2, null), true)) {
                                        return a3;
                                    }
                                    zVar = a3;
                                } else {
                                    throw new IOException("Failed to authenticate with proxy");
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unexpected response code for CONNECT: ");
                                sb3.append(a2.mo16022g());
                                throw new IOException(sb3.toString());
                            }
                        } else if (gVar.getBuffer().mo16809j() && fVar.getBuffer().mo16809j()) {
                            return null;
                        } else {
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        }
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
    }

    /* renamed from: a */
    private final void m23607a(int i, int i2, int i3, C6244e eVar, C6434p pVar) {
        C6467z n = m23614n();
        C6448t h = n.mo16756h();
        int i4 = 0;
        while (i4 < 21) {
            m23608a(i, i2, eVar, pVar);
            n = m23606a(i2, i3, n, h);
            if (n != null) {
                Socket socket = this.f15520b;
                if (socket != null) {
                    C6250b.m23458a(socket);
                }
                this.f15520b = null;
                this.f15526h = null;
                this.f15525g = null;
                pVar.mo16572a(eVar, this.f15536r.mo16088d(), this.f15536r.mo16086b(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m23608a(int i, int i2, C6244e eVar, C6434p pVar) {
        Socket socket;
        Proxy b = this.f15536r.mo16086b();
        C6224a a = this.f15536r.mo16085a();
        Type type = b.type();
        if (type != null) {
            int i3 = C6281g.f15541a[type.ordinal()];
            if (i3 == 1 || i3 == 2) {
                socket = a.mo16003i().createSocket();
                if (socket == null) {
                    C5942k.m22323a();
                    throw null;
                }
                this.f15520b = socket;
                pVar.mo16571a(eVar, this.f15536r.mo16088d(), b);
                socket.setSoTimeout(i2);
                C6380h.f15831c.mo16477a().mo16448a(socket, this.f15536r.mo16088d(), i);
                this.f15525g = C6493o.m24623a(C6493o.m24627b(socket));
                this.f15526h = C6493o.m24622a(C6493o.m24624a(socket));
            }
        }
        socket = new Socket(b);
        this.f15520b = socket;
        pVar.mo16571a(eVar, this.f15536r.mo16088d(), b);
        socket.setSoTimeout(i2);
        try {
            C6380h.f15831c.mo16477a().mo16448a(socket, this.f15536r.mo16088d(), i);
            try {
                this.f15525g = C6493o.m24623a(C6493o.m24627b(socket));
                this.f15526h = C6493o.m24622a(C6493o.m24624a(socket));
            } catch (NullPointerException e) {
                if (C5942k.m22326a((Object) e.getMessage(), (Object) "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.f15536r.mo16088d());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23609a(p337m.p338f0.p341e.C6268b r11) {
        /*
            r10 = this;
            m.d0 r0 = r10.f15536r
            m.a r0 = r0.mo16085a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo16004j()
            r2 = 0
            if (r1 == 0) goto L_0x0188
            java.net.Socket r3 = r10.f15520b     // Catch:{ all -> 0x0186 }
            m.t r4 = r0.mo16005k()     // Catch:{ all -> 0x0186 }
            java.lang.String r4 = r4.mo16629g()     // Catch:{ all -> 0x0186 }
            m.t r5 = r0.mo16005k()     // Catch:{ all -> 0x0186 }
            int r5 = r5.mo16634k()     // Catch:{ all -> 0x0186 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x017e
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0186 }
            m.k r11 = r11.mo16138a(r1)     // Catch:{ all -> 0x017b }
            boolean r3 = r11.mo16537c()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0047
            m.f0.i.h$a r3 = p337m.p338f0.p345i.C6380h.f15831c     // Catch:{ all -> 0x017b }
            m.f0.i.h r3 = r3.mo16477a()     // Catch:{ all -> 0x017b }
            m.t r4 = r0.mo16005k()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = r4.mo16629g()     // Catch:{ all -> 0x017b }
            java.util.List r5 = r0.mo15997e()     // Catch:{ all -> 0x017b }
            r3.mo16441a(r1, r4, r5)     // Catch:{ all -> 0x017b }
        L_0x0047:
            r1.startHandshake()     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x017b }
            m.r$a r4 = p337m.C6441r.f15943f     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "sslSocketSession"
            p308k.p323z.p325d.C5942k.m22324a(r3, r5)     // Catch:{ all -> 0x017b }
            m.r r4 = r4.mo16601a(r3)     // Catch:{ all -> 0x017b }
            javax.net.ssl.HostnameVerifier r5 = r0.mo15996d()     // Catch:{ all -> 0x017b }
            if (r5 == 0) goto L_0x0177
            m.t r7 = r0.mo16005k()     // Catch:{ all -> 0x017b }
            java.lang.String r7 = r7.mo16629g()     // Catch:{ all -> 0x017b }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x017b }
            if (r3 != 0) goto L_0x0106
            java.util.List r11 = r4.mo16596c()     // Catch:{ all -> 0x017b }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x017b }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00e2
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x017b }
            if (r11 != 0) goto L_0x0087
            k.q r11 = new k.q     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x017b }
            throw r11     // Catch:{ all -> 0x017b }
        L_0x0087:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x017b }
            m.t r0 = r0.mo16005k()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.mo16629g()     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            m.g$b r0 = p337m.C6407g.f15861d     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.mo16515a(r11)     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "cert.subjectDN"
            p308k.p323z.p325d.C5942k.m22324a(r0, r5)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            m.f0.k.d r0 = p337m.p338f0.p348k.C6405d.f15859a     // Catch:{ all -> 0x017b }
            java.util.List r11 = r0.mo16504a(r11)     // Catch:{ all -> 0x017b }
            r4.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x017b }
            java.lang.String r11 = p308k.p313e0.C5778i.m21957a(r11, r2, r6, r2)     // Catch:{ all -> 0x017b }
            r3.<init>(r11)     // Catch:{ all -> 0x017b }
            throw r3     // Catch:{ all -> 0x017b }
        L_0x00e2:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r2.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x017b }
            m.t r0 = r0.mo16005k()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.mo16629g()     // Catch:{ all -> 0x017b }
            r2.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x017b }
            r11.<init>(r0)     // Catch:{ all -> 0x017b }
            throw r11     // Catch:{ all -> 0x017b }
        L_0x0106:
            m.g r3 = r0.mo15992a()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0173
            m.r r5 = new m.r     // Catch:{ all -> 0x017b }
            m.e0 r6 = r4.mo16597d()     // Catch:{ all -> 0x017b }
            m.h r7 = r4.mo16594a()     // Catch:{ all -> 0x017b }
            java.util.List r8 = r4.mo16595b()     // Catch:{ all -> 0x017b }
            m.f0.e.f$b r9 = new m.f0.e.f$b     // Catch:{ all -> 0x017b }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x017b }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x017b }
            r10.f15522d = r5     // Catch:{ all -> 0x017b }
            m.t r0 = r0.mo16005k()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.mo16629g()     // Catch:{ all -> 0x017b }
            m.f0.e.f$c r4 = new m.f0.e.f$c     // Catch:{ all -> 0x017b }
            r4.<init>(r10)     // Catch:{ all -> 0x017b }
            r3.mo16511a(r0, r4)     // Catch:{ all -> 0x017b }
            boolean r11 = r11.mo16537c()     // Catch:{ all -> 0x017b }
            if (r11 == 0) goto L_0x0144
            m.f0.i.h$a r11 = p337m.p338f0.p345i.C6380h.f15831c     // Catch:{ all -> 0x017b }
            m.f0.i.h r11 = r11.mo16477a()     // Catch:{ all -> 0x017b }
            java.lang.String r2 = r11.mo16442b(r1)     // Catch:{ all -> 0x017b }
        L_0x0144:
            r10.f15521c = r1     // Catch:{ all -> 0x017b }
            n.y r11 = p350n.C6493o.m24627b(r1)     // Catch:{ all -> 0x017b }
            n.g r11 = p350n.C6493o.m24623a(r11)     // Catch:{ all -> 0x017b }
            r10.f15525g = r11     // Catch:{ all -> 0x017b }
            n.w r11 = p350n.C6493o.m24624a(r1)     // Catch:{ all -> 0x017b }
            n.f r11 = p350n.C6493o.m24622a(r11)     // Catch:{ all -> 0x017b }
            r10.f15526h = r11     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x0163
            m.y$a r11 = p337m.C6465y.f16066n     // Catch:{ all -> 0x017b }
            m.y r11 = r11.mo16746a(r2)     // Catch:{ all -> 0x017b }
            goto L_0x0165
        L_0x0163:
            m.y r11 = p337m.C6465y.HTTP_1_1     // Catch:{ all -> 0x017b }
        L_0x0165:
            r10.f15523e = r11     // Catch:{ all -> 0x017b }
            if (r1 == 0) goto L_0x0172
            m.f0.i.h$a r11 = p337m.p338f0.p345i.C6380h.f15831c
            m.f0.i.h r11 = r11.mo16477a()
            r11.mo16466a(r1)
        L_0x0172:
            return
        L_0x0173:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x0177:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x017b:
            r11 = move-exception
            r2 = r1
            goto L_0x018c
        L_0x017e:
            k.q r11 = new k.q     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x0186 }
            throw r11     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r11 = move-exception
            goto L_0x018c
        L_0x0188:
            p308k.p323z.p325d.C5942k.m22323a()     // Catch:{ all -> 0x0186 }
            throw r2
        L_0x018c:
            if (r2 == 0) goto L_0x0197
            m.f0.i.h$a r0 = p337m.p338f0.p345i.C6380h.f15831c
            m.f0.i.h r0 = r0.mo16477a()
            r0.mo16466a(r2)
        L_0x0197:
            if (r2 == 0) goto L_0x019c
            p337m.p338f0.C6250b.m23458a(r2)
        L_0x019c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6277f.m23609a(m.f0.e.b):void");
    }

    /* renamed from: a */
    private final void m23610a(C6268b bVar, int i, C6244e eVar, C6434p pVar) {
        if (this.f15536r.mo16085a().mo16004j() != null) {
            pVar.mo16590h(eVar);
            m23609a(bVar);
            pVar.mo16576a(eVar, this.f15522d);
            if (this.f15523e == C6465y.HTTP_2) {
                m23613b(i);
            }
        } else if (this.f15536r.mo16085a().mo15997e().contains(C6465y.H2_PRIOR_KNOWLEDGE)) {
            this.f15521c = this.f15520b;
            this.f15523e = C6465y.H2_PRIOR_KNOWLEDGE;
            m23613b(i);
        } else {
            this.f15521c = this.f15520b;
            this.f15523e = C6465y.HTTP_1_1;
        }
    }

    /* renamed from: a */
    private final boolean m23611a(List<C6243d0> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C6243d0 d0Var : list) {
                if (d0Var.mo16086b().type() == Type.DIRECT && this.f15536r.mo16086b().type() == Type.DIRECT && C5942k.m22326a((Object) this.f15536r.mo16088d(), (Object) d0Var.mo16088d())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m23612a(C6448t tVar, C6441r rVar) {
        List c = rVar.mo16596c();
        if (!c.isEmpty()) {
            C6405d dVar = C6405d.f15859a;
            String g = tVar.mo16629g();
            Object obj = c.get(0);
            if (obj == null) {
                throw new C5809q("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } else if (dVar.mo16505a(g, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m23613b(int i) {
        Socket socket = this.f15521c;
        if (socket != null) {
            C6484g gVar = this.f15525g;
            if (gVar != null) {
                C6483f fVar = this.f15526h;
                if (fVar != null) {
                    socket.setSoTimeout(0);
                    C6325b bVar = new C6325b(true, C6262d.f15453h);
                    bVar.mo16328a(socket, this.f15536r.mo16085a().mo16005k().mo16629g(), gVar, fVar);
                    bVar.mo16329a((C6327d) this);
                    bVar.mo16327a(i);
                    C6323f a = bVar.mo16330a();
                    this.f15524f = a;
                    this.f15532n = C6323f.f15658I.mo16340a().mo16436c();
                    C6323f.m23791a(a, false, 1, (Object) null);
                    return;
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: n */
    private final C6467z m23614n() {
        C6468a aVar = new C6468a();
        aVar.mo16764a(this.f15536r.mo16085a().mo16005k());
        aVar.mo16761a("CONNECT", (C6225a0) null);
        aVar.mo16767b("Host", C6250b.m23447a(this.f15536r.mo16085a().mo16005k(), true));
        aVar.mo16767b("Proxy-Connection", "Keep-Alive");
        aVar.mo16767b("User-Agent", "okhttp/4.4.1");
        C6467z a = aVar.mo16765a();
        C6233a aVar2 = new C6233a();
        aVar2.mo16045a(a);
        aVar2.mo16044a(C6465y.HTTP_1_1);
        aVar2.mo16036a(407);
        aVar2.mo16038a("Preemptive Authenticate");
        aVar2.mo16041a(C6250b.f15417c);
        aVar2.mo16049b(-1);
        aVar2.mo16037a(-1);
        aVar2.mo16050b("Proxy-Authenticate", "OkHttp-Preemptive");
        C6467z a2 = this.f15536r.mo16085a().mo16000g().mo16016a(this.f15536r, aVar2.mo16046a());
        return a2 != null ? a2 : a;
    }

    /* renamed from: a */
    public final C6295d mo16196a(C6462x xVar, C6299g gVar) {
        C5942k.m22327b(xVar, "client");
        C5942k.m22327b(gVar, "chain");
        Socket socket = this.f15521c;
        if (socket != null) {
            C6484g gVar2 = this.f15525g;
            if (gVar2 != null) {
                C6483f fVar = this.f15526h;
                if (fVar != null) {
                    C6323f fVar2 = this.f15524f;
                    if (fVar2 != null) {
                        return new C6342g(xVar, this, gVar, fVar2);
                    }
                    socket.setSoTimeout(gVar.mo16261i());
                    gVar2.mo16270b().mo16882a((long) gVar.mo16257e(), TimeUnit.MILLISECONDS);
                    fVar.mo16272b().mo16882a((long) gVar.mo16260h(), TimeUnit.MILLISECONDS);
                    return new C6306a(xVar, this, gVar2, fVar);
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public C6465y mo16197a() {
        C6465y yVar = this.f15523e;
        if (yVar != null) {
            return yVar;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public final void mo16198a(int i) {
        this.f15530l = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014c A[EDGE_INSN: B:62:0x014c->B:56:0x014c ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16199a(int r17, int r18, int r19, int r20, boolean r21, p337m.C6244e r22, p337m.C6434p r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            p308k.p323z.p325d.C5942k.m22327b(r8, r0)
            java.lang.String r0 = "eventListener"
            p308k.p323z.p325d.C5942k.m22327b(r9, r0)
            m.y r0 = r7.f15523e
            r10 = 1
            if (r0 != 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x015a
            m.d0 r0 = r7.f15536r
            m.a r0 = r0.mo16085a()
            java.util.List r0 = r0.mo15994b()
            m.f0.e.b r11 = new m.f0.e.b
            r11.<init>(r0)
            m.d0 r1 = r7.f15536r
            m.a r1 = r1.mo16085a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo16004j()
            if (r1 != 0) goto L_0x0086
            m.k r1 = p337m.C6422k.f15903h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0079
            m.d0 r0 = r7.f15536r
            m.a r0 = r0.mo16085a()
            m.t r0 = r0.mo16005k()
            java.lang.String r0 = r0.mo16629g()
            m.f0.i.h$a r1 = p337m.p338f0.p345i.C6380h.f15831c
            m.f0.i.h r1 = r1.mo16477a()
            boolean r1 = r1.mo16443b(r0)
            if (r1 == 0) goto L_0x0058
            goto L_0x0098
        L_0x0058:
            m.f0.e.j r1 = new m.f0.e.j
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0079:
            m.f0.e.j r0 = new m.f0.e.j
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0086:
            m.d0 r0 = r7.f15536r
            m.a r0 = r0.mo16085a()
            java.util.List r0 = r0.mo15997e()
            m.y r1 = p337m.C6465y.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x014d
        L_0x0098:
            r12 = 0
            r13 = r12
        L_0x009a:
            m.d0 r0 = r7.f15536r     // Catch:{ IOException -> 0x00fd }
            boolean r0 = r0.mo16087c()     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x00bb
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m23607a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00fd }
            java.net.Socket r0 = r7.f15520b     // Catch:{ IOException -> 0x00fd }
            if (r0 != 0) goto L_0x00b6
            goto L_0x00d8
        L_0x00b6:
            r14 = r17
            r15 = r18
            goto L_0x00c2
        L_0x00bb:
            r14 = r17
            r15 = r18
            r7.m23608a(r14, r15, r8, r9)     // Catch:{ IOException -> 0x00fb }
        L_0x00c2:
            r6 = r20
            r7.m23610a(r11, r6, r8, r9)     // Catch:{ IOException -> 0x00f9 }
            m.d0 r0 = r7.f15536r     // Catch:{ IOException -> 0x00f9 }
            java.net.InetSocketAddress r0 = r0.mo16088d()     // Catch:{ IOException -> 0x00f9 }
            m.d0 r1 = r7.f15536r     // Catch:{ IOException -> 0x00f9 }
            java.net.Proxy r1 = r1.mo16086b()     // Catch:{ IOException -> 0x00f9 }
            m.y r2 = r7.f15523e     // Catch:{ IOException -> 0x00f9 }
            r9.mo16572a(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f9 }
        L_0x00d8:
            m.d0 r0 = r7.f15536r
            boolean r0 = r0.mo16087c()
            if (r0 == 0) goto L_0x00f2
            java.net.Socket r0 = r7.f15520b
            if (r0 == 0) goto L_0x00e5
            goto L_0x00f2
        L_0x00e5:
            m.f0.e.j r0 = new m.f0.e.j
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            long r0 = java.lang.System.nanoTime()
            r7.f15534p = r0
            return
        L_0x00f9:
            r0 = move-exception
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x0102
        L_0x00fd:
            r0 = move-exception
            r14 = r17
            r15 = r18
        L_0x0102:
            r6 = r20
        L_0x0104:
            java.net.Socket r1 = r7.f15521c
            if (r1 == 0) goto L_0x010b
            p337m.p338f0.C6250b.m23458a(r1)
        L_0x010b:
            java.net.Socket r1 = r7.f15520b
            if (r1 == 0) goto L_0x0112
            p337m.p338f0.C6250b.m23458a(r1)
        L_0x0112:
            r7.f15521c = r12
            r7.f15520b = r12
            r7.f15525g = r12
            r7.f15526h = r12
            r7.f15522d = r12
            r7.f15523e = r12
            r7.f15524f = r12
            r7.f15532n = r10
            m.d0 r1 = r7.f15536r
            java.net.InetSocketAddress r3 = r1.mo16088d()
            m.d0 r1 = r7.f15536r
            java.net.Proxy r4 = r1.mo16086b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo16573a(r2, r3, r4, r5, r6)
            if (r13 != 0) goto L_0x013f
            m.f0.e.j r13 = new m.f0.e.j
            r13.<init>(r0)
            goto L_0x0142
        L_0x013f:
            r13.mo16230a(r0)
        L_0x0142:
            if (r21 == 0) goto L_0x014c
            boolean r0 = r11.mo16139a(r0)
            if (r0 == 0) goto L_0x014c
            goto L_0x009a
        L_0x014c:
            throw r13
        L_0x014d:
            m.f0.e.j r0 = new m.f0.e.j
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6277f.mo16199a(int, int, int, int, boolean, m.e, m.p):void");
    }

    /* renamed from: a */
    public final void mo16200a(long j) {
        this.f15534p = j;
    }

    /* renamed from: a */
    public final void mo16201a(C6273e eVar, IOException iOException) {
        int i;
        C5942k.m22327b(eVar, "call");
        C6282h hVar = this.f15535q;
        if (!C6250b.f15421g || !Thread.holdsLock(hVar)) {
            synchronized (this.f15535q) {
                if (!(iOException instanceof C6362n)) {
                    if (!mo16216i() || (iOException instanceof C6314a)) {
                        this.f15527i = true;
                        if (this.f15530l == 0) {
                            if (iOException != null) {
                                mo16204a(eVar.mo16177b(), this.f15536r, iOException);
                            }
                            i = this.f15529k;
                        }
                    }
                    C5812t tVar = C5812t.f14872a;
                } else if (((C6362n) iOException).f15797f == C6315b.REFUSED_STREAM) {
                    int i2 = this.f15531m + 1;
                    this.f15531m = i2;
                    if (i2 > 1) {
                        this.f15527i = true;
                        i = this.f15529k;
                    }
                    C5812t tVar2 = C5812t.f14872a;
                } else if (((C6362n) iOException).f15797f != C6315b.CANCEL || !eVar.mo16096i()) {
                    this.f15527i = true;
                    i = this.f15529k;
                } else {
                    C5812t tVar22 = C5812t.f14872a;
                }
                this.f15529k = i + 1;
                C5812t tVar222 = C5812t.f14872a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public void mo16202a(C6323f fVar, C6360m mVar) {
        C5942k.m22327b(fVar, "connection");
        C5942k.m22327b(mVar, "settings");
        synchronized (this.f15535q) {
            this.f15532n = mVar.mo16436c();
            C5812t tVar = C5812t.f14872a;
        }
    }

    /* renamed from: a */
    public void mo16203a(C6348i iVar) {
        C5942k.m22327b(iVar, "stream");
        iVar.mo16369a(C6315b.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: a */
    public final void mo16204a(C6462x xVar, C6243d0 d0Var, IOException iOException) {
        C5942k.m22327b(xVar, "client");
        C5942k.m22327b(d0Var, "failedRoute");
        C5942k.m22327b(iOException, "failure");
        if (d0Var.mo16086b().type() != Type.DIRECT) {
            C6224a a = d0Var.mo16085a();
            a.mo16001h().connectFailed(a.mo16005k().mo16638o(), d0Var.mo16086b().address(), iOException);
        }
        xVar.mo16702t().mo16227b(d0Var);
    }

    /* renamed from: a */
    public final boolean mo16205a(C6224a aVar, List<C6243d0> list) {
        C5942k.m22327b(aVar, "address");
        if (this.f15533o.size() >= this.f15532n || this.f15527i || !this.f15536r.mo16085a().mo15993a(aVar)) {
            return false;
        }
        if (C5942k.m22326a((Object) aVar.mo16005k().mo16629g(), (Object) mo16219l().mo16085a().mo16005k().mo16629g())) {
            return true;
        }
        if (this.f15524f == null || list == null || !m23611a(list) || aVar.mo15996d() != C6405d.f15859a || !mo16206a(aVar.mo16005k())) {
            return false;
        }
        try {
            C6407g a = aVar.mo15992a();
            if (a != null) {
                String g = aVar.mo16005k().mo16629g();
                C6441r h = mo16215h();
                if (h != null) {
                    a.mo16510a(g, h.mo16596c());
                    return true;
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo16206a(C6448t tVar) {
        C5942k.m22327b(tVar, "url");
        C6448t k = this.f15536r.mo16085a().mo16005k();
        boolean z = false;
        if (tVar.mo16634k() != k.mo16634k()) {
            return false;
        }
        if (C5942k.m22326a((Object) tVar.mo16629g(), (Object) k.mo16629g())) {
            return true;
        }
        if (!this.f15528j) {
            C6441r rVar = this.f15522d;
            if (rVar != null) {
                if (rVar == null) {
                    C5942k.m22323a();
                    throw null;
                } else if (m23612a(tVar, rVar)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo16207a(boolean z) {
        long nanoTime = System.nanoTime();
        Socket socket = this.f15521c;
        if (socket != null) {
            C6484g gVar = this.f15525g;
            if (gVar == null) {
                C5942k.m22323a();
                throw null;
            } else if (socket.isClosed() || socket.isInputShutdown() || socket.isOutputShutdown()) {
                return false;
            } else {
                C6323f fVar = this.f15524f;
                if (fVar != null) {
                    return fVar.mo16315d(nanoTime);
                }
                if (nanoTime - this.f15534p < 10000000000L || !z) {
                    return true;
                }
                return C6250b.m23462a(socket, gVar);
            }
        } else {
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo16208b() {
        Socket socket = this.f15520b;
        if (socket != null) {
            C6250b.m23458a(socket);
        }
    }

    /* renamed from: b */
    public final void mo16209b(boolean z) {
        this.f15527i = z;
    }

    /* renamed from: c */
    public final List<Reference<C6273e>> mo16210c() {
        return this.f15533o;
    }

    /* renamed from: d */
    public final long mo16211d() {
        return this.f15534p;
    }

    /* renamed from: e */
    public final boolean mo16212e() {
        return this.f15527i;
    }

    /* renamed from: f */
    public final int mo16213f() {
        return this.f15529k;
    }

    /* renamed from: g */
    public final int mo16214g() {
        return this.f15530l;
    }

    /* renamed from: h */
    public C6441r mo16215h() {
        return this.f15522d;
    }

    /* renamed from: i */
    public final boolean mo16216i() {
        return this.f15524f != null;
    }

    /* renamed from: j */
    public final void mo16217j() {
        C6282h hVar = this.f15535q;
        if (!C6250b.f15421g || !Thread.holdsLock(hVar)) {
            synchronized (this.f15535q) {
                this.f15528j = true;
                C5812t tVar = C5812t.f14872a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: k */
    public final void mo16218k() {
        C6282h hVar = this.f15535q;
        if (!C6250b.f15421g || !Thread.holdsLock(hVar)) {
            synchronized (this.f15535q) {
                this.f15527i = true;
                C5812t tVar = C5812t.f14872a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(hVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: l */
    public C6243d0 mo16219l() {
        return this.f15536r;
    }

    /* renamed from: m */
    public Socket mo16220m() {
        Socket socket = this.f15521c;
        if (socket != null) {
            return socket;
        }
        C5942k.m22323a();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005f, code lost:
        if (r1 != null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Connection{"
            r0.append(r1)
            m.d0 r1 = r2.f15536r
            m.a r1 = r1.mo16085a()
            m.t r1 = r1.mo16005k()
            java.lang.String r1 = r1.mo16629g()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            m.d0 r1 = r2.f15536r
            m.a r1 = r1.mo16085a()
            m.t r1 = r1.mo16005k()
            int r1 = r1.mo16634k()
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            java.lang.String r1 = " proxy="
            r0.append(r1)
            m.d0 r1 = r2.f15536r
            java.net.Proxy r1 = r1.mo16086b()
            r0.append(r1)
            java.lang.String r1 = " hostAddress="
            r0.append(r1)
            m.d0 r1 = r2.f15536r
            java.net.InetSocketAddress r1 = r1.mo16088d()
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            m.r r1 = r2.f15522d
            if (r1 == 0) goto L_0x0062
            m.h r1 = r1.mo16594a()
            if (r1 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            java.lang.String r1 = "none"
        L_0x0064:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            m.y r1 = r2.f15523e
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p341e.C6277f.toString():java.lang.String");
    }
}
