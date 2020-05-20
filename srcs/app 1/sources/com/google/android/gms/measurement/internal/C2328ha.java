package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p147g.p156d.p157a.p167b.p173d.p180g.C4072k0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4103m0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4103m0.C4105b;

/* renamed from: com.google.android.gms.measurement.internal.ha */
abstract class C2328ha {

    /* renamed from: a */
    String f6507a;

    /* renamed from: b */
    int f6508b;

    /* renamed from: c */
    Boolean f6509c;

    /* renamed from: d */
    Boolean f6510d;

    /* renamed from: e */
    Long f6511e;

    /* renamed from: f */
    Long f6512f;

    C2328ha(String str, int i) {
        this.f6507a = str;
        this.f6508b = i;
    }

    /* renamed from: a */
    static Boolean m9435a(double d, C4072k0 k0Var) {
        try {
            return m9441a(new BigDecimal(d), k0Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m9436a(long j, C4072k0 k0Var) {
        try {
            return m9441a(new BigDecimal(j), k0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m9437a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    static Boolean m9438a(String str, C4072k0 k0Var) {
        if (!C2445r9.m9781a(str)) {
            return null;
        }
        try {
            return m9441a(new BigDecimal(str), k0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m9439a(String str, C4105b bVar, boolean z, String str2, List<String> list, String str3, C2516y3 y3Var) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (bVar == C4105b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != C4105b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C2280da.f6369a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (y3Var != null) {
                        y3Var.mo7818w().mo7089a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* renamed from: a */
    static Boolean m9440a(String str, C4103m0 m0Var, C2516y3 y3Var) {
        List list;
        C2148s.m8834a(m0Var);
        if (str == null || !m0Var.mo12641a() || m0Var.mo12642q() == C4105b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (m0Var.mo12642q() == C4105b.IN_LIST) {
            if (m0Var.mo12648w() == 0) {
                return null;
            }
        } else if (!m0Var.mo12643r()) {
            return null;
        }
        C4105b q = m0Var.mo12642q();
        boolean u = m0Var.mo12646u();
        String s = (u || q == C4105b.REGEXP || q == C4105b.IN_LIST) ? m0Var.mo12644s() : m0Var.mo12644s().toUpperCase(Locale.ENGLISH);
        if (m0Var.mo12648w() == 0) {
            list = null;
        } else {
            List<String> v = m0Var.mo12647v();
            if (!u) {
                ArrayList arrayList = new ArrayList(v.size());
                for (String upperCase : v) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                v = Collections.unmodifiableList(arrayList);
            }
            list = v;
        }
        return m9439a(str, q, u, s, list, q == C4105b.REGEXP ? s : null, y3Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r2 != null) goto L_0x0087;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m9441a(java.math.BigDecimal r9, p147g.p156d.p157a.p167b.p173d.p180g.C4072k0 r10, double r11) {
        /*
            com.google.android.gms.common.internal.C2148s.m8834a(r10)
            boolean r0 = r10.mo12579a()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            g.d.a.b.d.g.k0$a r0 = r10.mo12580q()
            g.d.a.b.d.g.k0$a r2 = p147g.p156d.p157a.p167b.p173d.p180g.C4072k0.C4073a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0014
            goto L_0x0110
        L_0x0014:
            g.d.a.b.d.g.k0$a r0 = r10.mo12580q()
            g.d.a.b.d.g.k0$a r2 = p147g.p156d.p157a.p167b.p173d.p180g.C4072k0.C4073a.BETWEEN
            if (r0 != r2) goto L_0x0029
            boolean r0 = r10.mo12585v()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r10.mo12587x()
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            return r1
        L_0x0029:
            boolean r0 = r10.mo12583t()
            if (r0 != 0) goto L_0x0030
            return r1
        L_0x0030:
            g.d.a.b.d.g.k0$a r0 = r10.mo12580q()
            g.d.a.b.d.g.k0$a r2 = r10.mo12580q()
            g.d.a.b.d.g.k0$a r3 = p147g.p156d.p157a.p167b.p173d.p180g.C4072k0.C4073a.BETWEEN
            if (r2 != r3) goto L_0x0067
            java.lang.String r2 = r10.mo12586w()
            boolean r2 = com.google.android.gms.measurement.internal.C2445r9.m9781a(r2)
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r10.mo12588y()
            boolean r2 = com.google.android.gms.measurement.internal.C2445r9.m9781a(r2)
            if (r2 != 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r3 = r10.mo12586w()     // Catch:{ NumberFormatException -> 0x0066 }
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x0066 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0066 }
            java.lang.String r10 = r10.mo12588y()     // Catch:{ NumberFormatException -> 0x0066 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0066 }
            r10 = r2
            r2 = r1
            goto L_0x007d
        L_0x0066:
            return r1
        L_0x0067:
            java.lang.String r2 = r10.mo12584u()
            boolean r2 = com.google.android.gms.measurement.internal.C2445r9.m9781a(r2)
            if (r2 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r10 = r10.mo12584u()     // Catch:{ NumberFormatException -> 0x0110 }
            r2.<init>(r10)     // Catch:{ NumberFormatException -> 0x0110 }
            r10 = r1
            r3 = r10
        L_0x007d:
            g.d.a.b.d.g.k0$a r4 = p147g.p156d.p157a.p167b.p173d.p180g.C4072k0.C4073a.BETWEEN
            if (r0 != r4) goto L_0x0085
            if (r10 == 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            return r1
        L_0x0085:
            if (r2 == 0) goto L_0x0110
        L_0x0087:
            int[] r4 = com.google.android.gms.measurement.internal.C2280da.f6370b
            int r0 = r0.ordinal()
            r0 = r4[r0]
            r4 = -1
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L_0x0104
            r7 = 2
            if (r0 == r7) goto L_0x00f8
            r8 = 3
            if (r0 == r8) goto L_0x00b0
            r11 = 4
            if (r0 == r11) goto L_0x009e
            goto L_0x0110
        L_0x009e:
            int r10 = r9.compareTo(r10)
            if (r10 == r4) goto L_0x00ab
            int r9 = r9.compareTo(r3)
            if (r9 == r6) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00b0:
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00ec
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r2.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 != r6) goto L_0x00e7
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r2.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 != r4) goto L_0x00e7
            r5 = 1
        L_0x00e7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00ec:
            int r9 = r9.compareTo(r2)
            if (r9 != 0) goto L_0x00f3
            r5 = 1
        L_0x00f3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00f8:
            int r9 = r9.compareTo(r2)
            if (r9 != r6) goto L_0x00ff
            r5 = 1
        L_0x00ff:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0104:
            int r9 = r9.compareTo(r2)
            if (r9 != r4) goto L_0x010b
            r5 = 1
        L_0x010b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2328ha.m9441a(java.math.BigDecimal, g.d.a.b.d.g.k0, double):java.lang.Boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo7373a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo7374b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract boolean mo7375c();
}
