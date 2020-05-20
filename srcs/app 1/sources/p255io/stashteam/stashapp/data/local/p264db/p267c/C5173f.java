package p255io.stashteam.stashapp.data.local.p264db.p267c;

import p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e;
import p255io.stashteam.stashapp.data.network.model.StatisticApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.data.local.db.c.f */
public final class C5173f implements C5257a<StatisticApiModel, C5179e> {
    /* renamed from: a */
    public Object mo14344a(StatisticApiModel statisticApiModel, C5866d<? super C5179e> dVar) {
        C5179e eVar = new C5179e(statisticApiModel.getPlayedCount(), statisticApiModel.getPlayingCount(), statisticApiModel.getWantCount(), statisticApiModel.getPoints(), statisticApiModel.getRank());
        return eVar;
    }
}
