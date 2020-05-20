package p255io.stashteam.stashapp.p269e.p275b.p278c;

import p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d;
import p255io.stashteam.stashapp.p269e.p280c.C5290c;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.c.d */
public final class C5279d {

    /* renamed from: a */
    private final C5277b f13815a;

    /* renamed from: b */
    private final C5278c f13816b;

    public C5279d(C5277b bVar, C5278c cVar) {
        C5942k.m22327b(bVar, "gameReviewMapper");
        C5942k.m22327b(cVar, "imageFromEntityMapper");
        this.f13815a = bVar;
        this.f13816b = cVar;
    }

    /* renamed from: a */
    public C5323z mo14851a(C5178d dVar) {
        C5942k.m22327b(dVar, "from");
        long e = dVar.mo14382e();
        String f = dVar.mo14384f();
        C5177c b = dVar.mo14379b();
        C5323z zVar = new C5323z(e, f, b != null ? this.f13816b.mo14850a(b) : null, C5290c.f13844j.mo14868a(dVar.mo14378a()), dVar.mo14381d() != null ? this.f13815a.mo14849a(dVar.mo14381d()) : null);
        return zVar;
    }
}
