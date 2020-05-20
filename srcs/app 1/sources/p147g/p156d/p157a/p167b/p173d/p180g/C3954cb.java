package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.cb */
public final class C3954cb implements C4315za {

    /* renamed from: a */
    private static final C3927b2<Boolean> f10874a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f10875b;

    /* renamed from: c */
    private static final C3927b2<Boolean> f10876c;

    /* renamed from: d */
    private static final C3927b2<Boolean> f10877d;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f10874a = h2Var.mo12509a("measurement.sdk.collection.enable_extend_user_property_size", true);
        f10875b = h2Var.mo12509a("measurement.sdk.collection.last_deep_link_referrer2", true);
        f10876c = h2Var.mo12509a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f10877d = h2Var.mo12509a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        h2Var.mo12507a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: a */
    public final boolean mo12287a() {
        return ((Boolean) f10874a.mo12108b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12288b() {
        return ((Boolean) f10875b.mo12108b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo12289c() {
        return ((Boolean) f10876c.mo12108b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo12290d() {
        return ((Boolean) f10877d.mo12108b()).booleanValue();
    }
}
