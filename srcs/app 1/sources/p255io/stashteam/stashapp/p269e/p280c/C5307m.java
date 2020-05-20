package p255io.stashteam.stashapp.p269e.p280c;

/* renamed from: io.stashteam.stashapp.e.c.m */
public final class C5307m {

    /* renamed from: a */
    private final int f13933a;

    /* renamed from: b */
    private final int f13934b;

    /* renamed from: c */
    private final int f13935c;

    public C5307m(int i, int i2, int i3) {
        this.f13933a = i;
        this.f13934b = i2;
        this.f13935c = i3;
    }

    /* renamed from: a */
    public final int mo14965a() {
        return this.f13934b;
    }

    /* renamed from: b */
    public final int mo14966b() {
        return this.f13935c;
    }

    /* renamed from: c */
    public final int mo14967c() {
        return this.f13933a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2.f13935c == r3.f13935c) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001d
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5307m
            if (r0 == 0) goto L_0x001b
            io.stashteam.stashapp.e.c.m r3 = (p255io.stashteam.stashapp.p269e.p280c.C5307m) r3
            int r0 = r2.f13933a
            int r1 = r3.f13933a
            if (r0 != r1) goto L_0x001b
            int r0 = r2.f13934b
            int r1 = r3.f13934b
            if (r0 != r1) goto L_0x001b
            int r0 = r2.f13935c
            int r3 = r3.f13935c
            if (r0 != r3) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r3 = 0
            return r3
        L_0x001d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5307m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((this.f13933a * 31) + this.f13934b) * 31) + this.f13935c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GameStatistic(wantCount=");
        sb.append(this.f13933a);
        sb.append(", playedCount=");
        sb.append(this.f13934b);
        sb.append(", reviewCount=");
        sb.append(this.f13935c);
        sb.append(")");
        return sb.toString();
    }
}
