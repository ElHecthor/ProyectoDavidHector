package p255io.stashteam.stashapp.utils.p305g;

/* renamed from: io.stashteam.stashapp.utils.g.b */
public final class C5716b implements C5715a<C5716b> {

    /* renamed from: a */
    private final int f14799a;

    /* renamed from: b */
    private final int f14800b;

    public C5716b(int i, int i2) {
        this.f14799a = i;
        this.f14800b = i2;
    }

    /* renamed from: a */
    public int mo15349a() {
        return this.f14799a;
    }

    /* renamed from: a */
    public C5716b m21819a(int i, int i2) {
        return mo15351b(i, i2);
    }

    /* renamed from: b */
    public int mo15350b() {
        return this.f14800b;
    }

    /* renamed from: b */
    public final C5716b mo15351b(int i, int i2) {
        return new C5716b(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (mo15350b() == r3.mo15350b()) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.utils.p305g.C5716b
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.utils.g.b r3 = (p255io.stashteam.stashapp.utils.p305g.C5716b) r3
            int r0 = r2.mo15349a()
            int r1 = r3.mo15349a()
            if (r0 != r1) goto L_0x001d
            int r0 = r2.mo15350b()
            int r3 = r3.mo15350b()
            if (r0 != r3) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.utils.p305g.C5716b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (mo15349a() * 31) + mo15350b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PagedParams(limit=");
        sb.append(mo15349a());
        sb.append(", offset=");
        sb.append(mo15350b());
        sb.append(")");
        return sb.toString();
    }
}
