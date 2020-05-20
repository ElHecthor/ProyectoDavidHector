package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.List;
import p255io.stashteam.stashapp.data.network.model.SeriesApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p280c.C5322y;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.e.b.b.h */
public final class C5270h implements C5257a<SeriesApiModel, C5322y> {
    /* renamed from: a */
    public Object mo14344a(SeriesApiModel seriesApiModel, C5866d<? super C5322y> dVar) {
        long id = seriesApiModel.getId();
        String name = seriesApiModel.getName();
        List gameIds = seriesApiModel.getGameIds();
        if (gameIds == null) {
            gameIds = C5837l.m22159a();
        }
        return new C5322y(id, name, gameIds);
    }
}
