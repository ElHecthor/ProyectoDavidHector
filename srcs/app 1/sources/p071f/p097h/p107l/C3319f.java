package p071f.p097h.p107l;

/* renamed from: f.h.l.f */
public class C3319f<T> implements C3318e<T> {

    /* renamed from: a */
    private final Object[] f9495a;

    /* renamed from: b */
    private int f9496b;

    public C3319f(int i) {
        if (i > 0) {
            this.f9495a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m13536b(T t) {
        for (int i = 0; i < this.f9496b; i++) {
            if (this.f9495a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo5387a() {
        int i = this.f9496b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f9495a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f9496b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo5388a(T t) {
        if (!m13536b(t)) {
            int i = this.f9496b;
            Object[] objArr = this.f9495a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f9496b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
