package kotlinx.coroutines;

import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.p */
public final class C6172p extends C6209w1<C6014b2> implements C6168o {

    /* renamed from: j */
    public final C6176q f15285j;

    public C6172p(C6014b2 b2Var, C6176q qVar) {
        C5942k.m22327b(b2Var, "parent");
        C5942k.m22327b(qVar, "childJob");
        super(b2Var);
        this.f15285j = qVar;
    }

    /* renamed from: c */
    public boolean mo15857c(Throwable th) {
        C5942k.m22327b(th, "cause");
        return ((C6014b2) this.f14955i).mo15732e(th);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15751d((Throwable) obj);
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public void mo15751d(Throwable th) {
        this.f15285j.mo15724a((C6151j2) this.f14955i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildHandle[");
        sb.append(this.f15285j);
        sb.append(']');
        return sb.toString();
    }
}
