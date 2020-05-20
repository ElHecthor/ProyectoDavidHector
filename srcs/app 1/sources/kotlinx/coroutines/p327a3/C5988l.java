package kotlinx.coroutines.p327a3;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C6098i1;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.l */
final /* synthetic */ class C5988l {
    /* renamed from: a */
    public static final void m22510a(C6003w<?> wVar, Throwable th) {
        C5942k.m22327b(wVar, "$this$cancelConsumed");
        CancellationException cancellationException = null;
        if (th != 0) {
            if (th instanceof CancellationException) {
                cancellationException = th;
            }
            cancellationException = cancellationException;
            if (cancellationException == null) {
                cancellationException = C6098i1.m22916a("Channel was consumed, consumer had failed", th);
            }
        }
        wVar.mo15644a(cancellationException);
    }
}
