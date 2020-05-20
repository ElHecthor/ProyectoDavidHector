package p071f.p088e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: f.e.b */
public final class C3164b<E> implements Collection<E>, Set<E> {

    /* renamed from: j */
    private static final int[] f8944j = new int[0];

    /* renamed from: k */
    private static final Object[] f8945k = new Object[0];

    /* renamed from: l */
    private static Object[] f8946l;

    /* renamed from: m */
    private static int f8947m;

    /* renamed from: n */
    private static Object[] f8948n;

    /* renamed from: o */
    private static int f8949o;

    /* renamed from: f */
    private int[] f8950f;

    /* renamed from: g */
    Object[] f8951g;

    /* renamed from: h */
    int f8952h;

    /* renamed from: i */
    private C3169f<E, E> f8953i;

    /* renamed from: f.e.b$a */
    class C3165a extends C3169f<E, E> {
        C3165a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo10153a(Object obj) {
            return C3164b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo10154a(int i, int i2) {
            return C3164b.this.f8951g[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo10155a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10156a() {
            C3164b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10157a(int i) {
            C3164b.this.mo10168d(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10158a(E e, E e2) {
            C3164b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo10159b(Object obj) {
            return C3164b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<E, E> mo10160b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo10161c() {
            return C3164b.this.f8952h;
        }
    }

    public C3164b() {
        this(0);
    }

    public C3164b(int i) {
        if (i == 0) {
            this.f8950f = f8944j;
            this.f8951g = f8945k;
        } else {
            m12777g(i);
        }
        this.f8952h = 0;
    }

    /* renamed from: a */
    private int m12773a(Object obj, int i) {
        int i2 = this.f8952h;
        if (i2 == 0) {
            return -1;
        }
        int a = C3166c.m12791a(this.f8950f, i2, i);
        if (a < 0 || obj.equals(this.f8951g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f8950f[i3] == i) {
            if (obj.equals(this.f8951g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f8950f[i4] == i) {
            if (obj.equals(this.f8951g[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private static void m12774a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3164b.class) {
                if (f8949o < 10) {
                    objArr[0] = f8948n;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8948n = objArr;
                    f8949o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3164b.class) {
                if (f8947m < 10) {
                    objArr[0] = f8946l;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8946l = objArr;
                    f8947m++;
                }
            }
        }
    }

    /* renamed from: c */
    private C3169f<E, E> m12775c() {
        if (this.f8953i == null) {
            this.f8953i = new C3165a();
        }
        return this.f8953i;
    }

    /* renamed from: d */
    private int m12776d() {
        int i = this.f8952h;
        if (i == 0) {
            return -1;
        }
        int a = C3166c.m12791a(this.f8950f, i, 0);
        if (a < 0 || this.f8951g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f8950f[i2] == 0) {
            if (this.f8951g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f8950f[i3] == 0) {
            if (this.f8951g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: g */
    private void m12777g(int i) {
        if (i == 8) {
            synchronized (C3164b.class) {
                if (f8948n != null) {
                    Object[] objArr = f8948n;
                    this.f8951g = objArr;
                    f8948n = (Object[]) objArr[0];
                    this.f8950f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8949o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3164b.class) {
                if (f8946l != null) {
                    Object[] objArr2 = f8946l;
                    this.f8951g = objArr2;
                    f8946l = (Object[]) objArr2[0];
                    this.f8950f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8947m--;
                    return;
                }
            }
        }
        this.f8950f = new int[i];
        this.f8951g = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m12776d();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m12773a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f8952h;
        if (i4 >= this.f8950f.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f8950f;
            Object[] objArr = this.f8951g;
            m12777g(i5);
            int[] iArr2 = this.f8950f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8951g, 0, objArr.length);
            }
            m12774a(iArr, objArr, this.f8952h);
        }
        int i6 = this.f8952h;
        if (i3 < i6) {
            int[] iArr3 = this.f8950f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f8951g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f8952h - i3);
        }
        this.f8950f[i3] = i;
        this.f8951g[i3] = e;
        this.f8952h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo10164c(this.f8952h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public void mo10164c(int i) {
        int[] iArr = this.f8950f;
        if (iArr.length < i) {
            Object[] objArr = this.f8951g;
            m12777g(i);
            int i2 = this.f8952h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f8950f, 0, i2);
                System.arraycopy(objArr, 0, this.f8951g, 0, this.f8952h);
            }
            m12774a(iArr, objArr, this.f8952h);
        }
    }

    public void clear() {
        int i = this.f8952h;
        if (i != 0) {
            m12774a(this.f8950f, this.f8951g, i);
            this.f8950f = f8944j;
            this.f8951g = f8945k;
            this.f8952h = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public E mo10168d(int i) {
        E[] eArr = this.f8951g;
        E e = eArr[i];
        int i2 = this.f8952h;
        if (i2 <= 1) {
            m12774a(this.f8950f, eArr, i2);
            this.f8950f = f8944j;
            this.f8951g = f8945k;
            this.f8952h = 0;
        } else {
            int[] iArr = this.f8950f;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.f8952h - 1;
                this.f8952h = i4;
                if (i < i4) {
                    int[] iArr2 = this.f8950f;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f8951g;
                    System.arraycopy(objArr, i5, objArr, i, this.f8952h - i);
                }
                this.f8951g[this.f8952h] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f8950f;
                Object[] objArr2 = this.f8951g;
                m12777g(i3);
                this.f8952h--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f8950f, 0, i);
                    System.arraycopy(objArr2, 0, this.f8951g, 0, i);
                }
                int i6 = this.f8952h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f8950f, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f8951g, i, this.f8952h - i);
                }
            }
        }
        return e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f8952h) {
                try {
                    if (!set.contains(mo10170f(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public E mo10170f(int i) {
        return this.f8951g[i];
    }

    public int hashCode() {
        int[] iArr = this.f8950f;
        int i = 0;
        for (int i2 = 0; i2 < this.f8952h; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        return obj == null ? m12776d() : m12773a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f8952h <= 0;
    }

    public Iterator<E> iterator() {
        return m12775c().mo10208e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo10168d(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f8952h - 1; i >= 0; i--) {
            if (!collection.contains(this.f8951g[i])) {
                mo10168d(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f8952h;
    }

    public Object[] toArray() {
        int i = this.f8952h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f8951g, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f8952h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f8952h);
        }
        System.arraycopy(this.f8951g, 0, tArr, 0, this.f8952h);
        int length = tArr.length;
        int i = this.f8952h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8952h * 14);
        sb.append('{');
        for (int i = 0; i < this.f8952h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object f = mo10170f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
