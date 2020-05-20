package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.ib */
public final class C4054ib implements C4007fb {

    /* renamed from: a */
    private static final C3927b2<Boolean> f11033a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f11034b;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f11033a = h2Var.mo12509a("measurement.sdk.screen.manual_screen_view_logging", true);
        f11034b = h2Var.mo12509a("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    /* renamed from: a */
    public final boolean mo12463a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo12464b() {
        return ((Boolean) f11033a.mo12108b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12465c() {
        return ((Boolean) f11034b.mo12108b()).booleanValue();
    }
}
