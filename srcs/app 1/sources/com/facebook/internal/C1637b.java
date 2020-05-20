package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.p034f0.C1558m;
import p071f.p129q.p130a.C3476a;

/* renamed from: com.facebook.internal.b */
public class C1637b extends BroadcastReceiver {

    /* renamed from: b */
    private static C1637b f5036b;

    /* renamed from: a */
    private Context f5037a;

    private C1637b(Context context) {
        this.f5037a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1637b m7181a(Context context) {
        C1637b bVar = f5036b;
        if (bVar != null) {
            return bVar;
        }
        C1637b bVar2 = new C1637b(context);
        f5036b = bVar2;
        bVar2.m7183b();
        return f5036b;
    }

    /* renamed from: a */
    private void m7182a() {
        C3476a.m14249a(this.f5037a).mo11086a((BroadcastReceiver) this);
    }

    /* renamed from: b */
    private void m7183b() {
        C3476a.m14249a(this.f5037a).mo11087a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            m7182a();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C1558m mVar = new C1558m(context);
        StringBuilder sb = new StringBuilder();
        sb.append("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            String str2 = "";
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", str2).replaceAll("[ -]*$", str2), (String) bundleExtra.get(str));
        }
        mVar.mo5772a(sb2, bundle);
    }
}
