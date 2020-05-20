package p255io.stashteam.stashapp.p269e.p275b.p277b;

import java.util.List;
import p255io.stashteam.stashapp.data.network.model.AccountDataApiModel;
import p255io.stashteam.stashapp.data.network.model.StatisticApiModel;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p308k.p316w.C5866d;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.b.k */
public final class C5274k implements C5257a<AccountDataApiModel, C5294d0> {

    /* renamed from: a */
    private final C5273j f13814a;

    public C5274k(C5273j jVar) {
        C5942k.m22327b(jVar, "statisticMapper");
        this.f13814a = jVar;
    }

    /* renamed from: a */
    public Object mo14344a(AccountDataApiModel accountDataApiModel, C5866d<? super C5294d0> dVar) {
        long id = accountDataApiModel.getUser().getId();
        String login = accountDataApiModel.getUser().getLogin();
        String fullName = accountDataApiModel.getUser().getFullName();
        if (fullName == null) {
            fullName = "";
        }
        String str = fullName;
        String email = accountDataApiModel.getUser().getEmail();
        String imageUrl = accountDataApiModel.getUser().getImageUrl();
        StatisticApiModel statistic = accountDataApiModel.getStatistic();
        C5294d0 d0Var = new C5294d0(id, login, str, email, imageUrl, statistic != null ? this.f13814a.mo14843a(statistic) : null, null, accountDataApiModel.getUser().isClosed());
        return d0Var;
    }

    /* renamed from: a */
    public Object mo14845a(List<AccountDataApiModel> list, C5866d<? super List<C5294d0>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
