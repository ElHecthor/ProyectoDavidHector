package p337m.p338f0.p345i;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6462x;
import p337m.C6465y;
import p337m.p338f0.p348k.C6400a;
import p337m.p338f0.p348k.C6402b;
import p337m.p338f0.p348k.C6403c;
import p337m.p338f0.p348k.C6406e;
import p350n.C6480e;

/* renamed from: m.f0.i.h */
public class C6380h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static volatile C6380h f15829a;

    /* renamed from: b */
    private static final Logger f15830b = Logger.getLogger(C6462x.class.getName());

    /* renamed from: c */
    public static final C6381a f15831c;

    /* renamed from: m.f0.i.h$a */
    public static final class C6381a {
        private C6381a() {
        }

        public /* synthetic */ C6381a(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C6380h m24088b() {
            C6380h a = C6363a.f15799f.mo16444a();
            if (a != null) {
                return a;
            }
            C6380h a2 = C6365b.f15803h.mo16450a();
            if (a2 != null) {
                return a2;
            }
            if (m24090d()) {
                C6370d a3 = C6370d.f15812f.mo16463a();
                if (a3 != null) {
                    return a3;
                }
            }
            if (m24089c()) {
                C6368c a4 = C6368c.f15809f.mo16459a();
                if (a4 != null) {
                    return a4;
                }
            }
            if (m24091e()) {
                C6378g a5 = C6378g.f15827f.mo16473a();
                if (a5 != null) {
                    return a5;
                }
            }
            C6376f a6 = C6376f.f15825e.mo16471a();
            if (a6 != null) {
                return a6;
            }
            C6380h a7 = C6373e.f15815i.mo16470a();
            if (a7 == null) {
                a7 = new C6380h();
            }
            return a7;
        }

        /* renamed from: c */
        private final boolean m24089c() {
            return C5942k.m22326a((Object) System.getProperty("okhttp.platform"), (Object) "bouncycastle");
        }

        /* renamed from: d */
        private final boolean m24090d() {
            Provider provider = Security.getProviders()[0];
            C5942k.m22324a((Object) provider, "Security.getProviders()[0]");
            return C5942k.m22326a((Object) "Conscrypt", (Object) provider.getName());
        }

        /* renamed from: e */
        private final boolean m24091e() {
            Provider provider = Security.getProviders()[0];
            C5942k.m22324a((Object) provider, "Security.getProviders()[0]");
            return C5942k.m22326a((Object) "OpenJSSE", (Object) provider.getName());
        }

        /* renamed from: a */
        public final List<String> mo16476a(List<? extends C6465y> list) {
            C5942k.m22327b(list, "protocols");
            ArrayList<C6465y> arrayList = new ArrayList<>();
            for (Object next : list) {
                if (((C6465y) next) != C6465y.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C5838m.m22166a(arrayList, 10));
            for (C6465y yVar : arrayList) {
                arrayList2.add(yVar.toString());
            }
            return arrayList2;
        }

        /* renamed from: a */
        public final C6380h mo16477a() {
            return C6380h.f15829a;
        }

        /* renamed from: b */
        public final byte[] mo16478b(List<? extends C6465y> list) {
            C5942k.m22327b(list, "protocols");
            C6480e eVar = new C6480e();
            for (String str : mo16476a(list)) {
                eVar.writeByte(str.length());
                eVar.mo16784a(str);
            }
            return eVar.mo16814q();
        }
    }

    static {
        C6381a aVar = new C6381a(null);
        f15831c = aVar;
        f15829a = aVar.m24088b();
    }

    /* renamed from: a */
    public static /* synthetic */ void m24071a(C6380h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            hVar.mo16440a(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    /* renamed from: a */
    public Object mo16446a(String str) {
        C5942k.m22327b(str, "closer");
        if (f15830b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public SSLContext mo16457a() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C5942k.m22324a((Object) instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: a */
    public C6403c mo16439a(X509TrustManager x509TrustManager) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        return new C6400a(mo16449b(x509TrustManager));
    }

    /* renamed from: a */
    public void mo16440a(String str, int i, Throwable th) {
        C5942k.m22327b(str, "message");
        f15830b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public void mo16447a(String str, Object obj) {
        C5942k.m22327b(str, "message");
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo16440a(str, 5, (Throwable) obj);
    }

    /* renamed from: a */
    public void mo16448a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C5942k.m22327b(socket, "socket");
        C5942k.m22327b(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo16466a(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
    }

    /* renamed from: a */
    public void mo16461a(SSLSocketFactory sSLSocketFactory) {
        C5942k.m22327b(sSLSocketFactory, "socketFactory");
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: b */
    public X509TrustManager mo16458b() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    /* renamed from: b */
    public C6406e mo16449b(X509TrustManager x509TrustManager) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C5942k.m22324a((Object) acceptedIssuers, "trustManager.acceptedIssuers");
        return new C6402b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: b */
    public boolean mo16443b(String str) {
        C5942k.m22327b(str, "hostname");
        return true;
    }

    /* renamed from: c */
    public void mo16462c(X509TrustManager x509TrustManager) {
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C5942k.m22324a((Object) simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
