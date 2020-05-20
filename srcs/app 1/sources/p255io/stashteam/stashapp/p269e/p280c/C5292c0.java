package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.c0 */
public final class C5292c0 {

    /* renamed from: a */
    private final int f13846a;

    /* renamed from: b */
    private final int f13847b;

    /* renamed from: c */
    private final int f13848c;

    /* renamed from: d */
    private final int f13849d;

    /* renamed from: e */
    private final int f13850e;

    public C5292c0(int i, int i2, int i3, int i4, int i5) {
        this.f13846a = i;
        this.f13847b = i2;
        this.f13848c = i3;
        this.f13849d = i4;
        this.f13850e = i5;
    }

    /* renamed from: a */
    public final int mo14869a() {
        return this.f13846a;
    }

    /* renamed from: b */
    public final int mo14870b() {
        return this.f13847b;
    }

    /* renamed from: c */
    public final int mo14871c() {
        return this.f13849d;
    }

    /* renamed from: d */
    public final int mo14872d() {
        return this.f13850e;
    }

    /* renamed from: e */
    public final int mo14873e() {
        return this.f13848c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2.f13850e == r3.f13850e) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5292c0
            if (r0 == 0) goto L_0x0027
            io.stashteam.stashapp.e.c.c0 r3 = (p255io.stashteam.stashapp.p269e.p280c.C5292c0) r3
            int r0 = r2.f13846a
            int r1 = r3.f13846a
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13847b
            int r1 = r3.f13847b
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13848c
            int r1 = r3.f13848c
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13849d
            int r1 = r3.f13849d
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13850e
            int r3 = r3.f13850e
            if (r0 != r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5292c0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((((this.f13846a * 31) + this.f13847b) * 31) + this.f13848c) * 31) + this.f13849d) * 31) + this.f13850e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistic(playedCount=");
        sb.append(this.f13846a);
        sb.append(", playingCount=");
        sb.append(this.f13847b);
        sb.append(", wantCount=");
        sb.append(this.f13848c);
        sb.append(", pointsCount=");
        sb.append(this.f13849d);
        sb.append(", rank=");
        sb.append(this.f13850e);
        sb.append(")");
        return sb.toString();
    }
}
