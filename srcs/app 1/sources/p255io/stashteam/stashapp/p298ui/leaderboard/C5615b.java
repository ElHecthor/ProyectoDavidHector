package p255io.stashteam.stashapp.p298ui.leaderboard;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlinx.coroutines.C6089g0;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3497e;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5181a;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5183b;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5333a;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5336b;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p255io.stashteam.stashapp.utils.p305g.C5716b;
import p255io.stashteam.stashapp.utils.p305g.C5717c;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5887b;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.leaderboard.b */
public final class C5615b extends C5345a {

    /* renamed from: g */
    private final C5336b<C5294d0, C5183b, C5716b> f14607g = new C5336b<>(mo15050e(), this.f14612l, new C5716b(20, 3));

    /* renamed from: h */
    private final LiveData<C5294d0> f14608h;

    /* renamed from: i */
    private final LiveData<C3503h<C5294d0>> f14609i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0532t<List<C5294d0>> f14610j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C0532t<Boolean> f14611k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C5183b f14612l;

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.b$a */
    public static final class C5616a {
        private C5616a() {
        }

        public /* synthetic */ C5616a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.b$b */
    static final class C5617b<I, O> implements C3151a<X, LiveData<Y>> {

        /* renamed from: a */
        public static final C5617b f14613a = new C5617b();

        C5617b() {
        }

        /* renamed from: a */
        public final LiveData<C5313r> mo10143a(C5333a<C5294d0, C5183b, C5716b> aVar) {
            return aVar.mo15034e();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.leaderboard.LeaderboardViewModel$loadTopThreeUsers$1", mo15594f = "LeaderboardViewModel.kt", mo15595l = {47}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.leaderboard.b$c */
    static final class C5618c extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14614j;

        /* renamed from: k */
        Object f14615k;

        /* renamed from: l */
        Object f14616l;

        /* renamed from: m */
        Object f14617m;

        /* renamed from: n */
        int f14618n;

        /* renamed from: o */
        final /* synthetic */ C5615b f14619o;

        C5618c(C5615b bVar, C5866d dVar) {
            this.f14619o = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14618n;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14614j;
                this.f14619o.f14611k.mo2981b(C5887b.m22259a(true));
                C5716b bVar = new C5716b(3, 0);
                C0532t c = this.f14619o.f14610j;
                C5183b a2 = this.f14619o.f14612l;
                this.f14615k = g0Var;
                this.f14616l = bVar;
                this.f14617m = c;
                this.f14618n = 1;
                obj = a2.mo14718a(bVar, (C5866d<? super List<C5294d0>>) this);
                if (obj == a) {
                    return a;
                }
                tVar = c;
            } else if (i == 1) {
                tVar = (C0532t) this.f14617m;
                C5716b bVar2 = (C5716b) this.f14616l;
                C6089g0 g0Var2 = (C6089g0) this.f14615k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar.mo2981b(obj);
            this.f14619o.f14611k.mo2981b(C5887b.m22259a(false));
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5618c cVar = new C5618c(this.f14619o, dVar);
            cVar.f14614j = (C6089g0) obj;
            return cVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5618c) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    static {
        new C5616a(null);
    }

    public C5615b(C5181a aVar, C5183b bVar) {
        C5942k.m22327b(aVar, "getAccountInteractor");
        C5942k.m22327b(bVar, "getLeaderUsersInteractor");
        this.f14612l = bVar;
        this.f14608h = aVar.mo14715a();
        LiveData<C3503h<C5294d0>> a = new C3497e(this.f14607g, C5717c.f14802b.mo15355a()).mo11139a();
        C5942k.m22324a((Object) a, "LivePagedListBuilder(dat….pagedListConfig).build()");
        this.f14609i = a;
        C5942k.m22324a((Object) C0544z.m2798b(this.f14607g.mo15036b(), C5617b.f14613a), "Transformations.switchMa…ce) { it.initialLoading }");
        this.f14610j = new C0532t<>();
        this.f14611k = new C0532t<>();
        m21487j();
    }

    /* renamed from: j */
    private final void m21487j() {
        C6088g.m22903b(mo15050e(), null, null, new C5618c(this, null), 3, null);
    }

    /* renamed from: f */
    public final LiveData<C3503h<C5294d0>> mo15241f() {
        return this.f14609i;
    }

    /* renamed from: g */
    public final LiveData<Boolean> mo15242g() {
        return this.f14611k;
    }

    /* renamed from: h */
    public final LiveData<List<C5294d0>> mo15243h() {
        return this.f14610j;
    }

    /* renamed from: i */
    public final LiveData<C5294d0> mo15244i() {
        return this.f14608h;
    }
}
