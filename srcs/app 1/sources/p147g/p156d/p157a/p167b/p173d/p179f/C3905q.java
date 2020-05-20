package p147g.p156d.p157a.p167b.p173d.p179f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: g.d.a.b.d.f.q */
final class C3905q extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f10801a;

    public C3905q(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f10801a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C3905q.class) {
            if (this == obj) {
                return true;
            }
            C3905q qVar = (C3905q) obj;
            return this.f10801a == qVar.f10801a && get() == qVar.get();
        }
    }

    public final int hashCode() {
        return this.f10801a;
    }
}
