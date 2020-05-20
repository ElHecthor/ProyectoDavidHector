package p337m.p338f0.p345i.p346i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.C6465y;
import p337m.p338f0.p345i.C6370d;
import p337m.p338f0.p345i.C6380h;

/* renamed from: m.f0.i.i.f */
public final class C6392f implements C6395h {

    /* renamed from: a */
    public static final C6393a f15850a = new C6393a(null);

    /* renamed from: m.f0.i.i.f$a */
    public static final class C6393a {
        private C6393a() {
        }

        public /* synthetic */ C6393a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6395h mo16495a() {
            if (C6370d.f15812f.mo16465b()) {
                return new C6392f();
            }
            return null;
        }
    }

    /* renamed from: a */
    public String mo16483a(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        if (mo16486b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    /* renamed from: a */
    public void mo16484a(SSLSocket sSLSocket, String str, List<? extends C6465y> list) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        C5942k.m22327b(list, "protocols");
        if (mo16486b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = C6380h.f15831c.mo16476a(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    public boolean mo16485a() {
        return C6370d.f15812f.mo16465b();
    }

    /* renamed from: b */
    public boolean mo16486b(SSLSocket sSLSocket) {
        C5942k.m22327b(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }
}
