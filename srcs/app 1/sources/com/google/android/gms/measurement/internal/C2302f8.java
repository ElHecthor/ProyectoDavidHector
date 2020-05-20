package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
final class C2302f8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4317zc f6447f;

    /* renamed from: g */
    private final /* synthetic */ String f6448g;

    /* renamed from: h */
    private final /* synthetic */ String f6449h;

    /* renamed from: i */
    private final /* synthetic */ AppMeasurementDynamiteService f6450i;

    C2302f8(AppMeasurementDynamiteService appMeasurementDynamiteService, C4317zc zcVar, String str, String str2) {
        this.f6450i = appMeasurementDynamiteService;
        this.f6447f = zcVar;
        this.f6448g = str;
        this.f6449h = str2;
    }

    public final void run() {
        this.f6450i.f6216a.mo7194E().mo7644a(this.f6447f, this.f6448g, this.f6449h);
    }
}
