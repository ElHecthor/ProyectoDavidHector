package p352o.p353a.p364c.p372k;

import p308k.p311c0.C5739b;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p377e.C6572a;

/* renamed from: o.a.c.k.b */
public final class C6561b implements C6560a {

    /* renamed from: a */
    private final C5739b<?> f16205a;

    public C6561b(C5739b<?> bVar) {
        C5942k.m22327b(bVar, "type");
        this.f16205a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.f16205a, (java.lang.Object) ((p352o.p353a.p364c.p372k.C6561b) r2).f16205a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p352o.p353a.p364c.p372k.C6561b
            if (r0 == 0) goto L_0x0013
            o.a.c.k.b r2 = (p352o.p353a.p364c.p372k.C6561b) r2
            k.c0.b<?> r0 = r1.f16205a
            k.c0.b<?> r2 = r2.f16205a
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
        throw new UnsupportedOperationException("Method not decompiled: p352o.p353a.p364c.p372k.C6561b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C5739b<?> bVar = this.f16205a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C6572a.m24854a(this.f16205a);
    }
}
