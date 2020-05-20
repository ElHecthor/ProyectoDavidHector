package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C1787m;
import p071f.p085c.p086b.C3155b;
import p071f.p085c.p086b.C3155b.C3156a;

/* renamed from: com.facebook.internal.e */
public class C1650e {

    /* renamed from: a */
    private Uri f5052a;

    public C1650e(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String b = C1696t.m7348b();
        StringBuilder sb = new StringBuilder();
        sb.append(C1787m.m7753n());
        sb.append("/");
        sb.append("dialog/");
        sb.append(str);
        this.f5052a = C1698v.m7356a(b, sb.toString(), bundle);
    }

    /* renamed from: a */
    public void mo5892a(Activity activity, String str) {
        C3155b a = new C3156a().mo10147a();
        a.f8933a.setPackage(str);
        a.f8933a.addFlags(1073741824);
        a.mo10146a(activity, this.f5052a);
    }
}
