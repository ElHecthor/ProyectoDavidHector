package com.crashlytics.android.p033e;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.e.l0 */
final class C1454l0 {

    /* renamed from: a */
    private static final Pattern f4604a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    /* renamed from: a */
    public static C1447k0 m6619a(String str) {
        Matcher matcher = f4604a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            C1447k0 k0Var = new C1447k0(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
            return k0Var;
        } catch (Exception unused) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not parse map entry: ");
            sb.append(str);
            f.mo13796e("CrashlyticsCore", sb.toString());
            return null;
        }
    }
}
