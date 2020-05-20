package com.facebook.internal.p042y.p043c;

import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.internal.C1698v;
import com.facebook.internal.p042y.C1717b;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.y.c.b */
public final class C1722b {

    /* renamed from: a */
    private String f5210a;

    /* renamed from: b */
    private String f5211b;

    /* renamed from: c */
    private String f5212c;

    /* renamed from: d */
    private String f5213d;

    /* renamed from: e */
    private Long f5214e;

    public C1722b(File file) {
        String name = file.getName();
        this.f5210a = name;
        JSONObject a = C1717b.m7475a(name, true);
        if (a != null) {
            this.f5211b = a.optString("app_version", null);
            this.f5212c = a.optString("reason", null);
            this.f5213d = a.optString("callstack", null);
            this.f5214e = Long.valueOf(a.optLong("timestamp", 0));
        }
    }

    public C1722b(Throwable th) {
        this.f5211b = C1698v.m7392b();
        this.f5212c = C1717b.m7474a(th);
        this.f5213d = C1717b.m7479b(th);
        this.f5214e = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("crash_log_");
        stringBuffer.append(this.f5214e.toString());
        stringBuffer.append(".json");
        this.f5210a = stringBuffer.toString();
    }

    /* renamed from: a */
    public int mo5990a(C1722b bVar) {
        Long l = this.f5214e;
        if (l == null) {
            return -1;
        }
        Long l2 = bVar.f5214e;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: a */
    public void mo5991a() {
        C1717b.m7478a(this.f5210a);
    }

    /* renamed from: b */
    public JSONObject mo5992b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            if (this.f5211b != null) {
                jSONObject.put("app_version", this.f5211b);
            }
            if (this.f5214e != null) {
                jSONObject.put("timestamp", this.f5214e);
            }
            if (this.f5212c != null) {
                jSONObject.put("reason", this.f5212c);
            }
            if (this.f5213d != null) {
                jSONObject.put("callstack", this.f5213d);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo5993c() {
        return (this.f5213d == null || this.f5214e == null) ? false : true;
    }

    /* renamed from: d */
    public void mo5994d() {
        if (mo5993c()) {
            C1717b.m7476a(this.f5210a, toString());
        }
    }

    public String toString() {
        JSONObject b = mo5992b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }
}
