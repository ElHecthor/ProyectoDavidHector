package p147g.p156d.p212c.p222n.p224c;

import p147g.p156d.p212c.C4641h;
import p147g.p156d.p212c.p215j.C4651a;
import p147g.p156d.p212c.p222n.p223b.C4702a;
import p147g.p156d.p212c.p222n.p223b.C4704c;

/* renamed from: g.d.c.n.c.e */
final class C4712e {

    /* renamed from: a */
    private static final int[][] f12349a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f12350b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f12351c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f12352d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    static int m18997a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: a */
    static int m18998a(int i, int i2) {
        if (i2 != 0) {
            int a = m18997a(i2);
            int i3 = i << (a - 1);
            while (m18997a(i3) >= a) {
                i3 ^= i2 << (m18997a(i3) - a);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: a */
    private static void m18999a(int i, int i2, C4708b bVar) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m19010b((int) bVar.mo13678a(i4, i2))) {
                bVar.mo13680a(i4, i2, 0);
                i3++;
            } else {
                throw new C4641h();
            }
        }
    }

    /* renamed from: a */
    static void m19000a(C4651a aVar, int i, C4708b bVar) {
        boolean z;
        int c = bVar.mo13684c() - 1;
        int b = bVar.mo13683b() - 1;
        int i2 = 0;
        int i3 = -1;
        while (c > 0) {
            if (c == 6) {
                c--;
            }
            while (b >= 0 && b < bVar.mo13683b()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = c - i4;
                    if (m19010b((int) bVar.mo13678a(i5, b))) {
                        if (i2 < aVar.mo13571b()) {
                            z = aVar.mo13570a(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C4711d.m18991a(i, i5, b)) {
                            z = !z;
                        }
                        bVar.mo13681a(i5, b, z);
                    }
                }
                b += i3;
            }
            i3 = -i3;
            b += i3;
            c -= 2;
        }
        if (i2 != aVar.mo13571b()) {
            StringBuilder sb = new StringBuilder("Not all bits consumed: ");
            sb.append(i2);
            sb.append('/');
            sb.append(aVar.mo13571b());
            throw new C4641h(sb.toString());
        }
    }

    /* renamed from: a */
    static void m19001a(C4651a aVar, C4702a aVar2, C4704c cVar, int i, C4708b bVar) {
        m19006a(bVar);
        m19005a(cVar, bVar);
        m19003a(aVar2, i, bVar);
        m19012c(cVar, bVar);
        m19000a(aVar, i, bVar);
    }

    /* renamed from: a */
    static void m19002a(C4702a aVar, int i, C4651a aVar2) {
        if (C4713f.m19016b(i)) {
            int f = (aVar.mo13662f() << 3) | i;
            aVar2.mo13566a(f, 5);
            aVar2.mo13566a(m18998a(f, 1335), 10);
            C4651a aVar3 = new C4651a();
            aVar3.mo13566a(21522, 15);
            aVar2.mo13572b(aVar3);
            if (aVar2.mo13571b() != 15) {
                StringBuilder sb = new StringBuilder("should not happen but we got: ");
                sb.append(aVar2.mo13571b());
                throw new C4641h(sb.toString());
            }
            return;
        }
        throw new C4641h("Invalid mask pattern");
    }

    /* renamed from: a */
    static void m19003a(C4702a aVar, int i, C4708b bVar) {
        C4651a aVar2 = new C4651a();
        m19002a(aVar, i, aVar2);
        for (int i2 = 0; i2 < aVar2.mo13571b(); i2++) {
            boolean a = aVar2.mo13570a((aVar2.mo13571b() - 1) - i2);
            int[] iArr = f12352d[i2];
            bVar.mo13681a(iArr[0], iArr[1], a);
            if (i2 < 8) {
                bVar.mo13681a((bVar.mo13684c() - i2) - 1, 8, a);
            } else {
                bVar.mo13681a(8, (bVar.mo13683b() - 7) + (i2 - 8), a);
            }
        }
    }

    /* renamed from: a */
    static void m19004a(C4704c cVar, C4651a aVar) {
        aVar.mo13566a(cVar.mo13668c(), 6);
        aVar.mo13566a(m18998a(cVar.mo13668c(), 7973), 12);
        if (aVar.mo13571b() != 18) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(aVar.mo13571b());
            throw new C4641h(sb.toString());
        }
    }

    /* renamed from: a */
    static void m19005a(C4704c cVar, C4708b bVar) {
        m19013c(bVar);
        m19009b(bVar);
        m19008b(cVar, bVar);
        m19015d(bVar);
    }

    /* renamed from: a */
    static void m19006a(C4708b bVar) {
        bVar.mo13679a(-1);
    }

    /* renamed from: b */
    private static void m19007b(int i, int i2, C4708b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f12350b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo13680a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: b */
    private static void m19008b(C4704c cVar, C4708b bVar) {
        if (cVar.mo13668c() >= 2) {
            int[] iArr = f12351c[cVar.mo13668c() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m19010b((int) bVar.mo13678a(i2, i))) {
                            m19007b(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m19009b(C4708b bVar) {
        if (bVar.mo13678a(8, bVar.mo13683b() - 8) != 0) {
            bVar.mo13680a(8, bVar.mo13683b() - 8, 1);
            return;
        }
        throw new C4641h();
    }

    /* renamed from: b */
    private static boolean m19010b(int i) {
        return i == -1;
    }

    /* renamed from: c */
    private static void m19011c(int i, int i2, C4708b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f12349a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo13680a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: c */
    static void m19012c(C4704c cVar, C4708b bVar) {
        if (cVar.mo13668c() >= 7) {
            C4651a aVar = new C4651a();
            m19004a(cVar, aVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean a = aVar.mo13570a(i);
                    i--;
                    bVar.mo13681a(i2, (bVar.mo13683b() - 11) + i3, a);
                    bVar.mo13681a((bVar.mo13683b() - 11) + i3, i2, a);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m19013c(C4708b bVar) {
        int length = f12349a[0].length;
        m19011c(0, 0, bVar);
        m19011c(bVar.mo13684c() - length, 0, bVar);
        m19011c(0, bVar.mo13684c() - length, bVar);
        m18999a(0, 7, bVar);
        m18999a(bVar.mo13684c() - 8, 7, bVar);
        m18999a(0, bVar.mo13684c() - 8, bVar);
        m19014d(7, 0, bVar);
        m19014d((bVar.mo13683b() - 7) - 1, 0, bVar);
        m19014d(7, bVar.mo13683b() - 7, bVar);
    }

    /* renamed from: d */
    private static void m19014d(int i, int i2, C4708b bVar) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m19010b((int) bVar.mo13678a(i, i4))) {
                bVar.mo13680a(i, i4, 0);
                i3++;
            } else {
                throw new C4641h();
            }
        }
    }

    /* renamed from: d */
    private static void m19015d(C4708b bVar) {
        int i = 8;
        while (i < bVar.mo13684c() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m19010b((int) bVar.mo13678a(i, 6))) {
                bVar.mo13680a(i, 6, i3);
            }
            if (m19010b((int) bVar.mo13678a(6, i))) {
                bVar.mo13680a(6, i, i3);
            }
            i = i2;
        }
    }
}
