package p378p.p380z.p381a;

import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4498m;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p337m.C6236c0;
import p378p.C6614h;

/* renamed from: p.z.a.c */
final class C6676c<T> implements C6614h<C6236c0, T> {

    /* renamed from: a */
    private final C4485f f16429a;

    /* renamed from: b */
    private final C4509v<T> f16430b;

    C6676c(C4485f fVar, C4509v<T> vVar) {
        this.f16429a = fVar;
        this.f16430b = vVar;
    }

    /* renamed from: a */
    public T mo17068a(C6236c0 c0Var) {
        C4470a a = this.f16429a.mo13333a(c0Var.mo16060d());
        try {
            T a2 = this.f16430b.mo13284a(a);
            if (a.mo13307w() == C4472b.END_DOCUMENT) {
                return a2;
            }
            throw new C4498m("JSON document was not fully consumed.");
        } finally {
            c0Var.close();
        }
    }
}
