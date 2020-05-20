package p147g.p156d.p157a.p167b.p173d.p180g;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.g.n2 */
final class C4121n2<T> extends C4149p2<T> {

    /* renamed from: f */
    static final C4121n2<Object> f11137f = new C4121n2<>();

    private C4121n2() {
    }

    /* renamed from: a */
    public final boolean mo12670a() {
        return false;
    }

    /* renamed from: b */
    public final T mo12671b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
