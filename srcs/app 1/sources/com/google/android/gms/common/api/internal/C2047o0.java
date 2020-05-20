package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1981a.C1983b;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2021d;
import com.google.android.gms.common.api.internal.C2025f.C2026a;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
public final class C2047o0<A extends C2021d<? extends C2071k, C1983b>> extends C2031g0 {

    /* renamed from: a */
    private final A f5926a;

    public C2047o0(int i, A a) {
        super(i);
        this.f5926a = a;
    }

    /* renamed from: a */
    public final void mo6714a(Status status) {
        this.f5926a.mo6676c(status);
    }

    /* renamed from: a */
    public final void mo6715a(C2026a<?> aVar) {
        try {
            this.f5926a.mo6674b(aVar.mo6701f());
        } catch (RuntimeException e) {
            mo6717a(e);
        }
    }

    /* renamed from: a */
    public final void mo6716a(C2067y0 y0Var, boolean z) {
        y0Var.mo6756a((BasePendingResult<? extends C2071k>) this.f5926a, z);
    }

    /* renamed from: a */
    public final void mo6717a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f5926a.mo6676c(new Status(10, sb.toString()));
    }
}
