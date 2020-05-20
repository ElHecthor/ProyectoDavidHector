package kotlinx.coroutines;

import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.r1 */
final class C6186r1 extends C6092h {

    /* renamed from: f */
    private final C5918l<Throwable, C5812t> f15296f;

    public C6186r1(C5918l<? super Throwable, C5812t> lVar) {
        C5942k.m22327b(lVar, "handler");
        this.f15296f = lVar;
    }

    /* renamed from: a */
    public void mo15662a(Throwable th) {
        this.f15296f.mo4090d(th);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
        mo15662a((Throwable) obj);
        return C5812t.f14872a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancel[");
        sb.append(C6161m0.m23157a((Object) this.f15296f));
        sb.append('@');
        sb.append(C6161m0.m23159b(this));
        sb.append(']');
        return sb.toString();
    }
}
