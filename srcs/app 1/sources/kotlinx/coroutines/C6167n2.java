package kotlinx.coroutines;

import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.n2 */
final class C6167n2 extends C5960a2<C6199u1> {

    /* renamed from: j */
    private final C5866d<C5812t> f15280j;

    public C6167n2(C6199u1 u1Var, C5866d<? super C5812t> dVar) {
        C5942k.m22327b(u1Var, "job");
        C5942k.m22327b(dVar, "continuation");
        super(u1Var);
        this.f15280j = dVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15751d((Throwable) obj);
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public void mo15751d(Throwable th) {
        C5866d<C5812t> dVar = this.f15280j;
        C5812t tVar = C5812t.f14872a;
        C5804a aVar = C5803m.f14866f;
        C5803m.m22049a(tVar);
        dVar.mo15391b(tVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResumeOnCompletion[");
        sb.append(this.f15280j);
        sb.append(']');
        return sb.toString();
    }
}
