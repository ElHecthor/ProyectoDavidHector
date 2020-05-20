package p337m.p338f0.p345i.p346i;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.p348k.C6403c;

/* renamed from: m.f0.i.i.c */
public final class C6386c extends C6403c {

    /* renamed from: e */
    public static final C6387a f15837e = new C6387a(null);

    /* renamed from: b */
    private final X509TrustManager f15838b;

    /* renamed from: c */
    private final Object f15839c;

    /* renamed from: d */
    private final Method f15840d;

    /* renamed from: m.f0.i.i.c$a */
    public static final class C6387a {
        private C6387a() {
        }

        public /* synthetic */ C6387a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6386c mo16491a(X509TrustManager x509TrustManager) {
            Class<String> cls = String.class;
            String str = "checkServerTrusted";
            C5942k.m22327b(x509TrustManager, "trustManager");
            try {
                Class cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
                Object newInstance = cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager});
                Method method = cls2.getMethod(str, new Class[]{X509Certificate[].class, cls, cls});
                C5942k.m22324a(newInstance, "extensions");
                C5942k.m22324a((Object) method, str);
                return new C6386c(x509TrustManager, newInstance, method);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public C6386c(X509TrustManager x509TrustManager, Object obj, Method method) {
        C5942k.m22327b(x509TrustManager, "trustManager");
        C5942k.m22327b(obj, "x509TrustManagerExtensions");
        C5942k.m22327b(method, "checkServerTrusted");
        this.f15838b = x509TrustManager;
        this.f15839c = obj;
        this.f15840d = method;
    }

    /* renamed from: a */
    public List<Certificate> mo16479a(List<? extends Certificate> list, String str) {
        C5942k.m22327b(list, "chain");
        C5942k.m22327b(str, "hostname");
        try {
            Object[] array = list.toArray(new X509Certificate[0]);
            if (array != null) {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) array;
                Object invoke = this.f15840d.invoke(this.f15839c, new Object[]{x509CertificateArr, "RSA", str});
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (InvocationTargetException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6386c) && ((C6386c) obj).f15838b == this.f15838b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15838b);
    }
}
