package p352o.p353a.p364c.p373l;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.C6522a;
import p352o.p353a.p364c.p367f.C6544g;
import p352o.p353a.p364c.p367f.C6545h;
import p352o.p353a.p364c.p370i.C6556a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p364c.p374m.C6568c;
import p352o.p353a.p376d.C6571b;

/* renamed from: o.a.c.l.c */
public final class C6564c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C6568c> f16211a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final ConcurrentHashMap<String, C6565a> f16212b = new ConcurrentHashMap<>();

    /* renamed from: a */
    private final void m24820a(C6556a aVar) {
        for (C6571b a : aVar.mo16992b()) {
            m24822a(a);
        }
    }

    /* renamed from: a */
    private final void m24821a(C6565a aVar) {
        if (this.f16212b.get(aVar.mo17017e()) == null) {
            m24823b(aVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("A scope with id '");
        sb.append(aVar.mo17017e());
        sb.append("' already exists. Reuse or close it.");
        throw new C6545h(sb.toString());
    }

    /* renamed from: a */
    private final void m24822a(C6571b bVar) {
        C6568c cVar = (C6568c) this.f16211a.get(bVar.mo17032c().toString());
        if (cVar == null) {
            this.f16211a.put(bVar.mo17032c().toString(), bVar.mo17029a());
        } else {
            cVar.mo17023a().addAll(bVar.mo17031b());
        }
    }

    /* renamed from: b */
    private final void m24823b(C6565a aVar) {
        this.f16212b.put(aVar.mo17017e(), aVar);
    }

    /* renamed from: a */
    public final Collection<C6568c> mo17005a() {
        Collection<C6568c> values = this.f16211a.values();
        C5942k.m22324a((Object) values, "definitions.values");
        return values;
    }

    /* renamed from: a */
    public final C6565a mo17006a(C6522a aVar, String str, C6560a aVar2) {
        C5942k.m22327b(aVar, "koin");
        C5942k.m22327b(str, "id");
        C5942k.m22327b(aVar2, "scopeName");
        C6568c cVar = (C6568c) this.f16211a.get(aVar2.toString());
        if (cVar != null) {
            C6565a aVar3 = new C6565a(str, false, aVar, 2, null);
            aVar3.mo17013a(cVar);
            aVar3.mo17015c();
            m24821a(aVar3);
            return aVar3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No scope definition found for scopeName '");
        sb.append(aVar2);
        sb.append('\'');
        throw new C6544g(sb.toString());
    }

    /* renamed from: a */
    public final void mo17007a(Iterable<C6556a> iterable) {
        C5942k.m22327b(iterable, "modules");
        for (C6556a a : iterable) {
            m24820a(a);
        }
    }

    /* renamed from: a */
    public final void mo17008a(String str) {
        C5942k.m22327b(str, "id");
        this.f16212b.remove(str);
    }

    /* renamed from: a */
    public final void mo17009a(C6522a aVar) {
        C5942k.m22327b(aVar, "koin");
        m24823b(aVar.mo16935b());
    }

    /* renamed from: b */
    public final C6565a mo17010b(String str) {
        C5942k.m22327b(str, "id");
        return (C6565a) this.f16212b.get(str);
    }
}
