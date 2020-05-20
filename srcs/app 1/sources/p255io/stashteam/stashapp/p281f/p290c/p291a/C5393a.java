package p255io.stashteam.stashapp.p281f.p290c.p291a;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3500f;
import p071f.p131r.C3503h;
import p071f.p131r.C3503h.C3506c;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5232c;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5242h;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5242h.C5243a;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5245i;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a;
import p255io.stashteam.stashapp.p269e.p280c.C5288b0;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5314s;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p298ui.game.list.C5574a;
import p255io.stashteam.stashapp.utils.p305g.C5717c;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.c.a.a */
public final class C5393a extends C5574a {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C5394a f14129i = new C5394a(this);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0532t<C5313r> f14130j = new C0532t<>();

    /* renamed from: k */
    private final LiveData<C3503h<C5323z>> f14131k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C5305k f14132l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C5250k f14133m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C5245i f14134n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C5232c f14135o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C5242h f14136p;

    /* renamed from: io.stashteam.stashapp.f.c.a.a$a */
    public static final class C5394a extends C3506c<C5323z> {

        /* renamed from: a */
        final /* synthetic */ C5393a f14137a;

        C5394a(C5393a aVar) {
            this.f14137a = aVar;
        }

        /* renamed from: a */
        public void mo11164a() {
            super.mo11164a();
            this.f14137a.m20994k();
        }

        /* renamed from: a */
        public void mo11165a(C5323z zVar) {
            C5942k.m22327b(zVar, "itemAtEnd");
            super.mo11165a(zVar);
            this.f14137a.m20994k();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.profile_list.OwnGameListViewModel$clearGames$1", mo15594f = "OwnGameListViewModel.kt", mo15595l = {80}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.c.a.a$b */
    static final class C5395b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14138j;

        /* renamed from: k */
        Object f14139k;

        /* renamed from: l */
        int f14140l;

        /* renamed from: m */
        final /* synthetic */ C5393a f14141m;

        C5395b(C5393a aVar, C5866d dVar) {
            this.f14141m = aVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14140l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14138j;
                C5232c b = this.f14141m.f14135o;
                C5305k e = this.f14141m.f14132l;
                this.f14139k = g0Var;
                this.f14140l = 1;
                if (b.mo14718a(e, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14139k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5395b bVar = new C5395b(this.f14141m, dVar);
            bVar.f14138j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5395b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.a$c */
    static final class C5396c<I, O> implements C3151a<X, LiveData<Y>> {

        /* renamed from: a */
        final /* synthetic */ C5393a f14142a;

        C5396c(C5393a aVar) {
            this.f14142a = aVar;
        }

        /* renamed from: a */
        public final LiveData<C3503h<C5323z>> mo10143a(C5299h hVar) {
            C5242h c = this.f14142a.f14136p;
            C5305k e = this.f14142a.f14132l;
            C5942k.m22324a((Object) hVar, "data");
            return C3500f.m14318a(c.mo14794a(new C5243a(e, hVar)), C5717c.f14802b.mo15355a(), null, this.f14142a.f14129i, null, 10, null);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.profile_list.OwnGameListViewModel$loadGames$1", mo15594f = "OwnGameListViewModel.kt", mo15595l = {59, 69}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.c.a.a$d */
    static final class C5397d extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14143j;

        /* renamed from: k */
        Object f14144k;

        /* renamed from: l */
        Object f14145l;

        /* renamed from: m */
        int f14146m;

        /* renamed from: n */
        int f14147n;

        /* renamed from: o */
        final /* synthetic */ C5393a f14148o;

        C5397d(C5393a aVar, C5866d dVar) {
            this.f14148o = aVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            int i;
            C0532t tVar;
            C5313r rVar;
            C6089g0 g0Var;
            Object a = C5885d.m22250a();
            int i2 = this.f14147n;
            if (i2 == 0) {
                C5806n.m22054a(obj);
                g0Var = this.f14143j;
                C5245i d = this.f14148o.f14134n;
                C5305k e = this.f14148o.f14132l;
                this.f14144k = g0Var;
                this.f14147n = 1;
                obj = d.mo14718a(e, (C5866d<? super Integer>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i2 == 1) {
                g0Var = (C6089g0) this.f14144k;
                C5806n.m22054a(obj);
            } else if (i2 == 2) {
                C5251a aVar = (C5251a) this.f14145l;
                i = this.f14146m;
                C6089g0 g0Var2 = (C6089g0) this.f14144k;
                C5806n.m22054a(obj);
                C5314s sVar = (C5314s) obj;
                if (i == 0 || sVar.mo14987a() != 0) {
                    tVar = this.f14148o.f14130j;
                    rVar = C5313r.SUCCESS;
                } else {
                    tVar = this.f14148o.f14130j;
                    rVar = C5313r.EMPTY_LIST;
                }
                tVar.mo2981b(rVar);
                return C5812t.f14872a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = ((Number) obj).intValue();
            if (intValue == 0) {
                this.f14148o.f14130j.mo2981b(C5313r.LOADING);
            }
            C5305k e2 = this.f14148o.f14132l;
            C5299h hVar = (C5299h) this.f14148o.mo15212f().mo2974a();
            if (hVar == null) {
                hVar = new C5299h(null, null, null, null, null, 31, null);
            }
            C5251a aVar2 = new C5251a(e2, hVar, 20, intValue);
            C5250k f = this.f14148o.f14133m;
            this.f14144k = g0Var;
            this.f14146m = intValue;
            this.f14145l = aVar2;
            this.f14147n = 2;
            Object a2 = f.mo14718a(aVar2, (C5866d<? super C5314s>) this);
            if (a2 == a) {
                return a;
            }
            i = intValue;
            obj = a2;
            C5314s sVar2 = (C5314s) obj;
            if (i == 0) {
            }
            tVar = this.f14148o.f14130j;
            rVar = C5313r.SUCCESS;
            tVar.mo2981b(rVar);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5397d dVar2 = new C5397d(this.f14148o, dVar);
            dVar2.f14143j = (C6089g0) obj;
            return dVar2;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5397d) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5393a(C5305k kVar, C5250k kVar2, C5245i iVar, C5232c cVar, C5242h hVar) {
        C5942k.m22327b(kVar, "listType");
        C5942k.m22327b(kVar2, "loadOwnGameListInteractor");
        C5942k.m22327b(iVar, "getOwnGamesCountInteractor");
        C5942k.m22327b(cVar, "deleteUserGamesInteractor");
        C5942k.m22327b(hVar, "getOwnGameListInteractor");
        C5299h hVar2 = new C5299h(null, null, null, null, C5288b0.ADDED_DATE, 15, null);
        super(hVar2);
        this.f14132l = kVar;
        this.f14133m = kVar2;
        this.f14134n = iVar;
        this.f14135o = cVar;
        this.f14136p = hVar;
        LiveData<C3503h<C5323z>> b = C0544z.m2798b(mo15212f(), new C5396c(this));
        C5942k.m22324a((Object) b, "Transformations.switchMa…= boundaryCallBack)\n    }");
        this.f14131k = b;
    }

    /* renamed from: j */
    private final void m20993j() {
        C6088g.m22903b(mo15050e(), null, null, new C5395b(this, null), 3, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m20994k() {
        C6088g.m22903b(mo15050e(), null, null, new C5397d(this, null), 3, null);
    }

    /* renamed from: a */
    public void mo15080a(C5299h hVar) {
        C5942k.m22327b(hVar, "data");
        super.mo15080a(hVar);
        m20993j();
    }

    /* renamed from: g */
    public LiveData<C3503h<C5323z>> mo15081g() {
        return this.f14131k;
    }

    /* renamed from: h */
    public LiveData<C5313r> mo15082h() {
        return this.f14130j;
    }

    /* renamed from: i */
    public void mo15083i() {
        super.mo15083i();
        m20993j();
    }
}
