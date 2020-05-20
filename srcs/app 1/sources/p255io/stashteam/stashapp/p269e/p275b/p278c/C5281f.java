package p255io.stashteam.stashapp.p269e.p275b.p278c;

import p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f;
import p255io.stashteam.stashapp.p269e.p280c.C5287b;
import p255io.stashteam.stashapp.p269e.p280c.C5292c0;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.c.f */
public final class C5281f {

    /* renamed from: a */
    private final C5280e f13817a;

    public C5281f(C5280e eVar) {
        C5942k.m22327b(eVar, "statisticFromEntityMapper");
        this.f13817a = eVar;
    }

    /* renamed from: a */
    public C5294d0 mo14853a(C5180f fVar) {
        C5942k.m22327b(fVar, "from");
        long d = fVar.mo14399d();
        String f = fVar.mo14402f();
        String c = fVar.mo14398c();
        if (c == null) {
            c = "";
        }
        String str = c;
        String a = fVar.mo14395a();
        String e = fVar.mo14400e();
        C5179e g = fVar.mo14403g();
        C5292c0 a2 = g != null ? this.f13817a.mo14852a(g) : null;
        String b = fVar.mo14397b();
        C5294d0 d0Var = new C5294d0(d, f, str, a, e, a2, b != null ? C5287b.valueOf(b) : null, fVar.mo14404h());
        return d0Var;
    }
}
