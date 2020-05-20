package p255io.stashteam.stashapp.data.local.p264db.p268d;

/* renamed from: io.stashteam.stashapp.data.local.db.d.c */
public final class C5177c {

    /* renamed from: a */
    private final long f13464a;

    /* renamed from: b */
    private final boolean f13465b;

    /* renamed from: c */
    private final boolean f13466c;

    /* renamed from: d */
    private final Integer f13467d;

    /* renamed from: e */
    private final Integer f13468e;

    /* renamed from: f */
    private final String f13469f;

    /* renamed from: g */
    private final String f13470g;

    public C5177c(long j, boolean z, boolean z2, Integer num, Integer num2, String str, String str2) {
        this.f13464a = j;
        this.f13465b = z;
        this.f13466c = z2;
        this.f13467d = num;
        this.f13468e = num2;
        this.f13469f = str;
        this.f13470g = str2;
    }

    /* renamed from: a */
    public final Integer mo14372a() {
        return this.f13467d;
    }

    /* renamed from: b */
    public final String mo14373b() {
        return this.f13470g;
    }

    /* renamed from: c */
    public final Integer mo14374c() {
        return this.f13468e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13470g, (java.lang.Object) r6.f13470g) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0047
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c
            if (r0 == 0) goto L_0x0045
            io.stashteam.stashapp.data.local.db.d.c r6 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c) r6
            long r0 = r5.f13464a
            long r2 = r6.f13464a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0045
            boolean r0 = r5.f13465b
            boolean r1 = r6.f13465b
            if (r0 != r1) goto L_0x0045
            boolean r0 = r5.f13466c
            boolean r1 = r6.f13466c
            if (r0 != r1) goto L_0x0045
            java.lang.Integer r0 = r5.f13467d
            java.lang.Integer r1 = r6.f13467d
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r0 = r5.f13468e
            java.lang.Integer r1 = r6.f13468e
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r5.f13469f
            java.lang.String r1 = r6.f13469f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r5.f13470g
            java.lang.String r6 = r6.f13470g
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r6 = 0
            return r6
        L_0x0047:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13464a) * 31;
        boolean z = this.f13465b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (a + (z ? 1 : 0)) * 31;
        boolean z2 = this.f13466c;
        if (!z2) {
            i = z2;
        }
        int i3 = (i2 + i) * 31;
        Integer num = this.f13467d;
        int i4 = 0;
        int hashCode = (i3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f13468e;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f13469f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13470g;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return hashCode3 + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImageEntity(id=");
        sb.append(this.f13464a);
        sb.append(", alphaChannel=");
        sb.append(this.f13465b);
        sb.append(", animated=");
        sb.append(this.f13466c);
        sb.append(", height=");
        sb.append(this.f13467d);
        sb.append(", width=");
        sb.append(this.f13468e);
        sb.append(", imageId=");
        sb.append(this.f13469f);
        sb.append(", url=");
        sb.append(this.f13470g);
        sb.append(")");
        return sb.toString();
    }
}
