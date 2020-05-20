package p308k.p313e0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p308k.C5802l;
import p308k.C5808p;
import p308k.p310b0.C5729b;
import p308k.p310b0.C5732d;
import p308k.p312d0.C5751d;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: k.e0.q */
class C5788q extends C5787p {

    /* renamed from: k.e0.q$a */
    static final class C5789a extends C5943l implements C5922p<CharSequence, Integer, C5802l<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ char[] f14853g;

        /* renamed from: h */
        final /* synthetic */ boolean f14854h;

        C5789a(char[] cArr, boolean z) {
            this.f14853g = cArr;
            this.f14854h = z;
            super(2);
        }

        /* renamed from: a */
        public final C5802l<Integer, Integer> mo15409a(CharSequence charSequence, int i) {
            C5942k.m22327b(charSequence, "$receiver");
            int a = C5788q.m21989a(charSequence, this.f14853g, i, this.f14854h);
            if (a < 0) {
                return null;
            }
            return C5808p.m22056a(Integer.valueOf(a), Integer.valueOf(1));
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo4018c(Object obj, Object obj2) {
            return mo15409a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: k.e0.q$b */
    static final class C5790b extends C5943l implements C5922p<CharSequence, Integer, C5802l<? extends Integer, ? extends Integer>> {

        /* renamed from: g */
        final /* synthetic */ List f14855g;

        /* renamed from: h */
        final /* synthetic */ boolean f14856h;

        C5790b(List list, boolean z) {
            this.f14855g = list;
            this.f14856h = z;
            super(2);
        }

        /* renamed from: a */
        public final C5802l<Integer, Integer> mo15410a(CharSequence charSequence, int i) {
            C5942k.m22327b(charSequence, "$receiver");
            C5802l a = C5788q.m22023b(charSequence, (Collection<String>) this.f14855g, i, this.f14856h, false);
            if (a != null) {
                return C5808p.m22056a(a.mo15420c(), Integer.valueOf(((String) a.mo15421d()).length()));
            }
            return null;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo4018c(Object obj, Object obj2) {
            return mo15410a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: k.e0.q$c */
    static final class C5791c extends C5943l implements C5918l<C5732d, String> {

        /* renamed from: g */
        final /* synthetic */ CharSequence f14857g;

        C5791c(CharSequence charSequence) {
            this.f14857g = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String mo4090d(C5732d dVar) {
            C5942k.m22327b(dVar, "it");
            return C5788q.m21990a(this.f14857g, dVar);
        }
    }

    /* renamed from: k.e0.q$d */
    static final class C5792d extends C5943l implements C5918l<C5732d, String> {

        /* renamed from: g */
        final /* synthetic */ CharSequence f14858g;

        C5792d(CharSequence charSequence) {
            this.f14858g = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String mo4090d(C5732d dVar) {
            C5942k.m22327b(dVar, "it");
            return C5788q.m21990a(this.f14858g, dVar);
        }
    }

    /* renamed from: a */
    public static final int m21983a(CharSequence charSequence, char c, int i, boolean z) {
        C5942k.m22327b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m21989a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ int m21984a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m21983a(charSequence, c, i, z);
    }

    /* renamed from: a */
    private static final int m21985a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C5729b dVar = !z2 ? new C5732d(C5736g.m21866a(i, 0), C5736g.m21872b(i2, charSequence.length())) : C5736g.m21874c(C5736g.m21872b(i, m22026c(charSequence)), C5736g.m21866a(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int c = dVar.mo15363c();
            int d = dVar.mo15364d();
            int e = dVar.mo15365e();
            if (e < 0 ? c >= d : c <= d) {
                while (true) {
                    if (!m22007a(charSequence2, 0, charSequence, c, charSequence2.length(), z)) {
                        if (c == d) {
                            break;
                        }
                        c += e;
                    } else {
                        return c;
                    }
                }
            }
        } else {
            int c2 = dVar.mo15363c();
            int d2 = dVar.mo15364d();
            int e2 = dVar.mo15365e();
            if (e2 < 0 ? c2 >= d2 : c2 <= d2) {
                while (true) {
                    if (!C5787p.m21973a((String) charSequence2, 0, (String) charSequence, c2, charSequence2.length(), z)) {
                        if (c2 == d2) {
                            break;
                        }
                        c2 += e2;
                    } else {
                        return c2;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    static /* synthetic */ int m21986a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m21985a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    public static final int m21987a(CharSequence charSequence, String str, int i, boolean z) {
        C5942k.m22327b(charSequence, "$this$indexOf");
        C5942k.m22327b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m21986a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: a */
    public static /* synthetic */ int m21988a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m21987a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final int m21989a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C5942k.m22327b(charSequence, "$this$indexOfAny");
        C5942k.m22327b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C5736g.m21866a(i, 0);
            int c = m22026c(charSequence);
            if (a <= c) {
                while (true) {
                    char charAt = charSequence.charAt(a);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C5768c.m21916a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (a == c) {
                            break;
                        }
                        a++;
                    } else {
                        return a;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C5832h.m22114a(cArr), i);
    }

    /* renamed from: a */
    public static final String m21990a(CharSequence charSequence, C5732d dVar) {
        C5942k.m22327b(charSequence, "$this$substring");
        C5942k.m22327b(dVar, "range");
        return charSequence.subSequence(dVar.mo15376g().intValue(), dVar.mo15375f().intValue() + 1).toString();
    }

    /* renamed from: a */
    public static final String m21991a(String str, char c, String str2) {
        C5942k.m22327b(str, "$this$substringAfterLast");
        C5942k.m22327b(str2, "missingDelimiterValue");
        int b = m22011b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* synthetic */ String m21992a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m21991a(str, c, str2);
    }

    /* renamed from: a */
    public static String m21993a(String str, CharSequence charSequence) {
        C5942k.m22327b(str, "$this$removePrefix");
        C5942k.m22327b(charSequence, "prefix");
        if (!m22029c(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C5942k.m22324a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: a */
    public static /* synthetic */ String m21994a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m22018b(str, str2, str3);
    }

    /* renamed from: a */
    private static final List<String> m21995a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = m21987a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C5836k.m22153a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C5736g.m21872b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = m21987a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static final List<String> m21996a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C5942k.m22327b(charSequence, "$this$split");
        C5942k.m22327b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m21995a(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C5732d> b = C5761l.m21907b(m21999a(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C5838m.m22166a(b, 10));
        for (C5732d a : b) {
            arrayList.add(m21990a(charSequence, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ List m21997a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m21996a(charSequence, cArr, z, i);
    }

    /* renamed from: a */
    private static final C5751d<C5732d> m21998a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C5770e(charSequence, i, i2, new C5789a(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    static /* synthetic */ C5751d m21999a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m21998a(charSequence, cArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C5751d<C5732d> m22000a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C5770e(charSequence, i, i2, new C5790b(C5830g.m22102a(strArr), z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    static /* synthetic */ C5751d m22001a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m22000a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    public static final C5751d<String> m22002a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C5942k.m22327b(charSequence, "$this$splitToSequence");
        C5942k.m22327b(strArr, "delimiters");
        return C5761l.m21906a(m22001a(charSequence, strArr, 0, z, i, 2, (Object) null), (C5918l<? super T, ? extends R>) new C5791c<Object,Object>(charSequence));
    }

    /* renamed from: a */
    public static /* synthetic */ C5751d m22003a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m22002a(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static final boolean m22005a(CharSequence charSequence, char c, boolean z) {
        C5942k.m22327b(charSequence, "$this$contains");
        return m21984a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m22006a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m22005a(charSequence, c, z);
    }

    /* renamed from: a */
    public static final boolean m22007a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C5942k.m22327b(charSequence, "$this$regionMatchesImpl");
        C5942k.m22327b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C5768c.m21916a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m22008a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C5942k.m22327b(charSequence, "$this$contains");
        C5942k.m22327b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m21988a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m21986a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m22009a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m22008a(charSequence, charSequence2, z);
    }

    /* renamed from: b */
    public static final int m22010b(CharSequence charSequence, char c, int i, boolean z) {
        C5942k.m22327b(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m22014b(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static /* synthetic */ int m22011b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m22026c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m22010b(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static final int m22012b(CharSequence charSequence, String str, int i, boolean z) {
        C5942k.m22327b(charSequence, "$this$lastIndexOf");
        C5942k.m22327b(str, "string");
        return (z || !(charSequence instanceof String)) ? m21985a(charSequence, (CharSequence) str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: b */
    public static /* synthetic */ int m22013b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m22026c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m22012b(charSequence, str, i, z);
    }

    /* renamed from: b */
    public static final int m22014b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C5942k.m22327b(charSequence, "$this$lastIndexOfAny");
        C5942k.m22327b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b = C5736g.m21872b(i, m22026c(charSequence)); b >= 0; b--) {
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C5768c.m21916a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C5832h.m22114a(cArr), i);
    }

    /* renamed from: b */
    public static final String m22015b(String str, char c, String str2) {
        C5942k.m22327b(str, "$this$substringBefore");
        C5942k.m22327b(str2, "missingDelimiterValue");
        int a = m21984a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* synthetic */ String m22016b(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m22015b(str, c, str2);
    }

    /* renamed from: b */
    public static String m22017b(String str, CharSequence charSequence) {
        C5942k.m22327b(str, "$this$removeSuffix");
        C5942k.m22327b(charSequence, "suffix");
        if (!m22025b((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static final String m22018b(String str, String str2, String str3) {
        C5942k.m22327b(str, "$this$substringAfter");
        C5942k.m22327b(str2, "delimiter");
        C5942k.m22327b(str3, "missingDelimiterValue");
        int a = m21988a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* synthetic */ String m22019b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m22027c(str, str2, str3);
    }

    /* renamed from: b */
    public static final C5732d m22020b(CharSequence charSequence) {
        C5942k.m22327b(charSequence, "$this$indices");
        return new C5732d(0, charSequence.length() - 1);
    }

    /* renamed from: b */
    public static final C5751d<String> m22021b(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C5942k.m22327b(charSequence, "$this$splitToSequence");
        C5942k.m22327b(cArr, "delimiters");
        return C5761l.m21906a(m21999a(charSequence, cArr, 0, z, i, 2, (Object) null), (C5918l<? super T, ? extends R>) new C5792d<Object,Object>(charSequence));
    }

    /* renamed from: b */
    public static /* synthetic */ C5751d m22022b(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m22021b(charSequence, cArr, z, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C5802l<Integer, String> m22023b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        Object obj;
        String str;
        Object obj2;
        C5802l<Integer, String> lVar = null;
        if (z || collection.size() != 1) {
            C5729b dVar = !z2 ? new C5732d(C5736g.m21866a(i, 0), charSequence.length()) : C5736g.m21874c(C5736g.m21872b(i, m22026c(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = dVar.mo15363c();
                int d = dVar.mo15364d();
                int e = dVar.mo15365e();
                if (e < 0 ? i2 >= d : i2 <= d) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (C5787p.m21973a(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) obj2;
                        if (str == null) {
                            if (i2 == d) {
                                break;
                            }
                            i2 += e;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int c = dVar.mo15363c();
            int d2 = dVar.mo15364d();
            int e2 = dVar.mo15365e();
            if (e2 < 0 ? c >= d2 : c <= d2) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str3 = (String) obj;
                        if (m22007a((CharSequence) str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) obj;
                    if (str == null) {
                        if (i2 == d2) {
                            break;
                        }
                        c = i2 + e2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return C5808p.m22056a(Integer.valueOf(i2), str);
        }
        String str4 = (String) C5845t.m22179b((Iterable) collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int a = !z2 ? m21988a(charSequence2, str5, i3, false, 4, (Object) null) : m22013b(charSequence2, str5, i3, false, 4, (Object) null);
        if (a >= 0) {
            lVar = C5808p.m22056a(Integer.valueOf(a), str4);
        }
        return lVar;
    }

    /* renamed from: b */
    public static final boolean m22024b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C5942k.m22327b(charSequence, "$this$endsWith");
        C5942k.m22327b(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C5787p.m21978a((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return m22007a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m22025b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m22024b(charSequence, charSequence2, z);
    }

    /* renamed from: c */
    public static final int m22026c(CharSequence charSequence) {
        C5942k.m22327b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: c */
    public static final String m22027c(String str, String str2, String str3) {
        C5942k.m22327b(str, "$this$substringBefore");
        C5942k.m22327b(str2, "delimiter");
        C5942k.m22327b(str3, "missingDelimiterValue");
        int a = m21988a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final boolean m22028c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C5942k.m22327b(charSequence, "$this$startsWith");
        C5942k.m22327b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C5787p.m21980b((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return m22007a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m22029c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m22028c(charSequence, charSequence2, z);
    }

    /* renamed from: d */
    public static final C5751d<String> m22030d(CharSequence charSequence) {
        C5942k.m22327b(charSequence, "$this$lineSequence");
        return m22003a(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: e */
    public static final List<String> m22031e(CharSequence charSequence) {
        C5942k.m22327b(charSequence, "$this$lines");
        return C5761l.m21908c(m22030d(charSequence));
    }

    /* renamed from: f */
    public static CharSequence m22032f(CharSequence charSequence) {
        C5942k.m22327b(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C5767b.m21915a(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
