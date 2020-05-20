package p337m.p338f0.p341e;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p337m.C6224a;
import p337m.C6243d0;
import p337m.C6244e;
import p337m.C6434p;
import p337m.C6448t;
import p337m.p338f0.C6250b;

/* renamed from: m.f0.e.k */
public final class C6287k {

    /* renamed from: i */
    public static final C6288a f15551i = new C6288a(null);

    /* renamed from: a */
    private List<? extends Proxy> f15552a = C5837l.m22159a();

    /* renamed from: b */
    private int f15553b;

    /* renamed from: c */
    private List<? extends InetSocketAddress> f15554c = C5837l.m22159a();

    /* renamed from: d */
    private final List<C6243d0> f15555d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6224a f15556e;

    /* renamed from: f */
    private final C6285i f15557f;

    /* renamed from: g */
    private final C6244e f15558g;

    /* renamed from: h */
    private final C6434p f15559h;

    /* renamed from: m.f0.e.k$a */
    public static final class C6288a {
        private C6288a() {
        }

        public /* synthetic */ C6288a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo16234a(InetSocketAddress inetSocketAddress) {
            String hostName;
            String str;
            C5942k.m22327b(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                hostName = address.getHostAddress();
                str = "address.hostAddress";
            } else {
                hostName = inetSocketAddress.getHostName();
                str = "hostName";
            }
            C5942k.m22324a((Object) hostName, str);
            return hostName;
        }
    }

    /* renamed from: m.f0.e.k$b */
    public static final class C6289b {

        /* renamed from: a */
        private int f15560a;

        /* renamed from: b */
        private final List<C6243d0> f15561b;

        public C6289b(List<C6243d0> list) {
            C5942k.m22327b(list, "routes");
            this.f15561b = list;
        }

        /* renamed from: a */
        public final List<C6243d0> mo16235a() {
            return this.f15561b;
        }

        /* renamed from: b */
        public final boolean mo16236b() {
            return this.f15560a < this.f15561b.size();
        }

        /* renamed from: c */
        public final C6243d0 mo16237c() {
            if (mo16236b()) {
                List<C6243d0> list = this.f15561b;
                int i = this.f15560a;
                this.f15560a = i + 1;
                return (C6243d0) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: m.f0.e.k$c */
    static final class C6290c extends C5943l implements C5907a<List<? extends Proxy>> {

        /* renamed from: g */
        final /* synthetic */ C6287k f15562g;

        /* renamed from: h */
        final /* synthetic */ Proxy f15563h;

        /* renamed from: i */
        final /* synthetic */ C6448t f15564i;

        C6290c(C6287k kVar, Proxy proxy, C6448t tVar) {
            this.f15562g = kVar;
            this.f15563h = proxy;
            this.f15564i = tVar;
            super(0);
        }

        public final List<Proxy> invoke() {
            Proxy proxy = this.f15563h;
            if (proxy != null) {
                return C5836k.m22153a(proxy);
            }
            URI o = this.f15564i.mo16638o();
            if (o.getHost() == null) {
                return C6250b.m23451a((T[]) new Proxy[]{Proxy.NO_PROXY});
            }
            List select = this.f15562g.f15556e.mo16001h().select(o);
            if (!(select == null || select.isEmpty())) {
                return C6250b.m23471b(select);
            }
            return C6250b.m23451a((T[]) new Proxy[]{Proxy.NO_PROXY});
        }
    }

    public C6287k(C6224a aVar, C6285i iVar, C6244e eVar, C6434p pVar) {
        C5942k.m22327b(aVar, "address");
        C5942k.m22327b(iVar, "routeDatabase");
        C5942k.m22327b(eVar, "call");
        C5942k.m22327b(pVar, "eventListener");
        this.f15556e = aVar;
        this.f15557f = iVar;
        this.f15558g = eVar;
        this.f15559h = pVar;
        m23654a(this.f15556e.mo16005k(), this.f15556e.mo15999f());
    }

    /* renamed from: a */
    private final void m23653a(Proxy proxy) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        this.f15554c = arrayList;
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f15556e.mo16005k().mo16629g();
            i = this.f15556e.mo16005k().mo16634k();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = f15551i.mo16234a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
        if (1 > i || 65535 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(':');
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f15559h.mo16569a(this.f15558g, str);
            List<InetAddress> a = this.f15556e.mo15995c().mo16565a(str);
            if (!a.isEmpty()) {
                this.f15559h.mo16570a(this.f15558g, str, a);
                for (InetAddress inetSocketAddress2 : a) {
                    arrayList.add(new InetSocketAddress(inetSocketAddress2, i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f15556e.mo15995c());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    /* renamed from: a */
    private final void m23654a(C6448t tVar, Proxy proxy) {
        C6290c cVar = new C6290c(this, proxy, tVar);
        this.f15559h.mo16577a(this.f15558g, tVar);
        List<? extends Proxy> invoke = cVar.invoke();
        this.f15552a = invoke;
        this.f15553b = 0;
        this.f15559h.mo16578a(this.f15558g, tVar, invoke);
    }

    /* renamed from: c */
    private final boolean m23655c() {
        return this.f15553b < this.f15552a.size();
    }

    /* renamed from: d */
    private final Proxy m23656d() {
        if (m23655c()) {
            List<? extends Proxy> list = this.f15552a;
            int i = this.f15553b;
            this.f15553b = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m23653a(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.f15556e.mo16005k().mo16629g());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.f15552a);
        throw new SocketException(sb.toString());
    }

    /* renamed from: a */
    public final boolean mo16232a() {
        return m23655c() || (this.f15555d.isEmpty() ^ true);
    }

    /* renamed from: b */
    public final C6289b mo16233b() {
        if (mo16232a()) {
            ArrayList arrayList = new ArrayList();
            while (m23655c()) {
                Proxy d = m23656d();
                for (InetSocketAddress d0Var : this.f15554c) {
                    C6243d0 d0Var2 = new C6243d0(this.f15556e, d, d0Var);
                    if (this.f15557f.mo16228c(d0Var2)) {
                        this.f15555d.add(d0Var2);
                    } else {
                        arrayList.add(d0Var2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C5842q.m22169a((Collection<? super T>) arrayList, (Iterable<? extends T>) this.f15555d);
                this.f15555d.clear();
            }
            return new C6289b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
