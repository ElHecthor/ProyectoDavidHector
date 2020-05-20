package p147g.p156d.p212c.p215j;

import java.util.Arrays;

/* renamed from: g.d.c.j.b */
public final class C4652b implements Cloneable {

    /* renamed from: f */
    private final int f12177f;

    /* renamed from: g */
    private final int f12178g;

    /* renamed from: h */
    private final int f12179h;

    /* renamed from: i */
    private final int[] f12180i;

    public C4652b(int i) {
        this(i, i);
    }

    public C4652b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f12177f = i;
        this.f12178g = i2;
        int i3 = (i + 31) / 32;
        this.f12179h = i3;
        this.f12180i = new int[(i3 * i2)];
    }

    private C4652b(int i, int i2, int i3, int[] iArr) {
        this.f12177f = i;
        this.f12178g = i2;
        this.f12179h = i3;
        this.f12180i = iArr;
    }

    /* renamed from: a */
    private String m18750a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f12178g * (this.f12177f + 1));
        for (int i = 0; i < this.f12178g; i++) {
            for (int i2 = 0; i2 < this.f12177f; i2++) {
                sb.append(mo13580a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo13578a(String str, String str2) {
        return m18750a(str, str2, "\n");
    }

    /* renamed from: a */
    public void mo13579a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f12178g || i5 > this.f12177f) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f12179h * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f12180i;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public boolean mo13580a(int i, int i2) {
        return ((this.f12180i[(i2 * this.f12179h) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public void mo13581b() {
        int length = this.f12180i.length;
        for (int i = 0; i < length; i++) {
            this.f12180i[i] = 0;
        }
    }

    /* renamed from: b */
    public void mo13582b(int i, int i2) {
        int i3 = (i2 * this.f12179h) + (i / 32);
        int[] iArr = this.f12180i;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: c */
    public int mo13583c() {
        return this.f12178g;
    }

    public C4652b clone() {
        return new C4652b(this.f12177f, this.f12178g, this.f12179h, (int[]) this.f12180i.clone());
    }

    /* renamed from: d */
    public int mo13585d() {
        return this.f12177f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4652b)) {
            return false;
        }
        C4652b bVar = (C4652b) obj;
        return this.f12177f == bVar.f12177f && this.f12178g == bVar.f12178g && this.f12179h == bVar.f12179h && Arrays.equals(this.f12180i, bVar.f12180i);
    }

    public int hashCode() {
        int i = this.f12177f;
        return (((((((i * 31) + i) * 31) + this.f12178g) * 31) + this.f12179h) * 31) + Arrays.hashCode(this.f12180i);
    }

    public String toString() {
        return mo13578a("X ", "  ");
    }
}
