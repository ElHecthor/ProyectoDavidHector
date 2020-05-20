package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6136s;
import kotlinx.coroutines.internal.C6143z;
import kotlinx.coroutines.p330c3.C6042a;
import kotlinx.coroutines.p330c3.C6043b;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5867e;
import p308k.p316w.C5871g;
import p308k.p316w.C5877h;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.g */
final /* synthetic */ class C6088g {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T> Object m22899a(C5871g gVar, C5922p<? super C6089g0, ? super C5866d<? super T>, ? extends Object> pVar, C5866d<? super T> dVar) {
        Object obj;
        C5871g b = dVar.mo15390b();
        C5871g plus = b.plus(gVar);
        C6222z2.m23303a(plus);
        if (plus == b) {
            C6136s sVar = new C6136s(plus, dVar);
            obj = C6043b.m22712a((C5957a<? super T>) sVar, sVar, pVar);
        } else if (C5942k.m22326a((Object) (C5867e) plus.get(C5867e.f14898b), (Object) (C5867e) b.get(C5867e.f14898b))) {
            C6218y2 y2Var = new C6218y2(plus, dVar);
            Object b2 = C6143z.m23097b(plus, null);
            try {
                Object a = C6043b.m22712a((C5957a<? super T>) y2Var, y2Var, pVar);
                C6143z.m23096a(plus, b2);
                obj = a;
            } catch (Throwable th) {
                C6143z.m23096a(plus, b2);
                throw th;
            }
        } else {
            C6198u0 u0Var = new C6198u0(plus, dVar);
            u0Var.mo15637t();
            C6042a.m22711a(pVar, u0Var, u0Var);
            obj = u0Var.mo15966v();
        }
        if (obj == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return obj;
    }

    /* renamed from: a */
    public static final <T> C6173p0<T> m22900a(C6089g0 g0Var, C5871g gVar, C6149j0 j0Var, C5922p<? super C6089g0, ? super C5866d<? super T>, ? extends Object> pVar) {
        C5942k.m22327b(g0Var, "$this$async");
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(j0Var, "start");
        C5942k.m22327b(pVar, "block");
        C5871g a = C5958a0.m22373a(g0Var, gVar);
        C6177q0 d2Var = j0Var.mo15938f() ? new C6047d2(a, pVar) : new C6177q0(a, true);
        d2Var.mo15629a(j0Var, d2Var, pVar);
        return d2Var;
    }

    /* renamed from: a */
    public static /* synthetic */ C6173p0 m22901a(C6089g0 g0Var, C5871g gVar, C6149j0 j0Var, C5922p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C5877h.f14901f;
        }
        if ((i & 2) != 0) {
            j0Var = C6149j0.DEFAULT;
        }
        return C6066e.m22823a(g0Var, gVar, j0Var, pVar);
    }

    /* renamed from: b */
    public static final C6199u1 m22902b(C6089g0 g0Var, C5871g gVar, C6149j0 j0Var, C5922p<? super C6089g0, ? super C5866d<? super C5812t>, ? extends Object> pVar) {
        C5942k.m22327b(g0Var, "$this$launch");
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(j0Var, "start");
        C5942k.m22327b(pVar, "block");
        C5871g a = C5958a0.m22373a(g0Var, gVar);
        C5957a e2Var = j0Var.mo15938f() ? new C6073e2(a, pVar) : new C6175p2(a, true);
        e2Var.mo15629a(j0Var, e2Var, pVar);
        return e2Var;
    }

    /* renamed from: b */
    public static /* synthetic */ C6199u1 m22903b(C6089g0 g0Var, C5871g gVar, C6149j0 j0Var, C5922p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C5877h.f14901f;
        }
        if ((i & 2) != 0) {
            j0Var = C6149j0.DEFAULT;
        }
        return C6066e.m22825b(g0Var, gVar, j0Var, pVar);
    }
}
