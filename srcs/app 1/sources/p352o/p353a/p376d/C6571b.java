package p352o.p353a.p376d;

import java.util.HashSet;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p366e.C6536e;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6568c;

/* renamed from: o.a.d.b */
public final class C6571b {

    /* renamed from: a */
    private final HashSet<C6532b<?>> f16225a = new HashSet<>();

    /* renamed from: b */
    private final C6560a f16226b;

    public C6571b(C6560a aVar) {
        C5942k.m22327b(aVar, "qualifier");
        this.f16226b = aVar;
    }

    /* renamed from: b */
    private final void m24849b(C6532b<?> bVar, C6536e eVar) {
        bVar.mo16955g().mo16964a(eVar.mo16967b());
        bVar.mo16955g().mo16966b(eVar.mo16965a());
    }

    /* renamed from: a */
    public final C6568c mo17029a() {
        C6568c cVar = new C6568c(this.f16226b);
        cVar.mo17023a().addAll(this.f16225a);
        return cVar;
    }

    /* renamed from: a */
    public final <T> void mo17030a(C6532b<T> bVar, C6536e eVar) {
        C5942k.m22327b(bVar, "definition");
        C5942k.m22327b(eVar, "options");
        m24849b(bVar, eVar);
    }

    /* renamed from: b */
    public final HashSet<C6532b<?>> mo17031b() {
        return this.f16225a;
    }

    /* renamed from: c */
    public final C6560a mo17032c() {
        return this.f16226b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.f16226b, (java.lang.Object) ((p352o.p353a.p376d.C6571b) r2).f16226b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p352o.p353a.p376d.C6571b
            if (r0 == 0) goto L_0x0013
            o.a.d.b r2 = (p352o.p353a.p376d.C6571b) r2
            o.a.c.k.a r0 = r1.f16226b
            o.a.c.k.a r2 = r2.f16226b
            boolean r2 = p308k.p323z.p325d.C5942k.m22326a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p352o.p353a.p376d.C6571b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C6560a aVar = this.f16226b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scope['");
        sb.append(this.f16226b);
        sb.append("']");
        return sb.toString();
    }
}
