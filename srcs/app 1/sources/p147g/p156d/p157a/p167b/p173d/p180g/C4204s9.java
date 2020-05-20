package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.s9 */
public final class C4204s9 implements C4156p9 {

    /* renamed from: a */
    private static final C3927b2<Boolean> f11301a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f11302b;

    /* renamed from: c */
    private static final C3927b2<Boolean> f11303c;

    /* renamed from: d */
    private static final C3927b2<Boolean> f11304d;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f11301a = h2Var.mo12509a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f11302b = h2Var.mo12509a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f11303c = h2Var.mo12509a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f11304d = h2Var.mo12509a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo12713a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo12714b() {
        return ((Boolean) f11301a.mo12108b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12715c() {
        return ((Boolean) f11302b.mo12108b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo12716d() {
        return ((Boolean) f11303c.mo12108b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo12717e() {
        return ((Boolean) f11304d.mo12108b()).booleanValue();
    }
}
