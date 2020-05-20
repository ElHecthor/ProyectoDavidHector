package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.C2084e;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
final class C2057t0 implements Runnable {

    /* renamed from: f */
    private final C2059u0 f5944f;

    /* renamed from: g */
    final /* synthetic */ C2055s0 f5945g;

    C2057t0(C2055s0 s0Var, C2059u0 u0Var) {
        this.f5945g = s0Var;
        this.f5944f = u0Var;
    }

    public final void run() {
        if (this.f5945g.f5940g) {
            C2078b a = this.f5944f.mo6750a();
            if (a.mo6779h()) {
                C2055s0 s0Var = this.f5945g;
                s0Var.f5838f.startActivityForResult(GoogleApiActivity.m8313a(s0Var.mo6641a(), a.mo6778g(), this.f5944f.mo6751b(), false), 1);
            } else if (this.f5945g.f5943j.mo6808b(a.mo6775e())) {
                C2055s0 s0Var2 = this.f5945g;
                s0Var2.f5943j.mo6804a(s0Var2.mo6641a(), this.f5945g.f5838f, a.mo6775e(), 2, this.f5945g);
            } else if (a.mo6775e() == 18) {
                Dialog a2 = C2084e.m8610a(this.f5945g.mo6641a(), (OnCancelListener) this.f5945g);
                C2055s0 s0Var3 = this.f5945g;
                s0Var3.f5943j.mo6802a(s0Var3.mo6641a().getApplicationContext(), (C2019c0) new C2061v0(this, a2));
            } else {
                this.f5945g.mo6739a(a, this.f5944f.mo6751b());
            }
        }
    }
}
