package p147g.p156d.p212c.p215j.p216d;

/* renamed from: g.d.c.j.d.a */
public final class C4654a {

    /* renamed from: g */
    public static final C4654a f12213g = new C4654a(4201, 4096, 1);

    /* renamed from: h */
    public static final C4654a f12214h = new C4654a(1033, 1024, 1);

    /* renamed from: i */
    public static final C4654a f12215i = new C4654a(67, 64, 1);

    /* renamed from: j */
    public static final C4654a f12216j = new C4654a(19, 16, 1);

    /* renamed from: k */
    public static final C4654a f12217k = new C4654a(285, 256, 0);

    /* renamed from: l */
    public static final C4654a f12218l = new C4654a(301, 256, 1);

    /* renamed from: a */
    private final int[] f12219a;

    /* renamed from: b */
    private final int[] f12220b;

    /* renamed from: c */
    private final C4655b f12221c;

    /* renamed from: d */
    private final int f12222d;

    /* renamed from: e */
    private final int f12223e;

    /* renamed from: f */
    private final int f12224f;

    public C4654a(int i, int i2, int i3) {
        this.f12223e = i;
        this.f12222d = i2;
        this.f12224f = i3;
        this.f12219a = new int[i2];
        this.f12220b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f12219a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f12220b[this.f12219a[i6]] = i6;
        }
        this.f12221c = new C4655b(this, new int[]{0});
        new C4655b(this, new int[]{1});
    }

    /* renamed from: c */
    static int m18760c(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: a */
    public int mo13590a() {
        return this.f12224f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo13591a(int i) {
        return this.f12219a[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4655b mo13592a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f12221c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C4655b(this, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo13593b(int i) {
        if (i != 0) {
            return this.f12219a[(this.f12222d - this.f12220b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo13594b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f12219a;
        int[] iArr2 = this.f12220b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f12222d - 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C4655b mo13595b() {
        return this.f12221c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo13596c(int i) {
        if (i != 0) {
            return this.f12220b[i];
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f12223e));
        sb.append(',');
        sb.append(this.f12222d);
        sb.append(')');
        return sb.toString();
    }
}
