package p255io.stashteam.stashapp.p281f.p292d.p293d;

import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5181a;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p292d.C5417a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.d.d.a */
public final class C5427a extends C5417a {

    /* renamed from: g */
    private final LiveData<C5294d0> f14197g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5194h f14198h;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.profile.own.OwnProfileViewModel$1", mo15594f = "OwnProfileViewModel.kt", mo15595l = {20}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.d.d.a$a */
    static final class C5428a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14199j;

        /* renamed from: k */
        Object f14200k;

        /* renamed from: l */
        int f14201l;

        /* renamed from: m */
        final /* synthetic */ C5427a f14202m;

        C5428a(C5427a aVar, C5866d dVar) {
            this.f14202m = aVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14201l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14199j;
                C5194h a2 = this.f14202m.f14198h;
                this.f14200k = g0Var;
                this.f14201l = 1;
                if (a2.mo14728a(this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14200k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5428a aVar = new C5428a(this.f14202m, dVar);
            aVar.f14199j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5428a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5427a(C5194h hVar, C5181a aVar) {
        C5942k.m22327b(hVar, "syncAccountInteractor");
        C5942k.m22327b(aVar, "getAccountInteractor");
        this.f14198h = hVar;
        this.f14197g = aVar.mo14715a();
        C6088g.m22903b(mo15050e(), null, null, new C5428a(this, null), 3, null);
    }

    /* renamed from: f */
    public LiveData<C5294d0> mo15095f() {
        return this.f14197g;
    }
}
