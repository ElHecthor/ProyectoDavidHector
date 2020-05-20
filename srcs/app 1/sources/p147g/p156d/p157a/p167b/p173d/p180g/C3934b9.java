package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.b9 */
public final class C3934b9 implements C3952c9 {

    /* renamed from: a */
    private static final C3927b2<Boolean> f10835a;

    /* renamed from: b */
    private static final C3927b2<Boolean> f10836b;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f10835a = h2Var.mo12509a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        h2Var.mo12509a("measurement.collection.init_params_control_enabled", true);
        f10836b = h2Var.mo12509a("measurement.sdk.dynamite.use_dynamite3", true);
        h2Var.mo12507a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    /* renamed from: a */
    public final boolean mo12116a() {
        return ((Boolean) f10835a.mo12108b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo12117b() {
        return ((Boolean) f10836b.mo12108b()).booleanValue();
    }
}
