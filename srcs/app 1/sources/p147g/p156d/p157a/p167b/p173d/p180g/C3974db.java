package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.db */
public final class C3974db implements C3990eb {

    /* renamed from: a */
    private static final C3927b2<Boolean> f10913a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f10914b;

    /* renamed from: c */
    private static final C3927b2<Boolean> f10915c;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        h2Var.mo12507a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f10913a = h2Var.mo12509a("measurement.lifecycle.app_backgrounded_engagement", false);
        f10914b = h2Var.mo12509a("measurement.lifecycle.app_backgrounded_tracking", true);
        f10915c = h2Var.mo12509a("measurement.lifecycle.app_in_background_parameter", false);
        h2Var.mo12507a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    /* renamed from: a */
    public final boolean mo12362a() {
        return ((Boolean) f10913a.mo12108b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12363b() {
        return ((Boolean) f10914b.mo12108b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12364c() {
        return ((Boolean) f10915c.mo12108b()).booleanValue();
    }
}
