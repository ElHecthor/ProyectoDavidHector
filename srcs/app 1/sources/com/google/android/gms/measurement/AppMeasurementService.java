package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C2444r8;
import com.google.android.gms.measurement.internal.C2488v8;
import p071f.p124o.p125a.C3454a;

public final class AppMeasurementService extends Service implements C2488v8 {

    /* renamed from: f */
    private C2444r8<AppMeasurementService> f6215f;

    /* renamed from: a */
    private final C2444r8<AppMeasurementService> m9089a() {
        if (this.f6215f == null) {
            this.f6215f = new C2444r8<>(this);
        }
        return this.f6215f;
    }

    /* renamed from: a */
    public final void mo7027a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo7028a(Intent intent) {
        C3454a.m14161a(intent);
    }

    /* renamed from: a */
    public final boolean mo7029a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return m9089a().mo7595a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m9089a().mo7596a();
    }

    public final void onDestroy() {
        m9089a().mo7600b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m9089a().mo7602c(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m9089a().mo7594a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return m9089a().mo7601b(intent);
    }
}
