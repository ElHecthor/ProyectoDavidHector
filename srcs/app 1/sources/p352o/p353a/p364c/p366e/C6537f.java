package p352o.p353a.p364c.p366e;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: o.a.c.e.f */
public final class C6537f {

    /* renamed from: a */
    private final Map<String, Object> f16187a;

    public C6537f() {
        this(null, 1, null);
    }

    public C6537f(Map<String, Object> map) {
        C5942k.m22327b(map, "data");
        this.f16187a = map;
    }

    public /* synthetic */ C6537f(Map map, int i, C5938g gVar) {
        if ((i & 1) != 0) {
            map = new ConcurrentHashMap();
        }
        this(map);
    }

    /* renamed from: a */
    public final <T> void mo16971a(String str, T t) {
        C5942k.m22327b(str, "key");
        Map<String, Object> map = this.f16187a;
        if (t != null) {
            map.put(str, t);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Any");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.f16187a, (java.lang.Object) ((p352o.p353a.p364c.p366e.C6537f) r2).f16187a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p352o.p353a.p364c.p366e.C6537f
            if (r0 == 0) goto L_0x0013
            o.a.c.e.f r2 = (p352o.p353a.p364c.p366e.C6537f) r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f16187a
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f16187a
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
        throw new UnsupportedOperationException("Method not decompiled: p352o.p353a.p364c.p366e.C6537f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Map<String, Object> map = this.f16187a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Properties(data=");
        sb.append(this.f16187a);
        sb.append(")");
        return sb.toString();
    }
}
