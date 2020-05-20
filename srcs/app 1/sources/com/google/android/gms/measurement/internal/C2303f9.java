package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2190e;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
final class C2303f9 {

    /* renamed from: a */
    private final C2190e f6451a;

    /* renamed from: b */
    private long f6452b;

    public C2303f9(C2190e eVar) {
        C2148s.m8834a(eVar);
        this.f6451a = eVar;
    }

    /* renamed from: a */
    public final void mo7350a() {
        this.f6452b = this.f6451a.mo6989c();
    }

    /* renamed from: a */
    public final boolean mo7351a(long j) {
        return this.f6452b == 0 || this.f6451a.mo6989c() - this.f6452b >= 3600000;
    }

    /* renamed from: b */
    public final void mo7352b() {
        this.f6452b = 0;
    }
}
