package p147g.p156d.p157a.p167b.p173d.p180g;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.g.v2 */
final class C4246v2<T> implements C4163q2<T> {

    /* renamed from: f */
    private volatile C4163q2<T> f11354f;

    /* renamed from: g */
    private volatile boolean f11355g;
    @NullableDecl

    /* renamed from: h */
    private T f11356h;

    C4246v2(C4163q2<T> q2Var) {
        C4135o2.m16880a(q2Var);
        this.f11354f = q2Var;
    }

    /* renamed from: a */
    public final T mo12100a() {
        if (!this.f11355g) {
            synchronized (this) {
                if (!this.f11355g) {
                    T a = this.f11354f.mo12100a();
                    this.f11356h = a;
                    this.f11355g = true;
                    this.f11354f = null;
                    return a;
                }
            }
        }
        return this.f11356h;
    }

    public final String toString() {
        Object obj = this.f11354f;
        if (obj == null) {
            String valueOf = String.valueOf(this.f11356h);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
