package p147g.p156d.p212c.p222n.p224c;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: g.d.c.n.c.b */
public final class C4708b {

    /* renamed from: a */
    private final byte[][] f12344a;

    /* renamed from: b */
    private final int f12345b;

    /* renamed from: c */
    private final int f12346c;

    public C4708b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f12344a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.f12345b = i;
        this.f12346c = i2;
    }

    /* renamed from: a */
    public byte mo13678a(int i, int i2) {
        return this.f12344a[i2][i];
    }

    /* renamed from: a */
    public void mo13679a(byte b) {
        for (byte[] fill : this.f12344a) {
            Arrays.fill(fill, b);
        }
    }

    /* renamed from: a */
    public void mo13680a(int i, int i2, int i3) {
        this.f12344a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void mo13681a(int i, int i2, boolean z) {
        this.f12344a[i2][i] = z ? (byte) 1 : 0;
    }

    /* renamed from: a */
    public byte[][] mo13682a() {
        return this.f12344a;
    }

    /* renamed from: b */
    public int mo13683b() {
        return this.f12346c;
    }

    /* renamed from: c */
    public int mo13684c() {
        return this.f12345b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f12345b * 2 * this.f12346c) + 2);
        for (int i = 0; i < this.f12346c; i++) {
            byte[] bArr = this.f12344a[i];
            for (int i2 = 0; i2 < this.f12345b; i2++) {
                byte b = bArr[i2];
                String str = b != 0 ? b != 1 ? "  " : " 1" : " 0";
                sb.append(str);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
