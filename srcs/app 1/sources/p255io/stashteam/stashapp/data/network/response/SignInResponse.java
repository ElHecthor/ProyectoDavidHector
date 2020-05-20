package p255io.stashteam.stashapp.data.network.response;

import p147g.p156d.p204b.p206x.C4514c;
import p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel;
import p255io.stashteam.stashapp.data.network.model.UserApiModel;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.response.SignInResponse */
public final class SignInResponse {
    @C4514c("accessToken")
    private final AccessTokenApiModel accessToken;
    @C4514c("user")
    private final UserApiModel user;

    public SignInResponse(AccessTokenApiModel accessTokenApiModel, UserApiModel userApiModel) {
        C5942k.m22327b(accessTokenApiModel, "accessToken");
        C5942k.m22327b(userApiModel, "user");
        this.accessToken = accessTokenApiModel;
        this.user = userApiModel;
    }

    public static /* synthetic */ SignInResponse copy$default(SignInResponse signInResponse, AccessTokenApiModel accessTokenApiModel, UserApiModel userApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            accessTokenApiModel = signInResponse.accessToken;
        }
        if ((i & 2) != 0) {
            userApiModel = signInResponse.user;
        }
        return signInResponse.copy(accessTokenApiModel, userApiModel);
    }

    public final AccessTokenApiModel component1() {
        return this.accessToken;
    }

    public final UserApiModel component2() {
        return this.user;
    }

    public final SignInResponse copy(AccessTokenApiModel accessTokenApiModel, UserApiModel userApiModel) {
        C5942k.m22327b(accessTokenApiModel, "accessToken");
        C5942k.m22327b(userApiModel, "user");
        return new SignInResponse(accessTokenApiModel, userApiModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.user, (java.lang.Object) r3.user) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.response.SignInResponse
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.response.SignInResponse r3 = (p255io.stashteam.stashapp.data.network.response.SignInResponse) r3
            io.stashteam.stashapp.data.network.model.AccessTokenApiModel r0 = r2.accessToken
            io.stashteam.stashapp.data.network.model.AccessTokenApiModel r1 = r3.accessToken
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.UserApiModel r0 = r2.user
            io.stashteam.stashapp.data.network.model.UserApiModel r3 = r3.user
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.response.SignInResponse.equals(java.lang.Object):boolean");
    }

    public final AccessTokenApiModel getAccessToken() {
        return this.accessToken;
    }

    public final UserApiModel getUser() {
        return this.user;
    }

    public int hashCode() {
        AccessTokenApiModel accessTokenApiModel = this.accessToken;
        int i = 0;
        int hashCode = (accessTokenApiModel != null ? accessTokenApiModel.hashCode() : 0) * 31;
        UserApiModel userApiModel = this.user;
        if (userApiModel != null) {
            i = userApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignInResponse(accessToken=");
        sb.append(this.accessToken);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(")");
        return sb.toString();
    }
}
