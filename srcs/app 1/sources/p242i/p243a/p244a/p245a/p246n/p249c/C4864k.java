package p242i.p243a.p244a.p245a.p246n.p249c;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: i.a.a.a.n.c.k */
public class C4864k extends ThreadPoolExecutor {

    /* renamed from: f */
    private static final int f12689f;

    /* renamed from: g */
    private static final int f12690g;

    /* renamed from: h */
    private static final int f12691h;

    /* renamed from: i.a.a.a.n.c.k$a */
    protected static final class C4865a implements ThreadFactory {

        /* renamed from: a */
        private final int f12692a;

        public C4865a(int i) {
            this.f12692a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f12692a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f12689f = availableProcessors;
        f12690g = availableProcessors + 1;
        f12691h = (availableProcessors * 2) + 1;
    }

    <T extends Runnable & C4853b & C4866l & C4862i> C4864k(int i, int i2, long j, TimeUnit timeUnit, C4854c<T> cVar, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, cVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static C4864k m19535a() {
        return m19536a(f12690g, f12691h);
    }

    /* renamed from: a */
    public static <T extends Runnable & C4853b & C4866l & C4862i> C4864k m19536a(int i, int i2) {
        C4864k kVar = new C4864k(i, i2, 1, TimeUnit.SECONDS, new C4854c(), new C4865a(10));
        return kVar;
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        C4866l lVar = (C4866l) runnable;
        lVar.mo13956a(true);
        lVar.mo13954a(th);
        getQueue().mo13938c();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (!C4863j.m19526b(runnable)) {
            runnable = newTaskFor(runnable, null);
        }
        super.execute(runnable);
    }

    public C4854c getQueue() {
        return (C4854c) super.getQueue();
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C4861h(runnable, t);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C4861h(callable);
    }
}
