package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.g.u2 */
final class C4232u2<T> implements C4163q2<T>, Serializable {
    @NullableDecl

    /* renamed from: f */
    private final T f11339f;

    C4232u2(@NullableDecl T t) {
        this.f11339f = t;
    }

    /* renamed from: a */
    public final T mo12100a() {
        return this.f11339f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C4232u2)) {
            return false;
        }
        C4232u2 u2Var = (C4232u2) obj;
        T t = this.f11339f;
        T t2 = u2Var.f11339f;
        return t == t2 || (t != null && t.equals(t2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11339f});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11339f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
