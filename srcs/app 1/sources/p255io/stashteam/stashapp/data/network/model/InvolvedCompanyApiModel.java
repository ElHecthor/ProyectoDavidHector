package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel */
public final class InvolvedCompanyApiModel {
    @C4514c("company")
    private final CompanyApiModel company;
    @C4514c("developer")
    private final boolean developer;
    @C4514c("id")

    /* renamed from: id */
    private final long f13494id;
    @C4514c("porting")
    private final boolean porting;
    @C4514c("publisher")
    private final boolean publisher;
    @C4514c("supporting")
    private final boolean supporting;

    public InvolvedCompanyApiModel(long j, CompanyApiModel companyApiModel, boolean z, boolean z2, boolean z3, boolean z4) {
        C5942k.m22327b(companyApiModel, "company");
        this.f13494id = j;
        this.company = companyApiModel;
        this.developer = z;
        this.porting = z2;
        this.publisher = z3;
        this.supporting = z4;
    }

    public static /* synthetic */ InvolvedCompanyApiModel copy$default(InvolvedCompanyApiModel involvedCompanyApiModel, long j, CompanyApiModel companyApiModel, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        InvolvedCompanyApiModel involvedCompanyApiModel2 = involvedCompanyApiModel;
        return involvedCompanyApiModel.copy((i & 1) != 0 ? involvedCompanyApiModel2.f13494id : j, (i & 2) != 0 ? involvedCompanyApiModel2.company : companyApiModel, (i & 4) != 0 ? involvedCompanyApiModel2.developer : z, (i & 8) != 0 ? involvedCompanyApiModel2.porting : z2, (i & 16) != 0 ? involvedCompanyApiModel2.publisher : z3, (i & 32) != 0 ? involvedCompanyApiModel2.supporting : z4);
    }

    public final long component1() {
        return this.f13494id;
    }

    public final CompanyApiModel component2() {
        return this.company;
    }

    public final boolean component3() {
        return this.developer;
    }

    public final boolean component4() {
        return this.porting;
    }

    public final boolean component5() {
        return this.publisher;
    }

    public final boolean component6() {
        return this.supporting;
    }

    public final InvolvedCompanyApiModel copy(long j, CompanyApiModel companyApiModel, boolean z, boolean z2, boolean z3, boolean z4) {
        CompanyApiModel companyApiModel2 = companyApiModel;
        C5942k.m22327b(companyApiModel, "company");
        InvolvedCompanyApiModel involvedCompanyApiModel = new InvolvedCompanyApiModel(j, companyApiModel2, z, z2, z3, z4);
        return involvedCompanyApiModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r5.supporting == r6.supporting) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0035
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel
            if (r0 == 0) goto L_0x0033
            io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel r6 = (p255io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel) r6
            long r0 = r5.f13494id
            long r2 = r6.f13494id
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0033
            io.stashteam.stashapp.data.network.model.CompanyApiModel r0 = r5.company
            io.stashteam.stashapp.data.network.model.CompanyApiModel r1 = r6.company
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r5.developer
            boolean r1 = r6.developer
            if (r0 != r1) goto L_0x0033
            boolean r0 = r5.porting
            boolean r1 = r6.porting
            if (r0 != r1) goto L_0x0033
            boolean r0 = r5.publisher
            boolean r1 = r6.publisher
            if (r0 != r1) goto L_0x0033
            boolean r0 = r5.supporting
            boolean r6 = r6.supporting
            if (r0 != r6) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r6 = 0
            return r6
        L_0x0035:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.InvolvedCompanyApiModel.equals(java.lang.Object):boolean");
    }

    public final CompanyApiModel getCompany() {
        return this.company;
    }

    public final boolean getDeveloper() {
        return this.developer;
    }

    public final long getId() {
        return this.f13494id;
    }

    public final boolean getPorting() {
        return this.porting;
    }

    public final boolean getPublisher() {
        return this.publisher;
    }

    public final boolean getSupporting() {
        return this.supporting;
    }

    public int hashCode() {
        int a = C3085d.m12547a(this.f13494id) * 31;
        CompanyApiModel companyApiModel = this.company;
        int hashCode = (a + (companyApiModel != null ? companyApiModel.hashCode() : 0)) * 31;
        boolean z = this.developer;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.porting;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.publisher;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.supporting;
        if (!z4) {
            i = z4;
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvolvedCompanyApiModel(id=");
        sb.append(this.f13494id);
        sb.append(", company=");
        sb.append(this.company);
        sb.append(", developer=");
        sb.append(this.developer);
        sb.append(", porting=");
        sb.append(this.porting);
        sb.append(", publisher=");
        sb.append(this.publisher);
        sb.append(", supporting=");
        sb.append(this.supporting);
        sb.append(")");
        return sb.toString();
    }
}
