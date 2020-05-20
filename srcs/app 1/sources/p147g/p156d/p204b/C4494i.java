package p147g.p156d.p204b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: g.d.b.i */
public final class C4494i extends C4497l implements Iterable<C4497l> {

    /* renamed from: f */
    private final List<C4497l> f11912f = new ArrayList();

    /* renamed from: a */
    public void mo13358a(C4497l lVar) {
        if (lVar == null) {
            lVar = C4499n.f11913a;
        }
        this.f11912f.add(lVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4494i) && ((C4494i) obj).f11912f.equals(this.f11912f));
    }

    public int hashCode() {
        return this.f11912f.hashCode();
    }

    public Iterator<C4497l> iterator() {
        return this.f11912f.iterator();
    }
}
