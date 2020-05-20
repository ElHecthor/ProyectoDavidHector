package p337m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;

/* renamed from: m.k */
public final class C6422k {

    /* renamed from: e */
    private static final C6417h[] f15900e = {C6417h.f15894q, C6417h.f15895r, C6417h.f15896s, C6417h.f15888k, C6417h.f15890m, C6417h.f15889l, C6417h.f15891n, C6417h.f15893p, C6417h.f15892o};

    /* renamed from: f */
    private static final C6417h[] f15901f = {C6417h.f15894q, C6417h.f15895r, C6417h.f15896s, C6417h.f15888k, C6417h.f15890m, C6417h.f15889l, C6417h.f15891n, C6417h.f15893p, C6417h.f15892o, C6417h.f15886i, C6417h.f15887j, C6417h.f15884g, C6417h.f15885h, C6417h.f15882e, C6417h.f15883f, C6417h.f15881d};

    /* renamed from: g */
    public static final C6422k f15902g;

    /* renamed from: h */
    public static final C6422k f15903h = new C6423a(false).mo16546a();

    /* renamed from: a */
    private final boolean f15904a;

    /* renamed from: b */
    private final boolean f15905b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String[] f15906c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String[] f15907d;

    /* renamed from: m.k$a */
    public static final class C6423a {

        /* renamed from: a */
        private boolean f15908a;

        /* renamed from: b */
        private String[] f15909b;

        /* renamed from: c */
        private String[] f15910c;

        /* renamed from: d */
        private boolean f15911d;

        public C6423a(C6422k kVar) {
            C5942k.m22327b(kVar, "connectionSpec");
            this.f15908a = kVar.mo16536b();
            this.f15909b = kVar.f15906c;
            this.f15910c = kVar.f15907d;
            this.f15911d = kVar.mo16537c();
        }

        public C6423a(boolean z) {
            this.f15908a = z;
        }

        /* renamed from: a */
        public final C6423a mo16542a(boolean z) {
            if (this.f15908a) {
                this.f15911d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C6423a mo16543a(String... strArr) {
            C5942k.m22327b(strArr, "cipherSuites");
            if (this.f15908a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f15909b = (String[]) clone;
                        return this;
                    }
                    throw new C5809q("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C6423a mo16544a(C6246e0... e0VarArr) {
            C5942k.m22327b(e0VarArr, "tlsVersions");
            if (this.f15908a) {
                ArrayList arrayList = new ArrayList(e0VarArr.length);
                for (C6246e0 f : e0VarArr) {
                    arrayList.add(f.mo16098f());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    mo16547b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C6423a mo16545a(C6417h... hVarArr) {
            C5942k.m22327b(hVarArr, "cipherSuites");
            if (this.f15908a) {
                ArrayList arrayList = new ArrayList(hVarArr.length);
                for (C6417h a : hVarArr) {
                    arrayList.add(a.mo16526a());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    mo16543a((String[]) Arrays.copyOf(strArr, strArr.length));
                    return this;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        /* renamed from: a */
        public final C6422k mo16546a() {
            return new C6422k(this.f15908a, this.f15911d, this.f15909b, this.f15910c);
        }

        /* renamed from: b */
        public final C6423a mo16547b(String... strArr) {
            C5942k.m22327b(strArr, "tlsVersions");
            if (this.f15908a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    if (clone != null) {
                        this.f15910c = (String[]) clone;
                        return this;
                    }
                    throw new C5809q("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }

    /* renamed from: m.k$b */
    public static final class C6424b {
        private C6424b() {
        }

        public /* synthetic */ C6424b(C5938g gVar) {
            this();
        }
    }

    static {
        new C6424b(null);
        C6423a aVar = new C6423a(true);
        C6417h[] hVarArr = f15900e;
        aVar.mo16545a((C6417h[]) Arrays.copyOf(hVarArr, hVarArr.length));
        aVar.mo16544a(C6246e0.TLS_1_3, C6246e0.TLS_1_2);
        aVar.mo16542a(true);
        aVar.mo16546a();
        C6423a aVar2 = new C6423a(true);
        C6417h[] hVarArr2 = f15901f;
        aVar2.mo16545a((C6417h[]) Arrays.copyOf(hVarArr2, hVarArr2.length));
        aVar2.mo16544a(C6246e0.TLS_1_3, C6246e0.TLS_1_2);
        aVar2.mo16542a(true);
        f15902g = aVar2.mo16546a();
        C6423a aVar3 = new C6423a(true);
        C6417h[] hVarArr3 = f15901f;
        aVar3.mo16545a((C6417h[]) Arrays.copyOf(hVarArr3, hVarArr3.length));
        aVar3.mo16544a(C6246e0.TLS_1_3, C6246e0.TLS_1_2, C6246e0.TLS_1_1, C6246e0.TLS_1_0);
        aVar3.mo16542a(true);
        aVar3.mo16546a();
    }

    public C6422k(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f15904a = z;
        this.f15905b = z2;
        this.f15906c = strArr;
        this.f15907d = strArr2;
    }

    /* renamed from: b */
    private final C6422k m24172b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f15906c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C5942k.m22324a((Object) enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = C6250b.m23473b(enabledCipherSuites, this.f15906c, C6417h.f15897t.mo16530a());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15907d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C5942k.m22324a((Object) enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = C6250b.m23473b(enabledProtocols, this.f15907d, C5854b.m22212a());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C5942k.m22324a((Object) supportedCipherSuites, "supportedCipherSuites");
        int a = C6250b.m23441a(supportedCipherSuites, "TLS_FALLBACK_SCSV", C6417h.f15897t.mo16530a());
        String str = "cipherSuitesIntersection";
        if (z && a != -1) {
            C5942k.m22324a((Object) strArr, str);
            String str2 = supportedCipherSuites[a];
            C5942k.m22324a((Object) str2, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = C6250b.m23466a(strArr, str2);
        }
        C6423a aVar = new C6423a(this);
        C5942k.m22324a((Object) strArr, str);
        aVar.mo16543a((String[]) Arrays.copyOf(strArr, strArr.length));
        C5942k.m22324a((Object) strArr2, "tlsVersionsIntersection");
        aVar.mo16547b((String[]) Arrays.copyOf(strArr2, strArr2.length));
        return aVar.mo16546a();
    }

    /* renamed from: a */
    public final List<C6417h> mo16533a() {
        String[] strArr = this.f15906c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C6417h.f15897t.mo16531a(a));
        }
        return C5845t.m22184d((Iterable<? extends T>) arrayList);
    }

    /* renamed from: a */
    public final void mo16534a(SSLSocket sSLSocket, boolean z) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C6422k b = m24172b(sSLSocket, z);
        if (b.mo16538d() != null) {
            sSLSocket.setEnabledProtocols(b.f15907d);
        }
        if (b.mo16533a() != null) {
            sSLSocket.setEnabledCipherSuites(b.f15906c);
        }
    }

    /* renamed from: a */
    public final boolean mo16535a(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "socket");
        if (!this.f15904a) {
            return false;
        }
        String[] strArr = this.f15907d;
        if (strArr != null && !C6250b.m23465a(strArr, sSLSocket.getEnabledProtocols(), C5854b.m22212a())) {
            return false;
        }
        String[] strArr2 = this.f15906c;
        return strArr2 == null || C6250b.m23465a(strArr2, sSLSocket.getEnabledCipherSuites(), C6417h.f15897t.mo16530a());
    }

    /* renamed from: b */
    public final boolean mo16536b() {
        return this.f15904a;
    }

    /* renamed from: c */
    public final boolean mo16537c() {
        return this.f15905b;
    }

    /* renamed from: d */
    public final List<C6246e0> mo16538d() {
        String[] strArr = this.f15907d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(C6246e0.f15413m.mo16099a(a));
        }
        return C5845t.m22184d((Iterable<? extends T>) arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6422k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f15904a;
        C6422k kVar = (C6422k) obj;
        if (z != kVar.f15904a) {
            return false;
        }
        return !z || (Arrays.equals(this.f15906c, kVar.f15906c) && Arrays.equals(this.f15907d, kVar.f15907d) && this.f15905b == kVar.f15905b);
    }

    public int hashCode() {
        if (!this.f15904a) {
            return 17;
        }
        String[] strArr = this.f15906c;
        int i = 0;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f15907d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.f15905b ^ true ? 1 : 0);
    }

    public String toString() {
        if (!this.f15904a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(");
        sb.append("cipherSuites=");
        String str = "[all enabled]";
        sb.append(Objects.toString(mo16533a(), str));
        String str2 = ", ";
        sb.append(str2);
        sb.append("tlsVersions=");
        sb.append(Objects.toString(mo16538d(), str));
        sb.append(str2);
        sb.append("supportsTlsExtensions=");
        sb.append(this.f15905b);
        sb.append(')');
        return sb.toString();
    }
}
