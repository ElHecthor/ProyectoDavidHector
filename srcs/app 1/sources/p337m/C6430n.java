package p337m;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p337m.p338f0.p341e.C6273e;
import p337m.p338f0.p341e.C6273e.C6274a;

/* renamed from: m.n */
public final class C6430n {

    /* renamed from: a */
    private int f15927a = 64;

    /* renamed from: b */
    private int f15928b = 5;

    /* renamed from: c */
    private Runnable f15929c;

    /* renamed from: d */
    private ExecutorService f15930d;

    /* renamed from: e */
    private final ArrayDeque<C6274a> f15931e = new ArrayDeque<>();

    /* renamed from: f */
    private final ArrayDeque<C6274a> f15932f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<C6273e> f15933g = new ArrayDeque<>();

    /* renamed from: a */
    private final C6274a m24205a(String str) {
        Iterator it = this.f15932f.iterator();
        while (it.hasNext()) {
            C6274a aVar = (C6274a) it.next();
            if (C5942k.m22326a((Object) aVar.mo16192c(), (Object) str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f15931e.iterator();
        while (it2.hasNext()) {
            C6274a aVar2 = (C6274a) it2.next();
            if (C5942k.m22326a((Object) aVar2.mo16192c(), (Object) str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final <T> void m24206a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f15929c;
                C5812t tVar = C5812t.f14872a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m24207c() && runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: c */
    private final boolean m24207c() {
        int i;
        boolean z;
        if (!C6250b.f15421g || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator it = this.f15931e.iterator();
                C5942k.m22324a((Object) it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C6274a aVar = (C6274a) it.next();
                    if (this.f15932f.size() >= this.f15927a) {
                        break;
                    } else if (aVar.mo16191b().get() < this.f15928b) {
                        it.remove();
                        aVar.mo16191b().incrementAndGet();
                        C5942k.m22324a((Object) aVar, "asyncCall");
                        arrayList.add(aVar);
                        this.f15932f.add(aVar);
                    }
                }
                z = mo16562b() > 0;
                C5812t tVar = C5812t.f14872a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((C6274a) arrayList.get(i)).mo16189a(mo16559a());
            }
            return z;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C5942k.m22324a((Object) currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final synchronized ExecutorService mo16559a() {
        ExecutorService executorService;
        if (this.f15930d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            StringBuilder sb = new StringBuilder();
            sb.append(C6250b.f15422h);
            sb.append(" Dispatcher");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, C6250b.m23453a(sb.toString(), false));
            this.f15930d = threadPoolExecutor;
        }
        executorService = this.f15930d;
        if (executorService == null) {
            C5942k.m22323a();
            throw null;
        }
        return executorService;
    }

    /* renamed from: a */
    public final void mo16560a(C6274a aVar) {
        C5942k.m22327b(aVar, "call");
        synchronized (this) {
            this.f15931e.add(aVar);
            if (!aVar.mo16188a().mo16180d()) {
                C6274a a = m24205a(aVar.mo16192c());
                if (a != null) {
                    aVar.mo16190a(a);
                }
            }
            C5812t tVar = C5812t.f14872a;
        }
        m24207c();
    }

    /* renamed from: a */
    public final synchronized void mo16561a(C6273e eVar) {
        C5942k.m22327b(eVar, "call");
        this.f15933g.add(eVar);
    }

    /* renamed from: b */
    public final synchronized int mo16562b() {
        return this.f15932f.size() + this.f15933g.size();
    }

    /* renamed from: b */
    public final void mo16563b(C6274a aVar) {
        C5942k.m22327b(aVar, "call");
        aVar.mo16191b().decrementAndGet();
        m24206a(this.f15932f, aVar);
    }

    /* renamed from: b */
    public final void mo16564b(C6273e eVar) {
        C5942k.m22327b(eVar, "call");
        m24206a(this.f15933g, eVar);
    }
}
