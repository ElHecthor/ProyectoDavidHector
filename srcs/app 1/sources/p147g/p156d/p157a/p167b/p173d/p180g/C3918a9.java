package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.a9 */
public final class C3918a9 implements C4283x8 {

    /* renamed from: a */
    private static final C3927b2<Boolean> f10811a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f10812b;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f10811a = h2Var.mo12509a("measurement.service.configurable_service_limits", false);
        f10812b = h2Var.mo12509a("measurement.client.configurable_service_limits", false);
    }

    /* renamed from: a */
    public final boolean mo12095a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo12096b() {
        return ((Boolean) f10811a.mo12108b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12097c() {
        return ((Boolean) f10812b.mo12108b()).booleanValue();
    }
}
