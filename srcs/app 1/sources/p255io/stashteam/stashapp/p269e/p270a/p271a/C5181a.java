package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import p071f.p080b.p081a.p084c.C3151a;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p255io.stashteam.stashapp.p269e.p275b.p278c.C5281f;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.a */
public final class C5181a {

    /* renamed from: a */
    private final C4944a f13500a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5281f f13501b;

    /* renamed from: io.stashteam.stashapp.e.a.a.a$a */
    static final class C5182a<I, O> implements C3151a<X, Y> {

        /* renamed from: a */
        final /* synthetic */ C5181a f13502a;

        C5182a(C5181a aVar) {
            this.f13502a = aVar;
        }

        /* renamed from: a */
        public final C5294d0 mo10143a(C5180f fVar) {
            if (fVar == null) {
                return null;
            }
            return this.f13502a.f13501b.mo14853a(fVar);
        }
    }

    public C5181a(C4944a aVar, C5281f fVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(fVar, "userFromEntityMapper");
        this.f13500a = aVar;
        this.f13501b = fVar;
    }

    /* renamed from: a */
    public LiveData<C5294d0> mo14715a() {
        LiveData<C5294d0> a = C0544z.m2797a(this.f13500a.mo14136a(), new C5182a(this));
        C5942k.m22324a((Object) a, "Transformations.map(acco…yMapper.map(it)\n        }");
        return a;
    }
}
