package p255io.stashteam.stashapp.p281f.p282a.p284f;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlinx.coroutines.C6089g0;
import p071f.p131r.C3518l;
import p071f.p131r.C3518l.C3520b;
import p071f.p131r.C3518l.C3522d;
import p071f.p131r.C3518l.C3523e;
import p071f.p131r.C3518l.C3525g;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.f.a */
public final class C5333a<T, I extends C5201a<? super P, ? extends List<? extends T>>, P extends C5715a<? extends P>> extends C3518l<T> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C0532t<C5313r> f14009c = new C0532t<>();

    /* renamed from: d */
    private final C6089g0 f14010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final I f14011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final P f14012f;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.base.datasource.GeneralDataSource$loadInitial$1", mo15594f = "GeneralDataSource.kt", mo15595l = {25}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.a.f.a$a */
    static final class C5334a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14013j;

        /* renamed from: k */
        Object f14014k;

        /* renamed from: l */
        int f14015l;

        /* renamed from: m */
        final /* synthetic */ C5333a f14016m;

        /* renamed from: n */
        final /* synthetic */ C3520b f14017n;

        C5334a(C5333a aVar, C3520b bVar, C5866d dVar) {
            this.f14016m = aVar;
            this.f14017n = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14015l;
            boolean z = true;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14013j;
                this.f14016m.f14009c.mo2981b(C5313r.LOADING);
                C5201a a2 = this.f14016m.f14011e;
                C5715a b = this.f14016m.f14012f;
                this.f14014k = g0Var;
                this.f14015l = 1;
                obj = a2.mo14718a(b, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14014k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) obj;
            this.f14017n.mo11217a(list, 0);
            C0532t c = this.f14016m.f14009c;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            c.mo2981b(z ? C5313r.EMPTY_LIST : C5313r.SUCCESS);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5334a aVar = new C5334a(this.f14016m, this.f14017n, dVar);
            aVar.f14013j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5334a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.base.datasource.GeneralDataSource$loadRange$1", mo15594f = "GeneralDataSource.kt", mo15595l = {39}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.a.f.a$b */
    static final class C5335b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14018j;

        /* renamed from: k */
        Object f14019k;

        /* renamed from: l */
        int f14020l;

        /* renamed from: m */
        final /* synthetic */ C5333a f14021m;

        /* renamed from: n */
        final /* synthetic */ C3525g f14022n;

        /* renamed from: o */
        final /* synthetic */ C3523e f14023o;

        C5335b(C5333a aVar, C3525g gVar, C3523e eVar, C5866d dVar) {
            this.f14021m = aVar;
            this.f14022n = gVar;
            this.f14023o = eVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14020l;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14018j;
                C5201a a2 = this.f14021m.f14011e;
                C5715a b = this.f14021m.f14012f;
                C3525g gVar = this.f14022n;
                Object a3 = b.mo14753a(gVar.f9993b, gVar.f9992a);
                this.f14019k = g0Var;
                this.f14020l = 1;
                obj = a2.mo14718a(a3, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                C6089g0 g0Var2 = (C6089g0) this.f14019k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f14023o.mo11219a((List) obj);
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5335b bVar = new C5335b(this.f14021m, this.f14022n, this.f14023o, dVar);
            bVar.f14018j = (C6089g0) obj;
            return bVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5335b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5333a(C6089g0 g0Var, I i, P p) {
        C5942k.m22327b(g0Var, "scope");
        C5942k.m22327b(i, "interactor");
        C5942k.m22327b(p, "requestParams");
        this.f14010d = g0Var;
        this.f14011e = i;
        this.f14012f = p;
    }

    /* renamed from: a */
    public void mo4144a(C3522d dVar, C3520b<T> bVar) {
        C5942k.m22327b(dVar, "params");
        C5942k.m22327b(bVar, "callback");
        C6088g.m22903b(this.f14010d, null, null, new C5334a(this, bVar, null), 3, null);
    }

    /* renamed from: a */
    public void mo4145a(C3525g gVar, C3523e<T> eVar) {
        C5942k.m22327b(gVar, "params");
        C5942k.m22327b(eVar, "callback");
        if (gVar.f9993b > gVar.f9992a) {
            eVar.mo11219a(C5837l.m22159a());
        } else {
            C6088g.m22903b(this.f14010d, null, null, new C5335b(this, gVar, eVar, null), 3, null);
        }
    }

    /* renamed from: e */
    public final LiveData<C5313r> mo15034e() {
        return this.f14009c;
    }
}
