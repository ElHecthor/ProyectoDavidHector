package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C6108e;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.k1 */
public abstract class C6154k1 extends C6150j1 implements C6184r0 {

    /* renamed from: f */
    private boolean f15267f;

    /* renamed from: a */
    private final ScheduledFuture<?> m23141a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            Executor o = mo15799o();
            if (!(o instanceof ScheduledExecutorService)) {
                o = null;
            }
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) o;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService.schedule(runnable, j, timeUnit);
            }
            return null;
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public C5959a1 mo15710a(long j, Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        ScheduledFuture a = this.f15267f ? m23141a(runnable, j, TimeUnit.MILLISECONDS) : null;
        return a != null ? new C6220z0(a) : C6165n0.f15278l.mo15710a(j, runnable);
    }

    /* renamed from: a */
    public void mo15711a(C5871g gVar, Runnable runnable) {
        Runnable runnable2;
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        try {
            Executor o = mo15799o();
            C6206v2 a = C6210w2.m23278a();
            if (a != null) {
                runnable2 = a.mo15978a(runnable);
                if (runnable2 != null) {
                    o.execute(runnable2);
                }
            }
            runnable2 = runnable;
            o.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C6206v2 a2 = C6210w2.m23278a();
            if (a2 != null) {
                a2.mo15982c();
            }
            C6165n0.f15278l.mo15823a(runnable);
        }
    }

    public void close() {
        Executor o = mo15799o();
        if (!(o instanceof ExecutorService)) {
            o = null;
        }
        ExecutorService executorService = (ExecutorService) o;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6154k1) && ((C6154k1) obj).mo15799o() == mo15799o();
    }

    public int hashCode() {
        return System.identityHashCode(mo15799o());
    }

    /* renamed from: p */
    public final void mo15951p() {
        this.f15267f = C6108e.m22954a(mo15799o());
    }

    public String toString() {
        return mo15799o().toString();
    }
}
