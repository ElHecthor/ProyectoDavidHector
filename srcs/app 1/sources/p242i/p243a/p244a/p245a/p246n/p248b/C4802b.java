package p242i.p243a.p244a.p245a.p246n.p248b;

/* renamed from: i.a.a.a.n.b.b */
class C4802b {

    /* renamed from: a */
    public final String f12550a;

    /* renamed from: b */
    public final boolean f12551b;

    C4802b(String str, boolean z) {
        this.f12550a = str;
        this.f12551b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4802b.class != obj.getClass()) {
            return false;
        }
        C4802b bVar = (C4802b) obj;
        if (this.f12551b != bVar.f12551b) {
            return false;
        }
        String str = this.f12550a;
        String str2 = bVar.f12550a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f12550a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f12551b ? 1 : 0);
    }
}
