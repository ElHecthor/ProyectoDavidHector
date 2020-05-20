package p255io.stashteam.stashapp.data.local.p264db.p268d;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.local.db.d.a */
public final class C5175a {

    /* renamed from: a */
    private final long f13451a;

    /* renamed from: b */
    private final String f13452b;

    /* renamed from: c */
    private final String f13453c;

    /* renamed from: d */
    private final int f13454d;

    /* renamed from: e */
    private final boolean f13455e;

    /* renamed from: f */
    private final long f13456f;

    /* renamed from: g */
    private final String f13457g;

    public C5175a(long j, String str, String str2, int i, boolean z, long j2, String str3) {
        C5942k.m22327b(str, "title");
        this.f13451a = j;
        this.f13452b = str;
        this.f13453c = str2;
        this.f13454d = i;
        this.f13455e = z;
        this.f13456f = j2;
        this.f13457g = str3;
    }

    /* renamed from: a */
    public final String mo14353a() {
        return this.f13457g;
    }

    /* renamed from: b */
    public final long mo14354b() {
        return this.f13456f;
    }

    /* renamed from: c */
    public final String mo14355c() {
        return this.f13453c;
    }

    /* renamed from: d */
    public final int mo14356d() {
        return this.f13454d;
    }

    /* renamed from: e */
    public final long mo14357e() {
        return this.f13451a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13457g, (java.lang.Object) r6.f13457g) != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0045
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a
            if (r0 == 0) goto L_0x0043
            io.stashteam.stashapp.data.local.db.d.a r6 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a) r6
            long r0 = r5.f13451a
            long r2 = r6.f13451a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0043
            java.lang.String r0 = r5.f13452b
            java.lang.String r1 = r6.f13452b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r5.f13453c
            java.lang.String r1 = r6.f13453c
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0043
            int r0 = r5.f13454d
            int r1 = r6.f13454d
            if (r0 != r1) goto L_0x0043
            boolean r0 = r5.f13455e
            boolean r1 = r6.f13455e
            if (r0 != r1) goto L_0x0043
            long r0 = r5.f13456f
            long r2 = r6.f13456f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0043
            java.lang.String r0 = r5.f13457g
            java.lang.String r6 = r6.f13457g
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = 0
            return r6
        L_0x0045:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo14359f() {
        return this.f13452b;
    }

    /* renamed from: g */
    public final boolean mo14360g() {
        return this.f13455e;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13451a) * 31;
        String str = this.f13452b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13453c;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f13454d) * 31;
        boolean z = this.f13455e;
        if (z) {
            z = true;
        }
        int a2 = (((hashCode2 + (z ? 1 : 0)) * 31) + C3085d.m12547a(this.f13456f)) * 31;
        String str3 = this.f13457g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return a2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomListEntity(id=");
        sb.append(this.f13451a);
        sb.append(", title=");
        sb.append(this.f13452b);
        sb.append(", description=");
        sb.append(this.f13453c);
        sb.append(", gamesCount=");
        sb.append(this.f13454d);
        sb.append(", isClosed=");
        sb.append(this.f13455e);
        sb.append(", creationDate=");
        sb.append(this.f13456f);
        sb.append(", colorHex=");
        sb.append(this.f13457g);
        sb.append(")");
        return sb.toString();
    }
}
