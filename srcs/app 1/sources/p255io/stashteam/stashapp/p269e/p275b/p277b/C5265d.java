package p255io.stashteam.stashapp.p269e.p275b.p277b;

import p255io.stashteam.stashapp.data.network.model.GameStatisticApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p280c.C5307m;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.e.b.b.d */
public final class C5265d implements C5257a<GameStatisticApiModel, C5307m> {
    /* renamed from: a */
    public Object mo14344a(GameStatisticApiModel gameStatisticApiModel, C5866d<? super C5307m> dVar) {
        return new C5307m(gameStatisticApiModel.getWantCount(), gameStatisticApiModel.getPlayedCount(), gameStatisticApiModel.getReviewCount());
    }
}
