package p337m;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p308k.p323z.p325d.C5942k;
import p337m.C6448t.C6449a;
import p337m.p338f0.C6250b;

/* renamed from: m.a */
public final class C6224a {

    /* renamed from: a */
    private final C6448t f15327a;

    /* renamed from: b */
    private final List<C6465y> f15328b;

    /* renamed from: c */
    private final List<C6422k> f15329c;

    /* renamed from: d */
    private final C6431o f15330d;

    /* renamed from: e */
    private final SocketFactory f15331e;

    /* renamed from: f */
    private final SSLSocketFactory f15332f;

    /* renamed from: g */
    private final HostnameVerifier f15333g;

    /* renamed from: h */
    private final C6407g f15334h;

    /* renamed from: i */
    private final C6229b f15335i;

    /* renamed from: j */
    private final Proxy f15336j;

    /* renamed from: k */
    private final ProxySelector f15337k;

    public C6224a(String str, int i, C6431o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C6407g gVar, C6229b bVar, Proxy proxy, List<? extends C6465y> list, List<C6422k> list2, ProxySelector proxySelector) {
        C5942k.m22327b(str, "uriHost");
        C5942k.m22327b(oVar, "dns");
        C5942k.m22327b(socketFactory, "socketFactory");
        C5942k.m22327b(bVar, "proxyAuthenticator");
        C5942k.m22327b(list, "protocols");
        C5942k.m22327b(list2, "connectionSpecs");
        C5942k.m22327b(proxySelector, "proxySelector");
        this.f15330d = oVar;
        this.f15331e = socketFactory;
        this.f15332f = sSLSocketFactory;
        this.f15333g = hostnameVerifier;
        this.f15334h = gVar;
        this.f15335i = bVar;
        this.f15336j = proxy;
        this.f15337k = proxySelector;
        C6449a aVar = new C6449a();
        aVar.mo16651d(this.f15332f != null ? "https" : "http");
        aVar.mo16646b(str);
        aVar.mo16640a(i);
        this.f15327a = aVar.mo16644a();
        this.f15328b = C6250b.m23471b(list);
        this.f15329c = C6250b.m23471b(list2);
    }

    /* renamed from: a */
    public final C6407g mo15992a() {
        return this.f15334h;
    }

    /* renamed from: a */
    public final boolean mo15993a(C6224a aVar) {
        C5942k.m22327b(aVar, "that");
        return C5942k.m22326a((Object) this.f15330d, (Object) aVar.f15330d) && C5942k.m22326a((Object) this.f15335i, (Object) aVar.f15335i) && C5942k.m22326a((Object) this.f15328b, (Object) aVar.f15328b) && C5942k.m22326a((Object) this.f15329c, (Object) aVar.f15329c) && C5942k.m22326a((Object) this.f15337k, (Object) aVar.f15337k) && C5942k.m22326a((Object) this.f15336j, (Object) aVar.f15336j) && C5942k.m22326a((Object) this.f15332f, (Object) aVar.f15332f) && C5942k.m22326a((Object) this.f15333g, (Object) aVar.f15333g) && C5942k.m22326a((Object) this.f15334h, (Object) aVar.f15334h) && this.f15327a.mo16634k() == aVar.f15327a.mo16634k();
    }

    /* renamed from: b */
    public final List<C6422k> mo15994b() {
        return this.f15329c;
    }

    /* renamed from: c */
    public final C6431o mo15995c() {
        return this.f15330d;
    }

    /* renamed from: d */
    public final HostnameVerifier mo15996d() {
        return this.f15333g;
    }

    /* renamed from: e */
    public final List<C6465y> mo15997e() {
        return this.f15328b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6224a) {
            C6224a aVar = (C6224a) obj;
            if (C5942k.m22326a((Object) this.f15327a, (Object) aVar.f15327a) && mo15993a(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Proxy mo15999f() {
        return this.f15336j;
    }

    /* renamed from: g */
    public final C6229b mo16000g() {
        return this.f15335i;
    }

    /* renamed from: h */
    public final ProxySelector mo16001h() {
        return this.f15337k;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f15327a.hashCode()) * 31) + this.f15330d.hashCode()) * 31) + this.f15335i.hashCode()) * 31) + this.f15328b.hashCode()) * 31) + this.f15329c.hashCode()) * 31) + this.f15337k.hashCode()) * 31) + Objects.hashCode(this.f15336j)) * 31) + Objects.hashCode(this.f15332f)) * 31) + Objects.hashCode(this.f15333g)) * 31) + Objects.hashCode(this.f15334h);
    }

    /* renamed from: i */
    public final SocketFactory mo16003i() {
        return this.f15331e;
    }

    /* renamed from: j */
    public final SSLSocketFactory mo16004j() {
        return this.f15332f;
    }

    /* renamed from: k */
    public final C6448t mo16005k() {
        return this.f15327a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f15327a.mo16629g());
        sb2.append(':');
        sb2.append(this.f15327a.mo16634k());
        sb2.append(", ");
        if (this.f15336j != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f15336j;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f15337k;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}
