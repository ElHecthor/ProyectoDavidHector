package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C1703w;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
class C1503b {

    /* renamed from: a */
    private final SharedPreferences f4709a;

    /* renamed from: b */
    private final C1504a f4710b;

    /* renamed from: c */
    private C1844v f4711c;

    /* renamed from: com.facebook.b$a */
    static class C1504a {
        C1504a() {
        }

        /* renamed from: a */
        public C1844v mo5712a() {
            return new C1844v(C1787m.m7744e());
        }
    }

    public C1503b() {
        this(C1787m.m7744e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C1504a());
    }

    C1503b(SharedPreferences sharedPreferences, C1504a aVar) {
        this.f4709a = sharedPreferences;
        this.f4710b = aVar;
    }

    /* renamed from: c */
    private C1499a m6780c() {
        String string = this.f4709a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return C1499a.m6754a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private C1499a m6781d() {
        Bundle b = m6782e().mo6294b();
        if (b == null || !C1844v.m7932d(b)) {
            return null;
        }
        return C1499a.m6752a(b);
    }

    /* renamed from: e */
    private C1844v m6782e() {
        if (this.f4711c == null) {
            synchronized (this) {
                if (this.f4711c == null) {
                    this.f4711c = this.f4710b.mo5712a();
                }
            }
        }
        return this.f4711c;
    }

    /* renamed from: f */
    private boolean m6783f() {
        return this.f4709a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: g */
    private boolean m6784g() {
        return C1787m.m7759t();
    }

    /* renamed from: a */
    public void mo5709a() {
        this.f4709a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m6784g()) {
            m6782e().mo6293a();
        }
    }

    /* renamed from: a */
    public void mo5710a(C1499a aVar) {
        C1703w.m7423a((Object) aVar, "accessToken");
        try {
            this.f4709a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.mo5695m().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public C1499a mo5711b() {
        if (m6783f()) {
            return m6780c();
        }
        if (!m6784g()) {
            return null;
        }
        C1499a d = m6781d();
        if (d == null) {
            return d;
        }
        mo5710a(d);
        m6782e().mo6293a();
        return d;
    }
}
