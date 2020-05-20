package kotlinx.coroutines;

import java.util.concurrent.Future;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.z0 */
final class C6220z0 implements C5959a1 {

    /* renamed from: f */
    private final Future<?> f15326f;

    public C6220z0(Future<?> future) {
        C5942k.m22327b(future, "future");
        this.f15326f = future;
    }

    /* renamed from: f */
    public void mo15639f() {
        this.f15326f.cancel(false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisposableFutureHandle[");
        sb.append(this.f15326f);
        sb.append(']');
        return sb.toString();
    }
}
