package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;

/* renamed from: io.stashteam.stashapp.data.network.model.StatisticApiModel */
public final class StatisticApiModel {
    @C4514c("played")
    private final int playedCount;
    @C4514c("playing")
    private final int playingCount;
    @C4514c("points")
    private final int points;
    @C4514c("rank")
    private final int rank;
    @C4514c("want")
    private final int wantCount;

    public StatisticApiModel(int i, int i2, int i3, int i4, int i5) {
        this.playedCount = i;
        this.playingCount = i2;
        this.wantCount = i3;
        this.points = i4;
        this.rank = i5;
    }

    public static /* synthetic */ StatisticApiModel copy$default(StatisticApiModel statisticApiModel, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = statisticApiModel.playedCount;
        }
        if ((i6 & 2) != 0) {
            i2 = statisticApiModel.playingCount;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = statisticApiModel.wantCount;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = statisticApiModel.points;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = statisticApiModel.rank;
        }
        return statisticApiModel.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.playedCount;
    }

    public final int component2() {
        return this.playingCount;
    }

    public final int component3() {
        return this.wantCount;
    }

    public final int component4() {
        return this.points;
    }

    public final int component5() {
        return this.rank;
    }

    public final StatisticApiModel copy(int i, int i2, int i3, int i4, int i5) {
        StatisticApiModel statisticApiModel = new StatisticApiModel(i, i2, i3, i4, i5);
        return statisticApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2.rank == r3.rank) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.model.StatisticApiModel
            if (r0 == 0) goto L_0x0027
            io.stashteam.stashapp.data.network.model.StatisticApiModel r3 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r3
            int r0 = r2.playedCount
            int r1 = r3.playedCount
            if (r0 != r1) goto L_0x0027
            int r0 = r2.playingCount
            int r1 = r3.playingCount
            if (r0 != r1) goto L_0x0027
            int r0 = r2.wantCount
            int r1 = r3.wantCount
            if (r0 != r1) goto L_0x0027
            int r0 = r2.points
            int r1 = r3.points
            if (r0 != r1) goto L_0x0027
            int r0 = r2.rank
            int r3 = r3.rank
            if (r0 != r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.StatisticApiModel.equals(java.lang.Object):boolean");
    }

    public final int getPlayedCount() {
        return this.playedCount;
    }

    public final int getPlayingCount() {
        return this.playingCount;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getWantCount() {
        return this.wantCount;
    }

    public int hashCode() {
        return (((((((this.playedCount * 31) + this.playingCount) * 31) + this.wantCount) * 31) + this.points) * 31) + this.rank;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatisticApiModel(playedCount=");
        sb.append(this.playedCount);
        sb.append(", playingCount=");
        sb.append(this.playingCount);
        sb.append(", wantCount=");
        sb.append(this.wantCount);
        sb.append(", points=");
        sb.append(this.points);
        sb.append(", rank=");
        sb.append(this.rank);
        sb.append(")");
        return sb.toString();
    }
}
