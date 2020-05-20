package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;

/* renamed from: io.stashteam.stashapp.data.network.model.UserApiModel */
public final class UserApiModel {
    @C4514c("email")
    private final String email;
    @C4514c("externalId")
    private final ExternalIdApiModel externalId;
    @C4514c("fullName")
    private final String fullName;
    @C4514c("id")

    /* renamed from: id */
    private final long f13498id;
    @C4514c("imageUrl")
    private final String imageUrl;
    @C4514c("closed")
    private final boolean isClosed;
    @C4514c("login")
    private final String login;

    public UserApiModel(long j, String str, String str2, String str3, String str4, ExternalIdApiModel externalIdApiModel, boolean z) {
        this.f13498id = j;
        this.login = str;
        this.fullName = str2;
        this.email = str3;
        this.imageUrl = str4;
        this.externalId = externalIdApiModel;
        this.isClosed = z;
    }

    public static /* synthetic */ UserApiModel copy$default(UserApiModel userApiModel, long j, String str, String str2, String str3, String str4, ExternalIdApiModel externalIdApiModel, boolean z, int i, Object obj) {
        UserApiModel userApiModel2 = userApiModel;
        return userApiModel.copy((i & 1) != 0 ? userApiModel2.f13498id : j, (i & 2) != 0 ? userApiModel2.login : str, (i & 4) != 0 ? userApiModel2.fullName : str2, (i & 8) != 0 ? userApiModel2.email : str3, (i & 16) != 0 ? userApiModel2.imageUrl : str4, (i & 32) != 0 ? userApiModel2.externalId : externalIdApiModel, (i & 64) != 0 ? userApiModel2.isClosed : z);
    }

    public final long component1() {
        return this.f13498id;
    }

    public final String component2() {
        return this.login;
    }

    public final String component3() {
        return this.fullName;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final ExternalIdApiModel component6() {
        return this.externalId;
    }

    public final boolean component7() {
        return this.isClosed;
    }

    public final UserApiModel copy(long j, String str, String str2, String str3, String str4, ExternalIdApiModel externalIdApiModel, boolean z) {
        UserApiModel userApiModel = new UserApiModel(j, str, str2, str3, str4, externalIdApiModel, z);
        return userApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r5.isClosed == r6.isClosed) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x004b
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.UserApiModel
            if (r0 == 0) goto L_0x0049
            io.stashteam.stashapp.data.network.model.UserApiModel r6 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r6
            long r0 = r5.f13498id
            long r2 = r6.f13498id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0049
            java.lang.String r0 = r5.login
            java.lang.String r1 = r6.login
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r5.fullName
            java.lang.String r1 = r6.fullName
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r5.email
            java.lang.String r1 = r6.email
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r5.imageUrl
            java.lang.String r1 = r6.imageUrl
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0049
            io.stashteam.stashapp.data.network.model.ExternalIdApiModel r0 = r5.externalId
            io.stashteam.stashapp.data.network.model.ExternalIdApiModel r1 = r6.externalId
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0049
            boolean r0 = r5.isClosed
            boolean r6 = r6.isClosed
            if (r0 != r6) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r6 = 0
            return r6
        L_0x004b:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.UserApiModel.equals(java.lang.Object):boolean");
    }

    public final String getEmail() {
        return this.email;
    }

    public final ExternalIdApiModel getExternalId() {
        return this.externalId;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final long getId() {
        return this.f13498id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLogin() {
        return this.login;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13498id) * 31;
        String str = this.login;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.fullName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ExternalIdApiModel externalIdApiModel = this.externalId;
        if (externalIdApiModel != null) {
            i = externalIdApiModel.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.isClosed;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserApiModel(id=");
        sb.append(this.f13498id);
        sb.append(", login=");
        sb.append(this.login);
        sb.append(", fullName=");
        sb.append(this.fullName);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", externalId=");
        sb.append(this.externalId);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(")");
        return sb.toString();
    }
}
