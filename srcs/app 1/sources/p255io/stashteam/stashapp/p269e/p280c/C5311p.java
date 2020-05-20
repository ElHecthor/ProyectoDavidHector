package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.p */
public final class C5311p {

    /* renamed from: a */
    private final Integer f13948a;

    /* renamed from: b */
    private final Integer f13949b;

    /* renamed from: c */
    private final String f13950c;

    public C5311p(Integer num, Integer num2, String str) {
        this.f13948a = num;
        this.f13949b = num2;
        this.f13950c = str;
    }

    /* renamed from: a */
    public final Integer mo14980a() {
        return this.f13948a;
    }

    /* renamed from: b */
    public final String mo14981b() {
        return this.f13950c;
    }

    /* renamed from: c */
    public final Integer mo14982c() {
        return this.f13949b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13950c, (java.lang.Object) r3.f13950c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5311p
            if (r0 == 0) goto L_0x0027
            io.stashteam.stashapp.e.c.p r3 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r3
            java.lang.Integer r0 = r2.f13948a
            java.lang.Integer r1 = r3.f13948a
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Integer r0 = r2.f13949b
            java.lang.Integer r1 = r3.f13949b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f13950c
            java.lang.String r3 = r3.f13950c
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5311p.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.f13948a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f13949b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f13950c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image(height=");
        sb.append(this.f13948a);
        sb.append(", width=");
        sb.append(this.f13949b);
        sb.append(", url=");
        sb.append(this.f13950c);
        sb.append(")");
        return sb.toString();
    }
}
