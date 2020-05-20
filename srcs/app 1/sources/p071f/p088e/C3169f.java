package p071f.p088e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: f.e.f */
abstract class C3169f<K, V> {

    /* renamed from: a */
    C3171b f8971a;

    /* renamed from: b */
    C3172c f8972b;

    /* renamed from: c */
    C3174e f8973c;

    /* renamed from: f.e.f$a */
    final class C3170a<T> implements Iterator<T> {

        /* renamed from: f */
        final int f8974f;

        /* renamed from: g */
        int f8975g;

        /* renamed from: h */
        int f8976h;

        /* renamed from: i */
        boolean f8977i = false;

        C3170a(int i) {
            this.f8974f = i;
            this.f8975g = C3169f.this.mo10161c();
        }

        public boolean hasNext() {
            return this.f8976h < this.f8975g;
        }

        public T next() {
            if (hasNext()) {
                T a = C3169f.this.mo10154a(this.f8976h, this.f8974f);
                this.f8976h++;
                this.f8977i = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f8977i) {
                int i = this.f8976h - 1;
                this.f8976h = i;
                this.f8975g--;
                this.f8977i = false;
                C3169f.this.mo10157a(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: f.e.f$b */
    final class C3171b implements Set<Entry<K, V>> {
        C3171b() {
        }

        /* renamed from: a */
        public boolean mo10213a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo10213a((Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C3169f.this.mo10161c();
            for (Entry entry : collection) {
                C3169f.this.mo10158a(entry.getKey(), entry.getValue());
            }
            return c != C3169f.this.mo10161c();
        }

        public void clear() {
            C3169f.this.mo10156a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C3169f.this.mo10153a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C3166c.m12793a(C3169f.this.mo10154a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C3169f.m12819a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C3169f.this.mo10161c() - 1; c >= 0; c--) {
                Object a = C3169f.this.mo10154a(c, 0);
                Object a2 = C3169f.this.mo10154a(c, 1);
                i += (a == null ? 0 : a.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C3169f.this.mo10161c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C3173d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C3169f.this.mo10161c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f.e.f$c */
    final class C3172c implements Set<K> {
        C3172c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3169f.this.mo10156a();
        }

        public boolean contains(Object obj) {
            return C3169f.this.mo10153a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C3169f.m12818a(C3169f.this.mo10160b(), collection);
        }

        public boolean equals(Object obj) {
            return C3169f.m12819a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C3169f.this.mo10161c() - 1; c >= 0; c--) {
                Object a = C3169f.this.mo10154a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C3169f.this.mo10161c() == 0;
        }

        public Iterator<K> iterator() {
            return new C3170a(0);
        }

        public boolean remove(Object obj) {
            int a = C3169f.this.mo10153a(obj);
            if (a < 0) {
                return false;
            }
            C3169f.this.mo10157a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C3169f.m12820b(C3169f.this.mo10160b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C3169f.m12821c(C3169f.this.mo10160b(), collection);
        }

        public int size() {
            return C3169f.this.mo10161c();
        }

        public Object[] toArray() {
            return C3169f.this.mo10206b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3169f.this.mo10205a(tArr, 0);
        }
    }

    /* renamed from: f.e.f$d */
    final class C3173d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: f */
        int f8981f;

        /* renamed from: g */
        int f8982g;

        /* renamed from: h */
        boolean f8983h = false;

        C3173d() {
            this.f8981f = C3169f.this.mo10161c() - 1;
            this.f8982g = -1;
        }

        public boolean equals(Object obj) {
            if (this.f8983h) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C3166c.m12793a(entry.getKey(), C3169f.this.mo10154a(this.f8982g, 0)) && C3166c.m12793a(entry.getValue(), C3169f.this.mo10154a(this.f8982g, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f8983h) {
                return C3169f.this.mo10154a(this.f8982g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f8983h) {
                return C3169f.this.mo10154a(this.f8982g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f8982g < this.f8981f;
        }

        public int hashCode() {
            if (this.f8983h) {
                int i = 0;
                Object a = C3169f.this.mo10154a(this.f8982g, 0);
                Object a2 = C3169f.this.mo10154a(this.f8982g, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.f8982g++;
                this.f8983h = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f8983h) {
                C3169f.this.mo10157a(this.f8982g);
                this.f8982g--;
                this.f8981f--;
                this.f8983h = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f8983h) {
                return C3169f.this.mo10155a(this.f8982g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: f.e.f$e */
    final class C3174e implements Collection<V> {
        C3174e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C3169f.this.mo10156a();
        }

        public boolean contains(Object obj) {
            return C3169f.this.mo10159b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C3169f.this.mo10161c() == 0;
        }

        public Iterator<V> iterator() {
            return new C3170a(1);
        }

        public boolean remove(Object obj) {
            int b = C3169f.this.mo10159b(obj);
            if (b < 0) {
                return false;
            }
            C3169f.this.mo10157a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C3169f.this.mo10161c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C3169f.this.mo10154a(i, 1))) {
                    C3169f.this.mo10157a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C3169f.this.mo10161c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C3169f.this.mo10154a(i, 1))) {
                    C3169f.this.mo10157a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C3169f.this.mo10161c();
        }

        public Object[] toArray() {
            return C3169f.this.mo10206b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C3169f.this.mo10205a(tArr, 1);
        }
    }

    C3169f() {
    }

    /* renamed from: a */
    public static <K, V> boolean m12818a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m12819a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m12820b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m12821c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo10153a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo10154a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo10155a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10156a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10157a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10158a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo10205a(T[] tArr, int i) {
        int c = mo10161c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo10154a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo10159b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo10160b();

    /* renamed from: b */
    public Object[] mo10206b(int i) {
        int c = mo10161c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo10154a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo10161c();

    /* renamed from: d */
    public Set<Entry<K, V>> mo10207d() {
        if (this.f8971a == null) {
            this.f8971a = new C3171b<>();
        }
        return this.f8971a;
    }

    /* renamed from: e */
    public Set<K> mo10208e() {
        if (this.f8972b == null) {
            this.f8972b = new C3172c<>();
        }
        return this.f8972b;
    }

    /* renamed from: f */
    public Collection<V> mo10209f() {
        if (this.f8973c == null) {
            this.f8973c = new C3174e<>();
        }
        return this.f8973c;
    }
}
