package p147g.p156d.p204b.p207y.p208n;

import java.lang.reflect.Type;
import java.util.Collection;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4518b;
import p147g.p156d.p204b.p207y.C4522c;
import p147g.p156d.p204b.p207y.C4550i;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.b */
public final class C4563b implements C4511w {

    /* renamed from: f */
    private final C4522c f11989f;

    /* renamed from: g.d.b.y.n.b$a */
    private static final class C4564a<E> extends C4509v<Collection<E>> {

        /* renamed from: a */
        private final C4509v<E> f11990a;

        /* renamed from: b */
        private final C4550i<? extends Collection<E>> f11991b;

        public C4564a(C4485f fVar, Type type, C4509v<E> vVar, C4550i<? extends Collection<E>> iVar) {
            this.f11990a = new C4588m(fVar, vVar, type);
            this.f11991b = iVar;
        }

        /* renamed from: a */
        public Collection<E> m18462a(C4470a aVar) {
            if (aVar.mo13307w() == C4472b.NULL) {
                aVar.mo13305u();
                return null;
            }
            Collection<E> collection = (Collection) this.f11991b.mo13419a();
            aVar.mo13288a();
            while (aVar.mo13296i()) {
                collection.add(this.f11990a.mo13284a(aVar));
            }
            aVar.mo13293g();
            return collection;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.mo13329m();
                return;
            }
            cVar.mo13310a();
            for (E a : collection) {
                this.f11990a.mo13285a(cVar, a);
            }
            cVar.mo13323f();
        }
    }

    public C4563b(C4522c cVar) {
        this.f11989f = cVar;
    }

    /* renamed from: a */
    public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
        Type b = aVar.mo13530b();
        Class a = aVar.mo13529a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type a2 = C4518b.m18371a(b, a);
        return new C4564a(fVar, a2, fVar.mo13336a(C4632a.m18691a(a2)), this.f11989f.mo13417a(aVar));
    }
}
