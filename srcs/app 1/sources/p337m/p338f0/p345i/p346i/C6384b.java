package p337m.p338f0.p345i.p346i;

import android.net.SSLCertificateSocketFactory;
import android.os.Build.VERSION;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;
import p337m.p338f0.p345i.C6365b;
import p337m.p338f0.p345i.C6380h;

/* renamed from: m.f0.i.i.b */
public final class C6384b implements C6395h {

    /* renamed from: b */
    public static final C6385a f15835b = new C6385a(null);

    /* renamed from: a */
    private final SSLCertificateSocketFactory f15836a;

    /* renamed from: m.f0.i.i.b$a */
    public static final class C6385a {
        private C6385a() {
        }

        public /* synthetic */ C6385a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6395h mo16487a() {
            if (mo16488b()) {
                return new C6384b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo16488b() {
            return C6365b.f15803h.mo16451b() && VERSION.SDK_INT >= 29;
        }
    }

    public C6384b() {
        SocketFactory socketFactory = SSLCertificateSocketFactory.getDefault(10000);
        if (socketFactory != null) {
            this.f15836a = (SSLCertificateSocketFactory) socketFactory;
            return;
        }
        throw new C5809q("null cannot be cast to non-null type android.net.SSLCertificateSocketFactory");
    }

    /* renamed from: a */
    public String mo16483a(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !C5942k.m22326a((Object) applicationProtocol, (Object) "")) {
            return applicationProtocol;
        }
        return null;
    }

    /* renamed from: a */
    public void mo16484a(SSLSocket sSLSocket, String str, List<? extends C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        this.f15836a.setUseSessionTickets(sSLSocket, true);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        C5942k.m22324a((Object) sSLParameters, "sslParameters");
        Object[] array = C6380h.f15831c.mo16476a(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public boolean mo16485a() {
        return f15835b.mo16488b();
    }

    /* renamed from: b */
    public boolean mo16486b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        C5942k.m22324a((Object) name, "sslSocket.javaClass.name");
        return C5787p.m21980b(name, "com.android.org.conscrypt", false, 2, null);
    }
}
