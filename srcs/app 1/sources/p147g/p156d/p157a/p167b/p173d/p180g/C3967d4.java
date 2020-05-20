package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.d4 */
final class C3967d4 extends C3998f3<Double> implements C3914a5<Double>, C4182r6, RandomAccess {

    /* renamed from: g */
    private double[] f10906g;

    /* renamed from: h */
    private int f10907h;

    static {
        new C3967d4(new double[0], 0).mo12080n();
    }

    C3967d4() {
        this(new double[10], 0);
    }

    private C3967d4(double[] dArr, int i) {
        this.f10906g = dArr;
        this.f10907h = i;
    }

    /* renamed from: b */
    private final void m16201b(int i) {
        if (i < 0 || i >= this.f10907h) {
            throw new IndexOutOfBoundsException(m16202e(i));
        }
    }

    /* renamed from: e */
    private final String m16202e(int i) {
        int i2 = this.f10907h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C3914a5 mo12078a(int i) {
        if (i >= this.f10907h) {
            return new C3967d4(Arrays.copyOf(this.f10906g, i), this.f10907h);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo12329a(double d) {
        mo12447c();
        int i = this.f10907h;
        double[] dArr = this.f10906g;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f10906g = dArr2;
        }
        double[] dArr3 = this.f10906g;
        int i2 = this.f10907h;
        this.f10907h = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo12447c();
        if (i >= 0) {
            int i2 = this.f10907h;
            if (i <= i2) {
                double[] dArr = this.f10906g;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.f10906g, i, dArr2, i + 1, this.f10907h - i);
                    this.f10906g = dArr2;
                }
                this.f10906g[i] = doubleValue;
                this.f10907h++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16202e(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo12329a(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo12447c();
        C4248v4.m17304a(collection);
        if (!(collection instanceof C3967d4)) {
            return super.addAll(collection);
        }
        C3967d4 d4Var = (C3967d4) collection;
        int i = d4Var.f10907h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10907h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f10906g;
            if (i3 > dArr.length) {
                this.f10906g = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(d4Var.f10906g, 0, this.f10906g, this.f10907h, d4Var.f10907h);
            this.f10907h = i3;
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
        if (!(obj instanceof C3967d4)) {
            return super.equals(obj);
        }
        C3967d4 d4Var = (C3967d4) obj;
        if (this.f10907h != d4Var.f10907h) {
            return false;
        }
        double[] dArr = d4Var.f10906g;
        for (int i = 0; i < this.f10907h; i++) {
            if (Double.doubleToLongBits(this.f10906g[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16201b(i);
        return Double.valueOf(this.f10906g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10907h; i2++) {
            i = (i * 31) + C4248v4.m17302a(Double.doubleToLongBits(this.f10906g[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f10906g[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12447c();
        m16201b(i);
        double[] dArr = this.f10906g;
        double d = dArr[i];
        int i2 = this.f10907h;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f10907h--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo12447c();
        for (int i = 0; i < this.f10907h; i++) {
            if (obj.equals(Double.valueOf(this.f10906g[i]))) {
                double[] dArr = this.f10906g;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f10907h - i) - 1);
                this.f10907h--;
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
            double[] dArr = this.f10906g;
            System.arraycopy(dArr, i2, dArr, i, this.f10907h - i2);
            this.f10907h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo12447c();
        m16201b(i);
        double[] dArr = this.f10906g;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f10907h;
    }
}
