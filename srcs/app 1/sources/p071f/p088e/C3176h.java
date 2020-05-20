package p071f.p088e;

/* renamed from: f.e.h */
public class C3176h<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f8993j = new Object();

    /* renamed from: f */
    private boolean f8994f;

    /* renamed from: g */
    private int[] f8995g;

    /* renamed from: h */
    private Object[] f8996h;

    /* renamed from: i */
    private int f8997i;

    public C3176h() {
        this(10);
    }

    public C3176h(int i) {
        this.f8994f = false;
        if (i == 0) {
            this.f8995g = C3166c.f8955a;
            this.f8996h = C3166c.f8957c;
            return;
        }
        int b = C3166c.m12794b(i);
        this.f8995g = new int[b];
        this.f8996h = new Object[b];
    }

    /* renamed from: d */
    private void m12850d() {
        int i = this.f8997i;
        int[] iArr = this.f8995g;
        Object[] objArr = this.f8996h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8993j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8994f = false;
        this.f8997i = i2;
    }

    /* renamed from: a */
    public int mo10286a(E e) {
        if (this.f8994f) {
            m12850d();
        }
        for (int i = 0; i < this.f8997i; i++) {
            if (this.f8996h[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public E mo10287a(int i) {
        return mo10290b(i, null);
    }

    /* renamed from: a */
    public void mo10288a(int i, E e) {
        int i2 = this.f8997i;
        if (i2 == 0 || i > this.f8995g[i2 - 1]) {
            if (this.f8994f && this.f8997i >= this.f8995g.length) {
                m12850d();
            }
            int i3 = this.f8997i;
            if (i3 >= this.f8995g.length) {
                int b = C3166c.m12794b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f8995g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f8996h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8995g = iArr;
                this.f8996h = objArr;
            }
            this.f8995g[i3] = i;
            this.f8996h[i3] = e;
            this.f8997i = i3 + 1;
            return;
        }
        mo10294c(i, e);
    }

    /* renamed from: b */
    public int mo10289b(int i) {
        if (this.f8994f) {
            m12850d();
        }
        return C3166c.m12791a(this.f8995g, this.f8997i, i);
    }

    /* renamed from: b */
    public E mo10290b(int i, E e) {
        int a = C3166c.m12791a(this.f8995g, this.f8997i, i);
        if (a >= 0) {
            E[] eArr = this.f8996h;
            if (eArr[a] != f8993j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void mo10291b() {
        int i = this.f8997i;
        Object[] objArr = this.f8996h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8997i = 0;
        this.f8994f = false;
    }

    /* renamed from: c */
    public int mo10292c() {
        if (this.f8994f) {
            m12850d();
        }
        return this.f8997i;
    }

    /* renamed from: c */
    public int mo10293c(int i) {
        if (this.f8994f) {
            m12850d();
        }
        return this.f8995g[i];
    }

    /* renamed from: c */
    public void mo10294c(int i, E e) {
        int a = C3166c.m12791a(this.f8995g, this.f8997i, i);
        if (a >= 0) {
            this.f8996h[a] = e;
        } else {
            int i2 = ~a;
            if (i2 < this.f8997i) {
                Object[] objArr = this.f8996h;
                if (objArr[i2] == f8993j) {
                    this.f8995g[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f8994f && this.f8997i >= this.f8995g.length) {
                m12850d();
                i2 = ~C3166c.m12791a(this.f8995g, this.f8997i, i);
            }
            int i3 = this.f8997i;
            if (i3 >= this.f8995g.length) {
                int b = C3166c.m12794b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr2 = new Object[b];
                int[] iArr2 = this.f8995g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f8996h;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f8995g = iArr;
                this.f8996h = objArr2;
            }
            int i4 = this.f8997i;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.f8995g;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.f8996h;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f8997i - i2);
            }
            this.f8995g[i2] = i;
            this.f8996h[i2] = e;
            this.f8997i++;
        }
    }

    public C3176h<E> clone() {
        try {
            C3176h<E> hVar = (C3176h) super.clone();
            hVar.f8995g = (int[]) this.f8995g.clone();
            hVar.f8996h = (Object[]) this.f8996h.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public void mo10296d(int i) {
        int a = C3166c.m12791a(this.f8995g, this.f8997i, i);
        if (a >= 0) {
            Object[] objArr = this.f8996h;
            Object obj = objArr[a];
            Object obj2 = f8993j;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f8994f = true;
            }
        }
    }

    /* renamed from: e */
    public E mo10297e(int i) {
        if (this.f8994f) {
            m12850d();
        }
        return this.f8996h[i];
    }

    public String toString() {
        if (mo10292c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8997i * 28);
        sb.append('{');
        for (int i = 0; i < this.f8997i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo10293c(i));
            sb.append('=');
            Object e = mo10297e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
