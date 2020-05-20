package p337m;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.d0 */
public final class C6243d0 {

    /* renamed from: a */
    private final C6224a f15404a;

    /* renamed from: b */
    private final Proxy f15405b;

    /* renamed from: c */
    private final InetSocketAddress f15406c;

    public C6243d0(C6224a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C5942k.m22327b(aVar, "address");
        C5942k.m22327b(proxy, "proxy");
        C5942k.m22327b(inetSocketAddress, "socketAddress");
        this.f15404a = aVar;
        this.f15405b = proxy;
        this.f15406c = inetSocketAddress;
    }

    /* renamed from: a */
    public final C6224a mo16085a() {
        return this.f15404a;
    }

    /* renamed from: b */
    public final Proxy mo16086b() {
        return this.f15405b;
    }

    /* renamed from: c */
    public final boolean mo16087c() {
        return this.f15404a.mo16004j() != null && this.f15405b.type() == Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress mo16088d() {
        return this.f15406c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6243d0) {
            C6243d0 d0Var = (C6243d0) obj;
            if (C5942k.m22326a((Object) d0Var.f15404a, (Object) this.f15404a) && C5942k.m22326a((Object) d0Var.f15405b, (Object) this.f15405b) && C5942k.m22326a((Object) d0Var.f15406c, (Object) this.f15406c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f15404a.hashCode()) * 31) + this.f15405b.hashCode()) * 31) + this.f15406c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.f15406c);
        sb.append('}');
        return sb.toString();
    }
}
