package p242i.p243a.p244a.p245a.p246n.p249c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.LinkedList;
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

/* renamed from: i.a.a.a.n.c.a */
public abstract class C4842a<Params, Progress, Result> {

    /* renamed from: k */
    private static final int f12646k;

    /* renamed from: l */
    private static final int f12647l;

    /* renamed from: m */
    private static final int f12648m;

    /* renamed from: n */
    private static final ThreadFactory f12649n = new C4843a();

    /* renamed from: o */
    private static final BlockingQueue<Runnable> f12650o = new LinkedBlockingQueue(128);

    /* renamed from: p */
    public static final Executor f12651p;

    /* renamed from: q */
    public static final Executor f12652q = new C4849g(null);

    /* renamed from: r */
    private static final C4848f f12653r = new C4848f();

    /* renamed from: f */
    private final C4852i<Params, Result> f12654f = new C4844b();

    /* renamed from: g */
    private final FutureTask<Result> f12655g = new C4845c(this.f12654f);

    /* renamed from: h */
    private volatile C4851h f12656h = C4851h.PENDING;

    /* renamed from: i */
    private final AtomicBoolean f12657i = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicBoolean f12658j = new AtomicBoolean();

    /* renamed from: i.a.a.a.n.c.a$a */
    static class C4843a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f12659a = new AtomicInteger(1);

        C4843a() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTask #");
            sb.append(this.f12659a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    }

    /* renamed from: i.a.a.a.n.c.a$b */
    class C4844b extends C4852i<Params, Result> {
        C4844b() {
            super(null);
        }

        public Result call() {
            C4842a.this.f12658j.set(true);
            Process.setThreadPriority(10);
            C4842a aVar = C4842a.this;
            Result a = aVar.mo13822a(this.f12673f);
            aVar.m19482e(a);
            return a;
        }
    }

    /* renamed from: i.a.a.a.n.c.a$c */
    class C4845c extends FutureTask<Result> {
        C4845c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C4842a.this.m19483f(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C4842a.this.m19483f(null);
            }
        }
    }

    /* renamed from: i.a.a.a.n.c.a$d */
    static /* synthetic */ class C4846d {

        /* renamed from: a */
        static final /* synthetic */ int[] f12662a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                i.a.a.a.n.c.a$h[] r0 = p242i.p243a.p244a.p245a.p246n.p249c.C4842a.C4851h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12662a = r0
                i.a.a.a.n.c.a$h r1 = p242i.p243a.p244a.p245a.p246n.p249c.C4842a.C4851h.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12662a     // Catch:{ NoSuchFieldError -> 0x001d }
                i.a.a.a.n.c.a$h r1 = p242i.p243a.p244a.p245a.p246n.p249c.C4842a.C4851h.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p249c.C4842a.C4846d.<clinit>():void");
        }
    }

    /* renamed from: i.a.a.a.n.c.a$e */
    private static class C4847e<Data> {

        /* renamed from: a */
        final C4842a f12663a;

        /* renamed from: b */
        final Data[] f12664b;

        C4847e(C4842a aVar, Data... dataArr) {
            this.f12663a = aVar;
            this.f12664b = dataArr;
        }
    }

    /* renamed from: i.a.a.a.n.c.a$f */
    private static class C4848f extends Handler {
        public C4848f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C4847e eVar = (C4847e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f12663a.m19481d(eVar.f12664b[0]);
            } else if (i == 2) {
                eVar.f12663a.mo13919b((Progress[]) eVar.f12664b);
            }
        }
    }

    /* renamed from: i.a.a.a.n.c.a$g */
    private static class C4849g implements Executor {

        /* renamed from: f */
        final LinkedList<Runnable> f12665f;

        /* renamed from: g */
        Runnable f12666g;

        /* renamed from: i.a.a.a.n.c.a$g$a */
        class C4850a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f12667f;

            C4850a(Runnable runnable) {
                this.f12667f = runnable;
            }

            public void run() {
                try {
                    this.f12667f.run();
                } finally {
                    C4849g.this.mo13927a();
                }
            }
        }

        private C4849g() {
            this.f12665f = new LinkedList<>();
        }

        /* synthetic */ C4849g(C4843a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo13927a() {
            Runnable runnable = (Runnable) this.f12665f.poll();
            this.f12666g = runnable;
            if (runnable != null) {
                C4842a.f12651p.execute(runnable);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f12665f.offer(new C4850a(runnable));
            if (this.f12666g == null) {
                mo13927a();
            }
        }
    }

    /* renamed from: i.a.a.a.n.c.a$h */
    public enum C4851h {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: i.a.a.a.n.c.a$i */
    private static abstract class C4852i<Params, Result> implements Callable<Result> {

        /* renamed from: f */
        Params[] f12673f;

        private C4852i() {
        }

        /* synthetic */ C4852i(C4843a aVar) {
            this();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f12646k = availableProcessors;
        f12647l = availableProcessors + 1;
        f12648m = (availableProcessors * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f12647l, f12648m, 1, TimeUnit.SECONDS, f12650o, f12649n);
        f12651p = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19481d(Result result) {
        if (mo13922j()) {
            mo13824b(result);
        } else {
            mo13825c(result);
        }
        this.f12656h = C4851h.FINISHED;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Result m19482e(Result result) {
        f12653r.obtainMessage(1, new C4847e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m19483f(Result result) {
        if (!this.f12658j.get()) {
            m19482e(result);
        }
    }

    /* renamed from: a */
    public final C4842a<Params, Progress, Result> mo13918a(Executor executor, Params... paramsArr) {
        if (this.f12656h != C4851h.PENDING) {
            int i = C4846d.f12662a[this.f12656h.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f12656h = C4851h.RUNNING;
        mo13826l();
        this.f12654f.f12673f = paramsArr;
        executor.execute(this.f12655g);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo13822a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo13824b(Result result);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13919b(Progress... progressArr) {
    }

    /* renamed from: b */
    public final boolean mo13920b(boolean z) {
        this.f12657i.set(true);
        return this.f12655g.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo13825c(Result result);

    /* renamed from: i */
    public final C4851h mo13921i() {
        return this.f12656h;
    }

    /* renamed from: j */
    public final boolean mo13922j() {
        return this.f12657i.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo13826l() {
    }
}
