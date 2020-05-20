package p255io.stashteam.stashapp.data.network.response;

import p147g.p156d.p204b.p206x.C4514c;
import p255io.stashteam.stashapp.data.network.model.GameReviewApiModel;
import p255io.stashteam.stashapp.data.network.model.UserApiModel;

/* renamed from: io.stashteam.stashapp.data.network.response.ReviewResponse */
public final class ReviewResponse {
    @C4514c("review")
    private final GameReviewApiModel review;
    @C4514c("user")
    private final UserApiModel user;

    public ReviewResponse(UserApiModel userApiModel, GameReviewApiModel gameReviewApiModel) {
        this.user = userApiModel;
        this.review = gameReviewApiModel;
    }

    public static /* synthetic */ ReviewResponse copy$default(ReviewResponse reviewResponse, UserApiModel userApiModel, GameReviewApiModel gameReviewApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            userApiModel = reviewResponse.user;
        }
        if ((i & 2) != 0) {
            gameReviewApiModel = reviewResponse.review;
        }
        return reviewResponse.copy(userApiModel, gameReviewApiModel);
    }

    public final UserApiModel component1() {
        return this.user;
    }

    public final GameReviewApiModel component2() {
        return this.review;
    }

    public final ReviewResponse copy(UserApiModel userApiModel, GameReviewApiModel gameReviewApiModel) {
        return new ReviewResponse(userApiModel, gameReviewApiModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.review, (java.lang.Object) r3.review) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.response.ReviewResponse
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.response.ReviewResponse r3 = (p255io.stashteam.stashapp.data.network.response.ReviewResponse) r3
            io.stashteam.stashapp.data.network.model.UserApiModel r0 = r2.user
            io.stashteam.stashapp.data.network.model.UserApiModel r1 = r3.user
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r0 = r2.review
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r3 = r3.review
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.response.ReviewResponse.equals(java.lang.Object):boolean");
    }

    public final GameReviewApiModel getReview() {
        return this.review;
    }

    public final UserApiModel getUser() {
        return this.user;
    }

    public int hashCode() {
        UserApiModel userApiModel = this.user;
        int i = 0;
        int hashCode = (userApiModel != null ? userApiModel.hashCode() : 0) * 31;
        GameReviewApiModel gameReviewApiModel = this.review;
        if (gameReviewApiModel != null) {
            i = gameReviewApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReviewResponse(user=");
        sb.append(this.user);
        sb.append(", review=");
        sb.append(this.review);
        sb.append(")");
        return sb.toString();
    }
}
