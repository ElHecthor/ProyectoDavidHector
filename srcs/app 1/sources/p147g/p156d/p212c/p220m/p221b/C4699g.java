package p147g.p156d.p212c.p220m.p221b;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p147g.p156d.p212c.C4641h;
import p147g.p156d.p212c.p215j.C4653c;

/* renamed from: g.d.c.m.b.g */
final class C4699g {

    /* renamed from: a */
    private static final byte[] f12309a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f12310b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    private static final byte[] f12311c = new byte[128];

    /* renamed from: d */
    private static final byte[] f12312d = new byte[128];

    /* renamed from: e */
    private static final Charset f12313e = StandardCharsets.ISO_8859_1;

    /* renamed from: g.d.c.m.b.g$a */
    static /* synthetic */ class C4700a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12314a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                g.d.c.m.b.c[] r0 = p147g.p156d.p212c.p220m.p221b.C4695c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12314a = r0
                g.d.c.m.b.c r1 = p147g.p156d.p212c.p220m.p221b.C4695c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12314a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.d.c.m.b.c r1 = p147g.p156d.p212c.p220m.p221b.C4695c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12314a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.d.c.m.b.c r1 = p147g.p156d.p212c.p220m.p221b.C4695c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p220m.p221b.C4699g.C4700a.<clinit>():void");
        }
    }

    static {
        Arrays.fill(f12311c, -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = f12309a;
            if (i2 >= bArr.length) {
                break;
            }
            byte b = bArr[i2];
            if (b > 0) {
                f12311c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f12312d, -1);
        while (true) {
            byte[] bArr2 = f12310b;
            if (i < bArr2.length) {
                byte b2 = bArr2[i];
                if (b2 > 0) {
                    f12312d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m18927a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0:
            while (true) {
                char charAt = charSequence.charAt(i);
                while (true) {
                    if (!m18937c(charAt) || i >= length) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r10 == ' ') goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[EDGE_INSN: B:66:0x00cf->B:51:0x00cf ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0011 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m18928a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x009a
            if (r7 == r6) goto L_0x0075
            if (r7 == r4) goto L_0x0037
            boolean r9 = m18939e(r10)
            if (r9 == 0) goto L_0x0032
            byte[] r9 = f12312d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0032:
            r3.append(r15)
        L_0x0035:
            r7 = 0
            goto L_0x0011
        L_0x0037:
            boolean r11 = m18938d(r10)
            if (r11 == 0) goto L_0x0047
            byte[] r9 = f12311c
            byte r9 = r9[r10]
        L_0x0041:
            char r9 = (char) r9
        L_0x0042:
            r3.append(r9)
            goto L_0x00cb
        L_0x0047:
            boolean r11 = m18936b(r10)
            if (r11 == 0) goto L_0x0051
            r3.append(r13)
            goto L_0x0035
        L_0x0051:
            boolean r11 = m18934a(r10)
            if (r11 == 0) goto L_0x0058
            goto L_0x00b0
        L_0x0058:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x006d
            char r9 = r0.charAt(r9)
            boolean r9 = m18939e(r9)
            if (r9 == 0) goto L_0x006d
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x006d:
            r3.append(r15)
            byte[] r9 = f12312d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x0075:
            boolean r9 = m18934a(r10)
            if (r9 == 0) goto L_0x0081
            if (r10 != r12) goto L_0x007e
            goto L_0x00a2
        L_0x007e:
            int r10 = r10 + -97
            goto L_0x00a8
        L_0x0081:
            boolean r9 = m18936b(r10)
            if (r9 == 0) goto L_0x008b
            r3.append(r14)
            goto L_0x00a6
        L_0x008b:
            boolean r9 = m18938d(r10)
            if (r9 == 0) goto L_0x0092
            goto L_0x00bc
        L_0x0092:
            r3.append(r15)
            byte[] r9 = f12312d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x009a:
            boolean r9 = m18936b(r10)
            if (r9 == 0) goto L_0x00aa
            if (r10 != r12) goto L_0x00a6
        L_0x00a2:
            r3.append(r11)
            goto L_0x00cb
        L_0x00a6:
            int r10 = r10 + -65
        L_0x00a8:
            char r9 = (char) r10
            goto L_0x0042
        L_0x00aa:
            boolean r9 = m18934a(r10)
            if (r9 == 0) goto L_0x00b6
        L_0x00b0:
            r3.append(r14)
            r7 = 1
            goto L_0x0011
        L_0x00b6:
            boolean r9 = m18938d(r10)
            if (r9 == 0) goto L_0x00c2
        L_0x00bc:
            r3.append(r13)
            r7 = 2
            goto L_0x0011
        L_0x00c2:
            r3.append(r15)
            byte[] r9 = f12312d
            byte r9 = r9[r10]
            goto L_0x0041
        L_0x00cb:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = 0
            r8 = 0
        L_0x00d5:
            if (r1 >= r0) goto L_0x00f3
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x00dd
            r9 = 1
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            if (r9 == 0) goto L_0x00ec
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x00f0
        L_0x00ec:
            char r8 = r3.charAt(r1)
        L_0x00f0:
            int r1 = r1 + 1
            goto L_0x00d5
        L_0x00f3:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x00fd
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x00fd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p220m.p221b.C4699g.m18928a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: a */
    private static int m18929a(String str, int i, Charset charset) {
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m18937c(charAt)) {
                i3++;
                int i4 = i2 + i3;
                if (i4 >= length) {
                    break;
                }
                charAt = str.charAt(i4);
            }
            if (i3 >= 13) {
                return i2 - i;
            }
            char charAt2 = str.charAt(i2);
            if (newEncoder.canEncode(charAt2)) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder("Non-encodable character detected: ");
                sb.append(charAt2);
                sb.append(" (Unicode: ");
                sb.append(charAt2);
                sb.append(')');
                throw new C4641h(sb.toString());
            }
        }
        return i2 - i;
    }

    /* renamed from: a */
    static String m18930a(String str, C4695c cVar, Charset charset) {
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f12313e;
        } else if (!f12313e.equals(charset)) {
            C4653c a = C4653c.m18758a(charset.name());
            if (a != null) {
                m18931a(a.mo13589f(), sb);
            }
        }
        int length = str.length();
        int i = C4700a.f12314a[cVar.ordinal()];
        if (i == 1) {
            m18928a((CharSequence) str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m18933a(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int a2 = m18927a((CharSequence) str, i2);
                if (a2 >= 13) {
                    sb.append(902);
                    m18932a(str, i2, a2, sb);
                    i2 += a2;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int b = m18935b(str, i2);
                    if (b >= 5 || a2 == length) {
                        if (i4 != 0) {
                            sb.append(900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = m18928a((CharSequence) str, i2, b, sb, i3);
                        i2 += b;
                    } else {
                        int a3 = m18929a(str, i2, charset);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i5 = a3 + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            m18933a(bytes2, 0, 1, 0, sb);
                        } else {
                            m18933a(bytes2, 0, bytes2.length, i4, sb);
                            i3 = 0;
                            i4 = 1;
                        }
                        i2 = i5;
                    }
                }
            }
        } else {
            sb.append(902);
            m18932a(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m18931a(int i, StringBuilder sb) {
        char c;
        if (i >= 0 && i < 900) {
            sb.append(927);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / 900) - 1));
            i %= 900;
        } else if (i < 811800) {
            sb.append(925);
            c = (char) (810900 - i);
            sb.append(c);
        } else {
            throw new C4641h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
        c = (char) i;
        sb.append(c);
    }

    /* renamed from: a */
    private static void m18932a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* renamed from: a */
    private static void m18933a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        char c = (i2 == 1 && i3 == 0) ? 913 : i2 % 6 == 0 ? (char) 924 : 901;
        sb.append(c);
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: a */
    private static boolean m18934a(char c) {
        return c == ' ' || (c >= 'a' && c <= 'z');
    }

    /* renamed from: b */
    private static int m18935b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m18937c(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m18940f(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: b */
    private static boolean m18936b(char c) {
        return c == ' ' || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: c */
    private static boolean m18937c(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: d */
    private static boolean m18938d(char c) {
        return f12311c[c] != -1;
    }

    /* renamed from: e */
    private static boolean m18939e(char c) {
        return f12312d[c] != -1;
    }

    /* renamed from: f */
    private static boolean m18940f(char c) {
        return c == 9 || c == 10 || c == 13 || (c >= ' ' && c <= '~');
    }
}
