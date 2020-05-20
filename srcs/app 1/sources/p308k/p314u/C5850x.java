package p308k.p314u;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p308k.p323z.p325d.C5937f;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.x */
public final class C5850x implements Set, Serializable, C5954a {

    /* renamed from: f */
    public static final C5850x f14887f = new C5850x();
    private static final long serialVersionUID = 3406603774387020532L;

    private C5850x() {
    }

    private final Object readResolve() {
        return f14887f;
    }

    /* renamed from: a */
    public boolean mo15547a(Void voidR) {
        C5942k.m22327b(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public int mo15550c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo15547a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C5942k.m22327b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C5847u.f14884f;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15550c();
    }

    public Object[] toArray() {
        return C5937f.m22312a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C5937f.m22313a(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
