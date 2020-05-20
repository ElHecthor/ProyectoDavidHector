package p378p;

import java.util.Objects;
import javax.annotation.Nullable;
import p337m.C6232b0;
import p337m.C6236c0;

/* renamed from: p.t */
public final class C6663t<T> {

    /* renamed from: a */
    private final C6232b0 f16396a;
    @Nullable

    /* renamed from: b */
    private final T f16397b;
    @Nullable

    /* renamed from: c */
    private final C6236c0 f16398c;

    private C6663t(C6232b0 b0Var, @Nullable T t, @Nullable C6236c0 c0Var) {
        this.f16396a = b0Var;
        this.f16397b = t;
        this.f16398c = c0Var;
    }

    /* renamed from: a */
    public static <T> C6663t<T> m25029a(@Nullable T t, C6232b0 b0Var) {
        Objects.requireNonNull(b0Var, "rawResponse == null");
        if (b0Var.mo16026m()) {
            return new C6663t<>(b0Var, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public static <T> C6663t<T> m25030a(C6236c0 c0Var, C6232b0 b0Var) {
        Objects.requireNonNull(c0Var, "body == null");
        Objects.requireNonNull(b0Var, "rawResponse == null");
        if (!b0Var.mo16026m()) {
            return new C6663t<>(b0Var, null, c0Var);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    @Nullable
    /* renamed from: a */
    public T mo17125a() {
        return this.f16397b;
    }

    /* renamed from: b */
    public int mo17126b() {
        return this.f16396a.mo16022g();
    }

    @Nullable
    /* renamed from: c */
    public C6236c0 mo17127c() {
        return this.f16398c;
    }

    /* renamed from: d */
    public boolean mo17128d() {
        return this.f16396a.mo16026m();
    }

    /* renamed from: e */
    public String mo17129e() {
        return this.f16396a.mo16027o();
    }

    public String toString() {
        return this.f16396a.toString();
    }
}
