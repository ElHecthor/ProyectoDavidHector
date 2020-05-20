package p071f.p097h.p105j;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: f.h.j.c */
public class C3291c {

    /* renamed from: a */
    private final Object f9431a = new Object();

    /* renamed from: b */
    private HandlerThread f9432b;

    /* renamed from: c */
    private Handler f9433c;

    /* renamed from: d */
    private int f9434d;

    /* renamed from: e */
    private Callback f9435e = new C3292a();

    /* renamed from: f */
    private final int f9436f;

    /* renamed from: g */
    private final int f9437g;

    /* renamed from: h */
    private final String f9438h;

    /* renamed from: f.h.j.c$a */
    class C3292a implements Callback {
        C3292a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C3291c.this.mo10649a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C3291c.this.mo10650a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: f.h.j.c$b */
    class C3293b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Callable f9440f;

        /* renamed from: g */
        final /* synthetic */ Handler f9441g;

        /* renamed from: h */
        final /* synthetic */ C3296d f9442h;

        /* renamed from: f.h.j.c$b$a */
        class C3294a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Object f9443f;

            C3294a(Object obj) {
                this.f9443f = obj;
            }

            public void run() {
                C3293b.this.f9442h.mo10637a(this.f9443f);
            }
        }

        C3293b(C3291c cVar, Callable callable, Handler handler, C3296d dVar) {
            this.f9440f = callable;
            this.f9441g = handler;
            this.f9442h = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f9440f.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f9441g.post(new C3294a(obj));
        }
    }

    /* renamed from: f.h.j.c$c */
    class C3295c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ AtomicReference f9445f;

        /* renamed from: g */
        final /* synthetic */ Callable f9446g;

        /* renamed from: h */
        final /* synthetic */ ReentrantLock f9447h;

        /* renamed from: i */
        final /* synthetic */ AtomicBoolean f9448i;

        /* renamed from: j */
        final /* synthetic */ Condition f9449j;

        C3295c(C3291c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f9445f = atomicReference;
            this.f9446g = callable;
            this.f9447h = reentrantLock;
            this.f9448i = atomicBoolean;
            this.f9449j = condition;
        }

        public void run() {
            try {
                this.f9445f.set(this.f9446g.call());
            } catch (Exception unused) {
            }
            this.f9447h.lock();
            try {
                this.f9448i.set(false);
                this.f9449j.signal();
            } finally {
                this.f9447h.unlock();
            }
        }
    }

    /* renamed from: f.h.j.c$d */
    public interface C3296d<T> {
        /* renamed from: a */
        void mo10637a(T t);
    }

    public C3291c(String str, int i, int i2) {
        this.f9438h = str;
        this.f9437g = i;
        this.f9436f = i2;
        this.f9434d = 0;
    }

    /* renamed from: b */
    private void m13474b(Runnable runnable) {
        synchronized (this.f9431a) {
            if (this.f9432b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f9438h, this.f9437g);
                this.f9432b = handlerThread;
                handlerThread.start();
                this.f9433c = new Handler(this.f9432b.getLooper(), this.f9435e);
                this.f9434d++;
            }
            this.f9433c.removeMessages(0);
            this.f9433c.sendMessage(this.f9433c.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo10648a(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            f.h.j.c$c r11 = new f.h.j.c$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.m13474b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p105j.C3291c.mo10648a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10649a() {
        synchronized (this.f9431a) {
            if (!this.f9433c.hasMessages(1)) {
                this.f9432b.quit();
                this.f9432b = null;
                this.f9433c = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10650a(Runnable runnable) {
        runnable.run();
        synchronized (this.f9431a) {
            this.f9433c.removeMessages(0);
            this.f9433c.sendMessageDelayed(this.f9433c.obtainMessage(0), (long) this.f9436f);
        }
    }

    /* renamed from: a */
    public <T> void mo10651a(Callable<T> callable, C3296d<T> dVar) {
        m13474b(new C3293b(this, callable, new Handler(), dVar));
    }
}
