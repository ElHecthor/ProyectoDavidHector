package p240h.p241a;

/* renamed from: h.a.c */
public final class C4774c<T> implements C4773b<T> {

    /* renamed from: a */
    private final T f12484a;

    static {
        new C4774c(null);
    }

    private C4774c(T t) {
        this.f12484a = t;
    }

    /* renamed from: a */
    public static <T> C4773b<T> m19189a(T t) {
        C4775d.m19191a(t, "instance cannot be null");
        return new C4774c(t);
    }

    public T get() {
        return this.f12484a;
    }
}
