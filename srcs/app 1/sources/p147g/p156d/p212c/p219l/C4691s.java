package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4636d;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.s */
public final class C4691s extends C4689q {
    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.UPC_E) {
            return super.mo13539a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo13645a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int b = C4688p.m18895b(C4690r.m18897a(str));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(b);
                str = sb.toString();
            } catch (C4636d e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C4688p.m18894a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C4636d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = C4690r.f12283f[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int a = C4686n.m18888a(zArr, 0, C4688p.f12278a, true) + 0;
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                a += C4686n.m18888a(zArr, a, C4688p.f12282e[digit2], false);
            }
            C4686n.m18888a(zArr, a, C4688p.f12280c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
