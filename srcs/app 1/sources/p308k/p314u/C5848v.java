package p308k.p314u;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p308k.p323z.p325d.C5937f;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.v */
public final class C5848v implements List, Serializable, RandomAccess, C5954a {

    /* renamed from: f */
    public static final C5848v f14885f = new C5848v();
    private static final long serialVersionUID = -7390468764508069838L;

    private C5848v() {
    }

    private final Object readResolve() {
        return f14885f;
    }

    /* renamed from: a */
    public boolean mo15497a(Void voidR) {
        C5942k.m22327b(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo15502b(Void voidR) {
        C5942k.m22327b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    public int mo15503c() {
        return 0;
    }

    /* renamed from: c */
    public int mo15504c(Void voidR) {
        C5942k.m22327b(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo15497a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C5942k.m22327b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Void get(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo15502b((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C5847u.f14884f;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo15504c((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C5847u.f14884f;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C5847u.f14884f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15503c();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
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
