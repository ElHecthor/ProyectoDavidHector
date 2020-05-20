package p308k.p312d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5877h;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.d0.e */
final class C5752e<T> extends C5753f<T> implements Iterator<T>, C5866d<C5812t>, C5954a {

    /* renamed from: f */
    private int f14823f;

    /* renamed from: g */
    private T f14824g;

    /* renamed from: h */
    private Iterator<? extends T> f14825h;

    /* renamed from: i */
    private C5866d<? super C5812t> f14826i;

    /* renamed from: c */
    private final Throwable m21883c() {
        int i = this.f14823f;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected state of the iterator: ");
        sb.append(this.f14823f);
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    private final T m21884d() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public Object mo15388a(T t, C5866d<? super C5812t> dVar) {
        this.f14824g = t;
        this.f14823f = 3;
        this.f14826i = dVar;
        Object a = C5885d.m22250a();
        if (a == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return a == C5885d.m22250a() ? a : C5812t.f14872a;
    }

    /* renamed from: a */
    public final void mo15389a(C5866d<? super C5812t> dVar) {
        this.f14826i = dVar;
    }

    /* renamed from: b */
    public C5871g mo15390b() {
        return C5877h.f14901f;
    }

    /* renamed from: b */
    public void mo15391b(Object obj) {
        C5806n.m22054a(obj);
        this.f14823f = 4;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f14823f;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f14825h;
                    if (it == null) {
                        C5942k.m22323a();
                        throw null;
                    } else if (it.hasNext()) {
                        this.f14823f = 2;
                        return true;
                    } else {
                        this.f14825h = null;
                    }
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m21883c();
                }
            }
            this.f14823f = 5;
            C5866d<? super C5812t> dVar = this.f14826i;
            if (dVar != null) {
                this.f14826i = null;
                C5812t tVar = C5812t.f14872a;
                C5804a aVar = C5803m.f14866f;
                C5803m.m22049a(tVar);
                dVar.mo15391b(tVar);
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
    }

    public T next() {
        int i = this.f14823f;
        if (i == 0 || i == 1) {
            return m21884d();
        }
        if (i == 2) {
            this.f14823f = 1;
            Iterator<? extends T> it = this.f14825h;
            if (it != null) {
                return it.next();
            }
            C5942k.m22323a();
            throw null;
        } else if (i == 3) {
            this.f14823f = 0;
            T t = this.f14824g;
            this.f14824g = null;
            return t;
        } else {
            throw m21883c();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
