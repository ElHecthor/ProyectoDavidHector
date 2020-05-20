package p255io.stashteam.stashapp.data.local.p264db.p268d;

/* renamed from: io.stashteam.stashapp.data.local.db.d.f */
public final class C5180f {

    /* renamed from: a */
    private final long f13482a;

    /* renamed from: b */
    private final String f13483b;

    /* renamed from: c */
    private final String f13484c;

    /* renamed from: d */
    private final String f13485d;

    /* renamed from: e */
    private final String f13486e;

    /* renamed from: f */
    private C5179e f13487f;

    /* renamed from: g */
    private final String f13488g;

    /* renamed from: h */
    private final boolean f13489h;

    public C5180f(long j, String str, String str2, String str3, String str4, C5179e eVar, String str5, boolean z) {
        this.f13482a = j;
        this.f13483b = str;
        this.f13484c = str2;
        this.f13485d = str3;
        this.f13486e = str4;
        this.f13487f = eVar;
        this.f13488g = str5;
        this.f13489h = z;
    }

    /* renamed from: a */
    public final String mo14395a() {
        return this.f13485d;
    }

    /* renamed from: a */
    public final void mo14396a(C5179e eVar) {
        this.f13487f = eVar;
    }

    /* renamed from: b */
    public final String mo14397b() {
        return this.f13488g;
    }

    /* renamed from: c */
    public final String mo14398c() {
        return this.f13484c;
    }

    /* renamed from: d */
    public final long mo14399d() {
        return this.f13482a;
    }

    /* renamed from: e */
    public final String mo14400e() {
        return this.f13486e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r5.f13489h == r6.f13489h) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0055
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f
            if (r0 == 0) goto L_0x0053
            io.stashteam.stashapp.data.local.db.d.f r6 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r6
            long r0 = r5.f13482a
            long r2 = r6.f13482a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0053
            java.lang.String r0 = r5.f13483b
            java.lang.String r1 = r6.f13483b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13484c
            java.lang.String r1 = r6.f13484c
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13485d
            java.lang.String r1 = r6.f13485d
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13486e
            java.lang.String r1 = r6.f13486e
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            io.stashteam.stashapp.data.local.db.d.e r0 = r5.f13487f
            io.stashteam.stashapp.data.local.db.d.e r1 = r6.f13487f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r5.f13488g
            java.lang.String r1 = r6.f13488g
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r5.f13489h
            boolean r6 = r6.f13489h
            if (r0 != r6) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r6 = 0
            return r6
        L_0x0055:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo14402f() {
        return this.f13483b;
    }

    /* renamed from: g */
    public final C5179e mo14403g() {
        return this.f13487f;
    }

    /* renamed from: h */
    public final boolean mo14404h() {
        return this.f13489h;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13482a) * 31;
        String str = this.f13483b;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13484c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13485d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13486e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C5179e eVar = this.f13487f;
        int hashCode5 = (hashCode4 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str5 = this.f13488g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.f13489h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserEntity(id=");
        sb.append(this.f13482a);
        sb.append(", login=");
        sb.append(this.f13483b);
        sb.append(", fullName=");
        sb.append(this.f13484c);
        sb.append(", email=");
        sb.append(this.f13485d);
        sb.append(", imageUrl=");
        sb.append(this.f13486e);
        sb.append(", statistic=");
        sb.append(this.f13487f);
        sb.append(", externalIdType=");
        sb.append(this.f13488g);
        sb.append(", isClosed=");
        sb.append(this.f13489h);
        sb.append(")");
        return sb.toString();
    }
}
