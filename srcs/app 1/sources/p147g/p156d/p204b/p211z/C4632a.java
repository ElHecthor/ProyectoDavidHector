package p147g.p156d.p204b.p211z;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p147g.p156d.p204b.p207y.C4517a;
import p147g.p156d.p204b.p207y.C4518b;

/* renamed from: g.d.b.z.a */
public class C4632a<T> {

    /* renamed from: a */
    final Class<? super T> f12117a;

    /* renamed from: b */
    final Type f12118b;

    /* renamed from: c */
    final int f12119c = this.f12118b.hashCode();

    protected C4632a() {
        Type b = m18692b(C4632a.class);
        this.f12118b = b;
        this.f12117a = C4518b.m18383e(b);
    }

    C4632a(Type type) {
        C4517a.m18364a(type);
        Type b = C4518b.m18378b(type);
        this.f12118b = b;
        this.f12117a = C4518b.m18383e(b);
    }

    /* renamed from: a */
    public static <T> C4632a<T> m18690a(Class<T> cls) {
        return new C4632a<>(cls);
    }

    /* renamed from: a */
    public static C4632a<?> m18691a(Type type) {
        return new C4632a<>(type);
    }

    /* renamed from: b */
    static Type m18692b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C4518b.m18378b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> mo13529a() {
        return this.f12117a;
    }

    /* renamed from: b */
    public final Type mo13530b() {
        return this.f12118b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4632a) && C4518b.m18377a(this.f12118b, ((C4632a) obj).f12118b);
    }

    public final int hashCode() {
        return this.f12119c;
    }

    public final String toString() {
        return C4518b.m18386h(this.f12118b);
    }
}
