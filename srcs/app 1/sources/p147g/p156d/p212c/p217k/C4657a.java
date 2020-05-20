package p147g.p156d.p212c.p217k;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4634b;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4640g;
import p147g.p156d.p212c.p215j.C4652b;
import p147g.p156d.p212c.p217k.p218b.C4662e;
import p147g.p156d.p212c.p217k.p218b.C4666i;
import p147g.p156d.p212c.p217k.p218b.C4667j;
import p147g.p156d.p212c.p217k.p218b.C4668k;
import p147g.p156d.p212c.p217k.p218b.C4669l;
import p147g.p156d.p212c.p222n.p224c.C4708b;

/* renamed from: g.d.c.k.a */
public final class C4657a implements C4640g {
    /* renamed from: a */
    private static C4652b m18778a(C4662e eVar, C4668k kVar, int i, int i2) {
        int e = kVar.mo13641e();
        int d = kVar.mo13640d();
        C4708b bVar = new C4708b(kVar.mo13643g(), kVar.mo13642f());
        int i3 = 0;
        for (int i4 = 0; i4 < d; i4++) {
            if (i4 % kVar.f12251e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < kVar.mo13643g(); i6++) {
                    bVar.mo13681a(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < e; i8++) {
                if (i8 % kVar.f12250d == 0) {
                    bVar.mo13681a(i7, i3, true);
                    i7++;
                }
                bVar.mo13681a(i7, i3, eVar.mo13617a(i8, i4));
                i7++;
                int i9 = kVar.f12250d;
                if (i8 % i9 == i9 - 1) {
                    bVar.mo13681a(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = kVar.f12251e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.mo13643g(); i12++) {
                    bVar.mo13681a(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return m18779a(bVar, i, i2);
    }

    /* renamed from: a */
    private static C4652b m18779a(C4708b bVar, int i, int i2) {
        C4652b bVar2;
        int c = bVar.mo13684c();
        int b = bVar.mo13683b();
        int max = Math.max(i, c);
        int max2 = Math.max(i2, b);
        int min = Math.min(max / c, max2 / b);
        int i3 = (max - (c * min)) / 2;
        int i4 = (max2 - (b * min)) / 2;
        if (i2 < b || i < c) {
            bVar2 = new C4652b(c, b);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new C4652b(i, i2);
        }
        bVar2.mo13581b();
        int i5 = 0;
        while (i5 < b) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < c) {
                if (bVar.mo13678a(i7, i5) == 1) {
                    bVar2.mo13579a(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return bVar2;
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        C4634b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != C4633a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions can't be negative: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            C4669l lVar = C4669l.FORCE_NONE;
            C4634b bVar2 = null;
            if (map != null) {
                C4669l lVar2 = (C4669l) map.get(C4635c.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                C4634b bVar3 = (C4634b) map.get(C4635c.MIN_SIZE);
                if (bVar3 == null) {
                    bVar3 = null;
                }
                bVar = (C4634b) map.get(C4635c.MAX_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
                bVar2 = bVar3;
            } else {
                bVar = null;
            }
            String a = C4667j.m18839a(str, lVar, bVar2, bVar);
            C4668k a2 = C4668k.m18849a(a.length(), lVar, bVar2, bVar, true);
            C4662e eVar = new C4662e(C4666i.m18833a(a, a2), a2.mo13641e(), a2.mo13640d());
            eVar.mo13616a();
            return m18778a(eVar, a2, i, i2);
        }
    }
}
