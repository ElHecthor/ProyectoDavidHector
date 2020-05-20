package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import p147g.p156d.p157a.p167b.p173d.p180g.C4100lb;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
public final class C2521y8 extends C2285e3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f7106c;

    /* renamed from: d */
    protected final C2327h9 f7107d = new C2327h9(this);

    /* renamed from: e */
    protected final C2291e9 f7108e = new C2291e9(this);

    /* renamed from: f */
    private final C2532z8 f7109f = new C2532z8(this);

    C2521y8(C2263c5 c5Var) {
        super(c5Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m10158B() {
        mo7274c();
        if (this.f7106c == null) {
            this.f7106c = new C4100lb(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m10159a(long j) {
        mo7274c();
        m10158B();
        mo7098j().mo7810B().mo7089a("Activity resumed, time", Long.valueOf(j));
        if (mo7827m().mo7108a(C2457t.f6871E0)) {
            if (mo7827m().mo7126s().booleanValue() || mo7826l().f6641x.mo7517a()) {
                this.f7108e.mo7267a(j);
            }
            this.f7109f.mo7847a();
        } else {
            this.f7109f.mo7847a();
            if (mo7827m().mo7126s().booleanValue()) {
                this.f7108e.mo7267a(j);
            }
        }
        C2327h9 h9Var = this.f7107d;
        h9Var.f6506a.mo7274c();
        if (h9Var.f6506a.f7100a.mo7204c()) {
            if (!h9Var.f6506a.mo7827m().mo7108a(C2457t.f6871E0)) {
                h9Var.f6506a.mo7826l().f6641x.mo7516a(false);
            }
            h9Var.mo7372a(h9Var.f6506a.mo7095g().mo6988b(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m10163b(long j) {
        mo7274c();
        m10158B();
        mo7098j().mo7810B().mo7089a("Activity paused, time", Long.valueOf(j));
        this.f7109f.mo7848a(j);
        if (mo7827m().mo7126s().booleanValue()) {
            this.f7108e.mo7270b(j);
        }
        C2327h9 h9Var = this.f7107d;
        if (!h9Var.f6506a.mo7827m().mo7108a(C2457t.f6871E0)) {
            h9Var.f6506a.mo7826l().f6641x.mo7516a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo7242A() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo7830a(boolean z, boolean z2, long j) {
        return this.f7108e.mo7268a(z, z2, j);
    }
}
