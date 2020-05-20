package p255io.stashteam.stashapp.data.network.model;

import java.util.List;
import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.SeriesApiModel */
public final class SeriesApiModel {
    @C4514c("games")
    private final List<Long> gameIds;
    @C4514c("id")

    /* renamed from: id */
    private final long f13496id;
    @C4514c("name")
    private final String name;

    public SeriesApiModel(long j, String str, List<Long> list) {
        C5942k.m22327b(str, "name");
        this.f13496id = j;
        this.name = str;
        this.gameIds = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Long>, for r4v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p255io.stashteam.stashapp.data.network.model.SeriesApiModel copy$default(p255io.stashteam.stashapp.data.network.model.SeriesApiModel r0, long r1, java.lang.String r3, java.util.List<java.lang.Long> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            long r1 = r0.f13496id
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r3 = r0.name
        L_0x000c:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0012
            java.util.List<java.lang.Long> r4 = r0.gameIds
        L_0x0012:
            io.stashteam.stashapp.data.network.model.SeriesApiModel r0 = r0.copy(r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.SeriesApiModel.copy$default(io.stashteam.stashapp.data.network.model.SeriesApiModel, long, java.lang.String, java.util.List, int, java.lang.Object):io.stashteam.stashapp.data.network.model.SeriesApiModel");
    }

    public final long component1() {
        return this.f13496id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<Long> component3() {
        return this.gameIds;
    }

    public final SeriesApiModel copy(long j, String str, List<Long> list) {
        C5942k.m22327b(str, "name");
        return new SeriesApiModel(j, str, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.gameIds, (java.lang.Object) r6.gameIds) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0027
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.SeriesApiModel
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.data.network.model.SeriesApiModel r6 = (p255io.stashteam.stashapp.data.network.model.SeriesApiModel) r6
            long r0 = r5.f13496id
            long r2 = r6.f13496id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = r5.name
            java.lang.String r1 = r6.name
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0025
            java.util.List<java.lang.Long> r0 = r5.gameIds
            java.util.List<java.lang.Long> r6 = r6.gameIds
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r6 = 0
            return r6
        L_0x0027:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.SeriesApiModel.equals(java.lang.Object):boolean");
    }

    public final List<Long> getGameIds() {
        return this.gameIds;
    }

    public final long getId() {
        return this.f13496id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13496id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        List<Long> list = this.gameIds;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeriesApiModel(id=");
        sb.append(this.f13496id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", gameIds=");
        sb.append(this.gameIds);
        sb.append(")");
        return sb.toString();
    }
}
