package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4636d;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.j */
public final class C4682j extends C4689q {
    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.EAN_13) {
            return super.mo13539a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo13645a(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                int b = C4688p.m18895b(str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(b);
                str = sb.toString();
            } catch (C4636d e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!C4688p.m18894a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (C4636d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = C4681i.f12273f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a = C4686n.m18888a(zArr, 0, C4688p.f12278a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            a += C4686n.m18888a(zArr, a, C4688p.f12282e[digit], false);
        }
        int a2 = a + C4686n.m18888a(zArr, a, C4688p.f12279b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            a2 += C4686n.m18888a(zArr, a2, C4688p.f12281d[Character.digit(str.charAt(i3), 10)], true);
        }
        C4686n.m18888a(zArr, a2, C4688p.f12278a, true);
        return zArr;
    }
}
