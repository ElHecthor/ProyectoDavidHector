package kotlinx.coroutines.p331d3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.C6150j1;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d3.f */
final class C6056f extends C6150j1 implements C6060j, Executor {

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f15137j = AtomicIntegerFieldUpdater.newUpdater(C6056f.class, "inFlightTasks");

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Runnable> f15138f = new ConcurrentLinkedQueue<>();

    /* renamed from: g */
    private final C6054d f15139g;

    /* renamed from: h */
    private final int f15140h;

    /* renamed from: i */
    private final C6062l f15141i;
    private volatile int inFlightTasks = 0;

    public C6056f(C6054d dVar, int i, C6062l lVar) {
        C5942k.m22327b(dVar, "dispatcher");
        C5942k.m22327b(lVar, "taskMode");
        this.f15139g = dVar;
        this.f15140h = i;
        this.f15141i = lVar;
    }

    /* renamed from: a */
    private final void m22796a(Runnable runnable, boolean z) {
        while (f15137j.incrementAndGet(this) > this.f15140h) {
            this.f15138f.add(runnable);
            if (f15137j.decrementAndGet(this) < this.f15140h) {
                runnable = (Runnable) this.f15138f.poll();
                if (runnable == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f15139g.mo15798a(runnable, this, z);
    }

    /* renamed from: a */
    public void mo15711a(C5871g gVar, Runnable runnable) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        m22796a(runnable, false);
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        C5942k.m22327b(runnable, "command");
        m22796a(runnable, false);
    }

    /* renamed from: h */
    public void mo15803h() {
        Runnable runnable = (Runnable) this.f15138f.poll();
        if (runnable != null) {
            this.f15139g.mo15798a(runnable, this, true);
            return;
        }
        f15137j.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f15138f.poll();
        if (runnable2 != null) {
            m22796a(runnable2, true);
        }
    }

    /* renamed from: m */
    public C6062l mo15804m() {
        return this.f15141i;
    }

    /* renamed from: o */
    public Executor mo15799o() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.f15139g);
        sb.append(']');
        return sb.toString();
    }
}
