package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C6069e1.C6071b;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.f1 */
public abstract class C6086f1 extends C6046d1 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15854a(long j, C6071b bVar) {
        C5942k.m22327b(bVar, "delayedTask");
        if (C6157l0.m23149a()) {
            if (!(this != C6165n0.f15278l)) {
                throw new AssertionError();
            }
        }
        C6165n0.f15278l.mo15825b(j, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Thread mo15762v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo15855w() {
        Thread v = mo15762v();
        if (Thread.currentThread() != v) {
            C6206v2 a = C6210w2.m23278a();
            if (a != null) {
                a.mo15980a(v);
            } else {
                LockSupport.unpark(v);
            }
        }
    }
}
