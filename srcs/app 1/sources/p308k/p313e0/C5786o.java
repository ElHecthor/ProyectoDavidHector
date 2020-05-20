package p308k.p313e0;

import androidx.recyclerview.widget.RecyclerView;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.e0.o */
class C5786o extends C5785n {
    /* renamed from: a */
    public static Integer m21964a(String str) {
        C5942k.m22327b(str, "$this$toIntOrNull");
        return m21965a(str, 10);
    }

    /* renamed from: a */
    public static final Integer m21965a(String str, int i) {
        boolean z;
        C5942k.m22327b(str, "$this$toIntOrNull");
        C5767b.m21914a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = -2147483647;
        int i4 = 1;
        if (charAt >= '0') {
            z = false;
            i4 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i3 = RecyclerView.UNDEFINED_DURATION;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i5 = -59652323;
        while (i4 < length) {
            int a = C5767b.m21913a(str.charAt(i4), i);
            if (a < 0) {
                return null;
            }
            if (i2 < i5) {
                if (i5 == -59652323) {
                    i5 = i3 / i;
                    if (i2 < i5) {
                    }
                }
                return null;
            }
            int i6 = i2 * i;
            if (i6 < i3 + a) {
                return null;
            }
            i2 = i6 - a;
            i4++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }

    /* renamed from: b */
    public static Long m21966b(String str) {
        C5942k.m22327b(str, "$this$toLongOrNull");
        return m21967b(str, 10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Long m21967b(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "$this$toLongOrNull"
            p308k.p323z.p325d.C5942k.m22327b(r0, r2)
            p308k.p313e0.C5767b.m21914a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r5 >= r6) goto L_0x0035
            if (r2 != r9) goto L_0x0026
            return r3
        L_0x0026:
            r6 = 45
            if (r5 != r6) goto L_0x002e
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x0036
        L_0x002e:
            r6 = 43
            if (r5 != r6) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            return r3
        L_0x0035:
            r9 = 0
        L_0x0036:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L_0x003e:
            if (r4 >= r2) goto L_0x006f
            char r14 = r0.charAt(r4)
            int r14 = p308k.p313e0.C5767b.m21913a(r14, r1)
            if (r14 >= 0) goto L_0x004b
            return r3
        L_0x004b:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005b
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x005a
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005b
        L_0x005a:
            return r3
        L_0x005b:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r5 = (long) r14
            long r16 = r7 + r5
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0066
            return r3
        L_0x0066:
            long r10 = r10 - r5
            int r4 = r4 + 1
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x003e
        L_0x006f:
            if (r9 == 0) goto L_0x0076
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x007b
        L_0x0076:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p313e0.C5786o.m21967b(java.lang.String, int):java.lang.Long");
    }
}
