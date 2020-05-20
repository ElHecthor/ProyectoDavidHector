package p337m;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.h */
public final class C6417h {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Comparator<String> f15879b = new C6418a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C6417h> f15880c = new LinkedHashMap();

    /* renamed from: d */
    public static final C6417h f15881d = f15897t.m24164a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C6417h f15882e = f15897t.m24164a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C6417h f15883f = f15897t.m24164a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C6417h f15884g = f15897t.m24164a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C6417h f15885h = f15897t.m24164a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C6417h f15886i = f15897t.m24164a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C6417h f15887j = f15897t.m24164a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C6417h f15888k = f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C6417h f15889l = f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C6417h f15890m = f15897t.m24164a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C6417h f15891n = f15897t.m24164a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C6417h f15892o = f15897t.m24164a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C6417h f15893p = f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C6417h f15894q = f15897t.m24164a("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C6417h f15895r = f15897t.m24164a("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C6417h f15896s = f15897t.m24164a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: t */
    public static final C6419b f15897t = new C6419b(null);

    /* renamed from: a */
    private final String f15898a;

    /* renamed from: m.h$a */
    public static final class C6418a implements Comparator<String> {
        C6418a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            C5942k.m22327b(str, "a");
            C5942k.m22327b(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                int i2 = -1;
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt != charAt2) {
                        if (charAt >= charAt2) {
                            i2 = 1;
                        }
                        return i2;
                    }
                    i++;
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length >= length2) {
                        i2 = 1;
                    }
                    return i2;
                }
            }
        }
    }

    /* renamed from: m.h$b */
    public static final class C6419b {
        private C6419b() {
        }

        public /* synthetic */ C6419b(C5938g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C6417h m24164a(String str, int i) {
            C6417h hVar = new C6417h(str, null);
            C6417h.f15880c.put(str, hVar);
            return hVar;
        }

        /* renamed from: b */
        private final String m24166b(String str) {
            StringBuilder sb;
            String str2 = "TLS_";
            String str3 = "null cannot be cast to non-null type java.lang.String";
            String str4 = "(this as java.lang.String).substring(startIndex)";
            String str5 = "SSL_";
            if (C5787p.m21980b(str, str2, false, 2, null)) {
                sb = new StringBuilder();
                sb.append(str5);
                if (str == null) {
                    throw new C5809q(str3);
                }
            } else if (!C5787p.m21980b(str, str5, false, 2, null)) {
                return str;
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                if (str == null) {
                    throw new C5809q(str3);
                }
            }
            String substring = str.substring(4);
            C5942k.m22324a((Object) substring, str4);
            sb.append(substring);
            return sb.toString();
        }

        /* renamed from: a */
        public final Comparator<String> mo16530a() {
            return C6417h.f15879b;
        }

        /* renamed from: a */
        public final synchronized C6417h mo16531a(String str) {
            C6417h hVar;
            C5942k.m22327b(str, "javaName");
            hVar = (C6417h) C6417h.f15880c.get(str);
            if (hVar == null) {
                hVar = (C6417h) C6417h.f15880c.get(m24166b(str));
                if (hVar == null) {
                    hVar = new C6417h(str, null);
                }
                C6417h.f15880c.put(str, hVar);
            }
            return hVar;
        }
    }

    static {
        f15897t.m24164a("SSL_RSA_WITH_NULL_MD5", 1);
        f15897t.m24164a("SSL_RSA_WITH_NULL_SHA", 2);
        f15897t.m24164a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f15897t.m24164a("SSL_RSA_WITH_RC4_128_MD5", 4);
        f15897t.m24164a("SSL_RSA_WITH_RC4_128_SHA", 5);
        f15897t.m24164a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f15897t.m24164a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f15897t.m24164a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f15897t.m24164a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f15897t.m24164a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f15897t.m24164a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f15897t.m24164a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f15897t.m24164a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f15897t.m24164a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f15897t.m24164a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f15897t.m24164a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f15897t.m24164a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f15897t.m24164a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f15897t.m24164a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f15897t.m24164a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f15897t.m24164a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        f15897t.m24164a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        f15897t.m24164a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        f15897t.m24164a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        f15897t.m24164a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        f15897t.m24164a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        f15897t.m24164a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        f15897t.m24164a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f15897t.m24164a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        f15897t.m24164a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        f15897t.m24164a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f15897t.m24164a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        f15897t.m24164a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        f15897t.m24164a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        f15897t.m24164a("TLS_RSA_WITH_NULL_SHA256", 59);
        f15897t.m24164a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        f15897t.m24164a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        f15897t.m24164a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        f15897t.m24164a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        f15897t.m24164a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        f15897t.m24164a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        f15897t.m24164a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        f15897t.m24164a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        f15897t.m24164a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        f15897t.m24164a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        f15897t.m24164a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f15897t.m24164a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f15897t.m24164a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f15897t.m24164a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        f15897t.m24164a("TLS_PSK_WITH_RC4_128_SHA", 138);
        f15897t.m24164a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f15897t.m24164a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        f15897t.m24164a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        f15897t.m24164a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f15897t.m24164a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f15897t.m24164a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f15897t.m24164a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        f15897t.m24164a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f15897t.m24164a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f15897t.m24164a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f15897t.m24164a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        f15897t.m24164a("TLS_FALLBACK_SCSV", 22016);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        f15897t.m24164a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        f15897t.m24164a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        f15897t.m24164a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f15897t.m24164a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        f15897t.m24164a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        f15897t.m24164a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        f15897t.m24164a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        f15897t.m24164a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        f15897t.m24164a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        f15897t.m24164a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        f15897t.m24164a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f15897t.m24164a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f15897t.m24164a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f15897t.m24164a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        f15897t.m24164a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f15897t.m24164a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f15897t.m24164a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f15897t.m24164a("TLS_AES_128_CCM_SHA256", 4868);
        f15897t.m24164a("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private C6417h(String str) {
        this.f15898a = str;
    }

    public /* synthetic */ C6417h(String str, C5938g gVar) {
        this(str);
    }

    /* renamed from: a */
    public final String mo16526a() {
        return this.f15898a;
    }

    public String toString() {
        return this.f15898a;
    }
}
