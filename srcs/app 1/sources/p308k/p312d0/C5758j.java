package p308k.p312d0;

import java.util.Iterator;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.d0.j */
class C5758j extends C5757i {

    /* renamed from: k.d0.j$a */
    public static final class C5759a implements C5751d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f14828a;

        public C5759a(Iterator it) {
            this.f14828a = it;
        }

        public Iterator<T> iterator() {
            return this.f14828a;
        }
    }

    /* renamed from: a */
    public static <T> C5751d<T> m21899a(Iterator<? extends T> it) {
        C5942k.m22327b(it, "$this$asSequence");
        return m21900a((C5751d<? extends T>) new C5759a<Object>(it));
    }

    /* renamed from: a */
    public static final <T> C5751d<T> m21900a(C5751d<? extends T> dVar) {
        C5942k.m22327b(dVar, "$this$constrainOnce");
        return dVar instanceof C5747a ? dVar : new C5747a(dVar);
    }
}
