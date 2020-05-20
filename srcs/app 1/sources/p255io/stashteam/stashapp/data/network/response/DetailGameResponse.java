package p255io.stashteam.stashapp.data.network.response;

import p147g.p156d.p204b.p206x.C4514c;
import p255io.stashteam.stashapp.data.network.model.DetailGameApiModel;
import p255io.stashteam.stashapp.data.network.model.GameReviewApiModel;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.response.DetailGameResponse */
public final class DetailGameResponse {
    @C4514c("game")
    private final DetailGameApiModel game;
    @C4514c("review")
    private final GameReviewApiModel gameReview;

    public DetailGameResponse(DetailGameApiModel detailGameApiModel, GameReviewApiModel gameReviewApiModel) {
        C5942k.m22327b(detailGameApiModel, "game");
        this.game = detailGameApiModel;
        this.gameReview = gameReviewApiModel;
    }

    public static /* synthetic */ DetailGameResponse copy$default(DetailGameResponse detailGameResponse, DetailGameApiModel detailGameApiModel, GameReviewApiModel gameReviewApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            detailGameApiModel = detailGameResponse.game;
        }
        if ((i & 2) != 0) {
            gameReviewApiModel = detailGameResponse.gameReview;
        }
        return detailGameResponse.copy(detailGameApiModel, gameReviewApiModel);
    }

    public final DetailGameApiModel component1() {
        return this.game;
    }

    public final GameReviewApiModel component2() {
        return this.gameReview;
    }

    public final DetailGameResponse copy(DetailGameApiModel detailGameApiModel, GameReviewApiModel gameReviewApiModel) {
        C5942k.m22327b(detailGameApiModel, "game");
        return new DetailGameResponse(detailGameApiModel, gameReviewApiModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.gameReview, (java.lang.Object) r3.gameReview) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.response.DetailGameResponse
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.response.DetailGameResponse r3 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r3
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r0 = r2.game
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r1 = r3.game
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r0 = r2.gameReview
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r3 = r3.gameReview
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.response.DetailGameResponse.equals(java.lang.Object):boolean");
    }

    public final DetailGameApiModel getGame() {
        return this.game;
    }

    public final GameReviewApiModel getGameReview() {
        return this.gameReview;
    }

    public int hashCode() {
        DetailGameApiModel detailGameApiModel = this.game;
        int i = 0;
        int hashCode = (detailGameApiModel != null ? detailGameApiModel.hashCode() : 0) * 31;
        GameReviewApiModel gameReviewApiModel = this.gameReview;
        if (gameReviewApiModel != null) {
            i = gameReviewApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetailGameResponse(game=");
        sb.append(this.game);
        sb.append(", gameReview=");
        sb.append(this.gameReview);
        sb.append(")");
        return sb.toString();
    }
}
