package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.measurement.internal.C2488v8;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
public final class C2444r8<T extends Context & C2488v8> {

    /* renamed from: a */
    private final T f6844a;

    public C2444r8(T t) {
        C2148s.m8834a(t);
        this.f6844a = t;
    }

    /* renamed from: a */
    private final void m9758a(Runnable runnable) {
        C2399n9 a = C2399n9.m9655a((Context) this.f6844a);
        a.mo7097i().mo7841a((Runnable) new C2499w8(this, a, runnable));
    }

    /* renamed from: c */
    private final C2516y3 m9759c() {
        return C2263c5.m9228a(this.f6844a, null, null).mo7098j();
    }

    /* renamed from: a */
    public final int mo7594a(Intent intent, int i, int i2) {
        C2263c5 a = C2263c5.m9228a(this.f6844a, null, null);
        C2516y3 j = a.mo7098j();
        if (intent == null) {
            j.mo7818w().mo7088a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo7094f();
        j.mo7810B().mo7090a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m9758a((Runnable) new C2477u8(this, i2, j, intent));
        }
        return 2;
    }

    /* renamed from: a */
    public final IBinder mo7595a(Intent intent) {
        if (intent == null) {
            m9759c().mo7815t().mo7088a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C2335i5(C2399n9.m9655a((Context) this.f6844a));
        }
        m9759c().mo7818w().mo7089a("onBind received unknown action", action);
        return null;
    }

    /* renamed from: a */
    public final void mo7596a() {
        C2263c5 a = C2263c5.m9228a(this.f6844a, null, null);
        C2516y3 j = a.mo7098j();
        a.mo7094f();
        j.mo7810B().mo7088a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo7597a(int i, C2516y3 y3Var, Intent intent) {
        if (((C2488v8) this.f6844a).mo7029a(i)) {
            y3Var.mo7810B().mo7089a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m9759c().mo7810B().mo7088a("Completed wakeful intent.");
            ((C2488v8) this.f6844a).mo7028a(intent);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo7598a(C2516y3 y3Var, JobParameters jobParameters) {
        y3Var.mo7810B().mo7088a("AppMeasurementJobService processed last upload request.");
        ((C2488v8) this.f6844a).mo7027a(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean mo7599a(JobParameters jobParameters) {
        C2263c5 a = C2263c5.m9228a(this.f6844a, null, null);
        C2516y3 j = a.mo7098j();
        String string = jobParameters.getExtras().getString("action");
        a.mo7094f();
        j.mo7810B().mo7089a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m9758a((Runnable) new C2466t8(this, j, jobParameters));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo7600b() {
        C2263c5 a = C2263c5.m9228a(this.f6844a, null, null);
        C2516y3 j = a.mo7098j();
        a.mo7094f();
        j.mo7810B().mo7088a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: b */
    public final boolean mo7601b(Intent intent) {
        if (intent == null) {
            m9759c().mo7815t().mo7088a("onUnbind called with null intent");
            return true;
        }
        m9759c().mo7810B().mo7089a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: c */
    public final void mo7602c(Intent intent) {
        if (intent == null) {
            m9759c().mo7815t().mo7088a("onRebind called with null intent");
            return;
        }
        m9759c().mo7810B().mo7089a("onRebind called. action", intent.getAction());
    }
}
