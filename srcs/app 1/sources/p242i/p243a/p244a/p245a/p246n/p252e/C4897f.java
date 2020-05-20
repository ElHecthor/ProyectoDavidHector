package p242i.p243a.p244a.p245a.p246n.p252e;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: i.a.a.a.n.e.f */
public final class C4897f {
    /* renamed from: a */
    public static final SSLSocketFactory m19659a(C4898g gVar) {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new C4899h(new C4900i(gVar.mo5651b(), gVar.mo5650a()), gVar)}, null);
        return instance.getSocketFactory();
    }
}
