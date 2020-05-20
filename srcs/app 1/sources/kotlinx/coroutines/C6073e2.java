package kotlinx.coroutines;

import kotlinx.coroutines.p330c3.C6042a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.e2 */
final class C6073e2 extends C6175p2 {

    /* renamed from: i */
    private C5922p<? super C6089g0, ? super C5866d<? super C5812t>, ? extends Object> f15170i;

    public C6073e2(C5871g gVar, C5922p<? super C6089g0, ? super C5866d<? super C5812t>, ? extends Object> pVar) {
        C5942k.m22327b(gVar, "parentContext");
        C5942k.m22327b(pVar, "block");
        super(gVar, false);
        this.f15170i = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo15638u() {
        C5922p<? super C6089g0, ? super C5866d<? super C5812t>, ? extends Object> pVar = this.f15170i;
        if (pVar != null) {
            this.f15170i = null;
            C6042a.m22711a(pVar, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }
}
