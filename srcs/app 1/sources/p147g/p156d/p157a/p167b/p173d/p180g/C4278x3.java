package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.x3 */
public abstract class C4278x3 {
    private C4278x3() {
    }

    /* renamed from: a */
    public static int m17530a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public static long m17531a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    static C4278x3 m17532a(byte[] bArr, int i, int i2, boolean z) {
        C4308z3 z3Var = new C4308z3(bArr, 0, i2, false);
        try {
            z3Var.mo12966b(i2);
            return z3Var;
        } catch (C3968d5 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
