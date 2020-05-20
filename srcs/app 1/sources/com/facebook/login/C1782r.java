package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.C1499a;
import com.facebook.C1519d;
import com.facebook.C1631i;
import com.facebook.C1729k;
import com.facebook.C1730l;
import com.facebook.C1787m;
import com.facebook.C1795o;
import com.facebook.internal.C1698v;
import com.facebook.login.C1759j.C1763d;
import com.facebook.login.C1759j.C1765e;
import java.util.Collection;
import java.util.Locale;

/* renamed from: com.facebook.login.r */
abstract class C1782r extends C1778n {

    /* renamed from: h */
    private String f5353h;

    C1782r(Parcel parcel) {
        super(parcel);
    }

    C1782r(C1759j jVar) {
        super(jVar);
    }

    /* renamed from: d */
    private void m7714d(String str) {
        this.f5350g.mo6087c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* renamed from: f */
    private static final String m7715f() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(C1787m.m7745f());
        sb.append("://authorize");
        return sb.toString();
    }

    /* renamed from: g */
    private String m7716g() {
        return this.f5350g.mo6087c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo6153a(Bundle bundle, C1763d dVar) {
        bundle.putString("redirect_uri", m7715f());
        bundle.putString("client_id", dVar.mo6105a());
        bundle.putString("e2e", C1759j.m7597n());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", dVar.mo6109c());
        if (mo6021d() != null) {
            bundle.putString("sso", mo6021d());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6154a(C1763d dVar, Bundle bundle, C1631i iVar) {
        C1765e eVar;
        String str;
        this.f5353h = null;
        if (bundle != null) {
            String str2 = "e2e";
            if (bundle.containsKey(str2)) {
                this.f5353h = bundle.getString(str2);
            }
            try {
                C1499a a = C1778n.m7693a(dVar.mo6115h(), bundle, mo6023e(), dVar.mo6105a());
                eVar = C1765e.m7637a(this.f5350g.mo6094g(), a);
                CookieSyncManager.createInstance(this.f5350g.mo6087c()).sync();
                m7714d(a.mo5692i());
            } catch (C1631i e) {
                eVar = C1765e.m7639a(this.f5350g.mo6094g(), null, e.getMessage());
            }
        } else if (iVar instanceof C1729k) {
            eVar = C1765e.m7638a(this.f5350g.mo6094g(), "User canceled log in.");
        } else {
            this.f5353h = null;
            String message = iVar.getMessage();
            if (iVar instanceof C1795o) {
                C1730l a2 = ((C1795o) iVar).mo6167a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a2.mo6005a())});
                message = a2.toString();
            } else {
                str = null;
            }
            eVar = C1765e.m7640a(this.f5350g.mo6094g(), null, message, str);
        }
        if (!C1698v.m7401c(this.f5353h)) {
            mo6148b(this.f5353h);
        }
        this.f5350g.mo6084b(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bundle mo6155b(C1763d dVar) {
        String str;
        Bundle bundle = new Bundle();
        if (!C1698v.m7389a((Collection<T>) dVar.mo6115h())) {
            String join = TextUtils.join(",", dVar.mo6115h());
            String str2 = "scope";
            bundle.putString(str2, join);
            mo6147a(str2, join);
        }
        bundle.putString("default_audience", dVar.mo6110d().mo6027f());
        bundle.putString("state", mo6145a(dVar.mo6108b()));
        C1499a r = C1499a.m6759r();
        String i = r != null ? r.mo5692i() : null;
        String str3 = "access_token";
        if (i == null || !i.equals(m7716g())) {
            C1698v.m7373a((Context) this.f5350g.mo6087c());
            str = "0";
        } else {
            bundle.putString(str3, i);
            str = "1";
        }
        mo6147a(str3, str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo6021d() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract C1519d mo6023e();
}
