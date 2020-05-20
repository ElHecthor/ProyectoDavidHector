package p308k.p316w;

import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5874b.C5875a;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.w.a */
public abstract class C5859a implements C5874b {
    private final C5876c<?> key;

    public C5859a(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return C5875a.m22235a(this, r, pVar);
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5875a.m22236a((C5874b) this, cVar);
    }

    public C5876c<?> getKey() {
        return this.key;
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5875a.m22238b(this, cVar);
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return C5875a.m22237a((C5874b) this, gVar);
    }
}
