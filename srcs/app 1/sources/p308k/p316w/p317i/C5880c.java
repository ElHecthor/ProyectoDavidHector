package p308k.p316w.p317i;

import p308k.C5806n;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5877h;
import p308k.p316w.p318j.p319a.C5886a;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p316w.p318j.p319a.C5896j;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5953v;

/* renamed from: k.w.i.c */
class C5880c {

    /* renamed from: k.w.i.c$a */
    public static final class C5881a extends C5896j {

        /* renamed from: g */
        private int f14904g;

        /* renamed from: h */
        final /* synthetic */ C5918l f14905h;

        public C5881a(C5866d dVar, C5866d dVar2, C5918l lVar) {
            this.f14905h = lVar;
            super(dVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo4016a(Object obj) {
            int i = this.f14904g;
            if (i == 0) {
                this.f14904g = 1;
                C5806n.m22054a(obj);
                C5918l lVar = this.f14905h;
                if (lVar != null) {
                    C5953v.m22350a((Object) lVar, 1);
                    return lVar.mo4090d(this);
                }
                throw new C5809q("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f14904g = 2;
                C5806n.m22054a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: k.w.i.c$b */
    public static final class C5882b extends C5889d {

        /* renamed from: i */
        private int f14906i;

        /* renamed from: j */
        final /* synthetic */ C5918l f14907j;

        public C5882b(C5866d dVar, C5871g gVar, C5866d dVar2, C5871g gVar2, C5918l lVar) {
            this.f14907j = lVar;
            super(dVar2, gVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo4016a(Object obj) {
            int i = this.f14906i;
            if (i == 0) {
                this.f14906i = 1;
                C5806n.m22054a(obj);
                C5918l lVar = this.f14907j;
                if (lVar != null) {
                    C5953v.m22350a((Object) lVar, 1);
                    return lVar.mo4090d(this);
                }
                throw new C5809q("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f14906i = 2;
                C5806n.m22054a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: k.w.i.c$c */
    public static final class C5883c extends C5896j {

        /* renamed from: g */
        private int f14908g;

        /* renamed from: h */
        final /* synthetic */ C5922p f14909h;

        /* renamed from: i */
        final /* synthetic */ Object f14910i;

        public C5883c(C5866d dVar, C5866d dVar2, C5922p pVar, Object obj) {
            this.f14909h = pVar;
            this.f14910i = obj;
            super(dVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo4016a(Object obj) {
            int i = this.f14908g;
            if (i == 0) {
                this.f14908g = 1;
                C5806n.m22054a(obj);
                C5922p pVar = this.f14909h;
                if (pVar != null) {
                    C5953v.m22350a((Object) pVar, 2);
                    return pVar.mo4018c(this.f14910i, this);
                }
                throw new C5809q("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f14908g = 2;
                C5806n.m22054a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: k.w.i.c$d */
    public static final class C5884d extends C5889d {

        /* renamed from: i */
        private int f14911i;

        /* renamed from: j */
        final /* synthetic */ C5922p f14912j;

        /* renamed from: k */
        final /* synthetic */ Object f14913k;

        public C5884d(C5866d dVar, C5871g gVar, C5866d dVar2, C5871g gVar2, C5922p pVar, Object obj) {
            this.f14912j = pVar;
            this.f14913k = obj;
            super(dVar2, gVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo4016a(Object obj) {
            int i = this.f14911i;
            if (i == 0) {
                this.f14911i = 1;
                C5806n.m22054a(obj);
                C5922p pVar = this.f14912j;
                if (pVar != null) {
                    C5953v.m22350a((Object) pVar, 2);
                    return pVar.mo4018c(this.f14913k, this);
                }
                throw new C5809q("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f14911i = 2;
                C5806n.m22054a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <T> C5866d<T> m22243a(C5866d<? super T> dVar) {
        C5942k.m22327b(dVar, "$this$intercepted");
        C5889d dVar2 = (C5889d) (!(dVar instanceof C5889d) ? null : dVar);
        if (dVar2 == null) {
            return dVar;
        }
        C5866d f = dVar2.mo15592f();
        return f != null ? f : dVar;
    }

    /* renamed from: a */
    public static <T> C5866d<C5812t> m22244a(C5918l<? super C5866d<? super T>, ? extends Object> lVar, C5866d<? super T> dVar) {
        C5942k.m22327b(lVar, "$this$createCoroutineUnintercepted");
        C5942k.m22327b(dVar, "completion");
        C5893h.m22278a(dVar);
        if (lVar instanceof C5886a) {
            return ((C5886a) lVar).mo15586a(dVar);
        }
        C5871g b = dVar.mo15390b();
        String str = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>";
        if (b == C5877h.f14901f) {
            if (dVar != null) {
                return new C5881a(dVar, dVar, lVar);
            }
            throw new C5809q(str);
        } else if (dVar != null) {
            C5882b bVar = new C5882b(dVar, b, dVar, b, lVar);
            return bVar;
        } else {
            throw new C5809q(str);
        }
    }

    /* renamed from: a */
    public static <R, T> C5866d<C5812t> m22245a(C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar, R r, C5866d<? super T> dVar) {
        C5942k.m22327b(pVar, "$this$createCoroutineUnintercepted");
        C5942k.m22327b(dVar, "completion");
        C5893h.m22278a(dVar);
        if (pVar instanceof C5886a) {
            return ((C5886a) pVar).mo4017a(r, dVar);
        }
        C5871g b = dVar.mo15390b();
        String str = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>";
        if (b == C5877h.f14901f) {
            if (dVar != null) {
                return new C5883c(dVar, dVar, pVar, r);
            }
            throw new C5809q(str);
        } else if (dVar != null) {
            C5884d dVar2 = new C5884d(dVar, b, dVar, b, pVar, r);
            return dVar2;
        } else {
            throw new C5809q(str);
        }
    }
}
