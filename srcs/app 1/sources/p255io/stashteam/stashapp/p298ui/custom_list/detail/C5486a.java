package p255io.stashteam.stashapp.p298ui.custom_list.detail;

import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3497e;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5207c;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5218g;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5225k;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5333a;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5336b;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p255io.stashteam.stashapp.utils.p305g.C5717c;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.custom_list.detail.a */
public final class C5486a extends C5345a {

    /* renamed from: g */
    private final C5336b<C5323z, C5212e, C5213a> f14326g;

    /* renamed from: h */
    private final LiveData<C3503h<C5323z>> f14327h;

    /* renamed from: i */
    private final LiveData<C5297f> f14328i;

    /* renamed from: j */
    private final LiveData<C5313r> f14329j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f14330k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f14331l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C5207c f14332m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C5225k f14333n;

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.a$a */
    public static final class C5487a<I, O> implements C3151a<C5297f, C5297f> {

        /* renamed from: a */
        final /* synthetic */ C5486a f14334a;

        public C5487a(C5486a aVar) {
            this.f14334a = aVar;
        }

        /* renamed from: a */
        public final C5297f mo10143a(C5297f fVar) {
            C5297f fVar2 = fVar;
            if (this.f14334a.f14330k != 0) {
                int b = this.f14334a.f14330k;
                if (fVar2 == null || b != fVar2.mo14902c()) {
                    this.f14334a.m21190j();
                }
            }
            this.f14334a.f14330k = fVar2 != null ? fVar2.mo14902c() : 0;
            return fVar2;
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailViewModel$deleteCustomList$1", mo15594f = "CustomListDetailViewModel.kt", mo15595l = {52}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.a$b */
    static final class C5488b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14335j;

        /* renamed from: k */
        Object f14336k;

        /* renamed from: l */
        int f14337l;

        /* renamed from: m */
        final /* synthetic */ C5486a f14338m;

        C5488b(C5486a aVar, C5866d dVar) {
            this.f14338m = aVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14337l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14335j;
                C5207c a2 = this.f14338m.f14332m;
                long c = this.f14338m.f14331l;
                this.f14336k = g0Var;
                this.f14337l = 1;
                if (a2.mo14744a(c, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14336k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5488b bVar = new C5488b(this.f14338m, dVar);
            bVar.f14335j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5488b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.a$c */
    static final class C5489c<I, O> implements C3151a<X, LiveData<Y>> {

        /* renamed from: a */
        public static final C5489c f14339a = new C5489c();

        C5489c() {
        }

        /* renamed from: a */
        public final LiveData<C5313r> mo10143a(C5333a<C5323z, C5212e, C5213a> aVar) {
            return aVar.mo15034e();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailViewModel$updateCustomList$1", mo15594f = "CustomListDetailViewModel.kt", mo15595l = {58}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.a$d */
    static final class C5490d extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14340j;

        /* renamed from: k */
        Object f14341k;

        /* renamed from: l */
        int f14342l;

        /* renamed from: m */
        final /* synthetic */ C5486a f14343m;

        /* renamed from: n */
        final /* synthetic */ C5297f f14344n;

        C5490d(C5486a aVar, C5297f fVar, C5866d dVar) {
            this.f14343m = aVar;
            this.f14344n = fVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14342l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14340j;
                C5225k d = this.f14343m.f14333n;
                C5297f fVar = this.f14344n;
                this.f14341k = g0Var;
                this.f14342l = 1;
                if (d.mo14718a(fVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14341k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5490d dVar2 = new C5490d(this.f14343m, this.f14344n, dVar);
            dVar2.f14340j = (C6089g0) obj;
            return dVar2;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5490d) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5486a(long j, C5207c cVar, C5225k kVar, C5212e eVar, C5218g gVar) {
        C5942k.m22327b(cVar, "deleteCustomListInteractor");
        C5942k.m22327b(kVar, "updateCustomListInteractor");
        C5942k.m22327b(eVar, "getCustomListGamesInteractor");
        C5942k.m22327b(gVar, "getOwnCustomListInteractor");
        this.f14331l = j;
        this.f14332m = cVar;
        this.f14333n = kVar;
        C5336b<C5323z, C5212e, C5213a> bVar = new C5336b<>(mo15050e(), eVar, new C5213a(this.f14331l, 20, 0));
        this.f14326g = bVar;
        LiveData<C3503h<C5323z>> a = new C3497e(bVar, C5717c.f14802b.mo15355a()).mo11139a();
        C5942k.m22324a((Object) a, "LivePagedListBuilder(\n  …dListConfig\n    ).build()");
        this.f14327h = a;
        LiveData<C5297f> a2 = C0544z.m2797a(gVar.mo14768a(this.f14331l), new C5487a(this));
        C5942k.m22324a((Object) a2, "Transformations.map(this) { transform(it) }");
        this.f14328i = a2;
        LiveData<C5313r> b = C0544z.m2798b(this.f14326g.mo15036b(), C5489c.f14339a);
        C5942k.m22324a((Object) b, "Transformations.switchMa…ce) { it.initialLoading }");
        this.f14329j = b;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m21190j() {
        C5333a aVar = (C5333a) this.f14326g.mo15036b().mo2974a();
        if (aVar != null) {
            aVar.mo11127a();
        }
    }

    /* renamed from: a */
    public final void mo15131a(C5297f fVar) {
        C5942k.m22327b(fVar, "customList");
        C5345a.m20868a(this, null, false, new C5490d(this, fVar, null), 3, null);
    }

    /* renamed from: f */
    public final void mo15132f() {
        C5345a.m20868a(this, null, false, new C5488b(this, null), 3, null);
    }

    /* renamed from: g */
    public final LiveData<C5297f> mo15133g() {
        return this.f14328i;
    }

    /* renamed from: h */
    public final LiveData<C3503h<C5323z>> mo15134h() {
        return this.f14327h;
    }

    /* renamed from: i */
    public final LiveData<C5313r> mo15135i() {
        return this.f14329j;
    }
}
