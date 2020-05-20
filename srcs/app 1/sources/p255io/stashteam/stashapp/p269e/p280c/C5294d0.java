package p255io.stashteam.stashapp.p269e.p280c;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.d0 */
public final class C5294d0 {

    /* renamed from: a */
    private final long f13854a;

    /* renamed from: b */
    private final String f13855b;

    /* renamed from: c */
    private final String f13856c;

    /* renamed from: d */
    private final String f13857d;

    /* renamed from: e */
    private final String f13858e;

    /* renamed from: f */
    private final C5292c0 f13859f;

    /* renamed from: g */
    private final C5287b f13860g;

    /* renamed from: h */
    private final boolean f13861h;

    public C5294d0(long j, String str, String str2, String str3, String str4, C5292c0 c0Var, C5287b bVar, boolean z) {
        C5942k.m22327b(str2, "fullName");
        this.f13854a = j;
        this.f13855b = str;
        this.f13856c = str2;
        this.f13857d = str3;
        this.f13858e = str4;
        this.f13859f = c0Var;
        this.f13860g = bVar;
        this.f13861h = z;
    }

    /* renamed from: a */
    public final C5287b mo14883a() {
        return this.f13860g;
    }

    /* renamed from: b */
    public final String mo14884b() {
        return this.f13856c;
    }

    /* renamed from: c */
    public final long mo14885c() {
        return this.f13854a;
    }

    /* renamed from: d */
    public final String mo14886d() {
        return this.f13858e;
    }

    /* renamed from: e */
    public final String mo14887e() {
        return this.f13855b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r5.f13861h == r6.f13861h) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0055
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p280c.C5294d0
            if (r0 == 0) goto L_0x0053
            io.stashteam.stashapp.e.c.d0 r6 = (p255io.stashteam.stashapp.p269e.p280c.C5294d0) r6
            long r0 = r5.f13854a
            long r2 = r6.f13854a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            java.lang.String r0 = r5.f13855b
            java.lang.String r1 = r6.f13855b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13856c
            java.lang.String r1 = r6.f13856c
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13857d
            java.lang.String r1 = r6.f13857d
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13858e
            java.lang.String r1 = r6.f13858e
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            io.stashteam.stashapp.e.c.c0 r0 = r5.f13859f
            io.stashteam.stashapp.e.c.c0 r1 = r6.f13859f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            io.stashteam.stashapp.e.c.b r0 = r5.f13860g
            io.stashteam.stashapp.e.c.b r1 = r6.f13860g
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r5.f13861h
            boolean r6 = r6.f13861h
            if (r0 != r6) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r6 = 0
            return r6
        L_0x0055:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5294d0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo14889f() {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(this.f13855b);
        return sb.toString();
    }

    /* renamed from: g */
    public final C5292c0 mo14890g() {
        return this.f13859f;
    }

    /* renamed from: h */
    public final boolean mo14891h() {
        return this.f13861h;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13854a) * 31;
        String str = this.f13855b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13856c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13857d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13858e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C5292c0 c0Var = this.f13859f;
        int hashCode5 = (hashCode4 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        C5287b bVar = this.f13860g;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.f13861h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User(id=");
        sb.append(this.f13854a);
        sb.append(", login=");
        sb.append(this.f13855b);
        sb.append(", fullName=");
        sb.append(this.f13856c);
        sb.append(", email=");
        sb.append(this.f13857d);
        sb.append(", imageUrl=");
        sb.append(this.f13858e);
        sb.append(", statistic=");
        sb.append(this.f13859f);
        sb.append(", externalIdType=");
        sb.append(this.f13860g);
        sb.append(", isClosed=");
        sb.append(this.f13861h);
        sb.append(")");
        return sb.toString();
    }
}
