package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.c1 */
final class C6040c1 implements C6174p1 {

    /* renamed from: f */
    private final boolean f15090f;

    public C6040c1(boolean z) {
        this.f15090f = z;
    }

    /* renamed from: a */
    public boolean mo15640a() {
        return this.f15090f;
    }

    /* renamed from: i */
    public C6091g2 mo15641i() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo15640a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
