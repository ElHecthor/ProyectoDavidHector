package p147g.p156d.p157a.p167b.p184g;

import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: g.d.a.b.g.k */
public final class C4354k {

    /* renamed from: g.d.a.b.g.k$a */
    private static final class C4355a implements C4356b {

        /* renamed from: a */
        private final CountDownLatch f11527a;

        private C4355a() {
            this.f11527a = new CountDownLatch(1);
        }

        /* synthetic */ C4355a(C4346d0 d0Var) {
            this();
        }

        /* renamed from: a */
        public final void mo13002a() {
            this.f11527a.countDown();
        }

        /* renamed from: a */
        public final void mo13023a(Exception exc) {
            this.f11527a.countDown();
        }

        /* renamed from: a */
        public final void mo9847a(Object obj) {
            this.f11527a.countDown();
        }

        /* renamed from: a */
        public final boolean mo13031a(long j, TimeUnit timeUnit) {
            return this.f11527a.await(j, timeUnit);
        }

        /* renamed from: b */
        public final void mo13032b() {
            this.f11527a.await();
        }
    }

    /* renamed from: g.d.a.b.g.k$b */
    interface C4356b extends C4341b, C4345d, C4347e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C4350h<TResult> m17755a(Exception exc) {
        C4344c0 c0Var = new C4344c0();
        c0Var.mo13013a(exc);
        return c0Var;
    }

    /* renamed from: a */
    public static <TResult> C4350h<TResult> m17756a(TResult tresult) {
        C4344c0 c0Var = new C4344c0();
        c0Var.mo13014a(tresult);
        return c0Var;
    }

    /* renamed from: a */
    public static <TResult> C4350h<TResult> m17757a(Executor executor, Callable<TResult> callable) {
        C2148s.m8835a(executor, (Object) "Executor must not be null");
        C2148s.m8835a(callable, (Object) "Callback must not be null");
        C4344c0 c0Var = new C4344c0();
        executor.execute(new C4346d0(c0Var, callable));
        return c0Var;
    }

    /* renamed from: a */
    public static <TResult> TResult m17758a(C4350h<TResult> hVar) {
        C2148s.m8837a();
        C2148s.m8835a(hVar, (Object) "Task must not be null");
        if (hVar.mo13020d()) {
            return m17761b(hVar);
        }
        C4355a aVar = new C4355a(null);
        m17760a(hVar, (C4356b) aVar);
        aVar.mo13032b();
        return m17761b(hVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m17759a(C4350h<TResult> hVar, long j, TimeUnit timeUnit) {
        C2148s.m8837a();
        C2148s.m8835a(hVar, (Object) "Task must not be null");
        C2148s.m8835a(timeUnit, (Object) "TimeUnit must not be null");
        if (hVar.mo13020d()) {
            return m17761b(hVar);
        }
        C4355a aVar = new C4355a(null);
        m17760a(hVar, (C4356b) aVar);
        if (aVar.mo13031a(j, timeUnit)) {
            return m17761b(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m17760a(C4350h<?> hVar, C4356b bVar) {
        hVar.mo13009a(C4352j.f11525b, (C4347e<? super TResult>) bVar);
        hVar.mo13008a(C4352j.f11525b, (C4345d) bVar);
        hVar.mo13006a(C4352j.f11525b, (C4341b) bVar);
    }

    /* renamed from: b */
    private static <TResult> TResult m17761b(C4350h<TResult> hVar) {
        if (hVar.mo13021e()) {
            return hVar.mo13016b();
        }
        if (hVar.mo13019c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.mo13011a());
    }
}
