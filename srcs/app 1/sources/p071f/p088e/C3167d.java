package p071f.p088e;

/* renamed from: f.e.d */
public class C3167d<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f8958j = new Object();

    /* renamed from: f */
    private boolean f8959f;

    /* renamed from: g */
    private long[] f8960g;

    /* renamed from: h */
    private Object[] f8961h;

    /* renamed from: i */
    private int f8962i;

    public C3167d() {
        this(10);
    }

    public C3167d(int i) {
        this.f8959f = false;
        if (i == 0) {
            this.f8960g = C3166c.f8956b;
            this.f8961h = C3166c.f8957c;
            return;
        }
        int c = C3166c.m12795c(i);
        this.f8960g = new long[c];
        this.f8961h = new Object[c];
    }

    /* renamed from: e */
    private void m12796e() {
        int i = this.f8962i;
        long[] jArr = this.f8960g;
        Object[] objArr = this.f8961h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8958j) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8959f = false;
        this.f8962i = i2;
    }

    /* renamed from: a */
    public long mo10182a(int i) {
        if (this.f8959f) {
            m12796e();
        }
        return this.f8960g[i];
    }

    /* renamed from: a */
    public void mo10183a(long j, E e) {
        int i = this.f8962i;
        if (i == 0 || j > this.f8960g[i - 1]) {
            if (this.f8959f && this.f8962i >= this.f8960g.length) {
                m12796e();
            }
            int i2 = this.f8962i;
            if (i2 >= this.f8960g.length) {
                int c = C3166c.m12795c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f8960g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f8961h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8960g = jArr;
                this.f8961h = objArr;
            }
            this.f8960g[i2] = j;
            this.f8961h[i2] = e;
            this.f8962i = i2 + 1;
            return;
        }
        mo10191c(j, e);
    }

    /* renamed from: a */
    public boolean mo10184a(long j) {
        return mo10195d(j) >= 0;
    }

    /* renamed from: b */
    public E mo10185b(long j, E e) {
        int a = C3166c.m12792a(this.f8960g, this.f8962i, j);
        if (a >= 0) {
            E[] eArr = this.f8961h;
            if (eArr[a] != f8958j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void mo10186b() {
        int i = this.f8962i;
        Object[] objArr = this.f8961h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8962i = 0;
        this.f8959f = false;
    }

    /* renamed from: b */
    public void mo10187b(int i) {
        Object[] objArr = this.f8961h;
        Object obj = objArr[i];
        Object obj2 = f8958j;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f8959f = true;
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo10188b(long j) {
        mo10196e(j);
    }

    /* renamed from: c */
    public E mo10189c(int i) {
        if (this.f8959f) {
            m12796e();
        }
        return this.f8961h[i];
    }

    /* renamed from: c */
    public E mo10190c(long j) {
        return mo10185b(j, null);
    }

    /* renamed from: c */
    public void mo10191c(long j, E e) {
        int a = C3166c.m12792a(this.f8960g, this.f8962i, j);
        if (a >= 0) {
            this.f8961h[a] = e;
        } else {
            int i = ~a;
            if (i < this.f8962i) {
                Object[] objArr = this.f8961h;
                if (objArr[i] == f8958j) {
                    this.f8960g[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f8959f && this.f8962i >= this.f8960g.length) {
                m12796e();
                i = ~C3166c.m12792a(this.f8960g, this.f8962i, j);
            }
            int i2 = this.f8962i;
            if (i2 >= this.f8960g.length) {
                int c = C3166c.m12795c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr2 = new Object[c];
                long[] jArr2 = this.f8960g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f8961h;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f8960g = jArr;
                this.f8961h = objArr2;
            }
            int i3 = this.f8962i;
            if (i3 - i != 0) {
                long[] jArr3 = this.f8960g;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.f8961h;
                System.arraycopy(objArr4, i, objArr4, i4, this.f8962i - i);
            }
            this.f8960g[i] = j;
            this.f8961h[i] = e;
            this.f8962i++;
        }
    }

    /* renamed from: c */
    public boolean mo10192c() {
        return mo10194d() == 0;
    }

    public C3167d<E> clone() {
        try {
            C3167d<E> dVar = (C3167d) super.clone();
            dVar.f8960g = (long[]) this.f8960g.clone();
            dVar.f8961h = (Object[]) this.f8961h.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public int mo10194d() {
        if (this.f8959f) {
            m12796e();
        }
        return this.f8962i;
    }

    /* renamed from: d */
    public int mo10195d(long j) {
        if (this.f8959f) {
            m12796e();
        }
        return C3166c.m12792a(this.f8960g, this.f8962i, j);
    }

    /* renamed from: e */
    public void mo10196e(long j) {
        int a = C3166c.m12792a(this.f8960g, this.f8962i, j);
        if (a >= 0) {
            Object[] objArr = this.f8961h;
            Object obj = objArr[a];
            Object obj2 = f8958j;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f8959f = true;
            }
        }
    }

    public String toString() {
        if (mo10194d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8962i * 28);
        sb.append('{');
        for (int i = 0; i < this.f8962i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo10182a(i));
            sb.append('=');
            Object c = mo10189c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
