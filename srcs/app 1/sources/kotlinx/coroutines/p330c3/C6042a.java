package kotlinx.coroutines.p330c3;

import kotlinx.coroutines.C6204v0;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.c3.a */
public final class C6042a {
    /* renamed from: a */
    public static final <T> void m22710a(C5918l<? super C5866d<? super T>, ? extends Object> lVar, C5866d<? super T> dVar) {
        C5942k.m22327b(lVar, "$this$startCoroutineCancellable");
        C5942k.m22327b(dVar, "completion");
        try {
            C6204v0.m23255a(C5880c.m22243a(C5880c.m22244a(lVar, dVar)), C5812t.f14872a);
        } catch (Throwable th) {
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            dVar.mo15391b(a);
        }
    }

    /* renamed from: a */
    public static final <R, T> void m22711a(C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar, R r, C5866d<? super T> dVar) {
        C5942k.m22327b(pVar, "$this$startCoroutineCancellable");
        C5942k.m22327b(dVar, "completion");
        try {
            C6204v0.m23255a(C5880c.m22243a(C5880c.m22245a(pVar, r, dVar)), C5812t.f14872a);
        } catch (Throwable th) {
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            dVar.mo15391b(a);
        }
    }
}
