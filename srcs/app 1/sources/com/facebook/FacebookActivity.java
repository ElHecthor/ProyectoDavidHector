package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C0425c;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.C0445l;
import androidx.fragment.app.C0466s;
import androidx.fragment.app.Fragment;
import com.facebook.common.C1515b;
import com.facebook.common.C1516c;
import com.facebook.internal.C1651f;
import com.facebook.internal.C1683q;
import com.facebook.internal.C1698v;
import com.facebook.login.C1768k;
import com.facebook.share.p045a.C1812a;
import com.facebook.share.p046b.C1823a;

public class FacebookActivity extends C0429d {

    /* renamed from: v */
    public static String f4686v = "PassThrough";

    /* renamed from: w */
    private static String f4687w = "SingleFragment";

    /* renamed from: x */
    private static final String f4688x = FacebookActivity.class.getName();

    /* renamed from: u */
    private Fragment f4689u;

    /* renamed from: s */
    private void m6749s() {
        setResult(0, C1683q.m7298a(getIntent(), (Bundle) null, C1683q.m7301a(C1683q.m7309b(getIntent()))));
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f4689u;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C1787m.m7758s()) {
            C1698v.m7399c(f4688x, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            C1787m.m7742c(getApplicationContext());
        }
        setContentView(C1516c.com_facebook_activity_layout);
        if (f4686v.equals(intent.getAction())) {
            m6749s();
        } else {
            this.f4689u = mo5680r();
        }
    }

    /* renamed from: q */
    public Fragment mo258q() {
        return this.f4689u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Fragment mo5680r() {
        C0425c cVar;
        Intent intent = getIntent();
        C0445l l = mo2666l();
        Fragment b = l.mo2777b(f4687w);
        if (b != null) {
            return b;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            C0425c fVar = new C1651f();
            fVar.mo2553i(true);
            cVar = fVar;
        } else {
            if ("DeviceShareDialogFragment".equals(intent.getAction())) {
                C1812a aVar = new C1812a();
                aVar.mo2553i(true);
                aVar.mo6237a((C1823a) intent.getParcelableExtra("content"));
                cVar = aVar;
            } else {
                C1768k kVar = new C1768k();
                kVar.mo2553i(true);
                C0466s b2 = l.mo2778b();
                b2.mo2912a(C1515b.com_facebook_fragment_container, (Fragment) kVar, f4687w);
                b2.mo2618a();
                return kVar;
            }
        }
        cVar.mo2649a(l, f4687w);
        return cVar;
    }
}
