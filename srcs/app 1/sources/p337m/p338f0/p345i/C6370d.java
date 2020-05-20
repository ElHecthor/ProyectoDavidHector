package p337m.p338f0.p345i;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.Conscrypt.Version;
import org.conscrypt.ConscryptHostnameVerifier;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;

/* renamed from: m.f0.i.d */
public final class C6370d extends C6380h {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f15811e;

    /* renamed from: f */
    public static final C6371a f15812f = new C6371a(null);

    /* renamed from: d */
    private final Provider f15813d;

    /* renamed from: m.f0.i.d$a */
    public static final class C6371a {
        private C6371a() {
        }

        public /* synthetic */ C6371a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6370d mo16463a() {
            if (mo16465b()) {
                return new C6370d(null);
            }
            return null;
        }

        /* renamed from: a */
        public final boolean mo16464a(int i, int i2, int i3) {
            Version version = Conscrypt.version();
            boolean z = true;
            if (version.major() != i) {
                if (version.major() <= i) {
                    z = false;
                }
                return z;
            } else if (version.minor() != i2) {
                if (version.minor() <= i2) {
                    z = false;
                }
                return z;
            } else {
                if (version.patch() < i3) {
                    z = false;
                }
                return z;
            }
        }

        /* renamed from: b */
        public final boolean mo16465b() {
            return C6370d.f15811e;
        }
    }

    /* renamed from: m.f0.i.d$b */
    static final class C6372b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C6372b f15814a = new C6372b();

        C6372b() {
        }
    }

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version");
            if (Conscrypt.isAvailable() && f15812f.mo16464a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f15811e = z;
    }

    private C6370d() {
        Provider build = Conscrypt.newProviderBuilder().provideTrustManager(true).build();
        C5942k.m22324a((Object) build, "Conscrypt.newProviderBui…rustManager(true).build()");
        this.f15813d = build;
    }

    public /* synthetic */ C6370d(C5938g gVar) {
        this();
    }

    /* renamed from: a */
    public SSLContext mo16457a() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f15813d);
        C5942k.m22324a((Object) instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C6380h.f15831c.mo16476a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.mo16441a(sSLSocket, str, list);
    }

    /* renamed from: a */
    public void mo16461a(SSLSocketFactory sSLSocketFactory) {
        C5942k.m22327b(sSLSocketFactory, "socketFactory");
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo16442b(sSLSocket);
    }

    /* renamed from: b */
    public X509TrustManager mo16458b() {
        X509TrustManager defaultX509TrustManager = Conscrypt.getDefaultX509TrustManager();
        C5942k.m22324a((Object) defaultX509TrustManager, "Conscrypt.getDefaultX509TrustManager()");
        return defaultX509TrustManager;
    }

    /* renamed from: c */
    public void mo16462c(X509TrustManager x509TrustManager) {
        if (Conscrypt.isConscrypt(x509TrustManager)) {
            Conscrypt.setHostnameVerifier(x509TrustManager, C6372b.f15814a);
        }
    }
}
