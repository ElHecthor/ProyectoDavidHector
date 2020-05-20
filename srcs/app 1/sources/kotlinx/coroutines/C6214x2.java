package kotlinx.coroutines;

import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.x2 */
public final class C6214x2 extends C6012b0 {

    /* renamed from: f */
    public static final C6214x2 f15323f = new C6214x2();

    private C6214x2() {
    }

    /* renamed from: a */
    public void mo15711a(C5871g gVar, Runnable runnable) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public boolean mo15712b(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return false;
    }

    public String toString() {
        return "Unconfined";
    }
}
