package p255io.stashteam.stashapp.p256b.p261d;

import android.os.Build;
import android.os.Build.VERSION;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.iid.C2928a;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.C6093h0;
import kotlinx.coroutines.C6216y0;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p255io.stashteam.stashapp.data.local.p264db.InMemoryDatabase;
import p255io.stashteam.stashapp.data.local.p264db.PersistenceDatabase;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f;
import p255io.stashteam.stashapp.data.network.model.AccessTokenApiModel;
import p255io.stashteam.stashapp.data.network.model.AccountDataApiModel;
import p255io.stashteam.stashapp.data.network.model.StatisticApiModel;
import p255io.stashteam.stashapp.data.network.model.UserApiModel;
import p255io.stashteam.stashapp.data.network.response.PagingResponse;
import p255io.stashteam.stashapp.data.network.response.RegisterDeviceResponse;
import p255io.stashteam.stashapp.data.network.response.SignInResponse;
import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p255io.stashteam.stashapp.p256b.p260c.C4942a;
import p308k.C5806n;
import p308k.C5808p;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p378p.C6620j;
import p378p.C6663t;
import p382q.p383a.C6677a;

/* renamed from: io.stashteam.stashapp.b.d.a */
public final class C4944a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4942a f12845a;

    /* renamed from: b */
    private final PersistenceDatabase f12846b;

    /* renamed from: c */
    private final InMemoryDatabase f12847c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4940a f12848d;

    /* renamed from: io.stashteam.stashapp.b.d.a$a */
    public static final class C4945a {
        private C4945a() {
        }

        public /* synthetic */ C4945a(C5938g gVar) {
            this();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository$convertAuthToken$1", mo15594f = "AccountRepository.kt", mo15595l = {75}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.b.d.a$b */
    static final class C4946b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f12849j;

        /* renamed from: k */
        Object f12850k;

        /* renamed from: l */
        int f12851l;

        /* renamed from: m */
        final /* synthetic */ C4944a f12852m;

        /* renamed from: n */
        final /* synthetic */ String f12853n;

        C4946b(C4944a aVar, String str, C5866d dVar) {
            this.f12852m = aVar;
            this.f12853n = str;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f12851l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f12849j;
                C4942a a2 = this.f12852m.f12845a;
                Map a3 = C5821b0.m22070a(C5808p.m22056a("accessToken", this.f12853n));
                this.f12850k = g0Var;
                this.f12851l = 1;
                obj = a2.mo14115a(a3, (C5866d<? super AccessTokenApiModel>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f12850k;
                try {
                    C5806n.m22054a(obj);
                } catch (Exception e) {
                    C6677a.m25082a((Throwable) e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccessTokenApiModel accessTokenApiModel = (AccessTokenApiModel) obj;
            this.f12852m.f12848d.mo14083a(accessTokenApiModel.getToken(), accessTokenApiModel.getExpiresIn(), accessTokenApiModel.getRefreshToken());
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C4946b bVar = new C4946b(this.f12852m, this.f12853n, dVar);
            bVar.f12849j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C4946b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository$convertDeviceToken$1", mo15594f = "AccountRepository.kt", mo15595l = {64}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.b.d.a$c */
    static final class C4947c extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f12854j;

        /* renamed from: k */
        Object f12855k;

        /* renamed from: l */
        int f12856l;

        /* renamed from: m */
        final /* synthetic */ C4944a f12857m;

        /* renamed from: n */
        final /* synthetic */ String f12858n;

        C4947c(C4944a aVar, String str, C5866d dVar) {
            this.f12857m = aVar;
            this.f12858n = str;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f12856l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f12854j;
                C4942a a2 = this.f12857m.f12845a;
                Map a3 = C5821b0.m22070a(C5808p.m22056a("accessToken", this.f12858n));
                this.f12855k = g0Var;
                this.f12856l = 1;
                obj = a2.mo14115a(a3, (C5866d<? super AccessTokenApiModel>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f12855k;
                try {
                    C5806n.m22054a(obj);
                } catch (Exception e) {
                    C6677a.m25082a((Throwable) e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccessTokenApiModel accessTokenApiModel = (AccessTokenApiModel) obj;
            this.f12857m.f12848d.mo14087b(accessTokenApiModel.getToken(), accessTokenApiModel.getExpiresIn(), accessTokenApiModel.getRefreshToken());
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C4947c cVar = new C4947c(this.f12857m, this.f12858n, dVar);
            cVar.f12854j = (C6089g0) obj;
            return cVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C4947c) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository$createDeviceAccessToken$1", mo15594f = "AccountRepository.kt", mo15595l = {168}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.b.d.a$d */
    static final class C4948d extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f12859j;

        /* renamed from: k */
        Object f12860k;

        /* renamed from: l */
        Object f12861l;

        /* renamed from: m */
        int f12862m;

        /* renamed from: n */
        final /* synthetic */ C4944a f12863n;

        /* renamed from: o */
        final /* synthetic */ String f12864o;

        /* renamed from: p */
        final /* synthetic */ String f12865p;

        C4948d(C4944a aVar, String str, String str2, C5866d dVar) {
            this.f12863n = aVar;
            this.f12864o = str;
            this.f12865p = str2;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f12862m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f12859j;
                Map c = C5823c0.m22082c(C5808p.m22056a("id", this.f12864o), C5808p.m22056a("deviceModel", Build.MODEL), C5808p.m22056a("platform", "android"), C5808p.m22056a("platformVersion", String.valueOf(VERSION.SDK_INT)));
                String str = this.f12865p;
                if (str != null) {
                    String str2 = (String) c.put("firebaseToken", str);
                }
                C4942a a2 = this.f12863n.f12845a;
                this.f12860k = g0Var;
                this.f12861l = c;
                this.f12862m = 1;
                obj = a2.mo14129c(c, (C5866d<? super RegisterDeviceResponse>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                Map map = (Map) this.f12861l;
                C6089g0 g0Var2 = (C6089g0) this.f12860k;
                try {
                    C5806n.m22054a(obj);
                } catch (Exception e) {
                    C6677a.m25082a((Throwable) e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccessTokenApiModel accessToken = ((RegisterDeviceResponse) obj).getAccessToken();
            this.f12863n.f12848d.mo14087b(accessToken.getToken(), accessToken.getExpiresIn(), accessToken.getRefreshToken());
            this.f12863n.f12848d.mo14086b(this.f12864o);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C4948d dVar2 = new C4948d(this.f12863n, this.f12864o, this.f12865p, dVar);
            dVar2.f12859j = (C6089g0) obj;
            return dVar2;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C4948d) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository", mo15594f = "AccountRepository.kt", mo15595l = {114, 116}, mo15596m = "loadAccount")
    /* renamed from: io.stashteam.stashapp.b.d.a$e */
    static final class C4949e extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12866i;

        /* renamed from: j */
        int f12867j;

        /* renamed from: k */
        final /* synthetic */ C4944a f12868k;

        /* renamed from: l */
        Object f12869l;

        /* renamed from: m */
        Object f12870m;

        C4949e(C4944a aVar, C5866d dVar) {
            this.f12868k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12866i = obj;
            this.f12867j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12868k.mo14139a((Long) null, (C5866d<? super UserApiModel>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository", mo15594f = "AccountRepository.kt", mo15595l = {142, 144}, mo15596m = "loadAccountStatistic")
    /* renamed from: io.stashteam.stashapp.b.d.a$f */
    static final class C4950f extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12871i;

        /* renamed from: j */
        int f12872j;

        /* renamed from: k */
        final /* synthetic */ C4944a f12873k;

        /* renamed from: l */
        Object f12874l;

        /* renamed from: m */
        Object f12875m;

        C4950f(C4944a aVar, C5866d dVar) {
            this.f12873k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12871i = obj;
            this.f12872j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12873k.mo14146b((Long) null, (C5866d<? super StatisticApiModel>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository$refreshAuthToken$1", mo15594f = "AccountRepository.kt", mo15595l = {48}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.b.d.a$g */
    static final class C4951g extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f12876j;

        /* renamed from: k */
        Object f12877k;

        /* renamed from: l */
        int f12878l;

        /* renamed from: m */
        final /* synthetic */ C4944a f12879m;

        /* renamed from: n */
        final /* synthetic */ String f12880n;

        C4951g(C4944a aVar, String str, C5866d dVar) {
            this.f12879m = aVar;
            this.f12880n = str;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f12878l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f12876j;
                C4942a a2 = this.f12879m.f12845a;
                Map a3 = C5821b0.m22070a(C5808p.m22056a("refreshToken", this.f12880n));
                this.f12877k = g0Var;
                this.f12878l = 1;
                obj = a2.mo14132d(a3, (C5866d<? super C6663t<AccessTokenApiModel>>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f12877k;
                try {
                    C5806n.m22054a(obj);
                } catch (Exception e) {
                    C6677a.m25082a((Throwable) e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6663t tVar = (C6663t) obj;
            if (tVar.mo17128d()) {
                AccessTokenApiModel accessTokenApiModel = (AccessTokenApiModel) tVar.mo17125a();
                if (accessTokenApiModel != null) {
                    this.f12879m.f12848d.mo14083a(accessTokenApiModel.getToken(), accessTokenApiModel.getExpiresIn(), accessTokenApiModel.getRefreshToken());
                }
                return C5812t.f14872a;
            }
            if (tVar.mo17126b() == 400) {
                this.f12879m.f12848d.mo14099m();
            }
            throw new C6620j(tVar);
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C4951g gVar = new C4951g(this.f12879m, this.f12880n, dVar);
            gVar.f12876j = (C6089g0) obj;
            return gVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C4951g) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository$refreshDeviceToken$1", mo15594f = "AccountRepository.kt", mo15595l = {32}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.b.d.a$h */
    static final class C4952h extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f12881j;

        /* renamed from: k */
        Object f12882k;

        /* renamed from: l */
        int f12883l;

        /* renamed from: m */
        final /* synthetic */ C4944a f12884m;

        /* renamed from: n */
        final /* synthetic */ String f12885n;

        C4952h(C4944a aVar, String str, C5866d dVar) {
            this.f12884m = aVar;
            this.f12885n = str;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f12883l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f12881j;
                C4942a a2 = this.f12884m.f12845a;
                Map a3 = C5821b0.m22070a(C5808p.m22056a("refreshToken", this.f12885n));
                this.f12882k = g0Var;
                this.f12883l = 1;
                obj = a2.mo14132d(a3, (C5866d<? super C6663t<AccessTokenApiModel>>) this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f12882k;
                try {
                    C5806n.m22054a(obj);
                } catch (Exception e) {
                    C6677a.m25082a((Throwable) e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6663t tVar = (C6663t) obj;
            if (tVar.mo17128d()) {
                AccessTokenApiModel accessTokenApiModel = (AccessTokenApiModel) tVar.mo17125a();
                if (accessTokenApiModel != null) {
                    this.f12884m.f12848d.mo14087b(accessTokenApiModel.getToken(), accessTokenApiModel.getExpiresIn(), accessTokenApiModel.getRefreshToken());
                }
                return C5812t.f14872a;
            }
            if (tVar.mo17126b() == 400) {
                this.f12884m.f12848d.mo14100n();
            }
            throw new C6620j(tVar);
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C4952h hVar = new C4952h(this.f12884m, this.f12885n, dVar);
            hVar.f12881j = (C6089g0) obj;
            return hVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C4952h) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* renamed from: io.stashteam.stashapp.b.d.a$i */
    static final class C4953i<TResult> implements C4343c<C2928a> {

        /* renamed from: a */
        final /* synthetic */ C4944a f12886a;

        /* renamed from: b */
        final /* synthetic */ String f12887b;

        C4953i(C4944a aVar, String str) {
            this.f12886a = aVar;
            this.f12887b = str;
        }

        /* renamed from: a */
        public final void mo9640a(C4350h<C2928a> hVar) {
            C5942k.m22327b(hVar, "task");
            C2928a aVar = (C2928a) hVar.mo13016b();
            this.f12886a.m19803b(this.f12887b, aVar != null ? aVar.mo9628a() : null);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository", mo15594f = "AccountRepository.kt", mo15595l = {101}, mo15596m = "signInByFacebook")
    /* renamed from: io.stashteam.stashapp.b.d.a$j */
    static final class C4954j extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12888i;

        /* renamed from: j */
        int f12889j;

        /* renamed from: k */
        final /* synthetic */ C4944a f12890k;

        /* renamed from: l */
        Object f12891l;

        /* renamed from: m */
        Object f12892m;

        /* renamed from: n */
        Object f12893n;

        C4954j(C4944a aVar, C5866d dVar) {
            this.f12890k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12888i = obj;
            this.f12889j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12890k.mo14140a((String) null, (C5866d<? super UserApiModel>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository", mo15594f = "AccountRepository.kt", mo15595l = {95}, mo15596m = "signInByGoogle")
    /* renamed from: io.stashteam.stashapp.b.d.a$k */
    static final class C4955k extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12894i;

        /* renamed from: j */
        int f12895j;

        /* renamed from: k */
        final /* synthetic */ C4944a f12896k;

        /* renamed from: l */
        Object f12897l;

        /* renamed from: m */
        Object f12898m;

        /* renamed from: n */
        Object f12899n;

        C4955k(C4944a aVar, C5866d dVar) {
            this.f12896k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12894i = obj;
            this.f12895j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12896k.mo14147b((String) null, (C5866d<? super UserApiModel>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.AccountRepository", mo15594f = "AccountRepository.kt", mo15595l = {108, 109}, mo15596m = "signOut")
    /* renamed from: io.stashteam.stashapp.b.d.a$l */
    static final class C4956l extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12900i;

        /* renamed from: j */
        int f12901j;

        /* renamed from: k */
        final /* synthetic */ C4944a f12902k;

        /* renamed from: l */
        Object f12903l;

        C4956l(C4944a aVar, C5866d dVar) {
            this.f12902k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12900i = obj;
            this.f12901j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12902k.mo14148b((C5866d<? super C5812t>) this);
        }
    }

    static {
        new C4945a(null);
    }

    public C4944a(C4942a aVar, PersistenceDatabase persistenceDatabase, InMemoryDatabase inMemoryDatabase, C4940a aVar2) {
        C5942k.m22327b(aVar, "apiRestService");
        C5942k.m22327b(persistenceDatabase, "persistenceDatabase");
        C5942k.m22327b(inMemoryDatabase, "inMemoryDatabase");
        C5942k.m22327b(aVar2, "preferencesManager");
        this.f12845a = aVar;
        this.f12846b = persistenceDatabase;
        this.f12847c = inMemoryDatabase;
        this.f12848d = aVar2;
    }

    /* renamed from: a */
    private final UserApiModel m19798a(SignInResponse signInResponse) {
        AccessTokenApiModel accessToken = signInResponse.getAccessToken();
        this.f12848d.mo14083a(accessToken.getToken(), accessToken.getExpiresIn(), accessToken.getRefreshToken());
        return signInResponse.getUser();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m19799a(C4944a aVar, Long l, C5866d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return aVar.mo14139a(l, dVar);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m19802b(C4944a aVar, Long l, C5866d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return aVar.mo14146b(l, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m19803b(String str, String str2) {
        C6088g.m22903b(C6093h0.m22909a(C6216y0.m23286b()), null, null, new C4948d(this, str, str2, null), 3, null);
    }

    /* renamed from: a */
    public final LiveData<C5180f> mo14136a() {
        return this.f12846b.mo14281p().mo14326a();
    }

    /* renamed from: a */
    public final Object mo14137a(int i, int i2, C5866d<? super PagingResponse<AccountDataApiModel>> dVar) {
        return this.f12845a.mo14103a(i, i2, dVar);
    }

    /* renamed from: a */
    public final Object mo14138a(C5180f fVar, C5866d<? super C5812t> dVar) {
        Object b = this.f12846b.mo14281p().mo14291b(fVar, dVar);
        return b == C5885d.m22250a() ? b : C5812t.f14872a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14139a(java.lang.Long r7, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.network.model.UserApiModel> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p255io.stashteam.stashapp.p256b.p261d.C4944a.C4949e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.stashteam.stashapp.b.d.a$e r0 = (p255io.stashteam.stashapp.p256b.p261d.C4944a.C4949e) r0
            int r1 = r0.f12867j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12867j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.a$e r0 = new io.stashteam.stashapp.b.d.a$e
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12866i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12867j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            java.lang.Object r7 = r0.f12870m
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r7 = r0.f12869l
            io.stashteam.stashapp.b.d.a r7 = (p255io.stashteam.stashapp.p256b.p261d.C4944a) r7
            p308k.C5806n.m22054a(r8)
            goto L_0x0051
        L_0x003d:
            p308k.C5806n.m22054a(r8)
            io.stashteam.stashapp.b.c.a r8 = r6.f12845a
            if (r7 != 0) goto L_0x0054
            r0.f12869l = r6
            r0.f12870m = r7
            r0.f12867j = r4
            java.lang.Object r8 = r8.mo14125b(r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            io.stashteam.stashapp.data.network.model.UserApiModel r8 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r8
            goto L_0x0065
        L_0x0054:
            long r4 = r7.longValue()
            r0.f12869l = r6
            r0.f12870m = r7
            r0.f12867j = r3
            java.lang.Object r8 = r8.mo14122b(r4, r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4944a.mo14139a(java.lang.Long, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14140a(java.lang.String r5, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.network.model.UserApiModel> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p256b.p261d.C4944a.C4954j
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.stashteam.stashapp.b.d.a$j r0 = (p255io.stashteam.stashapp.p256b.p261d.C4944a.C4954j) r0
            int r1 = r0.f12889j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12889j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.a$j r0 = new io.stashteam.stashapp.b.d.a$j
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12888i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12889j
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r5 = r0.f12893n
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.f12892m
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f12891l
            io.stashteam.stashapp.b.d.a r5 = (p255io.stashteam.stashapp.p256b.p261d.C4944a) r5
            p308k.C5806n.m22054a(r6)
            goto L_0x005d
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            p308k.C5806n.m22054a(r6)
            k.l r6 = new k.l
            java.lang.String r2 = "token"
            r6.<init>(r2, r5)
            java.util.Map r6 = p308k.p314u.C5821b0.m22070a(r6)
            io.stashteam.stashapp.b.c.a r2 = r4.f12845a
            r0.f12891l = r4
            r0.f12892m = r5
            r0.f12893n = r6
            r0.f12889j = r3
            java.lang.Object r6 = r2.mo14124b(r6, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r4
        L_0x005d:
            io.stashteam.stashapp.data.network.response.SignInResponse r6 = (p255io.stashteam.stashapp.data.network.response.SignInResponse) r6
            io.stashteam.stashapp.data.network.model.UserApiModel r5 = r5.m19798a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4944a.mo14140a(java.lang.String, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo14141a(HashMap<String, Object> hashMap, C5866d<? super UserApiModel> dVar) {
        return this.f12845a.mo14114a(hashMap, dVar);
    }

    /* renamed from: a */
    public final Object mo14142a(C5866d<? super C5180f> dVar) {
        return this.f12846b.mo14281p().mo14329b(dVar);
    }

    /* renamed from: a */
    public final void mo14143a(String str) {
        C5942k.m22327b(str, "token");
        C6088g.m22903b(C6093h0.m22909a(C6216y0.m23286b()), null, null, new C4946b(this, str, null), 3, null);
    }

    /* renamed from: a */
    public final void mo14144a(String str, String str2) {
        C5942k.m22327b(str, "deviceId");
        C5942k.m22327b(str2, "fcmToken");
        m19803b(str, str2);
    }

    /* renamed from: b */
    public final Object mo14145b(C5180f fVar, C5866d<? super C5812t> dVar) {
        Object a = this.f12846b.mo14281p().mo14327a(fVar, dVar);
        return a == C5885d.m22250a() ? a : C5812t.f14872a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14146b(java.lang.Long r7, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.network.model.StatisticApiModel> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p255io.stashteam.stashapp.p256b.p261d.C4944a.C4950f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.stashteam.stashapp.b.d.a$f r0 = (p255io.stashteam.stashapp.p256b.p261d.C4944a.C4950f) r0
            int r1 = r0.f12872j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12872j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.a$f r0 = new io.stashteam.stashapp.b.d.a$f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12871i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12872j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            java.lang.Object r7 = r0.f12875m
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r7 = r0.f12874l
            io.stashteam.stashapp.b.d.a r7 = (p255io.stashteam.stashapp.p256b.p261d.C4944a) r7
            p308k.C5806n.m22054a(r8)
            goto L_0x0051
        L_0x003d:
            p308k.C5806n.m22054a(r8)
            io.stashteam.stashapp.b.c.a r8 = r6.f12845a
            if (r7 != 0) goto L_0x0054
            r0.f12874l = r6
            r0.f12875m = r7
            r0.f12872j = r4
            java.lang.Object r8 = r8.mo14116a(r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            io.stashteam.stashapp.data.network.model.StatisticApiModel r8 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r8
            goto L_0x0065
        L_0x0054:
            long r4 = r7.longValue()
            r0.f12874l = r6
            r0.f12875m = r7
            r0.f12872j = r3
            java.lang.Object r8 = r8.mo14133e(r4, r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0065:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4944a.mo14146b(java.lang.Long, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14147b(java.lang.String r5, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.network.model.UserApiModel> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p256b.p261d.C4944a.C4955k
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.stashteam.stashapp.b.d.a$k r0 = (p255io.stashteam.stashapp.p256b.p261d.C4944a.C4955k) r0
            int r1 = r0.f12895j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12895j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.a$k r0 = new io.stashteam.stashapp.b.d.a$k
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12894i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12895j
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r5 = r0.f12899n
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r0.f12898m
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f12897l
            io.stashteam.stashapp.b.d.a r5 = (p255io.stashteam.stashapp.p256b.p261d.C4944a) r5
            p308k.C5806n.m22054a(r6)
            goto L_0x005d
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            p308k.C5806n.m22054a(r6)
            k.l r6 = new k.l
            java.lang.String r2 = "token"
            r6.<init>(r2, r5)
            java.util.Map r6 = p308k.p314u.C5821b0.m22070a(r6)
            io.stashteam.stashapp.b.c.a r2 = r4.f12845a
            r0.f12897l = r4
            r0.f12898m = r5
            r0.f12899n = r6
            r0.f12895j = r3
            java.lang.Object r6 = r2.mo14134e(r6, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r4
        L_0x005d:
            io.stashteam.stashapp.data.network.response.SignInResponse r6 = (p255io.stashteam.stashapp.data.network.response.SignInResponse) r6
            io.stashteam.stashapp.data.network.model.UserApiModel r5 = r5.m19798a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4944a.mo14147b(java.lang.String, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14148b(p308k.p316w.C5866d<? super p308k.C5812t> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p256b.p261d.C4944a.C4956l
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.stashteam.stashapp.b.d.a$l r0 = (p255io.stashteam.stashapp.p256b.p261d.C4944a.C4956l) r0
            int r1 = r0.f12901j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12901j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.a$l r0 = new io.stashteam.stashapp.b.d.a$l
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12900i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12901j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r0 = r0.f12903l
            io.stashteam.stashapp.b.d.a r0 = (p255io.stashteam.stashapp.p256b.p261d.C4944a) r0
            p308k.C5806n.m22054a(r6)
            goto L_0x0071
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            java.lang.Object r2 = r0.f12903l
            io.stashteam.stashapp.b.d.a r2 = (p255io.stashteam.stashapp.p256b.p261d.C4944a) r2
            p308k.C5806n.m22054a(r6)
            goto L_0x0060
        L_0x0040:
            p308k.C5806n.m22054a(r6)
            io.stashteam.stashapp.b.b.a.a r6 = r5.f12848d
            r6.mo14099m()
            io.stashteam.stashapp.b.b.a.a r6 = r5.f12848d
            r2 = 0
            r6.mo14088b(r2)
            io.stashteam.stashapp.data.local.db.PersistenceDatabase r6 = r5.f12846b
            io.stashteam.stashapp.data.local.db.b.f r6 = r6.mo14281p()
            r0.f12903l = r5
            r0.f12901j = r4
            java.lang.Object r6 = r6.mo14328a(r0)
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r2 = r5
        L_0x0060:
            io.stashteam.stashapp.data.local.db.InMemoryDatabase r6 = r2.f12847c
            io.stashteam.stashapp.data.local.db.b.d r6 = r6.mo14282q()
            r0.f12903l = r2
            r0.f12901j = r3
            java.lang.Object r6 = r6.mo14312a(r0)
            if (r6 != r1) goto L_0x0071
            return r1
        L_0x0071:
            k.t r6 = p308k.C5812t.f14872a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4944a.mo14148b(k.w.d):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo14149b(String str) {
        C5942k.m22327b(str, "token");
        C6088g.m22903b(C6093h0.m22909a(C6216y0.m23286b()), null, null, new C4947c(this, str, null), 3, null);
    }

    /* renamed from: c */
    public final void mo14150c(String str) {
        C5942k.m22327b(str, "refreshToken");
        C6088g.m22903b(C6093h0.m22909a(C6216y0.m23286b()), null, null, new C4951g(this, str, null), 3, null);
    }

    /* renamed from: d */
    public final void mo14151d(String str) {
        C5942k.m22327b(str, "refreshToken");
        C6088g.m22903b(C6093h0.m22909a(C6216y0.m23286b()), null, null, new C4952h(this, str, null), 3, null);
    }

    /* renamed from: e */
    public final void mo14152e(String str) {
        C5942k.m22327b(str, "deviceId");
        FirebaseInstanceId k = FirebaseInstanceId.m12068k();
        C5942k.m22324a((Object) k, "FirebaseInstanceId.getInstance()");
        k.mo9617b().mo13004a((C4343c<TResult>) new C4953i<TResult>(this, str));
    }
}
