package p255io.stashteam.stashapp.p298ui.auth.signin;

import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5181a;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a;
import p255io.stashteam.stashapp.p269e.p280c.C5287b;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.auth.signin.b */
public final class C5467b extends C5345a {

    /* renamed from: g */
    private final LiveData<C5294d0> f14288g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5188e f14289h;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.auth.signin.SignInViewModel$signInByFacebook$1", mo15594f = "SignInViewModel.kt", mo15595l = {19}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.auth.signin.b$a */
    static final class C5468a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14290j;

        /* renamed from: k */
        Object f14291k;

        /* renamed from: l */
        int f14292l;

        /* renamed from: m */
        final /* synthetic */ C5467b f14293m;

        /* renamed from: n */
        final /* synthetic */ String f14294n;

        C5468a(C5467b bVar, String str, C5866d dVar) {
            this.f14293m = bVar;
            this.f14294n = str;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14292l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14290j;
                C5188e a2 = this.f14293m.f14289h;
                C5189a aVar = new C5189a(this.f14294n, C5287b.FACEBOOK);
                this.f14291k = g0Var;
                this.f14292l = 1;
                if (a2.mo14718a(aVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14291k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5468a aVar = new C5468a(this.f14293m, this.f14294n, dVar);
            aVar.f14290j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5468a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.auth.signin.SignInViewModel$signInByGoogle$1", mo15594f = "SignInViewModel.kt", mo15595l = {25}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.auth.signin.b$b */
    static final class C5469b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14295j;

        /* renamed from: k */
        Object f14296k;

        /* renamed from: l */
        int f14297l;

        /* renamed from: m */
        final /* synthetic */ C5467b f14298m;

        /* renamed from: n */
        final /* synthetic */ String f14299n;

        C5469b(C5467b bVar, String str, C5866d dVar) {
            this.f14298m = bVar;
            this.f14299n = str;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14297l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14295j;
                C5188e a2 = this.f14298m.f14289h;
                C5189a aVar = new C5189a(this.f14299n, C5287b.GOOGLE);
                this.f14296k = g0Var;
                this.f14297l = 1;
                if (a2.mo14718a(aVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14296k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5469b bVar = new C5469b(this.f14298m, this.f14299n, dVar);
            bVar.f14295j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5469b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5467b(C5188e eVar, C5181a aVar) {
        C5942k.m22327b(eVar, "signInInteractor");
        C5942k.m22327b(aVar, "getAccountInteractor");
        this.f14289h = eVar;
        this.f14288g = aVar.mo14715a();
    }

    /* renamed from: b */
    public final void mo15124b(String str) {
        C5942k.m22327b(str, "token");
        C5345a.m20868a(this, null, true, new C5468a(this, str, null), 1, null);
    }

    /* renamed from: c */
    public final void mo15125c(String str) {
        C5942k.m22327b(str, "token");
        C5345a.m20868a(this, null, true, new C5469b(this, str, null), 1, null);
    }

    /* renamed from: f */
    public final LiveData<C5294d0> mo15126f() {
        return this.f14288g;
    }
}
