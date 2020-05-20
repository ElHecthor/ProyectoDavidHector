package p255io.stashteam.stashapp.p298ui.home;

import java.util.List;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.home.a */
public final class C5580a {

    /* renamed from: a */
    private final List<C5323z> f14532a;

    /* renamed from: b */
    private final List<C5323z> f14533b;

    /* renamed from: c */
    private final List<C5323z> f14534c;

    public C5580a(List<C5323z> list, List<C5323z> list2, List<C5323z> list3) {
        C5942k.m22327b(list, "anticipatedGames");
        C5942k.m22327b(list2, "latestGames");
        C5942k.m22327b(list3, "upcomingGames");
        this.f14532a = list;
        this.f14533b = list2;
        this.f14534c = list3;
    }

    /* renamed from: a */
    public final List<C5323z> mo15219a() {
        return this.f14532a;
    }

    /* renamed from: b */
    public final List<C5323z> mo15220b() {
        return this.f14533b;
    }

    /* renamed from: c */
    public final List<C5323z> mo15221c() {
        return this.f14534c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f14534c, (java.lang.Object) r3.f14534c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p298ui.home.C5580a
            if (r0 == 0) goto L_0x0027
            io.stashteam.stashapp.ui.home.a r3 = (p255io.stashteam.stashapp.p298ui.home.C5580a) r3
            java.util.List<io.stashteam.stashapp.e.c.z> r0 = r2.f14532a
            java.util.List<io.stashteam.stashapp.e.c.z> r1 = r3.f14532a
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<io.stashteam.stashapp.e.c.z> r0 = r2.f14533b
            java.util.List<io.stashteam.stashapp.e.c.z> r1 = r3.f14533b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<io.stashteam.stashapp.e.c.z> r0 = r2.f14534c
            java.util.List<io.stashteam.stashapp.e.c.z> r3 = r3.f14534c
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.home.C5580a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C5323z> list = this.f14532a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C5323z> list2 = this.f14533b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C5323z> list3 = this.f14534c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HomeData(anticipatedGames=");
        sb.append(this.f14532a);
        sb.append(", latestGames=");
        sb.append(this.f14533b);
        sb.append(", upcomingGames=");
        sb.append(this.f14534c);
        sb.append(")");
        return sb.toString();
    }
}
