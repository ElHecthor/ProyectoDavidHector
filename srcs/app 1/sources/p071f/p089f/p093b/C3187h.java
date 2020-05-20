package p071f.p089f.p093b;

/* renamed from: f.f.b.h */
class C3187h<T> implements C3186g<T> {

    /* renamed from: a */
    private final Object[] f9060a;

    /* renamed from: b */
    private int f9061b;

    C3187h(int i) {
        if (i > 0) {
            this.f9060a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo10363a() {
        int i = this.f9061b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f9060a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f9061b = i - 1;
        return t;
    }

    /* renamed from: a */
    public void mo10364a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f9061b;
            Object[] objArr = this.f9060a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f9061b = i3 + 1;
            }
        }
    }

    /* renamed from: a */
    public boolean mo10365a(T t) {
        int i = this.f9061b;
        Object[] objArr = this.f9060a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f9061b = i + 1;
        return true;
    }
}
