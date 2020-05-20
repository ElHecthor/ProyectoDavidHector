package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
final class C2301f7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4317zc f6445f;

    /* renamed from: g */
    private final /* synthetic */ AppMeasurementDynamiteService f6446g;

    C2301f7(AppMeasurementDynamiteService appMeasurementDynamiteService, C4317zc zcVar) {
        this.f6446g = appMeasurementDynamiteService;
        this.f6445f = zcVar;
    }

    public final void run() {
        this.f6446g.f6216a.mo7194E().mo7642a(this.f6445f);
    }
}
