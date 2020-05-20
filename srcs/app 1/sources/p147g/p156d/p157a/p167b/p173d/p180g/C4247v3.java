package p147g.p156d.p157a.p167b.p173d.p180g;

import java.nio.charset.Charset;

/* renamed from: g.d.a.b.d.g.v3 */
class C4247v3 extends C4262w3 {

    /* renamed from: i */
    protected final byte[] f11357i;

    C4247v3(byte[] bArr) {
        if (bArr != null) {
            this.f11357i = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public byte mo12607a(int i) {
        return this.f11357i[i];
    }

    /* renamed from: a */
    public int mo12608a() {
        return this.f11357i.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo12609a(int i, int i2, int i3) {
        return C4248v4.m17301a(i, this.f11357i, mo12777e(), i3);
    }

    /* renamed from: a */
    public final C4092l3 mo12610a(int i, int i2) {
        int b = C4092l3.m16741b(0, i2, mo12608a());
        return b == 0 ? C4092l3.f11077g : new C4198s3(this.f11357i, mo12777e(), b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo12611a(Charset charset) {
        return new String(this.f11357i, mo12777e(), mo12608a(), charset);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12612a(C4108m3 m3Var) {
        m3Var.mo12281a(this.f11357i, mo12777e(), mo12608a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo12837a(C4092l3 l3Var, int i, int i2) {
        if (i2 > l3Var.mo12608a()) {
            int a = mo12608a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > l3Var.mo12608a()) {
            int a2 = l3Var.mo12608a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(l3Var instanceof C4247v3)) {
            return l3Var.mo12610a(0, i2).equals(mo12610a(0, i2));
        } else {
            C4247v3 v3Var = (C4247v3) l3Var;
            byte[] bArr = this.f11357i;
            byte[] bArr2 = v3Var.f11357i;
            int e = mo12777e() + i2;
            int e2 = mo12777e();
            int e3 = v3Var.mo12777e();
            while (e2 < e) {
                if (bArr[e2] != bArr2[e3]) {
                    return false;
                }
                e2++;
                e3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public byte mo12613b(int i) {
        return this.f11357i[i];
    }

    /* renamed from: c */
    public final boolean mo12615c() {
        int e = mo12777e();
        return C4237u7.m17271a(this.f11357i, e, mo12608a() + e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo12777e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4092l3) || mo12608a() != ((C4092l3) obj).mo12608a()) {
            return false;
        }
        if (mo12608a() == 0) {
            return true;
        }
        if (!(obj instanceof C4247v3)) {
            return obj.equals(this);
        }
        C4247v3 v3Var = (C4247v3) obj;
        int d = mo12616d();
        int d2 = v3Var.mo12616d();
        if (d == 0 || d2 == 0 || d == d2) {
            return mo12837a((C4092l3) v3Var, 0, mo12608a());
        }
        return false;
    }
}
