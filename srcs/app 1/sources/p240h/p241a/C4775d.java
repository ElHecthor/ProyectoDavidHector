package p240h.p241a;

/* renamed from: h.a.d */
public final class C4775d {
    /* renamed from: a */
    public static <T> T m19190a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    public static <T> T m19191a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static <T> void m19192a(T t, Class<T> cls) {
        if (t == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }
}
