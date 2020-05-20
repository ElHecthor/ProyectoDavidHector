package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6122k;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.l */
public final class C6156l {
    /* renamed from: a */
    public static final void m23147a(C6148j<?> jVar, C5959a1 a1Var) {
        C5942k.m22327b(jVar, "$this$disposeOnCancellation");
        C5942k.m22327b(a1Var, "handle");
        jVar.mo15934b((C5918l<? super Throwable, C5812t>) new C6013b1<Object,C5812t>(a1Var));
    }

    /* renamed from: a */
    public static final void m23148a(C6148j<?> jVar, C6122k kVar) {
        C5942k.m22327b(jVar, "$this$removeOnCancellation");
        C5942k.m22327b(kVar, "node");
        jVar.mo15934b((C5918l<? super Throwable, C5812t>) new C6155k2<Object,C5812t>(kVar));
    }
}
