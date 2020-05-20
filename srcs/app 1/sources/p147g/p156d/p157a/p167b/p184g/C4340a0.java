package p147g.p156d.p157a.p167b.p184g;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: g.d.a.b.g.a0 */
final class C4340a0<TResult> {

    /* renamed from: a */
    private final Object f11512a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private Queue<C4371z<TResult>> f11513b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f11514c;

    C4340a0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f11512a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (p147g.p156d.p157a.p167b.p184g.C4371z) r2.f11513b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f11514c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo13033a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13000a(p147g.p156d.p157a.p167b.p184g.C4350h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11512a
            monitor-enter(r0)
            java.util.Queue<g.d.a.b.g.z<TResult>> r1 = r2.f11513b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f11514c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f11514c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f11512a
            monitor-enter(r1)
            java.util.Queue<g.d.a.b.g.z<TResult>> r0 = r2.f11513b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            g.d.a.b.g.z r0 = (p147g.p156d.p157a.p167b.p184g.C4371z) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f11514c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo13033a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p184g.C4340a0.mo13000a(g.d.a.b.g.h):void");
    }

    /* renamed from: a */
    public final void mo13001a(C4371z<TResult> zVar) {
        synchronized (this.f11512a) {
            if (this.f11513b == null) {
                this.f11513b = new ArrayDeque();
            }
            this.f11513b.add(zVar);
        }
    }
}
