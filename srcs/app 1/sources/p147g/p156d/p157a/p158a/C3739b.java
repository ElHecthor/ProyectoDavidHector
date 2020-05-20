package p147g.p156d.p157a.p158a;

/* renamed from: g.d.a.a.b */
public final class C3739b {

    /* renamed from: a */
    private final String f10606a;

    private C3739b(String str) {
        if (str != null) {
            this.f10606a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: a */
    public static C3739b m15293a(String str) {
        return new C3739b(str);
    }

    /* renamed from: a */
    public String mo11892a() {
        return this.f10606a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3739b)) {
            return false;
        }
        return this.f10606a.equals(((C3739b) obj).f10606a);
    }

    public int hashCode() {
        return this.f10606a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Encoding{name=\"");
        sb.append(this.f10606a);
        sb.append("\"}");
        return sb.toString();
    }
}
