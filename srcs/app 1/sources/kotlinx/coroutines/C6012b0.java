package kotlinx.coroutines;

import p308k.p316w.C5859a;
import p308k.p316w.C5866d;
import p308k.p316w.C5867e;
import p308k.p316w.C5867e.C5868a;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b0 */
public abstract class C6012b0 extends C5859a implements C5867e {
    public C6012b0() {
        super(C5867e.f14898b);
    }

    /* renamed from: a */
    public void mo15580a(C5866d<?> dVar) {
        C5942k.m22327b(dVar, "continuation");
        C5868a.m22229a((C5867e) this, dVar);
    }

    /* renamed from: a */
    public abstract void mo15711a(C5871g gVar, Runnable runnable);

    /* renamed from: b */
    public final <T> C5866d<T> mo15581b(C5866d<? super T> dVar) {
        C5942k.m22327b(dVar, "continuation");
        return new C6194t0(this, dVar);
    }

    /* renamed from: b */
    public boolean mo15712b(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return true;
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5868a.m22228a((C5867e) this, cVar);
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5868a.m22230b(this, cVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6161m0.m23157a((Object) this));
        sb.append('@');
        sb.append(C6161m0.m23159b(this));
        return sb.toString();
    }
}
