package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.n0 */
public final class C6165n0 extends C6069e1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k */
    private static final long f15277k;

    /* renamed from: l */
    public static final C6165n0 f15278l;

    static {
        Long l;
        C6165n0 n0Var = new C6165n0();
        f15278l = n0Var;
        C6046d1.m22720b(n0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = Long.valueOf(1000);
        }
        C5942k.m22324a((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f15277k = timeUnit.toNanos(l.longValue());
    }

    private C6165n0() {
    }

    /* renamed from: A */
    private final synchronized Thread m23169A() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: B */
    private final boolean m23170B() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: C */
    private final synchronized boolean m23171C() {
        if (m23170B()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: z */
    private final synchronized void m23172z() {
        if (m23170B()) {
            debugStatus = 3;
            mo15827y();
            notifyAll();
        }
    }

    /* renamed from: a */
    public C5959a1 mo15710a(long j, Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        return mo15824b(j, runnable);
    }

    public void run() {
        long j;
        C6202u2.f15311b.mo15968a(this);
        C6206v2 a = C6210w2.m23278a();
        if (a != null) {
            a.mo15981b();
        }
        if (!m23171C()) {
            _thread = null;
            m23172z();
            C6206v2 a2 = C6210w2.m23278a();
            if (a2 != null) {
                a2.mo15983d();
            }
            if (!mo15826x()) {
                mo15762v();
            }
            return;
        }
        long j2 = Long.MAX_VALUE;
        while (true) {
            try {
                Thread.interrupted();
                long s = mo15769s();
                if (s == Long.MAX_VALUE) {
                    int i = (j2 > Long.MAX_VALUE ? 1 : (j2 == Long.MAX_VALUE ? 0 : -1));
                    if (i == 0) {
                        C6206v2 a3 = C6210w2.m23278a();
                        long a4 = a3 != null ? a3.mo15977a() : System.nanoTime();
                        if (i == 0) {
                            j2 = f15277k + a4;
                        }
                        j = j2 - a4;
                        if (j <= 0) {
                            _thread = null;
                            m23172z();
                            C6206v2 a5 = C6210w2.m23278a();
                            if (a5 != null) {
                                a5.mo15983d();
                            }
                            if (!mo15826x()) {
                                mo15762v();
                            }
                            return;
                        }
                    } else {
                        j = f15277k;
                    }
                    s = C5736g.m21873b(s, j);
                }
                if (s > 0) {
                    if (!m23170B()) {
                        C6206v2 a6 = C6210w2.m23278a();
                        if (a6 != null) {
                            a6.mo15979a(this, s);
                        } else {
                            LockSupport.parkNanos(this, s);
                        }
                    } else {
                        return;
                    }
                }
            } finally {
                _thread = null;
                m23172z();
                C6206v2 a7 = C6210w2.m23278a();
                if (a7 != null) {
                    a7.mo15983d();
                }
                if (!mo15826x()) {
                    mo15762v();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Thread mo15762v() {
        Thread thread = _thread;
        return thread != null ? thread : m23169A();
    }
}
