package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.a7 */
final class C3916a7 implements Iterator<Entry<K, V>> {

    /* renamed from: f */
    private int f10808f;

    /* renamed from: g */
    private Iterator<Entry<K, V>> f10809g;

    /* renamed from: h */
    private final /* synthetic */ C4296y6 f10810h;

    private C3916a7(C4296y6 y6Var) {
        this.f10810h = y6Var;
        this.f10808f = this.f10810h.f11444g.size();
    }

    /* synthetic */ C3916a7(C4296y6 y6Var, C4281x6 x6Var) {
        this(y6Var);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m15723a() {
        if (this.f10809g == null) {
            this.f10809g = this.f10810h.f11448k.entrySet().iterator();
        }
        return this.f10809g;
    }

    public final boolean hasNext() {
        int i = this.f10808f;
        return (i > 0 && i <= this.f10810h.f11444g.size()) || m15723a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m15723a().hasNext()) {
            obj = m15723a().next();
        } else {
            List b = this.f10810h.f11444g;
            int i = this.f10808f - 1;
            this.f10808f = i;
            obj = b.get(i);
        }
        return (Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
