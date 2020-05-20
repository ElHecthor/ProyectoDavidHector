package p147g.p156d.p212c.p213i.p214b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: g.d.c.i.b.d */
public final class C4646d {

    /* renamed from: b */
    static final String[] f12161b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int[][] f12162c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    private static final int[][] f12163d;

    /* renamed from: e */
    static final int[][] f12164e;

    /* renamed from: a */
    private final byte[] f12165a;

    /* renamed from: g.d.c.i.b.d$a */
    class C4647a implements Comparator<C4649f> {
        C4647a(C4646d dVar) {
        }

        /* renamed from: a */
        public int compare(C4649f fVar, C4649f fVar2) {
            return fVar.mo13558b() - fVar2.mo13558b();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f12163d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f12163d[0][i] = (i - 65) + 2;
        }
        f12163d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f12163d[1][i2] = (i2 - 97) + 2;
        }
        f12163d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f12163d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f12163d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f12163d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f12163d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f12164e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f12164e;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public C4646d(byte[] bArr) {
        this.f12165a = bArr;
    }

    /* renamed from: a */
    private static Collection<C4649f> m18719a(Iterable<C4649f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C4649f fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4649f fVar2 = (C4649f) it.next();
                if (fVar2.mo13557a(fVar)) {
                    z = false;
                    break;
                } else if (fVar.mo13557a(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private Collection<C4649f> m18720a(Iterable<C4649f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C4649f a : iterable) {
            m18723a(a, i, (Collection<C4649f>) linkedList);
        }
        return m18719a(linkedList);
    }

    /* renamed from: a */
    private static Collection<C4649f> m18721a(Iterable<C4649f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C4649f a : iterable) {
            m18722a(a, i, i2, linkedList);
        }
        return m18719a(linkedList);
    }

    /* renamed from: a */
    private static void m18722a(C4649f fVar, int i, int i2, Collection<C4649f> collection) {
        C4649f b = fVar.mo13559b(i);
        collection.add(b.mo13555a(4, i2));
        if (fVar.mo13561c() != 4) {
            collection.add(b.mo13560b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.mo13555a(2, 16 - i2).mo13555a(2, 1));
        }
        if (fVar.mo13553a() > 0) {
            collection.add(fVar.mo13554a(i).mo13554a(i + 1));
        }
    }

    /* renamed from: a */
    private void m18723a(C4649f fVar, int i, Collection<C4649f> collection) {
        char c = (char) (this.f12165a[i] & 255);
        boolean z = f12163d[fVar.mo13561c()][c] > 0;
        C4649f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f12163d[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo13559b(i);
                }
                if (!z || i2 == fVar.mo13561c() || i2 == 2) {
                    collection.add(fVar2.mo13555a(i2, i3));
                }
                if (!z && f12164e[fVar.mo13561c()][i2] >= 0) {
                    collection.add(fVar2.mo13560b(i2, i3));
                }
            }
        }
        if (fVar.mo13553a() > 0 || f12163d[fVar.mo13561c()][c] == 0) {
            collection.add(fVar.mo13554a(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p147g.p156d.p212c.p215j.C4651a mo13549a() {
        /*
            r8 = this;
            g.d.c.i.b.f r0 = p147g.p156d.p212c.p213i.p214b.C4649f.f12168e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L_0x0008:
            byte[] r3 = r8.f12165a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004e
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r3 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            byte[] r5 = r8.f12165a
            byte r5 = r5[r2]
            r6 = 13
            if (r5 == r6) goto L_0x003a
            r6 = 44
            r7 = 32
            if (r5 == r6) goto L_0x0036
            r6 = 46
            if (r5 == r6) goto L_0x0032
            r6 = 58
            if (r5 == r6) goto L_0x002e
        L_0x002c:
            r3 = 0
            goto L_0x003f
        L_0x002e:
            if (r3 != r7) goto L_0x002c
            r3 = 5
            goto L_0x003f
        L_0x0032:
            if (r3 != r7) goto L_0x002c
            r3 = 3
            goto L_0x003f
        L_0x0036:
            if (r3 != r7) goto L_0x002c
            r3 = 4
            goto L_0x003f
        L_0x003a:
            r5 = 10
            if (r3 != r5) goto L_0x002c
            r3 = 2
        L_0x003f:
            if (r3 <= 0) goto L_0x0047
            java.util.Collection r0 = m18721a(r0, r2, r3)
            r2 = r4
            goto L_0x004b
        L_0x0047:
            java.util.Collection r0 = r8.m18720a(r0, r2)
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004e:
            g.d.c.i.b.d$a r1 = new g.d.c.i.b.d$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            g.d.c.i.b.f r0 = (p147g.p156d.p212c.p213i.p214b.C4649f) r0
            byte[] r1 = r8.f12165a
            g.d.c.j.a r0 = r0.mo13556a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p213i.p214b.C4646d.mo13549a():g.d.c.j.a");
    }
}
