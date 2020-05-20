package p308k.p323z.p325d;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.z.d.a */
final class C5930a<T> implements Iterator<T>, C5954a {

    /* renamed from: f */
    private int f14928f;

    /* renamed from: g */
    private final T[] f14929g;

    public C5930a(T[] tArr) {
        C5942k.m22327b(tArr, "array");
        this.f14929g = tArr;
    }

    public boolean hasNext() {
        return this.f14928f < this.f14929g.length;
    }

    public T next() {
        try {
            T[] tArr = this.f14929g;
            int i = this.f14928f;
            this.f14928f = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f14928f--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
