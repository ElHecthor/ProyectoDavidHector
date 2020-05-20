package p337m;

import java.io.IOException;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.y */
public enum C6465y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: n */
    public static final C6466a f16066n = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f16067f;

    /* renamed from: m.y$a */
    public static final class C6466a {
        private C6466a() {
        }

        public /* synthetic */ C6466a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6465y mo16746a(String str) {
            C5942k.m22327b(str, "protocol");
            if (C5942k.m22326a((Object) str, (Object) C6465y.HTTP_1_0.f16067f)) {
                return C6465y.HTTP_1_0;
            }
            if (C5942k.m22326a((Object) str, (Object) C6465y.HTTP_1_1.f16067f)) {
                return C6465y.HTTP_1_1;
            }
            if (C5942k.m22326a((Object) str, (Object) C6465y.H2_PRIOR_KNOWLEDGE.f16067f)) {
                return C6465y.H2_PRIOR_KNOWLEDGE;
            }
            if (C5942k.m22326a((Object) str, (Object) C6465y.HTTP_2.f16067f)) {
                return C6465y.HTTP_2;
            }
            if (C5942k.m22326a((Object) str, (Object) C6465y.SPDY_3.f16067f)) {
                return C6465y.SPDY_3;
            }
            if (C5942k.m22326a((Object) str, (Object) C6465y.QUIC.f16067f)) {
                return C6465y.QUIC;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected protocol: ");
            sb.append(str);
            throw new IOException(sb.toString());
        }
    }

    static {
        f16066n = new C6466a(null);
    }

    private C6465y(String str) {
        this.f16067f = str;
    }

    public String toString() {
        return this.f16067f;
    }
}
