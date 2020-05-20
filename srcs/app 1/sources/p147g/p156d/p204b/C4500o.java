package p147g.p156d.p204b;

import java.util.Map.Entry;
import java.util.Set;
import p147g.p156d.p204b.p207y.C4542h;

/* renamed from: g.d.b.o */
public final class C4500o extends C4497l {

    /* renamed from: a */
    private final C4542h<String, C4497l> f11914a = new C4542h<>();

    /* renamed from: a */
    public void mo13373a(String str, C4497l lVar) {
        if (lVar == null) {
            lVar = C4499n.f11913a;
        }
        this.f11914a.put(str, lVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4500o) && ((C4500o) obj).f11914a.equals(this.f11914a));
    }

    public int hashCode() {
        return this.f11914a.hashCode();
    }

    /* renamed from: k */
    public Set<Entry<String, C4497l>> mo13376k() {
        return this.f11914a.entrySet();
    }
}
