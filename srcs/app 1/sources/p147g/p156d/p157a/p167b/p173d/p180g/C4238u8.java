package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.u8 */
public final class C4238u8 implements C4188r8 {

    /* renamed from: a */
    private static final C3927b2<Boolean> f11342a;

    /* renamed from: b */
    private static final C3927b2<Long> f11343b;

    static {
        C4030h2 h2Var = new C4030h2(C3943c2.m16007a("com.google.android.gms.measurement"));
        f11342a = h2Var.mo12509a("measurement.sdk.attribution.cache", true);
        f11343b = h2Var.mo12507a("measurement.sdk.attribution.cache.ttl", 604800000);
    }

    /* renamed from: a */
    public final boolean mo12757a() {
        return ((Boolean) f11342a.mo12108b()).booleanValue();
    }

    /* renamed from: b */
    public final long mo12758b() {
        return ((Long) f11343b.mo12108b()).longValue();
    }
}
