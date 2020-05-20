package kotlinx.coroutines;

import kotlinx.coroutines.C6191s2.C6192a;
import p308k.p316w.C5859a;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.e0 */
public final class C6067e0 extends C5859a implements C6191s2<String> {

    /* renamed from: g */
    public static final C6068a f15161g = new C6068a(null);

    /* renamed from: f */
    private final long f15162f;

    /* renamed from: kotlinx.coroutines.e0$a */
    public static final class C6068a implements C5876c<C6067e0> {
        private C6068a() {
        }

        public /* synthetic */ C6068a(C5938g gVar) {
            this();
        }
    }

    public C6067e0(long j) {
        super(f15161g);
        this.f15162f = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r9 != null) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m22828a(p308k.p316w.C5871g r9) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            p308k.p323z.p325d.C5942k.m22327b(r9, r0)
            kotlinx.coroutines.f0$a r0 = kotlinx.coroutines.C6084f0.f15183g
            k.w.g$b r9 = r9.get(r0)
            kotlinx.coroutines.f0 r9 = (kotlinx.coroutines.C6084f0) r9
            if (r9 == 0) goto L_0x0016
            java.lang.String r9 = r9.mo15852o()
            if (r9 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            java.lang.String r9 = "coroutine"
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            p308k.p323z.p325d.C5942k.m22324a(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "oldName"
            p308k.p323z.p325d.C5942k.m22324a(r1, r2)
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            java.lang.String r3 = " @"
            r2 = r1
            int r2 = p308k.p313e0.C5788q.m22013b(r2, r3, r4, r5, r6, r7)
            if (r2 >= 0) goto L_0x003b
            int r2 = r1.length()
        L_0x003b:
            int r3 = r9.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r9)
            r9 = 35
            r4.append(r9)
            long r2 = r8.f15162f
            r4.append(r2)
            java.lang.String r9 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            p308k.p323z.p325d.C5942k.m22324a(r9, r2)
            r0.setName(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6067e0.m22828a(k.w.g):java.lang.String");
    }

    /* renamed from: a */
    public void mo15817a(C5871g gVar, String str) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(str, "oldState");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6067e0) {
                if (this.f15162f == ((C6067e0) obj).f15162f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return C6192a.m23215a(this, r, pVar);
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        return C6192a.m23216a((C6191s2<S>) this, cVar);
    }

    public int hashCode() {
        long j = this.f15162f;
        return (int) (j ^ (j >>> 32));
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return C6192a.m23218b(this, cVar);
    }

    /* renamed from: o */
    public final long mo15821o() {
        return this.f15162f;
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return C6192a.m23217a((C6191s2<S>) this, gVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineId(");
        sb.append(this.f15162f);
        sb.append(')');
        return sb.toString();
    }
}
