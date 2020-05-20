package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import p147g.p156d.p157a.p158a.p159i.C3761h;
import p147g.p156d.p157a.p158a.p159i.C3767l;

/* renamed from: g.d.a.a.i.v.j.b */
final class C3794b extends C3807h {

    /* renamed from: a */
    private final long f10709a;

    /* renamed from: b */
    private final C3767l f10710b;

    /* renamed from: c */
    private final C3761h f10711c;

    C3794b(long j, C3767l lVar, C3761h hVar) {
        this.f10709a = j;
        if (lVar != null) {
            this.f10710b = lVar;
            if (hVar != null) {
                this.f10711c = hVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: a */
    public C3761h mo11976a() {
        return this.f10711c;
    }

    /* renamed from: b */
    public long mo11977b() {
        return this.f10709a;
    }

    /* renamed from: c */
    public C3767l mo11978c() {
        return this.f10710b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3807h)) {
            return false;
        }
        C3807h hVar = (C3807h) obj;
        if (this.f10709a != hVar.mo11977b() || !this.f10710b.equals(hVar.mo11978c()) || !this.f10711c.equals(hVar.mo11976a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f10709a;
        return this.f10711c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f10710b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersistedEvent{id=");
        sb.append(this.f10709a);
        sb.append(", transportContext=");
        sb.append(this.f10710b);
        sb.append(", event=");
        sb.append(this.f10711c);
        sb.append("}");
        return sb.toString();
    }
}
