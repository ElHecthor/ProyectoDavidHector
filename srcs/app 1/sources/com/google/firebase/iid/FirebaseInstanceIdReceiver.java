package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p071f.p124o.p125a.C3454a;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4350h;

public final class FirebaseInstanceIdReceiver extends C3454a {

    /* renamed from: c */
    private final ExecutorService f8439c = C2979t0.m12192b();

    /* renamed from: a */
    static final /* synthetic */ void m12095a(boolean z, PendingResult pendingResult, C4350h hVar) {
        if (z) {
            pendingResult.setResultCode(hVar.mo13021e() ? ((Integer) hVar.mo13016b()).intValue() : 500);
        }
        pendingResult.finish();
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent(null);
            intent.setPackage(context.getPackageName());
            if (VERSION.SDK_INT <= 18) {
                intent.removeCategory(context.getPackageName());
            }
            ("google.com/iid".equals(intent.getStringExtra("from")) ? new C2963l1(this.f8439c) : new C2934c(context, this.f8439c)).mo9634a(intent).mo13007a((Executor) this.f8439c, (C4343c<TResult>) new C2939d1<TResult>(isOrderedBroadcast(), goAsync()));
        }
    }
}
