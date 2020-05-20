package p147g.p156d.p157a.p167b.p173d.p180g;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.g.r2 */
final class C4178r2<T> extends C4149p2<T> {

    /* renamed from: f */
    private final T f11256f;

    C4178r2(T t) {
        this.f11256f = t;
    }

    /* renamed from: a */
    public final boolean mo12670a() {
        return true;
    }

    /* renamed from: b */
    public final T mo12671b() {
        return this.f11256f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C4178r2)) {
            return false;
        }
        return this.f11256f.equals(((C4178r2) obj).f11256f);
    }

    public final int hashCode() {
        return this.f11256f.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11256f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
