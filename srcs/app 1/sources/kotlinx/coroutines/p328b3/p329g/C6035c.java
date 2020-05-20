package kotlinx.coroutines.p328b3.p329g;

import kotlinx.coroutines.C5957a;
import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.p328b3.C6020a;
import kotlinx.coroutines.p328b3.C6021b;
import kotlinx.coroutines.p330c3.C6043b;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p324c.C5923q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b3.g.c */
public final class C6035c {

    /* renamed from: kotlinx.coroutines.b3.g.c$a */
    public static final class C6036a implements C6020a<R> {

        /* renamed from: a */
        final /* synthetic */ C5923q f15084a;

        public C6036a(C5923q qVar) {
            this.f15084a = qVar;
        }

        /* renamed from: a */
        public Object mo15758a(C6021b bVar, C5866d dVar) {
            return C6035c.m22696a(new C6034b(bVar, null, this), dVar);
        }
    }

    /* renamed from: a */
    public static final <R> Object m22696a(C5922p<? super C6089g0, ? super C5866d<? super R>, ? extends Object> pVar, C5866d<? super R> dVar) {
        C6033a aVar = new C6033a(dVar.mo15390b(), dVar);
        Object a = C6043b.m22712a((C5957a<? super T>) aVar, aVar, pVar);
        if (a == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return a;
    }

    /* renamed from: a */
    public static final <R> C6020a<R> m22697a(C5923q<? super C6089g0, ? super C6021b<? super R>, ? super C5866d<? super C5812t>, ? extends Object> qVar) {
        C5942k.m22327b(qVar, "block");
        return new C6036a(qVar);
    }
}
