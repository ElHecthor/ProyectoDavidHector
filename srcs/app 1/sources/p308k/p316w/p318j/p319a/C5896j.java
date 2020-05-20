package p308k.p316w.p318j.p319a;

import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5877h;

/* renamed from: k.w.j.a.j */
public abstract class C5896j extends C5886a {
    public C5896j(C5866d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.mo15390b() == C5877h.f14901f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    /* renamed from: b */
    public C5871g mo15390b() {
        return C5877h.f14901f;
    }
}
