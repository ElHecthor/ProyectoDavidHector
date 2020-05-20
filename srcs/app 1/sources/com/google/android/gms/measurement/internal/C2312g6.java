package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
final class C2312g6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4317zc f6463f;

    /* renamed from: g */
    private final /* synthetic */ C2435r f6464g;

    /* renamed from: h */
    private final /* synthetic */ String f6465h;

    /* renamed from: i */
    private final /* synthetic */ AppMeasurementDynamiteService f6466i;

    C2312g6(AppMeasurementDynamiteService appMeasurementDynamiteService, C4317zc zcVar, C2435r rVar, String str) {
        this.f6466i = appMeasurementDynamiteService;
        this.f6463f = zcVar;
        this.f6464g = rVar;
        this.f6465h = str;
    }

    public final void run() {
        this.f6466i.f6216a.mo7194E().mo7643a(this.f6463f, this.f6464g, this.f6465h);
    }
}
