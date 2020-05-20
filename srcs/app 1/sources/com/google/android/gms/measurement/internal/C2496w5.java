package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
final class C2496w5 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f7048f;

    /* renamed from: g */
    private final /* synthetic */ String f7049g;

    /* renamed from: h */
    private final /* synthetic */ String f7050h;

    /* renamed from: i */
    private final /* synthetic */ long f7051i;

    /* renamed from: j */
    private final /* synthetic */ C2335i5 f7052j;

    C2496w5(C2335i5 i5Var, String str, String str2, String str3, long j) {
        this.f7052j = i5Var;
        this.f7048f = str;
        this.f7049g = str2;
        this.f7050h = str3;
        this.f7051i = j;
    }

    public final void run() {
        String str = this.f7048f;
        if (str == null) {
            this.f7052j.f6519a.mo7561t().mo7193D().mo7525a(this.f7049g, (C2410o7) null);
            return;
        }
        this.f7052j.f6519a.mo7561t().mo7193D().mo7525a(this.f7049g, new C2410o7(this.f7050h, str, this.f7051i));
    }
}
