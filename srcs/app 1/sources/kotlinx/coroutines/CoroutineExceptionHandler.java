package kotlinx.coroutines;

import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;

public interface CoroutineExceptionHandler extends C5874b {

    /* renamed from: c */
    public static final C5956a f14950c = C5956a.f14951a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C5956a implements C5876c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C5956a f14951a = new C5956a();

        private C5956a() {
        }
    }

    void handleException(C5871g gVar, Throwable th);
}
