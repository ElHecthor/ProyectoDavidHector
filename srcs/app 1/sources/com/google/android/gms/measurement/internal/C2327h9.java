package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Bundle;
import android.text.TextUtils;
import p147g.p156d.p157a.p167b.p173d.p180g.C4098l9;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
final class C2327h9 {

    /* renamed from: a */
    final /* synthetic */ C2521y8 f6506a;

    C2327h9(C2521y8 y8Var) {
        this.f6506a = y8Var;
    }

    /* renamed from: b */
    private final void m9432b(long j, boolean z) {
        this.f6506a.mo7274c();
        if (this.f6506a.f7100a.mo7204c()) {
            this.f6506a.mo7826l().f6639v.mo7571a(j);
            String str = "Session started, time";
            this.f6506a.mo7098j().mo7810B().mo7089a(str, Long.valueOf(this.f6506a.mo7095g().mo6989c()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f6506a.mo7277p().mo7434a("auto", "_sid", (Object) valueOf, j);
            this.f6506a.mo7826l().f6635r.mo7516a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f6506a.mo7827m().mo7108a(C2457t.f6941r0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f6506a.mo7277p().mo7429a("auto", "_s", j, bundle);
            if (C4098l9.m16775b() && this.f6506a.mo7827m().mo7108a(C2457t.f6951w0)) {
                String a = this.f6506a.mo7826l().f6616A.mo7589a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f6506a.mo7277p().mo7429a("auto", "_ssr", j, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7371a() {
        this.f6506a.mo7274c();
        if (this.f6506a.mo7826l().mo7471a(this.f6506a.mo7095g().mo6988b())) {
            this.f6506a.mo7826l().f6635r.mo7516a(true);
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f6506a.mo7098j().mo7810B().mo7088a("Detected application was in foreground");
                m9432b(this.f6506a.mo7095g().mo6988b(), false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7372a(long j, boolean z) {
        this.f6506a.mo7274c();
        this.f6506a.m10158B();
        if (this.f6506a.mo7826l().mo7471a(j)) {
            this.f6506a.mo7826l().f6635r.mo7516a(true);
        }
        this.f6506a.mo7826l().f6639v.mo7571a(j);
        if (this.f6506a.mo7826l().f6635r.mo7517a()) {
            m9432b(j, z);
        }
    }
}
