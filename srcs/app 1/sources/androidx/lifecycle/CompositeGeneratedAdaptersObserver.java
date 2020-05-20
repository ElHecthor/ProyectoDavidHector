package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;

class CompositeGeneratedAdaptersObserver implements C0521l {

    /* renamed from: f */
    private final C0512f[] f2169f;

    CompositeGeneratedAdaptersObserver(C0512f[] fVarArr) {
        this.f2169f = fVarArr;
    }

    /* renamed from: a */
    public void mo124a(C0523n nVar, C0515a aVar) {
        C0531s sVar = new C0531s();
        for (C0512f a : this.f2169f) {
            a.mo3035a(nVar, aVar, false, sVar);
        }
        for (C0512f a2 : this.f2169f) {
            a2.mo3035a(nVar, aVar, true, sVar);
        }
    }
}
