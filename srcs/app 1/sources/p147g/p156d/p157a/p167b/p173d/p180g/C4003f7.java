package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.f7 */
class C4003f7 extends AbstractSet<Entry<K, V>> {

    /* renamed from: f */
    private final /* synthetic */ C4296y6 f10949f;

    private C4003f7(C4296y6 y6Var) {
        this.f10949f = y6Var;
    }

    /* synthetic */ C4003f7(C4296y6 y6Var, C4281x6 x6Var) {
        this(y6Var);
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f10949f.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f10949f.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f10949f.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C4019g7(this.f10949f, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f10949f.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f10949f.size();
    }
}
