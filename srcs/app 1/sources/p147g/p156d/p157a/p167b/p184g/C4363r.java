package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: g.d.a.b.g.r */
final class C4363r<TResult> implements C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11542a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f11543b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4343c<TResult> f11544c;

    public C4363r(Executor executor, C4343c<TResult> cVar) {
        this.f11542a = executor;
        this.f11544c = cVar;
    }

    /* renamed from: a */
    public final void mo13033a(C4350h<TResult> hVar) {
        synchronized (this.f11543b) {
            if (this.f11544c != null) {
                this.f11542a.execute(new C4364s(this, hVar));
            }
        }
    }
}
