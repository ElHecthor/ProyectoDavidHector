package kotlinx.coroutines;

import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.n */
public final class C6164n extends C6209w1<C6199u1> {

    /* renamed from: j */
    public final C6152k<?> f15276j;

    public C6164n(C6199u1 u1Var, C6152k<?> kVar) {
        C5942k.m22327b(u1Var, "parent");
        C5942k.m22327b(kVar, "child");
        super(u1Var);
        this.f15276j = kVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15751d((Throwable) obj);
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public void mo15751d(Throwable th) {
        C6152k<?> kVar = this.f15276j;
        kVar.mo15935b(kVar.mo15749a((C6199u1) this.f14955i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildContinuation[");
        sb.append(this.f15276j);
        sb.append(']');
        return sb.toString();
    }
}
