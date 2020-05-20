package kotlinx.coroutines;

import java.util.concurrent.Executor;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.l1 */
final class C6158l1 extends C6154k1 {

    /* renamed from: g */
    private final Executor f15273g;

    public C6158l1(Executor executor) {
        C5942k.m22327b(executor, "executor");
        this.f15273g = executor;
        mo15951p();
    }

    /* renamed from: o */
    public Executor mo15799o() {
        return this.f15273g;
    }
}
