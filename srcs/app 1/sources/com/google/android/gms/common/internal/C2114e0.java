package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C2004g;
import com.google.android.gms.common.api.C2004g.C2005a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2144r.C2145a;
import com.google.android.gms.common.internal.C2144r.C2146b;
import java.util.concurrent.TimeUnit;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.internal.e0 */
final class C2114e0 implements C2005a {

    /* renamed from: a */
    private final /* synthetic */ C2004g f6045a;

    /* renamed from: b */
    private final /* synthetic */ C4351i f6046b;

    /* renamed from: c */
    private final /* synthetic */ C2145a f6047c;

    /* renamed from: d */
    private final /* synthetic */ C2146b f6048d;

    C2114e0(C2004g gVar, C4351i iVar, C2145a aVar, C2146b bVar) {
        this.f6045a = gVar;
        this.f6046b = iVar;
        this.f6047c = aVar;
        this.f6048d = bVar;
    }

    /* renamed from: a */
    public final void mo6632a(Status status) {
        if (status.mo6586h()) {
            this.f6046b.mo13027a(this.f6047c.mo6516a(this.f6045a.mo6630a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f6046b.mo13026a((Exception) this.f6048d.mo6880a(status));
    }
}
