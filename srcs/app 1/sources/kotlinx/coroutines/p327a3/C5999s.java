package kotlinx.coroutines.p327a3;

import kotlinx.coroutines.C5958a0;
import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.C6149j0;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5877h;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.s */
public final class C5999s {
    /* renamed from: a */
    public static final <E> C6003w<E> m22547a(C6089g0 g0Var, C5871g gVar, int i, C5922p<? super C6001u<? super E>, ? super C5866d<? super C5812t>, ? extends Object> pVar) {
        C5942k.m22327b(g0Var, "$this$produce");
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(pVar, "block");
        C6000t tVar = new C6000t(C5958a0.m22373a(g0Var, gVar), C5986j.m22508a(i));
        tVar.mo15629a(C6149j0.DEFAULT, tVar, pVar);
        return tVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C6003w m22548a(C6089g0 g0Var, C5871g gVar, int i, C5922p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = C5877h.f14901f;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m22547a(g0Var, gVar, i, pVar);
    }
}
