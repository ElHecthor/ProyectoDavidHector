package p147g.p156d.p157a.p167b.p173d.p180g;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: g.d.a.b.d.g.z2 */
final class C4307z2 {

    /* renamed from: a */
    private final ConcurrentHashMap<C4292y2, List<Throwable>> f11457a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f11458b = new ReferenceQueue<>();

    C4307z2() {
    }

    /* renamed from: a */
    public final List<Throwable> mo12964a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f11458b.poll();
            if (poll == null) {
                break;
            }
            this.f11457a.remove(poll);
        }
        List<Throwable> list = (List) this.f11457a.get(new C4292y2(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f11457a.putIfAbsent(new C4292y2(th, this.f11458b), vector);
        return list2 == null ? vector : list2;
    }
}
