package kotlinx.coroutines.p327a3;

import kotlinx.coroutines.C6045d0;
import kotlinx.coroutines.p327a3.C5968a0.C5969a;
import p308k.C5812t;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.t */
public class C6000t<E> extends C5985i<E> implements C6001u<E> {
    public C6000t(C5871g gVar, C5983h<E> hVar) {
        C5942k.m22327b(gVar, "parentContext");
        C5942k.m22327b(hVar, "channel");
        super(gVar, hVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15628a(Throwable th, boolean z) {
        C5942k.m22327b(th, "cause");
        if (!mo15701v().mo15671a(th) && !z) {
            C6045d0.m22718a(mo15390b(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15632d(C5812t tVar) {
        C5942k.m22327b(tVar, "value");
        C5969a.m22419a(mo15701v(), null, 1, null);
    }

    /* renamed from: a */
    public boolean mo15630a() {
        return super.mo15630a();
    }
}
