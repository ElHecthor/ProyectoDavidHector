package p308k.p316w;

import java.io.Serializable;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.w.h */
public final class C5877h implements C5871g, Serializable {

    /* renamed from: f */
    public static final C5877h f14901f = new C5877h();
    private static final long serialVersionUID = 0;

    private C5877h() {
    }

    private final Object readResolve() {
        return f14901f;
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return r;
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return this;
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
