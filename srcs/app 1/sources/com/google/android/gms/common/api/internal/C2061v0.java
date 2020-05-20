package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
final class C2061v0 extends C2019c0 {

    /* renamed from: a */
    private final /* synthetic */ Dialog f5949a;

    /* renamed from: b */
    private final /* synthetic */ C2057t0 f5950b;

    C2061v0(C2057t0 t0Var, Dialog dialog) {
        this.f5950b = t0Var;
        this.f5949a = dialog;
    }

    /* renamed from: a */
    public final void mo6670a() {
        this.f5950b.f5945g.mo6747g();
        if (this.f5949a.isShowing()) {
            this.f5949a.dismiss();
        }
    }
}
