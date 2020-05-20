package kotlinx.coroutines;

import p308k.p316w.C5859a;
import p308k.p316w.C5871g.C5876c;

/* renamed from: kotlinx.coroutines.f0 */
public final class C6084f0 extends C5859a {

    /* renamed from: g */
    public static final C6085a f15183g = new C6085a(null);

    /* renamed from: f */
    private final String f15184f;

    /* renamed from: kotlinx.coroutines.f0$a */
    public static final class C6085a implements C5876c<C6084f0> {
        private C6085a() {
        }

        public /* synthetic */ C6085a(C5938g gVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.f15184f, (java.lang.Object) ((kotlinx.coroutines.C6084f0) r2).f15184f) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlinx.coroutines.C6084f0
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.f0 r2 = (kotlinx.coroutines.C6084f0) r2
            java.lang.String r0 = r1.f15184f
            java.lang.String r2 = r2.f15184f
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6084f0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f15184f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: o */
    public final String mo15852o() {
        return this.f15184f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineName(");
        sb.append(this.f15184f);
        sb.append(')');
        return sb.toString();
    }
}
