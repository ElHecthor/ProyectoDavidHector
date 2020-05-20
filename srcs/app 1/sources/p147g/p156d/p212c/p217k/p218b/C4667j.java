package p147g.p156d.p212c.p217k.p218b;

import java.util.Arrays;

/* renamed from: g.d.c.k.b.j */
public final class C4667j {
    /* renamed from: a */
    private static char m18834a(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    /* renamed from: a */
    public static int m18835a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m18841b(charAt) || i >= length) {
                        break loop0;
                        break loop0;
                    }
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    static int m18836a(CharSequence charSequence, int i, int i2) {
        char c;
        CharSequence charSequence2 = charSequence;
        int i3 = i;
        if (i3 >= charSequence.length()) {
            return i2;
        }
        float[] fArr = new float[6];
        if (i2 == 0) {
            // fill-array-data instruction
            fArr[0] = 0;
            fArr[1] = 1065353216;
            fArr[2] = 1065353216;
            fArr[3] = 1065353216;
            fArr[4] = 1065353216;
            fArr[5] = 1067450368;
        } else {
            // fill-array-data instruction
            fArr[0] = 1065353216;
            fArr[1] = 1073741824;
            fArr[2] = 1073741824;
            fArr[3] = 1073741824;
            fArr[4] = 1073741824;
            fArr[5] = 1074790400;
            fArr[i2] = 0.0f;
        }
        int i4 = 0;
        while (true) {
            int i5 = i3 + i4;
            if (i5 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = m18838a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int a2 = m18837a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (a2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (a2 != 1 || bArr[2] <= 0) {
                    return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i5);
            i4++;
            if (m18841b(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m18842c(charAt)) {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (float) Math.ceil((double) fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m18843d(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m18842c(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (m18845f(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m18842c(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m18846g(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m18842c(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (m18844e(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (m18842c(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m18847h(charAt)) {
                c = 5;
                fArr[5] = fArr[5] + 4.0f;
            } else {
                c = 5;
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i4 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m18838a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int a3 = m18837a(bArr2);
                if (iArr2[0] < iArr2[c] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] >= iArr2[0] && bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] != 0) {
                    if (a3 == 1 && bArr2[4] > 0) {
                        return 4;
                    }
                    if (a3 == 1 && bArr2[2] > 0) {
                        return 2;
                    }
                    if (a3 == 1 && bArr2[3] > 0) {
                        return 3;
                    }
                    if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                        if (iArr2[1] < iArr2[3]) {
                            return 1;
                        }
                        if (iArr2[1] == iArr2[3]) {
                            int i6 = i3 + i4 + 1;
                            while (i6 < charSequence.length()) {
                                char charAt2 = charSequence2.charAt(i6);
                                if (!m18848i(charAt2)) {
                                    if (!m18846g(charAt2)) {
                                        break;
                                    }
                                    i6++;
                                } else {
                                    return 3;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
        }
        return 5;
    }

    /* renamed from: a */
    private static int m18837a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    /* renamed from: a */
    private static int m18838a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, 0);
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8 A[LOOP:1: B:25:0x00b2->B:27:0x00b8, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m18839a(java.lang.String r7, p147g.p156d.p212c.p217k.p218b.C4669l r8, p147g.p156d.p212c.C4634b r9, p147g.p156d.p212c.C4634b r10) {
        /*
            r0 = 6
            g.d.c.k.b.g[] r0 = new p147g.p156d.p212c.p217k.p218b.C4664g[r0]
            g.d.c.k.b.a r1 = new g.d.c.k.b.a
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            g.d.c.k.b.c r1 = new g.d.c.k.b.c
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            g.d.c.k.b.m r1 = new g.d.c.k.b.m
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            g.d.c.k.b.n r1 = new g.d.c.k.b.n
            r1.<init>()
            r5 = 3
            r0[r5] = r1
            g.d.c.k.b.f r1 = new g.d.c.k.b.f
            r1.<init>()
            r5 = 4
            r0[r5] = r1
            g.d.c.k.b.b r1 = new g.d.c.k.b.b
            r1.<init>()
            r6 = 5
            r0[r6] = r1
            g.d.c.k.b.h r1 = new g.d.c.k.b.h
            r1.<init>(r7)
            r1.mo13623a(r8)
            r1.mo13622a(r9, r10)
            java.lang.String r8 = "[)>\u001e05\u001d"
            boolean r8 = r7.startsWith(r8)
            java.lang.String r9 = "\u001e\u0004"
            if (r8 == 0) goto L_0x005d
            boolean r8 = r7.endsWith(r9)
            if (r8 == 0) goto L_0x005d
            r7 = 236(0xec, float:3.31E-43)
        L_0x0050:
            r1.mo13620a(r7)
            r1.mo13621a(r4)
            int r7 = r1.f12238f
            int r7 = r7 + 7
            r1.f12238f = r7
            goto L_0x006e
        L_0x005d:
            java.lang.String r8 = "[)>\u001e06\u001d"
            boolean r8 = r7.startsWith(r8)
            if (r8 == 0) goto L_0x006e
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L_0x006e
            r7 = 237(0xed, float:3.32E-43)
            goto L_0x0050
        L_0x006e:
            boolean r7 = r1.mo13633h()
            if (r7 == 0) goto L_0x0087
            r7 = r0[r2]
            r7.mo13609a(r1)
            int r7 = r1.mo13630e()
            if (r7 < 0) goto L_0x006e
            int r2 = r1.mo13630e()
            r1.mo13634i()
            goto L_0x006e
        L_0x0087:
            int r7 = r1.mo13619a()
            r1.mo13636k()
            g.d.c.k.b.k r8 = r1.mo13632g()
            int r8 = r8.mo13637a()
            if (r7 >= r8) goto L_0x00a3
            if (r2 == 0) goto L_0x00a3
            if (r2 == r6) goto L_0x00a3
            if (r2 == r5) goto L_0x00a3
            r7 = 254(0xfe, float:3.56E-43)
            r1.mo13620a(r7)
        L_0x00a3:
            java.lang.StringBuilder r7 = r1.mo13625b()
            int r9 = r7.length()
            r10 = 129(0x81, float:1.81E-43)
            if (r9 >= r8) goto L_0x00b2
            r7.append(r10)
        L_0x00b2:
            int r9 = r7.length()
            if (r9 >= r8) goto L_0x00c5
            int r9 = r7.length()
            int r9 = r9 + r3
            char r9 = m18834a(r10, r9)
            r7.append(r9)
            goto L_0x00b2
        L_0x00c5:
            java.lang.StringBuilder r7 = r1.mo13625b()
            java.lang.String r7 = r7.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p217k.p218b.C4667j.m18839a(java.lang.String, g.d.c.k.b.l, g.d.c.b, g.d.c.b):java.lang.String");
    }

    /* renamed from: a */
    static void m18840a(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append("0000".substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("Illegal character: ");
        sb3.append(c);
        sb3.append(" (0x");
        sb3.append(sb2);
        sb3.append(')');
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: b */
    static boolean m18841b(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: c */
    static boolean m18842c(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: d */
    private static boolean m18843d(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: e */
    private static boolean m18844e(char c) {
        return c >= ' ' && c <= '^';
    }

    /* renamed from: f */
    private static boolean m18845f(char c) {
        return c == ' ' || (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z');
    }

    /* renamed from: g */
    private static boolean m18846g(char c) {
        return m18848i(c) || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: h */
    private static boolean m18847h(char c) {
        return false;
    }

    /* renamed from: i */
    private static boolean m18848i(char c) {
        return c == 13 || c == '*' || c == '>';
    }
}
