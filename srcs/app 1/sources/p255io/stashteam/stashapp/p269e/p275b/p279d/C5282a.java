package p255io.stashteam.stashapp.p269e.p275b.p279d;

import p255io.stashteam.stashapp.data.network.model.ViewConfigurationApiModel;
import p255io.stashteam.stashapp.data.network.request.ChangeCustomListRequest;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5887b;

/* renamed from: io.stashteam.stashapp.e.b.d.a */
public final class C5282a implements C5257a<C5297f, ChangeCustomListRequest> {
    /* renamed from: a */
    public Object mo14344a(C5297f fVar, C5866d<? super ChangeCustomListRequest> dVar) {
        ChangeCustomListRequest changeCustomListRequest = new ChangeCustomListRequest(fVar.mo14903d() == 0 ? null : C5887b.m22261a(fVar.mo14903d()), fVar.mo14904e(), fVar.mo14901b(), fVar.mo14906f(), new ViewConfigurationApiModel(fVar.mo14899a()));
        return changeCustomListRequest;
    }
}
