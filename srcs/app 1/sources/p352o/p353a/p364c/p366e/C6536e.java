package p352o.p353a.p364c.p366e;

/* renamed from: o.a.c.e.e */
public final class C6536e {

    /* renamed from: a */
    private boolean f16185a;

    /* renamed from: b */
    private boolean f16186b;

    public C6536e() {
        this(false, false, 3, null);
    }

    public C6536e(boolean z, boolean z2) {
        this.f16185a = z;
        this.f16186b = z2;
    }

    public /* synthetic */ C6536e(boolean z, boolean z2, int i, C5938g gVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        this(z, z2);
    }

    /* renamed from: a */
    public final void mo16964a(boolean z) {
        this.f16185a = z;
    }

    /* renamed from: a */
    public final boolean mo16965a() {
        return this.f16186b;
    }

    /* renamed from: b */
    public final void mo16966b(boolean z) {
        this.f16186b = z;
    }

    /* renamed from: b */
    public final boolean mo16967b() {
        return this.f16185a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6536e) {
                C6536e eVar = (C6536e) obj;
                if (this.f16185a == eVar.f16185a) {
                    if (this.f16186b == eVar.f16186b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f16185a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f16186b;
        if (!z2) {
            i = z2;
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Options(isCreatedAtStart=");
        sb.append(this.f16185a);
        sb.append(", override=");
        sb.append(this.f16186b);
        sb.append(")");
        return sb.toString();
    }
}
