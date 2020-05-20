package kotlinx.coroutines;

import java.util.concurrent.Executor;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.m1 */
public final class C6162m1 {
    /* renamed from: a */
    public static final C6012b0 m23160a(Executor executor) {
        C5942k.m22327b(executor, "$this$asCoroutineDispatcher");
        C6212x0 x0Var = (C6212x0) (!(executor instanceof C6212x0) ? null : executor);
        if (x0Var != null) {
            C6012b0 b0Var = x0Var.f15321f;
            if (b0Var != null) {
                return b0Var;
            }
        }
        return new C6158l1(executor);
    }
}
