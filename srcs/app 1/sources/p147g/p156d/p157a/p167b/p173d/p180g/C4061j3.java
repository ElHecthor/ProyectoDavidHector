package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.j3 */
final class C4061j3 extends C3998f3<Boolean> implements C3914a5<Boolean>, C4182r6, RandomAccess {

    /* renamed from: g */
    private boolean[] f11041g;

    /* renamed from: h */
    private int f11042h;

    static {
        new C4061j3(new boolean[0], 0).mo12080n();
    }

    C4061j3() {
        this(new boolean[10], 0);
    }

    private C4061j3(boolean[] zArr, int i) {
        this.f11041g = zArr;
        this.f11042h = i;
    }

    /* renamed from: b */
    private final void m16655b(int i) {
        if (i < 0 || i >= this.f11042h) {
            throw new IndexOutOfBoundsException(m16656e(i));
        }
    }

    /* renamed from: e */
    private final String m16656e(int i) {
        int i2 = this.f11042h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C3914a5 mo12078a(int i) {
        if (i >= this.f11042h) {
            return new C4061j3(Arrays.copyOf(this.f11041g, i), this.f11042h);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo12562a(boolean z) {
        mo12447c();
        int i = this.f11042h;
        boolean[] zArr = this.f11041g;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f11041g = zArr2;
        }
        boolean[] zArr3 = this.f11041g;
        int i2 = this.f11042h;
        this.f11042h = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo12447c();
        if (i >= 0) {
            int i2 = this.f11042h;
            if (i <= i2) {
                boolean[] zArr = this.f11041g;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.f11041g, i, zArr2, i + 1, this.f11042h - i);
                    this.f11041g = zArr2;
                }
                this.f11041g[i] = booleanValue;
                this.f11042h++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16656e(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo12562a(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo12447c();
        C4248v4.m17304a(collection);
        if (!(collection instanceof C4061j3)) {
            return super.addAll(collection);
        }
        C4061j3 j3Var = (C4061j3) collection;
        int i = j3Var.f11042h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11042h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f11041g;
            if (i3 > zArr.length) {
                this.f11041g = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(j3Var.f11041g, 0, this.f11041g, this.f11042h, j3Var.f11042h);
            this.f11042h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4061j3)) {
            return super.equals(obj);
        }
        C4061j3 j3Var = (C4061j3) obj;
        if (this.f11042h != j3Var.f11042h) {
            return false;
        }
        boolean[] zArr = j3Var.f11041g;
        for (int i = 0; i < this.f11042h; i++) {
            if (this.f11041g[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16655b(i);
        return Boolean.valueOf(this.f11041g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11042h; i2++) {
            i = (i * 31) + C4248v4.m17303a(this.f11041g[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f11041g[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12447c();
        m16655b(i);
        boolean[] zArr = this.f11041g;
        boolean z = zArr[i];
        int i2 = this.f11042h;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f11042h--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo12447c();
        for (int i = 0; i < this.f11042h; i++) {
            if (obj.equals(Boolean.valueOf(this.f11041g[i]))) {
                boolean[] zArr = this.f11041g;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f11042h - i) - 1);
                this.f11042h--;
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
            boolean[] zArr = this.f11041g;
            System.arraycopy(zArr, i2, zArr, i, this.f11042h - i2);
            this.f11042h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo12447c();
        m16655b(i);
        boolean[] zArr = this.f11041g;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f11042h;
    }
}
