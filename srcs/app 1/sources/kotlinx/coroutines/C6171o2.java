package kotlinx.coroutines;

import kotlinx.coroutines.p332e3.C6081d;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.o2 */
final class C6171o2<T, R> extends C5960a2<C6014b2> {

    /* renamed from: j */
    private final C6081d<R> f15283j;

    /* renamed from: k */
    private final C5922p<T, C5866d<? super R>, Object> f15284k;

    public C6171o2(C6014b2 b2Var, C6081d<? super R> dVar, C5922p<? super T, ? super C5866d<? super R>, ? extends Object> pVar) {
        C5942k.m22327b(b2Var, "job");
        C5942k.m22327b(dVar, "select");
        C5942k.m22327b(pVar, "block");
        super(b2Var);
        this.f15283j = dVar;
        this.f15284k = pVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15751d((Throwable) obj);
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public void mo15751d(Throwable th) {
        if (this.f15283j.mo15843a((Object) null)) {
            ((C6014b2) this.f14955i).mo15729c(this.f15283j, this.f15284k);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SelectAwaitOnCompletion[");
        sb.append(this.f15283j);
        sb.append(']');
        return sb.toString();
    }
}
