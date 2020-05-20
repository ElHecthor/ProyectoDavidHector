package kotlinx.coroutines.p328b3.p329g;

import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.p328b3.C6021b;
import kotlinx.coroutines.p328b3.p329g.C6035c.C6036a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p324c.C5923q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b3.g.b */
final class C6034b extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

    /* renamed from: j */
    private C6089g0 f15079j;

    /* renamed from: k */
    Object f15080k;

    /* renamed from: l */
    int f15081l;

    /* renamed from: m */
    final /* synthetic */ C6021b f15082m;

    /* renamed from: n */
    final /* synthetic */ C6036a f15083n;

    C6034b(C6021b bVar, C5866d dVar, C6036a aVar) {
        this.f15082m = bVar;
        this.f15083n = aVar;
        super(2, dVar);
    }

    /* renamed from: a */
    public final Object mo4016a(Object obj) {
        Object a = C5885d.m22250a();
        int i = this.f15081l;
        if (i == 0) {
            C5806n.m22054a(obj);
            C6089g0 g0Var = this.f15079j;
            C5923q qVar = this.f15083n.f15084a;
            C6021b bVar = this.f15082m;
            this.f15080k = g0Var;
            this.f15081l = 1;
            if (qVar.mo15602a(g0Var, bVar, this) == a) {
                return a;
            }
        } else if (i == 1) {
            C6089g0 g0Var2 = (C6089g0) this.f15080k;
            C5806n.m22054a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C5812t.f14872a;
    }

    /* renamed from: a */
    public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
        C5942k.m22327b(dVar, "completion");
        C6034b bVar = new C6034b(this.f15082m, dVar, this.f15083n);
        bVar.f15079j = (C6089g0) obj;
        return bVar;
    }

    /* renamed from: c */
    public final Object mo4018c(Object obj, Object obj2) {
        return ((C6034b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
    }
}
