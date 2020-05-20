package p147g.p156d.p204b.p207y.p208n;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.p208n.C4577i.C4579b;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.m */
final class C4588m<T> extends C4509v<T> {

    /* renamed from: a */
    private final C4485f f12041a;

    /* renamed from: b */
    private final C4509v<T> f12042b;

    /* renamed from: c */
    private final Type f12043c;

    C4588m(C4485f fVar, C4509v<T> vVar, Type type) {
        this.f12041a = fVar;
        this.f12042b = vVar;
        this.f12043c = type;
    }

    /* renamed from: a */
    private Type m18544a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    /* renamed from: a */
    public T mo13284a(C4470a aVar) {
        return this.f12042b.mo13284a(aVar);
    }

    /* renamed from: a */
    public void mo13285a(C4473c cVar, T t) {
        C4509v<T> vVar = this.f12042b;
        Type a = m18544a(this.f12043c, (Object) t);
        if (a != this.f12043c) {
            vVar = this.f12041a.mo13336a(C4632a.m18691a(a));
            if (vVar instanceof C4579b) {
                C4509v<T> vVar2 = this.f12042b;
                if (!(vVar2 instanceof C4579b)) {
                    vVar = vVar2;
                }
            }
        }
        vVar.mo13285a(cVar, t);
    }
}
