package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.i1 */
public final class C6098i1 {
    /* renamed from: a */
    public static final CancellationException m22916a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
