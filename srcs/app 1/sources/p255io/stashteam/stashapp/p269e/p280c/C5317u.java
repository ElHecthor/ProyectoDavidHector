package p255io.stashteam.stashapp.p269e.p280c;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.u */
public final class C5317u {

    /* renamed from: a */
    private final long f13966a;

    /* renamed from: b */
    private final String f13967b;

    /* renamed from: c */
    private final String f13968c;

    public C5317u(long j, String str, String str2) {
        C5942k.m22327b(str, "name");
        C5942k.m22327b(str2, "abbreviation");
        this.f13966a = j;
        this.f13967b = str;
        this.f13968c = str2;
    }

    /* renamed from: a */
    public final String mo14992a() {
        return this.f13968c;
    }

    /* renamed from: b */
    public final long mo14993b() {
        return this.f13966a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13968c, (java.lang.Object) r6.f13968c) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0027
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5317u
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.e.c.u r6 = (p255io.stashteam.stashapp.p269e.p280c.C5317u) r6
            long r0 = r5.f13966a
            long r2 = r6.f13966a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = r5.f13967b
            java.lang.String r1 = r6.f13967b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r5.f13968c
            java.lang.String r6 = r6.f13968c
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5317u.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13966a) * 31;
        String str = this.f13967b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13968c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlatformData(id=");
        sb.append(this.f13966a);
        sb.append(", name=");
        sb.append(this.f13967b);
        sb.append(", abbreviation=");
        sb.append(this.f13968c);
        sb.append(")");
        return sb.toString();
    }
}
