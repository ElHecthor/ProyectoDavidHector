package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.PlatformApiModel */
public final class PlatformApiModel {
    @C4514c("abbreviation")
    private final String abbreviation;
    @C4514c("id")

    /* renamed from: id */
    private final long f13495id;
    @C4514c("name")
    private final String name;

    public PlatformApiModel(long j, String str, String str2) {
        C5942k.m22327b(str, "name");
        this.f13495id = j;
        this.name = str;
        this.abbreviation = str2;
    }

    public static /* synthetic */ PlatformApiModel copy$default(PlatformApiModel platformApiModel, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = platformApiModel.f13495id;
        }
        if ((i & 2) != 0) {
            str = platformApiModel.name;
        }
        if ((i & 4) != 0) {
            str2 = platformApiModel.abbreviation;
        }
        return platformApiModel.copy(j, str, str2);
    }

    public final long component1() {
        return this.f13495id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.abbreviation;
    }

    public final PlatformApiModel copy(long j, String str, String str2) {
        C5942k.m22327b(str, "name");
        return new PlatformApiModel(j, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.abbreviation, (java.lang.Object) r6.abbreviation) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0027
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.PlatformApiModel
            if (r0 == 0) goto L_0x0025
            io.stashteam.stashapp.data.network.model.PlatformApiModel r6 = (p255io.stashteam.stashapp.data.network.model.PlatformApiModel) r6
            long r0 = r5.f13495id
            long r2 = r6.f13495id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = r5.name
            java.lang.String r1 = r6.name
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r5.abbreviation
            java.lang.String r6 = r6.abbreviation
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r6 = 0
            return r6
        L_0x0027:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.PlatformApiModel.equals(java.lang.Object):boolean");
    }

    public final String getAbbreviation() {
        return this.abbreviation;
    }

    public final long getId() {
        return this.f13495id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13495id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.abbreviation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlatformApiModel(id=");
        sb.append(this.f13495id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", abbreviation=");
        sb.append(this.abbreviation);
        sb.append(")");
        return sb.toString();
    }
}
