package p308k.p313e0;

import p308k.p310b0.C5732d;

/* renamed from: k.e0.b */
class C5767b {
    /* renamed from: a */
    public static final int m21913a(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: a */
    public static int m21914a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C5732d(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static final boolean m21915a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
