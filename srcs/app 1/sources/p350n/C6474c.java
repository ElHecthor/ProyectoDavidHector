package p350n;

import p308k.p323z.p325d.C5942k;
import p350n.p351a0.C6471b;

/* renamed from: n.c */
public final class C6474c {
    /* renamed from: a */
    public static final int m24471a(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static final String m24472a(byte b) {
        return new String(new char[]{C6471b.m24464a()[(b >> 4) & 15], C6471b.m24464a()[b & 15]});
    }

    /* renamed from: a */
    public static final short m24473a(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: a */
    public static final void m24474a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder();
            sb.append("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: a */
    public static final boolean m24475a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C5942k.m22327b(bArr, "a");
        C5942k.m22327b(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final String m24476b(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C6471b.m24464a()[(i >> 28) & 15], C6471b.m24464a()[(i >> 24) & 15], C6471b.m24464a()[(i >> 20) & 15], C6471b.m24464a()[(i >> 16) & 15], C6471b.m24464a()[(i >> 12) & 15], C6471b.m24464a()[(i >> 8) & 15], C6471b.m24464a()[(i >> 4) & 15], C6471b.m24464a()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}
