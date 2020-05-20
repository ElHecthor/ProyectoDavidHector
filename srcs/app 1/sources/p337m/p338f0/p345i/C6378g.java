package p337m.p338f0.p345i;

import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;

/* renamed from: m.f0.i.g */
public final class C6378g extends C6380h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f15826e;

    /* renamed from: f */
    public static final C6379a f15827f = new C6379a(null);

    /* renamed from: d */
    private final Provider f15828d;

    /* renamed from: m.f0.i.g$a */
    public static final class C6379a {
        private C6379a() {
        }

        public /* synthetic */ C6379a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6378g mo16473a() {
            if (mo16474b()) {
                return new C6378g(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo16474b() {
            return C6378g.f15826e;
        }
    }

    static {
        boolean z;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f15826e = z;
    }

    private C6378g() {
        this.f15828d = new OpenJSSE();
    }

    public /* synthetic */ C6378g(C5938g gVar) {
        this();
    }

    /* renamed from: a */
    public SSLContext mo16457a() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f15828d);
        C5942k.m22324a((Object) instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof org.openjsse.javax.net.ssl.SSLParameters) {
                org.openjsse.javax.net.ssl.SSLParameters sSLParameters2 = (org.openjsse.javax.net.ssl.SSLParameters) sSLParameters;
                Object[] array = C6380h.f15831c.mo16476a(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.mo16441a(sSLSocket, str, list);
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo16442b(sSLSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !C5942k.m22326a((Object) applicationProtocol, (Object) "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: b */
    public X509TrustManager mo16458b() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f15828d);
        instance.init(null);
        C5942k.m22324a((Object) instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers != null) {
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new C5809q("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            C5942k.m22324a((Object) arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new IllegalStateException(sb.toString().toString());
        }
        C5942k.m22323a();
        throw null;
    }
}
