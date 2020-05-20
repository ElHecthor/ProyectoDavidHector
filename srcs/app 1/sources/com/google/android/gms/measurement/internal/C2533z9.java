package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.z9 */
final class C2533z9 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4317zc f7132f;

    /* renamed from: g */
    private final /* synthetic */ AppMeasurementDynamiteService f7133g;

    C2533z9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4317zc zcVar) {
        this.f7133g = appMeasurementDynamiteService;
        this.f7132f = zcVar;
    }

    public final void run() {
        this.f7133g.f6216a.mo7218v().mo7696a(this.f7132f, this.f7133g.f6216a.mo7203b());
    }
}
