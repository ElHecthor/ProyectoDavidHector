package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.ShortGameApiModel */
public final class ShortGameApiModel {
    @C4514c("category")
    private final int category;
    @C4514c("cover")
    private final ImageApiModel cover;
    @C4514c("firstReleaseDate")
    private final long firstReleaseDate;
    @C4514c("id")

    /* renamed from: id */
    private final long f13497id;
    @C4514c("name")
    private final String name;

    public ShortGameApiModel(long j, String str, ImageApiModel imageApiModel, long j2, int i) {
        C5942k.m22327b(str, "name");
        this.f13497id = j;
        this.name = str;
        this.cover = imageApiModel;
        this.firstReleaseDate = j2;
        this.category = i;
    }

    public static /* synthetic */ ShortGameApiModel copy$default(ShortGameApiModel shortGameApiModel, long j, String str, ImageApiModel imageApiModel, long j2, int i, int i2, Object obj) {
        ShortGameApiModel shortGameApiModel2 = shortGameApiModel;
        return shortGameApiModel.copy((i2 & 1) != 0 ? shortGameApiModel2.f13497id : j, (i2 & 2) != 0 ? shortGameApiModel2.name : str, (i2 & 4) != 0 ? shortGameApiModel2.cover : imageApiModel, (i2 & 8) != 0 ? shortGameApiModel2.firstReleaseDate : j2, (i2 & 16) != 0 ? shortGameApiModel2.category : i);
    }

    public final long component1() {
        return this.f13497id;
    }

    public final String component2() {
        return this.name;
    }

    public final ImageApiModel component3() {
        return this.cover;
    }

    public final long component4() {
        return this.firstReleaseDate;
    }

    public final int component5() {
        return this.category;
    }

    public final ShortGameApiModel copy(long j, String str, ImageApiModel imageApiModel, long j2, int i) {
        String str2 = str;
        C5942k.m22327b(str, "name");
        ShortGameApiModel shortGameApiModel = new ShortGameApiModel(j, str2, imageApiModel, j2, i);
        return shortGameApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5.category == r6.category) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0035
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.ShortGameApiModel
            if (r0 == 0) goto L_0x0033
            io.stashteam.stashapp.data.network.model.ShortGameApiModel r6 = (p255io.stashteam.stashapp.data.network.model.ShortGameApiModel) r6
            long r0 = r5.f13497id
            long r2 = r6.f13497id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0033
            java.lang.String r0 = r5.name
            java.lang.String r1 = r6.name
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0033
            io.stashteam.stashapp.data.network.model.ImageApiModel r0 = r5.cover
            io.stashteam.stashapp.data.network.model.ImageApiModel r1 = r6.cover
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0033
            long r0 = r5.firstReleaseDate
            long r2 = r6.firstReleaseDate
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0033
            int r0 = r5.category
            int r6 = r6.category
            if (r0 != r6) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r6 = 0
            return r6
        L_0x0035:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.ShortGameApiModel.equals(java.lang.Object):boolean");
    }

    public final int getCategory() {
        return this.category;
    }

    public final ImageApiModel getCover() {
        return this.cover;
    }

    public final long getFirstReleaseDate() {
        return this.firstReleaseDate;
    }

    public final long getId() {
        return this.f13497id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13497id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        ImageApiModel imageApiModel = this.cover;
        if (imageApiModel != null) {
            i = imageApiModel.hashCode();
        }
        return ((((hashCode + i) * 31) + C3085d.m12547a(this.firstReleaseDate)) * 31) + this.category;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShortGameApiModel(id=");
        sb.append(this.f13497id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", firstReleaseDate=");
        sb.append(this.firstReleaseDate);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(")");
        return sb.toString();
    }
}
