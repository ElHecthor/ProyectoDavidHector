package p255io.stashteam.stashapp.data.network.response;

import p147g.p156d.p204b.p206x.C4514c;
import p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.response.RegisterDeviceResponse */
public final class RegisterDeviceResponse {
    @C4514c("accessToken")
    private final AccessTokenApiModel accessToken;

    public RegisterDeviceResponse(AccessTokenApiModel accessTokenApiModel) {
        C5942k.m22327b(accessTokenApiModel, "accessToken");
        this.accessToken = accessTokenApiModel;
    }

    public static /* synthetic */ RegisterDeviceResponse copy$default(RegisterDeviceResponse registerDeviceResponse, AccessTokenApiModel accessTokenApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            accessTokenApiModel = registerDeviceResponse.accessToken;
        }
        return registerDeviceResponse.copy(accessTokenApiModel);
    }

    public final AccessTokenApiModel component1() {
        return this.accessToken;
    }

    public final RegisterDeviceResponse copy(AccessTokenApiModel accessTokenApiModel) {
        C5942k.m22327b(accessTokenApiModel, "accessToken");
        return new RegisterDeviceResponse(accessTokenApiModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.accessToken, (java.lang.Object) ((p255io.stashteam.stashapp.data.network.response.RegisterDeviceResponse) r2).accessToken) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p255io.stashteam.stashapp.data.network.response.RegisterDeviceResponse
            if (r0 == 0) goto L_0x0013
            io.stashteam.stashapp.data.network.response.RegisterDeviceResponse r2 = (p255io.stashteam.stashapp.data.network.response.RegisterDeviceResponse) r2
            io.stashteam.stashapp.data.network.model.AccessTokenApiModel r0 = r1.accessToken
            io.stashteam.stashapp.data.network.model.AccessTokenApiModel r2 = r2.accessToken
            boolean r2 = p308k.p323z.p325d.C5942k.m22326a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.response.RegisterDeviceResponse.equals(java.lang.Object):boolean");
    }

    public final AccessTokenApiModel getAccessToken() {
        return this.accessToken;
    }

    public int hashCode() {
        AccessTokenApiModel accessTokenApiModel = this.accessToken;
        if (accessTokenApiModel != null) {
            return accessTokenApiModel.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegisterDeviceResponse(accessToken=");
        sb.append(this.accessToken);
        sb.append(")");
        return sb.toString();
    }
}
