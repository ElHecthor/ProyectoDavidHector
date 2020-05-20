package p337m.p338f0.p345i.p346i;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.p348k.C6403c;

/* renamed from: m.f0.i.i.a */
public final class C6382a extends C6403c {

    /* renamed from: d */
    public static final C6383a f15832d = new C6383a(null);

    /* renamed from: b */
    private final X509TrustManager f15833b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f15834c;

    /* renamed from: m.f0.i.i.a$a */
    public static final class C6383a {
        private C6383a() {
        }

        public /* synthetic */ C6383a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6382a mo16482a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C5942k.m22327b(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C6382a(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C6382a(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        C5942k.m22327b(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f15833b = x509TrustManager;
        this.f15834c = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List<Certificate> mo16479a(List<? extends Certificate> list, String str) {
        C5942k.m22327b(list, "chain");
        C5942k.m22327b(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<Certificate> checkServerTrusted = this.f15834c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                C5942k.m22324a((Object) checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        } else {
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6382a) && ((C6382a) obj).f15833b == this.f15833b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15833b);
    }
}
