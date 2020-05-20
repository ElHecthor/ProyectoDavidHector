package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.f5 */
public enum C4001f5 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C4092l3.class, C4092l3.class, C4092l3.f11077g),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: f */
    private final Class<?> f10947f;

    /* renamed from: g */
    private final Object f10948g;

    private C4001f5(Class<?> cls, Class<?> cls2, Object obj) {
        this.f10947f = cls2;
        this.f10948g = obj;
    }

    /* renamed from: a */
    public final Class<?> mo12454a() {
        return this.f10947f;
    }
}
