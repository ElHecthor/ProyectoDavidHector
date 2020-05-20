package kotlinx.coroutines.p327a3;

import p308k.C5812t;
import p308k.p316w.C5866d;

/* renamed from: kotlinx.coroutines.a3.a0 */
public interface C5968a0<E> {

    /* renamed from: kotlinx.coroutines.a3.a0$a */
    public static final class C5969a {
        /* renamed from: a */
        public static /* synthetic */ boolean m22419a(C5968a0 a0Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return a0Var.mo15671a(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: a */
    Object mo15670a(E e, C5866d<? super C5812t> dVar);

    /* renamed from: a */
    boolean mo15671a(Throwable th);

    boolean offer(E e);
}
