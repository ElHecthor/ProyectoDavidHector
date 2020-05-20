package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.ImageApiModel */
public final class ImageApiModel {
    @C4514c("alphaChannel")
    private final boolean alphaChannel;
    @C4514c("animated")
    private final boolean animated;
    @C4514c("height")
    private final int height;
    @C4514c("id")

    /* renamed from: id */
    private final long f13493id;
    @C4514c("imageId")
    private final String imageId;
    @C4514c("url")
    private final String url;
    @C4514c("width")
    private final int width;

    public ImageApiModel(long j, boolean z, boolean z2, int i, int i2, String str, String str2) {
        C5942k.m22327b(str, "imageId");
        C5942k.m22327b(str2, "url");
        this.f13493id = j;
        this.alphaChannel = z;
        this.animated = z2;
        this.width = i;
        this.height = i2;
        this.imageId = str;
        this.url = str2;
    }

    public static /* synthetic */ ImageApiModel copy$default(ImageApiModel imageApiModel, long j, boolean z, boolean z2, int i, int i2, String str, String str2, int i3, Object obj) {
        ImageApiModel imageApiModel2 = imageApiModel;
        return imageApiModel.copy((i3 & 1) != 0 ? imageApiModel2.f13493id : j, (i3 & 2) != 0 ? imageApiModel2.alphaChannel : z, (i3 & 4) != 0 ? imageApiModel2.animated : z2, (i3 & 8) != 0 ? imageApiModel2.width : i, (i3 & 16) != 0 ? imageApiModel2.height : i2, (i3 & 32) != 0 ? imageApiModel2.imageId : str, (i3 & 64) != 0 ? imageApiModel2.url : str2);
    }

    public final long component1() {
        return this.f13493id;
    }

    public final boolean component2() {
        return this.alphaChannel;
    }

    public final boolean component3() {
        return this.animated;
    }

    public final int component4() {
        return this.width;
    }

    public final int component5() {
        return this.height;
    }

    public final String component6() {
        return this.imageId;
    }

    public final String component7() {
        return this.url;
    }

    public final ImageApiModel copy(long j, boolean z, boolean z2, int i, int i2, String str, String str2) {
        String str3 = str;
        C5942k.m22327b(str3, "imageId");
        String str4 = str2;
        C5942k.m22327b(str4, "url");
        ImageApiModel imageApiModel = new ImageApiModel(j, z, z2, i, i2, str3, str4);
        return imageApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.url, (java.lang.Object) r6.url) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x003f
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.ImageApiModel
            if (r0 == 0) goto L_0x003d
            io.stashteam.stashapp.data.network.model.ImageApiModel r6 = (p255io.stashteam.stashapp.data.network.model.ImageApiModel) r6
            long r0 = r5.f13493id
            long r2 = r6.f13493id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            boolean r0 = r5.alphaChannel
            boolean r1 = r6.alphaChannel
            if (r0 != r1) goto L_0x003d
            boolean r0 = r5.animated
            boolean r1 = r6.animated
            if (r0 != r1) goto L_0x003d
            int r0 = r5.width
            int r1 = r6.width
            if (r0 != r1) goto L_0x003d
            int r0 = r5.height
            int r1 = r6.height
            if (r0 != r1) goto L_0x003d
            java.lang.String r0 = r5.imageId
            java.lang.String r1 = r6.imageId
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r5.url
            java.lang.String r6 = r6.url
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r6 = 0
            return r6
        L_0x003f:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.ImageApiModel.equals(java.lang.Object):boolean");
    }

    public final boolean getAlphaChannel() {
        return this.alphaChannel;
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f13493id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13493id) * 31;
        boolean z = this.alphaChannel;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (a + (z ? 1 : 0)) * 31;
        boolean z2 = this.animated;
        if (!z2) {
            i = z2;
        }
        int i3 = (((((i2 + i) * 31) + this.width) * 31) + this.height) * 31;
        String str = this.imageId;
        int i4 = 0;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImageApiModel(id=");
        sb.append(this.f13493id);
        sb.append(", alphaChannel=");
        sb.append(this.alphaChannel);
        sb.append(", animated=");
        sb.append(this.animated);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", imageId=");
        sb.append(this.imageId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(")");
        return sb.toString();
    }
}
