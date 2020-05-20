package com.facebook.internal.p042y.p044d;

import com.facebook.internal.p042y.C1717b;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.y.d.a */
public final class C1723a {

    /* renamed from: a */
    private String f5215a;

    /* renamed from: b */
    private String f5216b;

    /* renamed from: c */
    private Long f5217c;

    public C1723a(File file) {
        String name = file.getName();
        this.f5215a = name;
        JSONObject a = C1717b.m7475a(name, true);
        if (a != null) {
            this.f5217c = Long.valueOf(a.optLong("timestamp", 0));
            this.f5216b = a.optString("error_message", null);
        }
    }

    public C1723a(String str) {
        this.f5217c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f5216b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.f5217c);
        stringBuffer.append(".json");
        this.f5215a = stringBuffer.toString();
    }

    /* renamed from: a */
    public int mo5996a(C1723a aVar) {
        Long l = this.f5217c;
        if (l == null) {
            return -1;
        }
        Long l2 = aVar.f5217c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: a */
    public void mo5997a() {
        C1717b.m7478a(this.f5215a);
    }

    /* renamed from: b */
    public JSONObject mo5998b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f5217c != null) {
                jSONObject.put("timestamp", this.f5217c);
            }
            jSONObject.put("error_message", this.f5216b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo5999c() {
        return (this.f5216b == null || this.f5217c == null) ? false : true;
    }

    /* renamed from: d */
    public void mo6000d() {
        if (mo5999c()) {
            C1717b.m7476a(this.f5215a, toString());
        }
    }

    public String toString() {
        JSONObject b = mo5998b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }
}
