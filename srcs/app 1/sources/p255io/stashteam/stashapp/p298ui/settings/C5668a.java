package p255io.stashteam.stashapp.p298ui.settings;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5181a;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5192g;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a;
import p255io.stashteam.stashapp.p269e.p280c.C5284a;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p308k.C5806n;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.settings.a */
public final class C5668a extends C5345a {

    /* renamed from: g */
    private final LiveData<C5294d0> f14718g;

    /* renamed from: h */
    private final C0532t<C5284a> f14719h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C5192g f14720i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C5198j f14721j;

    /* renamed from: k */
    private final C4940a f14722k;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.settings.SettingsViewModel$signOut$1", mo15594f = "SettingsViewModel.kt", mo15595l = {33}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.settings.a$a */
    static final class C5669a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14723j;

        /* renamed from: k */
        Object f14724k;

        /* renamed from: l */
        int f14725l;

        /* renamed from: m */
        final /* synthetic */ C5668a f14726m;

        C5669a(C5668a aVar, C5866d dVar) {
            this.f14726m = aVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14725l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14723j;
                C5192g a2 = this.f14726m.f14720i;
                this.f14724k = g0Var;
                this.f14725l = 1;
                if (a2.mo14727a(this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14724k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5669a aVar = new C5669a(this.f14726m, dVar);
            aVar.f14723j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5669a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.settings.SettingsViewModel$updateAccount$1", mo15594f = "SettingsViewModel.kt", mo15595l = {43}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.settings.a$b */
    static final class C5670b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14727j;

        /* renamed from: k */
        Object f14728k;

        /* renamed from: l */
        int f14729l;

        /* renamed from: m */
        final /* synthetic */ C5668a f14730m;

        /* renamed from: n */
        final /* synthetic */ String f14731n;

        /* renamed from: o */
        final /* synthetic */ String f14732o;

        /* renamed from: p */
        final /* synthetic */ boolean f14733p;

        C5670b(C5668a aVar, String str, String str2, boolean z, C5866d dVar) {
            this.f14730m = aVar;
            this.f14731n = str;
            this.f14732o = str2;
            this.f14733p = z;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14729l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14727j;
                C5198j b = this.f14730m.f14721j;
                String str = this.f14731n;
                String str2 = "null cannot be cast to non-null type kotlin.CharSequence";
                if (str != null) {
                    String obj2 = C5788q.m22032f(str).toString();
                    String str3 = this.f14732o;
                    if (str3 != null) {
                        C5199a aVar = new C5199a(obj2, C5787p.m21971a(C5788q.m22032f(str3).toString(), " ", "_", false, 4, (Object) null), this.f14733p);
                        this.f14728k = g0Var;
                        this.f14729l = 1;
                        if (b.mo14718a(aVar, (C5866d<? super C5812t>) this) == a) {
                            return a;
                        }
                    } else {
                        throw new C5809q(str2);
                    }
                } else {
                    throw new C5809q(str2);
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14728k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5670b bVar = new C5670b(this.f14730m, this.f14731n, this.f14732o, this.f14733p, dVar);
            bVar.f14727j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5670b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5668a(C5192g gVar, C5198j jVar, C4940a aVar, C5181a aVar2) {
        C5942k.m22327b(gVar, "signOutInteractor");
        C5942k.m22327b(jVar, "updateAccountInteractor");
        C5942k.m22327b(aVar, "preferencesManager");
        C5942k.m22327b(aVar2, "getAccountInteractor");
        this.f14720i = gVar;
        this.f14721j = jVar;
        this.f14722k = aVar;
        this.f14718g = aVar2.mo14715a();
        C0532t<C5284a> tVar = new C0532t<>();
        this.f14719h = tVar;
        tVar.mo2981b(C5284a.f13820k.mo14859a(this.f14722k.mo14081a()));
    }

    /* renamed from: b */
    private final boolean m21606b(String str, String str2, boolean z) {
        C5294d0 d0Var = (C5294d0) this.f14718g.mo2974a();
        boolean z2 = false;
        if (d0Var == null) {
            return false;
        }
        C5942k.m22324a((Object) d0Var, "user.value ?: return false");
        boolean z3 = (!C5942k.m22326a((Object) str, (Object) d0Var.mo14884b())) | (!C5942k.m22326a((Object) str2, (Object) d0Var.mo14887e()));
        if (z != d0Var.mo14891h()) {
            z2 = true;
        }
        return z3 | z2;
    }

    /* renamed from: a */
    public final void mo15280a(C5284a aVar) {
        C5942k.m22327b(aVar, "theme");
        this.f14722k.mo14082a(aVar.mo14856f());
        this.f14719h.mo2981b(aVar);
    }

    /* renamed from: a */
    public final void mo15281a(String str, String str2, boolean z) {
        C5942k.m22327b(str, "fullName");
        C5942k.m22327b(str2, "login");
        if (m21606b(str, str2, z) && !C5787p.m21972a(str) && !C5787p.m21972a(str2)) {
            C6089g0 e = mo15050e();
            C5670b bVar = new C5670b(this, str, str2, z, null);
            C6088g.m22903b(e, null, null, bVar, 3, null);
        }
    }

    /* renamed from: f */
    public final LiveData<C5284a> mo15282f() {
        return this.f14719h;
    }

    /* renamed from: g */
    public final LiveData<C5294d0> mo15283g() {
        return this.f14718g;
    }

    /* renamed from: h */
    public final void mo15284h() {
        C6088g.m22903b(mo15050e(), null, null, new C5669a(this, null), 3, null);
    }
}
