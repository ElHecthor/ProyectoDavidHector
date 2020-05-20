package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
final class C2315g9 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4317zc f6474f;

    /* renamed from: g */
    private final /* synthetic */ String f6475g;

    /* renamed from: h */
    private final /* synthetic */ String f6476h;

    /* renamed from: i */
    private final /* synthetic */ boolean f6477i;

    /* renamed from: j */
    private final /* synthetic */ AppMeasurementDynamiteService f6478j;

    C2315g9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4317zc zcVar, String str, String str2, boolean z) {
        this.f6478j = appMeasurementDynamiteService;
        this.f6474f = zcVar;
        this.f6475g = str;
        this.f6476h = str2;
        this.f6477i = z;
    }

    public final void run() {
        this.f6478j.f6216a.mo7194E().mo7645a(this.f6474f, this.f6475g, this.f6476h, this.f6477i);
    }
}
