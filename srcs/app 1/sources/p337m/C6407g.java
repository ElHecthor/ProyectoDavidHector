package p337m;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p308k.C5809q;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5953v;
import p337m.p338f0.p348k.C6403c;
import p350n.C6485h;
import p350n.C6485h.C6486a;

/* renamed from: m.g */
public final class C6407g {

    /* renamed from: c */
    public static final C6407g f15860c = new C6408a().mo16514a();

    /* renamed from: d */
    public static final C6409b f15861d = new C6409b(null);

    /* renamed from: a */
    private final Set<C6410c> f15862a;

    /* renamed from: b */
    private final C6403c f15863b;

    /* renamed from: m.g$a */
    public static final class C6408a {

        /* renamed from: a */
        private final List<C6410c> f15864a = new ArrayList();

        /* renamed from: a */
        public final C6407g mo16514a() {
            return new C6407g(C5845t.m22188f((Iterable<? extends T>) this.f15864a), null);
        }
    }

    /* renamed from: m.g$b */
    public static final class C6409b {
        private C6409b() {
        }

        public /* synthetic */ C6409b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo16515a(Certificate certificate) {
            C5942k.m22327b(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder sb = new StringBuilder();
                sb.append("sha256/");
                sb.append(mo16517b((X509Certificate) certificate).mo16858f());
                return sb.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: a */
        public final C6485h mo16516a(X509Certificate x509Certificate) {
            C5942k.m22327b(x509Certificate, "$this$toSha1ByteString");
            C6486a aVar = C6485h.f16098j;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C5942k.m22324a((Object) publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C5942k.m22324a((Object) encoded, "publicKey.encoded");
            return C6486a.m24590a(aVar, encoded, 0, 0, 3, null).mo16866n();
        }

        /* renamed from: b */
        public final C6485h mo16517b(X509Certificate x509Certificate) {
            C5942k.m22327b(x509Certificate, "$this$toSha256ByteString");
            C6486a aVar = C6485h.f16098j;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C5942k.m22324a((Object) publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C5942k.m22324a((Object) encoded, "publicKey.encoded");
            return C6486a.m24590a(aVar, encoded, 0, 0, 3, null).mo16867o();
        }
    }

    /* renamed from: m.g$c */
    public static final class C6410c {

        /* renamed from: a */
        private final String f15865a;

        /* renamed from: b */
        private final String f15866b;

        /* renamed from: c */
        private final C6485h f15867c;

        /* renamed from: a */
        public final C6485h mo16518a() {
            return this.f15867c;
        }

        /* renamed from: a */
        public final boolean mo16519a(String str) {
            C5942k.m22327b(str, "hostname");
            if (C5787p.m21980b(this.f15865a, "**.", false, 2, null)) {
                int length = this.f15865a.length() - 3;
                int length2 = str.length() - length;
                if (!C5787p.m21974a(str, str.length() - length, this.f15865a, 3, length, false, 16, null)) {
                    return false;
                }
                if (!(length2 == 0 || str.charAt(length2 - 1) == '.')) {
                    return false;
                }
            } else if (!C5787p.m21980b(this.f15865a, "*.", false, 2, null)) {
                return C5942k.m22326a((Object) str, (Object) this.f15865a);
            } else {
                int length3 = this.f15865a.length() - 1;
                int length4 = str.length() - length3;
                if (!C5787p.m21974a(str, str.length() - length3, this.f15865a, 1, length3, false, 16, null)) {
                    return false;
                }
                if (C5788q.m22011b((CharSequence) str, '.', length4 - 1, false, 4, (Object) null) != -1) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final String mo16520b() {
            return this.f15866b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f15867c, (java.lang.Object) r3.f15867c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p337m.C6407g.C6410c
                if (r0 == 0) goto L_0x0027
                m.g$c r3 = (p337m.C6407g.C6410c) r3
                java.lang.String r0 = r2.f15865a
                java.lang.String r1 = r3.f15865a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = r2.f15866b
                java.lang.String r1 = r3.f15866b
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0027
                n.h r0 = r2.f15867c
                n.h r3 = r3.f15867c
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6407g.C6410c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f15865a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f15866b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C6485h hVar = this.f15867c;
            if (hVar != null) {
                i = hVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15866b);
            sb.append(this.f15867c.mo16858f());
            return sb.toString();
        }
    }

    /* renamed from: m.g$d */
    static final class C6411d extends C5943l implements C5907a<List<? extends X509Certificate>> {

        /* renamed from: g */
        final /* synthetic */ C6407g f15868g;

        /* renamed from: h */
        final /* synthetic */ List f15869h;

        /* renamed from: i */
        final /* synthetic */ String f15870i;

        C6411d(C6407g gVar, List list, String str) {
            this.f15868g = gVar;
            this.f15869h = list;
            this.f15870i = str;
            super(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r0 != null) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.security.cert.X509Certificate> invoke() {
            /*
                r3 = this;
                m.g r0 = r3.f15868g
                m.f0.k.c r0 = r0.mo16508a()
                if (r0 == 0) goto L_0x0013
                java.util.List r1 = r3.f15869h
                java.lang.String r2 = r3.f15870i
                java.util.List r0 = r0.mo16479a(r1, r2)
                if (r0 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                java.util.List r0 = r3.f15869h
            L_0x0015:
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = p308k.p314u.C5838m.m22166a(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x0024:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0040
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                if (r2 == 0) goto L_0x0038
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L_0x0024
            L_0x0038:
                k.q r0 = new k.q
                java.lang.String r1 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
                r0.<init>(r1)
                throw r0
            L_0x0040:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6407g.C6411d.invoke():java.util.List");
        }
    }

    public C6407g(Set<C6410c> set, C6403c cVar) {
        C5942k.m22327b(set, "pins");
        this.f15862a = set;
        this.f15863b = cVar;
    }

    /* renamed from: a */
    public final List<C6410c> mo16507a(String str) {
        C5942k.m22327b(str, "hostname");
        List<C6410c> a = C5837l.m22159a();
        for (C6410c cVar : this.f15862a) {
            if (cVar.mo16519a(str)) {
                if (a.isEmpty()) {
                    a = new ArrayList<>();
                }
                if (a != null) {
                    C5953v.m22352a((Object) a).add(cVar);
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlin.collections.MutableList<okhttp3.CertificatePinner.Pin>");
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C6403c mo16508a() {
        return this.f15863b;
    }

    /* renamed from: a */
    public final C6407g mo16509a(C6403c cVar) {
        return C5942k.m22326a((Object) this.f15863b, (Object) cVar) ? this : new C6407g(this.f15862a, cVar);
    }

    /* renamed from: a */
    public final void mo16510a(String str, List<? extends Certificate> list) {
        C5942k.m22327b(str, "hostname");
        C5942k.m22327b(list, "peerCertificates");
        mo16511a(str, (C5907a<? extends List<? extends X509Certificate>>) new C6411d<Object>(this, list, str));
    }

    /* renamed from: a */
    public final void mo16511a(String str, C5907a<? extends List<? extends X509Certificate>> aVar) {
        String str2;
        C6410c cVar;
        C5942k.m22327b(str, "hostname");
        C5942k.m22327b(aVar, "cleanedPeerCertificatesFn");
        List<C6410c> a = mo16507a(str);
        if (!a.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator it = a.iterator();
                C6485h hVar = null;
                C6485h hVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        cVar = (C6410c) it.next();
                        String b = cVar.mo16520b();
                        int hashCode = b.hashCode();
                        if (hashCode == 109397962) {
                            if (!b.equals("sha1/")) {
                                break loop0;
                            }
                            if (hVar == null) {
                                hVar = f15861d.mo16516a(x509Certificate);
                            }
                            if (C5942k.m22326a((Object) cVar.mo16518a(), (Object) hVar)) {
                                return;
                            }
                        } else if (hashCode != 2052263656 || !b.equals("sha256/")) {
                            break loop0;
                        } else {
                            if (hVar2 == null) {
                                hVar2 = f15861d.mo16517b(x509Certificate);
                            }
                            if (C5942k.m22326a((Object) cVar.mo16518a(), (Object) hVar2)) {
                                return;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unsupported hashAlgorithm: ");
                sb.append(cVar.mo16520b());
                throw new AssertionError(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            Iterator it2 = list.iterator();
            while (true) {
                str2 = "\n    ";
                if (!it2.hasNext()) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                sb2.append(str2);
                sb2.append(f15861d.mo16515a((Certificate) x509Certificate2));
                sb2.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C5942k.m22324a((Object) subjectDN, "element.subjectDN");
                sb2.append(subjectDN.getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            for (C6410c cVar2 : a) {
                sb2.append(str2);
                sb2.append(cVar2);
            }
            String sb3 = sb2.toString();
            C5942k.m22324a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb3);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6407g) {
            C6407g gVar = (C6407g) obj;
            if (C5942k.m22326a((Object) gVar.f15862a, (Object) this.f15862a) && C5942k.m22326a((Object) gVar.f15863b, (Object) this.f15863b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f15862a.hashCode()) * 41;
        C6403c cVar = this.f15863b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
