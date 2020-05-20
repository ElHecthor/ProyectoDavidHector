package p147g.p156d.p157a.p167b.p173d.p180g;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: g.d.a.b.d.g.y2 */
final class C4292y2 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f11440a;

    public C4292y2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f11440a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4292y2.class) {
            if (this == obj) {
                return true;
            }
            C4292y2 y2Var = (C4292y2) obj;
            return this.f11440a == y2Var.f11440a && get() == y2Var.get();
        }
    }

    public final int hashCode() {
        return this.f11440a;
    }
}
