package p337m.p338f0.p345i.p346i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;
import p337m.p338f0.p345i.C6365b;
import p337m.p338f0.p345i.C6380h;

/* renamed from: m.f0.i.i.d */
public class C6388d implements C6395h {

    /* renamed from: a */
    private final Method f15841a;

    /* renamed from: b */
    private final Method f15842b = this.f15845e.getMethod("setHostname", new Class[]{String.class});

    /* renamed from: c */
    private final Method f15843c = this.f15845e.getMethod("getAlpnSelectedProtocol", new Class[0]);

    /* renamed from: d */
    private final Method f15844d = this.f15845e.getMethod("setAlpnProtocols", new Class[]{byte[].class});

    /* renamed from: e */
    private final Class<? super SSLSocket> f15845e;

    /* renamed from: m.f0.i.i.d$a */
    public static final class C6389a {
        private C6389a() {
        }

        public /* synthetic */ C6389a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6389a(null);
    }

    public C6388d(Class<? super SSLSocket> cls) {
        C5942k.m22327b(cls, "sslSocketClass");
        this.f15845e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        C5942k.m22324a((Object) declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f15841a = declaredMethod;
    }

    /* renamed from: a */
    public String mo16483a(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        String str = null;
        if (!mo16486b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f15843c.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                Charset charset = StandardCharsets.UTF_8;
                C5942k.m22324a((Object) charset, "StandardCharsets.UTF_8");
                str = new String(bArr, charset);
            }
        } catch (NullPointerException e) {
            if (!C5942k.m22326a((Object) e.getMessage(), (Object) "ssl == null")) {
                throw e;
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
        return str;
    }

    /* renamed from: a */
    public void mo16484a(SSLSocket sSLSocket, String str, List<? extends C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        if (mo16486b(sSLSocket)) {
            try {
                this.f15841a.invoke(sSLSocket, new Object[]{Boolean.valueOf(true)});
                if (str != null) {
                    this.f15842b.invoke(sSLSocket, new Object[]{str});
                }
                this.f15844d.invoke(sSLSocket, new Object[]{C6380h.f15831c.mo16478b(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* renamed from: a */
    public boolean mo16485a() {
        return C6365b.f15803h.mo16452c();
    }

    /* renamed from: b */
    public boolean mo16486b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        return this.f15845e.isInstance(sSLSocket);
    }
}
