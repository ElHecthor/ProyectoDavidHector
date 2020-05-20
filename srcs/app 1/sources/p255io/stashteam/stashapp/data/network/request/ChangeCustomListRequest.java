package p255io.stashteam.stashapp.data.network.request;

import p147g.p156d.p204b.p206x.C4514c;
import p255io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.request.ChangeCustomListRequest */
public final class ChangeCustomListRequest {
    @C4514c("description")
    private final String description;
    @C4514c("id")

    /* renamed from: id */
    private final Long f13499id;
    @C4514c("closed")
    private final boolean isClosed;
    @C4514c("title")
    private final String title;
    @C4514c("viewConfiguration")
    private final ViewConfigurationApiModel viewConfiguration;

    public ChangeCustomListRequest(Long l, String str, String str2, boolean z, ViewConfigurationApiModel viewConfigurationApiModel) {
        C5942k.m22327b(str, "title");
        C5942k.m22327b(viewConfigurationApiModel, "viewConfiguration");
        this.f13499id = l;
        this.title = str;
        this.description = str2;
        this.isClosed = z;
        this.viewConfiguration = viewConfigurationApiModel;
    }

    public /* synthetic */ ChangeCustomListRequest(Long l, String str, String str2, boolean z, ViewConfigurationApiModel viewConfigurationApiModel, int i, C5938g gVar) {
        this((i & 1) != 0 ? null : l, str, (i & 4) != 0 ? null : str2, z, viewConfigurationApiModel);
    }

    public static /* synthetic */ ChangeCustomListRequest copy$default(ChangeCustomListRequest changeCustomListRequest, Long l, String str, String str2, boolean z, ViewConfigurationApiModel viewConfigurationApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            l = changeCustomListRequest.f13499id;
        }
        if ((i & 2) != 0) {
            str = changeCustomListRequest.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = changeCustomListRequest.description;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = changeCustomListRequest.isClosed;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            viewConfigurationApiModel = changeCustomListRequest.viewConfiguration;
        }
        return changeCustomListRequest.copy(l, str3, str4, z2, viewConfigurationApiModel);
    }

    public final Long component1() {
        return this.f13499id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.isClosed;
    }

    public final ViewConfigurationApiModel component5() {
        return this.viewConfiguration;
    }

    public final ChangeCustomListRequest copy(Long l, String str, String str2, boolean z, ViewConfigurationApiModel viewConfigurationApiModel) {
        C5942k.m22327b(str, "title");
        C5942k.m22327b(viewConfigurationApiModel, "viewConfiguration");
        ChangeCustomListRequest changeCustomListRequest = new ChangeCustomListRequest(l, str, str2, z, viewConfigurationApiModel);
        return changeCustomListRequest;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.viewConfiguration, (java.lang.Object) r3.viewConfiguration) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0039
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest
            if (r0 == 0) goto L_0x0037
            io.stashteam.stashapp.data.network.request.ChangeCustomListRequest r3 = (p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest) r3
            java.lang.Long r0 = r2.f13499id
            java.lang.Long r1 = r3.f13499id
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r2.description
            java.lang.String r1 = r3.description
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r2.isClosed
            boolean r1 = r3.isClosed
            if (r0 != r1) goto L_0x0037
            io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel r0 = r2.viewConfiguration
            io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel r3 = r3.viewConfiguration
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r3 = 0
            return r3
        L_0x0039:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest.equals(java.lang.Object):boolean");
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getId() {
        return this.f13499id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ViewConfigurationApiModel getViewConfiguration() {
        return this.viewConfiguration;
    }

    public int hashCode() {
        Long l = this.f13499id;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isClosed;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        ViewConfigurationApiModel viewConfigurationApiModel = this.viewConfiguration;
        if (viewConfigurationApiModel != null) {
            i = viewConfigurationApiModel.hashCode();
        }
        return i2 + i;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeCustomListRequest(id=");
        sb.append(this.f13499id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", viewConfiguration=");
        sb.append(this.viewConfiguration);
        sb.append(")");
        return sb.toString();
    }
}
