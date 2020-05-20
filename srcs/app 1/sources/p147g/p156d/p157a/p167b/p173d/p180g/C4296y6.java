package p147g.p156d.p157a.p167b.p173d.p180g;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: g.d.a.b.d.g.y6 */
class C4296y6<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f */
    private final int f11443f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C3970d7> f11444g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Map<K, V> f11445h;

    /* renamed from: i */
    private boolean f11446i;

    /* renamed from: j */
    private volatile C4003f7 f11447j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Map<K, V> f11448k;

    /* renamed from: l */
    private volatile C4311z6 f11449l;

    private C4296y6(int i) {
        this.f11443f = i;
        this.f11444g = Collections.emptyList();
        this.f11445h = Collections.emptyMap();
        this.f11448k = Collections.emptyMap();
    }

    /* synthetic */ C4296y6(int i, C4281x6 x6Var) {
        this(i);
    }

    /* renamed from: a */
    private final int m17608a(K k) {
        int size = this.f11444g.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C3970d7) this.f11444g.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((C3970d7) this.f11444g.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    static <FieldDescriptorType extends C4137o4<FieldDescriptorType>> C4296y6<FieldDescriptorType, Object> m17611b(int i) {
        return new C4281x6(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m17613c(int i) {
        m17616f();
        V value = ((C3970d7) this.f11444g.remove(i)).getValue();
        if (!this.f11445h.isEmpty()) {
            Iterator it = m17617g().entrySet().iterator();
            this.f11444g.add(new C3970d7(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m17616f() {
        if (this.f11446i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private final SortedMap<K, V> m17617g() {
        m17616f();
        if (this.f11445h.isEmpty() && !(this.f11445h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11445h = treeMap;
            this.f11448k = treeMap.descendingMap();
        }
        return (SortedMap) this.f11445h;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m17616f();
        int a = m17608a(k);
        if (a >= 0) {
            return ((C3970d7) this.f11444g.get(a)).setValue(v);
        }
        m17616f();
        if (this.f11444g.isEmpty() && !(this.f11444g instanceof ArrayList)) {
            this.f11444g = new ArrayList(this.f11443f);
        }
        int i = -(a + 1);
        if (i >= this.f11443f) {
            return m17617g().put(k, v);
        }
        int size = this.f11444g.size();
        int i2 = this.f11443f;
        if (size == i2) {
            C3970d7 d7Var = (C3970d7) this.f11444g.remove(i2 - 1);
            m17617g().put((Comparable) d7Var.getKey(), d7Var.getValue());
        }
        this.f11444g.add(i, new C3970d7(this, k, v));
        return null;
    }

    /* renamed from: a */
    public final Entry<K, V> mo12950a(int i) {
        return (Entry) this.f11444g.get(i);
    }

    /* renamed from: a */
    public void mo12907a() {
        if (!this.f11446i) {
            this.f11445h = this.f11445h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11445h);
            this.f11448k = this.f11448k.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11448k);
            this.f11446i = true;
        }
    }

    /* renamed from: b */
    public final boolean mo12951b() {
        return this.f11446i;
    }

    /* renamed from: c */
    public final int mo12952c() {
        return this.f11444g.size();
    }

    public void clear() {
        m17616f();
        if (!this.f11444g.isEmpty()) {
            this.f11444g.clear();
        }
        if (!this.f11445h.isEmpty()) {
            this.f11445h.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m17608a((K) comparable) >= 0 || this.f11445h.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> mo12955d() {
        return this.f11445h.isEmpty() ? C3950c7.m16124a() : this.f11445h.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<Entry<K, V>> mo12956e() {
        if (this.f11449l == null) {
            this.f11449l = new C4311z6(this, null);
        }
        return this.f11449l;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f11447j == null) {
            this.f11447j = new C4003f7(this, null);
        }
        return this.f11447j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4296y6)) {
            return super.equals(obj);
        }
        C4296y6 y6Var = (C4296y6) obj;
        int size = size();
        if (size != y6Var.size()) {
            return false;
        }
        int c = mo12952c();
        if (c != y6Var.mo12952c()) {
            return entrySet().equals(y6Var.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo12950a(i).equals(y6Var.mo12950a(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f11445h.equals(y6Var.f11445h);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m17608a((K) comparable);
        return a >= 0 ? ((C3970d7) this.f11444g.get(a)).getValue() : this.f11445h.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo12952c(); i2++) {
            i += ((C3970d7) this.f11444g.get(i2)).hashCode();
        }
        return this.f11445h.size() > 0 ? i + this.f11445h.hashCode() : i;
    }

    public V remove(Object obj) {
        m17616f();
        Comparable comparable = (Comparable) obj;
        int a = m17608a((K) comparable);
        if (a >= 0) {
            return m17613c(a);
        }
        if (this.f11445h.isEmpty()) {
            return null;
        }
        return this.f11445h.remove(comparable);
    }

    public int size() {
        return this.f11444g.size() + this.f11445h.size();
    }
}
