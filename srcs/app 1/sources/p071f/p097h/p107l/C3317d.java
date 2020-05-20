package p071f.p097h.p107l;

/* renamed from: f.h.l.d */
public class C3317d<F, S> {

    /* renamed from: a */
    public final F f9493a;

    /* renamed from: b */
    public final S f9494b;

    public C3317d(F f, S s) {
        this.f9493a = f;
        this.f9494b = s;
    }

    /* renamed from: a */
    public static <A, B> C3317d<A, B> m13533a(A a, B b) {
        return new C3317d<>(a, b);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C3317d)) {
            return false;
        }
        C3317d dVar = (C3317d) obj;
        if (C3316c.m13532a(dVar.f9493a, this.f9493a) && C3316c.m13532a(dVar.f9494b, this.f9494b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        F f = this.f9493a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f9494b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pair{");
        sb.append(String.valueOf(this.f9493a));
        sb.append(" ");
        sb.append(String.valueOf(this.f9494b));
        sb.append("}");
        return sb.toString();
    }
}
