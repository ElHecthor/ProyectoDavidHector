package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.i4 */
final class C4047i4 {

    /* renamed from: a */
    private static final C4032h4<?> f11009a = new C4062j4();

    /* renamed from: b */
    private static final C4032h4<?> f11010b = m16536c();

    /* renamed from: a */
    static C4032h4<?> m16534a() {
        return f11009a;
    }

    /* renamed from: b */
    static C4032h4<?> m16535b() {
        C4032h4<?> h4Var = f11010b;
        if (h4Var != null) {
            return h4Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static C4032h4<?> m16536c() {
        try {
            return (C4032h4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
