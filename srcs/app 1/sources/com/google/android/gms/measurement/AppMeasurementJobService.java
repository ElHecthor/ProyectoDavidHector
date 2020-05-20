package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2444r8;
import com.google.android.gms.measurement.internal.C2488v8;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C2488v8 {

    /* renamed from: f */
    private C2444r8<AppMeasurementJobService> f6213f;

    /* renamed from: a */
    private final C2444r8<AppMeasurementJobService> m9084a() {
        if (this.f6213f == null) {
            this.f6213f = new C2444r8<>(this);
        }
        return this.f6213f;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo7027a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: a */
    public final void mo7028a(Intent intent) {
    }

    /* renamed from: a */
    public final boolean mo7029a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        m9084a().mo7596a();
    }

    public final void onDestroy() {
        m9084a().mo7600b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m9084a().mo7602c(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m9084a().mo7599a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return m9084a().mo7601b(intent);
    }
}
