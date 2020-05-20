package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.CompanyApiModel */
public final class CompanyApiModel {
    @C4514c("id")

    /* renamed from: id */
    private final long f13490id;
    @C4514c("name")
    private final String name;

    public CompanyApiModel(long j, String str) {
        C5942k.m22327b(str, "name");
        this.f13490id = j;
        this.name = str;
    }

    public static /* synthetic */ CompanyApiModel copy$default(CompanyApiModel companyApiModel, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = companyApiModel.f13490id;
        }
        if ((i & 2) != 0) {
            str = companyApiModel.name;
        }
        return companyApiModel.copy(j, str);
    }

    public final long component1() {
        return this.f13490id;
    }

    public final String component2() {
        return this.name;
    }

    public final CompanyApiModel copy(long j, String str) {
        C5942k.m22327b(str, "name");
        return new CompanyApiModel(j, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.name, (java.lang.Object) r6.name) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x001d
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.CompanyApiModel
            if (r0 == 0) goto L_0x001b
            io.stashteam.stashapp.data.network.model.CompanyApiModel r6 = (p255io.stashteam.stashapp.data.network.model.CompanyApiModel) r6
            long r0 = r5.f13490id
            long r2 = r6.f13490id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x001b
            java.lang.String r0 = r5.name
            java.lang.String r6 = r6.name
            boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
            if (r6 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r6 = 0
            return r6
        L_0x001d:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.CompanyApiModel.equals(java.lang.Object):boolean");
    }

    public final long getId() {
        return this.f13490id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13490id) * 31;
        String str = this.name;
        return a + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompanyApiModel(id=");
        sb.append(this.f13490id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }
}
