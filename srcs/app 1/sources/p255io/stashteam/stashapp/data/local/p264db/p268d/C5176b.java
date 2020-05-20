package p255io.stashteam.stashapp.data.local.p264db.p268d;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.local.db.d.b */
public final class C5176b {

    /* renamed from: a */
    private final String f13458a;

    /* renamed from: b */
    private final int f13459b;

    /* renamed from: c */
    private final String f13460c;

    /* renamed from: d */
    private final boolean f13461d;

    /* renamed from: e */
    private final boolean f13462e;

    /* renamed from: f */
    private final long f13463f;

    public C5176b(String str, int i, String str2, boolean z, boolean z2, long j) {
        C5942k.m22327b(str2, "status");
        this.f13458a = str;
        this.f13459b = i;
        this.f13460c = str2;
        this.f13461d = z;
        this.f13462e = z2;
        this.f13463f = j;
    }

    /* renamed from: a */
    public final String mo14363a() {
        return this.f13458a;
    }

    /* renamed from: b */
    public final boolean mo14364b() {
        return this.f13461d;
    }

    /* renamed from: c */
    public final long mo14365c() {
        return this.f13463f;
    }

    /* renamed from: d */
    public final boolean mo14366d() {
        return this.f13462e;
    }

    /* renamed from: e */
    public final int mo14367e() {
        return this.f13459b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r4.f13463f == r5.f13463f) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x0039
            boolean r0 = r5 instanceof p255io.stashteam.stashapp.data.local.p264db.p268d.C5176b
            if (r0 == 0) goto L_0x0037
            io.stashteam.stashapp.data.local.db.d.b r5 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5176b) r5
            java.lang.String r0 = r4.f13458a
            java.lang.String r1 = r5.f13458a
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            int r0 = r4.f13459b
            int r1 = r5.f13459b
            if (r0 != r1) goto L_0x0037
            java.lang.String r0 = r4.f13460c
            java.lang.String r1 = r5.f13460c
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4.f13461d
            boolean r1 = r5.f13461d
            if (r0 != r1) goto L_0x0037
            boolean r0 = r4.f13462e
            boolean r1 = r5.f13462e
            if (r0 != r1) goto L_0x0037
            long r0 = r4.f13463f
            long r2 = r5.f13463f
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r5 = 0
            return r5
        L_0x0039:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p268d.C5176b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo14369f() {
        return this.f13460c;
    }

    public int hashCode() {
        String str = this.f13458a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f13459b) * 31;
        String str2 = this.f13460c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f13461d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f13462e;
        if (!z2) {
            i3 = z2;
        }
        return ((i4 + i3) * 31) + C3085d.m12547a(this.f13463f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GameReviewEntity(comment=");
        sb.append(this.f13458a);
        sb.append(", rating=");
        sb.append(this.f13459b);
        sb.append(", status=");
        sb.append(this.f13460c);
        sb.append(", completed=");
        sb.append(this.f13461d);
        sb.append(", playing=");
        sb.append(this.f13462e);
        sb.append(", modificationDate=");
        sb.append(this.f13463f);
        sb.append(")");
        return sb.toString();
    }
}
