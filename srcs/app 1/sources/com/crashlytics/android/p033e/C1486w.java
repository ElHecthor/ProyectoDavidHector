package com.crashlytics.android.p033e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.crashlytics.android.e.w */
class C1486w {

    /* renamed from: f */
    private static final IntentFilter f4655f = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: g */
    private static final IntentFilter f4656g = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");

    /* renamed from: h */
    private static final IntentFilter f4657h = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");

    /* renamed from: a */
    private final AtomicBoolean f4658a = new AtomicBoolean(false);

    /* renamed from: b */
    private final Context f4659b;

    /* renamed from: c */
    private final BroadcastReceiver f4660c = new C1488b();

    /* renamed from: d */
    private final BroadcastReceiver f4661d = new C1487a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f4662e;

    /* renamed from: com.crashlytics.android.e.w$a */
    class C1487a extends BroadcastReceiver {
        C1487a() {
        }

        public void onReceive(Context context, Intent intent) {
            C1486w.this.f4662e = true;
        }
    }

    /* renamed from: com.crashlytics.android.e.w$b */
    class C1488b extends BroadcastReceiver {
        C1488b() {
        }

        public void onReceive(Context context, Intent intent) {
            C1486w.this.f4662e = false;
        }
    }

    public C1486w(Context context) {
        this.f4659b = context;
    }

    /* renamed from: a */
    public void mo5659a() {
        if (this.f4658a.getAndSet(false)) {
            this.f4659b.unregisterReceiver(this.f4661d);
            this.f4659b.unregisterReceiver(this.f4660c);
        }
    }

    /* renamed from: b */
    public void mo5660b() {
        boolean z = true;
        if (!this.f4658a.getAndSet(true)) {
            Intent registerReceiver = this.f4659b.registerReceiver(null, f4655f);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("status", -1);
            }
            if (!(i == 2 || i == 5)) {
                z = false;
            }
            this.f4662e = z;
            this.f4659b.registerReceiver(this.f4661d, f4656g);
            this.f4659b.registerReceiver(this.f4660c, f4657h);
        }
    }

    /* renamed from: c */
    public boolean mo5661c() {
        return this.f4662e;
    }
}
