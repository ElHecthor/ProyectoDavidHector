package p350n.p351a0;

import p308k.p323z.p325d.C5942k;
import p350n.C6473b;
import p350n.C6480e;
import p350n.C6494p;
import p350n.C6500t;

/* renamed from: n.a0.a */
public final class C6470a {

    /* renamed from: a */
    private static final byte[] f16080a = C6473b.m24470a("0123456789abcdef");

    /* renamed from: a */
    public static final int m24457a(C6480e eVar, C6494p pVar, boolean z) {
        int i;
        int i2;
        int i3;
        C6500t tVar;
        int i4;
        C6480e eVar2 = eVar;
        C5942k.m22327b(eVar2, "$this$selectPrefix");
        C5942k.m22327b(pVar, "options");
        C6500t tVar2 = eVar2.f16093f;
        int i5 = -2;
        if (tVar2 != null) {
            byte[] bArr = tVar2.f16128a;
            int i6 = tVar2.f16129b;
            int i7 = tVar2.f16130c;
            int[] e = pVar.mo16895e();
            C6500t tVar3 = tVar2;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = e[i8];
                int i12 = i10 + 1;
                int i13 = e[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (tVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & 255) != e[i12]) {
                            return i9;
                        }
                        boolean z2 = i16 == i14;
                        if (i15 != i7) {
                            C6500t tVar4 = tVar3;
                            i3 = i7;
                            i4 = i15;
                            tVar = tVar4;
                        } else if (tVar3 != null) {
                            C6500t tVar5 = tVar3.f16133f;
                            if (tVar5 != null) {
                                i4 = tVar5.f16129b;
                                byte[] bArr2 = tVar5.f16128a;
                                i3 = tVar5.f16130c;
                                if (tVar5 != tVar2) {
                                    byte[] bArr3 = bArr2;
                                    tVar = tVar5;
                                    bArr = bArr3;
                                } else if (!z2) {
                                    break loop0;
                                } else {
                                    bArr = bArr2;
                                    tVar = null;
                                }
                            } else {
                                C5942k.m22323a();
                                throw null;
                            }
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                        if (z2) {
                            i2 = e[i16];
                            i = i4;
                            i7 = i3;
                            tVar3 = tVar;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i12 = i16;
                        tVar3 = tVar;
                    }
                } else {
                    i = i6 + 1;
                    byte b = bArr[i6] & 255;
                    int i17 = i12 + i11;
                    while (i12 != i17) {
                        if (b == e[i12]) {
                            i2 = e[i12 + i11];
                            if (i == i7) {
                                tVar3 = tVar3.f16133f;
                                if (tVar3 != null) {
                                    i = tVar3.f16129b;
                                    bArr = tVar3.f16128a;
                                    i7 = tVar3.f16130c;
                                    if (tVar3 == tVar2) {
                                        tVar3 = null;
                                    }
                                } else {
                                    C5942k.m22323a();
                                    throw null;
                                }
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i6 = i;
            }
            if (z) {
                return -2;
            }
            return i9;
        }
        if (!z) {
            i5 = -1;
        }
        return i5;
    }

    /* renamed from: a */
    public static /* synthetic */ int m24458a(C6480e eVar, C6494p pVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24457a(eVar, pVar, z);
    }

    /* renamed from: a */
    public static final String m24459a(C6480e eVar, long j) {
        String str;
        C5942k.m22327b(eVar, "$this$readUtf8Line");
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (eVar.mo16796d(j3) == ((byte) 13)) {
                str = eVar.mo16802g(j3);
                j2 = 2;
                eVar.skip(j2);
                return str;
            }
        }
        str = eVar.mo16802g(j);
        eVar.skip(j2);
        return str;
    }

    /* renamed from: a */
    public static final byte[] m24460a() {
        return f16080a;
    }
}
