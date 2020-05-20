package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C1703w;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.y */
final class C1849y {

    /* renamed from: a */
    private final SharedPreferences f5484a = C1787m.m7744e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C1849y() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6302a() {
        this.f5484a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6303a(C1846x xVar) {
        C1703w.m7423a((Object) xVar, "profile");
        JSONObject a = xVar.mo6295a();
        if (a != null) {
            this.f5484a.edit().putString("com.facebook.ProfileManager.CachedProfile", a.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1846x mo6304b() {
        String string = this.f5484a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new C1846x(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
