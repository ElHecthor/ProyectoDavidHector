package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.s4 */
final class C4199s4 extends C3998f3<Float> implements C3914a5<Float>, C4182r6, RandomAccess {

    /* renamed from: g */
    private float[] f11288g;

    /* renamed from: h */
    private int f11289h;

    static {
        new C4199s4(new float[0], 0).mo12080n();
    }

    C4199s4() {
        this(new float[10], 0);
    }

    private C4199s4(float[] fArr, int i) {
        this.f11288g = fArr;
        this.f11289h = i;
    }

    /* renamed from: b */
    private final void m17103b(int i) {
        if (i < 0 || i >= this.f11289h) {
            throw new IndexOutOfBoundsException(m17104e(i));
        }
    }

    /* renamed from: e */
    private final String m17104e(int i) {
        int i2 = this.f11289h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C3914a5 mo12078a(int i) {
        if (i >= this.f11289h) {
            return new C4199s4(Arrays.copyOf(this.f11288g, i), this.f11289h);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo12778a(float f) {
        mo12447c();
        int i = this.f11289h;
        float[] fArr = this.f11288g;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f11288g = fArr2;
        }
        float[] fArr3 = this.f11288g;
        int i2 = this.f11289h;
        this.f11289h = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo12447c();
        if (i >= 0) {
            int i2 = this.f11289h;
            if (i <= i2) {
                float[] fArr = this.f11288g;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.f11288g, i, fArr2, i + 1, this.f11289h - i);
                    this.f11288g = fArr2;
                }
                this.f11288g[i] = floatValue;
                this.f11289h++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17104e(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo12778a(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo12447c();
        C4248v4.m17304a(collection);
        if (!(collection instanceof C4199s4)) {
            return super.addAll(collection);
        }
        C4199s4 s4Var = (C4199s4) collection;
        int i = s4Var.f11289h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11289h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f11288g;
            if (i3 > fArr.length) {
                this.f11288g = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(s4Var.f11288g, 0, this.f11288g, this.f11289h, s4Var.f11289h);
            this.f11289h = i3;
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
        if (!(obj instanceof C4199s4)) {
            return super.equals(obj);
        }
        C4199s4 s4Var = (C4199s4) obj;
        if (this.f11289h != s4Var.f11289h) {
            return false;
        }
        float[] fArr = s4Var.f11288g;
        for (int i = 0; i < this.f11289h; i++) {
            if (Float.floatToIntBits(this.f11288g[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m17103b(i);
        return Float.valueOf(this.f11288g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11289h; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f11288g[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f11288g[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12447c();
        m17103b(i);
        float[] fArr = this.f11288g;
        float f = fArr[i];
        int i2 = this.f11289h;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f11289h--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo12447c();
        for (int i = 0; i < this.f11289h; i++) {
            if (obj.equals(Float.valueOf(this.f11288g[i]))) {
                float[] fArr = this.f11288g;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f11289h - i) - 1);
                this.f11289h--;
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
            float[] fArr = this.f11288g;
            System.arraycopy(fArr, i2, fArr, i, this.f11289h - i2);
            this.f11289h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo12447c();
        m17103b(i);
        float[] fArr = this.f11288g;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f11289h;
    }
}
