package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C2148s;
import p147g.p156d.p157a.p167b.p173d.p180g.C4100lb;

/* renamed from: com.google.android.gms.measurement.internal.j */
abstract class C2341j {

    /* renamed from: d */
    private static volatile Handler f6535d;

    /* renamed from: a */
    private final C2240a6 f6536a;

    /* renamed from: b */
    private final Runnable f6537b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile long f6538c;

    C2341j(C2240a6 a6Var) {
        C2148s.m8834a(a6Var);
        this.f6536a = a6Var;
        this.f6537b = new C2329i(this, a6Var);
    }

    /* renamed from: d */
    private final Handler m9482d() {
        Handler handler;
        if (f6535d != null) {
            return f6535d;
        }
        synchronized (C2341j.class) {
            if (f6535d == null) {
                f6535d = new C4100lb(this.f6536a.mo7096h().getMainLooper());
            }
            handler = f6535d;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo7230a();

    /* renamed from: a */
    public final void mo7401a(long j) {
        mo7403c();
        if (j >= 0) {
            this.f6538c = this.f6536a.mo7095g().mo6988b();
            if (!m9482d().postDelayed(this.f6537b, j)) {
                this.f6536a.mo7098j().mo7815t().mo7089a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo7402b() {
        return this.f6538c != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo7403c() {
        this.f6538c = 0;
        m9482d().removeCallbacks(this.f6537b);
    }
}
