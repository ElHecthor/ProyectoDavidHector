package p147g.p156d.p212c.p222n;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4640g;
import p147g.p156d.p212c.p215j.C4652b;
import p147g.p156d.p212c.p222n.p223b.C4702a;
import p147g.p156d.p212c.p222n.p224c.C4708b;
import p147g.p156d.p212c.p222n.p224c.C4709c;
import p147g.p156d.p212c.p222n.p224c.C4713f;

/* renamed from: g.d.c.n.a */
public final class C4701a implements C4640g {
    /* renamed from: a */
    private static C4652b m18941a(C4713f fVar, int i, int i2, int i3) {
        C4708b a = fVar.mo13686a();
        if (a != null) {
            int c = a.mo13684c();
            int b = a.mo13683b();
            int i4 = i3 << 1;
            int i5 = c + i4;
            int i6 = i4 + b;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (c * min)) / 2;
            int i8 = (max2 - (b * min)) / 2;
            C4652b bVar = new C4652b(max, max2);
            int i9 = 0;
            while (i9 < b) {
                int i10 = i7;
                int i11 = 0;
                while (i11 < c) {
                    if (a.mo13678a(i11, i9) == 1) {
                        bVar.mo13579a(i10, i8, min, min);
                    }
                    i11++;
                    i10 += min;
                }
                i9++;
                i8 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C4633a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            C4702a aVar2 = C4702a.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(C4635c.ERROR_CORRECTION)) {
                    aVar2 = C4702a.valueOf(map.get(C4635c.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C4635c.MARGIN)) {
                    i3 = Integer.parseInt(map.get(C4635c.MARGIN).toString());
                }
            }
            return m18941a(C4709c.m18975a(str, aVar2, map), i, i2, i3);
        }
    }
}
