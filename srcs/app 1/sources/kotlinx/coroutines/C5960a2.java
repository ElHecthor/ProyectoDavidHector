package kotlinx.coroutines;

import kotlinx.coroutines.C6199u1;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a2 */
public abstract class C5960a2<J extends C6199u1> extends C6211x implements C5959a1, C6174p1 {

    /* renamed from: i */
    public final J f14955i;

    public C5960a2(J j) {
        C5942k.m22327b(j, "job");
        this.f14955i = j;
    }

    /* renamed from: a */
    public boolean mo15640a() {
        return true;
    }

    /* renamed from: f */
    public void mo15639f() {
        J j = this.f14955i;
        if (j != null) {
            ((C6014b2) j).mo15723a(this);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    /* renamed from: i */
    public C6091g2 mo15641i() {
        return null;
    }
}
