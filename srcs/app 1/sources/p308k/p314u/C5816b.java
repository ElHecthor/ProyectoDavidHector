package p308k.p314u;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.u.b */
public abstract class C5816b<E> extends C5813a<E> implements List<E>, C5954a {

    /* renamed from: f */
    public static final C5817a f14874f = new C5817a(null);

    /* renamed from: k.u.b$a */
    public static final class C5817a {
        private C5817a() {
        }

        public /* synthetic */ C5817a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo15458a(Collection<?> collection) {
            C5942k.m22327b(collection, "c");
            int i = 1;
            for (Object next : collection) {
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        /* renamed from: a */
        public final void mo15459a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: a */
        public final void mo15460a(int i, int i2, int i3) {
            String str = "fromIndex: ";
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final boolean mo15461a(Collection<?> collection, Collection<?> collection2) {
            C5942k.m22327b(collection, "c");
            C5942k.m22327b(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C5942k.m22326a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final void mo15462b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }
    }

    /* renamed from: k.u.b$b */
    private class C5818b implements Iterator<E>, C5954a {

        /* renamed from: f */
        private int f14875f;

        public C5818b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo15463a(int i) {
            this.f14875f = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo15464b() {
            return this.f14875f;
        }

        public boolean hasNext() {
            return this.f14875f < C5816b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C5816b bVar = C5816b.this;
                int i = this.f14875f;
                this.f14875f = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: k.u.b$c */
    private class C5819c extends C5818b implements ListIterator<E>, C5954a {
        public C5819c(int i) {
            super();
            C5816b.f14874f.mo15462b(i, C5816b.this.size());
            mo15463a(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo15464b() > 0;
        }

        public int nextIndex() {
            return mo15464b();
        }

        public E previous() {
            if (hasPrevious()) {
                C5816b bVar = C5816b.this;
                mo15463a(mo15464b() - 1);
                return bVar.get(mo15464b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo15464b() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: k.u.b$d */
    private static final class C5820d<E> extends C5816b<E> implements RandomAccess {

        /* renamed from: g */
        private int f14878g;

        /* renamed from: h */
        private final C5816b<E> f14879h;

        /* renamed from: i */
        private final int f14880i;

        public C5820d(C5816b<? extends E> bVar, int i, int i2) {
            C5942k.m22327b(bVar, "list");
            this.f14879h = bVar;
            this.f14880i = i;
            C5816b.f14874f.mo15460a(i, i2, bVar.size());
            this.f14878g = i2 - this.f14880i;
        }

        /* renamed from: c */
        public int mo15433c() {
            return this.f14878g;
        }

        public E get(int i) {
            C5816b.f14874f.mo15459a(i, this.f14878g);
            return this.f14879h.get(this.f14880i + i);
        }
    }

    protected C5816b() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f14874f.mo15461a((Collection<?>) this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f14874f.mo15458a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C5942k.m22326a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C5818b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C5942k.m22326a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C5819c(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C5819c(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C5820d(this, i, i2);
    }
}
