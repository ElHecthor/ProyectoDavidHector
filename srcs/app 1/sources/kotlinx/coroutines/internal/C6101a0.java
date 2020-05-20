package kotlinx.coroutines.internal;

import kotlinx.coroutines.C6191s2;
import kotlinx.coroutines.C6191s2.C6192a;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p316w.C5877h;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.a0 */
public final class C6101a0<T> implements C6191s2<T> {

    /* renamed from: f */
    private final C5876c<?> f15193f;

    /* renamed from: g */
    private final T f15194g;

    /* renamed from: h */
    private final ThreadLocal<T> f15195h;

    public C6101a0(T t, ThreadLocal<T> threadLocal) {
        C5942k.m22327b(threadLocal, "threadLocal");
        this.f15194g = t;
        this.f15195h = threadLocal;
        this.f15193f = new C6103b0(threadLocal);
    }

    /* renamed from: a */
    public T mo15816a(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        T t = this.f15195h.get();
        this.f15195h.set(this.f15194g);
        return t;
    }

    /* renamed from: a */
    public void mo15817a(C5871g gVar, T t) {
        C5942k.m22327b(gVar, "context");
        this.f15195h.set(t);
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return C6192a.m23215a(this, r, pVar);
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        if (C5942k.m22326a((Object) getKey(), (Object) cVar)) {
            return this;
        }
        return null;
    }

    public C5876c<?> getKey() {
        return this.f15193f;
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return C5942k.m22326a((Object) getKey(), (Object) cVar) ? C5877h.f14901f : this;
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return C6192a.m23217a((C6191s2<S>) this, gVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThreadLocal(value=");
        sb.append(this.f15194g);
        sb.append(", threadLocal = ");
        sb.append(this.f15195h);
        sb.append(')');
        return sb.toString();
    }
}
