package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.c8 */
public enum C3951c8 {
    DOUBLE(C4004f8.DOUBLE, 1),
    FLOAT(C4004f8.FLOAT, 5),
    INT64(C4004f8.LONG, 0),
    UINT64(C4004f8.LONG, 0),
    INT32(C4004f8.INT, 0),
    FIXED64(C4004f8.LONG, 1),
    FIXED32(C4004f8.INT, 5),
    BOOL(C4004f8.BOOLEAN, 0),
    GROUP(C4004f8.MESSAGE, 3),
    MESSAGE(C4004f8.MESSAGE, 2),
    BYTES(C4004f8.BYTE_STRING, 2),
    UINT32(C4004f8.INT, 0),
    ENUM(C4004f8.ENUM, 0),
    SFIXED32(C4004f8.INT, 5),
    SFIXED64(C4004f8.LONG, 1),
    SINT32(C4004f8.INT, 0),
    SINT64(C4004f8.LONG, 0);
    

    /* renamed from: f */
    private final C4004f8 f10870f;

    /* renamed from: g */
    private final int f10871g;

    private C3951c8(C4004f8 f8Var, int i) {
        this.f10870f = f8Var;
        this.f10871g = i;
    }

    /* renamed from: a */
    public final C4004f8 mo12285a() {
        return this.f10870f;
    }

    /* renamed from: b */
    public final int mo12286b() {
        return this.f10871g;
    }
}
