package com.crashlytics.android.p033e;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p242i.p243a.p244a.p245a.C4781c;

/* renamed from: com.crashlytics.android.e.j */
class C1400j {

    /* renamed from: a */
    private final ExecutorService f4475a;

    /* renamed from: com.crashlytics.android.e.j$a */
    class C1401a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f4476f;

        C1401a(C1400j jVar, Runnable runnable) {
            this.f4476f = runnable;
        }

        public void run() {
            try {
                this.f4476f.run();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "Failed to execute task.", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.e.j$b */
    class C1402b implements Callable<T> {

        /* renamed from: f */
        final /* synthetic */ Callable f4477f;

        C1402b(C1400j jVar, Callable callable) {
            this.f4477f = callable;
        }

        public T call() {
            try {
                return this.f4477f.call();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "Failed to execute task.", e);
                return null;
            }
        }
    }

    public C1400j(ExecutorService executorService) {
        this.f4475a = executorService;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Future<?> mo5561a(Runnable runnable) {
        try {
            return this.f4475a.submit(new C1401a(this, runnable));
        } catch (RejectedExecutionException unused) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> Future<T> mo5562a(Callable<T> callable) {
        try {
            return this.f4475a.submit(new C1402b(this, callable));
        } catch (RejectedExecutionException unused) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> T mo5563b(Callable<T> callable) {
        String str = "CrashlyticsCore";
        try {
            return Looper.getMainLooper() == Looper.myLooper() ? this.f4475a.submit(callable).get(4, TimeUnit.SECONDS) : this.f4475a.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            C4781c.m19229f().mo13796e(str, "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e) {
            C4781c.m19229f().mo13793c(str, "Failed to execute task.", e);
            return null;
        }
    }
}
