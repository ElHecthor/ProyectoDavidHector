package kotlinx.coroutines;

import p308k.C5812t;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.p2 */
class C6175p2 extends C5957a<C5812t> {
    public C6175p2(C5871g gVar, boolean z) {
        C5942k.m22327b(gVar, "parentContext");
        super(gVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo15735f(Throwable th) {
        C5942k.m22327b(th, "exception");
        C6045d0.m22718a(mo15390b(), th);
        return true;
    }
}
