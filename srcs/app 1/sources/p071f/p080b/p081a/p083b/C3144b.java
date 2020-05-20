package p071f.p080b.p081a.p083b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: f.b.a.b.b */
public class C3144b<K, V> implements Iterable<Entry<K, V>> {

    /* renamed from: f */
    C3147c<K, V> f8914f;

    /* renamed from: g */
    private C3147c<K, V> f8915g;

    /* renamed from: h */
    private WeakHashMap<C3150f<K, V>, Boolean> f8916h = new WeakHashMap<>();

    /* renamed from: i */
    private int f8917i = 0;

    /* renamed from: f.b.a.b.b$a */
    static class C3145a<K, V> extends C3149e<K, V> {
        C3145a(C3147c<K, V> cVar, C3147c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3147c<K, V> mo10130b(C3147c<K, V> cVar) {
            return cVar.f8921i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C3147c<K, V> mo10131c(C3147c<K, V> cVar) {
            return cVar.f8920h;
        }
    }

    /* renamed from: f.b.a.b.b$b */
    private static class C3146b<K, V> extends C3149e<K, V> {
        C3146b(C3147c<K, V> cVar, C3147c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3147c<K, V> mo10130b(C3147c<K, V> cVar) {
            return cVar.f8920h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C3147c<K, V> mo10131c(C3147c<K, V> cVar) {
            return cVar.f8921i;
        }
    }

    /* renamed from: f.b.a.b.b$c */
    static class C3147c<K, V> implements Entry<K, V> {

        /* renamed from: f */
        final K f8918f;

        /* renamed from: g */
        final V f8919g;

        /* renamed from: h */
        C3147c<K, V> f8920h;

        /* renamed from: i */
        C3147c<K, V> f8921i;

        C3147c(K k, V v) {
            this.f8918f = k;
            this.f8919g = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3147c)) {
                return false;
            }
            C3147c cVar = (C3147c) obj;
            if (!this.f8918f.equals(cVar.f8918f) || !this.f8919g.equals(cVar.f8919g)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f8918f;
        }

        public V getValue() {
            return this.f8919g;
        }

        public int hashCode() {
            return this.f8918f.hashCode() ^ this.f8919g.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8918f);
            sb.append("=");
            sb.append(this.f8919g);
            return sb.toString();
        }
    }

    /* renamed from: f.b.a.b.b$d */
    private class C3148d implements Iterator<Entry<K, V>>, C3150f<K, V> {

        /* renamed from: f */
        private C3147c<K, V> f8922f;

        /* renamed from: g */
        private boolean f8923g = true;

        C3148d() {
        }

        /* renamed from: a */
        public void mo10138a(C3147c<K, V> cVar) {
            C3147c<K, V> cVar2 = this.f8922f;
            if (cVar == cVar2) {
                C3147c<K, V> cVar3 = cVar2.f8921i;
                this.f8922f = cVar3;
                this.f8923g = cVar3 == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f8923g) {
                if (C3144b.this.f8914f == null) {
                    z = false;
                }
                return z;
            }
            C3147c<K, V> cVar = this.f8922f;
            if (cVar == null || cVar.f8920h == null) {
                z = false;
            }
            return z;
        }

        public Entry<K, V> next() {
            C3147c<K, V> cVar;
            if (this.f8923g) {
                this.f8923g = false;
                cVar = C3144b.this.f8914f;
            } else {
                C3147c<K, V> cVar2 = this.f8922f;
                cVar = cVar2 != null ? cVar2.f8920h : null;
            }
            this.f8922f = cVar;
            return this.f8922f;
        }
    }

    /* renamed from: f.b.a.b.b$e */
    private static abstract class C3149e<K, V> implements Iterator<Entry<K, V>>, C3150f<K, V> {

        /* renamed from: f */
        C3147c<K, V> f8925f;

        /* renamed from: g */
        C3147c<K, V> f8926g;

        C3149e(C3147c<K, V> cVar, C3147c<K, V> cVar2) {
            this.f8925f = cVar2;
            this.f8926g = cVar;
        }

        /* renamed from: b */
        private C3147c<K, V> m12751b() {
            C3147c<K, V> cVar = this.f8926g;
            C3147c<K, V> cVar2 = this.f8925f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo10131c(cVar);
        }

        /* renamed from: a */
        public void mo10138a(C3147c<K, V> cVar) {
            if (this.f8925f == cVar && cVar == this.f8926g) {
                this.f8926g = null;
                this.f8925f = null;
            }
            C3147c<K, V> cVar2 = this.f8925f;
            if (cVar2 == cVar) {
                this.f8925f = mo10130b(cVar2);
            }
            if (this.f8926g == cVar) {
                this.f8926g = m12751b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C3147c<K, V> mo10130b(C3147c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract C3147c<K, V> mo10131c(C3147c<K, V> cVar);

        public boolean hasNext() {
            return this.f8926g != null;
        }

        public Entry<K, V> next() {
            C3147c<K, V> cVar = this.f8926g;
            this.f8926g = m12751b();
            return cVar;
        }
    }

    /* renamed from: f.b.a.b.b$f */
    interface C3150f<K, V> {
        /* renamed from: a */
        void mo10138a(C3147c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3147c<K, V> mo10115a(K k) {
        C3147c<K, V> cVar = this.f8914f;
        while (cVar != null && !cVar.f8918f.equals(k)) {
            cVar = cVar.f8920h;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3147c<K, V> mo10120a(K k, V v) {
        C3147c<K, V> cVar = new C3147c<>(k, v);
        this.f8917i++;
        C3147c<K, V> cVar2 = this.f8915g;
        if (cVar2 == null) {
            this.f8914f = cVar;
        } else {
            cVar2.f8920h = cVar;
            cVar.f8921i = cVar2;
        }
        this.f8915g = cVar;
        return cVar;
    }

    /* renamed from: b */
    public V mo10116b(K k, V v) {
        C3147c a = mo10115a(k);
        if (a != null) {
            return a.f8919g;
        }
        mo10120a(k, v);
        return null;
    }

    /* renamed from: c */
    public Iterator<Entry<K, V>> mo10121c() {
        C3146b bVar = new C3146b(this.f8915g, this.f8914f);
        this.f8916h.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    /* renamed from: d */
    public Entry<K, V> mo10122d() {
        return this.f8914f;
    }

    /* renamed from: e */
    public C3148d mo10123e() {
        C3148d dVar = new C3148d<>();
        this.f8916h.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3144b)) {
            return false;
        }
        C3144b bVar = (C3144b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public Entry<K, V> mo10125f() {
        return this.f8915g;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public Iterator<Entry<K, V>> iterator() {
        C3145a aVar = new C3145a(this.f8914f, this.f8915g);
        this.f8916h.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(K k) {
        C3147c a = mo10115a(k);
        if (a == null) {
            return null;
        }
        this.f8917i--;
        if (!this.f8916h.isEmpty()) {
            for (C3150f a2 : this.f8916h.keySet()) {
                a2.mo10138a(a);
            }
        }
        C3147c<K, V> cVar = a.f8921i;
        if (cVar != null) {
            cVar.f8920h = a.f8920h;
        } else {
            this.f8914f = a.f8920h;
        }
        C3147c<K, V> cVar2 = a.f8920h;
        if (cVar2 != null) {
            cVar2.f8921i = a.f8921i;
        } else {
            this.f8915g = a.f8921i;
        }
        a.f8920h = null;
        a.f8921i = null;
        return a.f8919g;
    }

    public int size() {
        return this.f8917i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
