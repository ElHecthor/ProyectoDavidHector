package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.C1499a;
import com.facebook.C1519d;
import com.facebook.C1631i;
import com.facebook.internal.C1698v;
import com.facebook.login.C1759j.C1763d;
import com.facebook.p034f0.C1558m;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.n */
abstract class C1778n implements Parcelable {

    /* renamed from: f */
    Map<String, String> f5349f;

    /* renamed from: g */
    protected C1759j f5350g;

    C1778n(Parcel parcel) {
        this.f5349f = C1698v.m7370a(parcel);
    }

    C1778n(C1759j jVar) {
        this.f5350g = jVar;
    }

    /* renamed from: a */
    static C1499a m7692a(Bundle bundle, C1519d dVar, String str) {
        Bundle bundle2 = bundle;
        Date a = C1698v.m7367a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a2 = C1698v.m7367a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C1698v.m7401c(string)) {
            return null;
        }
        C1499a aVar = new C1499a(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, dVar, a, new Date(), a2);
        return aVar;
    }

    /* renamed from: a */
    public static C1499a m7693a(Collection<String> collection, Bundle bundle, C1519d dVar, String str) {
        Bundle bundle2 = bundle;
        Date a = C1698v.m7367a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a2 = C1698v.m7367a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        String str2 = ",";
        Collection<String> arrayList = !C1698v.m7401c(string2) ? new ArrayList<>(Arrays.asList(string2.split(str2))) : collection;
        String string3 = bundle.getString("denied_scopes");
        Collection arrayList2 = !C1698v.m7401c(string3) ? new ArrayList(Arrays.asList(string3.split(str2))) : null;
        String string4 = bundle.getString("expired_scopes");
        Collection arrayList3 = !C1698v.m7401c(string4) ? new ArrayList(Arrays.asList(string4.split(str2))) : null;
        if (C1698v.m7401c(string)) {
            return null;
        }
        C1499a aVar = new C1499a(string, str, m7694c(bundle.getString("signed_request")), arrayList, arrayList2, arrayList3, dVar, a, new Date(), a2);
        return aVar;
    }

    /* renamed from: c */
    static String m7694c(String str) {
        if (str == null || str.isEmpty()) {
            throw new C1631i("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C1631i("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo6145a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo6020b());
            mo6017a(jSONObject);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating client state json: ");
            sb.append(e.getMessage());
            Log.w("LoginMethodHandler", sb.toString());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6060a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6146a(C1759j jVar) {
        if (this.f5350g == null) {
            this.f5350g = jVar;
            return;
        }
        throw new C1631i("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6147a(String str, Object obj) {
        if (this.f5349f == null) {
            this.f5349f = new HashMap();
        }
        this.f5349f.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6017a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6018a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo6019a(C1763d dVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract String mo6020b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6148b(String str) {
        String a = this.f5350g.mo6094g().mo6105a();
        C1558m mVar = new C1558m(this.f5350g.mo6087c(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a);
        mVar.mo5773a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo6149c() {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1698v.m7377a(parcel, this.f5349f);
    }
}
