package p337m;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p308k.C5797g;
import p308k.p311c0.C5742e;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5944m;
import p308k.p323z.p325d.C5945n;
import p308k.p323z.p325d.C5950s;
import p337m.p338f0.C6250b;

/* renamed from: m.r */
public final class C6441r {

    /* renamed from: e */
    static final /* synthetic */ C5742e[] f15942e;

    /* renamed from: f */
    public static final C6442a f15943f = new C6442a(null);

    /* renamed from: a */
    private final C5797g f15944a;

    /* renamed from: b */
    private final C6246e0 f15945b;

    /* renamed from: c */
    private final C6417h f15946c;

    /* renamed from: d */
    private final List<Certificate> f15947d;

    /* renamed from: m.r$a */
    public static final class C6442a {

        /* renamed from: m.r$a$a */
        static final class C6443a extends C5943l implements C5907a<List<? extends Certificate>> {

            /* renamed from: g */
            final /* synthetic */ List f15948g;

            C6443a(List list) {
                this.f15948g = list;
                super(0);
            }

            public final List<Certificate> invoke() {
                return this.f15948g;
            }
        }

        private C6442a() {
        }

        public /* synthetic */ C6442a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        private final List<Certificate> m24254a(Certificate[] certificateArr) {
            return certificateArr != null ? C6250b.m23451a((T[]) (Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : C5837l.m22159a();
        }

        /* renamed from: a */
        public final C6441r mo16601a(SSLSession sSLSession) {
            List list;
            C5942k.m22327b(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("cipherSuite == ");
                    sb.append(cipherSuite);
                    throw new IOException(sb.toString());
                }
                C6417h a = C6417h.f15897t.mo16531a(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol == null) {
                    throw new IllegalStateException("tlsVersion == null".toString());
                } else if (!C5942k.m22326a((Object) "NONE", (Object) protocol)) {
                    C6246e0 a2 = C6246e0.f15413m.mo16099a(protocol);
                    try {
                        list = m24254a(sSLSession.getPeerCertificates());
                    } catch (SSLPeerUnverifiedException unused) {
                        list = C5837l.m22159a();
                    }
                    return new C6441r(a2, a, m24254a(sSLSession.getLocalCertificates()), new C6443a(list));
                } else {
                    throw new IOException("tlsVersion == NONE");
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    /* renamed from: m.r$b */
    static final class C6444b extends C5943l implements C5907a<List<? extends Certificate>> {

        /* renamed from: g */
        final /* synthetic */ C5907a f15949g;

        C6444b(C5907a aVar) {
            this.f15949g = aVar;
            super(0);
        }

        public final List<Certificate> invoke() {
            try {
                return (List) this.f15949g.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C5837l.m22159a();
            }
        }
    }

    static {
        C5945n nVar = new C5945n(C5950s.m22341a(C6441r.class), "peerCertificates", "peerCertificates()Ljava/util/List;");
        C5950s.m22343a((C5944m) nVar);
        f15942e = new C5742e[]{nVar};
    }

    public C6441r(C6246e0 e0Var, C6417h hVar, List<? extends Certificate> list, C5907a<? extends List<? extends Certificate>> aVar) {
        C5942k.m22327b(e0Var, "tlsVersion");
        C5942k.m22327b(hVar, "cipherSuite");
        C5942k.m22327b(list, "localCertificates");
        C5942k.m22327b(aVar, "peerCertificatesFn");
        this.f15945b = e0Var;
        this.f15946c = hVar;
        this.f15947d = list;
        this.f15944a = C5799i.m22044a(new C6444b(aVar));
    }

    /* renamed from: a */
    private final String m24249a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C5942k.m22324a((Object) type, "type");
        return type;
    }

    /* renamed from: a */
    public final C6417h mo16594a() {
        return this.f15946c;
    }

    /* renamed from: b */
    public final List<Certificate> mo16595b() {
        return this.f15947d;
    }

    /* renamed from: c */
    public final List<Certificate> mo16596c() {
        C5797g gVar = this.f15944a;
        C5742e eVar = f15942e[0];
        return (List) gVar.getValue();
    }

    /* renamed from: d */
    public final C6246e0 mo16597d() {
        return this.f15945b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6441r) {
            C6441r rVar = (C6441r) obj;
            if (rVar.f15945b == this.f15945b && C5942k.m22326a((Object) rVar.f15946c, (Object) this.f15946c) && C5942k.m22326a((Object) rVar.mo16596c(), (Object) mo16596c()) && C5942k.m22326a((Object) rVar.f15947d, (Object) this.f15947d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f15945b.hashCode()) * 31) + this.f15946c.hashCode()) * 31) + mo16596c().hashCode()) * 31) + this.f15947d.hashCode();
    }

    public String toString() {
        List<Certificate> c = mo16596c();
        ArrayList arrayList = new ArrayList(C5838m.m22166a(c, 10));
        for (Certificate a : c) {
            arrayList.add(m24249a(a));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f15945b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f15946c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(obj);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.f15947d;
        ArrayList arrayList2 = new ArrayList(C5838m.m22166a(list, 10));
        for (Certificate a2 : list) {
            arrayList2.add(m24249a(a2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
