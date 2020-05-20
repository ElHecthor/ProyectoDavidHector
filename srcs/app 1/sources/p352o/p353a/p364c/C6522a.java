package p352o.p353a.p364c;

import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p373l.C6563b;
import p352o.p353a.p364c.p373l.C6564c;
import p352o.p353a.p364c.p374m.C6565a;

/* renamed from: o.a.c.a */
public final class C6522a {

    /* renamed from: a */
    private final C6564c f16158a = new C6564c();

    /* renamed from: b */
    private final C6565a f16159b;

    public C6522a() {
        new C6563b();
        this.f16159b = new C6565a("-Root-", true, this);
    }

    /* renamed from: a */
    public final C6565a mo16932a(String str, C6560a aVar) {
        C5942k.m22327b(str, "scopeId");
        C5942k.m22327b(aVar, "qualifier");
        if (C6523b.f16161c.mo16943b().mo16985a(C6554b.DEBUG)) {
            C6555c b = C6523b.f16161c.mo16943b();
            StringBuilder sb = new StringBuilder();
            sb.append("!- create scope - id:");
            sb.append(str);
            sb.append(" q:");
            sb.append(aVar);
            b.mo16984a(sb.toString());
        }
        return this.f16158a.mo17006a(this, str, aVar);
    }

    /* renamed from: a */
    public final void mo16933a() {
        this.f16159b.mo17014b();
    }

    /* renamed from: a */
    public final void mo16934a(String str) {
        C5942k.m22327b(str, "scopeId");
        this.f16158a.mo17008a(str);
    }

    /* renamed from: b */
    public final C6565a mo16935b() {
        return this.f16159b;
    }

    /* renamed from: b */
    public final C6565a mo16936b(String str) {
        C5942k.m22327b(str, "scopeId");
        return this.f16158a.mo17010b(str);
    }

    /* renamed from: c */
    public final C6564c mo16937c() {
        return this.f16158a;
    }
}
