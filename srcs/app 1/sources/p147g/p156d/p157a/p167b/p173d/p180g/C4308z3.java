package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.z3 */
final class C4308z3 extends C4278x3 {

    /* renamed from: a */
    private int f11459a;

    /* renamed from: b */
    private int f11460b;

    /* renamed from: c */
    private int f11461c;

    /* renamed from: d */
    private int f11462d;

    /* renamed from: e */
    private int f11463e;

    private C4308z3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f11463e = Integer.MAX_VALUE;
        this.f11459a = i2 + i;
        this.f11461c = i;
        this.f11462d = i;
    }

    /* renamed from: b */
    private final void m17642b() {
        int i = this.f11459a + this.f11460b;
        this.f11459a = i;
        int i2 = i - this.f11462d;
        int i3 = this.f11463e;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f11460b = i4;
            this.f11459a = i - i4;
            return;
        }
        this.f11460b = 0;
    }

    /* renamed from: a */
    public final int mo12965a() {
        return this.f11461c - this.f11462d;
    }

    /* renamed from: b */
    public final int mo12966b(int i) {
        if (i >= 0) {
            int a = i + mo12965a();
            int i2 = this.f11463e;
            if (a <= i2) {
                this.f11463e = a;
                m17642b();
                return i2;
            }
            throw C3968d5.m16205a();
        }
        throw C3968d5.m16206b();
    }
}
