package p255io.stashteam.stashapp.p269e.p275b.p277b;

import p255io.stashteam.stashapp.data.network.model.StatisticApiModel;
import p255io.stashteam.stashapp.p269e.p280c.C5292c0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.b.j */
public final class C5273j {
    /* renamed from: a */
    public C5292c0 mo14843a(StatisticApiModel statisticApiModel) {
        C5942k.m22327b(statisticApiModel, "from");
        C5292c0 c0Var = new C5292c0(statisticApiModel.getPlayedCount(), statisticApiModel.getPlayingCount(), statisticApiModel.getWantCount(), statisticApiModel.getPoints(), statisticApiModel.getRank());
        return c0Var;
    }
}
