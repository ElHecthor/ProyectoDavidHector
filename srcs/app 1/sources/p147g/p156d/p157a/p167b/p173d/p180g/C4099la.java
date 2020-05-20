package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.la */
public final class C4099la implements C4115ma {

    /* renamed from: a */
    private static final C3927b2<Boolean> f11087a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f11088b;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f11087a = h2Var.mo12509a("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f11088b = h2Var.mo12509a("measurement.collection.redundant_engagement_removal_enabled", false);
        h2Var.mo12507a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    /* renamed from: a */
    public final boolean mo12638a() {
        return ((Boolean) f11087a.mo12108b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12639b() {
        return ((Boolean) f11088b.mo12108b()).booleanValue();
    }
}
