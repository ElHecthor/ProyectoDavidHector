package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.a3 */
final class C3912a3 extends C4261w2 {

    /* renamed from: a */
    private final C4307z2 f10807a = new C4307z2();

    C3912a3() {
    }

    /* renamed from: a */
    public final void mo12077a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f10807a.mo12964a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
