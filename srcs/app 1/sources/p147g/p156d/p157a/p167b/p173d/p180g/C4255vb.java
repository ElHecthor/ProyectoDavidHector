package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.vb */
public final class C4255vb implements C4206sb {

    /* renamed from: a */
    private static final C3927b2<Boolean> f11403a;

    /* renamed from: b */
    private static final C3927b2<Double> f11404b;

    /* renamed from: c */
    private static final C3927b2<Long> f11405c;

    /* renamed from: d */
    private static final C3927b2<Long> f11406d;

    /* renamed from: e */
    private static final C3927b2<String> f11407e;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f11403a = h2Var.mo12509a("measurement.test.boolean_flag", false);
        f11404b = h2Var.mo12506a("measurement.test.double_flag", -3.0d);
        f11405c = h2Var.mo12507a("measurement.test.int_flag", -2);
        f11406d = h2Var.mo12507a("measurement.test.long_flag", -1);
        f11407e = h2Var.mo12508a("measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final boolean mo12801a() {
        return ((Boolean) f11403a.mo12108b()).booleanValue();
    }

    /* renamed from: b */
    public final double mo12802b() {
        return ((Double) f11404b.mo12108b()).doubleValue();
    }

    /* renamed from: c */
    public final long mo12803c() {
        return ((Long) f11405c.mo12108b()).longValue();
    }

    /* renamed from: d */
    public final long mo12804d() {
        return ((Long) f11406d.mo12108b()).longValue();
    }

    /* renamed from: e */
    public final String mo12805e() {
        return (String) f11407e.mo12108b();
    }
}
