package p255io.stashteam.stashapp.p281f.p288b.p289c;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p071f.p131r.C3500f;
import p071f.p131r.C3503h;
import p071f.p131r.C3503h.C3506c;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5205b;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5220h;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5221i;
import p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5314s;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p255io.stashteam.stashapp.utils.p305g.C5716b;
import p255io.stashteam.stashapp.utils.p305g.C5717c;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.b.c.d */
public final class C5389d extends C5345a {

    /* renamed from: g */
    private final C5390a f14110g = new C5390a(this);

    /* renamed from: h */
    private final LiveData<C3503h<C5297f>> f14111h = C3500f.m14318a(this.f14113j.mo14770a(), C5717c.f14802b.mo15355a(), null, this.f14110g, null, 10, null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0532t<C5313r> f14112i = new C0532t<>();

    /* renamed from: j */
    private final C5221i f14113j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5220h f14114k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C5223j f14115l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C5205b f14116m;

    /* renamed from: io.stashteam.stashapp.f.b.c.d$a */
    public static final class C5390a extends C3506c<C5297f> {

        /* renamed from: a */
        final /* synthetic */ C5389d f14117a;

        C5390a(C5389d dVar) {
            this.f14117a = dVar;
        }

        /* renamed from: a */
        public void mo11164a() {
            super.mo11164a();
            this.f14117a.m20972h();
        }

        /* renamed from: a */
        public void mo11165a(C5297f fVar) {
            C5942k.m22327b(fVar, "itemAtEnd");
            super.mo11165a(fVar);
            this.f14117a.m20972h();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.custom_list.list.OwnCustomListsViewModel$createNewCustomList$1", mo15594f = "OwnCustomListsViewModel.kt", mo15595l = {47}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.b.c.d$b */
    static final class C5391b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14118j;

        /* renamed from: k */
        Object f14119k;

        /* renamed from: l */
        int f14120l;

        /* renamed from: m */
        final /* synthetic */ C5389d f14121m;

        /* renamed from: n */
        final /* synthetic */ C5297f f14122n;

        C5391b(C5389d dVar, C5297f fVar, C5866d dVar2) {
            this.f14121m = dVar;
            this.f14122n = fVar;
            super(2, dVar2);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14120l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14118j;
                C5205b a2 = this.f14121m.f14116m;
                C5297f fVar = this.f14122n;
                this.f14119k = g0Var;
                this.f14120l = 1;
                if (a2.mo14718a(fVar, (C5866d<? super C5812t>) this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14119k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5391b bVar = new C5391b(this.f14121m, this.f14122n, dVar);
            bVar.f14118j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5391b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.custom_list.list.OwnCustomListsViewModel$loadCustomLists$1", mo15594f = "OwnCustomListsViewModel.kt", mo15595l = {53, 61}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.b.c.d$c */
    static final class C5392c extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14123j;

        /* renamed from: k */
        Object f14124k;

        /* renamed from: l */
        Object f14125l;

        /* renamed from: m */
        int f14126m;

        /* renamed from: n */
        int f14127n;

        /* renamed from: o */
        final /* synthetic */ C5389d f14128o;

        C5392c(C5389d dVar, C5866d dVar2) {
            this.f14128o = dVar;
            super(2, dVar2);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            int i;
            C0532t tVar;
            C5313r rVar;
            C6089g0 g0Var;
            Object a = C5885d.m22250a();
            int i2 = this.f14127n;
            if (i2 == 0) {
                C5806n.m22054a(obj);
                g0Var = this.f14123j;
                C5220h b = this.f14128o.f14114k;
                this.f14124k = g0Var;
                this.f14127n = 1;
                obj = b.mo14769a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i2 == 1) {
                g0Var = (C6089g0) this.f14124k;
                C5806n.m22054a(obj);
            } else if (i2 == 2) {
                C5716b bVar = (C5716b) this.f14125l;
                i = this.f14126m;
                C6089g0 g0Var2 = (C6089g0) this.f14124k;
                C5806n.m22054a(obj);
                C5314s sVar = (C5314s) obj;
                if (i == 0 || sVar.mo14987a() != 0) {
                    tVar = this.f14128o.f14112i;
                    rVar = C5313r.SUCCESS;
                } else {
                    tVar = this.f14128o.f14112i;
                    rVar = C5313r.EMPTY_LIST;
                }
                tVar.mo2981b(rVar);
                return C5812t.f14872a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = ((Number) obj).intValue();
            if (intValue == 0) {
                this.f14128o.f14112i.mo2981b(C5313r.LOADING);
            }
            C5716b bVar2 = new C5716b(20, intValue);
            C5223j c = this.f14128o.f14115l;
            this.f14124k = g0Var;
            this.f14126m = intValue;
            this.f14125l = bVar2;
            this.f14127n = 2;
            Object a2 = c.mo14718a(bVar2, (C5866d<? super C5314s>) this);
            if (a2 == a) {
                return a;
            }
            i = intValue;
            obj = a2;
            C5314s sVar2 = (C5314s) obj;
            if (i == 0) {
            }
            tVar = this.f14128o.f14112i;
            rVar = C5313r.SUCCESS;
            tVar.mo2981b(rVar);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5392c cVar = new C5392c(this.f14128o, dVar);
            cVar.f14123j = (C6089g0) obj;
            return cVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5392c) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5389d(C5221i iVar, C5220h hVar, C5223j jVar, C5205b bVar) {
        C5942k.m22327b(iVar, "getOwnCustomListsInteractor");
        C5942k.m22327b(hVar, "getOwnCustomListsCountInteractor");
        C5942k.m22327b(jVar, "loadOwnCustomListsInteractor");
        C5942k.m22327b(bVar, "createCustomListInteractor");
        this.f14113j = iVar;
        this.f14114k = hVar;
        this.f14115l = jVar;
        this.f14116m = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m20972h() {
        C6088g.m22903b(mo15050e(), null, null, new C5392c(this, null), 3, null);
    }

    /* renamed from: a */
    public final void mo15076a(C5297f fVar) {
        C5942k.m22327b(fVar, "customList");
        C5345a.m20868a(this, null, false, new C5391b(this, fVar, null), 3, null);
    }

    /* renamed from: f */
    public final LiveData<C3503h<C5297f>> mo15077f() {
        return this.f14111h;
    }

    /* renamed from: g */
    public final LiveData<C5313r> mo15078g() {
        return this.f14112i;
    }
}
