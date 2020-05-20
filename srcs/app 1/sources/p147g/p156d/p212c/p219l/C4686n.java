package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4640g;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.n */
public abstract class C4686n implements C4640g {
    /* renamed from: a */
    protected static int m18888a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i + 1;
                zArr[i] = z;
                i4++;
                i = i5;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: a */
    private static C4652b m18889a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C4652b bVar = new C4652b(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.mo13579a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    /* renamed from: a */
    public int mo13646a() {
        return 10;
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int a = mo13646a();
            if (map != null && map.containsKey(C4635c.MARGIN)) {
                a = Integer.parseInt(map.get(C4635c.MARGIN).toString());
            }
            return m18889a(mo13645a(str), i, i2, a);
        }
    }

    /* renamed from: a */
    public abstract boolean[] mo13645a(String str);
}
