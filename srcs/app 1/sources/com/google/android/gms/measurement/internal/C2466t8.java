package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.t8 */
final /* synthetic */ class C2466t8 implements Runnable {

    /* renamed from: f */
    private final C2444r8 f6974f;

    /* renamed from: g */
    private final C2516y3 f6975g;

    /* renamed from: h */
    private final JobParameters f6976h;

    C2466t8(C2444r8 r8Var, C2516y3 y3Var, JobParameters jobParameters) {
        this.f6974f = r8Var;
        this.f6975g = y3Var;
        this.f6976h = jobParameters;
    }

    public final void run() {
        this.f6974f.mo7598a(this.f6975g, this.f6976h);
    }
}
