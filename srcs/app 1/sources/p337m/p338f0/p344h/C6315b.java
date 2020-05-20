package p337m.p338f0.p344h;

/* renamed from: m.f0.h.b */
public enum C6315b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: n */
    public static final C6316a f15620n = null;

    /* renamed from: f */
    private final int f15621f;

    /* renamed from: m.f0.h.b$a */
    public static final class C6316a {
        private C6316a() {
        }

        public /* synthetic */ C6316a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6315b mo16274a(int i) {
            C6315b[] values;
            for (C6315b bVar : C6315b.values()) {
                if (bVar.mo16273f() == i) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f15620n = new C6316a(null);
    }

    private C6315b(int i) {
        this.f15621f = i;
    }

    /* renamed from: f */
    public final int mo16273f() {
        return this.f15621f;
    }
}
