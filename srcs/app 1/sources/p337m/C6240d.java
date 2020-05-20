package p337m;

import java.util.concurrent.TimeUnit;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.d */
public final class C6240d {

    /* renamed from: n */
    public static final C6242b f15382n = new C6242b(null);

    /* renamed from: a */
    private final boolean f15383a;

    /* renamed from: b */
    private final boolean f15384b;

    /* renamed from: c */
    private final int f15385c;

    /* renamed from: d */
    private final int f15386d;

    /* renamed from: e */
    private final boolean f15387e;

    /* renamed from: f */
    private final boolean f15388f;

    /* renamed from: g */
    private final boolean f15389g;

    /* renamed from: h */
    private final int f15390h;

    /* renamed from: i */
    private final int f15391i;

    /* renamed from: j */
    private final boolean f15392j;

    /* renamed from: k */
    private final boolean f15393k;

    /* renamed from: l */
    private final boolean f15394l;

    /* renamed from: m */
    private String f15395m;

    /* renamed from: m.d$a */
    public static final class C6241a {

        /* renamed from: a */
        private boolean f15396a;

        /* renamed from: b */
        private boolean f15397b;

        /* renamed from: c */
        private int f15398c = -1;

        /* renamed from: d */
        private int f15399d = -1;

        /* renamed from: e */
        private int f15400e = -1;

        /* renamed from: f */
        private boolean f15401f;

        /* renamed from: g */
        private boolean f15402g;

        /* renamed from: h */
        private boolean f15403h;

        /* renamed from: a */
        private final int m23405a(long j) {
            if (j > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        /* renamed from: a */
        public final C6241a mo16080a(int i, TimeUnit timeUnit) {
            C5942k.m22327b(timeUnit, "timeUnit");
            if (i >= 0) {
                this.f15399d = m23405a(timeUnit.toSeconds((long) i));
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final C6240d mo16081a() {
            C6240d dVar = new C6240d(this.f15396a, this.f15397b, this.f15398c, -1, false, false, false, this.f15399d, this.f15400e, this.f15401f, this.f15402g, this.f15403h, null, null);
            return dVar;
        }

        /* renamed from: b */
        public final C6241a mo16082b() {
            this.f15396a = true;
            return this;
        }

        /* renamed from: c */
        public final C6241a mo16083c() {
            this.f15401f = true;
            return this;
        }
    }

    /* renamed from: m.d$b */
    public static final class C6242b {
        private C6242b() {
        }

        public /* synthetic */ C6242b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        private final int m23410a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C5788q.m22006a((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p337m.C6240d mo16084a(p337m.C6445s r33) {
            /*
                r32 = this;
                r0 = r32
                r1 = r33
                java.lang.String r2 = "headers"
                p308k.p323z.p325d.C5942k.m22327b(r1, r2)
                int r2 = r33.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x01ac
                java.lang.String r3 = r1.mo16604c(r7)
                java.lang.String r5 = r1.mo16606d(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = p308k.p313e0.C5787p.m21979b(r3, r4, r6)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = p308k.p313e0.C5787p.m21979b(r3, r4, r6)
                if (r3 == 0) goto L_0x01a1
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x019a
                java.lang.String r4 = "=,;"
                int r4 = r0.m23410a(r5, r4, r3)
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
                if (r5 == 0) goto L_0x0194
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p308k.p323z.p325d.C5942k.m22324a(r3, r1)
                r29 = r2
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x018e
                java.lang.CharSequence r3 = p308k.p313e0.C5788q.m22032f(r3)
                java.lang.String r3 = r3.toString()
                r30 = r8
                int r8 = r5.length()
                if (r4 == r8) goto L_0x00e5
                char r8 = r5.charAt(r4)
                r31 = r9
                r9 = 44
                if (r8 == r9) goto L_0x00e7
                char r8 = r5.charAt(r4)
                r9 = 59
                if (r8 != r9) goto L_0x0086
                goto L_0x00e7
            L_0x0086:
                int r4 = r4 + 1
                int r4 = p337m.p338f0.C6250b.m23434a(r5, r4)
                int r8 = r5.length()
                if (r4 >= r8) goto L_0x00be
                char r8 = r5.charAt(r4)
                r9 = 34
                if (r8 != r9) goto L_0x00be
                int r4 = r4 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r4
                int r2 = p308k.p313e0.C5788q.m21984a(r23, r24, r25, r26, r27, r28)
                if (r5 == 0) goto L_0x00b8
                java.lang.String r4 = r5.substring(r4, r2)
                p308k.p323z.p325d.C5942k.m22324a(r4, r1)
                r1 = 1
                int r2 = r2 + r1
                goto L_0x00eb
            L_0x00b8:
                k.q r1 = new k.q
                r1.<init>(r6)
                throw r1
            L_0x00be:
                java.lang.String r8 = ",;"
                int r8 = r0.m23410a(r5, r8, r4)
                if (r5 == 0) goto L_0x00df
                java.lang.String r4 = r5.substring(r4, r8)
                p308k.p323z.p325d.C5942k.m22324a(r4, r1)
                if (r4 == 0) goto L_0x00d9
                java.lang.CharSequence r1 = p308k.p313e0.C5788q.m22032f(r4)
                java.lang.String r4 = r1.toString()
                r2 = r8
                goto L_0x00eb
            L_0x00d9:
                k.q r1 = new k.q
                r1.<init>(r2)
                throw r1
            L_0x00df:
                k.q r1 = new k.q
                r1.<init>(r6)
                throw r1
            L_0x00e5:
                r31 = r9
            L_0x00e7:
                int r4 = r4 + 1
                r2 = r4
                r4 = 0
            L_0x00eb:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x00f8
                r1 = -1
                r10 = 1
                goto L_0x0183
            L_0x00f8:
                java.lang.String r1 = "no-store"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x0104
                r1 = -1
                r11 = 1
                goto L_0x0183
            L_0x0104:
                java.lang.String r1 = "max-age"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x0113
                r1 = -1
                int r12 = p337m.p338f0.C6250b.m23468b(r4, r1)
                goto L_0x0183
            L_0x0113:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = p308k.p313e0.C5787p.m21979b(r8, r3, r6)
                if (r8 == 0) goto L_0x0121
                int r13 = p337m.p338f0.C6250b.m23468b(r4, r1)
                goto L_0x0183
            L_0x0121:
                java.lang.String r1 = "private"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x012c
                r1 = -1
                r14 = 1
                goto L_0x0183
            L_0x012c:
                java.lang.String r1 = "public"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x0137
                r1 = -1
                r15 = 1
                goto L_0x0183
            L_0x0137:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x0143
                r1 = -1
                r16 = 1
                goto L_0x0183
            L_0x0143:
                java.lang.String r1 = "max-stale"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x0154
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = p337m.p338f0.C6250b.m23468b(r4, r1)
                r1 = -1
                goto L_0x0183
            L_0x0154:
                java.lang.String r1 = "min-fresh"
                boolean r1 = p308k.p313e0.C5787p.m21979b(r1, r3, r6)
                if (r1 == 0) goto L_0x0162
                r1 = -1
                int r18 = p337m.p338f0.C6250b.m23468b(r4, r1)
                goto L_0x0183
            L_0x0162:
                r1 = -1
                java.lang.String r4 = "only-if-cached"
                boolean r4 = p308k.p313e0.C5787p.m21979b(r4, r3, r6)
                if (r4 == 0) goto L_0x016e
                r19 = 1
                goto L_0x0183
            L_0x016e:
                java.lang.String r4 = "no-transform"
                boolean r4 = p308k.p313e0.C5787p.m21979b(r4, r3, r6)
                if (r4 == 0) goto L_0x0179
                r20 = 1
                goto L_0x0183
            L_0x0179:
                java.lang.String r4 = "immutable"
                boolean r3 = p308k.p313e0.C5787p.m21979b(r4, r3, r6)
                if (r3 == 0) goto L_0x0183
                r21 = 1
            L_0x0183:
                r1 = r33
                r3 = r2
                r2 = r29
                r8 = r30
                r9 = r31
                goto L_0x0044
            L_0x018e:
                k.q r1 = new k.q
                r1.<init>(r2)
                throw r1
            L_0x0194:
                k.q r1 = new k.q
                r1.<init>(r6)
                throw r1
            L_0x019a:
                r29 = r2
                r30 = r8
                r31 = r9
                goto L_0x01a3
            L_0x01a1:
                r29 = r2
            L_0x01a3:
                r1 = -1
                int r7 = r7 + 1
                r1 = r33
                r2 = r29
                goto L_0x0023
            L_0x01ac:
                if (r8 != 0) goto L_0x01b1
                r22 = 0
                goto L_0x01b3
            L_0x01b1:
                r22 = r9
            L_0x01b3:
                m.d r1 = new m.d
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6240d.C6242b.mo16084a(m.s):m.d");
        }
    }

    static {
        C6241a aVar = new C6241a();
        aVar.mo16082b();
        aVar.mo16081a();
        C6241a aVar2 = new C6241a();
        aVar2.mo16083c();
        aVar2.mo16080a(Integer.MAX_VALUE, TimeUnit.SECONDS);
        aVar2.mo16081a();
    }

    private C6240d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f15383a = z;
        this.f15384b = z2;
        this.f15385c = i;
        this.f15386d = i2;
        this.f15387e = z3;
        this.f15388f = z4;
        this.f15389g = z5;
        this.f15390h = i3;
        this.f15391i = i4;
        this.f15392j = z6;
        this.f15393k = z7;
        this.f15394l = z8;
        this.f15395m = str;
    }

    public /* synthetic */ C6240d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, C5938g gVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    /* renamed from: a */
    public final boolean mo16070a() {
        return this.f15387e;
    }

    /* renamed from: b */
    public final boolean mo16071b() {
        return this.f15388f;
    }

    /* renamed from: c */
    public final int mo16072c() {
        return this.f15385c;
    }

    /* renamed from: d */
    public final int mo16073d() {
        return this.f15390h;
    }

    /* renamed from: e */
    public final int mo16074e() {
        return this.f15391i;
    }

    /* renamed from: f */
    public final boolean mo16075f() {
        return this.f15389g;
    }

    /* renamed from: g */
    public final boolean mo16076g() {
        return this.f15383a;
    }

    /* renamed from: h */
    public final boolean mo16077h() {
        return this.f15384b;
    }

    /* renamed from: i */
    public final boolean mo16078i() {
        return this.f15392j;
    }

    public String toString() {
        String str = this.f15395m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f15383a) {
                sb.append("no-cache, ");
            }
            if (this.f15384b) {
                sb.append("no-store, ");
            }
            String str2 = ", ";
            if (this.f15385c != -1) {
                sb.append("max-age=");
                sb.append(this.f15385c);
                sb.append(str2);
            }
            if (this.f15386d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f15386d);
                sb.append(str2);
            }
            if (this.f15387e) {
                sb.append("private, ");
            }
            if (this.f15388f) {
                sb.append("public, ");
            }
            if (this.f15389g) {
                sb.append("must-revalidate, ");
            }
            if (this.f15390h != -1) {
                sb.append("max-stale=");
                sb.append(this.f15390h);
                sb.append(str2);
            }
            if (this.f15391i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f15391i);
                sb.append(str2);
            }
            if (this.f15392j) {
                sb.append("only-if-cached, ");
            }
            if (this.f15393k) {
                sb.append("no-transform, ");
            }
            if (this.f15394l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
            C5942k.m22324a((Object) str, "StringBuilder().apply(builderAction).toString()");
            this.f15395m = str;
        }
        return str;
    }
}
