package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.b0 */
final class C2932b0 {

    /* renamed from: d */
    private static final long f8445d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f8446a;

    /* renamed from: b */
    private final String f8447b;

    /* renamed from: c */
    private final long f8448c;

    private C2932b0(String str, String str2, long j) {
        this.f8446a = str;
        this.f8447b = str2;
        this.f8448c = j;
    }

    /* renamed from: a */
    static String m12099a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    static C2932b0 m12100b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C2932b0(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C2932b0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9632a(String str) {
        return System.currentTimeMillis() > this.f8448c + f8445d || !str.equals(this.f8447b);
    }
}
