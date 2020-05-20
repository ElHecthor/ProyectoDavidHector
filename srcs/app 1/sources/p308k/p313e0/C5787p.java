package p308k.p313e0;

import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.e0.p */
class C5787p extends C5786o {
    /* renamed from: a */
    public static final String m21968a(String str, char c, char c2, boolean z) {
        C5942k.m22327b(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            C5942k.m22324a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return C5761l.m21903a(C5788q.m22022b((CharSequence) str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m21969a(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m21968a(str, c, c2, z);
    }

    /* renamed from: a */
    public static final String m21970a(String str, String str2, String str3, boolean z) {
        C5942k.m22327b(str, "$this$replace");
        C5942k.m22327b(str2, "oldValue");
        C5942k.m22327b(str3, "newValue");
        return C5761l.m21903a(C5788q.m22003a((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, null, null, 0, null, null, 62, null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m21971a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m21970a(str, str2, str3, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21972a(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            p308k.p323z.p325d.C5942k.m22327b(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            k.b0.d r0 = p308k.p313e0.C5788q.m22020b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            k.u.y r3 = (p308k.p314u.C5851y) r3
            int r3 = r3.mo15372b()
            char r3 = r4.charAt(r3)
            boolean r3 = p308k.p313e0.C5767b.m21915a(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p313e0.C5787p.m21972a(java.lang.CharSequence):boolean");
    }

    /* renamed from: a */
    public static final boolean m21973a(String str, int i, String str2, int i2, int i3, boolean z) {
        C5942k.m22327b(str, "$this$regionMatches");
        C5942k.m22327b(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m21974a(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return m21973a(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    /* renamed from: a */
    public static boolean m21975a(String str, String str2, int i, boolean z) {
        C5942k.m22327b(str, "$this$startsWith");
        C5942k.m22327b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m21973a(str, i, str2, 0, str2.length(), z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m21976a(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m21975a(str, str2, i, z);
    }

    /* renamed from: a */
    public static final boolean m21977a(String str, String str2, boolean z) {
        C5942k.m22327b(str, "$this$endsWith");
        C5942k.m22327b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m21973a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m21978a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m21977a(str, str2, z);
    }

    /* renamed from: b */
    public static boolean m21979b(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m21980b(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m21982c(str, str2, z);
    }

    /* renamed from: c */
    public static String m21981c(String str) {
        C5942k.m22327b(str, "$this$capitalize");
        if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String upperCase = substring.toUpperCase();
            C5942k.m22324a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            C5942k.m22324a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public static boolean m21982c(String str, String str2, boolean z) {
        C5942k.m22327b(str, "$this$startsWith");
        C5942k.m22327b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m21973a(str, 0, str2, 0, str2.length(), z);
    }
}
