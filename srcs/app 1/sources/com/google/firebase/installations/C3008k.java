package com.google.firebase.installations;

import com.google.firebase.installations.C3010m.C3011a;
import com.google.firebase.installations.p064q.C3021d;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.firebase.installations.k */
class C3008k implements C3013o {

    /* renamed from: a */
    private final C3014p f8598a;

    /* renamed from: b */
    private final C4351i<C3010m> f8599b;

    public C3008k(C3014p pVar, C4351i<C3010m> iVar) {
        this.f8598a = pVar;
        this.f8599b = iVar;
    }

    /* renamed from: a */
    public boolean mo9733a(C3021d dVar) {
        if (!dVar.mo9767j() || this.f8598a.mo9737a(dVar)) {
            return false;
        }
        C4351i<C3010m> iVar = this.f8599b;
        C3011a d = C3010m.m12260d();
        d.mo9719a(dVar.mo9738a());
        d.mo9721b(dVar.mo9739b());
        d.mo9718a(dVar.mo9745g());
        iVar.mo13027a(d.mo9720a());
        return true;
    }

    /* renamed from: a */
    public boolean mo9734a(C3021d dVar, Exception exc) {
        if (!dVar.mo9765h() && !dVar.mo9766i() && !dVar.mo9768k()) {
            return false;
        }
        this.f8599b.mo13028b(exc);
        return true;
    }
}
