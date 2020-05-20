package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4636d;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.k */
public final class C4683k extends C4689q {
    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.EAN_8) {
            return super.mo13539a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public boolean[] mo13645a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int b = C4688p.m18895b(str);
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
        boolean[] zArr = new boolean[67];
        int a = C4686n.m18888a(zArr, 0, C4688p.f12278a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            a += C4686n.m18888a(zArr, a, C4688p.f12281d[Character.digit(str.charAt(i), 10)], false);
        }
        int a2 = a + C4686n.m18888a(zArr, a, C4688p.f12279b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            a2 += C4686n.m18888a(zArr, a2, C4688p.f12281d[Character.digit(str.charAt(i2), 10)], true);
        }
        C4686n.m18888a(zArr, a2, C4688p.f12278a, true);
        return zArr;
    }
}
