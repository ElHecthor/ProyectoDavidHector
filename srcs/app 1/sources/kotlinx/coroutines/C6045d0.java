package kotlinx.coroutines;

import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d0 */
public final class C6045d0 {
    /* renamed from: a */
    public static final Throwable m22717a(Throwable th, Throwable th2) {
        C5942k.m22327b(th, "originalException");
        C5942k.m22327b(th2, "thrownException");
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C5727b.m21843a(runtimeException, th);
        return runtimeException;
    }

    /* renamed from: a */
    public static final void m22718a(C5871g gVar, Throwable th) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(th, "exception");
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f14950c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(gVar, th);
            } else {
                C6039c0.m22702a(gVar, th);
            }
        } catch (Throwable th2) {
            C6039c0.m22702a(gVar, m22717a(th, th2));
        }
    }
}
