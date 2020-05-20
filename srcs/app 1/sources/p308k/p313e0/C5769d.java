package p308k.p313e0;

import java.nio.charset.Charset;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.e0.d */
public final class C5769d {

    /* renamed from: a */
    public static final Charset f14834a;

    /* renamed from: b */
    private static Charset f14835b;

    /* renamed from: c */
    private static Charset f14836c;

    /* renamed from: d */
    public static final C5769d f14837d = new C5769d();

    static {
        Charset forName = Charset.forName("UTF-8");
        C5942k.m22324a((Object) forName, "Charset.forName(\"UTF-8\")");
        f14834a = forName;
        C5942k.m22324a((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        C5942k.m22324a((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        C5942k.m22324a((Object) Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        C5942k.m22324a((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        C5942k.m22324a((Object) Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private C5769d() {
    }

    /* renamed from: a */
    public final Charset mo15399a() {
        Charset charset = f14836c;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C5942k.m22324a((Object) forName, "Charset.forName(\"UTF-32BE\")");
        f14836c = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo15400b() {
        Charset charset = f14835b;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C5942k.m22324a((Object) forName, "Charset.forName(\"UTF-32LE\")");
        f14835b = forName;
        return forName;
    }
}
