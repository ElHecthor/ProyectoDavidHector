package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.iid.e0 */
final class C2941e0 extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    private C2944f0 f8470a;

    public C2941e0(C2944f0 f0Var) {
        this.f8470a = f0Var;
    }

    /* renamed from: a */
    public final void mo9643a() {
        if (FirebaseInstanceId.m12069l()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f8470a.mo9655a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C2944f0 f0Var = this.f8470a;
        if (f0Var != null && f0Var.mo9656b()) {
            if (FirebaseInstanceId.m12069l()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m12063a((Runnable) this.f8470a, 0);
            this.f8470a.mo9655a().unregisterReceiver(this);
            this.f8470a = null;
        }
    }
}
