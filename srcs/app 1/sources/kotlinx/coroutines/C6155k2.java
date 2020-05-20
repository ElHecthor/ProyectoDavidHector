package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6122k;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.k2 */
final class C6155k2 extends C6092h {

    /* renamed from: f */
    private final C6122k f15268f;

    public C6155k2(C6122k kVar) {
        C5942k.m22327b(kVar, "node");
        this.f15268f = kVar;
    }

    /* renamed from: a */
    public void mo15662a(Throwable th) {
        this.f15268f.mo15892s();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15662a((Throwable) obj);
        return C5812t.f14872a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveOnCancel[");
        sb.append(this.f15268f);
        sb.append(']');
        return sb.toString();
    }
}
