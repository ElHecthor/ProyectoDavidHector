package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.g7 */
final class C4019g7 implements Iterator<Entry<K, V>> {

    /* renamed from: f */
    private int f10975f;

    /* renamed from: g */
    private boolean f10976g;

    /* renamed from: h */
    private Iterator<Entry<K, V>> f10977h;

    /* renamed from: i */
    private final /* synthetic */ C4296y6 f10978i;

    private C4019g7(C4296y6 y6Var) {
        this.f10978i = y6Var;
        this.f10975f = -1;
    }

    /* synthetic */ C4019g7(C4296y6 y6Var, C4281x6 x6Var) {
        this(y6Var);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m16426a() {
        if (this.f10977h == null) {
            this.f10977h = this.f10978i.f11445h.entrySet().iterator();
        }
        return this.f10977h;
    }

    public final boolean hasNext() {
        return this.f10975f + 1 < this.f10978i.f11444g.size() || (!this.f10978i.f11445h.isEmpty() && m16426a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f10976g = true;
        int i = this.f10975f + 1;
        this.f10975f = i;
        return (Entry) (i < this.f10978i.f11444g.size() ? this.f10978i.f11444g.get(this.f10975f) : m16426a().next());
    }

    public final void remove() {
        if (this.f10976g) {
            this.f10976g = false;
            this.f10978i.m17616f();
            if (this.f10975f < this.f10978i.f11444g.size()) {
                C4296y6 y6Var = this.f10978i;
                int i = this.f10975f;
                this.f10975f = i - 1;
                y6Var.m17613c(i);
                return;
            }
            m16426a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
