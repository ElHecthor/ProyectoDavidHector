package p308k.p313e0;

import java.io.Serializable;
import java.util.regex.Pattern;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.e0.f */
public final class C5772f implements Serializable {

    /* renamed from: f */
    private final Pattern f14848f;

    /* renamed from: k.e0.f$a */
    public static final class C5773a {
        private C5773a() {
        }

        public /* synthetic */ C5773a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: k.e0.f$b */
    private static final class C5774b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        private final String f14849f;

        /* renamed from: g */
        private final int f14850g;

        /* renamed from: k.e0.f$b$a */
        public static final class C5775a {
            private C5775a() {
            }

            public /* synthetic */ C5775a(C5938g gVar) {
                this();
            }
        }

        static {
            new C5775a(null);
        }

        public C5774b(String str, int i) {
            C5942k.m22327b(str, "pattern");
            this.f14849f = str;
            this.f14850g = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f14849f, this.f14850g);
            C5942k.m22324a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C5772f(compile);
        }
    }

    static {
        new C5773a(null);
    }

    public C5772f(String str) {
        C5942k.m22327b(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C5942k.m22324a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    public C5772f(Pattern pattern) {
        C5942k.m22327b(pattern, "nativePattern");
        this.f14848f = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f14848f.pattern();
        C5942k.m22324a((Object) pattern, "nativePattern.pattern()");
        return new C5774b(pattern, this.f14848f.flags());
    }

    /* renamed from: a */
    public final String mo15404a(CharSequence charSequence, String str) {
        C5942k.m22327b(charSequence, "input");
        C5942k.m22327b(str, "replacement");
        String replaceAll = this.f14848f.matcher(charSequence).replaceAll(str);
        C5942k.m22324a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: a */
    public final boolean mo15405a(CharSequence charSequence) {
        C5942k.m22327b(charSequence, "input");
        return this.f14848f.matcher(charSequence).matches();
    }

    public String toString() {
        String pattern = this.f14848f.toString();
        C5942k.m22324a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }
}
