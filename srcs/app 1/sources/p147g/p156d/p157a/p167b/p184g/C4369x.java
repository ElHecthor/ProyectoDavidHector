package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Executor;

/* renamed from: g.d.a.b.g.x */
final class C4369x<TResult, TContinuationResult> implements C4341b, C4345d, C4347e<TContinuationResult>, C4371z<TResult> {

    /* renamed from: a */
    private final Executor f11557a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4349g<TResult, TContinuationResult> f11558b;

    /* renamed from: c */
    private final C4344c0<TContinuationResult> f11559c;

    public C4369x(Executor executor, C4349g<TResult, TContinuationResult> gVar, C4344c0<TContinuationResult> c0Var) {
        this.f11557a = executor;
        this.f11558b = gVar;
        this.f11559c = c0Var;
    }

    /* renamed from: a */
    public final void mo13002a() {
        this.f11559c.mo13022f();
    }

    /* renamed from: a */
    public final void mo13033a(C4350h<TResult> hVar) {
        this.f11557a.execute(new C4370y(this, hVar));
    }

    /* renamed from: a */
    public final void mo13023a(Exception exc) {
        this.f11559c.mo13013a(exc);
    }

    /* renamed from: a */
    public final void mo9847a(TContinuationResult tcontinuationresult) {
        this.f11559c.mo13014a(tcontinuationresult);
    }
}
