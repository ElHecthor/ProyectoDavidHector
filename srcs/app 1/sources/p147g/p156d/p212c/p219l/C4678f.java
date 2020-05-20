package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.f */
public final class C4678f extends C4686n {
    /* renamed from: a */
    private static void m18873a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: b */
    private static String m18874b(String str) {
        String str2;
        int i;
        int i2;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt == '`') {
                        str2 = "%W";
                    } else if (!(charAt == '-' || charAt == '.')) {
                        if (charAt <= 26) {
                            sb.append('$');
                            i = charAt - 1;
                        } else if (charAt < ' ') {
                            sb.append('%');
                            i = charAt - 27;
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb.append('/');
                            i = charAt - '!';
                        } else {
                            if (charAt <= '9') {
                                i2 = (charAt - '0') + 48;
                            } else if (charAt <= '?') {
                                sb.append('%');
                                i2 = (charAt - ';') + 70;
                            } else if (charAt <= 'Z') {
                                i = charAt - 'A';
                            } else if (charAt <= '_') {
                                sb.append('%');
                                i2 = (charAt - '[') + 75;
                            } else if (charAt <= 'z') {
                                sb.append('+');
                                i = charAt - 'a';
                            } else if (charAt <= 127) {
                                sb.append('%');
                                i2 = (charAt - '{') + 80;
                            } else {
                                StringBuilder sb2 = new StringBuilder("Requested content contains a non-encodable character: '");
                                sb2.append(str.charAt(i3));
                                sb2.append("'");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            charAt = (char) i2;
                        }
                        i2 = i + 65;
                        charAt = (char) i2;
                    }
                }
                sb.append(charAt);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.CODE_39) {
            return super.mo13539a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo13645a(String str) {
        String str2;
        int length = str.length();
        String str3 = "Requested contents should be less than 80 digits long, but got ";
        if (length <= 80) {
            int i = 0;
            while (true) {
                str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
                if (i >= length) {
                    break;
                } else if (str2.indexOf(str.charAt(i)) < 0) {
                    str = m18874b(str);
                    length = str.length();
                    if (length > 80) {
                        StringBuilder sb = new StringBuilder(str3);
                        sb.append(length);
                        sb.append(" (extended full ASCII mode)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i2 = length + 25;
            for (int i3 = 0; i3 < length; i3++) {
                m18873a(C4677e.f12271a[str2.indexOf(str.charAt(i3))], iArr);
                for (int i4 = 0; i4 < 9; i4++) {
                    i2 += iArr[i4];
                }
            }
            boolean[] zArr = new boolean[i2];
            m18873a(148, iArr);
            int a = C4686n.m18888a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int a2 = a + C4686n.m18888a(zArr, a, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                m18873a(C4677e.f12271a[str2.indexOf(str.charAt(i5))], iArr);
                int a3 = a2 + C4686n.m18888a(zArr, a2, iArr, true);
                a2 = a3 + C4686n.m18888a(zArr, a3, iArr2, false);
            }
            m18873a(148, iArr);
            C4686n.m18888a(zArr, a2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException(str3.concat(String.valueOf(length)));
    }
}
