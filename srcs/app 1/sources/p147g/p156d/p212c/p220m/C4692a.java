package p147g.p156d.p212c.p220m;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4640g;
import p147g.p156d.p212c.p215j.C4652b;
import p147g.p156d.p212c.p220m.p221b.C4695c;
import p147g.p156d.p212c.p220m.p221b.C4696d;
import p147g.p156d.p212c.p220m.p221b.C4697e;

/* renamed from: g.d.c.m.a */
public final class C4692a implements C4640g {
    /* renamed from: a */
    private static C4652b m18900a(C4697e eVar, String str, int i, int i2, int i3, int i4) {
        boolean z;
        eVar.mo13659a(str, i);
        byte[][] a = eVar.mo13656a().mo13648a(1, 4);
        if ((i3 > i2) != (a[0].length < a.length)) {
            a = m18902a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / a[0].length;
        int length2 = i3 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m18901a(a, i4);
        }
        byte[][] a2 = eVar.mo13656a().mo13648a(length, length << 2);
        if (z) {
            a2 = m18902a(a2);
        }
        return m18901a(a2, i4);
    }

    /* renamed from: a */
    private static C4652b m18901a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C4652b bVar = new C4652b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo13581b();
        int c = (bVar.mo13583c() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    bVar.mo13582b(i4 + i, c);
                }
            }
            i3++;
            c--;
        }
        return bVar;
    }

    /* renamed from: a */
    private static byte[][] m18902a(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        int i3;
        int i4;
        if (aVar == C4633a.PDF_417) {
            C4697e eVar = new C4697e();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(C4635c.PDF417_COMPACT)) {
                    eVar.mo13661a(Boolean.valueOf(map.get(C4635c.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(C4635c.PDF417_COMPACTION)) {
                    eVar.mo13658a(C4695c.valueOf(map.get(C4635c.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(C4635c.PDF417_DIMENSIONS)) {
                    C4696d dVar = (C4696d) map.get(C4635c.PDF417_DIMENSIONS);
                    eVar.mo13657a(dVar.mo13652a(), dVar.mo13654c(), dVar.mo13653b(), dVar.mo13655d());
                }
                if (map.containsKey(C4635c.MARGIN)) {
                    i5 = Integer.parseInt(map.get(C4635c.MARGIN).toString());
                }
                if (map.containsKey(C4635c.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(C4635c.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C4635c.CHARACTER_SET)) {
                    eVar.mo13660a(Charset.forName(map.get(C4635c.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return m18900a(eVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
