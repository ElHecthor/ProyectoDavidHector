package p255io.stashteam.stashapp.p298ui.game.list;

import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3497e;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5333a;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5336b;
import p255io.stashteam.stashapp.utils.p305g.C5717c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.list.c */
public final class C5576c extends C5574a {

    /* renamed from: i */
    private final C5336b<C5323z, C5236e, C5237a> f14520i;

    /* renamed from: j */
    private final LiveData<C3503h<C5323z>> f14521j;

    /* renamed from: k */
    private final LiveData<C5313r> f14522k;

    /* renamed from: l */
    private final C5305k f14523l;

    /* renamed from: m */
    private final Long f14524m;

    /* renamed from: io.stashteam.stashapp.ui.game.list.c$a */
    static final class C5577a<I, O> implements C3151a<X, LiveData<Y>> {

        /* renamed from: a */
        public static final C5577a f14525a = new C5577a();

        C5577a() {
        }

        /* renamed from: a */
        public final LiveData<C5313r> mo10143a(C5333a<C5323z, C5236e, C5237a> aVar) {
            return aVar.mo15034e();
        }
    }

    public C5576c(C5305k kVar, Long l, C5299h hVar, C5236e eVar) {
        C5942k.m22327b(kVar, "listType");
        C5942k.m22327b(eVar, "getGameListInteractor");
        super(hVar);
        this.f14523l = kVar;
        this.f14524m = l;
        C5336b<C5323z, C5236e, C5237a> bVar = new C5336b<>(mo15050e(), eVar, m21400b(hVar));
        this.f14520i = bVar;
        LiveData<C3503h<C5323z>> a = new C3497e(bVar, C5717c.f14802b.mo15355a()).mo11139a();
        C5942k.m22324a((Object) a, "LivePagedListBuilder(dat….pagedListConfig).build()");
        this.f14521j = a;
        LiveData<C5313r> b = C0544z.m2798b(this.f14520i.mo15036b(), C5577a.f14525a);
        C5942k.m22324a((Object) b, "Transformations.switchMa…ce) { it.initialLoading }");
        this.f14522k = b;
    }

    /* renamed from: b */
    private final C5237a m21400b(C5299h hVar) {
        C5237a aVar = new C5237a(this.f14523l, 0, 20, hVar, this.f14524m);
        return aVar;
    }

    /* renamed from: a */
    public void mo15080a(C5299h hVar) {
        C5942k.m22327b(hVar, "data");
        super.mo15080a(hVar);
        this.f14520i.mo15035a(m21400b(hVar));
        C5333a aVar = (C5333a) this.f14520i.mo15036b().mo2974a();
        if (aVar != null) {
            aVar.mo11127a();
        }
    }

    /* renamed from: g */
    public LiveData<C3503h<C5323z>> mo15081g() {
        return this.f14521j;
    }

    /* renamed from: h */
    public LiveData<C5313r> mo15082h() {
        return this.f14522k;
    }

    /* renamed from: i */
    public void mo15083i() {
        super.mo15083i();
        this.f14520i.mo15035a(m21400b(null));
        C5333a aVar = (C5333a) this.f14520i.mo15036b().mo2974a();
        if (aVar != null) {
            aVar.mo11127a();
        }
    }
}
