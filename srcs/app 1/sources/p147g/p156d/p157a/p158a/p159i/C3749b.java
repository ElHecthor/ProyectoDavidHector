package p147g.p156d.p157a.p158a.p159i;

import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.C3740c;
import p147g.p156d.p157a.p158a.C3742e;
import p147g.p156d.p157a.p158a.p159i.C3765k.C3766a;

/* renamed from: g.d.a.a.i.b */
final class C3749b extends C3765k {

    /* renamed from: a */
    private final C3767l f10623a;

    /* renamed from: b */
    private final String f10624b;

    /* renamed from: c */
    private final C3740c<?> f10625c;

    /* renamed from: d */
    private final C3742e<?, byte[]> f10626d;

    /* renamed from: e */
    private final C3739b f10627e;

    /* renamed from: g.d.a.a.i.b$b */
    static final class C3751b extends C3766a {

        /* renamed from: a */
        private C3767l f10628a;

        /* renamed from: b */
        private String f10629b;

        /* renamed from: c */
        private C3740c<?> f10630c;

        /* renamed from: d */
        private C3742e<?, byte[]> f10631d;

        /* renamed from: e */
        private C3739b f10632e;

        C3751b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3766a mo11922a(C3739b bVar) {
            if (bVar != null) {
                this.f10632e = bVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3766a mo11923a(C3740c<?> cVar) {
            if (cVar != null) {
                this.f10630c = cVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3766a mo11924a(C3742e<?, byte[]> eVar) {
            if (eVar != null) {
                this.f10631d = eVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* renamed from: a */
        public C3766a mo11925a(C3767l lVar) {
            if (lVar != null) {
                this.f10628a = lVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: a */
        public C3766a mo11926a(String str) {
            if (str != null) {
                this.f10629b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: a */
        public C3765k mo11927a() {
            String str = "";
            if (this.f10628a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportContext");
                str = sb.toString();
            }
            if (this.f10629b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" transportName");
                str = sb2.toString();
            }
            if (this.f10630c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" event");
                str = sb3.toString();
            }
            if (this.f10631d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" transformer");
                str = sb4.toString();
            }
            if (this.f10632e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" encoding");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                C3749b bVar = new C3749b(this.f10628a, this.f10629b, this.f10630c, this.f10631d, this.f10632e);
                return bVar;
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private C3749b(C3767l lVar, String str, C3740c<?> cVar, C3742e<?, byte[]> eVar, C3739b bVar) {
        this.f10623a = lVar;
        this.f10624b = str;
        this.f10625c = cVar;
        this.f10626d = eVar;
        this.f10627e = bVar;
    }

    /* renamed from: a */
    public C3739b mo11914a() {
        return this.f10627e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3740c<?> mo11915b() {
        return this.f10625c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C3742e<?, byte[]> mo11916d() {
        return this.f10626d;
    }

    /* renamed from: e */
    public C3767l mo11917e() {
        return this.f10623a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3765k)) {
            return false;
        }
        C3765k kVar = (C3765k) obj;
        if (!this.f10623a.equals(kVar.mo11917e()) || !this.f10624b.equals(kVar.mo11919f()) || !this.f10625c.equals(kVar.mo11915b()) || !this.f10626d.equals(kVar.mo11916d()) || !this.f10627e.equals(kVar.mo11914a())) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public String mo11919f() {
        return this.f10624b;
    }

    public int hashCode() {
        return ((((((((this.f10623a.hashCode() ^ 1000003) * 1000003) ^ this.f10624b.hashCode()) * 1000003) ^ this.f10625c.hashCode()) * 1000003) ^ this.f10626d.hashCode()) * 1000003) ^ this.f10627e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendRequest{transportContext=");
        sb.append(this.f10623a);
        sb.append(", transportName=");
        sb.append(this.f10624b);
        sb.append(", event=");
        sb.append(this.f10625c);
        sb.append(", transformer=");
        sb.append(this.f10626d);
        sb.append(", encoding=");
        sb.append(this.f10627e);
        sb.append("}");
        return sb.toString();
    }
}
