package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.CustomListApiModel */
public final class CustomListApiModel {
    @C4514c("creationDate")
    private final long creationDate;
    @C4514c("description")
    private final String description;
    @C4514c("gamesCount")
    private final int gamesCount;
    @C4514c("id")

    /* renamed from: id */
    private final long f13491id;
    @C4514c("closed")
    private final boolean isClosed;
    @C4514c("title")
    private final String title;
    @C4514c("viewConfiguration")
    private final ViewConfigurationApiModel viewConfiguration;

    public CustomListApiModel(long j, String str, String str2, int i, boolean z, long j2, ViewConfigurationApiModel viewConfigurationApiModel) {
        C5942k.m22327b(str, "title");
        C5942k.m22327b(viewConfigurationApiModel, "viewConfiguration");
        this.f13491id = j;
        this.title = str;
        this.description = str2;
        this.gamesCount = i;
        this.isClosed = z;
        this.creationDate = j2;
        this.viewConfiguration = viewConfigurationApiModel;
    }

    public /* synthetic */ CustomListApiModel(long j, String str, String str2, int i, boolean z, long j2, ViewConfigurationApiModel viewConfigurationApiModel, int i2, C5938g gVar) {
        this(j, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, j2, viewConfigurationApiModel);
    }

    public static /* synthetic */ CustomListApiModel copy$default(CustomListApiModel customListApiModel, long j, String str, String str2, int i, boolean z, long j2, ViewConfigurationApiModel viewConfigurationApiModel, int i2, Object obj) {
        CustomListApiModel customListApiModel2 = customListApiModel;
        return customListApiModel.copy((i2 & 1) != 0 ? customListApiModel2.f13491id : j, (i2 & 2) != 0 ? customListApiModel2.title : str, (i2 & 4) != 0 ? customListApiModel2.description : str2, (i2 & 8) != 0 ? customListApiModel2.gamesCount : i, (i2 & 16) != 0 ? customListApiModel2.isClosed : z, (i2 & 32) != 0 ? customListApiModel2.creationDate : j2, (i2 & 64) != 0 ? customListApiModel2.viewConfiguration : viewConfigurationApiModel);
    }

    public final long component1() {
        return this.f13491id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.gamesCount;
    }

    public final boolean component5() {
        return this.isClosed;
    }

    public final long component6() {
        return this.creationDate;
    }

    public final ViewConfigurationApiModel component7() {
        return this.viewConfiguration;
    }

    public final CustomListApiModel copy(long j, String str, String str2, int i, boolean z, long j2, ViewConfigurationApiModel viewConfigurationApiModel) {
        String str3 = str;
        C5942k.m22327b(str, "title");
        ViewConfigurationApiModel viewConfigurationApiModel2 = viewConfigurationApiModel;
        C5942k.m22327b(viewConfigurationApiModel2, "viewConfiguration");
        CustomListApiModel customListApiModel = new CustomListApiModel(j, str3, str2, i, z, j2, viewConfigurationApiModel2);
        return customListApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.viewConfiguration, (java.lang.Object) r6.viewConfiguration) != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0045
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.CustomListApiModel
            if (r0 == 0) goto L_0x0043
            io.stashteam.stashapp.data.network.model.CustomListApiModel r6 = (p255io.stashteam.stashapp.data.network.model.CustomListApiModel) r6
            long r0 = r5.f13491id
            long r2 = r6.f13491id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0043
            java.lang.String r0 = r5.title
            java.lang.String r1 = r6.title
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r5.description
            java.lang.String r1 = r6.description
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0043
            int r0 = r5.gamesCount
            int r1 = r6.gamesCount
            if (r0 != r1) goto L_0x0043
            boolean r0 = r5.isClosed
            boolean r1 = r6.isClosed
            if (r0 != r1) goto L_0x0043
            long r0 = r5.creationDate
            long r2 = r6.creationDate
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0043
            io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel r0 = r5.viewConfiguration
            io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel r6 = r6.viewConfiguration
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = 0
            return r6
        L_0x0045:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.CustomListApiModel.equals(java.lang.Object):boolean");
    }

    public final long getCreationDate() {
        return this.creationDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getGamesCount() {
        return this.gamesCount;
    }

    public final long getId() {
        return this.f13491id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ViewConfigurationApiModel getViewConfiguration() {
        return this.viewConfiguration;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13491id) * 31;
        String str = this.title;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.gamesCount) * 31;
        boolean z = this.isClosed;
        if (z) {
            z = true;
        }
        int a2 = (((hashCode2 + (z ? 1 : 0)) * 31) + C3085d.m12547a(this.creationDate)) * 31;
        ViewConfigurationApiModel viewConfigurationApiModel = this.viewConfiguration;
        if (viewConfigurationApiModel != null) {
            i = viewConfigurationApiModel.hashCode();
        }
        return a2 + i;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomListApiModel(id=");
        sb.append(this.f13491id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", gamesCount=");
        sb.append(this.gamesCount);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", creationDate=");
        sb.append(this.creationDate);
        sb.append(", viewConfiguration=");
        sb.append(this.viewConfiguration);
        sb.append(")");
        return sb.toString();
    }
}
