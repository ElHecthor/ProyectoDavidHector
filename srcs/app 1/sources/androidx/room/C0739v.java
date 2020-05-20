package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.v */
class C0739v implements Executor {

    /* renamed from: f */
    private final Executor f2907f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f2908g = new ArrayDeque<>();

    /* renamed from: h */
    private Runnable f2909h;

    /* renamed from: androidx.room.v$a */
    class C0740a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f2910f;

        C0740a(Runnable runnable) {
            this.f2910f = runnable;
        }

        public void run() {
            try {
                this.f2910f.run();
            } finally {
                C0739v.this.mo4138a();
            }
        }
    }

    C0739v(Executor executor) {
        this.f2907f = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4138a() {
        Runnable runnable = (Runnable) this.f2908g.poll();
        this.f2909h = runnable;
        if (runnable != null) {
            this.f2907f.execute(runnable);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f2908g.offer(new C0740a(runnable));
        if (this.f2909h == null) {
            mo4138a();
        }
    }
}
