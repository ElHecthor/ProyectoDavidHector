package p147g.p156d.p212c;

/* renamed from: g.d.c.b */
public final class C4634b {

    /* renamed from: a */
    private final int f12138a;

    /* renamed from: b */
    private final int f12139b;

    /* renamed from: a */
    public int mo13534a() {
        return this.f12139b;
    }

    /* renamed from: b */
    public int mo13535b() {
        return this.f12138a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4634b) {
            C4634b bVar = (C4634b) obj;
            if (this.f12138a == bVar.f12138a && this.f12139b == bVar.f12139b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f12138a * 32713) + this.f12139b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12138a);
        sb.append("x");
        sb.append(this.f12139b);
        return sb.toString();
    }
}
