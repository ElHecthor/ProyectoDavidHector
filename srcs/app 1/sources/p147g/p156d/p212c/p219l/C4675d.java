package p147g.p156d.p212c.p219l;

import java.util.ArrayList;
import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.d */
public final class C4675d extends C4686n {

    /* renamed from: g.d.c.l.d$a */
    private enum C4676a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: a */
    private static int m18869a(CharSequence charSequence, int i, int i2) {
        C4676a a;
        C4676a a2 = m18870a(charSequence, i);
        if (a2 == C4676a.ONE_DIGIT) {
            return 100;
        }
        if (a2 == C4676a.UNCODABLE) {
            if (i < charSequence.length()) {
                char charAt = charSequence.charAt(i);
                if (charAt < ' ' || (i2 == 101 && charAt < '`')) {
                    return 101;
                }
            }
            return 100;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 != 100) {
                if (a2 == C4676a.FNC_1) {
                    a2 = m18870a(charSequence, i + 1);
                }
                return a2 == C4676a.TWO_DIGITS ? 99 : 100;
            } else if (a2 == C4676a.FNC_1) {
                return 100;
            } else {
                C4676a a3 = m18870a(charSequence, i + 2);
                if (a3 == C4676a.UNCODABLE || a3 == C4676a.ONE_DIGIT) {
                    return 100;
                }
                if (a3 == C4676a.FNC_1) {
                    return m18870a(charSequence, i + 3) == C4676a.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    a = m18870a(charSequence, i3);
                    if (a != C4676a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return a == C4676a.ONE_DIGIT ? 100 : 99;
            }
        }
    }

    /* renamed from: a */
    private static C4676a m18870a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return C4676a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return C4676a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return C4676a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return C4676a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        return (charAt2 < '0' || charAt2 > '9') ? C4676a.ONE_DIGIT : C4676a.TWO_DIGITS;
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.CODE_128) {
            return super.mo13539a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo13645a(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int a = m18869a(str, i3, i5);
                int i8 = 100;
                if (a == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                } else {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = a;
                    } else if (a == 100) {
                        i7 = 104;
                    } else if (a != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = a;
                }
                arrayList.add(C4674c.f12265a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                arrayList.add(C4674c.f12265a[i4 % 103]);
                arrayList.add(C4674c.f12265a[106]);
                int i9 = 0;
                for (int[] iArr : arrayList) {
                    for (int i10 : (int[]) r13.next()) {
                        i9 += i10;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] a2 : arrayList) {
                    i += C4686n.m18888a(zArr, i, a2, true);
                }
                return zArr;
            }
        }
    }
}
