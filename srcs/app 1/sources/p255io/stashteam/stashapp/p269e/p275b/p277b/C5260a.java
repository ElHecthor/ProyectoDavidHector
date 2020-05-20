package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.List;
import p255io.stashteam.stashapp.data.network.model.CustomListApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.e.b.b.a */
public final class C5260a implements C5257a<CustomListApiModel, C5297f> {
    /* renamed from: a */
    public Object mo14344a(CustomListApiModel customListApiModel, C5866d<? super C5297f> dVar) {
        C5297f fVar = new C5297f(customListApiModel.getId(), customListApiModel.getTitle(), customListApiModel.getDescription(), customListApiModel.getGamesCount(), customListApiModel.isClosed(), customListApiModel.getViewConfiguration().getItemColor());
        return fVar;
    }

    /* renamed from: a */
    public Object mo14829a(List<CustomListApiModel> list, C5866d<? super List<C5297f>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
