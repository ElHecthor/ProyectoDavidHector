package p308k.p314u;

import java.util.Iterator;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.y */
public abstract class C5851y implements Iterator<Integer>, C5954a {
    /* renamed from: b */
    public abstract int mo15372b();

    public final Integer next() {
        return Integer.valueOf(mo15372b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
