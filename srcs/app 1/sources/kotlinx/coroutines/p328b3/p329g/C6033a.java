package kotlinx.coroutines.p328b3.p329g;

import kotlinx.coroutines.internal.C6136s;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b3.g.a */
final class C6033a<T> extends C6136s<T> {
    public C6033a(C5871g gVar, C5866d<? super T> dVar) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(dVar, "uCont");
        super(gVar, dVar);
    }

    /* renamed from: e */
    public boolean mo15732e(Throwable th) {
        C5942k.m22327b(th, "cause");
        return mo15726a((Object) th);
    }
}
