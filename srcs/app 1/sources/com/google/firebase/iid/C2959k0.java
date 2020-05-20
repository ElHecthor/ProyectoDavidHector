package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.firebase.iid.k0 */
final class C2959k0 {

    /* renamed from: a */
    final Intent f8505a;

    /* renamed from: b */
    private final C4351i<Void> f8506b = new C4351i<>();

    C2959k0(Intent intent) {
        this.f8505a = intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4350h<Void> mo9671a() {
        return this.f8506b.mo13025a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo9672b() {
        this.f8506b.mo13029b(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9673c() {
        String action = this.f8505a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        mo9672b();
    }
}
