package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: g.d.a.b.g.t */
final class C4365t<TResult> implements C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11547a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f11548b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4345d f11549c;

    public C4365t(Executor executor, C4345d dVar) {
        this.f11547a = executor;
        this.f11549c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f11547a.execute(new p147g.p156d.p157a.p167b.p184g.C4366u(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13033a(p147g.p156d.p157a.p167b.p184g.C4350h<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo13021e()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo13019c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f11548b
            monitor-enter(r0)
            g.d.a.b.g.d r1 = r2.f11549c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f11547a
            g.d.a.b.g.u r1 = new g.d.a.b.g.u
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p184g.C4365t.mo13033a(g.d.a.b.g.h):void");
    }
}
