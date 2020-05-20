package p350n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import p308k.C5809q;
import p308k.p314u.C5816b;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.p */
public final class C6494p extends C5816b<C6485h> implements RandomAccess {

    /* renamed from: i */
    public static final C6495a f16116i = new C6495a(null);

    /* renamed from: g */
    private final C6485h[] f16117g;

    /* renamed from: h */
    private final int[] f16118h;

    /* renamed from: n.p$a */
    public static final class C6495a {
        private C6495a() {
        }

        public /* synthetic */ C6495a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        private final long m24634a(C6480e eVar) {
            return eVar.mo16834x() / ((long) 4);
        }

        /* renamed from: a */
        private final void m24635a(long j, C6480e eVar, int i, List<? extends C6485h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C6480e eVar2;
            C6480e eVar3 = eVar;
            int i8 = i;
            List<? extends C6485h> list3 = list;
            int i9 = i2;
            int i10 = i3;
            List<Integer> list4 = list2;
            String str = "Failed requirement.";
            if (i9 < i10) {
                int i11 = i9;
                while (i11 < i10) {
                    if (((C6485h) list3.get(i11)).mo16868p() >= i8) {
                        i11++;
                    } else {
                        throw new IllegalArgumentException(str.toString());
                    }
                }
                C6485h hVar = (C6485h) list.get(i2);
                C6485h hVar2 = (C6485h) list3.get(i10 - 1);
                if (i8 == hVar.mo16868p()) {
                    int intValue = ((Number) list4.get(i9)).intValue();
                    int i12 = i9 + 1;
                    i4 = i12;
                    i5 = intValue;
                    hVar = (C6485h) list3.get(i12);
                } else {
                    i4 = i9;
                    i5 = -1;
                }
                if (hVar.mo16846a(i8) != hVar2.mo16846a(i8)) {
                    int i13 = 1;
                    for (int i14 = i4 + 1; i14 < i10; i14++) {
                        if (((C6485h) list3.get(i14 - 1)).mo16846a(i8) != ((C6485h) list3.get(i14)).mo16846a(i8)) {
                            i13++;
                        }
                    }
                    long a = j + m24634a(eVar3) + ((long) 2) + ((long) (i13 * 2));
                    eVar3.writeInt(i13);
                    eVar3.writeInt(i5);
                    for (int i15 = i4; i15 < i10; i15++) {
                        byte a2 = ((C6485h) list3.get(i15)).mo16846a(i8);
                        if (i15 == i4 || a2 != ((C6485h) list3.get(i15 - 1)).mo16846a(i8)) {
                            eVar3.writeInt((int) a2 & 255);
                        }
                    }
                    C6480e eVar4 = new C6480e();
                    while (i4 < i10) {
                        byte a3 = ((C6485h) list3.get(i4)).mo16846a(i8);
                        int i16 = i4 + 1;
                        int i17 = i16;
                        while (true) {
                            if (i17 >= i10) {
                                i6 = i10;
                                break;
                            } else if (a3 != ((C6485h) list3.get(i17)).mo16846a(i8)) {
                                i6 = i17;
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (i16 == i6 && i8 + 1 == ((C6485h) list3.get(i4)).mo16868p()) {
                            eVar3.writeInt(((Number) list4.get(i4)).intValue());
                            i7 = i6;
                            eVar2 = eVar4;
                        } else {
                            eVar3.writeInt(((int) (a + m24634a(eVar4))) * -1);
                            i7 = i6;
                            eVar2 = eVar4;
                            m24635a(a, eVar4, i8 + 1, list, i4, i6, list2);
                        }
                        eVar4 = eVar2;
                        i4 = i7;
                    }
                    eVar3.mo16780a((C6506y) eVar4);
                    return;
                }
                int min = Math.min(hVar.mo16868p(), hVar2.mo16868p());
                int i18 = i8;
                int i19 = 0;
                while (i18 < min && hVar.mo16846a(i18) == hVar2.mo16846a(i18)) {
                    i19++;
                    i18++;
                }
                long a4 = j + m24634a(eVar3) + ((long) 2) + ((long) i19) + 1;
                eVar3.writeInt(-i19);
                eVar3.writeInt(i5);
                int i20 = i8 + i19;
                while (i8 < i20) {
                    eVar3.writeInt((int) hVar.mo16846a(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i10) {
                    if (i20 == ((C6485h) list3.get(i4)).mo16868p()) {
                        eVar3.writeInt(((Number) list4.get(i4)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C6480e eVar5 = new C6480e();
                eVar3.writeInt(((int) (m24634a(eVar5) + a4)) * -1);
                m24635a(a4, eVar5, i20, list, i4, i3, list2);
                eVar3.mo16780a((C6506y) eVar5);
                return;
            }
            throw new IllegalArgumentException(str.toString());
        }

        /* renamed from: a */
        static /* synthetic */ void m24636a(C6495a aVar, long j, C6480e eVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m24635a((i4 & 1) != 0 ? 0 : j, eVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: a */
        public final C6494p mo16896a(C6485h... hVarArr) {
            C6485h[] hVarArr2 = hVarArr;
            C5942k.m22327b(hVarArr2, "byteStrings");
            int i = 0;
            if (hVarArr2.length == 0) {
                return new C6494p(new C6485h[0], new int[]{0, -1}, null);
            }
            List f = C5832h.m22125f(hVarArr);
            C5841p.m22168c(f);
            ArrayList arrayList = new ArrayList(hVarArr2.length);
            for (C6485h hVar : hVarArr2) {
                arrayList.add(Integer.valueOf(-1));
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List d = C5837l.m22165d((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = hVarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i3 + 1;
                    d.set(C5837l.m22157a(f, hVarArr2[i2], 0, 0, 6, null), Integer.valueOf(i3));
                    i2++;
                    i3 = i4;
                }
                if (((C6485h) f.get(0)).mo16868p() > 0) {
                    int i5 = 0;
                    while (i5 < f.size()) {
                        C6485h hVar2 = (C6485h) f.get(i5);
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 < f.size()) {
                            C6485h hVar3 = (C6485h) f.get(i7);
                            if (!hVar3.mo16854b(hVar2)) {
                                continue;
                                break;
                            }
                            if (!(hVar3.mo16868p() != hVar2.mo16868p())) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("duplicate option: ");
                                sb.append(hVar3);
                                throw new IllegalArgumentException(sb.toString().toString());
                            } else if (((Number) d.get(i7)).intValue() > ((Number) d.get(i5)).intValue()) {
                                f.remove(i7);
                                d.remove(i7);
                            } else {
                                i7++;
                            }
                        }
                        i5 = i6;
                    }
                    C6480e eVar = new C6480e();
                    m24636a(this, 0, eVar, 0, f, 0, 0, d, 53, null);
                    int[] iArr = new int[((int) m24634a(eVar))];
                    while (!eVar.mo16809j()) {
                        int i8 = i + 1;
                        iArr[i] = eVar.readInt();
                        i = i8;
                    }
                    Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                    C5942k.m22324a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new C6494p((C6485h[]) copyOf, iArr, null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    private C6494p(C6485h[] hVarArr, int[] iArr) {
        this.f16117g = hVarArr;
        this.f16118h = iArr;
    }

    public /* synthetic */ C6494p(C6485h[] hVarArr, int[] iArr, C5938g gVar) {
        this(hVarArr, iArr);
    }

    /* renamed from: a */
    public /* bridge */ boolean mo16891a(C6485h hVar) {
        return super.contains(hVar);
    }

    /* renamed from: b */
    public /* bridge */ int mo16892b(C6485h hVar) {
        return super.indexOf(hVar);
    }

    /* renamed from: c */
    public int mo15433c() {
        return this.f16117g.length;
    }

    /* renamed from: c */
    public /* bridge */ int mo16893c(C6485h hVar) {
        return super.lastIndexOf(hVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C6485h) {
            return mo16891a((C6485h) obj);
        }
        return false;
    }

    /* renamed from: d */
    public final C6485h[] mo16894d() {
        return this.f16117g;
    }

    /* renamed from: e */
    public final int[] mo16895e() {
        return this.f16118h;
    }

    public C6485h get(int i) {
        return this.f16117g[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C6485h) {
            return mo16892b((C6485h) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C6485h) {
            return mo16893c((C6485h) obj);
        }
        return -1;
    }
}
