package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: g.d.a.b.g.p */
final class C4361p<TResult> implements C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11538a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f11539b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4341b f11540c;

    public C4361p(Executor executor, C4341b bVar) {
        this.f11538a = executor;
        this.f11540c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f11538a.execute(new p147g.p156d.p157a.p167b.p184g.C4362q(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13033a(p147g.p156d.p157a.p167b.p184g.C4350h r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo13019c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f11539b
            monitor-enter(r2)
            g.d.a.b.g.b r0 = r1.f11540c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f11538a
            g.d.a.b.g.q r0 = new g.d.a.b.g.q
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p184g.C4361p.mo13033a(g.d.a.b.g.h):void");
    }
}
