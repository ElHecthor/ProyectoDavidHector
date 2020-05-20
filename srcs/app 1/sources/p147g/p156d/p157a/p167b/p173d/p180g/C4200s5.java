package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.s5 */
final class C4200s5 extends C3998f3<Long> implements C3930b5, C4182r6, RandomAccess {

    /* renamed from: i */
    private static final C4200s5 f11290i;

    /* renamed from: g */
    private long[] f11291g;

    /* renamed from: h */
    private int f11292h;

    static {
        C4200s5 s5Var = new C4200s5(new long[0], 0);
        f11290i = s5Var;
        s5Var.mo12080n();
    }

    C4200s5() {
        this(new long[10], 0);
    }

    private C4200s5(long[] jArr, int i) {
        this.f11291g = jArr;
        this.f11292h = i;
    }

    /* renamed from: c */
    private final void m17107c(int i) {
        if (i < 0 || i >= this.f11292h) {
            throw new IndexOutOfBoundsException(m17109d(i));
        }
    }

    /* renamed from: d */
    public static C4200s5 m17108d() {
        return f11290i;
    }

    /* renamed from: d */
    private final String m17109d(int i) {
        int i2 = this.f11292h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo12787a(long j) {
        mo12447c();
        int i = this.f11292h;
        long[] jArr = this.f11291g;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f11291g = jArr2;
        }
        long[] jArr3 = this.f11291g;
        int i2 = this.f11292h;
        this.f11292h = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo12447c();
        if (i >= 0) {
            int i2 = this.f11292h;
            if (i <= i2) {
                long[] jArr = this.f11291g;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.f11291g, i, jArr2, i + 1, this.f11292h - i);
                    this.f11291g = jArr2;
                }
                this.f11291g[i] = longValue;
                this.f11292h++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m17109d(i));
    }

    public final /* synthetic */ boolean add(Object obj) {
        mo12787a(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo12447c();
        C4248v4.m17304a(collection);
        if (!(collection instanceof C4200s5)) {
            return super.addAll(collection);
        }
        C4200s5 s5Var = (C4200s5) collection;
        int i = s5Var.f11292h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11292h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f11291g;
            if (i3 > jArr.length) {
                this.f11291g = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(s5Var.f11291g, 0, this.f11291g, this.f11292h, s5Var.f11292h);
            this.f11292h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final long mo12109b(int i) {
        m17107c(i);
        return this.f11291g[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final C3930b5 mo12078a(int i) {
        if (i >= this.f11292h) {
            return new C4200s5(Arrays.copyOf(this.f11291g, i), this.f11292h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4200s5)) {
            return super.equals(obj);
        }
        C4200s5 s5Var = (C4200s5) obj;
        if (this.f11292h != s5Var.f11292h) {
            return false;
        }
        long[] jArr = s5Var.f11291g;
        for (int i = 0; i < this.f11292h; i++) {
            if (this.f11291g[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo12109b(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11292h; i2++) {
            i = (i * 31) + C4248v4.m17302a(this.f11291g[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f11291g[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12447c();
        m17107c(i);
        long[] jArr = this.f11291g;
        long j = jArr[i];
        int i2 = this.f11292h;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f11292h--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo12447c();
        for (int i = 0; i < this.f11292h; i++) {
            if (obj.equals(Long.valueOf(this.f11291g[i]))) {
                long[] jArr = this.f11291g;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f11292h - i) - 1);
                this.f11292h--;
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
            long[] jArr = this.f11291g;
            System.arraycopy(jArr, i2, jArr, i, this.f11292h - i2);
            this.f11292h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo12447c();
        m17107c(i);
        long[] jArr = this.f11291g;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f11292h;
    }
}
