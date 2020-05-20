package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.p8 */
final class C2422p8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2374l8 f6792f;

    C2422p8(C2374l8 l8Var) {
        this.f6792f = l8Var;
    }

    public final void run() {
        C2465t7 t7Var = this.f6792f.f6651c;
        Context h = this.f6792f.f6651c.mo7096h();
        this.f6792f.f6651c.mo7094f();
        t7Var.m9933a(new ComponentName(h, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
