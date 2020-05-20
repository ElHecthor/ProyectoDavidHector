package kotlinx.coroutines;

import java.util.concurrent.Executor;
import p308k.p316w.C5877h;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.x0 */
final class C6212x0 implements Executor {

    /* renamed from: f */
    public final C6012b0 f15321f;

    public void execute(Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        this.f15321f.mo15711a(C5877h.f14901f, runnable);
    }

    public String toString() {
        return this.f15321f.toString();
    }
}
