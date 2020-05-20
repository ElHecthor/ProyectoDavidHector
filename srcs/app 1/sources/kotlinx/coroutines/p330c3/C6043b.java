package kotlinx.coroutines.p330c3;

import kotlinx.coroutines.C5957a;
import kotlinx.coroutines.C6041c2;
import kotlinx.coroutines.C6193t;
import kotlinx.coroutines.internal.C6137t;
import kotlinx.coroutines.internal.C6143z;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5953v;

/* renamed from: kotlinx.coroutines.c3.b */
public final class C6043b {
    /* renamed from: a */
    public static final <T, R> Object m22712a(C5957a<? super T> aVar, R r, C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar) {
        Object obj;
        C5942k.m22327b(aVar, "$this$startUndispatchedOrReturn");
        C5942k.m22327b(pVar, "block");
        aVar.mo15637t();
        try {
            C5953v.m22350a((Object) pVar, 2);
            obj = pVar.mo4018c(r, aVar);
        } catch (Throwable th) {
            obj = new C6193t(th, false, 2, null);
        }
        if (obj == C5885d.m22250a() || !aVar.mo15728b(obj, 4)) {
            return C5885d.m22250a();
        }
        Object m = aVar.mo15743m();
        if (!(m instanceof C6193t)) {
            return C6041c2.m22707b(m);
        }
        throw C6137t.m23066a(aVar, ((C6193t) m).f15300a);
    }

    /* renamed from: a */
    public static final <T> void m22713a(C5918l<? super C5866d<? super T>, ? extends Object> lVar, C5866d<? super T> dVar) {
        Object obj;
        C5942k.m22327b(lVar, "$this$startCoroutineUnintercepted");
        C5942k.m22327b(dVar, "completion");
        C5893h.m22278a(dVar);
        try {
            C5953v.m22350a((Object) lVar, 1);
            obj = lVar.mo4090d(dVar);
            if (obj != C5885d.m22250a()) {
                C5804a aVar = C5803m.f14866f;
                C5803m.m22049a(obj);
                dVar.mo15391b(obj);
            }
        } catch (Throwable th) {
            C5804a aVar2 = C5803m.f14866f;
            obj = C5806n.m22053a(th);
        }
    }

    /* renamed from: a */
    public static final <R, T> void m22714a(C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar, R r, C5866d<? super T> dVar) {
        Object obj;
        C5871g b;
        Object b2;
        C5942k.m22327b(pVar, "$this$startCoroutineUndispatched");
        C5942k.m22327b(dVar, "completion");
        C5893h.m22278a(dVar);
        try {
            b = dVar.mo15390b();
            b2 = C6143z.m23097b(b, null);
            C5953v.m22350a((Object) pVar, 2);
            obj = pVar.mo4018c(r, dVar);
            C6143z.m23096a(b, b2);
            if (obj != C5885d.m22250a()) {
                C5804a aVar = C5803m.f14866f;
                C5803m.m22049a(obj);
                dVar.mo15391b(obj);
            }
        } catch (Throwable th) {
            C5804a aVar2 = C5803m.f14866f;
            obj = C5806n.m22053a(th);
        }
    }

    /* renamed from: b */
    public static final <R, T> void m22715b(C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar, R r, C5866d<? super T> dVar) {
        Object obj;
        C5942k.m22327b(pVar, "$this$startCoroutineUnintercepted");
        C5942k.m22327b(dVar, "completion");
        C5893h.m22278a(dVar);
        try {
            C5953v.m22350a((Object) pVar, 2);
            obj = pVar.mo4018c(r, dVar);
            if (obj != C5885d.m22250a()) {
                C5804a aVar = C5803m.f14866f;
                C5803m.m22049a(obj);
                dVar.mo15391b(obj);
            }
        } catch (Throwable th) {
            C5804a aVar2 = C5803m.f14866f;
            obj = C5806n.m22053a(th);
        }
    }
}
