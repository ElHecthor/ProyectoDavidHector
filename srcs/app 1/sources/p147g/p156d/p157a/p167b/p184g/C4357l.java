package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.b.g.l */
final class C4357l<TResult, TContinuationResult> implements C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11528a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4339a<TResult, TContinuationResult> f11529b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4344c0<TContinuationResult> f11530c;

    public C4357l(Executor executor, C4339a<TResult, TContinuationResult> aVar, C4344c0<TContinuationResult> c0Var) {
        this.f11528a = executor;
        this.f11529b = aVar;
        this.f11530c = c0Var;
    }

    /* renamed from: a */
    public final void mo13033a(C4350h<TResult> hVar) {
        this.f11528a.execute(new C4358m(this, hVar));
    }
}
