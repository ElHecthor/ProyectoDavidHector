package p071f.p126p.p128b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: f.p.b.c */
abstract class C3467c<Params, Progress, Result> {

    /* renamed from: k */
    private static final ThreadFactory f9825k = new C3468a();

    /* renamed from: l */
    private static final BlockingQueue<Runnable> f9826l = new LinkedBlockingQueue(10);

    /* renamed from: m */
    public static final Executor f9827m;

    /* renamed from: n */
    private static C3473f f9828n;

    /* renamed from: f */
    private final C3475h<Params, Result> f9829f = new C3469b();

    /* renamed from: g */
    private final FutureTask<Result> f9830g = new C3470c(this.f9829f);

    /* renamed from: h */
    private volatile C3474g f9831h = C3474g.PENDING;

    /* renamed from: i */
    final AtomicBoolean f9832i = new AtomicBoolean();

    /* renamed from: j */
    final AtomicBoolean f9833j = new AtomicBoolean();

    /* renamed from: f.p.b.c$a */
    static class C3468a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f9834a = new AtomicInteger(1);

        C3468a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("ModernAsyncTask #");
            sb.append(this.f9834a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    }

    /* renamed from: f.p.b.c$b */
    class C3469b extends C3475h<Params, Result> {
        C3469b() {
        }

        public Result call() {
            C3467c.this.f9833j.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C3467c.this.mo11047a(this.f9844f);
                Binder.flushPendingCommands();
                C3467c.this.mo11079d(result);
                return result;
            } catch (Throwable th) {
                C3467c.this.mo11079d(result);
                throw th;
            }
        }
    }

    /* renamed from: f.p.b.c$c */
    class C3470c extends FutureTask<Result> {
        C3470c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            String str = "An error occurred while executing doInBackground()";
            try {
                C3467c.this.mo11080e(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(str, e2.getCause());
            } catch (CancellationException unused) {
                C3467c.this.mo11080e(null);
            } catch (Throwable th) {
                throw new RuntimeException(str, th);
            }
        }
    }

    /* renamed from: f.p.b.c$d */
    static /* synthetic */ class C3471d {

        /* renamed from: a */
        static final /* synthetic */ int[] f9837a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                f.p.b.c$g[] r0 = p071f.p126p.p128b.C3467c.C3474g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9837a = r0
                f.p.b.c$g r1 = p071f.p126p.p128b.C3467c.C3474g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9837a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.p.b.c$g r1 = p071f.p126p.p128b.C3467c.C3474g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p126p.p128b.C3467c.C3471d.<clinit>():void");
        }
    }

    /* renamed from: f.p.b.c$e */
    private static class C3472e<Data> {

        /* renamed from: a */
        final C3467c f9838a;

        /* renamed from: b */
        final Data[] f9839b;

        C3472e(C3467c cVar, Data... dataArr) {
            this.f9838a = cVar;
            this.f9839b = dataArr;
        }
    }

    /* renamed from: f.p.b.c$f */
    private static class C3473f extends Handler {
        C3473f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C3472e eVar = (C3472e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f9838a.mo11073a(eVar.f9839b[0]);
            } else if (i == 2) {
                eVar.f9838a.mo11077b((Progress[]) eVar.f9839b);
            }
        }
    }

    /* renamed from: f.p.b.c$g */
    public enum C3474g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: f.p.b.c$h */
    private static abstract class C3475h<Params, Result> implements Callable<Result> {

        /* renamed from: f */
        Params[] f9844f;

        C3475h() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f9826l, f9825k);
        f9827m = threadPoolExecutor;
    }

    C3467c() {
    }

    /* renamed from: d */
    private static Handler m14236d() {
        C3473f fVar;
        synchronized (C3467c.class) {
            if (f9828n == null) {
                f9828n = new C3473f();
            }
            fVar = f9828n;
        }
        return fVar;
    }

    /* renamed from: a */
    public final C3467c<Params, Progress, Result> mo11072a(Executor executor, Params... paramsArr) {
        if (this.f9831h != C3474g.PENDING) {
            int i = C3471d.f9837a[this.f9831h.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f9831h = C3474g.RUNNING;
            mo11078c();
            this.f9829f.f9844f = paramsArr;
            executor.execute(this.f9830g);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo11047a(Params... paramsArr);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11073a(Result result) {
        if (mo11074a()) {
            mo11049b(result);
        } else {
            mo11050c(result);
        }
        this.f9831h = C3474g.FINISHED;
    }

    /* renamed from: a */
    public final boolean mo11074a() {
        return this.f9832i.get();
    }

    /* renamed from: a */
    public final boolean mo11075a(boolean z) {
        this.f9832i.set(true);
        return this.f9830g.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11076b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11049b(Result result) {
        mo11076b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11077b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11078c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11050c(Result result) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Result mo11079d(Result result) {
        m14236d().obtainMessage(1, new C3472e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11080e(Result result) {
        if (!this.f9833j.get()) {
            mo11079d(result);
        }
    }
}
