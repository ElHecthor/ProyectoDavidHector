package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.List;
import p255io.stashteam.stashapp.data.network.model.PlatformApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5317u;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.e.b.b.f */
public final class C5267f implements C5257a<PlatformApiModel, C5317u> {
    /* renamed from: a */
    public Object mo14344a(PlatformApiModel platformApiModel, C5866d<? super C5317u> dVar) {
        long id = platformApiModel.getId();
        String name = platformApiModel.getName();
        String abbreviation = platformApiModel.getAbbreviation();
        if (abbreviation == null) {
            abbreviation = platformApiModel.getName();
        }
        return new C5317u(id, name, abbreviation);
    }

    /* renamed from: a */
    public Object mo14837a(List<PlatformApiModel> list, C5866d<? super List<C5317u>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
