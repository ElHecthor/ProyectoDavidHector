package p308k;

import java.io.Serializable;

/* renamed from: k.l */
public final class C5802l<A, B> implements Serializable {

    /* renamed from: f */
    private final A f14864f;

    /* renamed from: g */
    private final B f14865g;

    public C5802l(A a, B b) {
        this.f14864f = a;
        this.f14865g = b;
    }

    /* renamed from: a */
    public final A mo15418a() {
        return this.f14864f;
    }

    /* renamed from: b */
    public final B mo15419b() {
        return this.f14865g;
    }

    /* renamed from: c */
    public final A mo15420c() {
        return this.f14864f;
    }

    /* renamed from: d */
    public final B mo15421d() {
        return this.f14865g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f14865g, (java.lang.Object) r3.f14865g) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p308k.C5802l
            if (r0 == 0) goto L_0x001d
            k.l r3 = (p308k.C5802l) r3
            A r0 = r2.f14864f
            A r1 = r3.f14864f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f14865g
            B r3 = r3.f14865g
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.C5802l.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f14864f;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f14865g;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f14864f);
        sb.append(", ");
        sb.append(this.f14865g);
        sb.append(')');
        return sb.toString();
    }
}
