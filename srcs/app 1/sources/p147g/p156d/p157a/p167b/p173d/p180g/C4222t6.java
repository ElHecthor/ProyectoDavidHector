package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.t6 */
final class C4222t6<E> extends C3998f3<E> implements RandomAccess {

    /* renamed from: i */
    private static final C4222t6<Object> f11328i;

    /* renamed from: g */
    private E[] f11329g;

    /* renamed from: h */
    private int f11330h;

    static {
        C4222t6<Object> t6Var = new C4222t6<>(new Object[0], 0);
        f11328i = t6Var;
        t6Var.mo12080n();
    }

    private C4222t6(E[] eArr, int i) {
        this.f11329g = eArr;
        this.f11330h = i;
    }

    /* renamed from: b */
    private final void m17192b(int i) {
        if (i < 0 || i >= this.f11330h) {
            throw new IndexOutOfBoundsException(m17194e(i));
        }
    }

    /* renamed from: d */
    public static <E> C4222t6<E> m17193d() {
        return f11328i;
    }

    /* renamed from: e */
    private final String m17194e(int i) {
        int i2 = this.f11330h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C3914a5 mo12078a(int i) {
        if (i >= this.f11330h) {
            return new C4222t6(Arrays.copyOf(this.f11329g, i), this.f11330h);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i, E e) {
        mo12447c();
        if (i >= 0) {
            int i2 = this.f11330h;
            if (i <= i2) {
                E[] eArr = this.f11329g;
                if (i2 < eArr.length) {
                    System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
                } else {
                    E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(eArr, 0, eArr2, 0, i);
                    System.arraycopy(this.f11329g, i, eArr2, i + 1, this.f11330h - i);
                    this.f11329g = eArr2;
                }
                this.f11329g[i] = e;
                this.f11330h++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17194e(i));
    }

    public final boolean add(E e) {
        mo12447c();
        int i = this.f11330h;
        E[] eArr = this.f11329g;
        if (i == eArr.length) {
            this.f11329g = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f11329g;
        int i2 = this.f11330h;
        this.f11330h = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public final E get(int i) {
        m17192b(i);
        return this.f11329g[i];
    }

    public final E remove(int i) {
        mo12447c();
        m17192b(i);
        E[] eArr = this.f11329g;
        E e = eArr[i];
        int i2 = this.f11330h;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f11330h--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo12447c();
        m17192b(i);
        E[] eArr = this.f11329g;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f11330h;
    }
}
