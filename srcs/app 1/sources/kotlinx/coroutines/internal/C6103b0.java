package kotlinx.coroutines.internal;

import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.b0 */
public final class C6103b0 implements C5876c<C6101a0<?>> {

    /* renamed from: a */
    private final ThreadLocal<?> f15196a;

    public C6103b0(ThreadLocal<?> threadLocal) {
        C5942k.m22327b(threadLocal, "threadLocal");
        this.f15196a = threadLocal;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r1.f15196a, (java.lang.Object) ((kotlinx.coroutines.internal.C6103b0) r2).f15196a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.C6103b0
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.internal.b0 r2 = (kotlinx.coroutines.internal.C6103b0) r2
            java.lang.ThreadLocal<?> r0 = r1.f15196a
            java.lang.ThreadLocal<?> r2 = r2.f15196a
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
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6103b0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ThreadLocal<?> threadLocal = this.f15196a;
        if (threadLocal != null) {
            return threadLocal.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThreadLocalKey(threadLocal=");
        sb.append(this.f15196a);
        sb.append(")");
        return sb.toString();
    }
}
