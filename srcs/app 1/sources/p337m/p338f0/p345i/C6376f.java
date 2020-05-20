package p337m.p338f0.p345i;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;

/* renamed from: m.f0.i.f */
public class C6376f extends C6380h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f15824d;

    /* renamed from: e */
    public static final C6377a f15825e = new C6377a(null);

    /* renamed from: m.f0.i.f$a */
    public static final class C6377a {
        private C6377a() {
        }

        public /* synthetic */ C6377a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6376f mo16471a() {
            if (mo16472b()) {
                return new C6376f();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo16472b() {
            return C6376f.f15824d;
        }
    }

    static {
        Integer integer = Integer.getInteger("java.specification.version");
        f15824d = (integer != null ? integer.intValue() : 8) >= 9;
    }

    /* renamed from: a */
    public void mo16441a(SSLSocket sSLSocket, String str, List<C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List a = C6380h.f15831c.mo16476a(list);
        C5942k.m22324a((Object) sSLParameters, "sslParameters");
        Object[] array = a.toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public String mo16442b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && !C5942k.m22326a((Object) applicationProtocol, (Object) "")) {
            return applicationProtocol;
        }
        return null;
    }
}
