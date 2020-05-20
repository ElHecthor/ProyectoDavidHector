package p147g.p156d.p204b;

import java.io.IOException;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.p208n.C4570f;

/* renamed from: g.d.b.v */
public abstract class C4509v<T> {

    /* renamed from: g.d.b.v$a */
    class C4510a extends C4509v<T> {
        C4510a() {
        }

        /* renamed from: a */
        public T mo13284a(C4470a aVar) {
            if (aVar.mo13307w() != C4472b.NULL) {
                return C4509v.this.mo13284a(aVar);
            }
            aVar.mo13305u();
            return null;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, T t) {
            if (t == null) {
                cVar.mo13329m();
            } else {
                C4509v.this.mo13285a(cVar, t);
            }
        }
    }

    /* renamed from: a */
    public final C4497l mo13391a(T t) {
        try {
            C4570f fVar = new C4570f();
            mo13285a(fVar, t);
            return fVar.mo13482o();
        } catch (IOException e) {
            throw new C4498m((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C4509v<T> mo13392a() {
        return new C4510a();
    }

    /* renamed from: a */
    public abstract T mo13284a(C4470a aVar);

    /* renamed from: a */
    public abstract void mo13285a(C4473c cVar, T t);
}
