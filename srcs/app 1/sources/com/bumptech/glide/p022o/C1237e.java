package com.bumptech.glide.p022o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p022o.C1234c.C1235a;
import com.bumptech.glide.p029t.C1309j;

/* renamed from: com.bumptech.glide.o.e */
final class C1237e implements C1234c {

    /* renamed from: f */
    private final Context f4135f;

    /* renamed from: g */
    final C1235a f4136g;

    /* renamed from: h */
    boolean f4137h;

    /* renamed from: i */
    private boolean f4138i;

    /* renamed from: j */
    private final BroadcastReceiver f4139j = new C1238a();

    /* renamed from: com.bumptech.glide.o.e$a */
    class C1238a extends BroadcastReceiver {
        C1238a() {
        }

        public void onReceive(Context context, Intent intent) {
            C1237e eVar = C1237e.this;
            boolean z = eVar.f4137h;
            eVar.f4137h = eVar.mo5186a(context);
            if (z != C1237e.this.f4137h) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(C1237e.this.f4137h);
                    Log.d(str, sb.toString());
                }
                C1237e eVar2 = C1237e.this;
                eVar2.f4136g.mo4608a(eVar2.f4137h);
            }
        }
    }

    C1237e(Context context, C1235a aVar) {
        this.f4135f = context.getApplicationContext();
        this.f4136g = aVar;
    }

    /* renamed from: e */
    private void m5804e() {
        if (!this.f4138i) {
            this.f4137h = mo5186a(this.f4135f);
            try {
                this.f4135f.registerReceiver(this.f4139j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f4138i = true;
            } catch (SecurityException e) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: f */
    private void m5805f() {
        if (this.f4138i) {
            this.f4135f.unregisterReceiver(this.f4139j);
            this.f4138i = false;
        }
    }

    /* renamed from: a */
    public void mo4587a() {
        m5804e();
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public boolean mo5186a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C1309j.m6149a(connectivityManager);
        boolean z = true;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            }
            return z;
        } catch (RuntimeException e) {
            String str = "ConnectivityMonitor";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo4592b() {
        m5805f();
    }

    /* renamed from: d */
    public void mo4594d() {
    }
}
