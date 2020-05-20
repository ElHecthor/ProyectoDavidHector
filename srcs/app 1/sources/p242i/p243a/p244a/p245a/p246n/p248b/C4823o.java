package p242i.p243a.p244a.p245a.p246n.p248b;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.b.o */
public final class C4823o {

    /* renamed from: i.a.a.a.n.b.o$a */
    static class C4824a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f12592a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f12593b;

        /* renamed from: i.a.a.a.n.b.o$a$a */
        class C4825a extends C4812h {

            /* renamed from: f */
            final /* synthetic */ Runnable f12594f;

            C4825a(C4824a aVar, Runnable runnable) {
                this.f12594f = runnable;
            }

            /* renamed from: a */
            public void mo5649a() {
                this.f12594f.run();
            }
        }

        C4824a(String str, AtomicLong atomicLong) {
            this.f12592a = str;
            this.f12593b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C4825a(this, runnable));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12592a);
            sb.append(this.f12593b.getAndIncrement());
            newThread.setName(sb.toString());
            return newThread;
        }
    }

    /* renamed from: i.a.a.a.n.b.o$b */
    static class C4826b extends C4812h {

        /* renamed from: f */
        final /* synthetic */ String f12595f;

        /* renamed from: g */
        final /* synthetic */ ExecutorService f12596g;

        /* renamed from: h */
        final /* synthetic */ long f12597h;

        /* renamed from: i */
        final /* synthetic */ TimeUnit f12598i;

        C4826b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f12595f = str;
            this.f12596g = executorService;
            this.f12597h = j;
            this.f12598i = timeUnit;
        }

        /* renamed from: a */
        public void mo5649a() {
            String str = "Fabric";
            try {
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Executing shutdown hook for ");
                sb.append(this.f12595f);
                f.mo13796e(str, sb.toString());
                this.f12596g.shutdown();
                if (!this.f12596g.awaitTermination(this.f12597h, this.f12598i)) {
                    C4795l f2 = C4781c.m19229f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f12595f);
                    sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                    f2.mo13796e(str, sb2.toString());
                    this.f12596g.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C4781c.m19229f().mo13796e(str, String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f12595f}));
                this.f12596g.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static ExecutorService m19405a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m19409c(str));
        m19406a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: a */
    private static final void m19406a(String str, ExecutorService executorService) {
        m19407a(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static final void m19407a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C4826b bVar = new C4826b(str, executorService, j, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(bVar, sb.toString()));
    }

    /* renamed from: b */
    public static ScheduledExecutorService m19408b(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m19409c(str));
        m19406a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static final ThreadFactory m19409c(String str) {
        return new C4824a(str, new AtomicLong(1));
    }
}
