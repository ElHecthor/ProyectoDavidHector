package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;

class ReflectiveGenericLifecycleObserver implements C0521l {

    /* renamed from: f */
    private final Object f2195f;

    /* renamed from: g */
    private final C0496a f2196g;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2195f = obj;
        this.f2196g = C0495a.f2202c.mo2999a(obj.getClass());
    }

    /* renamed from: a */
    public void mo124a(C0523n nVar, C0515a aVar) {
        this.f2196g.mo3001a(nVar, aVar, this.f2195f);
    }
}
