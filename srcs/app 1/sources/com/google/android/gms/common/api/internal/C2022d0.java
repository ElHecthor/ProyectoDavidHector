package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
public final class C2022d0 extends BroadcastReceiver {

    /* renamed from: a */
    private Context f5861a;

    /* renamed from: b */
    private final C2019c0 f5862b;

    public C2022d0(C2019c0 c0Var) {
        this.f5862b = c0Var;
    }

    /* renamed from: a */
    public final synchronized void mo6677a() {
        if (this.f5861a != null) {
            this.f5861a.unregisterReceiver(this);
        }
        this.f5861a = null;
    }

    /* renamed from: a */
    public final void mo6678a(Context context) {
        this.f5861a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5862b.mo6670a();
            mo6677a();
        }
    }
}
