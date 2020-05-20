package kotlinx.coroutines;

import kotlinx.coroutines.p331d3.C6053c;
import p308k.p316w.C5867e;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a0 */
public final class C5958a0 {

    /* renamed from: a */
    private static final boolean f14954a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C6140w.m23086a(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            f14954a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5958a0.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r4 != null) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m22372a(p308k.p316w.C5871g r4) {
        /*
            java.lang.String r0 = "$this$coroutineName"
            p308k.p323z.p325d.C5942k.m22327b(r4, r0)
            boolean r0 = kotlinx.coroutines.C6157l0.m23151c()
            r1 = 0
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            kotlinx.coroutines.e0$a r0 = kotlinx.coroutines.C6067e0.f15161g
            k.w.g$b r0 = r4.get(r0)
            kotlinx.coroutines.e0 r0 = (kotlinx.coroutines.C6067e0) r0
            if (r0 == 0) goto L_0x0043
            kotlinx.coroutines.f0$a r1 = kotlinx.coroutines.C6084f0.f15183g
            k.w.g$b r4 = r4.get(r1)
            kotlinx.coroutines.f0 r4 = (kotlinx.coroutines.C6084f0) r4
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r4.mo15852o()
            if (r4 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            java.lang.String r4 = "coroutine"
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r4 = 35
            r1.append(r4)
            long r2 = r0.mo15821o()
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            return r4
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5958a0.m22372a(k.w.g):java.lang.String");
    }

    /* renamed from: a */
    public static final C5871g m22373a(C6089g0 g0Var, C5871g gVar) {
        C5942k.m22327b(g0Var, "$this$newCoroutineContext");
        C5942k.m22327b(gVar, "context");
        C5871g plus = g0Var.mo2973c().plus(gVar);
        C5871g plus2 = C6157l0.m23151c() ? plus.plus(new C6067e0(C6157l0.m23150b().incrementAndGet())) : plus;
        return (plus == C6216y0.m23285a() || plus.get(C5867e.f14898b) != null) ? plus2 : plus2.plus(C6216y0.m23285a());
    }

    /* renamed from: a */
    public static final C6012b0 m22374a() {
        return f14954a ? C6053c.f15131l : C6181r.f15293h;
    }
}
