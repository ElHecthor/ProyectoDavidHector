package p337m;

import p308k.p323z.p325d.C5942k;

/* renamed from: m.e0 */
public enum C6246e0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: m */
    public static final C6247a f15413m = null;

    /* renamed from: f */
    private final String f15414f;

    /* renamed from: m.e0$a */
    public static final class C6247a {
        private C6247a() {
        }

        public /* synthetic */ C6247a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6246e0 mo16099a(String str) {
            C5942k.m22327b(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return C6246e0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return C6246e0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return C6246e0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return C6246e0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return C6246e0.SSL_3_0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected TLS version: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        f15413m = new C6247a(null);
    }

    private C6246e0(String str) {
        this.f15414f = str;
    }

    /* renamed from: f */
    public final String mo16098f() {
        return this.f15414f;
    }
}
