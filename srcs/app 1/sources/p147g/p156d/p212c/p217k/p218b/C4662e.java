package p147g.p156d.p212c.p217k.p218b;

import java.util.Arrays;

/* renamed from: g.d.c.k.b.e */
public class C4662e {

    /* renamed from: a */
    private final CharSequence f12229a;

    /* renamed from: b */
    private final int f12230b;

    /* renamed from: c */
    private final int f12231c;

    /* renamed from: d */
    private final byte[] f12232d;

    public C4662e(CharSequence charSequence, int i, int i2) {
        this.f12229a = charSequence;
        this.f12231c = i;
        this.f12230b = i2;
        byte[] bArr = new byte[(i * i2)];
        this.f12232d = bArr;
        Arrays.fill(bArr, -1);
    }

    /* renamed from: a */
    private void m18796a(int i) {
        m18798a(this.f12230b - 1, 0, i, 1);
        m18798a(this.f12230b - 1, 1, i, 2);
        m18798a(this.f12230b - 1, 2, i, 3);
        m18798a(0, this.f12231c - 2, i, 4);
        m18798a(0, this.f12231c - 1, i, 5);
        m18798a(1, this.f12231c - 1, i, 6);
        m18798a(2, this.f12231c - 1, i, 7);
        m18798a(3, this.f12231c - 1, i, 8);
    }

    /* renamed from: a */
    private void m18797a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m18798a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m18798a(i4, i6, i3, 2);
        int i7 = i - 1;
        m18798a(i7, i5, i3, 3);
        m18798a(i7, i6, i3, 4);
        m18798a(i7, i2, i3, 5);
        m18798a(i, i5, i3, 6);
        m18798a(i, i6, i3, 7);
        m18798a(i, i2, i3, 8);
    }

    /* renamed from: a */
    private void m18798a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f12230b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f12231c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f12229a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m18799a(i2, i, z);
    }

    /* renamed from: a */
    private void m18799a(int i, int i2, boolean z) {
        this.f12232d[(i2 * this.f12231c) + i] = z ? (byte) 1 : 0;
    }

    /* renamed from: b */
    private void m18800b(int i) {
        m18798a(this.f12230b - 3, 0, i, 1);
        m18798a(this.f12230b - 2, 0, i, 2);
        m18798a(this.f12230b - 1, 0, i, 3);
        m18798a(0, this.f12231c - 4, i, 4);
        m18798a(0, this.f12231c - 3, i, 5);
        m18798a(0, this.f12231c - 2, i, 6);
        m18798a(0, this.f12231c - 1, i, 7);
        m18798a(1, this.f12231c - 1, i, 8);
    }

    /* renamed from: b */
    private boolean m18801b(int i, int i2) {
        return this.f12232d[(i2 * this.f12231c) + i] >= 0;
    }

    /* renamed from: c */
    private void m18802c(int i) {
        m18798a(this.f12230b - 3, 0, i, 1);
        m18798a(this.f12230b - 2, 0, i, 2);
        m18798a(this.f12230b - 1, 0, i, 3);
        m18798a(0, this.f12231c - 2, i, 4);
        m18798a(0, this.f12231c - 1, i, 5);
        m18798a(1, this.f12231c - 1, i, 6);
        m18798a(2, this.f12231c - 1, i, 7);
        m18798a(3, this.f12231c - 1, i, 8);
    }

    /* renamed from: d */
    private void m18803d(int i) {
        m18798a(this.f12230b - 1, 0, i, 1);
        m18798a(this.f12230b - 1, this.f12231c - 1, i, 2);
        m18798a(0, this.f12231c - 3, i, 3);
        m18798a(0, this.f12231c - 2, i, 4);
        m18798a(0, this.f12231c - 1, i, 5);
        m18798a(1, this.f12231c - 3, i, 6);
        m18798a(1, this.f12231c - 2, i, 7);
        m18798a(1, this.f12231c - 1, i, 8);
    }

    /* renamed from: a */
    public final void mo13616a() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f12230b && i3 == 0) {
                int i6 = i4 + 1;
                m18796a(i4);
                i4 = i6;
            }
            if (i5 == this.f12230b - 2 && i3 == 0 && this.f12231c % 4 != 0) {
                int i7 = i4 + 1;
                m18800b(i4);
                i4 = i7;
            }
            if (i5 == this.f12230b - 2 && i3 == 0 && this.f12231c % 8 == 4) {
                int i8 = i4 + 1;
                m18802c(i4);
                i4 = i8;
            }
            if (i5 == this.f12230b + 4 && i3 == 2 && this.f12231c % 8 == 0) {
                int i9 = i4 + 1;
                m18803d(i4);
                i4 = i9;
            }
            do {
                if (i5 < this.f12230b && i3 >= 0 && !m18801b(i3, i5)) {
                    int i10 = i4 + 1;
                    m18797a(i5, i3, i4);
                    i4 = i10;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f12231c);
            int i11 = i5 + 1;
            int i12 = i3 + 3;
            do {
                if (i11 >= 0 && i12 < this.f12231c && !m18801b(i12, i11)) {
                    int i13 = i4 + 1;
                    m18797a(i11, i12, i4);
                    i4 = i13;
                }
                i11 += 2;
                i12 -= 2;
                if (i11 >= this.f12230b) {
                    break;
                }
            } while (i12 >= 0);
            i5 = i11 + 3;
            i3 = i12 + 1;
            i = this.f12230b;
            if (i5 >= i) {
                i2 = this.f12231c;
                if (i3 >= i2) {
                    break;
                }
            }
        }
        if (!m18801b(i2 - 1, i - 1)) {
            m18799a(this.f12231c - 1, this.f12230b - 1, true);
            m18799a(this.f12231c - 2, this.f12230b - 2, true);
        }
    }

    /* renamed from: a */
    public final boolean mo13617a(int i, int i2) {
        return this.f12232d[(i2 * this.f12231c) + i] == 1;
    }
}
