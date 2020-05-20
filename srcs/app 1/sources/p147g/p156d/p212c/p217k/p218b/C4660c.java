package p147g.p156d.p212c.p217k.p218b;

/* renamed from: g.d.c.k.b.c */
class C4660c implements C4664g {
    C4660c() {
    }

    /* renamed from: a */
    private int m18787a(C4665h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f12238f--;
        int a = mo13612a(hVar.mo13627c(), sb2);
        hVar.mo13635j();
        return a;
    }

    /* renamed from: a */
    private static String m18788a(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    /* renamed from: b */
    static void m18789b(C4665h hVar, StringBuilder sb) {
        hVar.mo13624a(m18788a((CharSequence) sb, 0));
        sb.delete(0, 3);
    }

    /* renamed from: a */
    public int mo13611a() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo13612a(char c, StringBuilder sb) {
        int i;
        int i2;
        char c2;
        if (c == ' ') {
            c2 = 3;
        } else {
            if (c >= '0' && c <= '9') {
                i2 = (c - '0') + 4;
            } else if (c < 'A' || c > 'Z') {
                if (c < ' ') {
                    sb.append(0);
                } else {
                    char c3 = '!';
                    if (c >= '!' && c <= '/') {
                        sb.append(1);
                    } else if (c >= ':' && c <= '@') {
                        sb.append(1);
                        i = (c - ':') + 15;
                        c = (char) i;
                    } else if (c < '[' || c > '_') {
                        c3 = '`';
                        if (c < '`' || c > 127) {
                            sb.append("\u0001\u001e");
                            return mo13612a((char) (c - 128), sb) + 2;
                        }
                        sb.append(2);
                    } else {
                        sb.append(1);
                        i = (c - '[') + 22;
                        c = (char) i;
                    }
                    i = c - c3;
                    c = (char) i;
                }
                sb.append(c);
                return 2;
            } else {
                i2 = (c - 'A') + 14;
            }
            c2 = (char) i2;
        }
        sb.append(c2);
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r2 != 1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r1 > 3) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        if (r2 > 2) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13609a(p147g.p156d.p212c.p217k.p218b.C4665h r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.mo13633h()
            if (r1 == 0) goto L_0x0079
            char r1 = r9.mo13627c()
            int r2 = r9.f12238f
            r3 = 1
            int r2 = r2 + r3
            r9.f12238f = r2
            int r1 = r8.mo13612a(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            int r2 = r2 << r3
            int r5 = r9.mo13619a()
            int r5 = r5 + r2
            r9.mo13628c(r5)
            g.d.c.k.b.k r2 = r9.mo13632g()
            int r2 = r2.mo13637a()
            int r2 = r2 - r5
            boolean r5 = r9.mo13633h()
            if (r5 != 0) goto L_0x005a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r0.length()
            int r6 = r6 % r4
            r7 = 2
            if (r6 != r7) goto L_0x004c
            if (r2 < r7) goto L_0x0048
            if (r2 <= r7) goto L_0x004c
        L_0x0048:
            int r1 = r8.m18787a(r9, r0, r5, r1)
        L_0x004c:
            int r6 = r0.length()
            int r6 = r6 % r4
            if (r6 != r3) goto L_0x0079
            if (r1 > r4) goto L_0x0057
            if (r2 != r3) goto L_0x0048
        L_0x0057:
            if (r1 <= r4) goto L_0x0079
            goto L_0x0048
        L_0x005a:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L_0x0005
            java.lang.String r1 = r9.mo13629d()
            int r2 = r9.f12238f
            int r3 = r8.mo13611a()
            int r1 = p147g.p156d.p212c.p217k.p218b.C4667j.m18836a(r1, r2, r3)
            int r2 = r8.mo13611a()
            if (r1 == r2) goto L_0x0005
            r1 = 0
            r9.mo13626b(r1)
        L_0x0079:
            r8.mo13613a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p217k.p218b.C4660c.mo13609a(g.d.c.k.b.h):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r8.mo13633h() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r8.mo13633h() != false) goto L_0x0037;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13613a(p147g.p156d.p212c.p217k.p218b.C4665h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.mo13619a()
            int r4 = r4 + r0
            r8.mo13628c(r4)
            g.d.c.k.b.k r0 = r8.mo13632g()
            int r0 = r0.mo13637a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 2
            if (r3 != r6) goto L_0x003b
            r9.append(r4)
        L_0x0027:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0031
            m18789b(r8, r9)
            goto L_0x0027
        L_0x0031:
            boolean r9 = r8.mo13633h()
            if (r9 == 0) goto L_0x006d
        L_0x0037:
            r8.mo13620a(r5)
            goto L_0x006d
        L_0x003b:
            if (r0 != r2) goto L_0x0058
            if (r3 != r2) goto L_0x0058
        L_0x003f:
            int r0 = r9.length()
            if (r0 < r1) goto L_0x0049
            m18789b(r8, r9)
            goto L_0x003f
        L_0x0049:
            boolean r9 = r8.mo13633h()
            if (r9 == 0) goto L_0x0052
            r8.mo13620a(r5)
        L_0x0052:
            int r9 = r8.f12238f
            int r9 = r9 - r2
            r8.f12238f = r9
            goto L_0x006d
        L_0x0058:
            if (r3 != 0) goto L_0x0071
        L_0x005a:
            int r2 = r9.length()
            if (r2 < r1) goto L_0x0064
            m18789b(r8, r9)
            goto L_0x005a
        L_0x0064:
            if (r0 > 0) goto L_0x0037
            boolean r9 = r8.mo13633h()
            if (r9 == 0) goto L_0x006d
            goto L_0x0037
        L_0x006d:
            r8.mo13626b(r4)
            return
        L_0x0071:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p217k.p218b.C4660c.mo13613a(g.d.c.k.b.h, java.lang.StringBuilder):void");
    }
}
