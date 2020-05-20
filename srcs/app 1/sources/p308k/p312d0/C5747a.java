package p308k.p312d0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.d0.a */
public final class C5747a<T> implements C5751d<T> {

    /* renamed from: a */
    private final AtomicReference<C5751d<T>> f14818a;

    public C5747a(C5751d<? extends T> dVar) {
        C5942k.m22327b(dVar, "sequence");
        this.f14818a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        C5751d dVar = (C5751d) this.f14818a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
