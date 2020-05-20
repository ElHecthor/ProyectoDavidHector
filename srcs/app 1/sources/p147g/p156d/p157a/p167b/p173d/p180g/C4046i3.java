package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.i3 */
final class C4046i3 {

    /* renamed from: a */
    private static final Class<?> f11007a = m16531a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f11008b = (m16531a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m16531a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m16532a() {
        return f11007a != null && !f11008b;
    }

    /* renamed from: b */
    static Class<?> m16533b() {
        return f11007a;
    }
}
