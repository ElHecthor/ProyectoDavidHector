package p255io.stashteam.stashapp.data.network.response;

import java.util.List;
import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.response.PagingResponse */
public final class PagingResponse<T> {
    @C4514c("items")
    private final List<T> items;
    @C4514c("limit")
    private final int limit;
    @C4514c("offset")
    private final int offset;
    @C4514c("total")
    private final int total;

    public PagingResponse(List<? extends T> list, int i, int i2, int i3) {
        C5942k.m22327b(list, "items");
        this.items = list;
        this.limit = i;
        this.offset = i2;
        this.total = i3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<T>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p255io.stashteam.stashapp.data.network.response.PagingResponse copy$default(p255io.stashteam.stashapp.data.network.response.PagingResponse r0, java.util.List<T> r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.util.List<T> r1 = r0.items
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            int r2 = r0.limit
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            int r3 = r0.offset
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            int r4 = r0.total
        L_0x0018:
            io.stashteam.stashapp.data.network.response.PagingResponse r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.response.PagingResponse.copy$default(io.stashteam.stashapp.data.network.response.PagingResponse, java.util.List, int, int, int, int, java.lang.Object):io.stashteam.stashapp.data.network.response.PagingResponse");
    }

    public final List<T> component1() {
        return this.items;
    }

    public final int component2() {
        return this.limit;
    }

    public final int component3() {
        return this.offset;
    }

    public final int component4() {
        return this.total;
    }

    public final PagingResponse<T> copy(List<? extends T> list, int i, int i2, int i3) {
        C5942k.m22327b(list, "items");
        return new PagingResponse<>(list, i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2.total == r3.total) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0027
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.response.PagingResponse
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.data.network.response.PagingResponse r3 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r3
            java.util.List<T> r0 = r2.items
            java.util.List<T> r1 = r3.items
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0025
            int r0 = r2.limit
            int r1 = r3.limit
            if (r0 != r1) goto L_0x0025
            int r0 = r2.offset
            int r1 = r3.offset
            if (r0 != r1) goto L_0x0025
            int r0 = r2.total
            int r3 = r3.total
            if (r0 != r3) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.response.PagingResponse.equals(java.lang.Object):boolean");
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<T> list = this.items;
        return ((((((list != null ? list.hashCode() : 0) * 31) + this.limit) * 31) + this.offset) * 31) + this.total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PagingResponse(items=");
        sb.append(this.items);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(")");
        return sb.toString();
    }
}
