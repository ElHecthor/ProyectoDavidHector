package p255io.stashteam.stashapp.data.local.p264db.p268d;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.local.db.d.d */
public final class C5178d {

    /* renamed from: a */
    private final long f13471a;

    /* renamed from: b */
    private final String f13472b;

    /* renamed from: c */
    private final long f13473c;

    /* renamed from: d */
    private final int f13474d;

    /* renamed from: e */
    private final C5177c f13475e;

    /* renamed from: f */
    private final C5176b f13476f;

    public C5178d(long j, String str, long j2, int i, C5177c cVar, C5176b bVar) {
        C5942k.m22327b(str, "name");
        this.f13471a = j;
        this.f13472b = str;
        this.f13473c = j2;
        this.f13474d = i;
        this.f13475e = cVar;
        this.f13476f = bVar;
    }

    /* renamed from: a */
    public final int mo14378a() {
        return this.f13474d;
    }

    /* renamed from: b */
    public final C5177c mo14379b() {
        return this.f13475e;
    }

    /* renamed from: c */
    public final long mo14380c() {
        return this.f13473c;
    }

    /* renamed from: d */
    public final C5176b mo14381d() {
        return this.f13476f;
    }

    /* renamed from: e */
    public final long mo14382e() {
        return this.f13471a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13476f, (java.lang.Object) r6.f13476f) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x003f
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d
            if (r0 == 0) goto L_0x003d
            io.stashteam.stashapp.data.local.db.d.d r6 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d) r6
            long r0 = r5.f13471a
            long r2 = r6.f13471a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            java.lang.String r0 = r5.f13472b
            java.lang.String r1 = r6.f13472b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003d
            long r0 = r5.f13473c
            long r2 = r6.f13473c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            int r0 = r5.f13474d
            int r1 = r6.f13474d
            if (r0 != r1) goto L_0x003d
            io.stashteam.stashapp.data.local.db.d.c r0 = r5.f13475e
            io.stashteam.stashapp.data.local.db.d.c r1 = r6.f13475e
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003d
            io.stashteam.stashapp.data.local.db.d.b r0 = r5.f13476f
            io.stashteam.stashapp.data.local.db.d.b r6 = r6.f13476f
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r6 = 0
            return r6
        L_0x003f:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo14384f() {
        return this.f13472b;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13471a) * 31;
        String str = this.f13472b;
        int i = 0;
        int hashCode = (((((a + (str != null ? str.hashCode() : 0)) * 31) + C3085d.m12547a(this.f13473c)) * 31) + this.f13474d) * 31;
        C5177c cVar = this.f13475e;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C5176b bVar = this.f13476f;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShortGameEntity(id=");
        sb.append(this.f13471a);
        sb.append(", name=");
        sb.append(this.f13472b);
        sb.append(", firstReleaseDate=");
        sb.append(this.f13473c);
        sb.append(", category=");
        sb.append(this.f13474d);
        sb.append(", cover=");
        sb.append(this.f13475e);
        sb.append(", gameReview=");
        sb.append(this.f13476f);
        sb.append(")");
        return sb.toString();
    }
}
