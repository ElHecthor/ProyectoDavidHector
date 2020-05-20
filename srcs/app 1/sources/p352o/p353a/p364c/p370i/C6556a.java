package p352o.p353a.p364c.p370i;

import java.util.ArrayList;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p366e.C6536e;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p376d.C6571b;

/* renamed from: o.a.c.i.a */
public final class C6556a {

    /* renamed from: a */
    private final ArrayList<C6532b<?>> f16200a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C6571b> f16201b = new ArrayList<>();

    /* renamed from: c */
    private final boolean f16202c;

    /* renamed from: d */
    private final boolean f16203d;

    public C6556a(boolean z, boolean z2) {
        this.f16202c = z;
        this.f16203d = z2;
    }

    /* renamed from: b */
    private final void m24790b(C6532b<?> bVar, C6536e eVar) {
        boolean z = false;
        bVar.mo16955g().mo16964a(eVar.mo16967b() || this.f16202c);
        C6536e g = bVar.mo16955g();
        if (eVar.mo16965a() || this.f16203d) {
            z = true;
        }
        g.mo16966b(z);
    }

    /* renamed from: a */
    public final ArrayList<C6532b<?>> mo16988a() {
        return this.f16200a;
    }

    /* renamed from: a */
    public final <T> void mo16989a(C6532b<T> bVar, C6536e eVar) {
        C5942k.m22327b(bVar, "definition");
        C5942k.m22327b(eVar, "options");
        m24790b(bVar, eVar);
        this.f16200a.add(bVar);
    }

    /* renamed from: a */
    public final void mo16990a(C6560a aVar, C5918l<? super C6571b, C5812t> lVar) {
        C5942k.m22327b(aVar, "scopeName");
        C5942k.m22327b(lVar, "scopeSet");
        C6571b bVar = new C6571b(aVar);
        lVar.mo4090d(bVar);
        mo16991a(bVar);
    }

    /* renamed from: a */
    public final void mo16991a(C6571b bVar) {
        C5942k.m22327b(bVar, "scope");
        this.f16201b.add(bVar);
    }

    /* renamed from: b */
    public final ArrayList<C6571b> mo16992b() {
        return this.f16201b;
    }
}
