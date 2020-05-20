package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.h */
public class C4680h extends C4686n {
    /* renamed from: a */
    private static int m18877a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: a */
    private static int m18878a(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: a */
    private static void m18879a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.CODE_93) {
            return super.mo13539a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo13645a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int length2 = ((str.length() + 2 + 2) * 9) + 1;
            m18879a(C4679g.f12272a[47], iArr);
            boolean[] zArr = new boolean[length2];
            int i = 0;
            int a = m18878a(zArr, 0, iArr);
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i < length) {
                    m18879a(C4679g.f12272a[str2.indexOf(str.charAt(i))], iArr);
                    a += m18878a(zArr, a, iArr);
                    i++;
                } else {
                    int a2 = m18877a(str, 20);
                    m18879a(C4679g.f12272a[a2], iArr);
                    int a3 = a + m18878a(zArr, a, iArr);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2.charAt(a2));
                    m18879a(C4679g.f12272a[m18877a(sb.toString(), 15)], iArr);
                    int a4 = a3 + m18878a(zArr, a3, iArr);
                    m18879a(C4679g.f12272a[47], iArr);
                    zArr[a4 + m18878a(zArr, a4, iArr)] = true;
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
