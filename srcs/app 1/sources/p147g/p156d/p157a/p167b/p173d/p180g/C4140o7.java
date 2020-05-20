package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4219e;

/* renamed from: g.d.a.b.d.g.o7 */
public final class C4140o7 {

    /* renamed from: f */
    private static final C4140o7 f11208f = new C4140o7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f11209a;

    /* renamed from: b */
    private int[] f11210b;

    /* renamed from: c */
    private Object[] f11211c;

    /* renamed from: d */
    private int f11212d;

    /* renamed from: e */
    private boolean f11213e;

    private C4140o7() {
        this(0, new int[8], new Object[8], true);
    }

    private C4140o7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f11212d = -1;
        this.f11209a = i;
        this.f11210b = iArr;
        this.f11211c = objArr;
        this.f11213e = z;
    }

    /* renamed from: a */
    static C4140o7 m16893a(C4140o7 o7Var, C4140o7 o7Var2) {
        int i = o7Var.f11209a + o7Var2.f11209a;
        int[] copyOf = Arrays.copyOf(o7Var.f11210b, i);
        System.arraycopy(o7Var2.f11210b, 0, copyOf, o7Var.f11209a, o7Var2.f11209a);
        Object[] copyOf2 = Arrays.copyOf(o7Var.f11211c, i);
        System.arraycopy(o7Var2.f11211c, 0, copyOf2, o7Var.f11209a, o7Var2.f11209a);
        return new C4140o7(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    private static void m16894a(int i, Object obj, C4051i8 i8Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            i8Var.mo12417e(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            i8Var.mo12411c(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            i8Var.mo12394a(i2, (C4092l3) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                i8Var.mo12416e(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C3968d5.m16208d());
        } else if (i8Var.mo12388a() == C4219e.f11325k) {
            i8Var.mo12389a(i2);
            ((C4140o7) obj).mo12696b(i8Var);
            i8Var.mo12403b(i2);
        } else {
            i8Var.mo12403b(i2);
            ((C4140o7) obj).mo12696b(i8Var);
            i8Var.mo12389a(i2);
        }
    }

    /* renamed from: d */
    public static C4140o7 m16895d() {
        return f11208f;
    }

    /* renamed from: e */
    static C4140o7 m16896e() {
        return new C4140o7();
    }

    /* renamed from: a */
    public final void mo12691a() {
        this.f11213e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12692a(int i, Object obj) {
        if (this.f11213e) {
            int i2 = this.f11209a;
            if (i2 == this.f11210b.length) {
                int i3 = this.f11209a + (i2 < 4 ? 8 : i2 >> 1);
                this.f11210b = Arrays.copyOf(this.f11210b, i3);
                this.f11211c = Arrays.copyOf(this.f11211c, i3);
            }
            int[] iArr = this.f11210b;
            int i4 = this.f11209a;
            iArr[i4] = i;
            this.f11211c[i4] = obj;
            this.f11209a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12693a(C4051i8 i8Var) {
        if (i8Var.mo12388a() == C4219e.f11326l) {
            for (int i = this.f11209a - 1; i >= 0; i--) {
                i8Var.mo12396a(this.f11210b[i] >>> 3, this.f11211c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f11209a; i2++) {
            i8Var.mo12396a(this.f11210b[i2] >>> 3, this.f11211c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12694a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f11209a; i2++) {
            C4002f6.m16373a(sb, i, String.valueOf(this.f11210b[i2] >>> 3), this.f11211c[i2]);
        }
    }

    /* renamed from: b */
    public final int mo12695b() {
        int i = this.f11212d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f11209a; i3++) {
            i2 += C3945c4.m16036d(this.f11210b[i3] >>> 3, (C4092l3) this.f11211c[i3]);
        }
        this.f11212d = i2;
        return i2;
    }

    /* renamed from: b */
    public final void mo12696b(C4051i8 i8Var) {
        if (this.f11209a != 0) {
            if (i8Var.mo12388a() == C4219e.f11325k) {
                for (int i = 0; i < this.f11209a; i++) {
                    m16894a(this.f11210b[i], this.f11211c[i], i8Var);
                }
                return;
            }
            for (int i2 = this.f11209a - 1; i2 >= 0; i2--) {
                m16894a(this.f11210b[i2], this.f11211c[i2], i8Var);
            }
        }
    }

    /* renamed from: c */
    public final int mo12697c() {
        int i;
        int i2 = this.f11212d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11209a; i4++) {
            int i5 = this.f11210b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C3945c4.m16039e(i6, ((Long) this.f11211c[i4]).longValue());
            } else if (i7 == 1) {
                i = C3945c4.m16047g(i6, ((Long) this.f11211c[i4]).longValue());
            } else if (i7 == 2) {
                i = C3945c4.m16032c(i6, (C4092l3) this.f11211c[i4]);
            } else if (i7 == 3) {
                i = (C3945c4.m16038e(i6) << 1) + ((C4140o7) this.f11211c[i4]).mo12697c();
            } else if (i7 == 5) {
                i = C3945c4.m16054i(i6, ((Integer) this.f11211c[i4]).intValue());
            } else {
                throw new IllegalStateException(C3968d5.m16208d());
            }
            i3 += i;
        }
        this.f11212d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4140o7)) {
            return false;
        }
        C4140o7 o7Var = (C4140o7) obj;
        int i = this.f11209a;
        if (i == o7Var.f11209a) {
            int[] iArr = this.f11210b;
            int[] iArr2 = o7Var.f11210b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f11211c;
                Object[] objArr2 = o7Var.f11211c;
                int i3 = this.f11209a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f11209a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f11210b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f11211c;
        for (int i7 = 0; i7 < this.f11209a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }
}
