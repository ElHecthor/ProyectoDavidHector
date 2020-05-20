package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.lifecycle.C0544z;
import androidx.lifecycle.LiveData;
import p071f.p080b.p081a.p084c.C3151a;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p275b.p278c.C5276a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.g */
public final class C5218g {

    /* renamed from: a */
    private final C4957b f13625a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5276a f13626b;

    /* renamed from: io.stashteam.stashapp.e.a.c.g$a */
    public static final class C5219a<I, O> implements C3151a<C5175a, C5297f> {

        /* renamed from: a */
        final /* synthetic */ C5218g f13627a;

        public C5219a(C5218g gVar) {
            this.f13627a = gVar;
        }

        /* renamed from: a */
        public final C5297f mo10143a(C5175a aVar) {
            C5175a aVar2 = aVar;
            if (aVar2 != null) {
                return this.f13627a.f13626b.mo14848a(aVar2);
            }
            return null;
        }
    }

    public C5218g(C4957b bVar, C5276a aVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        C5942k.m22327b(aVar, "customListFromEntityMapper");
        this.f13625a = bVar;
        this.f13626b = aVar;
    }

    /* renamed from: a */
    public LiveData<C5297f> mo14768a(long j) {
        LiveData<C5297f> a = C0544z.m2797a(this.f13625a.mo14153a(j), new C5219a(this));
        C5942k.m22324a((Object) a, "Transformations.map(this) { transform(it) }");
        return a;
    }
}
