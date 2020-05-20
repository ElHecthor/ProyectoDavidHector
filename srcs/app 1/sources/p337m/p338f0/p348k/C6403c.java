package p337m.p338f0.p348k;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.p345i.C6380h;

/* renamed from: m.f0.k.c */
public abstract class C6403c {

    /* renamed from: a */
    public static final C6404a f15858a = new C6404a(null);

    /* renamed from: m.f0.k.c$a */
    public static final class C6404a {
        private C6404a() {
        }

        public /* synthetic */ C6404a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6403c mo16503a(X509TrustManager x509TrustManager) {
            C5942k.m22327b(x509TrustManager, "trustManager");
            return C6380h.f15831c.mo16477a().mo16439a(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abstract List<Certificate> mo16479a(List<? extends Certificate> list, String str);
}
