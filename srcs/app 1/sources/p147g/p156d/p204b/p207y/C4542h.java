package p147g.p156d.p204b.p207y;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: g.d.b.y.h */
public final class C4542h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: m */
    private static final Comparator<Comparable> f11955m = new C4543a();

    /* renamed from: f */
    Comparator<? super K> f11956f;

    /* renamed from: g */
    C4549e<K, V> f11957g;

    /* renamed from: h */
    int f11958h;

    /* renamed from: i */
    int f11959i;

    /* renamed from: j */
    final C4549e<K, V> f11960j;

    /* renamed from: k */
    private C4544b f11961k;

    /* renamed from: l */
    private C4546c f11962l;

    /* renamed from: g.d.b.y.h$a */
    static class C4543a implements Comparator<Comparable> {
        C4543a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: g.d.b.y.h$b */
    class C4544b extends AbstractSet<Entry<K, V>> {

        /* renamed from: g.d.b.y.h$b$a */
        class C4545a extends C4548d<Entry<K, V>> {
            C4545a(C4544b bVar) {
                super();
            }

            public Entry<K, V> next() {
                return mo13457b();
            }
        }

        C4544b() {
        }

        public void clear() {
            C4542h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && C4542h.this.mo13432a((Entry) obj) != null;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C4545a(this);
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C4549e a = C4542h.this.mo13432a((Entry) obj);
            if (a == null) {
                return false;
            }
            C4542h.this.mo13433a(a, true);
            return true;
        }

        public int size() {
            return C4542h.this.f11958h;
        }
    }

    /* renamed from: g.d.b.y.h$c */
    final class C4546c extends AbstractSet<K> {

        /* renamed from: g.d.b.y.h$c$a */
        class C4547a extends C4548d<K> {
            C4547a(C4546c cVar) {
                super();
            }

            public K next() {
                return mo13457b().f11974k;
            }
        }

        C4546c() {
        }

        public void clear() {
            C4542h.this.clear();
        }

        public boolean contains(Object obj) {
            return C4542h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C4547a(this);
        }

        public boolean remove(Object obj) {
            return C4542h.this.mo13434b(obj) != null;
        }

        public int size() {
            return C4542h.this.f11958h;
        }
    }

    /* renamed from: g.d.b.y.h$d */
    private abstract class C4548d<T> implements Iterator<T> {

        /* renamed from: f */
        C4549e<K, V> f11965f;

        /* renamed from: g */
        C4549e<K, V> f11966g = null;

        /* renamed from: h */
        int f11967h;

        C4548d() {
            C4542h hVar = C4542h.this;
            this.f11965f = hVar.f11960j.f11972i;
            this.f11967h = hVar.f11959i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C4549e<K, V> mo13457b() {
            C4549e<K, V> eVar = this.f11965f;
            C4542h hVar = C4542h.this;
            if (eVar == hVar.f11960j) {
                throw new NoSuchElementException();
            } else if (hVar.f11959i == this.f11967h) {
                this.f11965f = eVar.f11972i;
                this.f11966g = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f11965f != C4542h.this.f11960j;
        }

        public final void remove() {
            C4549e<K, V> eVar = this.f11966g;
            if (eVar != null) {
                C4542h.this.mo13433a(eVar, true);
                this.f11966g = null;
                this.f11967h = C4542h.this.f11959i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: g.d.b.y.h$e */
    static final class C4549e<K, V> implements Entry<K, V> {

        /* renamed from: f */
        C4549e<K, V> f11969f;

        /* renamed from: g */
        C4549e<K, V> f11970g;

        /* renamed from: h */
        C4549e<K, V> f11971h;

        /* renamed from: i */
        C4549e<K, V> f11972i;

        /* renamed from: j */
        C4549e<K, V> f11973j;

        /* renamed from: k */
        final K f11974k;

        /* renamed from: l */
        V f11975l;

        /* renamed from: m */
        int f11976m;

        C4549e() {
            this.f11974k = null;
            this.f11973j = this;
            this.f11972i = this;
        }

        C4549e(C4549e<K, V> eVar, K k, C4549e<K, V> eVar2, C4549e<K, V> eVar3) {
            this.f11969f = eVar;
            this.f11974k = k;
            this.f11976m = 1;
            this.f11972i = eVar2;
            this.f11973j = eVar3;
            eVar3.f11972i = this;
            eVar2.f11973j = this;
        }

        /* renamed from: a */
        public C4549e<K, V> mo13460a() {
            C4549e eVar = this;
            for (C4549e eVar2 = this.f11970g; eVar2 != null; eVar2 = eVar2.f11970g) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C4549e<K, V> mo13461b() {
            C4549e eVar = this;
            for (C4549e eVar2 = this.f11971h; eVar2 != null; eVar2 = eVar2.f11971h) {
                eVar = eVar2;
            }
            return eVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            K k = this.f11974k;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f11975l;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f11974k;
        }

        public V getValue() {
            return this.f11975l;
        }

        public int hashCode() {
            K k = this.f11974k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f11975l;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f11975l;
            this.f11975l = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f11974k);
            sb.append("=");
            sb.append(this.f11975l);
            return sb.toString();
        }
    }

    static {
        Class<C4542h> cls = C4542h.class;
    }

    public C4542h() {
        this(f11955m);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Comparator<? super K>, code=java.util.Comparator, for r2v0, types: [java.util.Comparator<? super K>, java.util.Comparator] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4542h(java.util.Comparator r2) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11958h = r0
            r1.f11959i = r0
            g.d.b.y.h$e r0 = new g.d.b.y.h$e
            r0.<init>()
            r1.f11960j = r0
            if (r2 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            java.util.Comparator<java.lang.Comparable> r2 = f11955m
        L_0x0014:
            r1.f11956f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p207y.C4542h.<init>(java.util.Comparator):void");
    }

    /* renamed from: a */
    private void m18426a(C4549e<K, V> eVar) {
        C4549e<K, V> eVar2 = eVar.f11970g;
        C4549e<K, V> eVar3 = eVar.f11971h;
        C4549e<K, V> eVar4 = eVar3.f11970g;
        C4549e<K, V> eVar5 = eVar3.f11971h;
        eVar.f11971h = eVar4;
        if (eVar4 != null) {
            eVar4.f11969f = eVar;
        }
        m18427a(eVar, eVar3);
        eVar3.f11970g = eVar;
        eVar.f11969f = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f11976m : 0, eVar4 != null ? eVar4.f11976m : 0) + 1;
        eVar.f11976m = max;
        if (eVar5 != null) {
            i = eVar5.f11976m;
        }
        eVar3.f11976m = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    private void m18427a(C4549e<K, V> eVar, C4549e<K, V> eVar2) {
        C4549e<K, V> eVar3 = eVar.f11969f;
        eVar.f11969f = null;
        if (eVar2 != null) {
            eVar2.f11969f = eVar3;
        }
        if (eVar3 == null) {
            this.f11957g = eVar2;
        } else if (eVar3.f11970g == eVar) {
            eVar3.f11970g = eVar2;
        } else {
            eVar3.f11971h = eVar2;
        }
    }

    /* renamed from: a */
    private boolean m18428a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m18429b(C4549e<K, V> eVar) {
        C4549e<K, V> eVar2 = eVar.f11970g;
        C4549e<K, V> eVar3 = eVar.f11971h;
        C4549e<K, V> eVar4 = eVar2.f11970g;
        C4549e<K, V> eVar5 = eVar2.f11971h;
        eVar.f11970g = eVar5;
        if (eVar5 != null) {
            eVar5.f11969f = eVar;
        }
        m18427a(eVar, eVar2);
        eVar2.f11971h = eVar;
        eVar.f11969f = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f11976m : 0, eVar5 != null ? eVar5.f11976m : 0) + 1;
        eVar.f11976m = max;
        if (eVar4 != null) {
            i = eVar4.f11976m;
        }
        eVar2.f11976m = Math.max(max, i) + 1;
    }

    /* renamed from: b */
    private void m18430b(C4549e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C4549e<K, V> eVar2 = eVar.f11970g;
            C4549e<K, V> eVar3 = eVar.f11971h;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f11976m : 0;
            int i3 = eVar3 != null ? eVar3.f11976m : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C4549e<K, V> eVar4 = eVar3.f11970g;
                C4549e<K, V> eVar5 = eVar3.f11971h;
                int i5 = eVar5 != null ? eVar5.f11976m : 0;
                if (eVar4 != null) {
                    i = eVar4.f11976m;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    m18429b(eVar3);
                }
                m18426a(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C4549e<K, V> eVar6 = eVar2.f11970g;
                C4549e<K, V> eVar7 = eVar2.f11971h;
                int i7 = eVar7 != null ? eVar7.f11976m : 0;
                if (eVar6 != null) {
                    i = eVar6.f11976m;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m18426a(eVar2);
                }
                m18429b(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f11976m = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f11976m = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f11969f;
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4549e<K, V> mo13430a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo13431a((K) obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4549e<K, V> mo13431a(K k, boolean z) {
        int i;
        C4549e<K, V> eVar;
        Comparator<? super K> comparator = this.f11956f;
        C4549e<K, V> eVar2 = this.f11957g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f11955m ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f11974k;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C4549e<K, V> eVar3 = i < 0 ? eVar2.f11970g : eVar2.f11971h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C4549e<K, V> eVar4 = this.f11960j;
        if (eVar2 != null) {
            eVar = new C4549e<>(eVar2, k, eVar4, eVar4.f11973j);
            if (i < 0) {
                eVar2.f11970g = eVar;
            } else {
                eVar2.f11971h = eVar;
            }
            m18430b(eVar2, true);
        } else if (comparator != f11955m || (k instanceof Comparable)) {
            eVar = new C4549e<>(eVar2, k, eVar4, eVar4.f11973j);
            this.f11957g = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f11958h++;
        this.f11959i++;
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4549e<K, V> mo13432a(Entry<?, ?> entry) {
        C4549e<K, V> a = mo13430a(entry.getKey());
        if (a != null && m18428a((Object) a.f11975l, entry.getValue())) {
            return a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13433a(C4549e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C4549e<K, V> eVar2 = eVar.f11973j;
            eVar2.f11972i = eVar.f11972i;
            eVar.f11972i.f11973j = eVar2;
        }
        C4549e<K, V> eVar3 = eVar.f11970g;
        C4549e<K, V> eVar4 = eVar.f11971h;
        C4549e<K, V> eVar5 = eVar.f11969f;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m18427a(eVar, eVar3);
                eVar.f11970g = null;
            } else if (eVar4 != null) {
                m18427a(eVar, eVar4);
                eVar.f11971h = null;
            } else {
                m18427a(eVar, null);
            }
            m18430b(eVar5, false);
            this.f11958h--;
            this.f11959i++;
            return;
        }
        C4549e<K, V> b = eVar3.f11976m > eVar4.f11976m ? eVar3.mo13461b() : eVar4.mo13460a();
        mo13433a(b, false);
        C4549e<K, V> eVar6 = eVar.f11970g;
        if (eVar6 != null) {
            i = eVar6.f11976m;
            b.f11970g = eVar6;
            eVar6.f11969f = b;
            eVar.f11970g = null;
        } else {
            i = 0;
        }
        C4549e<K, V> eVar7 = eVar.f11971h;
        if (eVar7 != null) {
            i2 = eVar7.f11976m;
            b.f11971h = eVar7;
            eVar7.f11969f = b;
            eVar.f11971h = null;
        }
        b.f11976m = Math.max(i, i2) + 1;
        m18427a(eVar, b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4549e<K, V> mo13434b(Object obj) {
        C4549e<K, V> a = mo13430a(obj);
        if (a != null) {
            mo13433a(a, true);
        }
        return a;
    }

    public void clear() {
        this.f11957g = null;
        this.f11958h = 0;
        this.f11959i++;
        C4549e<K, V> eVar = this.f11960j;
        eVar.f11973j = eVar;
        eVar.f11972i = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo13430a(obj) != null;
    }

    public Set<Entry<K, V>> entrySet() {
        C4544b bVar = this.f11961k;
        if (bVar != null) {
            return bVar;
        }
        C4544b bVar2 = new C4544b<>();
        this.f11961k = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        C4549e a = mo13430a(obj);
        if (a != null) {
            return a.f11975l;
        }
        return null;
    }

    public Set<K> keySet() {
        C4546c cVar = this.f11962l;
        if (cVar != null) {
            return cVar;
        }
        C4546c cVar2 = new C4546c<>();
        this.f11962l = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C4549e a = mo13431a(k, true);
            V v2 = a.f11975l;
            a.f11975l = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C4549e b = mo13434b(obj);
        if (b != null) {
            return b.f11975l;
        }
        return null;
    }

    public int size() {
        return this.f11958h;
    }
}
