package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4350h;

/* renamed from: com.google.firebase.iid.d1 */
final /* synthetic */ class C2939d1 implements C4343c {

    /* renamed from: a */
    private final boolean f8463a;

    /* renamed from: b */
    private final PendingResult f8464b;

    C2939d1(boolean z, PendingResult pendingResult) {
        this.f8463a = z;
        this.f8464b = pendingResult;
    }

    /* renamed from: a */
    public final void mo9640a(C4350h hVar) {
        FirebaseInstanceIdReceiver.m12095a(this.f8463a, this.f8464b, hVar);
    }
}
