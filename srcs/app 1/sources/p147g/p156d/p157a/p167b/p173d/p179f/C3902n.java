package p147g.p156d.p157a.p167b.p173d.p179f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.d.a.b.d.f.n */
final class C3902n {

    /* renamed from: a */
    private final ConcurrentHashMap<C3905q, List<Throwable>> f10798a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f10799b = new ReferenceQueue<>();

    C3902n() {
    }

    /* renamed from: a */
    public final List<Throwable> mo12047a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f10799b.poll();
            if (poll == null) {
                break;
            }
            this.f10798a.remove(poll);
        }
        List<Throwable> list = (List) this.f10798a.get(new C3905q(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f10798a.putIfAbsent(new C3905q(th, this.f10799b), vector);
        return list2 == null ? vector : list2;
    }
}
