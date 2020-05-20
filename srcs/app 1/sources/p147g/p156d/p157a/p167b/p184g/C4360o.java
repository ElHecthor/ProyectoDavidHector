package p147g.p156d.p157a.p167b.p184g;

/* renamed from: g.d.a.b.g.o */
final class C4360o implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4350h f11536f;

    /* renamed from: g */
    private final /* synthetic */ C4359n f11537g;

    C4360o(C4359n nVar, C4350h hVar) {
        this.f11537g = nVar;
        this.f11536f = hVar;
    }

    public final void run() {
        try {
            C4350h hVar = (C4350h) this.f11537g.f11534b.mo9663a(this.f11536f);
            if (hVar == null) {
                this.f11537g.mo13023a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.mo13009a(C4352j.f11525b, (C4347e<? super TResult>) this.f11537g);
            hVar.mo13008a(C4352j.f11525b, (C4345d) this.f11537g);
            hVar.mo13006a(C4352j.f11525b, (C4341b) this.f11537g);
        } catch (C4348f e) {
            if (e.getCause() instanceof Exception) {
                this.f11537g.f11535c.mo13013a((Exception) e.getCause());
            } else {
                this.f11537g.f11535c.mo13013a((Exception) e);
            }
        } catch (Exception e2) {
            this.f11537g.f11535c.mo13013a(e2);
        }
    }
}
