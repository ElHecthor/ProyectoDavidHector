package com.bumptech.glide.load.p007o.p010c0;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.o.c0.a */
public final class C0963a implements ExecutorService {

    /* renamed from: g */
    private static final long f3540g = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h */
    private static volatile int f3541h;

    /* renamed from: f */
    private final ExecutorService f3542f;

    /* renamed from: com.bumptech.glide.load.o.c0.a$a */
    public static final class C0964a {

        /* renamed from: a */
        private final boolean f3543a;

        /* renamed from: b */
        private int f3544b;

        /* renamed from: c */
        private int f3545c;

        /* renamed from: d */
        private C0967c f3546d = C0967c.f3555b;

        /* renamed from: e */
        private String f3547e;

        /* renamed from: f */
        private long f3548f;

        C0964a(boolean z) {
            this.f3543a = z;
        }

        /* renamed from: a */
        public C0964a mo4782a(int i) {
            this.f3544b = i;
            this.f3545c = i;
            return this;
        }

        /* renamed from: a */
        public C0964a mo4783a(String str) {
            this.f3547e = str;
            return this;
        }

        /* renamed from: a */
        public C0963a mo4784a() {
            if (!TextUtils.isEmpty(this.f3547e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f3544b, this.f3545c, this.f3548f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0965b(this.f3547e, this.f3546d, this.f3543a));
                if (this.f3548f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C0963a(threadPoolExecutor);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Name must be non-null and non-empty, but given: ");
            sb.append(this.f3547e);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c0.a$b */
    private static final class C0965b implements ThreadFactory {

        /* renamed from: a */
        private final String f3549a;

        /* renamed from: b */
        final C0967c f3550b;

        /* renamed from: c */
        final boolean f3551c;

        /* renamed from: d */
        private int f3552d;

        /* renamed from: com.bumptech.glide.load.o.c0.a$b$a */
        class C0966a extends Thread {
            C0966a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C0965b.this.f3551c) {
                    StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C0965b.this.f3550b.mo4787a(th);
                }
            }
        }

        C0965b(String str, C0967c cVar, boolean z) {
            this.f3549a = str;
            this.f3550b = cVar;
            this.f3551c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C0966a aVar;
            StringBuilder sb = new StringBuilder();
            sb.append("glide-");
            sb.append(this.f3549a);
            sb.append("-thread-");
            sb.append(this.f3552d);
            aVar = new C0966a(runnable, sb.toString());
            this.f3552d++;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c0.a$c */
    public interface C0967c {

        /* renamed from: a */
        public static final C0967c f3554a = new C0969b();

        /* renamed from: b */
        public static final C0967c f3555b = f3554a;

        /* renamed from: com.bumptech.glide.load.o.c0.a$c$a */
        class C0968a implements C0967c {
            C0968a() {
            }

            /* renamed from: a */
            public void mo4787a(Throwable th) {
            }
        }

        /* renamed from: com.bumptech.glide.load.o.c0.a$c$b */
        class C0969b implements C0967c {
            C0969b() {
            }

            /* renamed from: a */
            public void mo4787a(Throwable th) {
                if (th != null) {
                    String str = "GlideExecutor";
                    if (Log.isLoggable(str, 6)) {
                        Log.e(str, "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        /* renamed from: com.bumptech.glide.load.o.c0.a$c$c */
        class C0970c implements C0967c {
            C0970c() {
            }

            /* renamed from: a */
            public void mo4787a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            new C0968a();
            new C0970c();
        }

        /* renamed from: a */
        void mo4787a(Throwable th);
    }

    C0963a(ExecutorService executorService) {
        this.f3542f = executorService;
    }

    /* renamed from: a */
    public static int m4868a() {
        if (f3541h == 0) {
            f3541h = Math.min(4, C0971b.m4883a());
        }
        return f3541h;
    }

    /* renamed from: b */
    public static C0964a m4869b() {
        int i = m4868a() >= 4 ? 2 : 1;
        C0964a aVar = new C0964a(true);
        aVar.mo4782a(i);
        aVar.mo4783a("animation");
        return aVar;
    }

    /* renamed from: c */
    public static C0963a m4870c() {
        return m4869b().mo4784a();
    }

    /* renamed from: d */
    public static C0964a m4871d() {
        C0964a aVar = new C0964a(true);
        aVar.mo4782a(1);
        aVar.mo4783a("disk-cache");
        return aVar;
    }

    /* renamed from: e */
    public static C0963a m4872e() {
        return m4871d().mo4784a();
    }

    /* renamed from: f */
    public static C0964a m4873f() {
        C0964a aVar = new C0964a(false);
        aVar.mo4782a(m4868a());
        aVar.mo4783a("source");
        return aVar;
    }

    /* renamed from: g */
    public static C0963a m4874g() {
        return m4873f().mo4784a();
    }

    /* renamed from: h */
    public static C0963a m4875h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, f3540g, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C0965b("source-unlimited", C0967c.f3555b, false));
        return new C0963a(threadPoolExecutor);
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3542f.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f3542f.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3542f.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3542f.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f3542f.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3542f.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f3542f.isShutdown();
    }

    public boolean isTerminated() {
        return this.f3542f.isTerminated();
    }

    public void shutdown() {
        this.f3542f.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f3542f.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f3542f.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3542f.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3542f.submit(callable);
    }

    public String toString() {
        return this.f3542f.toString();
    }
}
