package p337m.p338f0.p345i.p346i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;
import p337m.p338f0.p345i.C6380h;

/* renamed from: m.f0.i.i.g */
public final class C6394g implements C6395h {

    /* renamed from: a */
    private boolean f15851a;

    /* renamed from: b */
    private C6395h f15852b;

    /* renamed from: c */
    private final String f15853c;

    public C6394g(String str) {
        C5942k.m22327b(str, "socketPackage");
        this.f15853c = str;
    }

    /* renamed from: c */
    private final synchronized C6395h m24117c(SSLSocket sSLSocket) {
        if (!this.f15851a) {
            try {
                Class cls = sSLSocket.getClass();
                while (true) {
                    String name = cls.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f15853c);
                    sb.append(".OpenSSLSocketImpl");
                    if (!(!C5942k.m22326a((Object) name, (Object) sb.toString()))) {
                        this.f15852b = new C6388d(cls);
                        break;
                    }
                    cls = cls.getSuperclass();
                    C5942k.m22324a((Object) cls, "possibleClass.superclass");
                    if (cls == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("No OpenSSLSocketImpl superclass of socket of type ");
                        sb2.append(sSLSocket);
                        throw new AssertionError(sb2.toString());
                    }
                }
            } catch (Exception e) {
                C6380h a = C6380h.f15831c.mo16477a();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to initialize DeferredSocketAdapter ");
                sb3.append(this.f15853c);
                a.mo16440a(sb3.toString(), 5, (Throwable) e);
            }
            this.f15851a = true;
        }
        return this.f15852b;
    }

    /* renamed from: a */
    public String mo16483a(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C6395h c = m24117c(sSLSocket);
        if (c != null) {
            return c.mo16483a(sSLSocket);
        }
        return null;
    }

    /* renamed from: a */
    public void mo16484a(SSLSocket sSLSocket, String str, List<? extends C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        C6395h c = m24117c(sSLSocket);
        if (c != null) {
            c.mo16484a(sSLSocket, str, list);
        }
    }

    /* renamed from: a */
    public boolean mo16485a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo16486b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        C5942k.m22324a((Object) name, "sslSocket.javaClass.name");
        return C5787p.m21980b(name, this.f15853c, false, 2, null);
    }
}
