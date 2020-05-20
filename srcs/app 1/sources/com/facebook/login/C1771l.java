package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.C1759j.C1763d;
import com.facebook.p034f0.C1558m;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.l */
class C1771l {

    /* renamed from: a */
    private final C1558m f5335a;

    /* renamed from: b */
    private String f5336b;

    /* renamed from: c */
    private String f5337c;

    C1771l(Context context, String str) {
        this.f5336b = str;
        this.f5335a = new C1558m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.f5337c = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    static Bundle m7658a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        String str2 = "";
        bundle.putString("3_method", str2);
        bundle.putString("2_result", str2);
        bundle.putString("5_error_message", str2);
        bundle.putString("4_error_code", str2);
        bundle.putString("6_extras", str2);
        return bundle;
    }

    /* renamed from: a */
    public String mo6127a() {
        return this.f5336b;
    }

    /* renamed from: a */
    public void mo6128a(C1763d dVar) {
        Bundle a = m7658a(dVar.mo6108b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", dVar.mo6114g().toString());
            jSONObject.put("request_code", C1759j.m7599s());
            jSONObject.put("permissions", TextUtils.join(",", dVar.mo6115h()));
            jSONObject.put("default_audience", dVar.mo6110d().toString());
            jSONObject.put("isReauthorize", dVar.mo6117j());
            if (this.f5337c != null) {
                jSONObject.put("facebookVersion", this.f5337c);
            }
            a.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f5335a.mo5773a("fb_mobile_login_start", (Double) null, a);
    }

    /* renamed from: a */
    public void mo6129a(String str, String str2) {
        Bundle a = m7658a(str);
        a.putString("3_method", str2);
        this.f5335a.mo5776b("fb_mobile_login_method_not_tried", a);
    }

    /* renamed from: a */
    public void mo6130a(String str, String str2, String str3) {
        Bundle a = m7658a("");
        a.putString("2_result", C1767b.ERROR.mo6125f());
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f5335a.mo5776b(str, a);
    }

    /* renamed from: a */
    public void mo6131a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle a = m7658a(str);
        if (str3 != null) {
            a.putString("2_result", str3);
        }
        if (str4 != null) {
            a.putString("5_error_message", str4);
        }
        if (str5 != null) {
            a.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            a.putString("6_extras", new JSONObject(map).toString());
        }
        a.putString("3_method", str2);
        this.f5335a.mo5776b("fb_mobile_login_method_complete", a);
    }

    /* renamed from: a */
    public void mo6132a(String str, Map<String, String> map, C1767b bVar, Map<String, String> map2, Exception exc) {
        Bundle a = m7658a(str);
        if (bVar != null) {
            a.putString("2_result", bVar.mo6125f());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            a.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f5335a.mo5776b("fb_mobile_login_complete", a);
    }

    /* renamed from: b */
    public void mo6133b(String str, String str2) {
        Bundle a = m7658a(str);
        a.putString("3_method", str2);
        this.f5335a.mo5776b("fb_mobile_login_method_start", a);
    }

    /* renamed from: c */
    public void mo6134c(String str, String str2) {
        mo6130a(str, str2, "");
    }
}
