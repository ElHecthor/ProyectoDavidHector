package p337m.p338f0.p345i;

import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;

/* renamed from: m.f0.i.c */
public final class C6368c extends C6380h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f15808e;

    /* renamed from: f */
    public static final C6369a f15809f = new C6369a(null);

    /* renamed from: d */
    private final Provider f15810d;

    /* renamed from: m.f0.i.c$a */
    public static final class C6369a {
        private C6369a() {
        }

        public /* synthetic */ C6369a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6368c mo16459a() {
            if (mo16460b()) {
                return new C6368c(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo16460b() {
            return C6368c.f15808e;
        }
    }

    static {
        boolean z;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f15808e = z;
    }

    private C6368c() {
        this.f15810d = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ C6368c(C5938g gVar) {
        this();
    }

    /* renamed from: a */
    public SSLContext mo16457a() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f15810d);
        C5942k.m22324a((Object) instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List a = C6380h.f15831c.mo16476a(list);
            C5942k.m22324a((Object) parameters, "sslParameters");
            Object[] array = a.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo16441a(sSLSocket, str, list);
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            return super.mo16442b(sSLSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol != null && !C5942k.m22326a((Object) applicationProtocol, (Object) "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: b */
    public X509TrustManager mo16458b() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
