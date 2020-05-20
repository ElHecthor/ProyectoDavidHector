package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C6136s;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.u0 */
final class C6198u0<T> extends C6136s<T> {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f15307j = AtomicIntegerFieldUpdater.newUpdater(C6198u0.class, "_decision");
    private volatile int _decision = 0;

    public C6198u0(C5871g gVar, C5866d<? super T> dVar) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(dVar, "uCont");
        super(gVar, dVar);
    }

    /* renamed from: w */
    private final boolean m23231w() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15307j.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: x */
    private final boolean m23232x() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f15307j.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15722a(Object obj, int i) {
        if (!m23231w()) {
            super.mo15722a(obj, i);
        }
    }

    /* renamed from: s */
    public int mo15636s() {
        return 1;
    }

    /* renamed from: v */
    public final Object mo15966v() {
        if (m23232x()) {
            return C5885d.m22250a();
        }
        Object b = C6041c2.m22707b(mo15743m());
        if (!(b instanceof C6193t)) {
            return b;
        }
        throw ((C6193t) b).f15300a;
    }
}
