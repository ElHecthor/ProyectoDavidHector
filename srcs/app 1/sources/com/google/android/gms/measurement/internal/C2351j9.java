package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import p147g.p156d.p157a.p167b.p173d.p180g.C4095l6;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
public final class C2351j9 extends C2363k9 {

    /* renamed from: d */
    private final AlarmManager f6569d = ((AlarmManager) mo7096h().getSystemService("alarm"));

    /* renamed from: e */
    private final C2341j f6570e;

    /* renamed from: f */
    private Integer f6571f;

    protected C2351j9(C2399n9 n9Var) {
        super(n9Var);
        this.f6570e = new C2339i9(this, n9Var.mo7561t(), n9Var);
    }

    @TargetApi(24)
    /* renamed from: v */
    private final void m9547v() {
        ((JobScheduler) mo7096h().getSystemService("jobscheduler")).cancel(m9548w());
    }

    /* renamed from: w */
    private final int m9548w() {
        if (this.f6571f == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo7096h().getPackageName());
            this.f6571f = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f6571f.intValue();
    }

    /* renamed from: x */
    private final PendingIntent m9549x() {
        Context h = mo7096h();
        return PendingIntent.getBroadcast(h, 0, new Intent().setClassName(h, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: a */
    public final void mo7448a(long j) {
        mo7459r();
        mo7094f();
        Context h = mo7096h();
        if (!C2484v4.m9997a(h)) {
            mo7098j().mo7809A().mo7088a("Receiver not registered/enabled");
        }
        if (!C2489v9.m10011a(h, false)) {
            mo7098j().mo7809A().mo7088a("Service not registered/enabled");
        }
        mo7449u();
        mo7098j().mo7810B().mo7089a("Scheduling upload, millis", Long.valueOf(j));
        long c = mo7095g().mo6989c() + j;
        if (j < Math.max(0, ((Long) C2457t.f6952x.mo7587a(null)).longValue()) && !this.f6570e.mo7402b()) {
            this.f6570e.mo7401a(j);
        }
        mo7094f();
        if (VERSION.SDK_INT >= 24) {
            Context h2 = mo7096h();
            ComponentName componentName = new ComponentName(h2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int w = m9548w();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            C4095l6.m16758a(h2, new Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.f6569d.setInexactRepeating(2, c, Math.max(((Long) C2457t.f6942s.mo7587a(null)).longValue(), j), m9549x());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo7181t() {
        this.f6569d.cancel(m9549x());
        if (VERSION.SDK_INT >= 24) {
            m9547v();
        }
        return false;
    }

    /* renamed from: u */
    public final void mo7449u() {
        mo7459r();
        mo7098j().mo7810B().mo7088a("Unscheduling upload");
        this.f6569d.cancel(m9549x());
        this.f6570e.mo7403c();
        if (VERSION.SDK_INT >= 24) {
            m9547v();
        }
    }
}
