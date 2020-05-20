package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.CancellationException;

/* renamed from: g.d.a.b.g.y */
final class C4370y implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4350h f11560f;

    /* renamed from: g */
    private final /* synthetic */ C4369x f11561g;

    C4370y(C4369x xVar, C4350h hVar) {
        this.f11561g = xVar;
        this.f11560f = hVar;
    }

    public final void run() {
        try {
            C4350h a = this.f11561g.f11558b.mo9631a(this.f11560f.mo13016b());
            if (a == null) {
                this.f11561g.mo13023a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo13009a(C4352j.f11525b, (C4347e<? super TResult>) this.f11561g);
            a.mo13008a(C4352j.f11525b, (C4345d) this.f11561g);
            a.mo13006a(C4352j.f11525b, (C4341b) this.f11561g);
        } catch (C4348f e) {
            if (e.getCause() instanceof Exception) {
                this.f11561g.mo13023a((Exception) e.getCause());
            } else {
                this.f11561g.mo13023a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.f11561g.mo13002a();
        } catch (Exception e2) {
            this.f11561g.mo13023a(e2);
        }
    }
}
