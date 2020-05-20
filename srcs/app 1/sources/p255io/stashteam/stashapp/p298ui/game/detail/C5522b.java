package p255io.stashteam.stashapp.p298ui.game.detail;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlinx.coroutines.C6089g0;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5181a;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5203a;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5210a;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5234d;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5240g;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5307m;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5887b;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.b */
public final class C5522b extends C5345a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0532t<C5298g> f14392g = new C0532t<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0532t<C5307m> f14393h = new C0532t<>();

    /* renamed from: i */
    private final LiveData<C5294d0> f14394i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0532t<Boolean> f14395j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C0532t<List<C5297f>> f14396k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f14397l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C5234d f14398m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C5240g f14399n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C5227a f14400o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C5230b f14401p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C5215f f14402q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C5202a f14403r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C5209d f14404s;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$addGameToCustomList$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {74}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$a */
    static final class C5523a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14405j;

        /* renamed from: k */
        Object f14406k;

        /* renamed from: l */
        int f14407l;

        /* renamed from: m */
        final /* synthetic */ C5522b f14408m;

        /* renamed from: n */
        final /* synthetic */ long f14409n;

        C5523a(C5522b bVar, long j, C5866d dVar) {
            this.f14408m = bVar;
            this.f14409n = j;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14407l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14405j;
                C5202a a2 = this.f14408m.f14403r;
                C5203a aVar = new C5203a(this.f14409n, this.f14408m.f14397l);
                this.f14406k = g0Var;
                this.f14407l = 1;
                if (a2.mo14718a(aVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14406k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f14408m.m21273l();
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5523a aVar = new C5523a(this.f14408m, this.f14409n, dVar);
            aVar.f14405j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5523a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$changeGameStatus$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {58}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$b */
    static final class C5524b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14410j;

        /* renamed from: k */
        Object f14411k;

        /* renamed from: l */
        Object f14412l;

        /* renamed from: m */
        Object f14413m;

        /* renamed from: n */
        int f14414n;

        /* renamed from: o */
        final /* synthetic */ C5522b f14415o;

        /* renamed from: p */
        final /* synthetic */ C5306l f14416p;

        C5524b(C5522b bVar, C5306l lVar, C5866d dVar) {
            this.f14415o = bVar;
            this.f14416p = lVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14414n;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14410j;
                this.f14415o.f14395j.mo2981b(C5887b.m22259a(true));
                C5228a aVar = new C5228a(this.f14415o.f14397l, this.f14416p);
                C0532t k = this.f14415o.f14392g;
                C5227a b = this.f14415o.f14400o;
                this.f14411k = g0Var;
                this.f14412l = aVar;
                this.f14413m = k;
                this.f14414n = 1;
                obj = b.mo14718a(aVar, (C5866d<? super C5298g>) this);
                if (obj == a) {
                    return a;
                }
                tVar = k;
            } else if (i == 1) {
                tVar = (C0532t) this.f14413m;
                C5228a aVar2 = (C5228a) this.f14412l;
                C6089g0 g0Var2 = (C6089g0) this.f14411k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar.mo2981b(obj);
            this.f14415o.f14395j.mo2981b(C5887b.m22259a(false));
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5524b bVar = new C5524b(this.f14415o, this.f14416p, dVar);
            bVar.f14410j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5524b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$deleteGameFromCustomList$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {83}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$c */
    static final class C5525c extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14417j;

        /* renamed from: k */
        Object f14418k;

        /* renamed from: l */
        int f14419l;

        /* renamed from: m */
        final /* synthetic */ C5522b f14420m;

        /* renamed from: n */
        final /* synthetic */ long f14421n;

        C5525c(C5522b bVar, long j, C5866d dVar) {
            this.f14420m = bVar;
            this.f14421n = j;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14419l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14417j;
                C5209d c = this.f14420m.f14404s;
                C5210a aVar = new C5210a(this.f14421n, this.f14420m.f14397l);
                this.f14418k = g0Var;
                this.f14419l = 1;
                if (c.mo14718a(aVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14418k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f14420m.m21273l();
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5525c cVar = new C5525c(this.f14420m, this.f14421n, dVar);
            cVar.f14417j = (C6089g0) obj;
            return cVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5525c) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$deleteGameStatus$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {66}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$d */
    static final class C5526d extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14422j;

        /* renamed from: k */
        Object f14423k;

        /* renamed from: l */
        Object f14424l;

        /* renamed from: m */
        int f14425m;

        /* renamed from: n */
        final /* synthetic */ C5522b f14426n;

        C5526d(C5522b bVar, C5866d dVar) {
            this.f14426n = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14425m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14422j;
                this.f14426n.f14395j.mo2981b(C5887b.m22259a(true));
                C0532t k = this.f14426n.f14392g;
                C5230b d = this.f14426n.f14401p;
                long e = this.f14426n.f14397l;
                this.f14423k = g0Var;
                this.f14424l = k;
                this.f14425m = 1;
                obj = d.mo14780a(e, (C5866d<? super C5298g>) this);
                if (obj == a) {
                    return a;
                }
                tVar = k;
            } else if (i == 1) {
                tVar = (C0532t) this.f14424l;
                C6089g0 g0Var2 = (C6089g0) this.f14423k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar.mo2981b(obj);
            this.f14426n.f14395j.mo2981b(C5887b.m22259a(false));
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5526d dVar2 = new C5526d(this.f14426n, dVar);
            dVar2.f14422j = (C6089g0) obj;
            return dVar2;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5526d) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$loadCustomListsByGame$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {105}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$e */
    static final class C5527e extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14427j;

        /* renamed from: k */
        Object f14428k;

        /* renamed from: l */
        Object f14429l;

        /* renamed from: m */
        int f14430m;

        /* renamed from: n */
        final /* synthetic */ C5522b f14431n;

        C5527e(C5522b bVar, C5866d dVar) {
            this.f14431n = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14430m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14427j;
                C0532t j = this.f14431n.f14396k;
                C5215f f = this.f14431n.f14402q;
                StringBuilder sb = new StringBuilder();
                sb.append("game:");
                sb.append(this.f14431n.f14397l);
                sb.append(';');
                C5216a aVar = new C5216a(100, 0, sb.toString());
                this.f14428k = g0Var;
                this.f14429l = j;
                this.f14430m = 1;
                obj = f.mo14718a(aVar, (C5866d<? super List<C5297f>>) this);
                if (obj == a) {
                    return a;
                }
                tVar = j;
            } else if (i == 1) {
                tVar = (C0532t) this.f14429l;
                C6089g0 g0Var2 = (C6089g0) this.f14428k;
                try {
                    C5806n.m22054a(obj);
                } catch (Exception unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar.mo2981b(obj);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5527e eVar = new C5527e(this.f14431n, dVar);
            eVar.f14427j = (C6089g0) obj;
            return eVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5527e) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$loadGame$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {91}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$f */
    static final class C5528f extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14432j;

        /* renamed from: k */
        Object f14433k;

        /* renamed from: l */
        Object f14434l;

        /* renamed from: m */
        int f14435m;

        /* renamed from: n */
        final /* synthetic */ C5522b f14436n;

        C5528f(C5522b bVar, C5866d dVar) {
            this.f14436n = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14435m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14432j;
                C0532t k = this.f14436n.f14392g;
                C5234d g = this.f14436n.f14398m;
                long e = this.f14436n.f14397l;
                this.f14433k = g0Var;
                this.f14434l = k;
                this.f14435m = 1;
                obj = g.mo14782a(e, (C5866d<? super C5298g>) this);
                if (obj == a) {
                    return a;
                }
                tVar = k;
            } else if (i == 1) {
                tVar = (C0532t) this.f14434l;
                C6089g0 g0Var2 = (C6089g0) this.f14433k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar.mo2981b(obj);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5528f fVar = new C5528f(this.f14436n, dVar);
            fVar.f14432j = (C6089g0) obj;
            return fVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5528f) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.game.detail.GameDetailViewModel$loadGameStatistic$1", mo15594f = "GameDetailViewModel.kt", mo15595l = {97}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.game.detail.b$g */
    static final class C5529g extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14437j;

        /* renamed from: k */
        Object f14438k;

        /* renamed from: l */
        Object f14439l;

        /* renamed from: m */
        int f14440m;

        /* renamed from: n */
        final /* synthetic */ C5522b f14441n;

        C5529g(C5522b bVar, C5866d dVar) {
            this.f14441n = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14440m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14437j;
                C0532t l = this.f14441n.f14393h;
                C5240g h = this.f14441n.f14399n;
                long e = this.f14441n.f14397l;
                this.f14438k = g0Var;
                this.f14439l = l;
                this.f14440m = 1;
                obj = h.mo14793a(e, (C5866d<? super C5307m>) this);
                if (obj == a) {
                    return a;
                }
                tVar = l;
            } else if (i == 1) {
                tVar = (C0532t) this.f14439l;
                C6089g0 g0Var2 = (C6089g0) this.f14438k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar.mo2981b(obj);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5529g gVar = new C5529g(this.f14441n, dVar);
            gVar.f14437j = (C6089g0) obj;
            return gVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5529g) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5522b(long j, C5234d dVar, C5240g gVar, C5227a aVar, C5230b bVar, C5215f fVar, C5202a aVar2, C5209d dVar2, C5181a aVar3) {
        C5942k.m22327b(dVar, "getGameInteractor");
        C5942k.m22327b(gVar, "getGameStatisticInteractor");
        C5942k.m22327b(aVar, "changeStatusInteractor");
        C5942k.m22327b(bVar, "deleteStatusInteractor");
        C5942k.m22327b(fVar, "getCustomListsInteractor");
        C5942k.m22327b(aVar2, "addGameToCustomListInteractor");
        C5942k.m22327b(dVar2, "deleteGameFromCustomListInteractor");
        C5942k.m22327b(aVar3, "getAccountInteractor");
        this.f14397l = j;
        this.f14398m = dVar;
        this.f14399n = gVar;
        this.f14400o = aVar;
        this.f14401p = bVar;
        this.f14402q = fVar;
        this.f14403r = aVar2;
        this.f14404s = dVar2;
        this.f14394i = aVar3.mo14715a();
        this.f14395j = new C0532t<>();
        this.f14396k = new C0532t<>();
        m21274m();
        m21276n();
        m21273l();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m21273l() {
        C6088g.m22903b(mo15050e(), null, null, new C5527e(this, null), 3, null);
    }

    /* renamed from: m */
    private final void m21274m() {
        C5345a.m20868a(this, null, true, new C5528f(this, null), 1, null);
    }

    /* renamed from: n */
    private final void m21276n() {
        C5345a.m20868a(this, null, false, new C5529g(this, null), 3, null);
    }

    /* renamed from: a */
    public final void mo15159a(long j) {
        C5345a.m20868a(this, null, false, new C5523a(this, j, null), 3, null);
    }

    /* renamed from: a */
    public final void mo15160a(C5306l lVar) {
        C5942k.m22327b(lVar, "gameReview");
        C5345a.m20868a(this, null, false, new C5524b(this, lVar, null), 3, null);
    }

    /* renamed from: b */
    public final void mo15161b(long j) {
        C5345a.m20868a(this, null, false, new C5525c(this, j, null), 3, null);
    }

    /* renamed from: f */
    public final void mo15162f() {
        C5345a.m20868a(this, null, false, new C5526d(this, null), 3, null);
    }

    /* renamed from: g */
    public final LiveData<Boolean> mo15163g() {
        return this.f14395j;
    }

    /* renamed from: h */
    public final LiveData<List<C5297f>> mo15164h() {
        return this.f14396k;
    }

    /* renamed from: i */
    public final LiveData<C5298g> mo15165i() {
        return this.f14392g;
    }

    /* renamed from: j */
    public final LiveData<C5307m> mo15166j() {
        return this.f14393h;
    }

    /* renamed from: k */
    public final LiveData<C5294d0> mo15167k() {
        return this.f14394i;
    }
}
