package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.g.t2 */
public final class C4212t2 {
    /* renamed from: a */
    public static <T> C4163q2<T> m17143a(C4163q2<T> q2Var) {
        return ((q2Var instanceof C4246v2) || (q2Var instanceof C4197s2)) ? q2Var : q2Var instanceof Serializable ? new C4197s2(q2Var) : new C4246v2(q2Var);
    }

    /* renamed from: a */
    public static <T> C4163q2<T> m17144a(@NullableDecl T t) {
        return new C4232u2(t);
    }
}
