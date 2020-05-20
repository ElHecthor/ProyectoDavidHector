package p147g.p156d.p212c.p220m.p221b;

import java.lang.reflect.Array;

/* renamed from: g.d.c.m.b.a */
public final class C4693a {

    /* renamed from: a */
    private final C4694b[] f12284a;

    /* renamed from: b */
    private int f12285b;

    /* renamed from: c */
    private final int f12286c;

    /* renamed from: d */
    private final int f12287d;

    C4693a(int i, int i2) {
        C4694b[] bVarArr = new C4694b[i];
        this.f12284a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f12284a[i3] = new C4694b(((i2 + 4) * 17) + 1);
        }
        this.f12287d = i2 * 17;
        this.f12286c = i;
        this.f12285b = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4694b mo13647a() {
        return this.f12284a[this.f12285b];
    }

    /* renamed from: a */
    public byte[][] mo13648a(int i, int i2) {
        int i3 = this.f12286c * i2;
        int[] iArr = new int[2];
        iArr[1] = this.f12287d * i;
        iArr[0] = i3;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        int i4 = this.f12286c * i2;
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[(i4 - i5) - 1] = this.f12284a[i5 / i2].mo13651a(i);
        }
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13649b() {
        this.f12285b++;
    }
}
