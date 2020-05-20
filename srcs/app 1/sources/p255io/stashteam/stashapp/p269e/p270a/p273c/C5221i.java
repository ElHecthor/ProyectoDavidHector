package p255io.stashteam.stashapp.p269e.p270a.p273c;

import p071f.p080b.p081a.p084c.C3151a;
import p071f.p131r.C3490d.C3492b;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5175a;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p275b.p278c.C5276a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.i */
public final class C5221i {

    /* renamed from: a */
    private final C4957b f13629a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5276a f13630b;

    /* renamed from: io.stashteam.stashapp.e.a.c.i$a */
    static final class C5222a<I, O> implements C3151a<Value, ToValue> {

        /* renamed from: a */
        final /* synthetic */ C5221i f13631a;

        C5222a(C5221i iVar) {
            this.f13631a = iVar;
        }

        /* renamed from: a */
        public final C5297f mo10143a(C5175a aVar) {
            C5276a a = this.f13631a.f13630b;
            C5942k.m22324a((Object) aVar, "customList");
            return a.mo14848a(aVar);
        }
    }

    public C5221i(C4957b bVar, C5276a aVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        C5942k.m22327b(aVar, "customListFromEntityMapper");
        this.f13629a = bVar;
        this.f13630b = aVar;
    }

    /* renamed from: a */
    public C3492b<Integer, C5297f> mo14770a() {
        C3492b<Integer, C5297f> a = this.f13629a.mo14154a().mo11131a(new C5222a(this));
        C5942k.m22324a((Object) a, "customListsRepository.ge…map(customList)\n        }");
        return a;
    }
}
