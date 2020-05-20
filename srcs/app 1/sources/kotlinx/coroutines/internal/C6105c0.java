package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.C6157l0;
import kotlinx.coroutines.internal.C6107d0;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.c0 */
public class C6105c0<T extends C6107d0 & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a */
    private T[] f15198a;

    /* renamed from: a */
    private final void m22929a(int i, int i2) {
        T[] tArr = this.f15198a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.mo15832a(i);
                    t2.mo15832a(i2);
                    return;
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: b */
    private final void m22930b(int i) {
        this._size = i;
    }

    /* renamed from: c */
    private final void m22931c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo15871b()) {
                T[] tArr = this.f15198a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < mo15871b()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                C5942k.m22323a();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            C5942k.m22323a();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m22929a(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private final void m22932d(int i) {
        while (i > 0) {
            T[] tArr = this.f15198a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C5942k.m22323a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m22929a(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
    }

    /* renamed from: f */
    private final T[] m22933f() {
        T[] tArr = this.f15198a;
        if (tArr == null) {
            T[] tArr2 = new C6107d0[4];
            this.f15198a = tArr2;
            return tArr2;
        } else if (mo15871b() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo15871b() * 2);
            C5942k.m22324a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C6107d0[]) copyOf;
            this.f15198a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: a */
    public final T mo15868a() {
        T[] tArr = this.f15198a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: a */
    public final T mo15869a(int i) {
        boolean z = false;
        if (C6157l0.m23149a()) {
            if (!(mo15871b() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f15198a;
        if (tArr != null) {
            m22930b(mo15871b() - 1);
            if (i < mo15871b()) {
                m22929a(i, mo15871b());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C5942k.m22323a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m22929a(i, i2);
                            m22932d(i2);
                        }
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                }
                m22931c(i);
            }
            T t3 = tArr[mo15871b()];
            if (t3 != null) {
                if (C6157l0.m23149a()) {
                    if (t3.mo15837h() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.mo15833a(null);
                t3.mo15832a(-1);
                tArr[mo15871b()] = null;
                return t3;
            }
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public final void mo15870a(T t) {
        C5942k.m22327b(t, "node");
        if (C6157l0.m23149a()) {
            if (!(t.mo15837h() == null)) {
                throw new AssertionError();
            }
        }
        t.mo15833a(this);
        C6107d0[] f = m22933f();
        int b = mo15871b();
        m22930b(b + 1);
        f[b] = t;
        t.mo15832a(b);
        m22932d(b);
    }

    /* renamed from: b */
    public final int mo15871b() {
        return this._size;
    }

    /* renamed from: b */
    public final boolean mo15872b(T t) {
        boolean z;
        C5942k.m22327b(t, "node");
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo15837h() == null) {
                z = false;
            } else {
                int g = t.mo15836g();
                if (C6157l0.m23149a()) {
                    if (g >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo15869a(g);
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo15873c() {
        return mo15871b() == 0;
    }

    /* renamed from: d */
    public final T mo15874d() {
        T a;
        synchronized (this) {
            a = mo15868a();
        }
        return a;
    }

    /* renamed from: e */
    public final T mo15875e() {
        T a;
        synchronized (this) {
            a = mo15871b() > 0 ? mo15869a(0) : null;
        }
        return a;
    }
}
