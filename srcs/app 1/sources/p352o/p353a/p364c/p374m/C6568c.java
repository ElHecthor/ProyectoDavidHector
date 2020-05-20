package p352o.p353a.p364c.p374m;

import java.util.HashSet;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p368g.C6547a;
import p352o.p353a.p364c.p368g.C6550c;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: o.a.c.m.c */
public final class C6568c {

    /* renamed from: a */
    private final HashSet<C6532b<?>> f16223a = new HashSet<>();

    /* renamed from: b */
    private final C6560a f16224b;

    public C6568c(C6560a aVar) {
        C5942k.m22327b(aVar, "qualifier");
        this.f16224b = aVar;
    }

    /* renamed from: a */
    public final HashSet<C6532b<?>> mo17023a() {
        return this.f16223a;
    }

    /* renamed from: a */
    public final void mo17024a(C6565a aVar) {
        C5942k.m22327b(aVar, "instance");
        for (C6532b d : this.f16223a) {
            C6547a d2 = d.mo16951d();
            if (d2 != null) {
                C6550c cVar = new C6550c(null, aVar, null, 5, null);
                d2.mo16979c(cVar);
            }
        }
    }

    /* renamed from: b */
    public final C6560a mo17025b() {
        return this.f16224b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.f16224b, (java.lang.Object) ((p352o.p353a.p364c.p374m.C6568c) r2).f16224b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p352o.p353a.p364c.p374m.C6568c
            if (r0 == 0) goto L_0x0013
            o.a.c.m.c r2 = (p352o.p353a.p364c.p374m.C6568c) r2
            o.a.c.k.a r0 = r1.f16224b
            o.a.c.k.a r2 = r2.f16224b
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
        throw new UnsupportedOperationException("Method not decompiled: p352o.p353a.p364c.p374m.C6568c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C6560a aVar = this.f16224b;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScopeDefinition(qualifier=");
        sb.append(this.f16224b);
        sb.append(")");
        return sb.toString();
    }
}
