package kotlinx.coroutines;

import java.util.Iterator;
import java.util.List;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.c0 */
public final class C6039c0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f15089a;

    static {
        Iterator a = C0000a.m0a();
        C5942k.m22324a((Object) a, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        f15089a = C5761l.m21908c(C5758j.m21899a(a));
    }

    /* renamed from: a */
    public static final void m22702a(C5871g gVar, Throwable th) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(th, "exception");
        Iterator it = f15089a.iterator();
        while (true) {
            String str = "currentThread";
            if (it.hasNext()) {
                try {
                    ((CoroutineExceptionHandler) it.next()).handleException(gVar, th);
                } catch (Throwable th2) {
                    Thread currentThread = Thread.currentThread();
                    C5942k.m22324a((Object) currentThread, str);
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C6045d0.m22717a(th, th2));
                }
            } else {
                Thread currentThread2 = Thread.currentThread();
                C5942k.m22324a((Object) currentThread2, str);
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                return;
            }
        }
    }
}
