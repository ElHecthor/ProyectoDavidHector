package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.b.g.n */
final class C4359n<TResult, TContinuationResult> implements C4341b, C4345d, C4347e<TContinuationResult>, C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11533a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4339a<TResult, C4350h<TContinuationResult>> f11534b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4344c0<TContinuationResult> f11535c;

    public C4359n(Executor executor, C4339a<TResult, C4350h<TContinuationResult>> aVar, C4344c0<TContinuationResult> c0Var) {
        this.f11533a = executor;
        this.f11534b = aVar;
        this.f11535c = c0Var;
    }

    /* renamed from: a */
    public final void mo13002a() {
        this.f11535c.mo13022f();
    }

    /* renamed from: a */
    public final void mo13033a(C4350h<TResult> hVar) {
        this.f11533a.execute(new C4360o(this, hVar));
    }

    /* renamed from: a */
    public final void mo13023a(Exception exc) {
        this.f11535c.mo13013a(exc);
    }

    /* renamed from: a */
    public final void mo9847a(TContinuationResult tcontinuationresult) {
        this.f11535c.mo13014a(tcontinuationresult);
    }
}
