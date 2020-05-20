package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.api.internal.C2025f.C2026a;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
public final class C2051q0 extends C2049p0<Boolean> {

    /* renamed from: b */
    private final C2036j<?> f5930b;

    public C2051q0(C2036j<?> jVar, C4351i<Boolean> iVar) {
        super(4, iVar);
        this.f5930b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6716a(C2067y0 y0Var, boolean z) {
    }

    /* renamed from: b */
    public final C2082d[] mo6737b(C2026a<?> aVar) {
        C2029f0 f0Var = (C2029f0) aVar.mo6704i().get(this.f5930b);
        if (f0Var == null) {
            return null;
        }
        return f0Var.f5904a.mo6732b();
    }

    /* renamed from: c */
    public final boolean mo6738c(C2026a<?> aVar) {
        C2029f0 f0Var = (C2029f0) aVar.mo6704i().get(this.f5930b);
        return f0Var != null && f0Var.f5904a.mo6733c();
    }

    /* renamed from: d */
    public final void mo6736d(C2026a<?> aVar) {
        C2029f0 f0Var = (C2029f0) aVar.mo6704i().remove(this.f5930b);
        if (f0Var != null) {
            f0Var.f5905b.mo6735a(aVar.mo6701f(), this.f5927a);
            f0Var.f5904a.mo6730a();
            return;
        }
        this.f5927a.mo13029b(Boolean.valueOf(false));
    }
}
