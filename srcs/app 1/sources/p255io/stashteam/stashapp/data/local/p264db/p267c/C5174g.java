package p255io.stashteam.stashapp.data.local.p264db.p267c;

import p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f;
import p255io.stashteam.stashapp.data.network.model.ExternalIdApiModel;
import p255io.stashteam.stashapp.data.network.model.UserApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p308k.p316w.C5866d;

/* renamed from: io.stashteam.stashapp.data.local.db.c.g */
public final class C5174g implements C5257a<UserApiModel, C5180f> {
    /* renamed from: a */
    public Object mo14344a(UserApiModel userApiModel, C5866d<? super C5180f> dVar) {
        long id = userApiModel.getId();
        String login = userApiModel.getLogin();
        String fullName = userApiModel.getFullName();
        String email = userApiModel.getEmail();
        String imageUrl = userApiModel.getImageUrl();
        ExternalIdApiModel externalId = userApiModel.getExternalId();
        C5180f fVar = new C5180f(id, login, fullName, email, imageUrl, null, externalId != null ? externalId.getType() : null, userApiModel.isClosed());
        return fVar;
    }
}
