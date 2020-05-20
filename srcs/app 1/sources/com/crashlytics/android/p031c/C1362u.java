package com.crashlytics.android.p031c;

import p242i.p243a.p244a.p245a.p246n.p249c.p250n.C4872e;

/* renamed from: com.crashlytics.android.c.u */
class C1362u {

    /* renamed from: a */
    long f4420a;

    /* renamed from: b */
    private C4872e f4421b;

    public C1362u(C4872e eVar) {
        if (eVar != null) {
            this.f4421b = eVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    /* renamed from: a */
    public void mo5466a() {
        this.f4420a = 0;
        this.f4421b = this.f4421b.mo13974b();
    }

    /* renamed from: a */
    public boolean mo5467a(long j) {
        return j - this.f4420a >= this.f4421b.mo13973a() * 1000000;
    }

    /* renamed from: b */
    public void mo5468b(long j) {
        this.f4420a = j;
        this.f4421b = this.f4421b.mo13975c();
    }
}
