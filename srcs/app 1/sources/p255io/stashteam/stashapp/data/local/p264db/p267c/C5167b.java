package p255io.stashteam.stashapp.data.local.p264db.p267c;

import p255io.stashteam.stashapp.data.local.p264db.p268d.C5176b;
import p255io.stashteam.stashapp.data.network.model.GameReviewApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.data.local.db.c.b */
public final class C5167b implements C5257a<GameReviewApiModel, C5176b> {
    /* renamed from: a */
    public Object mo14344a(GameReviewApiModel gameReviewApiModel, C5866d<? super C5176b> dVar) {
        C5176b bVar = new C5176b(gameReviewApiModel.getComment(), gameReviewApiModel.getRating(), gameReviewApiModel.getStatus(), gameReviewApiModel.getCompleted(), gameReviewApiModel.getPlaying(), gameReviewApiModel.getModificationDate());
        return bVar;
    }
}
