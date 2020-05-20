package kotlinx.coroutines;

import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b1 */
final class C6013b1 extends C6092h {

    /* renamed from: f */
    private final C5959a1 f15016f;

    public C6013b1(C5959a1 a1Var) {
        C5942k.m22327b(a1Var, "handle");
        this.f15016f = a1Var;
    }

    /* renamed from: a */
    public void mo15662a(Throwable th) {
        this.f15016f.mo15639f();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15662a((Throwable) obj);
        return C5812t.f14872a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposeOnCancel[");
        sb.append(this.f15016f);
        sb.append(']');
        return sb.toString();
    }
}
