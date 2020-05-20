package p255io.stashteam.stashapp.p298ui.profile.user;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p292d.C5417a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.profile.user.a */
public final class C5640a extends C5417a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0532t<C5294d0> f14663g = new C0532t<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f14664h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C5185c f14665i;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.profile.user.UserProfileViewModel$1", mo15594f = "UserProfileViewModel.kt", mo15595l = {21}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.profile.user.a$a */
    static final class C5641a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14666j;

        /* renamed from: k */
        Object f14667k;

        /* renamed from: l */
        Object f14668l;

        /* renamed from: m */
        int f14669m;

        /* renamed from: n */
        final /* synthetic */ C5640a f14670n;

        C5641a(C5640a aVar, C5866d dVar) {
            this.f14670n = aVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0532t tVar;
            Object a = C5885d.m22250a();
            int i = this.f14669m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14666j;
                C0532t c = this.f14670n.f14663g;
                C5185c a2 = this.f14670n.f14665i;
                long b = this.f14670n.f14664h;
                this.f14667k = g0Var;
                this.f14668l = c;
                this.f14669m = 1;
                obj = a2.mo14719a(b, (C5866d<? super C5294d0>) this);
                if (obj == a) {
                    return a;
                }
                tVar = c;
            } else if (i == 1) {
                tVar = (C0532t) this.f14668l;
                C6089g0 g0Var2 = (C6089g0) this.f14667k;
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
            C5641a aVar = new C5641a(this.f14670n, dVar);
            aVar.f14666j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5641a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5640a(long j, C5185c cVar) {
        C5942k.m22327b(cVar, "loadAccountInteractor");
        this.f14664h = j;
        this.f14665i = cVar;
        C6088g.m22903b(mo15050e(), null, null, new C5641a(this, null), 3, null);
    }

    /* renamed from: f */
    public LiveData<C5294d0> mo15095f() {
        return this.f14663g;
    }
}
