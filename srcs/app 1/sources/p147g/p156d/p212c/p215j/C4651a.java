package p147g.p156d.p212c.p215j;

import java.util.Arrays;

/* renamed from: g.d.c.j.a */
public final class C4651a implements Cloneable {

    /* renamed from: f */
    private int[] f12175f;

    /* renamed from: g */
    private int f12176g;

    public C4651a() {
        this.f12176g = 0;
        this.f12175f = new int[1];
    }

    C4651a(int[] iArr, int i) {
        this.f12175f = iArr;
        this.f12176g = i;
    }

    /* renamed from: b */
    private void m18740b(int i) {
        if (i > (this.f12175f.length << 5)) {
            int[] c = m18741c(i);
            int[] iArr = this.f12175f;
            System.arraycopy(iArr, 0, c, 0, iArr.length);
            this.f12175f = c;
        }
    }

    /* renamed from: c */
    private static int[] m18741c(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo13566a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m18740b(this.f12176g + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo13569a(z);
            i2--;
        }
    }

    /* renamed from: a */
    public void mo13567a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (mo13570a(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: a */
    public void mo13568a(C4651a aVar) {
        int i = aVar.f12176g;
        m18740b(this.f12176g + i);
        for (int i2 = 0; i2 < i; i2++) {
            mo13569a(aVar.mo13570a(i2));
        }
    }

    /* renamed from: a */
    public void mo13569a(boolean z) {
        m18740b(this.f12176g + 1);
        if (z) {
            int[] iArr = this.f12175f;
            int i = this.f12176g;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f12176g++;
    }

    /* renamed from: a */
    public boolean mo13570a(int i) {
        return ((1 << (i & 31)) & this.f12175f[i / 32]) != 0;
    }

    /* renamed from: b */
    public int mo13571b() {
        return this.f12176g;
    }

    /* renamed from: b */
    public void mo13572b(C4651a aVar) {
        if (this.f12176g == aVar.f12176g) {
            int i = 0;
            while (true) {
                int[] iArr = this.f12175f;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ aVar.f12175f[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    /* renamed from: c */
    public int mo13573c() {
        return (this.f12176g + 7) / 8;
    }

    public C4651a clone() {
        return new C4651a((int[]) this.f12175f.clone(), this.f12176g);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4651a)) {
            return false;
        }
        C4651a aVar = (C4651a) obj;
        return this.f12176g == aVar.f12176g && Arrays.equals(this.f12175f, aVar.f12175f);
    }

    public int hashCode() {
        return (this.f12176g * 31) + Arrays.hashCode(this.f12175f);
    }

    public String toString() {
        int i = this.f12176g;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f12176g; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo13570a(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
