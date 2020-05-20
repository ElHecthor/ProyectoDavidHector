package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.internal.C1650e;
import p071f.p129q.p130a.C3476a;

public class CustomTabMainActivity extends Activity {

    /* renamed from: h */
    public static final String f4679h;

    /* renamed from: i */
    public static final String f4680i;

    /* renamed from: j */
    public static final String f4681j;

    /* renamed from: k */
    public static final String f4682k;

    /* renamed from: f */
    private boolean f4683f = true;

    /* renamed from: g */
    private BroadcastReceiver f4684g;

    /* renamed from: com.facebook.CustomTabMainActivity$a */
    class C1498a extends BroadcastReceiver {
        C1498a() {
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f4682k);
            String str = CustomTabMainActivity.f4681j;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabMainActivity.class.getSimpleName());
        sb.append(".extra_params");
        f4679h = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabMainActivity.class.getSimpleName());
        sb2.append(".extra_chromePackage");
        f4680i = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(CustomTabMainActivity.class.getSimpleName());
        sb3.append(".extra_url");
        f4681j = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(CustomTabMainActivity.class.getSimpleName());
        sb4.append(".action_refresh");
        f4682k = sb4.toString();
    }

    /* renamed from: a */
    public static final String m6747a() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(C1787m.m7745f());
        sb.append("://authorize");
        return sb.toString();
    }

    /* renamed from: a */
    private void m6748a(int i, Intent intent) {
        C3476a.m14249a((Context) this).mo11086a(this.f4684g);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.f4675g.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(f4679h);
            new C1650e("oauth", bundleExtra).mo5892a(this, getIntent().getStringExtra(f4680i));
            this.f4683f = false;
            this.f4684g = new C1498a();
            C3476a.m14249a((Context) this).mo11087a(this.f4684g, new IntentFilter(CustomTabActivity.f4675g));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (f4682k.equals(intent.getAction())) {
            C3476a.m14249a((Context) this).mo11088a(new Intent(CustomTabActivity.f4676h));
        } else if (!CustomTabActivity.f4675g.equals(intent.getAction())) {
            return;
        }
        m6748a(-1, intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f4683f) {
            m6748a(0, null);
        }
        this.f4683f = true;
    }
}
