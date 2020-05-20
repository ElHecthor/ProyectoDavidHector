package p147g.p156d.p212c.p222n.p224c;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4641h;
import p147g.p156d.p212c.p215j.C4651a;
import p147g.p156d.p212c.p215j.C4653c;
import p147g.p156d.p212c.p215j.p216d.C4654a;
import p147g.p156d.p212c.p215j.p216d.C4656c;
import p147g.p156d.p212c.p222n.p223b.C4702a;
import p147g.p156d.p212c.p222n.p223b.C4703b;
import p147g.p156d.p212c.p222n.p223b.C4704c;
import p147g.p156d.p212c.p222n.p223b.C4704c.C4706b;

/* renamed from: g.d.c.n.c.c */
public final class C4709c {

    /* renamed from: a */
    private static final int[] f12347a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: g.d.c.n.c.c$a */
    static /* synthetic */ class C4710a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12348a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                g.d.c.n.b.b[] r0 = p147g.p156d.p212c.p222n.p223b.C4703b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12348a = r0
                g.d.c.n.b.b r1 = p147g.p156d.p212c.p222n.p223b.C4703b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12348a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.d.c.n.b.b r1 = p147g.p156d.p212c.p222n.p223b.C4703b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12348a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.d.c.n.b.b r1 = p147g.p156d.p212c.p222n.p223b.C4703b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12348a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.d.c.n.b.b r1 = p147g.p156d.p212c.p222n.p223b.C4703b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p222n.p224c.C4709c.C4710a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static int m18967a(int i) {
        int[] iArr = f12347a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: a */
    private static int m18968a(C4651a aVar, C4702a aVar2, C4704c cVar, C4708b bVar) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C4712e.m19001a(aVar, aVar2, cVar, i3, bVar);
            int a = m18970a(bVar);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m18969a(C4703b bVar, C4651a aVar, C4651a aVar2, C4704c cVar) {
        return aVar.mo13571b() + bVar.mo13663a(cVar) + aVar2.mo13571b();
    }

    /* renamed from: a */
    private static int m18970a(C4708b bVar) {
        return C4711d.m18989a(bVar) + C4711d.m18994b(bVar) + C4711d.m18995c(bVar) + C4711d.m18996d(bVar);
    }

    /* renamed from: a */
    static C4651a m18971a(C4651a aVar, int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (aVar.mo13573c() == i5) {
            ArrayList<C4707a> arrayList = new ArrayList<>(i6);
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int[] iArr3 = iArr2;
                m18976a(i, i2, i3, i10, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                aVar.mo13567a(i7 << 3, bArr, 0, i11);
                byte[] a = m18987a(bArr, iArr3[0]);
                arrayList.add(new C4707a(bArr, a));
                i8 = Math.max(i8, i11);
                i9 = Math.max(i9, a.length);
                i7 += iArr[0];
            }
            if (i5 == i7) {
                C4651a aVar2 = new C4651a();
                for (int i12 = 0; i12 < i8; i12++) {
                    for (C4707a a2 : arrayList) {
                        byte[] a3 = a2.mo13676a();
                        if (i12 < a3.length) {
                            aVar2.mo13566a(a3[i12], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < i9; i13++) {
                    for (C4707a b : arrayList) {
                        byte[] b2 = b.mo13677b();
                        if (i13 < b2.length) {
                            aVar2.mo13566a(b2[i13], 8);
                        }
                    }
                }
                if (i4 == aVar2.mo13573c()) {
                    return aVar2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i4);
                sb.append(" and ");
                sb.append(aVar2.mo13573c());
                sb.append(" differ.");
                throw new C4641h(sb.toString());
            }
            throw new C4641h("Data bytes does not match offset");
        }
        throw new C4641h("Number of bits and data bytes does not match");
    }

    /* renamed from: a */
    private static C4703b m18972a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m18986a(str)) {
            return C4703b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m18967a((int) charAt) == -1) {
                return C4703b.BYTE;
            } else {
                z = true;
            }
        }
        return z ? C4703b.ALPHANUMERIC : z2 ? C4703b.NUMERIC : C4703b.BYTE;
    }

    /* renamed from: a */
    private static C4704c m18973a(int i, C4702a aVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            C4704c a = C4704c.m18946a(i2);
            if (m18985a(i, a, aVar)) {
                return a;
            }
        }
        throw new C4641h("Data too big");
    }

    /* renamed from: a */
    private static C4704c m18974a(C4702a aVar, C4703b bVar, C4651a aVar2, C4651a aVar3) {
        return m18973a(m18969a(bVar, aVar2, aVar3, m18973a(m18969a(bVar, aVar2, aVar3, C4704c.m18946a(1)), aVar)), aVar);
    }

    /* renamed from: a */
    public static C4713f m18975a(String str, C4702a aVar, Map<C4635c, ?> map) {
        C4704c cVar;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(C4635c.CHARACTER_SET);
        String obj = z2 ? map.get(C4635c.CHARACTER_SET).toString() : "ISO-8859-1";
        C4703b a = m18972a(str, obj);
        C4651a aVar2 = new C4651a();
        if (a == C4703b.BYTE && z2) {
            C4653c a2 = C4653c.m18758a(obj);
            if (a2 != null) {
                m18979a(a2, aVar2);
            }
        }
        if (map == null || !map.containsKey(C4635c.GS1_FORMAT)) {
            z = false;
        }
        if (z && Boolean.valueOf(map.get(C4635c.GS1_FORMAT).toString()).booleanValue()) {
            m18980a(C4703b.FNC1_FIRST_POSITION, aVar2);
        }
        m18980a(a, aVar2);
        C4651a aVar3 = new C4651a();
        m18984a(str, a, aVar3, obj);
        if (map == null || !map.containsKey(C4635c.QR_VERSION)) {
            cVar = m18974a(aVar, a, aVar2, aVar3);
        } else {
            cVar = C4704c.m18946a(Integer.parseInt(map.get(C4635c.QR_VERSION).toString()));
            if (!m18985a(m18969a(a, aVar2, aVar3, cVar), cVar, aVar)) {
                throw new C4641h("Data too big for requested version");
            }
        }
        C4651a aVar4 = new C4651a();
        aVar4.mo13568a(aVar2);
        m18978a(a == C4703b.BYTE ? aVar3.mo13573c() : str.length(), cVar, a, aVar4);
        aVar4.mo13568a(aVar3);
        C4706b a3 = cVar.mo13666a(aVar);
        int b = cVar.mo13667b() - a3.mo13675d();
        m18977a(b, aVar4);
        C4651a a4 = m18971a(aVar4, cVar.mo13667b(), b, a3.mo13674c());
        C4713f fVar = new C4713f();
        fVar.mo13688a(aVar);
        fVar.mo13689a(a);
        fVar.mo13690a(cVar);
        int a5 = cVar.mo13665a();
        C4708b bVar = new C4708b(a5, a5);
        int a6 = m18968a(a4, aVar, cVar, bVar);
        fVar.mo13687a(a6);
        C4712e.m19001a(a4, aVar, cVar, a6, bVar);
        fVar.mo13691a(bVar);
        return fVar;
    }

    /* renamed from: a */
    static void m18976a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new C4641h("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new C4641h("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new C4641h("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new C4641h("Block ID too large");
        }
    }

    /* renamed from: a */
    static void m18977a(int i, C4651a aVar) {
        int i2 = i << 3;
        if (aVar.mo13571b() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo13571b() < i2; i3++) {
                aVar.mo13569a(false);
            }
            int b = aVar.mo13571b() & 7;
            if (b > 0) {
                while (b < 8) {
                    aVar.mo13569a(false);
                    b++;
                }
            }
            int c = i - aVar.mo13573c();
            for (int i4 = 0; i4 < c; i4++) {
                aVar.mo13566a((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo13571b() != i2) {
                throw new C4641h("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(aVar.mo13571b());
        sb.append(" > ");
        sb.append(i2);
        throw new C4641h(sb.toString());
    }

    /* renamed from: a */
    static void m18978a(int i, C4704c cVar, C4703b bVar, C4651a aVar) {
        int a = bVar.mo13663a(cVar);
        int i2 = 1 << a;
        if (i < i2) {
            aVar.mo13566a(i, a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is bigger than ");
        sb.append(i2 - 1);
        throw new C4641h(sb.toString());
    }

    /* renamed from: a */
    private static void m18979a(C4653c cVar, C4651a aVar) {
        aVar.mo13566a(C4703b.ECI.mo13664f(), 4);
        aVar.mo13566a(cVar.mo13589f(), 8);
    }

    /* renamed from: a */
    static void m18980a(C4703b bVar, C4651a aVar) {
        aVar.mo13566a(bVar.mo13664f(), 4);
    }

    /* renamed from: a */
    static void m18981a(CharSequence charSequence, C4651a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a = m18967a((int) charSequence.charAt(i));
            if (a != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int a2 = m18967a((int) charSequence.charAt(i2));
                    if (a2 != -1) {
                        aVar.mo13566a((a * 45) + a2, 11);
                        i += 2;
                    } else {
                        throw new C4641h();
                    }
                } else {
                    aVar.mo13566a(a, 6);
                    i = i2;
                }
            } else {
                throw new C4641h();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m18982a(java.lang.String r6, p147g.p156d.p212c.p215j.C4651a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo13566a(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            g.d.c.h r6 = new g.d.c.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            g.d.c.h r7 = new g.d.c.h
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p222n.p224c.C4709c.m18982a(java.lang.String, g.d.c.j.a):void");
    }

    /* renamed from: a */
    static void m18983a(String str, C4651a aVar, String str2) {
        try {
            for (byte a : str.getBytes(str2)) {
                aVar.mo13566a(a, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new C4641h((Throwable) e);
        }
    }

    /* renamed from: a */
    static void m18984a(String str, C4703b bVar, C4651a aVar, String str2) {
        int i = C4710a.f12348a[bVar.ordinal()];
        if (i == 1) {
            m18988b(str, aVar);
        } else if (i == 2) {
            m18981a((CharSequence) str, aVar);
        } else if (i == 3) {
            m18983a(str, aVar, str2);
        } else if (i == 4) {
            m18982a(str, aVar);
        } else {
            throw new C4641h("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    /* renamed from: a */
    private static boolean m18985a(int i, C4704c cVar, C4702a aVar) {
        return cVar.mo13667b() - cVar.mo13666a(aVar).mo13675d() >= (i + 7) / 8;
    }

    /* renamed from: a */
    private static boolean m18986a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static byte[] m18987a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C4656c(C4654a.f12217k).mo13607a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: b */
    static void m18988b(CharSequence charSequence, C4651a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo13566a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo13566a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo13566a(charAt, 4);
                }
            }
        }
    }
}
