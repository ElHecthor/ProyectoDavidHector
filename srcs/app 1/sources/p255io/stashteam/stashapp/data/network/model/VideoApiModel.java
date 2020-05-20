package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.VideoApiModel */
public final class VideoApiModel {
    @C4514c("name")
    private final String name;
    @C4514c("videoId")
    private final String videoId;

    public VideoApiModel(String str, String str2) {
        C5942k.m22327b(str2, "videoId");
        this.name = str;
        this.videoId = str2;
    }

    public static /* synthetic */ VideoApiModel copy$default(VideoApiModel videoApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoApiModel.name;
        }
        if ((i & 2) != 0) {
            str2 = videoApiModel.videoId;
        }
        return videoApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.videoId;
    }

    public final VideoApiModel copy(String str, String str2) {
        C5942k.m22327b(str2, "videoId");
        return new VideoApiModel(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.videoId, (java.lang.Object) r3.videoId) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.model.VideoApiModel
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.VideoApiModel r3 = (p255io.stashteam.stashapp.data.network.model.VideoApiModel) r3
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.videoId
            java.lang.String r3 = r3.videoId
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.VideoApiModel.equals(java.lang.Object):boolean");
    }

    public final String getName() {
        return this.name;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.videoId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoApiModel(name=");
        sb.append(this.name);
        sb.append(", videoId=");
        sb.append(this.videoId);
        sb.append(")");
        return sb.toString();
    }
}
