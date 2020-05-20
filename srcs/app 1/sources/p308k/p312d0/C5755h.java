package p308k.p312d0;

import java.util.Iterator;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.d0.h */
class C5755h {

    /* renamed from: k.d0.h$a */
    public static final class C5756a implements C5751d<T> {

        /* renamed from: a */
        final /* synthetic */ C5922p f14827a;

        public C5756a(C5922p pVar) {
            this.f14827a = pVar;
        }

        public Iterator<T> iterator() {
            return C5755h.m21897a(this.f14827a);
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m21897a(C5922p<? super C5753f<? super T>, ? super C5866d<? super C5812t>, ? extends Object> pVar) {
        C5942k.m22327b(pVar, "block");
        C5752e eVar = new C5752e();
        eVar.mo15389a(C5880c.m22245a(pVar, eVar, eVar));
        return eVar;
    }

    /* renamed from: b */
    public static <T> C5751d<T> m21898b(C5922p<? super C5753f<? super T>, ? super C5866d<? super C5812t>, ? extends Object> pVar) {
        C5942k.m22327b(pVar, "block");
        return new C5756a(pVar);
    }
}
