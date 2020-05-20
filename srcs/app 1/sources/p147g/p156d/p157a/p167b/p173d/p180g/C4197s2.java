package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.g.s2 */
final class C4197s2<T> implements C4163q2<T>, Serializable {

    /* renamed from: f */
    private final C4163q2<T> f11283f;

    /* renamed from: g */
    private volatile transient boolean f11284g;
    @NullableDecl

    /* renamed from: h */
    private transient T f11285h;

    C4197s2(C4163q2<T> q2Var) {
        C4135o2.m16880a(q2Var);
        this.f11283f = q2Var;
    }

    /* renamed from: a */
    public final T mo12100a() {
        if (!this.f11284g) {
            synchronized (this) {
                if (!this.f11284g) {
                    T a = this.f11283f.mo12100a();
                    this.f11285h = a;
                    this.f11284g = true;
                    return a;
                }
            }
        }
        return this.f11285h;
    }

    public final String toString() {
        Object obj;
        if (this.f11284g) {
            String valueOf = String.valueOf(this.f11285h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f11283f;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
