package p147g.p156d.p212c.p217k.p218b;

import p147g.p156d.p212c.C4634b;

/* renamed from: g.d.c.k.b.k */
public class C4668k {

    /* renamed from: i */
    private static C4668k[] f12246i;

    /* renamed from: a */
    private final boolean f12247a;

    /* renamed from: b */
    private final int f12248b;

    /* renamed from: c */
    private final int f12249c;

    /* renamed from: d */
    public final int f12250d;

    /* renamed from: e */
    public final int f12251e;

    /* renamed from: f */
    private final int f12252f;

    /* renamed from: g */
    private final int f12253g;

    /* renamed from: h */
    private final int f12254h;

    static {
        C4668k kVar = new C4668k(false, 3, 5, 8, 8, 1);
        C4668k kVar2 = new C4668k(false, 5, 7, 10, 10, 1);
        C4668k kVar3 = new C4668k(true, 5, 7, 16, 6, 1);
        C4668k kVar4 = new C4668k(false, 8, 10, 12, 12, 1);
        C4668k kVar5 = new C4668k(true, 10, 11, 14, 6, 2);
        C4668k kVar6 = new C4668k(false, 12, 12, 14, 14, 1);
        C4668k kVar7 = new C4668k(true, 16, 14, 24, 10, 1);
        C4668k kVar8 = new C4668k(false, 18, 14, 16, 16, 1);
        C4668k kVar9 = new C4668k(false, 22, 18, 18, 18, 1);
        C4668k kVar10 = new C4668k(true, 22, 18, 16, 10, 2);
        C4668k kVar11 = new C4668k(false, 30, 20, 20, 20, 1);
        C4668k kVar12 = new C4668k(true, 32, 24, 16, 14, 2);
        C4668k kVar13 = new C4668k(false, 36, 24, 22, 22, 1);
        C4668k kVar14 = new C4668k(false, 44, 28, 24, 24, 1);
        C4668k kVar15 = new C4668k(true, 49, 28, 22, 14, 2);
        C4668k kVar16 = new C4668k(false, 62, 36, 14, 14, 4);
        C4668k kVar17 = new C4668k(false, 86, 42, 16, 16, 4);
        C4668k kVar18 = new C4668k(false, 114, 48, 18, 18, 4);
        C4668k kVar19 = new C4668k(false, 144, 56, 20, 20, 4);
        C4668k kVar20 = new C4668k(false, 174, 68, 22, 22, 4);
        C4668k kVar21 = new C4668k(false, 204, 84, 24, 24, 4, 102, 42);
        C4668k kVar22 = new C4668k(false, 280, 112, 14, 14, 16, 140, 56);
        C4668k kVar23 = new C4668k(false, 368, 144, 16, 16, 16, 92, 36);
        C4668k kVar24 = new C4668k(false, 456, 192, 18, 18, 16, 114, 48);
        C4668k kVar25 = new C4668k(false, 576, 224, 20, 20, 16, 144, 56);
        C4668k kVar26 = new C4668k(false, 696, 272, 22, 22, 16, 174, 68);
        C4668k kVar27 = new C4668k(false, 816, 336, 24, 24, 16, 136, 56);
        C4668k kVar28 = new C4668k(false, 1050, 408, 18, 18, 36, 175, 68);
        C4668k kVar29 = new C4668k(false, 1304, 496, 20, 20, 36, 163, 62);
        f12246i = new C4668k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25, kVar26, kVar27, kVar28, kVar29, new C4661d()};
    }

    public C4668k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    C4668k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f12247a = z;
        this.f12248b = i;
        this.f12249c = i2;
        this.f12250d = i3;
        this.f12251e = i4;
        this.f12252f = i5;
        this.f12253g = i6;
        this.f12254h = i7;
    }

    /* renamed from: a */
    public static C4668k m18849a(int i, C4669l lVar, C4634b bVar, C4634b bVar2, boolean z) {
        C4668k[] kVarArr;
        for (C4668k kVar : f12246i) {
            if ((lVar != C4669l.FORCE_SQUARE || !kVar.f12247a) && ((lVar != C4669l.FORCE_RECTANGLE || kVar.f12247a) && ((bVar == null || (kVar.mo13643g() >= bVar.mo13535b() && kVar.mo13642f() >= bVar.mo13534a())) && ((bVar2 == null || (kVar.mo13643g() <= bVar2.mo13535b() && kVar.mo13642f() <= bVar2.mo13534a())) && i <= kVar.f12248b)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: h */
    private int m18850h() {
        int i = this.f12252f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: i */
    private int m18851i() {
        int i = this.f12252f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: a */
    public final int mo13637a() {
        return this.f12248b;
    }

    /* renamed from: a */
    public int mo13614a(int i) {
        return this.f12253g;
    }

    /* renamed from: b */
    public final int mo13638b() {
        return this.f12249c;
    }

    /* renamed from: b */
    public final int mo13639b(int i) {
        return this.f12254h;
    }

    /* renamed from: c */
    public int mo13615c() {
        return this.f12248b / this.f12253g;
    }

    /* renamed from: d */
    public final int mo13640d() {
        return m18851i() * this.f12251e;
    }

    /* renamed from: e */
    public final int mo13641e() {
        return m18850h() * this.f12250d;
    }

    /* renamed from: f */
    public final int mo13642f() {
        return mo13640d() + (m18851i() << 1);
    }

    /* renamed from: g */
    public final int mo13643g() {
        return mo13641e() + (m18850h() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12247a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f12250d);
        sb.append('x');
        sb.append(this.f12251e);
        sb.append(", symbol size ");
        sb.append(mo13643g());
        sb.append('x');
        sb.append(mo13642f());
        sb.append(", symbol data size ");
        sb.append(mo13641e());
        sb.append('x');
        sb.append(mo13640d());
        sb.append(", codewords ");
        sb.append(this.f12248b);
        sb.append('+');
        sb.append(this.f12249c);
        return sb.toString();
    }
}
