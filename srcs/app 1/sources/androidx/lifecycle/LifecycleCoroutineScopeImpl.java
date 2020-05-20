package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

public final class LifecycleCoroutineScopeImpl extends C0518j implements C0521l {

    /* renamed from: f */
    private final C0514h f2175f;

    /* renamed from: g */
    private final C5871g f2176g;

    /* renamed from: a */
    public C0514h mo2972a() {
        return this.f2175f;
    }

    /* renamed from: a */
    public void mo124a(C0523n nVar, C0515a aVar) {
        C5942k.m22327b(nVar, "source");
        C5942k.m22327b(aVar, "event");
        if (mo2972a().mo3036a().compareTo(C0516b.DESTROYED) <= 0) {
            mo2972a().mo3038b(this);
            C6221z1.m23300a(mo2973c(), null, 1, null);
        }
    }

    /* renamed from: c */
    public C5871g mo2973c() {
        return this.f2176g;
    }
}
