package p352o.p353a.p364c.p373l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p308k.p311c0.C5739b;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p367f.C6539b;
import p352o.p353a.p364c.p367f.C6542e;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p370i.C6556a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p377e.C6572a;

/* renamed from: o.a.c.l.a */
public final class C6562a {

    /* renamed from: a */
    private final HashSet<C6532b<?>> f16206a = new HashSet<>();

    /* renamed from: b */
    private final Map<String, C6532b<?>> f16207b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<C5739b<?>, C6532b<?>> f16208c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<C5739b<?>, ArrayList<C6532b<?>>> f16209d = new ConcurrentHashMap();

    /* renamed from: e */
    private final HashSet<C6532b<?>> f16210e = new HashSet<>();

    /* renamed from: a */
    private final ArrayList<C6532b<?>> m24802a(C5739b<?> bVar) {
        this.f16209d.put(bVar, new ArrayList());
        Object obj = this.f16209d.get(bVar);
        if (obj != null) {
            return (ArrayList) obj;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    private final C6532b<?> m24803a(String str) {
        return (C6532b) this.f16207b.get(str);
    }

    /* renamed from: a */
    private final void m24804a(HashSet<C6532b<?>> hashSet, C6532b<?> bVar) {
        if (!hashSet.add(bVar) && !bVar.mo16955g().mo16965a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Already existing definition or try to override an existing one: ");
            sb.append(bVar);
            throw new C6539b(sb.toString());
        }
    }

    /* renamed from: a */
    private final void m24805a(C5739b<?> bVar, C6532b<?> bVar2) {
        if (this.f16208c.get(bVar) == null || bVar2.mo16955g().mo16965a()) {
            this.f16208c.put(bVar, bVar2);
            if (C6523b.f16161c.mo16943b().mo16985a(C6554b.INFO)) {
                C6555c b = C6523b.f16161c.mo16943b();
                StringBuilder sb = new StringBuilder();
                sb.append("bind type:'");
                sb.append(C6572a.m24854a(bVar));
                sb.append("' ~ ");
                sb.append(bVar2);
                b.mo16987c(sb.toString());
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Already existing definition or try to override an existing one with type '");
        sb2.append(bVar);
        sb2.append("' and ");
        sb2.append(bVar2);
        sb2.append(" but has already registered ");
        sb2.append((C6532b) this.f16208c.get(bVar));
        throw new C6539b(sb2.toString());
    }

    /* renamed from: a */
    private final void m24806a(C6532b<?> bVar, C5739b<?> bVar2) {
        ArrayList arrayList = (ArrayList) this.f16209d.get(bVar2);
        if (arrayList == null) {
            arrayList = m24802a(bVar2);
        }
        arrayList.add(bVar);
        if (C6523b.f16161c.mo16943b().mo16985a(C6554b.INFO)) {
            C6555c b = C6523b.f16161c.mo16943b();
            StringBuilder sb = new StringBuilder();
            sb.append("bind secondary type:'");
            sb.append(C6572a.m24854a(bVar2));
            sb.append("' ~ ");
            sb.append(bVar);
            b.mo16987c(sb.toString());
        }
    }

    /* renamed from: a */
    private final void m24807a(C6556a aVar) {
        for (C6532b a : aVar.mo16988a()) {
            mo17002a(a);
        }
    }

    /* renamed from: b */
    private final C6532b<?> m24808b(C5739b<?> bVar) {
        ArrayList arrayList = (ArrayList) this.f16209d.get(bVar);
        if (arrayList != null && arrayList.size() == 1) {
            return (C6532b) arrayList.get(0);
        }
        if (arrayList == null || arrayList.size() <= 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Found multiple definitions for type '");
        sb.append(C6572a.m24854a(bVar));
        sb.append("': ");
        sb.append(arrayList);
        sb.append(". Please use the 'bind<P,S>()' function to bind your instance from primary and secondary types.");
        throw new C6542e(sb.toString());
    }

    /* renamed from: b */
    private final void m24809b(C6532b<?> bVar) {
        C6560a j = bVar.mo16959j();
        if (j == null) {
            return;
        }
        if (this.f16207b.get(j.toString()) == null || bVar.mo16955g().mo16965a()) {
            this.f16207b.put(j.toString(), bVar);
            if (C6523b.f16161c.mo16943b().mo16985a(C6554b.INFO)) {
                C6555c b = C6523b.f16161c.mo16943b();
                StringBuilder sb = new StringBuilder();
                sb.append("bind qualifier:'");
                sb.append(bVar.mo16959j());
                sb.append("' ~ ");
                sb.append(bVar);
                b.mo16987c(sb.toString());
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Already existing definition or try to override an existing one with qualifier '");
        sb2.append(j);
        sb2.append("' with ");
        sb2.append(bVar);
        sb2.append(" but has already registered ");
        sb2.append((C6532b) this.f16207b.get(j.toString()));
        throw new C6539b(sb2.toString());
    }

    /* renamed from: c */
    private final C6532b<?> m24810c(C5739b<?> bVar) {
        return (C6532b) this.f16208c.get(bVar);
    }

    /* renamed from: c */
    private final void m24811c(C6532b<?> bVar) {
        for (C5739b a : bVar.mo16961l()) {
            m24806a(bVar, a);
        }
    }

    /* renamed from: d */
    private final void m24812d(C6532b<?> bVar) {
        this.f16210e.add(bVar);
    }

    /* renamed from: e */
    private final void m24813e(C6532b<?> bVar) {
        m24805a(bVar.mo16956h(), bVar);
    }

    /* renamed from: a */
    public final C6532b<?> mo16999a(C6560a aVar, C5739b<?> bVar) {
        C5942k.m22327b(bVar, "clazz");
        if (aVar != null) {
            return m24803a(aVar.toString());
        }
        C6532b<?> c = m24810c(bVar);
        return c != null ? c : m24808b(bVar);
    }

    /* renamed from: a */
    public final void mo17000a() {
        for (C6532b a : this.f16206a) {
            a.mo16946a();
        }
        this.f16206a.clear();
        this.f16207b.clear();
        this.f16208c.clear();
        this.f16210e.clear();
    }

    /* renamed from: a */
    public final void mo17001a(Iterable<C6556a> iterable) {
        C5942k.m22327b(iterable, "modules");
        for (C6556a a : iterable) {
            m24807a(a);
        }
    }

    /* renamed from: a */
    public final void mo17002a(C6532b<?> bVar) {
        C5942k.m22327b(bVar, "definition");
        m24804a(this.f16206a, bVar);
        bVar.mo16949b();
        if (bVar.mo16959j() != null) {
            m24809b(bVar);
        } else {
            m24813e(bVar);
        }
        if (!bVar.mo16961l().isEmpty()) {
            m24811c(bVar);
        }
        if (bVar.mo16955g().mo16967b()) {
            m24812d(bVar);
        }
    }

    /* renamed from: b */
    public final Set<C6532b<?>> mo17003b() {
        return this.f16210e;
    }

    /* renamed from: c */
    public final Set<C6532b<?>> mo17004c() {
        return this.f16206a;
    }
}
