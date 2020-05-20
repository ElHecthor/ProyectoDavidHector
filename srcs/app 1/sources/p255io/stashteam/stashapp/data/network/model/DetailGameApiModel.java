package p255io.stashteam.stashapp.data.network.model;

import java.util.List;
import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.DetailGameApiModel */
public final class DetailGameApiModel {
    @C4514c("category")
    private final int category;
    @C4514c("cover")
    private final ImageApiModel cover;
    @C4514c("aggregatedRating")
    private final double criticsRating;
    @C4514c("dlcs")
    private final List<Long> dlcs;
    @C4514c("expansions")
    private final List<Long> expansions;
    @C4514c("firstReleaseDate")
    private final long firstReleaseDate;
    @C4514c("genres")
    private final List<Integer> genres;
    @C4514c("id")

    /* renamed from: id */
    private final long f13492id;
    @C4514c("involvedCompanies")
    private final List<InvolvedCompanyApiModel> involvedCompanies;
    @C4514c("name")
    private final String name;
    @C4514c("parent")
    private final Long parentId;
    @C4514c("platforms")
    private final List<PlatformApiModel> platforms;
    @C4514c("screenshots")
    private final List<ImageApiModel> screenshots;
    @C4514c("collection")
    private final SeriesApiModel series;
    @C4514c("summary")
    private final String summary;
    @C4514c("videos")
    private final List<VideoApiModel> videos;

    public DetailGameApiModel(long j, String str, ImageApiModel imageApiModel, long j2, List<Integer> list, int i, Long l, double d, List<PlatformApiModel> list2, String str2, List<InvolvedCompanyApiModel> list3, List<VideoApiModel> list4, List<ImageApiModel> list5, SeriesApiModel seriesApiModel, List<Long> list6, List<Long> list7) {
        String str3 = str;
        C5942k.m22327b(str, "name");
        this.f13492id = j;
        this.name = str3;
        this.cover = imageApiModel;
        this.firstReleaseDate = j2;
        this.genres = list;
        this.category = i;
        this.parentId = l;
        this.criticsRating = d;
        this.platforms = list2;
        this.summary = str2;
        this.involvedCompanies = list3;
        this.videos = list4;
        this.screenshots = list5;
        this.series = seriesApiModel;
        this.expansions = list6;
        this.dlcs = list7;
    }

    public static /* synthetic */ DetailGameApiModel copy$default(DetailGameApiModel detailGameApiModel, long j, String str, ImageApiModel imageApiModel, long j2, List list, int i, Long l, double d, List list2, String str2, List list3, List list4, List list5, SeriesApiModel seriesApiModel, List list6, List list7, int i2, Object obj) {
        DetailGameApiModel detailGameApiModel2 = detailGameApiModel;
        int i3 = i2;
        return detailGameApiModel.copy((i3 & 1) != 0 ? detailGameApiModel2.f13492id : j, (i3 & 2) != 0 ? detailGameApiModel2.name : str, (i3 & 4) != 0 ? detailGameApiModel2.cover : imageApiModel, (i3 & 8) != 0 ? detailGameApiModel2.firstReleaseDate : j2, (i3 & 16) != 0 ? detailGameApiModel2.genres : list, (i3 & 32) != 0 ? detailGameApiModel2.category : i, (i3 & 64) != 0 ? detailGameApiModel2.parentId : l, (i3 & 128) != 0 ? detailGameApiModel2.criticsRating : d, (i3 & 256) != 0 ? detailGameApiModel2.platforms : list2, (i3 & 512) != 0 ? detailGameApiModel2.summary : str2, (i3 & 1024) != 0 ? detailGameApiModel2.involvedCompanies : list3, (i3 & 2048) != 0 ? detailGameApiModel2.videos : list4, (i3 & 4096) != 0 ? detailGameApiModel2.screenshots : list5, (i3 & 8192) != 0 ? detailGameApiModel2.series : seriesApiModel, (i3 & 16384) != 0 ? detailGameApiModel2.expansions : list6, (i3 & 32768) != 0 ? detailGameApiModel2.dlcs : list7);
    }

    public final long component1() {
        return this.f13492id;
    }

    public final String component10() {
        return this.summary;
    }

    public final List<InvolvedCompanyApiModel> component11() {
        return this.involvedCompanies;
    }

    public final List<VideoApiModel> component12() {
        return this.videos;
    }

    public final List<ImageApiModel> component13() {
        return this.screenshots;
    }

    public final SeriesApiModel component14() {
        return this.series;
    }

    public final List<Long> component15() {
        return this.expansions;
    }

    public final List<Long> component16() {
        return this.dlcs;
    }

    public final String component2() {
        return this.name;
    }

    public final ImageApiModel component3() {
        return this.cover;
    }

    public final long component4() {
        return this.firstReleaseDate;
    }

    public final List<Integer> component5() {
        return this.genres;
    }

    public final int component6() {
        return this.category;
    }

    public final Long component7() {
        return this.parentId;
    }

    public final double component8() {
        return this.criticsRating;
    }

    public final List<PlatformApiModel> component9() {
        return this.platforms;
    }

    public final DetailGameApiModel copy(long j, String str, ImageApiModel imageApiModel, long j2, List<Integer> list, int i, Long l, double d, List<PlatformApiModel> list2, String str2, List<InvolvedCompanyApiModel> list3, List<VideoApiModel> list4, List<ImageApiModel> list5, SeriesApiModel seriesApiModel, List<Long> list6, List<Long> list7) {
        long j3 = j;
        String str3 = str;
        ImageApiModel imageApiModel2 = imageApiModel;
        long j4 = j2;
        List<Integer> list8 = list;
        int i2 = i;
        Long l2 = l;
        double d2 = d;
        List<PlatformApiModel> list9 = list2;
        String str4 = str2;
        List<InvolvedCompanyApiModel> list10 = list3;
        List<VideoApiModel> list11 = list4;
        List<ImageApiModel> list12 = list5;
        SeriesApiModel seriesApiModel2 = seriesApiModel;
        List<Long> list13 = list6;
        List<Long> list14 = list7;
        C5942k.m22327b(str, "name");
        DetailGameApiModel detailGameApiModel = new DetailGameApiModel(j, str3, imageApiModel2, j4, list8, i2, l2, d2, list9, str4, list10, list11, list12, seriesApiModel2, list13, list14);
        return detailGameApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.dlcs, (java.lang.Object) r6.dlcs) != false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x00a3
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.DetailGameApiModel
            if (r0 == 0) goto L_0x00a1
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r6 = (p255io.stashteam.stashapp.data.network.model.DetailGameApiModel) r6
            long r0 = r5.f13492id
            long r2 = r6.f13492id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00a1
            java.lang.String r0 = r5.name
            java.lang.String r1 = r6.name
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            io.stashteam.stashapp.data.network.model.ImageApiModel r0 = r5.cover
            io.stashteam.stashapp.data.network.model.ImageApiModel r1 = r6.cover
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            long r0 = r5.firstReleaseDate
            long r2 = r6.firstReleaseDate
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00a1
            java.util.List<java.lang.Integer> r0 = r5.genres
            java.util.List<java.lang.Integer> r1 = r6.genres
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            int r0 = r5.category
            int r1 = r6.category
            if (r0 != r1) goto L_0x00a1
            java.lang.Long r0 = r5.parentId
            java.lang.Long r1 = r6.parentId
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            double r0 = r5.criticsRating
            double r2 = r6.criticsRating
            int r0 = java.lang.Double.compare(r0, r2)
            if (r0 != 0) goto L_0x00a1
            java.util.List<io.stashteam.stashapp.data.network.model.PlatformApiModel> r0 = r5.platforms
            java.util.List<io.stashteam.stashapp.data.network.model.PlatformApiModel> r1 = r6.platforms
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r5.summary
            java.lang.String r1 = r6.summary
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.util.List<io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel> r0 = r5.involvedCompanies
            java.util.List<io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel> r1 = r6.involvedCompanies
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.util.List<io.stashteam.stashapp.data.network.model.VideoApiModel> r0 = r5.videos
            java.util.List<io.stashteam.stashapp.data.network.model.VideoApiModel> r1 = r6.videos
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.util.List<io.stashteam.stashapp.data.network.model.ImageApiModel> r0 = r5.screenshots
            java.util.List<io.stashteam.stashapp.data.network.model.ImageApiModel> r1 = r6.screenshots
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            io.stashteam.stashapp.data.network.model.SeriesApiModel r0 = r5.series
            io.stashteam.stashapp.data.network.model.SeriesApiModel r1 = r6.series
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.util.List<java.lang.Long> r0 = r5.expansions
            java.util.List<java.lang.Long> r1 = r6.expansions
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x00a1
            java.util.List<java.lang.Long> r0 = r5.dlcs
            java.util.List<java.lang.Long> r6 = r6.dlcs
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r6 = 0
            return r6
        L_0x00a3:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.DetailGameApiModel.equals(java.lang.Object):boolean");
    }

    public final int getCategory() {
        return this.category;
    }

    public final ImageApiModel getCover() {
        return this.cover;
    }

    public final double getCriticsRating() {
        return this.criticsRating;
    }

    public final List<Long> getDlcs() {
        return this.dlcs;
    }

    public final List<Long> getExpansions() {
        return this.expansions;
    }

    public final long getFirstReleaseDate() {
        return this.firstReleaseDate;
    }

    public final List<Integer> getGenres() {
        return this.genres;
    }

    public final long getId() {
        return this.f13492id;
    }

    public final List<InvolvedCompanyApiModel> getInvolvedCompanies() {
        return this.involvedCompanies;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getParentId() {
        return this.parentId;
    }

    public final List<PlatformApiModel> getPlatforms() {
        return this.platforms;
    }

    public final List<ImageApiModel> getScreenshots() {
        return this.screenshots;
    }

    public final SeriesApiModel getSeries() {
        return this.series;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<VideoApiModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13492id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        ImageApiModel imageApiModel = this.cover;
        int hashCode2 = (((hashCode + (imageApiModel != null ? imageApiModel.hashCode() : 0)) * 31) + C3085d.m12547a(this.firstReleaseDate)) * 31;
        List<Integer> list = this.genres;
        int hashCode3 = (((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.category) * 31;
        Long l = this.parentId;
        int hashCode4 = (((hashCode3 + (l != null ? l.hashCode() : 0)) * 31) + Double.doubleToLongBits(this.criticsRating)) * 31;
        List<PlatformApiModel> list2 = this.platforms;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.summary;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<InvolvedCompanyApiModel> list3 = this.involvedCompanies;
        int hashCode7 = (hashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<VideoApiModel> list4 = this.videos;
        int hashCode8 = (hashCode7 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<ImageApiModel> list5 = this.screenshots;
        int hashCode9 = (hashCode8 + (list5 != null ? list5.hashCode() : 0)) * 31;
        SeriesApiModel seriesApiModel = this.series;
        int hashCode10 = (hashCode9 + (seriesApiModel != null ? seriesApiModel.hashCode() : 0)) * 31;
        List<Long> list6 = this.expansions;
        int hashCode11 = (hashCode10 + (list6 != null ? list6.hashCode() : 0)) * 31;
        List<Long> list7 = this.dlcs;
        if (list7 != null) {
            i = list7.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetailGameApiModel(id=");
        sb.append(this.f13492id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", firstReleaseDate=");
        sb.append(this.firstReleaseDate);
        sb.append(", genres=");
        sb.append(this.genres);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", parentId=");
        sb.append(this.parentId);
        sb.append(", criticsRating=");
        sb.append(this.criticsRating);
        sb.append(", platforms=");
        sb.append(this.platforms);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", involvedCompanies=");
        sb.append(this.involvedCompanies);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", screenshots=");
        sb.append(this.screenshots);
        sb.append(", series=");
        sb.append(this.series);
        sb.append(", expansions=");
        sb.append(this.expansions);
        sb.append(", dlcs=");
        sb.append(this.dlcs);
        sb.append(")");
        return sb.toString();
    }
}
