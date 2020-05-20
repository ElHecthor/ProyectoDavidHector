package p147g.p156d.p212c.p219l;

import p147g.p156d.p212c.C4636d;

/* renamed from: g.d.c.l.p */
public abstract class C4688p extends C4685m {

    /* renamed from: a */
    static final int[] f12278a = {1, 1, 1};

    /* renamed from: b */
    static final int[] f12279b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    static final int[] f12280c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    static final int[][] f12281d;

    /* renamed from: e */
    static final int[][] f12282e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f12281d = iArr;
        int[][] iArr2 = new int[20][];
        f12282e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f12281d[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f12282e[i] = iArr4;
        }
    }

    /* renamed from: a */
    static boolean m18894a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m18895b(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: b */
    static int m18895b(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C4636d.m18697a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C4636d.m18697a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }
}
