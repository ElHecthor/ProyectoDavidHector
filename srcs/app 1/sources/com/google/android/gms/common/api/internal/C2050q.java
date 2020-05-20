package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2004g.C2005a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C2050q implements C2005a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f5928a;

    /* renamed from: b */
    private final /* synthetic */ C2067y0 f5929b;

    C2050q(C2067y0 y0Var, BasePendingResult basePendingResult) {
        this.f5929b = y0Var;
        this.f5928a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo6632a(Status status) {
        this.f5929b.f5954a.remove(this.f5928a);
    }
}
