package p255io.stashteam.stashapp.data.local.p264db.p268d;

/* renamed from: io.stashteam.stashapp.data.local.db.d.e */
public final class C5179e {

    /* renamed from: a */
    private final int f13477a;

    /* renamed from: b */
    private final int f13478b;

    /* renamed from: c */
    private final int f13479c;

    /* renamed from: d */
    private final int f13480d;

    /* renamed from: e */
    private final int f13481e;

    public C5179e(int i, int i2, int i3, int i4, int i5) {
        this.f13477a = i;
        this.f13478b = i2;
        this.f13479c = i3;
        this.f13480d = i4;
        this.f13481e = i5;
    }

    /* renamed from: a */
    public final int mo14387a() {
        return this.f13477a;
    }

    /* renamed from: b */
    public final int mo14388b() {
        return this.f13478b;
    }

    /* renamed from: c */
    public final int mo14389c() {
        return this.f13480d;
    }

    /* renamed from: d */
    public final int mo14390d() {
        return this.f13481e;
    }

    /* renamed from: e */
    public final int mo14391e() {
        return this.f13479c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2.f13481e == r3.f13481e) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e
            if (r0 == 0) goto L_0x0027
            io.stashteam.stashapp.data.local.db.d.e r3 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e) r3
            int r0 = r2.f13477a
            int r1 = r3.f13477a
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13478b
            int r1 = r3.f13478b
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13479c
            int r1 = r3.f13479c
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13480d
            int r1 = r3.f13480d
            if (r0 != r1) goto L_0x0027
            int r0 = r2.f13481e
            int r3 = r3.f13481e
            if (r0 != r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((((this.f13477a * 31) + this.f13478b) * 31) + this.f13479c) * 31) + this.f13480d) * 31) + this.f13481e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatisticEntity(playedCount=");
        sb.append(this.f13477a);
        sb.append(", playingCount=");
        sb.append(this.f13478b);
        sb.append(", wantCount=");
        sb.append(this.f13479c);
        sb.append(", pointsCount=");
        sb.append(this.f13480d);
        sb.append(", rank=");
        sb.append(this.f13481e);
        sb.append(")");
        return sb.toString();
    }
}
