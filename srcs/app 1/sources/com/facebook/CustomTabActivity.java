package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p071f.p129q.p130a.C3476a;

public class CustomTabActivity extends Activity {

    /* renamed from: g */
    public static final String f4675g;

    /* renamed from: h */
    public static final String f4676h;

    /* renamed from: f */
    private BroadcastReceiver f4677f;

    /* renamed from: com.facebook.CustomTabActivity$a */
    class C1497a extends BroadcastReceiver {
        C1497a() {
        }

        public void onReceive(Context context, Intent intent) {
            CustomTabActivity.this.finish();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabActivity.class.getSimpleName());
        sb.append(".action_customTabRedirect");
        f4675g = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabActivity.class.getSimpleName());
        sb2.append(".action_destroy");
        f4676h = sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f4675g);
            intent2.putExtra(CustomTabMainActivity.f4681j, getIntent().getDataString());
            C3476a.m14249a((Context) this).mo11088a(intent2);
            this.f4677f = new C1497a();
            C3476a.m14249a((Context) this).mo11087a(this.f4677f, new IntentFilter(f4676h));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f4675g);
        intent.putExtra(CustomTabMainActivity.f4681j, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C3476a.m14249a((Context) this).mo11086a(this.f4677f);
        super.onDestroy();
    }
}
