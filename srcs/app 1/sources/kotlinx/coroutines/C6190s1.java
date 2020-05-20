package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.s1 */
final class C6190s1 extends C6209w1<C6199u1> {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f15297k = AtomicIntegerFieldUpdater.newUpdater(C6190s1.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: j */
    private final C5918l<Throwable, C5812t> f15298j;

    public C6190s1(C6199u1 u1Var, C5918l<? super Throwable, C5812t> lVar) {
        C5942k.m22327b(u1Var, "job");
        C5942k.m22327b(lVar, "handler");
        super(u1Var);
        this.f15298j = lVar;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15751d((Throwable) obj);
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public void mo15751d(Throwable th) {
        if (f15297k.compareAndSet(this, 0, 1)) {
            this.f15298j.mo4090d(th);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancelling[");
        sb.append(C6161m0.m23157a((Object) this));
        sb.append('@');
        sb.append(C6161m0.m23159b(this));
        sb.append(']');
        return sb.toString();
    }
}
