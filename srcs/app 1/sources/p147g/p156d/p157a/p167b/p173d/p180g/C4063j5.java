package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.j5 */
final class C4063j5<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: f */
    private Iterator<Entry<K, Object>> f11043f;

    public C4063j5(Iterator<Entry<K, Object>> it) {
        this.f11043f = it;
    }

    public final boolean hasNext() {
        return this.f11043f.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f11043f.next();
        return entry.getValue() instanceof C3984e5 ? new C4017g5(entry) : entry;
    }

    public final void remove() {
        this.f11043f.remove();
    }
}
