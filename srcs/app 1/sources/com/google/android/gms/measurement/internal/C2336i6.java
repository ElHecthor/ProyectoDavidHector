package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p147g.p156d.p157a.p167b.p173d.p180g.C4240ua;

/* renamed from: com.google.android.gms.measurement.internal.i6 */
final /* synthetic */ class C2336i6 implements Runnable {

    /* renamed from: f */
    private final C2348j6 f6522f;

    /* renamed from: g */
    private final Bundle f6523g;

    C2336i6(C2348j6 j6Var, Bundle bundle) {
        this.f6522f = j6Var;
        this.f6523g = bundle;
    }

    public final void run() {
        C2348j6 j6Var = this.f6522f;
        Bundle bundle = this.f6523g;
        if (C4240ua.m17281b() && j6Var.mo7827m().mo7108a(C2457t.f6891O0)) {
            if (bundle == null) {
                j6Var.mo7826l().f6619D.mo7579a(new Bundle());
                return;
            }
            Bundle a = j6Var.mo7826l().f6619D.mo7578a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    j6Var.mo7825k();
                    if (C2489v9.m10015a(obj)) {
                        j6Var.mo7825k().mo7688a(27, (String) null, (String) null, 0);
                    }
                    j6Var.mo7098j().mo7820y().mo7090a("Invalid default event parameter type. Name, value", str, obj);
                } else if (C2489v9.m10029f(str)) {
                    j6Var.mo7098j().mo7820y().mo7089a("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else if (j6Var.mo7825k().mo7702a("param", str, 100, obj)) {
                    j6Var.mo7825k().mo7690a(a, str, obj);
                }
            }
            j6Var.mo7825k();
            if (C2489v9.m10013a(a, j6Var.mo7827m().mo7121n())) {
                j6Var.mo7825k().mo7688a(26, (String) null, (String) null, 0);
                j6Var.mo7098j().mo7820y().mo7088a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            j6Var.mo7826l().f6619D.mo7579a(a);
        }
    }
}
