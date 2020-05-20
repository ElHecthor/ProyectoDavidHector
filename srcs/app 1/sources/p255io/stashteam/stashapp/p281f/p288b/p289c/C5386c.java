package p255io.stashteam.stashapp.p281f.p288b.p289c;

import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3497e;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
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

/* renamed from: io.stashteam.stashapp.f.b.c.c */
public final class C5386c extends C5345a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5336b<C5297f, C5215f, C5216a> f14100g;

    /* renamed from: h */
    private final LiveData<C3503h<C5297f>> f14101h;

    /* renamed from: i */
    private final LiveData<C5313r> f14102i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C5205b f14103j;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.custom_list.list.CustomListsViewModel$createNewCustomList$1", mo15594f = "CustomListsViewModel.kt", mo15595l = {35}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.b.c.c$a */
    static final class C5387a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14104j;

        /* renamed from: k */
        Object f14105k;

        /* renamed from: l */
        int f14106l;

        /* renamed from: m */
        final /* synthetic */ C5386c f14107m;

        /* renamed from: n */
        final /* synthetic */ C5297f f14108n;

        C5387a(C5386c cVar, C5297f fVar, C5866d dVar) {
            this.f14107m = cVar;
            this.f14108n = fVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14106l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14104j;
                C5205b a2 = this.f14107m.f14103j;
                C5297f fVar = this.f14108n;
                this.f14105k = g0Var;
                this.f14106l = 1;
                if (a2.mo14718a(fVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14105k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5333a aVar = (C5333a) this.f14107m.f14100g.mo15036b().mo2974a();
            if (aVar != null) {
                aVar.mo11127a();
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5387a aVar = new C5387a(this.f14107m, this.f14108n, dVar);
            aVar.f14104j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5387a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.c$b */
    static final class C5388b<I, O> implements C3151a<X, LiveData<Y>> {

        /* renamed from: a */
        public static final C5388b f14109a = new C5388b();

        C5388b() {
        }

        /* renamed from: a */
        public final LiveData<C5313r> mo10143a(C5333a<C5297f, C5215f, C5216a> aVar) {
            return aVar.mo15034e();
        }
    }

    public C5386c(C5205b bVar, C5215f fVar) {
        C5942k.m22327b(bVar, "createCustomListInteractor");
        C5942k.m22327b(fVar, "getCustomListsInteractor");
        this.f14103j = bVar;
        C6089g0 e = mo15050e();
        C5216a aVar = new C5216a(20, 0, null, 4, null);
        C5336b<C5297f, C5215f, C5216a> bVar2 = new C5336b<>(e, fVar, aVar);
        this.f14100g = bVar2;
        LiveData<C3503h<C5297f>> a = new C3497e(bVar2, C5717c.f14802b.mo15355a()).mo11139a();
        C5942k.m22324a((Object) a, "LivePagedListBuilder(\n  …dListConfig\n    ).build()");
        this.f14101h = a;
        LiveData<C5313r> b = C0544z.m2798b(this.f14100g.mo15036b(), C5388b.f14109a);
        C5942k.m22324a((Object) b, "Transformations.switchMa…ce) { it.initialLoading }");
        this.f14102i = b;
    }

    /* renamed from: a */
    public final void mo15072a(C5297f fVar) {
        C5942k.m22327b(fVar, "customList");
        C5345a.m20868a(this, null, false, new C5387a(this, fVar, null), 3, null);
    }

    /* renamed from: f */
    public final LiveData<C3503h<C5297f>> mo15073f() {
        return this.f14101h;
    }

    /* renamed from: g */
    public final LiveData<C5313r> mo15074g() {
        return this.f14102i;
    }
}
