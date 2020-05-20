package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
class C2346j4 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2399n9 f6543a;

    /* renamed from: b */
    private boolean f6544b;

    /* renamed from: c */
    private boolean f6545c;

    static {
        Class<C2346j4> cls = C2346j4.class;
    }

    C2346j4(C2399n9 n9Var) {
        C2148s.m8834a(n9Var);
        this.f6543a = n9Var;
    }

    /* renamed from: a */
    public final void mo7404a() {
        this.f6543a.mo7557p();
        this.f6543a.mo7097i().mo7274c();
        if (!this.f6544b) {
            this.f6543a.mo7096h().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6545c = this.f6543a.mo7549d().mo7355u();
            this.f6543a.mo7098j().mo7810B().mo7089a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6545c));
            this.f6544b = true;
        }
    }

    /* renamed from: b */
    public final void mo7405b() {
        this.f6543a.mo7557p();
        this.f6543a.mo7097i().mo7274c();
        this.f6543a.mo7097i().mo7274c();
        if (this.f6544b) {
            this.f6543a.mo7098j().mo7810B().mo7088a("Unregistering connectivity change receiver");
            this.f6544b = false;
            this.f6545c = false;
            try {
                this.f6543a.mo7096h().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6543a.mo7098j().mo7815t().mo7089a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f6543a.mo7557p();
        String action = intent.getAction();
        this.f6543a.mo7098j().mo7810B().mo7089a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean u = this.f6543a.mo7549d().mo7355u();
            if (this.f6545c != u) {
                this.f6545c = u;
                this.f6543a.mo7097i().mo7841a((Runnable) new C2382m4(this, u));
            }
            return;
        }
        this.f6543a.mo7098j().mo7818w().mo7089a("NetworkBroadcastReceiver received unknown action", action);
    }
}
