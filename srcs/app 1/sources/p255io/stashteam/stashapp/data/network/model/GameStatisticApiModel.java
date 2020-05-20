package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;

/* renamed from: io.stashteam.stashapp.data.network.model.GameStatisticApiModel */
public final class GameStatisticApiModel {
    @C4514c("played")
    private final int playedCount;
    @C4514c("comments")
    private final int reviewCount;
    @C4514c("want")
    private final int wantCount;

    public GameStatisticApiModel(int i, int i2, int i3) {
        this.wantCount = i;
        this.playedCount = i2;
        this.reviewCount = i3;
    }

    public static /* synthetic */ GameStatisticApiModel copy$default(GameStatisticApiModel gameStatisticApiModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = gameStatisticApiModel.wantCount;
        }
        if ((i4 & 2) != 0) {
            i2 = gameStatisticApiModel.playedCount;
        }
        if ((i4 & 4) != 0) {
            i3 = gameStatisticApiModel.reviewCount;
        }
        return gameStatisticApiModel.copy(i, i2, i3);
    }

    public final int component1() {
        return this.wantCount;
    }

    public final int component2() {
        return this.playedCount;
    }

    public final int component3() {
        return this.reviewCount;
    }

    public final GameStatisticApiModel copy(int i, int i2, int i3) {
        return new GameStatisticApiModel(i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r2.reviewCount == r3.reviewCount) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001d
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.model.GameStatisticApiModel
            if (r0 == 0) goto L_0x001b
            io.stashteam.stashapp.data.network.model.GameStatisticApiModel r3 = (p255io.stashteam.stashapp.data.network.model.GameStatisticApiModel) r3
            int r0 = r2.wantCount
            int r1 = r3.wantCount
            if (r0 != r1) goto L_0x001b
            int r0 = r2.playedCount
            int r1 = r3.playedCount
            if (r0 != r1) goto L_0x001b
            int r0 = r2.reviewCount
            int r3 = r3.reviewCount
            if (r0 != r3) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r3 = 0
            return r3
        L_0x001d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.GameStatisticApiModel.equals(java.lang.Object):boolean");
    }

    public final int getPlayedCount() {
        return this.playedCount;
    }

    public final int getReviewCount() {
        return this.reviewCount;
    }

    public final int getWantCount() {
        return this.wantCount;
    }

    public int hashCode() {
        return (((this.wantCount * 31) + this.playedCount) * 31) + this.reviewCount;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GameStatisticApiModel(wantCount=");
        sb.append(this.wantCount);
        sb.append(", playedCount=");
        sb.append(this.playedCount);
        sb.append(", reviewCount=");
        sb.append(this.reviewCount);
        sb.append(")");
        return sb.toString();
    }
}
