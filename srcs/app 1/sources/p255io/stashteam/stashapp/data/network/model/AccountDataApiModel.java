package p255io.stashteam.stashapp.data.network.model;

import p147g.p156d.p204b.p206x.C4514c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.network.model.AccountDataApiModel */
public final class AccountDataApiModel {
    @C4514c("statistic")
    private final StatisticApiModel statistic;
    @C4514c("user")
    private final UserApiModel user;

    public AccountDataApiModel(UserApiModel userApiModel, StatisticApiModel statisticApiModel) {
        C5942k.m22327b(userApiModel, "user");
        this.user = userApiModel;
        this.statistic = statisticApiModel;
    }

    public /* synthetic */ AccountDataApiModel(UserApiModel userApiModel, StatisticApiModel statisticApiModel, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            statisticApiModel = null;
        }
        this(userApiModel, statisticApiModel);
    }

    public static /* synthetic */ AccountDataApiModel copy$default(AccountDataApiModel accountDataApiModel, UserApiModel userApiModel, StatisticApiModel statisticApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            userApiModel = accountDataApiModel.user;
        }
        if ((i & 2) != 0) {
            statisticApiModel = accountDataApiModel.statistic;
        }
        return accountDataApiModel.copy(userApiModel, statisticApiModel);
    }

    public final UserApiModel component1() {
        return this.user;
    }

    public final StatisticApiModel component2() {
        return this.statistic;
    }

    public final AccountDataApiModel copy(UserApiModel userApiModel, StatisticApiModel statisticApiModel) {
        C5942k.m22327b(userApiModel, "user");
        return new AccountDataApiModel(userApiModel, statisticApiModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.statistic, (java.lang.Object) r3.statistic) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.data.network.model.AccountDataApiModel
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.AccountDataApiModel r3 = (p255io.stashteam.stashapp.data.network.model.AccountDataApiModel) r3
            io.stashteam.stashapp.data.network.model.UserApiModel r0 = r2.user
            io.stashteam.stashapp.data.network.model.UserApiModel r1 = r3.user
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            io.stashteam.stashapp.data.network.model.StatisticApiModel r0 = r2.statistic
            io.stashteam.stashapp.data.network.model.StatisticApiModel r3 = r3.statistic
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.network.model.AccountDataApiModel.equals(java.lang.Object):boolean");
    }

    public final StatisticApiModel getStatistic() {
        return this.statistic;
    }

    public final UserApiModel getUser() {
        return this.user;
    }

    public int hashCode() {
        UserApiModel userApiModel = this.user;
        int i = 0;
        int hashCode = (userApiModel != null ? userApiModel.hashCode() : 0) * 31;
        StatisticApiModel statisticApiModel = this.statistic;
        if (statisticApiModel != null) {
            i = statisticApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountDataApiModel(user=");
        sb.append(this.user);
        sb.append(", statistic=");
        sb.append(this.statistic);
        sb.append(")");
        return sb.toString();
    }
}
