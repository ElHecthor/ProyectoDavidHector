package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler.C5956a;
import p308k.C5812t;
import p308k.p312d0.C5751d;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5874b.C5875a;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.u1 */
public interface C6199u1 extends C5874b {

    /* renamed from: d */
    public static final C6201b f15308d = C6201b.f15309a;

    /* renamed from: kotlinx.coroutines.u1$a */
    public static final class C6200a {
        /* renamed from: a */
        public static <R> R m23244a(C6199u1 u1Var, R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
            C5942k.m22327b(pVar, "operation");
            return C5875a.m22235a(u1Var, r, pVar);
        }

        /* renamed from: a */
        public static <E extends C5874b> E m23245a(C6199u1 u1Var, C5876c<E> cVar) {
            C5942k.m22327b(cVar, "key");
            return C5875a.m22236a((C5874b) u1Var, cVar);
        }

        /* renamed from: a */
        public static C5871g m23246a(C6199u1 u1Var, C5871g gVar) {
            C5942k.m22327b(gVar, "context");
            return C5875a.m22237a((C5874b) u1Var, gVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C5959a1 m23247a(C6199u1 u1Var, boolean z, boolean z2, C5918l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return u1Var.mo15720a(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: a */
        public static /* synthetic */ void m23248a(C6199u1 u1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                u1Var.mo15644a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static C5871g m23249b(C6199u1 u1Var, C5876c<?> cVar) {
            C5942k.m22327b(cVar, "key");
            return C5875a.m22238b(u1Var, cVar);
        }
    }

    /* renamed from: kotlinx.coroutines.u1$b */
    public static final class C6201b implements C5876c<C6199u1> {

        /* renamed from: a */
        static final /* synthetic */ C6201b f15309a = new C6201b();

        static {
            C5956a aVar = CoroutineExceptionHandler.f14950c;
        }

        private C6201b() {
        }
    }

    /* renamed from: a */
    C5959a1 mo15719a(C5918l<? super Throwable, C5812t> lVar);

    /* renamed from: a */
    C5959a1 mo15720a(boolean z, boolean z2, C5918l<? super Throwable, C5812t> lVar);

    /* renamed from: a */
    C6168o mo15721a(C6176q qVar);

    /* renamed from: a */
    void mo15644a(CancellationException cancellationException);

    /* renamed from: a */
    boolean mo15630a();

    /* renamed from: d */
    Object mo15731d(C5866d<? super C5812t> dVar);

    /* renamed from: f */
    C5751d<C6199u1> mo15734f();

    /* renamed from: l */
    CancellationException mo15742l();

    boolean start();
}
