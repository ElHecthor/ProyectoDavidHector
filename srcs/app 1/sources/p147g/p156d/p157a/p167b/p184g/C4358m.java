package p147g.p156d.p157a.p167b.p184g;

/* renamed from: g.d.a.b.g.m */
final class C4358m implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4350h f11531f;

    /* renamed from: g */
    private final /* synthetic */ C4357l f11532g;

    C4358m(C4357l lVar, C4350h hVar) {
        this.f11532g = lVar;
        this.f11531f = hVar;
    }

    public final void run() {
        if (this.f11531f.mo13019c()) {
            this.f11532g.f11530c.mo13022f();
            return;
        }
        try {
            this.f11532g.f11530c.mo13014a(this.f11532g.f11529b.mo9663a(this.f11531f));
        } catch (C4348f e) {
            if (e.getCause() instanceof Exception) {
                this.f11532g.f11530c.mo13013a((Exception) e.getCause());
            } else {
                this.f11532g.f11530c.mo13013a((Exception) e);
            }
        } catch (Exception e2) {
            this.f11532g.f11530c.mo13013a(e2);
        }
    }
}
