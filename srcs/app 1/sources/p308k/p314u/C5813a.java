package p308k.p314u;

import java.util.Collection;
import p308k.C5809q;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5937f;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.a */
public abstract class C5813a<E> implements Collection<E>, C5954a {

    /* renamed from: k.u.a$a */
    static final class C5814a extends C5943l implements C5918l<E, CharSequence> {

        /* renamed from: g */
        final /* synthetic */ C5813a f14873g;

        C5814a(C5813a aVar) {
            this.f14873g = aVar;
            super(1);
        }

        /* renamed from: d */
        public final CharSequence m22059d(E e) {
            return e == this.f14873g ? "(this Collection)" : String.valueOf(e);
        }
    }

    protected C5813a() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public abstract int mo15433c();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C5942k.m22326a(a, obj)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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
        return mo15433c();
    }

    public Object[] toArray() {
        return C5937f.m22312a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C5942k.m22327b(tArr, "array");
        T[] a = C5937f.m22313a(this, tArr);
        if (a != null) {
            return a;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public String toString() {
        return C5845t.m22174a(this, ", ", "[", "]", 0, null, new C5814a(this), 24, null);
    }
}
