package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.w4 */
final class C4263w4 extends C3998f3<Integer> implements C4294y4, C4182r6, RandomAccess {

    /* renamed from: i */
    private static final C4263w4 f11413i;

    /* renamed from: g */
    private int[] f11414g;

    /* renamed from: h */
    private int f11415h;

    static {
        C4263w4 w4Var = new C4263w4(new int[0], 0);
        f11413i = w4Var;
        w4Var.mo12080n();
    }

    C4263w4() {
        this(new int[10], 0);
    }

    private C4263w4(int[] iArr, int i) {
        this.f11414g = iArr;
        this.f11415h = i;
    }

    /* renamed from: d */
    public static C4263w4 m17443d() {
        return f11413i;
    }

    /* renamed from: d */
    private final void m17444d(int i) {
        if (i < 0 || i >= this.f11415h) {
            throw new IndexOutOfBoundsException(m17445f(i));
        }
    }

    /* renamed from: f */
    private final String m17445f(int i) {
        int i2 = this.f11415h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo12447c();
        if (i >= 0) {
            int i2 = this.f11415h;
            if (i <= i2) {
                int[] iArr = this.f11414g;
                if (i2 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                } else {
                    int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.f11414g, i, iArr2, i + 1, this.f11415h - i);
                    this.f11414g = iArr2;
                }
                this.f11414g[i] = intValue;
                this.f11415h++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17445f(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo12888c(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo12447c();
        C4248v4.m17304a(collection);
        if (!(collection instanceof C4263w4)) {
            return super.addAll(collection);
        }
        C4263w4 w4Var = (C4263w4) collection;
        int i = w4Var.f11415h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11415h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f11414g;
            if (i3 > iArr.length) {
                this.f11414g = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(w4Var.f11414g, 0, this.f11414g, this.f11415h, w4Var.f11415h);
            this.f11415h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final C4294y4 mo12078a(int i) {
        if (i >= this.f11415h) {
            return new C4263w4(Arrays.copyOf(this.f11414g, i), this.f11415h);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo12888c(int i) {
        mo12447c();
        int i2 = this.f11415h;
        int[] iArr = this.f11414g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f11414g = iArr2;
        }
        int[] iArr3 = this.f11414g;
        int i3 = this.f11415h;
        this.f11415h = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int mo12890e(int i) {
        m17444d(i);
        return this.f11414g[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4263w4)) {
            return super.equals(obj);
        }
        C4263w4 w4Var = (C4263w4) obj;
        if (this.f11415h != w4Var.f11415h) {
            return false;
        }
        int[] iArr = w4Var.f11414g;
        for (int i = 0; i < this.f11415h; i++) {
            if (this.f11414g[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo12890e(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11415h; i2++) {
            i = (i * 31) + this.f11414g[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f11414g[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12447c();
        m17444d(i);
        int[] iArr = this.f11414g;
        int i2 = iArr[i];
        int i3 = this.f11415h;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f11415h--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo12447c();
        for (int i = 0; i < this.f11415h; i++) {
            if (obj.equals(Integer.valueOf(this.f11414g[i]))) {
                int[] iArr = this.f11414g;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f11415h - i) - 1);
                this.f11415h--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo12447c();
        if (i2 >= i) {
            int[] iArr = this.f11414g;
            System.arraycopy(iArr, i2, iArr, i, this.f11415h - i2);
            this.f11415h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo12447c();
        m17444d(i);
        int[] iArr = this.f11414g;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f11415h;
    }
}
