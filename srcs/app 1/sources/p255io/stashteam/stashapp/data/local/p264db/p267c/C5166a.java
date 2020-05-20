package p255io.stashteam.stashapp.data.local.p264db.p267c;

import java.util.List;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a;
import p255io.stashteam.stashapp.data.network.model.CustomListApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.data.local.db.c.a */
public final class C5166a implements C5257a<CustomListApiModel, C5175a> {
    /* renamed from: a */
    public Object mo14344a(CustomListApiModel customListApiModel, C5866d<? super C5175a> dVar) {
        C5175a aVar = new C5175a(customListApiModel.getId(), customListApiModel.getTitle(), customListApiModel.getDescription(), customListApiModel.getGamesCount(), customListApiModel.isClosed(), customListApiModel.getCreationDate(), customListApiModel.getViewConfiguration().getItemColor());
        return aVar;
    }

    /* renamed from: a */
    public Object mo14345a(List<CustomListApiModel> list, C5866d<? super List<C5175a>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
