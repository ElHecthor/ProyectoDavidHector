package kotlinx.coroutines;

import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5874b.C5875a;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.s2 */
public interface C6191s2<S> extends C5874b {

    /* renamed from: kotlinx.coroutines.s2$a */
    public static final class C6192a {
        /* renamed from: a */
        public static <S, R> R m23215a(C6191s2<S> s2Var, R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
            C5942k.m22327b(pVar, "operation");
            return C5875a.m22235a(s2Var, r, pVar);
        }

        /* renamed from: a */
        public static <S, E extends C5874b> E m23216a(C6191s2<S> s2Var, C5876c<E> cVar) {
            C5942k.m22327b(cVar, "key");
            return C5875a.m22236a((C5874b) s2Var, cVar);
        }

        /* renamed from: a */
        public static <S> C5871g m23217a(C6191s2<S> s2Var, C5871g gVar) {
            C5942k.m22327b(gVar, "context");
            return C5875a.m22237a((C5874b) s2Var, gVar);
        }

        /* renamed from: b */
        public static <S> C5871g m23218b(C6191s2<S> s2Var, C5876c<?> cVar) {
            C5942k.m22327b(cVar, "key");
            return C5875a.m22238b(s2Var, cVar);
        }
    }

    /* renamed from: a */
    S mo15816a(C5871g gVar);

    /* renamed from: a */
    void mo15817a(C5871g gVar, S s);
}
