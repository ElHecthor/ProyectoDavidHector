package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import kotlinx.coroutines.C6199u1;
import kotlinx.coroutines.C6199u1.C6200a;
import p308k.p323z.p325d.C5942k;

final class LifecycleController$observer$1 implements C0521l {

    /* renamed from: f */
    final /* synthetic */ C0517i f2173f;

    /* renamed from: g */
    final /* synthetic */ C6199u1 f2174g;

    /* renamed from: a */
    public final void mo124a(C0523n nVar, C0515a aVar) {
        C5942k.m22327b(nVar, "source");
        C5942k.m22327b(aVar, "<anonymous parameter 1>");
        C0514h a = nVar.mo115a();
        String str = "source.lifecycle";
        C5942k.m22324a((Object) a, str);
        if (a.mo3036a() != C0516b.DESTROYED) {
            C0514h a2 = nVar.mo115a();
            C5942k.m22324a((Object) a2, str);
            if (a2.mo3036a().compareTo(this.f2173f.f2228a) < 0) {
                this.f2173f.f2229b.mo3016a();
                throw null;
            } else {
                this.f2173f.f2229b.mo3017b();
                throw null;
            }
        } else {
            C0517i iVar = this.f2173f;
            C6200a.m23248a(this.f2174g, null, 1, null);
            iVar.mo3040a();
            throw null;
        }
    }
}
