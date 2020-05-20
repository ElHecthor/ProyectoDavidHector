package p308k.p313e0;

import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: k.e0.i */
class C5778i extends C5777h {

    /* renamed from: k.e0.i$a */
    static final class C5779a extends C5943l implements C5918l<String, String> {

        /* renamed from: g */
        public static final C5779a f14851g = new C5779a();

        C5779a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo15407a(String str) {
            C5942k.m22327b(str, "line");
            return str;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            String str = (String) obj;
            mo15407a(str);
            return str;
        }
    }

    /* renamed from: k.e0.i$b */
    static final class C5780b extends C5943l implements C5918l<String, String> {

        /* renamed from: g */
        final /* synthetic */ String f14852g;

        C5780b(String str) {
            this.f14852g = str;
            super(1);
        }

        /* renamed from: a */
        public final String mo4090d(String str) {
            C5942k.m22327b(str, "line");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14852g);
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static final String m21956a(String str, String str2) {
        C5942k.m22327b(str, "$this$trimMargin");
        C5942k.m22327b(str2, "marginPrefix");
        return m21958a(str, "", str2);
    }

    /* renamed from: a */
    public static /* synthetic */ String m21957a(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m21956a(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r14 != null) goto L_0x00b7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m21958a(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            java.lang.String r0 = "$this$replaceIndentByMargin"
            r1 = r21
            p308k.p323z.p325d.C5942k.m22327b(r1, r0)
            java.lang.String r0 = "newIndent"
            r2 = r22
            p308k.p323z.p325d.C5942k.m22327b(r2, r0)
            java.lang.String r0 = "marginPrefix"
            r7 = r23
            p308k.p323z.p325d.C5942k.m22327b(r7, r0)
            boolean r0 = p308k.p313e0.C5787p.m21972a(r23)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e5
            java.util.List r0 = p308k.p313e0.C5788q.m22031e(r21)
            int r1 = r21.length()
            int r3 = r22.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r8 = r1 + r3
            k.z.c.l r9 = m21959a(r22)
            int r10 = p308k.p314u.C5837l.m22155a(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
            r12 = 0
            r1 = 0
        L_0x0044:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r2 = r0.next()
            int r13 = r1 + 1
            r14 = 0
            if (r1 < 0) goto L_0x00be
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            if (r1 == 0) goto L_0x005a
            if (r1 != r10) goto L_0x0061
        L_0x005a:
            boolean r1 = p308k.p313e0.C5787p.m21972a(r15)
            if (r1 == 0) goto L_0x0061
            goto L_0x00b7
        L_0x0061:
            int r1 = r15.length()
            r2 = 0
        L_0x0066:
            r3 = -1
            if (r2 >= r1) goto L_0x007a
            char r4 = r15.charAt(r2)
            boolean r4 = p308k.p313e0.C5767b.m21915a(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0077
            r6 = r2
            goto L_0x007b
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x0066
        L_0x007a:
            r6 = -1
        L_0x007b:
            if (r6 != r3) goto L_0x007e
            goto L_0x00aa
        L_0x007e:
            r4 = 0
            r5 = 4
            r16 = 0
            r1 = r15
            r2 = r23
            r3 = r6
            r17 = r6
            r6 = r16
            boolean r1 = p308k.p313e0.C5787p.m21976a(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x00aa
            int r1 = r23.length()
            int r6 = r17 + r1
            if (r15 == 0) goto L_0x00a2
            java.lang.String r14 = r15.substring(r6)
            java.lang.String r1 = "(this as java.lang.String).substring(startIndex)"
            p308k.p323z.p325d.C5942k.m22324a(r14, r1)
            goto L_0x00aa
        L_0x00a2:
            k.q r0 = new k.q
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            if (r14 == 0) goto L_0x00b6
            java.lang.Object r1 = r9.mo4090d(r14)
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r14 = r15
        L_0x00b7:
            if (r14 == 0) goto L_0x00bc
            r11.add(r14)
        L_0x00bc:
            r1 = r13
            goto L_0x0044
        L_0x00be:
            p308k.p314u.C5835j.m22144b()
            throw r14
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 124(0x7c, float:1.74E-43)
            r20 = 0
            java.lang.String r13 = "\n"
            r12 = r0
            p308k.p314u.C5845t.m22172a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            p308k.p323z.p325d.C5942k.m22324a(r0, r1)
            return r0
        L_0x00e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "marginPrefix must be non-blank string."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p313e0.C5778i.m21958a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static final C5918l<String, String> m21959a(String str) {
        return str.length() == 0 ? C5779a.f14851g : new C5780b(str);
    }
}
