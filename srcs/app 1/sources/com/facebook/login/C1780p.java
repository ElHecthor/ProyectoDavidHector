package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C1519d;
import com.facebook.C1631i;
import com.facebook.internal.C1696t;
import com.facebook.internal.C1698v;
import com.facebook.login.C1759j.C1763d;
import com.facebook.login.C1759j.C1765e;

/* renamed from: com.facebook.login.p */
abstract class C1780p extends C1778n {
    C1780p(Parcel parcel) {
        super(parcel);
    }

    C1780p(C1759j jVar) {
        super(jVar);
    }

    /* renamed from: a */
    private C1765e m7707a(C1763d dVar, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m7708a(extras);
        String str = "error_code";
        String obj = extras.get(str) != null ? extras.get(str).toString() : null;
        return "CONNECTION_FAILURE".equals(obj) ? C1765e.m7640a(dVar, a, m7710b(extras), obj) : C1765e.m7638a(dVar, a);
    }

    /* renamed from: a */
    private String m7708a(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* renamed from: b */
    private C1765e m7709b(C1763d dVar, Intent intent) {
        Bundle extras = intent.getExtras();
        String a = m7708a(extras);
        String str = "error_code";
        String obj = extras.get(str) != null ? extras.get(str).toString() : null;
        String b = m7710b(extras);
        String string = extras.getString("e2e");
        if (!C1698v.m7401c(string)) {
            mo6148b(string);
        }
        if (a == null && obj == null && b == null) {
            try {
                return C1765e.m7637a(dVar, C1778n.m7693a(dVar.mo6115h(), extras, C1519d.FACEBOOK_APPLICATION_WEB, dVar.mo6105a()));
            } catch (C1631i e) {
                return C1765e.m7639a(dVar, null, e.getMessage());
            }
        } else if (C1696t.f5152a.contains(a)) {
            return null;
        } else {
            return C1696t.f5153b.contains(a) ? C1765e.m7638a(dVar, (String) null) : C1765e.m7640a(dVar, a, b, obj);
        }
    }

    /* renamed from: b */
    private String m7710b(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6018a(int i, int i2, Intent intent) {
        C1763d g = this.f5350g.mo6094g();
        C1765e eVar = intent == null ? C1765e.m7638a(g, "Operation canceled") : i2 == 0 ? m7707a(g, intent) : i2 != -1 ? C1765e.m7639a(g, "Unexpected resultCode from authorization.", null) : m7709b(g, intent);
        if (eVar != null) {
            this.f5350g.mo6084b(eVar);
        } else {
            this.f5350g.mo6098k();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6152a(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f5350g.mo6092e().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
