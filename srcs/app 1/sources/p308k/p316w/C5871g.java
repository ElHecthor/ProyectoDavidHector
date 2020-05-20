package p308k.p316w;

import p308k.C5809q;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: k.w.g */
public interface C5871g {

    /* renamed from: k.w.g$a */
    public static final class C5872a {

        /* renamed from: k.w.g$a$a */
        static final class C5873a extends C5943l implements C5922p<C5871g, C5874b, C5871g> {

            /* renamed from: g */
            public static final C5873a f14900g = new C5873a();

            C5873a() {
                super(2);
            }

            /* renamed from: a */
            public final C5871g mo4018c(C5871g gVar, C5874b bVar) {
                C5942k.m22327b(gVar, "acc");
                C5942k.m22327b(bVar, "element");
                C5871g minusKey = gVar.minusKey(bVar.getKey());
                if (minusKey == C5877h.f14901f) {
                    return bVar;
                }
                C5867e eVar = (C5867e) minusKey.get(C5867e.f14898b);
                if (eVar == null) {
                    return new C5861c(minusKey, bVar);
                }
                C5871g minusKey2 = minusKey.minusKey(C5867e.f14898b);
                return minusKey2 == C5877h.f14901f ? new C5861c(bVar, eVar) : new C5861c(new C5861c(minusKey2, bVar), eVar);
            }
        }

        /* renamed from: a */
        public static C5871g m22232a(C5871g gVar, C5871g gVar2) {
            C5942k.m22327b(gVar2, "context");
            return gVar2 == C5877h.f14901f ? gVar : (C5871g) gVar2.fold(gVar, C5873a.f14900g);
        }
    }

    /* renamed from: k.w.g$b */
    public interface C5874b extends C5871g {

        /* renamed from: k.w.g$b$a */
        public static final class C5875a {
            /* renamed from: a */
            public static <R> R m22235a(C5874b bVar, R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
                C5942k.m22327b(pVar, "operation");
                return pVar.mo4018c(r, bVar);
            }

            /* renamed from: a */
            public static <E extends C5874b> E m22236a(C5874b bVar, C5876c<E> cVar) {
                C5942k.m22327b(cVar, "key");
                if (!C5942k.m22326a((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new C5809q("null cannot be cast to non-null type E");
            }

            /* renamed from: a */
            public static C5871g m22237a(C5874b bVar, C5871g gVar) {
                C5942k.m22327b(gVar, "context");
                return C5872a.m22232a(bVar, gVar);
            }

            /* renamed from: b */
            public static C5871g m22238b(C5874b bVar, C5876c<?> cVar) {
                C5942k.m22327b(cVar, "key");
                return C5942k.m22326a((Object) bVar.getKey(), (Object) cVar) ? C5877h.f14901f : bVar;
            }
        }

        <E extends C5874b> E get(C5876c<E> cVar);

        C5876c<?> getKey();
    }

    /* renamed from: k.w.g$c */
    public interface C5876c<E extends C5874b> {
    }

    <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar);

    <E extends C5874b> E get(C5876c<E> cVar);

    C5871g minusKey(C5876c<?> cVar);

    C5871g plus(C5871g gVar);
}
