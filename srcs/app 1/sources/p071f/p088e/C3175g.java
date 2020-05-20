package p071f.p088e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: f.e.g */
public class C3175g<K, V> {

    /* renamed from: i */
    static Object[] f8986i;

    /* renamed from: j */
    static int f8987j;

    /* renamed from: k */
    static Object[] f8988k;

    /* renamed from: l */
    static int f8989l;

    /* renamed from: f */
    int[] f8990f;

    /* renamed from: g */
    Object[] f8991g;

    /* renamed from: h */
    int f8992h;

    public C3175g() {
        this.f8990f = C3166c.f8955a;
        this.f8991g = C3166c.f8957c;
        this.f8992h = 0;
    }

    public C3175g(int i) {
        if (i == 0) {
            this.f8990f = C3166c.f8955a;
            this.f8991g = C3166c.f8957c;
        } else {
            m12839e(i);
        }
        this.f8992h = 0;
    }

    public C3175g(C3175g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo5346a(gVar);
        }
    }

    /* renamed from: a */
    private static int m12837a(int[] iArr, int i, int i2) {
        try {
            return C3166c.m12791a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m12838a(int[] iArr, Object[] objArr, int i) {
        Class<C3175g> cls = C3175g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f8989l < 10) {
                    objArr[0] = f8988k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8988k = objArr;
                    f8989l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f8987j < 10) {
                    objArr[0] = f8986i;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8986i = objArr;
                    f8987j++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m12839e(int i) {
        Class<C3175g> cls = C3175g.class;
        if (i == 8) {
            synchronized (cls) {
                if (f8988k != null) {
                    Object[] objArr = f8988k;
                    this.f8991g = objArr;
                    f8988k = (Object[]) objArr[0];
                    this.f8990f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8989l--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f8986i != null) {
                    Object[] objArr2 = f8986i;
                    this.f8991g = objArr2;
                    f8986i = (Object[]) objArr2[0];
                    this.f8990f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8987j--;
                    return;
                }
            }
        }
        this.f8990f = new int[i];
        this.f8991g = new Object[(i << 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo10266a() {
        int i = this.f8992h;
        if (i == 0) {
            return -1;
        }
        int a = m12837a(this.f8990f, i, 0);
        if (a < 0 || this.f8991g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f8990f[i2] == 0) {
            if (this.f8991g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f8990f[i3] == 0) {
            if (this.f8991g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    public int mo10267a(Object obj) {
        return obj == null ? mo10266a() : mo10268a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo10268a(Object obj, int i) {
        int i2 = this.f8992h;
        if (i2 == 0) {
            return -1;
        }
        int a = m12837a(this.f8990f, i2, i);
        if (a < 0 || obj.equals(this.f8991g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f8990f[i3] == i) {
            if (obj.equals(this.f8991g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f8990f[i4] == i) {
            if (obj.equals(this.f8991g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    public V mo5345a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f8991g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo10269a(int i) {
        int i2 = this.f8992h;
        int[] iArr = this.f8990f;
        if (iArr.length < i) {
            Object[] objArr = this.f8991g;
            m12839e(i);
            if (this.f8992h > 0) {
                System.arraycopy(iArr, 0, this.f8990f, 0, i2);
                System.arraycopy(objArr, 0, this.f8991g, 0, i2 << 1);
            }
            m12838a(iArr, objArr, i2);
        }
        if (this.f8992h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo5346a(C3175g<? extends K, ? extends V> gVar) {
        int i = gVar.f8992h;
        mo10269a(this.f8992h + i);
        if (this.f8992h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo10271b(i2), gVar.mo10274d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f8990f, 0, this.f8990f, 0, i);
            System.arraycopy(gVar.f8991g, 0, this.f8991g, 0, i << 1);
            this.f8992h = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo10270b(Object obj) {
        int i = this.f8992h * 2;
        Object[] objArr = this.f8991g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo10271b(int i) {
        return this.f8991g[i << 1];
    }

    /* renamed from: c */
    public V mo5347c(int i) {
        V[] vArr = this.f8991g;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f8992h;
        int i4 = 0;
        if (i3 <= 1) {
            m12838a(this.f8990f, (Object[]) vArr, i3);
            this.f8990f = C3166c.f8955a;
            this.f8991g = C3166c.f8957c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f8990f;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f8990f;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.f8991g;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f8991g;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f8990f;
                Object[] objArr3 = this.f8991g;
                m12839e(i6);
                if (i3 == this.f8992h) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f8990f, 0, i);
                        System.arraycopy(objArr3, 0, this.f8991g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.f8990f, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.f8991g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f8992h) {
            this.f8992h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f8992h;
        if (i > 0) {
            int[] iArr = this.f8990f;
            Object[] objArr = this.f8991g;
            this.f8990f = C3166c.f8955a;
            this.f8991g = C3166c.f8957c;
            this.f8992h = 0;
            m12838a(iArr, objArr, i);
        }
        if (this.f8992h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo10267a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo10270b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo10274d(int i) {
        return this.f8991g[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3175g) {
            C3175g gVar = (C3175g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f8992h) {
                try {
                    Object b = mo10271b(i);
                    Object d = mo10274d(i);
                    Object obj2 = gVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !gVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f8992h) {
                try {
                    Object b2 = mo10271b(i2);
                    Object d2 = mo10274d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a = mo10267a(obj);
        return a >= 0 ? this.f8991g[(a << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f8990f;
        Object[] objArr = this.f8991g;
        int i = this.f8992h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f8992h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f8992h;
        if (k == null) {
            i2 = mo10266a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo10268a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f8991g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f8990f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f8990f;
            Object[] objArr = this.f8991g;
            m12839e(i6);
            if (i3 == this.f8992h) {
                int[] iArr2 = this.f8990f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f8991g, 0, objArr.length);
                }
                m12838a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f8990f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f8991g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f8992h - i5) << 1);
        }
        int i8 = this.f8992h;
        if (i3 == i8) {
            int[] iArr4 = this.f8990f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f8991g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f8992h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int a = mo10267a(obj);
        if (a >= 0) {
            return mo5347c(a);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a = mo10267a(obj);
        if (a >= 0) {
            Object d = mo10274d(a);
            if (obj2 == d || (obj2 != null && obj2.equals(d))) {
                mo5347c(a);
                return true;
            }
        }
        return false;
    }

    public V replace(K k, V v) {
        int a = mo10267a((Object) k);
        if (a >= 0) {
            return mo5345a(a, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a = mo10267a((Object) k);
        if (a >= 0) {
            V d = mo10274d(a);
            if (d == v || (v != null && v.equals(d))) {
                mo5345a(a, v2);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.f8992h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8992h * 28);
        sb.append('{');
        for (int i = 0; i < this.f8992h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo10271b(i);
            String str = "(this Map)";
            if (b != this) {
                sb.append(b);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object d = mo10274d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
