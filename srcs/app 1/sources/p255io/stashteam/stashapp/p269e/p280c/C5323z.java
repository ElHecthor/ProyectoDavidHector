package p255io.stashteam.stashapp.p269e.p280c;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.z */
public final class C5323z {

    /* renamed from: a */
    private final long f13987a;

    /* renamed from: b */
    private final String f13988b;

    /* renamed from: c */
    private final C5311p f13989c;

    /* renamed from: d */
    private final C5290c f13990d;

    /* renamed from: e */
    private final C5306l f13991e;

    public C5323z(long j, String str, C5311p pVar, C5290c cVar, C5306l lVar) {
        C5942k.m22327b(str, "name");
        C5942k.m22327b(cVar, "category");
        this.f13987a = j;
        this.f13988b = str;
        this.f13989c = pVar;
        this.f13990d = cVar;
        this.f13991e = lVar;
    }

    /* renamed from: a */
    public final C5311p mo15015a() {
        return this.f13989c;
    }

    /* renamed from: b */
    public final C5306l mo15016b() {
        return this.f13991e;
    }

    /* renamed from: c */
    public final long mo15017c() {
        return this.f13987a;
    }

    /* renamed from: d */
    public final String mo15018d() {
        return this.f13988b;
    }

    /* renamed from: e */
    public final boolean mo15019e() {
        C5290c cVar = this.f13990d;
        return cVar == C5290c.DLC_ADDON || cVar == C5290c.EXPANSION;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13991e, (java.lang.Object) r6.f13991e) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x003b
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5323z
            if (r0 == 0) goto L_0x0039
            io.stashteam.stashapp.e.c.z r6 = (p255io.stashteam.stashapp.p269e.p280c.C5323z) r6
            long r0 = r5.f13987a
            long r2 = r6.f13987a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0039
            java.lang.String r0 = r5.f13988b
            java.lang.String r1 = r6.f13988b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            io.stashteam.stashapp.e.c.p r0 = r5.f13989c
            io.stashteam.stashapp.e.c.p r1 = r6.f13989c
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            io.stashteam.stashapp.e.c.c r0 = r5.f13990d
            io.stashteam.stashapp.e.c.c r1 = r6.f13990d
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            io.stashteam.stashapp.e.c.l r0 = r5.f13991e
            io.stashteam.stashapp.e.c.l r6 = r6.f13991e
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r6 = 0
            return r6
        L_0x003b:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5323z.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13987a) * 31;
        String str = this.f13988b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        C5311p pVar = this.f13989c;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C5290c cVar = this.f13990d;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C5306l lVar = this.f13991e;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShortGame(id=");
        sb.append(this.f13987a);
        sb.append(", name=");
        sb.append(this.f13988b);
        sb.append(", cover=");
        sb.append(this.f13989c);
        sb.append(", category=");
        sb.append(this.f13990d);
        sb.append(", gameReview=");
        sb.append(this.f13991e);
        sb.append(")");
        return sb.toString();
    }
}
