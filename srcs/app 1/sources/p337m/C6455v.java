package p337m;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.v */
public final class C6455v {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Pattern f15976d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Pattern f15977e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f */
    public static final C6456a f15978f = new C6456a(null);

    /* renamed from: a */
    private final String f15979a;

    /* renamed from: b */
    private final String f15980b;

    /* renamed from: c */
    private final String f15981c;

    /* renamed from: m.v$a */
    public static final class C6456a {
        private C6456a() {
        }

        public /* synthetic */ C6456a(C5938g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p337m.C6455v mo16671a(java.lang.String r14) {
            /*
                r13 = this;
                java.lang.String r0 = "$this$toMediaType"
                p308k.p323z.p325d.C5942k.m22327b(r14, r0)
                java.util.regex.Pattern r0 = p337m.C6455v.f15976d
                java.util.regex.Matcher r0 = r0.matcher(r14)
                boolean r1 = r0.lookingAt()
                r2 = 34
                if (r1 == 0) goto L_0x0136
                r1 = 1
                java.lang.String r3 = r0.group(r1)
                java.lang.String r4 = "typeSubtype.group(1)"
                p308k.p323z.p325d.C5942k.m22324a(r3, r4)
                java.util.Locale r4 = java.util.Locale.US
                java.lang.String r5 = "Locale.US"
                p308k.p323z.p325d.C5942k.m22324a(r4, r5)
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
                if (r3 == 0) goto L_0x0130
                java.lang.String r9 = r3.toLowerCase(r4)
                java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
                p308k.p323z.p325d.C5942k.m22324a(r9, r3)
                r4 = 2
                java.lang.String r7 = r0.group(r4)
                java.lang.String r8 = "typeSubtype.group(2)"
                p308k.p323z.p325d.C5942k.m22324a(r7, r8)
                java.util.Locale r8 = java.util.Locale.US
                p308k.p323z.p325d.C5942k.m22324a(r8, r5)
                if (r7 == 0) goto L_0x012a
                java.lang.String r10 = r7.toLowerCase(r8)
                p308k.p323z.p325d.C5942k.m22324a(r10, r3)
                java.util.regex.Pattern r3 = p337m.C6455v.f15977e
                java.util.regex.Matcher r3 = r3.matcher(r14)
                int r0 = r0.end()
                r5 = 0
                r11 = r5
            L_0x0059:
                int r6 = r14.length()
                if (r0 >= r6) goto L_0x0121
                int r6 = r14.length()
                r3.region(r0, r6)
                boolean r6 = r3.lookingAt()
                java.lang.String r7 = "\" for: \""
                if (r6 == 0) goto L_0x00f4
                java.lang.String r0 = r3.group(r1)
                if (r0 == 0) goto L_0x00ee
                java.lang.String r6 = "charset"
                boolean r0 = p308k.p313e0.C5787p.m21979b(r0, r6, r1)
                if (r0 != 0) goto L_0x007e
                goto L_0x00ee
            L_0x007e:
                java.lang.String r0 = r3.group(r4)
                r6 = 0
                if (r0 != 0) goto L_0x0090
                r0 = 3
                java.lang.String r0 = r3.group(r0)
                java.lang.String r8 = "parameter.group(3)"
            L_0x008c:
                p308k.p323z.p325d.C5942k.m22324a(r0, r8)
                goto L_0x00b0
            L_0x0090:
                java.lang.String r8 = "'"
                boolean r12 = p308k.p313e0.C5787p.m21980b(r0, r8, r6, r4, r5)
                if (r12 == 0) goto L_0x00b0
                boolean r8 = p308k.p313e0.C5787p.m21978a(r0, r8, r6, r4, r5)
                if (r8 == 0) goto L_0x00b0
                int r8 = r0.length()
                if (r8 <= r4) goto L_0x00b0
                int r8 = r0.length()
                int r8 = r8 - r1
                java.lang.String r0 = r0.substring(r1, r8)
                java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                goto L_0x008c
            L_0x00b0:
                if (r11 == 0) goto L_0x00b8
                boolean r8 = p308k.p313e0.C5787p.m21979b(r0, r11, r1)
                if (r8 == 0) goto L_0x00b9
            L_0x00b8:
                r6 = 1
            L_0x00b9:
                if (r6 == 0) goto L_0x00c2
                int r6 = r3.end()
                r11 = r0
                r0 = r6
                goto L_0x0059
            L_0x00c2:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Multiple charsets defined: \""
                r1.append(r3)
                r1.append(r11)
                java.lang.String r3 = "\" and: \""
                r1.append(r3)
                r1.append(r0)
                r1.append(r7)
                r1.append(r14)
                r1.append(r2)
                java.lang.String r14 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            L_0x00ee:
                int r0 = r3.end()
                goto L_0x0059
            L_0x00f4:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Parameter is not formatted correctly: \""
                r1.append(r3)
                java.lang.String r0 = r14.substring(r0)
                java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
                p308k.p323z.p325d.C5942k.m22324a(r0, r3)
                r1.append(r0)
                r1.append(r7)
                r1.append(r14)
                r1.append(r2)
                java.lang.String r14 = r1.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            L_0x0121:
                m.v r0 = new m.v
                r12 = 0
                r7 = r0
                r8 = r14
                r7.<init>(r8, r9, r10, r11, r12)
                return r0
            L_0x012a:
                k.q r14 = new k.q
                r14.<init>(r6)
                throw r14
            L_0x0130:
                k.q r14 = new k.q
                r14.<init>(r6)
                throw r14
            L_0x0136:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No subtype found for: \""
                r0.append(r1)
                r0.append(r14)
                r0.append(r2)
                java.lang.String r14 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6455v.C6456a.mo16671a(java.lang.String):m.v");
        }

        /* renamed from: b */
        public final C6455v mo16672b(String str) {
            C5942k.m22327b(str, "$this$toMediaTypeOrNull");
            try {
                return mo16671a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private C6455v(String str, String str2, String str3, String str4) {
        this.f15979a = str;
        this.f15980b = str2;
        this.f15981c = str4;
    }

    public /* synthetic */ C6455v(String str, String str2, String str3, String str4, C5938g gVar) {
        this(str, str2, str3, str4);
    }

    /* renamed from: a */
    public static final C6455v m24346a(String str) {
        return f15978f.mo16671a(str);
    }

    /* renamed from: a */
    public final String mo16666a() {
        return this.f15980b;
    }

    /* renamed from: a */
    public final Charset mo16667a(Charset charset) {
        try {
            return this.f15981c != null ? Charset.forName(this.f15981c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6455v) && C5942k.m22326a((Object) ((C6455v) obj).f15979a, (Object) this.f15979a);
    }

    public int hashCode() {
        return this.f15979a.hashCode();
    }

    public String toString() {
        return this.f15979a;
    }
}
