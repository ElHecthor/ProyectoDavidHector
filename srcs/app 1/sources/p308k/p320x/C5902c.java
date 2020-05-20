package p308k.p320x;

/* renamed from: k.x.c */
public final class C5902c {
    /* renamed from: a */
    private static final int m22289a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: a */
    private static final int m22290a(int i, int i2, int i3) {
        return m22289a(m22289a(i, i3) - m22289a(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m22291b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m22290a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m22290a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
