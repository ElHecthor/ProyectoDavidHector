package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.AccessTokenApiModel */
public final class AccessTokenApiModel {
    @C4514c("expires_in")
    private final long expiresIn;
    @C4514c("refresh_token")
    private final String refreshToken;
    @C4514c("scope")
    private final String scope;
    @C4514c("access_token")
    private final String token;
    @C4514c("token_type")
    private final String type;

    public AccessTokenApiModel(String str, String str2, String str3, String str4, long j) {
        C5942k.m22327b(str, "token");
        C5942k.m22327b(str2, "type");
        C5942k.m22327b(str3, "scope");
        C5942k.m22327b(str4, "refreshToken");
        this.token = str;
        this.type = str2;
        this.scope = str3;
        this.refreshToken = str4;
        this.expiresIn = j;
    }

    public static /* synthetic */ AccessTokenApiModel copy$default(AccessTokenApiModel accessTokenApiModel, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessTokenApiModel.token;
        }
        if ((i & 2) != 0) {
            str2 = accessTokenApiModel.type;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = accessTokenApiModel.scope;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = accessTokenApiModel.refreshToken;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            j = accessTokenApiModel.expiresIn;
        }
        return accessTokenApiModel.copy(str, str5, str6, str7, j);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.scope;
    }

    public final String component4() {
        return this.refreshToken;
    }

    public final long component5() {
        return this.expiresIn;
    }

    public final AccessTokenApiModel copy(String str, String str2, String str3, String str4, long j) {
        C5942k.m22327b(str, "token");
        C5942k.m22327b(str2, "type");
        C5942k.m22327b(str3, "scope");
        C5942k.m22327b(str4, "refreshToken");
        AccessTokenApiModel accessTokenApiModel = new AccessTokenApiModel(str, str2, str3, str4, j);
        return accessTokenApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r4.expiresIn == r5.expiresIn) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x003b
            boolean r0 = r5 instanceof p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel
            if (r0 == 0) goto L_0x0039
            io.stashteam.stashapp.data.network.model.AccessTokenApiModel r5 = (p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel) r5
            java.lang.String r0 = r4.token
            java.lang.String r1 = r5.token
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r4.type
            java.lang.String r1 = r5.type
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r4.scope
            java.lang.String r1 = r5.scope
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r4.refreshToken
            java.lang.String r1 = r5.refreshToken
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0039
            long r0 = r4.expiresIn
            long r2 = r5.expiresIn
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r5 = 0
            return r5
        L_0x003b:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel.equals(java.lang.Object):boolean");
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scope;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.refreshToken;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + C3085d.m12547a(this.expiresIn);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccessTokenApiModel(token=");
        sb.append(this.token);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(")");
        return sb.toString();
    }
}
