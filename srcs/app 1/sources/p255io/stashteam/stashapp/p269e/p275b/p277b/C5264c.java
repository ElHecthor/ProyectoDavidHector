package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.Date;
import p255io.stashteam.stashapp.data.network.model.GameReviewApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5308n;
import p255io.stashteam.stashapp.p269e.p280c.C5318v;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.e.b.b.c */
public final class C5264c implements C5257a<GameReviewApiModel, C5306l> {
    /* renamed from: a */
    public Object mo14344a(GameReviewApiModel gameReviewApiModel, C5866d<? super C5306l> dVar) {
        C5306l lVar = new C5306l(gameReviewApiModel.getComment(), C5318v.f13971k.mo15001a(gameReviewApiModel.getRating()), C5308n.valueOf(gameReviewApiModel.getStatus()), gameReviewApiModel.getCompleted(), new Date(gameReviewApiModel.getModificationDate() * ((long) 1000)));
        return lVar;
    }
}
