package kotlinx.coroutines.internal;

import kotlinx.coroutines.C6191s2;
import p308k.C5809q;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: kotlinx.coroutines.internal.z */
public final class C6143z {

    /* renamed from: a */
    private static final C6139v f15249a = new C6139v("ZERO");

    /* renamed from: b */
    private static final C5922p<Object, C5874b, Object> f15250b = C6144a.f15254g;

    /* renamed from: c */
    private static final C5922p<C6191s2<?>, C5874b, C6191s2<?>> f15251c = C6145b.f15255g;

    /* renamed from: d */
    private static final C5922p<C6109e0, C5874b, C6109e0> f15252d = C6147d.f15257g;

    /* renamed from: e */
    private static final C5922p<C6109e0, C5874b, C6109e0> f15253e = C6146c.f15256g;

    /* renamed from: kotlinx.coroutines.internal.z$a */
    static final class C6144a extends C5943l implements C5922p<Object, C5874b, Object> {

        /* renamed from: g */
        public static final C6144a f15254g = new C6144a();

        C6144a() {
            super(2);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=k.w.g$b, code=java.lang.Object, for r3v0, types: [k.w.g$b, java.lang.Object] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo4018c(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                java.lang.String r0 = "element"
                p308k.p323z.p325d.C5942k.m22327b(r3, r0)
                boolean r0 = r3 instanceof kotlinx.coroutines.C6191s2
                if (r0 == 0) goto L_0x0022
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L_0x000e
                r2 = 0
            L_0x000e:
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0 = 1
                if (r2 == 0) goto L_0x0018
                int r2 = r2.intValue()
                goto L_0x0019
            L_0x0018:
                r2 = 1
            L_0x0019:
                if (r2 != 0) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                int r2 = r2 + r0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            L_0x0021:
                return r3
            L_0x0022:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6143z.C6144a.mo4018c(java.lang.Object, k.w.g$b):java.lang.Object");
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$b */
    static final class C6145b extends C5943l implements C5922p<C6191s2<?>, C5874b, C6191s2<?>> {

        /* renamed from: g */
        public static final C6145b f15255g = new C6145b();

        C6145b() {
            super(2);
        }

        /* renamed from: a */
        public final C6191s2<?> mo4018c(C6191s2<?> s2Var, C5874b bVar) {
            C5942k.m22327b(bVar, "element");
            if (s2Var != null) {
                return s2Var;
            }
            if (!(bVar instanceof C6191s2)) {
                bVar = null;
            }
            return (C6191s2) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$c */
    static final class C6146c extends C5943l implements C5922p<C6109e0, C5874b, C6109e0> {

        /* renamed from: g */
        public static final C6146c f15256g = new C6146c();

        C6146c() {
            super(2);
        }

        /* renamed from: a */
        public final C6109e0 mo15931a(C6109e0 e0Var, C5874b bVar) {
            C5942k.m22327b(e0Var, "state");
            C5942k.m22327b(bVar, "element");
            if (bVar instanceof C6191s2) {
                ((C6191s2) bVar).mo15817a(e0Var.mo15879a(), e0Var.mo15882c());
            }
            return e0Var;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo4018c(Object obj, Object obj2) {
            C6109e0 e0Var = (C6109e0) obj;
            mo15931a(e0Var, (C5874b) obj2);
            return e0Var;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.z$d */
    static final class C6147d extends C5943l implements C5922p<C6109e0, C5874b, C6109e0> {

        /* renamed from: g */
        public static final C6147d f15257g = new C6147d();

        C6147d() {
            super(2);
        }

        /* renamed from: a */
        public final C6109e0 mo15932a(C6109e0 e0Var, C5874b bVar) {
            C5942k.m22327b(e0Var, "state");
            C5942k.m22327b(bVar, "element");
            if (bVar instanceof C6191s2) {
                e0Var.mo15880a(((C6191s2) bVar).mo15816a(e0Var.mo15879a()));
            }
            return e0Var;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo4018c(Object obj, Object obj2) {
            C6109e0 e0Var = (C6109e0) obj;
            mo15932a(e0Var, (C5874b) obj2);
            return e0Var;
        }
    }

    /* renamed from: a */
    public static final Object m23095a(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        Object fold = gVar.fold(Integer.valueOf(0), f15250b);
        if (fold != null) {
            return fold;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public static final void m23096a(C5871g gVar, Object obj) {
        C5942k.m22327b(gVar, "context");
        if (obj != f15249a) {
            if (obj instanceof C6109e0) {
                ((C6109e0) obj).mo15881b();
                gVar.fold(obj, f15253e);
            } else {
                Object fold = gVar.fold(null, f15251c);
                if (fold != null) {
                    ((C6191s2) fold).mo15817a(gVar, obj);
                } else {
                    throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
            }
        }
    }

    /* renamed from: b */
    public static final Object m23097b(C5871g gVar, Object obj) {
        C5942k.m22327b(gVar, "context");
        if (obj == null) {
            obj = m23095a(gVar);
        }
        if (obj == Integer.valueOf(0)) {
            return f15249a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new C6109e0(gVar, ((Number) obj).intValue()), f15252d);
        }
        if (obj != null) {
            return ((C6191s2) obj).mo15816a(gVar);
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
