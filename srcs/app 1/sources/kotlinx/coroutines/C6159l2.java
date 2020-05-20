package kotlinx.coroutines;

import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.l2 */
final class C6159l2<T> extends C5960a2<C6014b2> {

    /* renamed from: j */
    private final C6152k<T> f15274j;

    public C6159l2(C6014b2 b2Var, C6152k<? super T> kVar) {
        C5942k.m22327b(b2Var, "job");
        C5942k.m22327b(kVar, "continuation");
        super(b2Var);
        this.f15274j = kVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15751d((Throwable) obj);
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public void mo15751d(Throwable th) {
        Object m = ((C6014b2) this.f14955i).mo15743m();
        if (C6157l0.m23149a() && !(!(m instanceof C6174p1))) {
            throw new AssertionError();
        } else if (m instanceof C6193t) {
            this.f15274j.mo15939a(((C6193t) m).f15300a, 0);
        } else {
            C6152k<T> kVar = this.f15274j;
            Object b = C6041c2.m22707b(m);
            C5804a aVar = C5803m.f14866f;
            C5803m.m22049a(b);
            kVar.mo15391b(b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResumeAwaitOnCompletion[");
        sb.append(this.f15274j);
        sb.append(']');
        return sb.toString();
    }
}
