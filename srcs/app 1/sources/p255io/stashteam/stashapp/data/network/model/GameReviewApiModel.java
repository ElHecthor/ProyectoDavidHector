package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.GameReviewApiModel */
public final class GameReviewApiModel {
    @C4514c("comment")
    private final String comment;
    @C4514c("completed")
    private final boolean completed;
    @C4514c("modificationDate")
    private final long modificationDate;
    @C4514c("playing")
    private final boolean playing;
    @C4514c("rating")
    private final int rating;
    @C4514c("status")
    private final String status;

    public GameReviewApiModel(String str, int i, String str2, boolean z, boolean z2, long j) {
        C5942k.m22327b(str2, "status");
        this.comment = str;
        this.rating = i;
        this.status = str2;
        this.completed = z;
        this.playing = z2;
        this.modificationDate = j;
    }

    public static /* synthetic */ GameReviewApiModel copy$default(GameReviewApiModel gameReviewApiModel, String str, int i, String str2, boolean z, boolean z2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gameReviewApiModel.comment;
        }
        if ((i2 & 2) != 0) {
            i = gameReviewApiModel.rating;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = gameReviewApiModel.status;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            z = gameReviewApiModel.completed;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = gameReviewApiModel.playing;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            j = gameReviewApiModel.modificationDate;
        }
        return gameReviewApiModel.copy(str, i3, str3, z3, z4, j);
    }

    public final String component1() {
        return this.comment;
    }

    public final int component2() {
        return this.rating;
    }

    public final String component3() {
        return this.status;
    }

    public final boolean component4() {
        return this.completed;
    }

    public final boolean component5() {
        return this.playing;
    }

    public final long component6() {
        return this.modificationDate;
    }

    public final GameReviewApiModel copy(String str, int i, String str2, boolean z, boolean z2, long j) {
        String str3 = str2;
        C5942k.m22327b(str2, "status");
        GameReviewApiModel gameReviewApiModel = new GameReviewApiModel(str, i, str3, z, z2, j);
        return gameReviewApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r4.modificationDate == r5.modificationDate) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x0039
            boolean r0 = r5 instanceof p255io.stashteam.stashapp.data.network.model.GameReviewApiModel
            if (r0 == 0) goto L_0x0037
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r5 = (p255io.stashteam.stashapp.data.network.model.GameReviewApiModel) r5
            java.lang.String r0 = r4.comment
            java.lang.String r1 = r5.comment
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            int r0 = r4.rating
            int r1 = r5.rating
            if (r0 != r1) goto L_0x0037
            java.lang.String r0 = r4.status
            java.lang.String r1 = r5.status
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4.completed
            boolean r1 = r5.completed
            if (r0 != r1) goto L_0x0037
            boolean r0 = r4.playing
            boolean r1 = r5.playing
            if (r0 != r1) goto L_0x0037
            long r0 = r4.modificationDate
            long r2 = r5.modificationDate
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r5 = 0
            return r5
        L_0x0039:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.GameReviewApiModel.equals(java.lang.Object):boolean");
    }

    public final String getComment() {
        return this.comment;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final long getModificationDate() {
        return this.modificationDate;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.comment;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.rating) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.completed;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.playing;
        if (!z2) {
            i3 = z2;
        }
        return ((i4 + i3) * 31) + C3085d.m12547a(this.modificationDate);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GameReviewApiModel(comment=");
        sb.append(this.comment);
        sb.append(", rating=");
        sb.append(this.rating);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", completed=");
        sb.append(this.completed);
        sb.append(", playing=");
        sb.append(this.playing);
        sb.append(", modificationDate=");
        sb.append(this.modificationDate);
        sb.append(")");
        return sb.toString();
    }
}
