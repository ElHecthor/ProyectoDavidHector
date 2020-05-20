package p308k.p314u;

import java.util.Collection;
import java.util.Iterator;
import p308k.p323z.p325d.C5931b;
import p308k.p323z.p325d.C5937f;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.c */
final class C5822c<T> implements Collection<T>, C5954a {

    /* renamed from: f */
    private final T[] f14881f;

    /* renamed from: g */
    private final boolean f14882g;

    public C5822c(T[] tArr, boolean z) {
        C5942k.m22327b(tArr, "values");
        this.f14881f = tArr;
        this.f14882g = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int mo15476c() {
        return this.f14881f.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C5832h.m22118b(this.f14881f, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C5942k.m22327b(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f14881f.length == 0;
    }

    public Iterator<T> iterator() {
        return C5931b.m22300a(this.f14881f);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15476c();
    }

    public final Object[] toArray() {
        return C5836k.m22154a(this.f14881f, this.f14882g);
    }

    public <T> T[] toArray(T[] tArr) {
        return C5937f.m22313a(this, tArr);
    }
}
