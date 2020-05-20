package p147g.p156d.p212c.p213i.p214b;

import p147g.p156d.p212c.p215j.C4651a;

/* renamed from: g.d.c.i.b.b */
final class C4644b extends C4650g {

    /* renamed from: c */
    private final short f12158c;

    /* renamed from: d */
    private final short f12159d;

    C4644b(C4650g gVar, int i, int i2) {
        super(gVar);
        this.f12158c = (short) i;
        this.f12159d = (short) i2;
    }

    /* renamed from: a */
    public void mo13547a(C4651a aVar, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            short s = this.f12159d;
            if (i2 < s) {
                if (i2 == 0 || (i2 == 31 && s <= 62)) {
                    int i3 = 5;
                    aVar.mo13566a(31, 5);
                    short s2 = this.f12159d;
                    if (s2 > 62) {
                        i = s2 - 31;
                        i3 = 16;
                    } else if (i2 == 0) {
                        aVar.mo13566a(Math.min(s2, 31), 5);
                    } else {
                        i = s2 - 31;
                    }
                    aVar.mo13566a(i, i3);
                }
                aVar.mo13566a(bArr[this.f12158c + i2], 8);
                i2++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f12158c);
        sb.append("::");
        sb.append((this.f12158c + this.f12159d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
