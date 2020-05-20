package p255io.stashteam.stashapp.p269e.p280c;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.d */
public final class C5293d {

    /* renamed from: a */
    private final long f13851a;

    /* renamed from: b */
    private final String f13852b;

    /* renamed from: c */
    private final C5295e f13853c;

    public C5293d(long j, String str, C5295e eVar) {
        C5942k.m22327b(str, "name");
        this.f13851a = j;
        this.f13852b = str;
        this.f13853c = eVar;
    }

    /* renamed from: a */
    public final C5295e mo14877a() {
        return this.f13853c;
    }

    /* renamed from: b */
    public final long mo14878b() {
        return this.f13851a;
    }

    /* renamed from: c */
    public final String mo14879c() {
        return this.f13852b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13853c, (java.lang.Object) r6.f13853c) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0027
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5293d
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.e.c.d r6 = (p255io.stashteam.stashapp.p269e.p280c.C5293d) r6
            long r0 = r5.f13851a
            long r2 = r6.f13851a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = r5.f13852b
            java.lang.String r1 = r6.f13852b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.e.c.e r0 = r5.f13853c
            io.stashteam.stashapp.e.c.e r6 = r6.f13853c
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r6 = 0
            return r6
        L_0x0027:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5293d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13851a) * 31;
        String str = this.f13852b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        C5295e eVar = this.f13853c;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company(id=");
        sb.append(this.f13851a);
        sb.append(", name=");
        sb.append(this.f13852b);
        sb.append(", companyType=");
        sb.append(this.f13853c);
        sb.append(")");
        return sb.toString();
    }
}
