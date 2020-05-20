package p147g.p156d.p157a.p167b.p173d.p179f;

/* renamed from: g.d.a.b.d.f.p */
final class C3904p extends C3903o {

    /* renamed from: a */
    private final C3902n f10800a = new C3902n();

    C3904p() {
    }

    /* renamed from: a */
    public final void mo12046a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f10800a.mo12047a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
