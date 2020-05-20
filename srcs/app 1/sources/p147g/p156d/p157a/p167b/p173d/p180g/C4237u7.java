package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.u7 */
final class C4237u7 {

    /* renamed from: a */
    private static final C4251v7 f11341a = ((!(C4183r7.m17000a() && C4183r7.m17005b()) || C4046i3.m16532a()) ? new C4297y7() : new C3917a8());

    /* renamed from: a */
    static int m17268a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C4282x7(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m17269a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f11341a.mo12093a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m17270a(byte[] bArr) {
        return f11341a.mo12838a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static boolean m17271a(byte[] bArr, int i, int i2) {
        return f11341a.mo12838a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17272b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17273b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17274b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: b */
    static String m17275b(byte[] bArr, int i, int i2) {
        return f11341a.mo12094b(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m17277d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m17272b(b);
        }
        if (i3 == 1) {
            return m17273b(b, bArr[i]);
        }
        if (i3 == 2) {
            return m17274b((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
