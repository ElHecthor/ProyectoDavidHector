package p337m.p338f0.p345i.p346i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.i.i.i */
public final class C6396i extends C6388d {

    /* renamed from: f */
    public static final C6397a f15854f = new C6397a(null);

    /* renamed from: m.f0.i.i.i$a */
    public static final class C6397a {
        private C6397a() {
        }

        public /* synthetic */ C6397a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C6395h m24126a(C6397a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.mo16496a(str);
        }

        /* renamed from: a */
        public final C6395h mo16496a(String str) {
            C5942k.m22327b(str, "packageName");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".OpenSSLSocketImpl");
                Class cls = Class.forName(sb.toString());
                if (cls != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(".OpenSSLSocketFactoryImpl");
                    Class cls2 = Class.forName(sb2.toString());
                    if (cls2 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(".SSLParametersImpl");
                        Class cls3 = Class.forName(sb3.toString());
                        C5942k.m22324a((Object) cls3, "paramsClass");
                        return new C6396i(cls, cls2, cls3);
                    }
                    throw new C5809q("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                }
                throw new C5809q("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            } catch (Exception e) {
                C6398j.m24128a(5, "unable to load android socket classes", e);
                return null;
            }
        }
    }

    public C6396i(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        C5942k.m22327b(cls, "sslSocketClass");
        C5942k.m22327b(cls2, "sslSocketFactoryClass");
        C5942k.m22327b(cls3, "paramClass");
        super(cls);
    }
}
