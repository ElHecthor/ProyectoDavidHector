package p255io.stashteam.stashapp.p269e.p280c;

import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.w */
public final class C5320w {

    /* renamed from: a */
    private final C5294d0 f13975a;

    /* renamed from: b */
    private final C5306l f13976b;

    public C5320w(C5294d0 d0Var, C5306l lVar) {
        C5942k.m22327b(d0Var, "user");
        C5942k.m22327b(lVar, "gameReview");
        this.f13975a = d0Var;
        this.f13976b = lVar;
    }

    /* renamed from: a */
    public final C5306l mo15002a() {
        return this.f13976b;
    }

    /* renamed from: b */
    public final C5294d0 mo15003b() {
        return this.f13975a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13976b, (java.lang.Object) r3.f13976b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5320w
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.e.c.w r3 = (p255io.stashteam.stashapp.p269e.p280c.C5320w) r3
            io.stashteam.stashapp.e.c.d0 r0 = r2.f13975a
            io.stashteam.stashapp.e.c.d0 r1 = r3.f13975a
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.e.c.l r0 = r2.f13976b
            io.stashteam.stashapp.e.c.l r3 = r3.f13976b
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5320w.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C5294d0 d0Var = this.f13975a;
        int i = 0;
        int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        C5306l lVar = this.f13976b;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Review(user=");
        sb.append(this.f13975a);
        sb.append(", gameReview=");
        sb.append(this.f13976b);
        sb.append(")");
        return sb.toString();
    }
}
