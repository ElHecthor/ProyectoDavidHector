package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.r */
public final class C6181r extends C6150j1 {

    /* renamed from: f */
    private static final int f15291f;

    /* renamed from: g */
    private static boolean f15292g;

    /* renamed from: h */
    public static final C6181r f15293h = new C6181r();
    private static volatile Executor pool;

    /* renamed from: kotlinx.coroutines.r$a */
    static final class C6182a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f15294a;

        C6182a(AtomicInteger atomicInteger) {
            this.f15294a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommonPool-worker-");
            sb.append(this.f15294a.incrementAndGet());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: kotlinx.coroutines.r$b */
    static final class C6183b implements Runnable {

        /* renamed from: f */
        public static final C6183b f15295f = new C6183b();

        C6183b() {
        }

        public final void run() {
        }
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer a = C5786o.m21964a(str);
            if (a == null || a.intValue() < 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected positive number in kotlinx.coroutines.default.parallelism, but has ");
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            i = a.intValue();
        } else {
            i = -1;
        }
        f15291f = i;
    }

    private C6181r() {
    }

    /* renamed from: p */
    private final ExecutorService m23197p() {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(m23200t(), new C6182a(new AtomicInteger()));
        C5942k.m22324a((Object) newFixedThreadPool, "Executors.newFixedThread…Daemon = true }\n        }");
        return newFixedThreadPool;
    }

    /* renamed from: q */
    private final ExecutorService m23198q() {
        Class cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return m23197p();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m23197p();
        }
        if (!f15292g && f15291f < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!f15293h.mo15957a(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f15293h.m23200t())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        return executorService2 != null ? executorService2 : m23197p();
    }

    /* renamed from: s */
    private final synchronized Executor m23199s() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m23198q();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: t */
    private final int m23200t() {
        Integer valueOf = Integer.valueOf(f15291f);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : C5736g.m21866a(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* renamed from: a */
    public void mo15711a(C5871g gVar, Runnable runnable) {
        Runnable runnable2;
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m23199s();
            }
            C6206v2 a = C6210w2.m23278a();
            if (a != null) {
                runnable2 = a.mo15978a(runnable);
                if (runnable2 != null) {
                    executor.execute(runnable2);
                }
            }
            runnable2 = runnable;
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C6206v2 a2 = C6210w2.m23278a();
            if (a2 != null) {
                a2.mo15982c();
            }
            C6165n0.f15278l.mo15823a(runnable);
        }
    }

    /* renamed from: a */
    public final boolean mo15957a(Class<?> cls, ExecutorService executorService) {
        C5942k.m22327b(cls, "fjpClass");
        C5942k.m22327b(executorService, "executor");
        executorService.submit(C6183b.f15295f);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* renamed from: o */
    public Executor mo15799o() {
        Executor executor = pool;
        return executor != null ? executor : m23199s();
    }

    public String toString() {
        return "CommonPool";
    }
}
