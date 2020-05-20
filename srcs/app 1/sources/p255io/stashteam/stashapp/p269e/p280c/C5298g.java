package p255io.stashteam.stashapp.p269e.p280c;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.g */
public final class C5298g {

    /* renamed from: a */
    private final long f13873a;

    /* renamed from: b */
    private final String f13874b;

    /* renamed from: c */
    private final C5311p f13875c;

    /* renamed from: d */
    private final Date f13876d;

    /* renamed from: e */
    private final C5290c f13877e;

    /* renamed from: f */
    private final Long f13878f;

    /* renamed from: g */
    private final double f13879g;

    /* renamed from: h */
    private final C5306l f13880h;

    /* renamed from: i */
    private final List<C5317u> f13881i;

    /* renamed from: j */
    private final String f13882j;

    /* renamed from: k */
    private final List<C5293d> f13883k;

    /* renamed from: l */
    private final List<C5296e0> f13884l;

    /* renamed from: m */
    private final List<C5311p> f13885m;

    /* renamed from: n */
    private final C5322y f13886n;

    /* renamed from: o */
    private final List<Long> f13887o;

    /* renamed from: p */
    private final List<Long> f13888p;

    /* renamed from: q */
    private final List<C5309o> f13889q;

    public C5298g(long j, String str, C5311p pVar, Date date, C5290c cVar, Long l, double d, C5306l lVar, List<C5317u> list, String str2, List<C5293d> list2, List<C5296e0> list3, List<C5311p> list4, C5322y yVar, List<Long> list5, List<Long> list6, List<? extends C5309o> list7) {
        String str3 = str;
        C5290c cVar2 = cVar;
        C5942k.m22327b(str, "name");
        C5942k.m22327b(cVar, "category");
        this.f13873a = j;
        this.f13874b = str3;
        this.f13875c = pVar;
        this.f13876d = date;
        this.f13877e = cVar2;
        this.f13878f = l;
        this.f13879g = d;
        this.f13880h = lVar;
        this.f13881i = list;
        this.f13882j = str2;
        this.f13883k = list2;
        this.f13884l = list3;
        this.f13885m = list4;
        this.f13886n = yVar;
        this.f13887o = list5;
        this.f13888p = list6;
        this.f13889q = list7;
    }

    /* renamed from: a */
    public final C5311p mo14909a() {
        return this.f13875c;
    }

    /* renamed from: b */
    public final double mo14910b() {
        return this.f13879g;
    }

    /* renamed from: c */
    public final C5293d mo14911c() {
        boolean z;
        List<C5293d> list = this.f13883k;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C5293d) next).mo14877a() == C5295e.DEVELOPER) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (C5293d) obj;
    }

    /* renamed from: d */
    public final Date mo14912d() {
        return this.f13876d;
    }

    /* renamed from: e */
    public final C5306l mo14913e() {
        return this.f13880h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13889q, (java.lang.Object) r6.f13889q) != false) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x00b3
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5298g
            if (r0 == 0) goto L_0x00b1
            io.stashteam.stashapp.e.c.g r6 = (p255io.stashteam.stashapp.p269e.p280c.C5298g) r6
            long r0 = r5.f13873a
            long r2 = r6.f13873a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00b1
            java.lang.String r0 = r5.f13874b
            java.lang.String r1 = r6.f13874b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            io.stashteam.stashapp.e.c.p r0 = r5.f13875c
            io.stashteam.stashapp.e.c.p r1 = r6.f13875c
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.Date r0 = r5.f13876d
            java.util.Date r1 = r6.f13876d
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            io.stashteam.stashapp.e.c.c r0 = r5.f13877e
            io.stashteam.stashapp.e.c.c r1 = r6.f13877e
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.lang.Long r0 = r5.f13878f
            java.lang.Long r1 = r6.f13878f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            double r0 = r5.f13879g
            double r2 = r6.f13879g
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 != 0) goto L_0x00b1
            io.stashteam.stashapp.e.c.l r0 = r5.f13880h
            io.stashteam.stashapp.e.c.l r1 = r6.f13880h
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<io.stashteam.stashapp.e.c.u> r0 = r5.f13881i
            java.util.List<io.stashteam.stashapp.e.c.u> r1 = r6.f13881i
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r5.f13882j
            java.lang.String r1 = r6.f13882j
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<io.stashteam.stashapp.e.c.d> r0 = r5.f13883k
            java.util.List<io.stashteam.stashapp.e.c.d> r1 = r6.f13883k
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<io.stashteam.stashapp.e.c.e0> r0 = r5.f13884l
            java.util.List<io.stashteam.stashapp.e.c.e0> r1 = r6.f13884l
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<io.stashteam.stashapp.e.c.p> r0 = r5.f13885m
            java.util.List<io.stashteam.stashapp.e.c.p> r1 = r6.f13885m
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            io.stashteam.stashapp.e.c.y r0 = r5.f13886n
            io.stashteam.stashapp.e.c.y r1 = r6.f13886n
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<java.lang.Long> r0 = r5.f13887o
            java.util.List<java.lang.Long> r1 = r6.f13887o
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<java.lang.Long> r0 = r5.f13888p
            java.util.List<java.lang.Long> r1 = r6.f13888p
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00b1
            java.util.List<io.stashteam.stashapp.e.c.o> r0 = r5.f13889q
            java.util.List<io.stashteam.stashapp.e.c.o> r6 = r6.f13889q
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = 0
            return r6
        L_0x00b3:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5298g.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final List<C5309o> mo14915f() {
        return this.f13889q;
    }

    /* renamed from: g */
    public final long mo14916g() {
        return this.f13873a;
    }

    /* renamed from: h */
    public final String mo14917h() {
        return this.f13874b;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13873a) * 31;
        String str = this.f13874b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        C5311p pVar = this.f13875c;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Date date = this.f13876d;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        C5290c cVar = this.f13877e;
        int hashCode4 = (hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Long l = this.f13878f;
        int hashCode5 = (((hashCode4 + (l != null ? l.hashCode() : 0)) * 31) + Double.doubleToLongBits(this.f13879g)) * 31;
        C5306l lVar = this.f13880h;
        int hashCode6 = (hashCode5 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        List<C5317u> list = this.f13881i;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f13882j;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C5293d> list2 = this.f13883k;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C5296e0> list3 = this.f13884l;
        int hashCode10 = (hashCode9 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<C5311p> list4 = this.f13885m;
        int hashCode11 = (hashCode10 + (list4 != null ? list4.hashCode() : 0)) * 31;
        C5322y yVar = this.f13886n;
        int hashCode12 = (hashCode11 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        List<Long> list5 = this.f13887o;
        int hashCode13 = (hashCode12 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<Long> list6 = this.f13888p;
        int hashCode14 = (hashCode13 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<C5309o> list7 = this.f13889q;
        if (list7 != null) {
            i = list7.hashCode();
        }
        return hashCode14 + i;
    }

    /* renamed from: i */
    public final Long mo14919i() {
        return this.f13878f;
    }

    /* renamed from: j */
    public final List<C5317u> mo14920j() {
        return this.f13881i;
    }

    /* renamed from: k */
    public final C5293d mo14921k() {
        boolean z;
        List<C5293d> list = this.f13883k;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C5293d) next).mo14877a() == C5295e.PUBLISHER) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (C5293d) obj;
    }

    /* renamed from: l */
    public final List<C5311p> mo14922l() {
        return this.f13885m;
    }

    /* renamed from: m */
    public final C5322y mo14923m() {
        return this.f13886n;
    }

    /* renamed from: n */
    public final String mo14924n() {
        return this.f13882j;
    }

    /* renamed from: o */
    public final List<C5296e0> mo14925o() {
        return this.f13884l;
    }

    /* renamed from: p */
    public final boolean mo14926p() {
        C5290c cVar = this.f13877e;
        return cVar == C5290c.DLC_ADDON || cVar == C5290c.EXPANSION;
    }

    /* renamed from: q */
    public final boolean mo14927q() {
        List<Long> list = this.f13887o;
        if (list != null && (!list.isEmpty())) {
            return true;
        }
        List<Long> list2 = this.f13888p;
        return list2 != null && (list2.isEmpty() ^ true);
    }

    /* renamed from: r */
    public final boolean mo14928r() {
        C5322y yVar = this.f13886n;
        if (yVar != null) {
            List a = yVar.mo15010a();
            if (a != null && (!a.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetailGame(id=");
        sb.append(this.f13873a);
        sb.append(", name=");
        sb.append(this.f13874b);
        sb.append(", cover=");
        sb.append(this.f13875c);
        sb.append(", firstReleaseDate=");
        sb.append(this.f13876d);
        sb.append(", category=");
        sb.append(this.f13877e);
        sb.append(", parentId=");
        sb.append(this.f13878f);
        sb.append(", criticsRating=");
        sb.append(this.f13879g);
        sb.append(", gameReview=");
        sb.append(this.f13880h);
        sb.append(", platforms=");
        sb.append(this.f13881i);
        sb.append(", summary=");
        sb.append(this.f13882j);
        sb.append(", companies=");
        sb.append(this.f13883k);
        sb.append(", videos=");
        sb.append(this.f13884l);
        sb.append(", screenshots=");
        sb.append(this.f13885m);
        sb.append(", series=");
        sb.append(this.f13886n);
        sb.append(", expansions=");
        sb.append(this.f13887o);
        sb.append(", dlcs=");
        sb.append(this.f13888p);
        sb.append(", genres=");
        sb.append(this.f13889q);
        sb.append(")");
        return sb.toString();
    }
}
