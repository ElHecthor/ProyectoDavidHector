package kotlinx.coroutines.internal;

import kotlinx.coroutines.C5957a;
import p308k.p316w.C5866d;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C6137t {
    /* renamed from: a */
    public static final Throwable m23066a(C5957a<?> aVar, Throwable th) {
        C5942k.m22327b(aVar, "$this$tryRecover");
        C5942k.m22327b(th, "exception");
        if (!(aVar instanceof C6136s)) {
            aVar = null;
        }
        C6136s sVar = (C6136s) aVar;
        if (sVar != null) {
            C5866d<T> dVar = sVar.f15244i;
            if (dVar != null) {
                return C6138u.m23070a(th, dVar);
            }
        }
        return th;
    }
}
