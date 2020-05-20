package p255io.stashteam.stashapp.p269e.p280c;

import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.y */
public final class C5322y {

    /* renamed from: a */
    private final long f13984a;

    /* renamed from: b */
    private final String f13985b;

    /* renamed from: c */
    private final List<Long> f13986c;

    public C5322y(long j, String str, List<Long> list) {
        C5942k.m22327b(str, "name");
        C5942k.m22327b(list, "gameIds");
        this.f13984a = j;
        this.f13985b = str;
        this.f13986c = list;
    }

    /* renamed from: a */
    public final List<Long> mo15010a() {
        return this.f13986c;
    }

    /* renamed from: b */
    public final String mo15011b() {
        return this.f13985b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13986c, (java.lang.Object) r6.f13986c) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0027
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5322y
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.e.c.y r6 = (p255io.stashteam.stashapp.p269e.p280c.C5322y) r6
            long r0 = r5.f13984a
            long r2 = r6.f13984a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = r5.f13985b
            java.lang.String r1 = r6.f13985b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0025
            java.util.List<java.lang.Long> r0 = r5.f13986c
            java.util.List<java.lang.Long> r6 = r6.f13986c
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5322y.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13984a) * 31;
        String str = this.f13985b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        List<Long> list = this.f13986c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Series(id=");
        sb.append(this.f13984a);
        sb.append(", name=");
        sb.append(this.f13985b);
        sb.append(", gameIds=");
        sb.append(this.f13986c);
        sb.append(")");
        return sb.toString();
    }
}
