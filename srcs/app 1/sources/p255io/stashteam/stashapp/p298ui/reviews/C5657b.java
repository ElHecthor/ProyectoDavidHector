package p255io.stashteam.stashapp.p298ui.reviews;

import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.C6089g0;
import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3497e;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5320w;
import p255io.stashteam.stashapp.p269e.p280c.C5321x;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5333a;
import p255io.stashteam.stashapp.p281f.p282a.p284f.C5336b;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p255io.stashteam.stashapp.utils.p305g.C5717c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.reviews.b */
public final class C5657b extends C5345a {

    /* renamed from: g */
    private final C5336b<C5320w, C5247j, C5248a> f14697g;

    /* renamed from: h */
    private final LiveData<C3503h<C5320w>> f14698h;

    /* renamed from: i */
    private final LiveData<C5313r> f14699i;

    /* renamed from: io.stashteam.stashapp.ui.reviews.b$a */
    static final class C5658a<I, O> implements C3151a<X, LiveData<Y>> {

        /* renamed from: a */
        public static final C5658a f14700a = new C5658a();

        C5658a() {
        }

        /* renamed from: a */
        public final LiveData<C5313r> mo10143a(C5333a<C5320w, C5247j, C5248a> aVar) {
            return aVar.mo15034e();
        }
    }

    public C5657b(C5321x xVar, long j, C5247j jVar) {
        C5942k.m22327b(xVar, "listType");
        C5942k.m22327b(jVar, "getReviewsInteractor");
        C6089g0 e = mo15050e();
        C5248a aVar = new C5248a(xVar, j, 20, 0);
        C5336b<C5320w, C5247j, C5248a> bVar = new C5336b<>(e, jVar, aVar);
        this.f14697g = bVar;
        LiveData<C3503h<C5320w>> a = new C3497e(bVar, C5717c.f14802b.mo15355a()).mo11139a();
        C5942k.m22324a((Object) a, "LivePagedListBuilder(dat….pagedListConfig).build()");
        this.f14698h = a;
        LiveData<C5313r> b = C0544z.m2798b(this.f14697g.mo15036b(), C5658a.f14700a);
        C5942k.m22324a((Object) b, "Transformations.switchMa…ce) { it.initialLoading }");
        this.f14699i = b;
    }

    /* renamed from: f */
    public final LiveData<C5313r> mo15270f() {
        return this.f14699i;
    }

    /* renamed from: g */
    public final LiveData<C3503h<C5320w>> mo15271g() {
        return this.f14698h;
    }
}
