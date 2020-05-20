package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
public class C0636h {

    /* renamed from: a */
    private static final Comparator<C0643g> f2604a = new C0637a();

    /* renamed from: androidx.recyclerview.widget.h$a */
    static class C0637a implements Comparator<C0643g> {
        C0637a() {
        }

        /* renamed from: a */
        public int compare(C0643g gVar, C0643g gVar2) {
            int i = gVar.f2619a - gVar2.f2619a;
            return i == 0 ? gVar.f2620b - gVar2.f2620b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public static abstract class C0638b {
        /* renamed from: a */
        public abstract int mo3824a();

        /* renamed from: a */
        public abstract boolean mo3825a(int i, int i2);

        /* renamed from: b */
        public abstract int mo3826b();

        /* renamed from: b */
        public abstract boolean mo3827b(int i, int i2);

        /* renamed from: c */
        public abstract Object mo3828c(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    public static class C0639c {

        /* renamed from: a */
        private final List<C0643g> f2605a;

        /* renamed from: b */
        private final int[] f2606b;

        /* renamed from: c */
        private final int[] f2607c;

        /* renamed from: d */
        private final C0638b f2608d;

        /* renamed from: e */
        private final int f2609e;

        /* renamed from: f */
        private final int f2610f;

        /* renamed from: g */
        private final boolean f2611g;

        C0639c(C0638b bVar, List<C0643g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f2605a = list;
            this.f2606b = iArr;
            this.f2607c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.f2607c, 0);
            this.f2608d = bVar;
            this.f2609e = bVar.mo3826b();
            this.f2610f = bVar.mo3824a();
            this.f2611g = z;
            m3630a();
            m3634b();
        }

        /* renamed from: a */
        private static C0641e m3629a(List<C0641e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0641e eVar = (C0641e) list.get(size);
                if (eVar.f2612a == i && eVar.f2614c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C0641e eVar2 = (C0641e) list.get(size);
                        eVar2.f2613b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m3630a() {
            C0643g gVar = this.f2605a.isEmpty() ? null : (C0643g) this.f2605a.get(0);
            if (gVar == null || gVar.f2619a != 0 || gVar.f2620b != 0) {
                C0643g gVar2 = new C0643g();
                gVar2.f2619a = 0;
                gVar2.f2620b = 0;
                gVar2.f2622d = false;
                gVar2.f2621c = 0;
                gVar2.f2623e = false;
                this.f2605a.add(0, gVar2);
            }
        }

        /* renamed from: a */
        private void m3631a(int i, int i2, int i3) {
            if (this.f2606b[i - 1] == 0) {
                m3633a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        private void m3632a(List<C0641e> list, C0659p pVar, int i, int i2, int i3) {
            if (!this.f2611g) {
                pVar.mo3813c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f2607c[i5] & 31;
                if (i6 == 0) {
                    pVar.mo3813c(i, 1);
                    for (C0641e eVar : list) {
                        eVar.f2613b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f2607c[i5] >> 5;
                    pVar.mo3812b(m3629a(list, i7, true).f2613b, i);
                    if (i6 == 4) {
                        pVar.mo3811a(i, 1, this.f2608d.mo3828c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C0641e(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: a */
        private boolean m3633a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0643g gVar = (C0643g) this.f2605a.get(i3);
                int i6 = gVar.f2619a;
                int i7 = gVar.f2621c;
                int i8 = i6 + i7;
                int i9 = gVar.f2620b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.f2608d.mo3827b(i11, i5)) {
                            if (!this.f2608d.mo3825a(i11, i5)) {
                                i10 = 4;
                            }
                            this.f2607c[i5] = (i11 << 5) | 16;
                            this.f2606b[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f2608d.mo3827b(i5, i12)) {
                            if (!this.f2608d.mo3825a(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f2606b[i13] = (i12 << 5) | 16;
                            this.f2607c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = gVar.f2619a;
                i2 = gVar.f2620b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m3634b() {
            int i = this.f2609e;
            int i2 = this.f2610f;
            for (int size = this.f2605a.size() - 1; size >= 0; size--) {
                C0643g gVar = (C0643g) this.f2605a.get(size);
                int i3 = gVar.f2619a;
                int i4 = gVar.f2621c;
                int i5 = i3 + i4;
                int i6 = gVar.f2620b + i4;
                if (this.f2611g) {
                    while (i > i5) {
                        m3631a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m3635b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < gVar.f2621c; i7++) {
                    int i8 = gVar.f2619a + i7;
                    int i9 = gVar.f2620b + i7;
                    int i10 = this.f2608d.mo3825a(i8, i9) ? 1 : 2;
                    this.f2606b[i8] = (i9 << 5) | i10;
                    this.f2607c[i9] = (i8 << 5) | i10;
                }
                i = gVar.f2619a;
                i2 = gVar.f2620b;
            }
        }

        /* renamed from: b */
        private void m3635b(int i, int i2, int i3) {
            if (this.f2607c[i2 - 1] == 0) {
                m3633a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m3636b(List<C0641e> list, C0659p pVar, int i, int i2, int i3) {
            if (!this.f2611g) {
                pVar.mo3810a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f2606b[i5] & 31;
                if (i6 == 0) {
                    pVar.mo3810a(i + i4, 1);
                    for (C0641e eVar : list) {
                        eVar.f2613b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f2606b[i5] >> 5;
                    C0641e a = m3629a(list, i7, false);
                    pVar.mo3812b(i + i4, a.f2613b - 1);
                    if (i6 == 4) {
                        pVar.mo3811a(a.f2613b - 1, 1, this.f2608d.mo3828c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C0641e(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: a */
        public int mo3886a(int i) {
            if (i < 0 || i >= this.f2609e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", old list size = ");
                sb.append(this.f2609e);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            int i2 = this.f2606b[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        /* renamed from: a */
        public void mo3887a(C0659p pVar) {
            C0621e eVar = pVar instanceof C0621e ? (C0621e) pVar : new C0621e(pVar);
            ArrayList arrayList = new ArrayList();
            int i = this.f2609e;
            int i2 = this.f2610f;
            for (int size = this.f2605a.size() - 1; size >= 0; size--) {
                C0643g gVar = (C0643g) this.f2605a.get(size);
                int i3 = gVar.f2621c;
                int i4 = gVar.f2619a + i3;
                int i5 = gVar.f2620b + i3;
                if (i4 < i) {
                    m3636b(arrayList, eVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m3632a(arrayList, eVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f2606b;
                    int i7 = gVar.f2619a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        eVar.mo3811a(i7 + i6, 1, this.f2608d.mo3828c(i7 + i6, gVar.f2620b + i6));
                    }
                }
                i = gVar.f2619a;
                i2 = gVar.f2620b;
            }
            eVar.mo3832a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    public static abstract class C0640d<T> {
        /* renamed from: a */
        public abstract boolean mo3888a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo3889b(T t, T t2);

        /* renamed from: c */
        public Object mo3890c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    private static class C0641e {

        /* renamed from: a */
        int f2612a;

        /* renamed from: b */
        int f2613b;

        /* renamed from: c */
        boolean f2614c;

        public C0641e(int i, int i2, boolean z) {
            this.f2612a = i;
            this.f2613b = i2;
            this.f2614c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$f */
    static class C0642f {

        /* renamed from: a */
        int f2615a;

        /* renamed from: b */
        int f2616b;

        /* renamed from: c */
        int f2617c;

        /* renamed from: d */
        int f2618d;

        public C0642f() {
        }

        public C0642f(int i, int i2, int i3, int i4) {
            this.f2615a = i;
            this.f2616b = i2;
            this.f2617c = i3;
            this.f2618d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$g */
    static class C0643g {

        /* renamed from: a */
        int f2619a;

        /* renamed from: b */
        int f2620b;

        /* renamed from: c */
        int f2621c;

        /* renamed from: d */
        boolean f2622d;

        /* renamed from: e */
        boolean f2623e;

        C0643g() {
        }
    }

    /* renamed from: a */
    public static C0639c m3620a(C0638b bVar) {
        return m3621a(bVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.C0636h.C0639c m3621a(androidx.recyclerview.widget.C0636h.C0638b r15, boolean r16) {
        /*
            int r0 = r15.mo3826b()
            int r1 = r15.mo3824a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.h$f r3 = new androidx.recyclerview.widget.h$f
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r3 = r3 + r0
            int r0 = r3 * 2
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.h$f r14 = (androidx.recyclerview.widget.C0636h.C0642f) r14
            int r6 = r14.f2615a
            int r7 = r14.f2616b
            int r8 = r14.f2617c
            int r9 = r14.f2618d
            r5 = r15
            r10 = r1
            r11 = r0
            r12 = r3
            androidx.recyclerview.widget.h$g r5 = m3622a(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.f2621c
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.f2619a
            int r7 = r14.f2615a
            int r6 = r6 + r7
            r5.f2619a = r6
            int r6 = r5.f2620b
            int r7 = r14.f2617c
            int r6 = r6 + r7
            r5.f2620b = r6
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x0074
            androidx.recyclerview.widget.h$f r6 = new androidx.recyclerview.widget.h$f
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r13.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r13.remove(r6)
            androidx.recyclerview.widget.h$f r6 = (androidx.recyclerview.widget.C0636h.C0642f) r6
        L_0x0080:
            int r7 = r14.f2615a
            r6.f2615a = r7
            int r7 = r14.f2617c
            r6.f2617c = r7
            boolean r7 = r5.f2623e
            if (r7 == 0) goto L_0x0095
            int r7 = r5.f2619a
        L_0x008e:
            r6.f2616b = r7
            int r7 = r5.f2620b
        L_0x0092:
            r6.f2618d = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.f2622d
            if (r7 == 0) goto L_0x009e
            int r7 = r5.f2619a
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.f2619a
            r6.f2616b = r7
            int r7 = r5.f2620b
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.f2623e
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.f2622d
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.f2619a
            int r7 = r5.f2621c
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.f2619a
            int r7 = r5.f2621c
            int r6 = r6 + r7
            r14.f2615a = r6
            int r5 = r5.f2620b
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.f2619a
            int r7 = r5.f2621c
            int r6 = r6 + r7
        L_0x00cc:
            r14.f2615a = r6
            int r5 = r5.f2620b
            int r5 = r5 + r7
        L_0x00d1:
            r14.f2617c = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r13.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<androidx.recyclerview.widget.h$g> r2 = f2604a
            java.util.Collections.sort(r4, r2)
            androidx.recyclerview.widget.h$c r8 = new androidx.recyclerview.widget.h$c
            r2 = r8
            r3 = r15
            r5 = r1
            r6 = r0
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0636h.m3621a(androidx.recyclerview.widget.h$b, boolean):androidx.recyclerview.widget.h$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C0636h.C0643g m3622a(androidx.recyclerview.widget.C0636h.C0638b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo3827b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.h$g r0 = new androidx.recyclerview.widget.h$g
            r0.<init>()
            r3 = r2[r5]
            r0.f2619a = r3
            int r3 = r3 - r12
            r0.f2620b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f2621c = r1
            r0.f2622d = r14
            r13 = 0
            r0.f2623e = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a0:
            r13 = 0
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = 1
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = 0
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.mo3827b(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.h$g r0 = new androidx.recyclerview.widget.h$g
            r0.<init>()
            r4 = r2[r3]
            r0.f2619a = r4
            int r4 = r4 - r10
            r0.f2620b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f2621c = r1
            r0.f2622d = r14
            r3 = 1
            r0.f2623e = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0636h.m3622a(androidx.recyclerview.widget.h$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.h$g");
    }
}
