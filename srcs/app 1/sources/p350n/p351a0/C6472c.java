package p350n.p351a0;

import p308k.p323z.p325d.C5942k;
import p350n.C6503v;

/* renamed from: n.a0.c */
public final class C6472c {
    /* renamed from: a */
    public static final int m24467a(C6503v vVar, int i) {
        C5942k.m22327b(vVar, "$this$segment");
        int a = m24468a(vVar.mo16922s(), i + 1, 0, vVar.mo16923t().length);
        return a >= 0 ? a : ~a;
    }

    /* renamed from: a */
    public static final int m24468a(int[] iArr, int i, int i2, int i3) {
        C5942k.m22327b(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }
}
