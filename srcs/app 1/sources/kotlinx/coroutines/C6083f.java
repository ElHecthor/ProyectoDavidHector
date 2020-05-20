package kotlinx.coroutines;

import p308k.p316w.C5866d;
import p308k.p316w.C5867e;
import p308k.p316w.C5871g;
import p308k.p316w.C5877h;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.f */
final /* synthetic */ class C6083f {
    /* renamed from: a */
    public static final <T> T m22893a(C5871g gVar, C5922p<? super C6089g0, ? super C5866d<? super T>, ? extends Object> pVar) {
        C6046d1 d1Var;
        C6166n1 n1Var;
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(pVar, "block");
        Thread currentThread = Thread.currentThread();
        C5867e eVar = (C5867e) gVar.get(C5867e.f14898b);
        if (eVar == null) {
            d1Var = C6202u2.f15311b.mo15969b();
            n1Var = C6166n1.f15279f;
            gVar = gVar.plus(d1Var);
        } else {
            C6046d1 d1Var2 = null;
            if (!(eVar instanceof C6046d1)) {
                eVar = null;
            }
            C6046d1 d1Var3 = (C6046d1) eVar;
            if (d1Var3 != null) {
                if (d1Var3.mo15772u()) {
                    d1Var2 = d1Var3;
                }
                if (d1Var2 != null) {
                    d1Var = d1Var2;
                    n1Var = C6166n1.f15279f;
                }
            }
            d1Var = C6202u2.f15311b.mo15967a();
            n1Var = C6166n1.f15279f;
        }
        C5871g a = C5958a0.m22373a(n1Var, gVar);
        C5942k.m22324a((Object) currentThread, "currentThread");
        C6038c cVar = new C6038c(a, currentThread, d1Var);
        cVar.mo15629a(C6149j0.DEFAULT, cVar, pVar);
        return cVar.mo15760v();
    }

    /* renamed from: a */
    public static /* synthetic */ Object m22894a(C5871g gVar, C5922p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C5877h.f14901f;
        }
        return C6066e.m22820a(gVar, pVar);
    }
}
