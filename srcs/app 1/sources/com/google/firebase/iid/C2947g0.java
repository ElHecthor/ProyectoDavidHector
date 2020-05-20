package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p147g.p156d.p157a.p167b.p184g.C4343c;

/* renamed from: com.google.firebase.iid.g0 */
public final class C2947g0 extends Binder {

    /* renamed from: a */
    private final C2953i0 f8493a;

    public C2947g0(C2953i0 i0Var) {
        this.f8493a = i0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9662a(C2959k0 k0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "service received new intent via bind strategy");
            }
            this.f8493a.mo9666a(k0Var.f8505a).mo13007a(C2979t0.m12191a(), (C4343c<TResult>) new C2956j0<TResult>(k0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
