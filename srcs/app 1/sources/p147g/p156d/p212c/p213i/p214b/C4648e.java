package p147g.p156d.p212c.p213i.p214b;

import p147g.p156d.p212c.p215j.C4651a;

/* renamed from: g.d.c.i.b.e */
final class C4648e extends C4650g {

    /* renamed from: c */
    private final short f12166c;

    /* renamed from: d */
    private final short f12167d;

    C4648e(C4650g gVar, int i, int i2) {
        super(gVar);
        this.f12166c = (short) i;
        this.f12167d = (short) i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13547a(C4651a aVar, byte[] bArr) {
        aVar.mo13566a(this.f12166c, this.f12167d);
    }

    public String toString() {
        short s = this.f12166c;
        short s2 = this.f12167d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        StringBuilder sb = new StringBuilder("<");
        sb.append(Integer.toBinaryString(s3 | (1 << this.f12167d)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
