package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: g.d.a.b.g.v */
final class C4367v<TResult> implements C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11552a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f11553b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4347e<? super TResult> f11554c;

    public C4367v(Executor executor, C4347e<? super TResult> eVar) {
        this.f11552a = executor;
        this.f11554c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f11552a.execute(new p147g.p156d.p157a.p167b.p184g.C4368w(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13033a(p147g.p156d.p157a.p167b.p184g.C4350h<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo13021e()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f11553b
            monitor-enter(r0)
            g.d.a.b.g.e<? super TResult> r1 = r2.f11554c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f11552a
            g.d.a.b.g.w r1 = new g.d.a.b.g.w
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p184g.C4367v.mo13033a(g.d.a.b.g.h):void");
    }
}
