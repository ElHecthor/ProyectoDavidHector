package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p308k.p316w.C5866d;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.m */
public final class C6160m extends C6193t {

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f15275c = AtomicIntegerFieldUpdater.newUpdater(C6160m.class, "_resumed");
    private volatile int _resumed;

    public C6160m(C5866d<?> dVar, Throwable th, boolean z) {
        C5942k.m22327b(dVar, "continuation");
        if (th == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(dVar);
            sb.append(" was cancelled normally");
            th = new CancellationException(sb.toString());
        }
        super(th, z);
        this._resumed = 0;
    }

    /* renamed from: c */
    public final boolean mo15953c() {
        return f15275c.compareAndSet(this, 0, 1);
    }
}
