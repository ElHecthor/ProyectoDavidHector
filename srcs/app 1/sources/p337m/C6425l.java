package p337m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p308k.C5809q;
import p308k.p313e0.C5772f;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6249a;
import p337m.p338f0.C6250b;
import p337m.p338f0.p342f.C6293c;

/* renamed from: m.l */
public final class C6425l {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Pattern f15912j = Pattern.compile("(\\d{2,4})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Pattern f15913k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Pattern f15914l = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Pattern f15915m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    public static final C6426a f15916n = new C6426a(null);

    /* renamed from: a */
    private final String f15917a;

    /* renamed from: b */
    private final String f15918b;

    /* renamed from: c */
    private final long f15919c;

    /* renamed from: d */
    private final String f15920d;

    /* renamed from: e */
    private final String f15921e;

    /* renamed from: f */
    private final boolean f15922f;

    /* renamed from: g */
    private final boolean f15923g;

    /* renamed from: h */
    private final boolean f15924h;

    /* renamed from: i */
    private final boolean f15925i;

    /* renamed from: m.l$a */
    public static final class C6426a {
        private C6426a() {
        }

        public /* synthetic */ C6426a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        private final int m24193a(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        /* renamed from: a */
        private final long m24194a(String str, int i, int i2) {
            String str2 = str;
            int i3 = i2;
            int a = m24193a(str2, i, i3, false);
            Matcher matcher = C6425l.f15915m.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (a < i3) {
                int a2 = m24193a(str2, a + 1, i3, true);
                matcher.region(a, a2);
                String str3 = "matcher.group(1)";
                if (i5 == -1 && matcher.usePattern(C6425l.f15915m).matches()) {
                    String group = matcher.group(1);
                    C5942k.m22324a((Object) group, str3);
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C5942k.m22324a((Object) group2, "matcher.group(2)");
                    i8 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C5942k.m22324a((Object) group3, "matcher.group(3)");
                    i9 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(C6425l.f15914l).matches()) {
                    String group4 = matcher.group(1);
                    C5942k.m22324a((Object) group4, str3);
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(C6425l.f15913k).matches()) {
                    String group5 = matcher.group(1);
                    C5942k.m22324a((Object) group5, str3);
                    Locale locale = Locale.US;
                    C5942k.m22324a((Object) locale, "Locale.US");
                    if (group5 != null) {
                        String lowerCase = group5.toLowerCase(locale);
                        C5942k.m22324a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern = C6425l.f15913k.pattern();
                        C5942k.m22324a((Object) pattern, "MONTH_PATTERN.pattern()");
                        i7 = C5788q.m21988a((CharSequence) pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                    } else {
                        throw new C5809q("null cannot be cast to non-null type java.lang.String");
                    }
                } else if (i4 == -1 && matcher.usePattern(C6425l.f15912j).matches()) {
                    String group6 = matcher.group(1);
                    C5942k.m22324a((Object) group6, str3);
                    i4 = Integer.parseInt(group6);
                }
                a = m24193a(str2, a2 + 1, i3, false);
            }
            if (70 <= i4 && 99 >= i4) {
                i4 += 1900;
            }
            if (i4 >= 0 && 69 >= i4) {
                i4 += 2000;
            }
            String str4 = "Failed requirement.";
            if (i4 >= 1601) {
                if (i7 != -1) {
                    if (1 <= i6 && 31 >= i6) {
                        if (i5 >= 0 && 23 >= i5) {
                            if (i8 >= 0 && 59 >= i8) {
                                if (i9 >= 0 && 59 >= i9) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(C6250b.f15419e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException(str4.toString());
                            }
                            throw new IllegalArgumentException(str4.toString());
                        }
                        throw new IllegalArgumentException(str4.toString());
                    }
                    throw new IllegalArgumentException(str4.toString());
                }
                throw new IllegalArgumentException(str4.toString());
            }
            throw new IllegalArgumentException(str4.toString());
        }

        /* renamed from: a */
        private final String m24195a(String str) {
            String str2 = ".";
            if (!C5787p.m21978a(str, str2, false, 2, null)) {
                String b = C6249a.m23429b(C5788q.m21993a(str, (CharSequence) str2));
                if (b != null) {
                    return b;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        private final boolean m24196a(String str, String str2) {
            boolean z = true;
            if (C5942k.m22326a((Object) str, (Object) str2)) {
                return true;
            }
            if (!C5787p.m21978a(str, str2, false, 2, null) || str.charAt((str.length() - str2.length()) - 1) != '.' || C6250b.m23461a(str)) {
                z = false;
            }
            return z;
        }

        /* renamed from: b */
        private final long m24197b(String str) {
            long j = Long.MIN_VALUE;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    j = parseLong;
                }
                return j;
            } catch (NumberFormatException e) {
                if (new C5772f("-?\\d+").mo15405a(str)) {
                    if (!C5787p.m21980b(str, "-", false, 2, null)) {
                        j = Long.MAX_VALUE;
                    }
                    return j;
                }
                throw e;
            }
        }

        /* renamed from: a */
        public final List<C6425l> mo16554a(C6448t tVar, C6445s sVar) {
            C5942k.m22327b(tVar, "url");
            C5942k.m22327b(sVar, "headers");
            List b = sVar.mo16603b("Set-Cookie");
            int size = b.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                C6425l a = mo16556a(tVar, (String) b.get(i));
                if (a != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a);
                }
            }
            if (arrayList == null) {
                return C5837l.m22159a();
            }
            List<C6425l> unmodifiableList = Collections.unmodifiableList(arrayList);
            C5942k.m22324a((Object) unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
            if (r1 > 253402300799999L) goto L_0x010b;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x015b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p337m.C6425l mo16555a(long r26, p337m.C6448t r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                p308k.p323z.p325d.C5942k.m22327b(r8, r1)
                java.lang.String r1 = "setCookie"
                p308k.p323z.p325d.C5942k.m22327b(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r29
                int r9 = p337m.p338f0.C6250b.m23433a(r1, r2, r3, r4, r5, r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = p337m.p338f0.C6250b.m23433a(r1, r2, r3, r4, r5, r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = p337m.p338f0.C6250b.m23475c(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0036
                r5 = 1
                goto L_0x0037
            L_0x0036:
                r5 = 0
            L_0x0037:
                if (r5 != 0) goto L_0x017a
                int r5 = p337m.p338f0.C6250b.m23467b(r11)
                r6 = -1
                if (r5 == r6) goto L_0x0042
                goto L_0x017a
            L_0x0042:
                int r1 = r1 + r4
                java.lang.String r12 = p337m.p338f0.C6250b.m23474c(r7, r1, r9)
                int r1 = p337m.p338f0.C6250b.m23467b(r12)
                if (r1 == r6) goto L_0x004e
                return r2
            L_0x004e:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r15 = r5
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 1
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0066:
                if (r9 >= r1) goto L_0x00d6
                r2 = 59
                int r2 = p337m.p338f0.C6250b.m23432a(r7, r2, r9, r1)
                r13 = 61
                int r13 = p337m.p338f0.C6250b.m23432a(r7, r13, r9, r2)
                java.lang.String r9 = p337m.p338f0.C6250b.m23474c(r7, r9, r13)
                if (r13 >= r2) goto L_0x0081
                int r13 = r13 + 1
                java.lang.String r13 = p337m.p338f0.C6250b.m23474c(r7, r13, r2)
                goto L_0x0083
            L_0x0081:
                java.lang.String r13 = ""
            L_0x0083:
                java.lang.String r14 = "expires"
                boolean r14 = p308k.p313e0.C5787p.m21979b(r9, r14, r4)
                if (r14 == 0) goto L_0x0094
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00d2 }
                long r23 = r0.m24194a(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                goto L_0x00a0
            L_0x0094:
                java.lang.String r14 = "max-age"
                boolean r14 = p308k.p313e0.C5787p.m21979b(r9, r14, r4)
                if (r14 == 0) goto L_0x00a3
                long r15 = r0.m24197b(r13)     // Catch:{  }
            L_0x00a0:
                r19 = 1
                goto L_0x00d2
            L_0x00a3:
                java.lang.String r14 = "domain"
                boolean r14 = p308k.p313e0.C5787p.m21979b(r9, r14, r4)
                if (r14 == 0) goto L_0x00b2
                java.lang.String r10 = r0.m24195a(r13)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                r20 = 0
                goto L_0x00d2
            L_0x00b2:
                java.lang.String r14 = "path"
                boolean r14 = p308k.p313e0.C5787p.m21979b(r9, r14, r4)
                if (r14 == 0) goto L_0x00bd
                r22 = r13
                goto L_0x00d2
            L_0x00bd:
                java.lang.String r13 = "secure"
                boolean r13 = p308k.p313e0.C5787p.m21979b(r9, r13, r4)
                if (r13 == 0) goto L_0x00c8
                r17 = 1
                goto L_0x00d2
            L_0x00c8:
                java.lang.String r13 = "httponly"
                boolean r9 = p308k.p313e0.C5787p.m21979b(r9, r13, r4)
                if (r9 == 0) goto L_0x00d2
                r18 = 1
            L_0x00d2:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0066
            L_0x00d6:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00de
            L_0x00dc:
                r13 = r1
                goto L_0x010f
            L_0x00de:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x010d
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 > 0) goto L_0x00f1
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f6
            L_0x00f1:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f6:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0106
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00dc
                goto L_0x010b
            L_0x0106:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x010b:
                r13 = r4
                goto L_0x010f
            L_0x010d:
                r13 = r23
            L_0x010f:
                java.lang.String r1 = r28.mo16629g()
                if (r10 != 0) goto L_0x0118
                r15 = r1
                r2 = 0
                goto L_0x0122
            L_0x0118:
                boolean r2 = r0.m24196a(r1, r10)
                if (r2 != 0) goto L_0x0120
                r2 = 0
                return r2
            L_0x0120:
                r2 = 0
                r15 = r10
            L_0x0122:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0139
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$a r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f16231h
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.mo17037a()
                java.lang.String r1 = r1.mo17036a(r15)
                if (r1 != 0) goto L_0x0139
                return r2
            L_0x0139:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x014a
                r5 = 2
                boolean r2 = p308k.p313e0.C5787p.m21980b(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0147
                goto L_0x014a
            L_0x0147:
                r16 = r4
                goto L_0x0171
            L_0x014a:
                java.lang.String r2 = r28.mo16624c()
                r6 = 47
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                int r4 = p308k.p313e0.C5788q.m22011b(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x016f
                if (r2 == 0) goto L_0x0167
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                p308k.p323z.p325d.C5942k.m22324a(r1, r2)
                goto L_0x016f
            L_0x0167:
                k.q r1 = new k.q
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
                r1.<init>(r2)
                throw r1
            L_0x016f:
                r16 = r1
            L_0x0171:
                m.l r1 = new m.l
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L_0x017a:
                r1 = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6425l.C6426a.mo16555a(long, m.t, java.lang.String):m.l");
        }

        /* renamed from: a */
        public final C6425l mo16556a(C6448t tVar, String str) {
            C5942k.m22327b(tVar, "url");
            C5942k.m22327b(str, "setCookie");
            return mo16555a(System.currentTimeMillis(), tVar, str);
        }
    }

    private C6425l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f15917a = str;
        this.f15918b = str2;
        this.f15919c = j;
        this.f15920d = str3;
        this.f15921e = str4;
        this.f15922f = z;
        this.f15923g = z2;
        this.f15924h = z3;
        this.f15925i = z4;
    }

    public /* synthetic */ C6425l(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, C5938g gVar) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    /* renamed from: a */
    public final String mo16548a() {
        return this.f15917a;
    }

    /* renamed from: a */
    public final String mo16549a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15917a);
        sb.append('=');
        sb.append(this.f15918b);
        if (this.f15924h) {
            if (this.f15919c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = C6293c.m23666a(new Date(this.f15919c));
            }
            sb.append(str);
        }
        if (!this.f15925i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f15920d);
        }
        sb.append("; path=");
        sb.append(this.f15921e);
        if (this.f15922f) {
            sb.append("; secure");
        }
        if (this.f15923g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "toString()");
        return sb2;
    }

    /* renamed from: b */
    public final String mo16550b() {
        return this.f15918b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6425l) {
            C6425l lVar = (C6425l) obj;
            if (C5942k.m22326a((Object) lVar.f15917a, (Object) this.f15917a) && C5942k.m22326a((Object) lVar.f15918b, (Object) this.f15918b) && lVar.f15919c == this.f15919c && C5942k.m22326a((Object) lVar.f15920d, (Object) this.f15920d) && C5942k.m22326a((Object) lVar.f15921e, (Object) this.f15921e) && lVar.f15922f == this.f15922f && lVar.f15923g == this.f15923g && lVar.f15924h == this.f15924h && lVar.f15925i == this.f15925i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f15917a.hashCode()) * 31) + this.f15918b.hashCode()) * 31) + C3085d.m12547a(this.f15919c)) * 31) + this.f15920d.hashCode()) * 31) + this.f15921e.hashCode()) * 31) + C0816b.m4380a(this.f15922f)) * 31) + C0816b.m4380a(this.f15923g)) * 31) + C0816b.m4380a(this.f15924h)) * 31) + C0816b.m4380a(this.f15925i);
    }

    public String toString() {
        return mo16549a(false);
    }
}
