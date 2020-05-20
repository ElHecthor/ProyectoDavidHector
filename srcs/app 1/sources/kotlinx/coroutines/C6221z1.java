package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p308k.p312d0.C5751d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.z1 */
final /* synthetic */ class C6221z1 {
    /* renamed from: a */
    public static final C6188s m23297a(C6199u1 u1Var) {
        return new C6213x1(u1Var);
    }

    /* renamed from: a */
    public static /* synthetic */ C6188s m23298a(C6199u1 u1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            u1Var = null;
        }
        return C6217y1.m23288a(u1Var);
    }

    /* renamed from: a */
    public static final void m23299a(C5871g gVar, CancellationException cancellationException) {
        C5942k.m22327b(gVar, "$this$cancel");
        C6199u1 u1Var = (C6199u1) gVar.get(C6199u1.f15308d);
        if (u1Var != null) {
            u1Var.mo15644a(cancellationException);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m23300a(C5871g gVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C6217y1.m23290a(gVar, cancellationException);
    }

    /* renamed from: b */
    public static final void m23301b(C5871g gVar, CancellationException cancellationException) {
        C5942k.m22327b(gVar, "$this$cancelChildren");
        C6199u1 u1Var = (C6199u1) gVar.get(C6199u1.f15308d);
        if (u1Var != null) {
            C5751d<C6199u1> f = u1Var.mo15734f();
            if (f != null) {
                for (C6199u1 a : f) {
                    a.mo15644a(cancellationException);
                }
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m23302b(C5871g gVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C6217y1.m23292b(gVar, cancellationException);
    }
}
