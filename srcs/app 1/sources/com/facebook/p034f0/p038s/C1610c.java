package com.facebook.p034f0.p038s;

import android.content.Context;
import com.facebook.C1845w;
import com.facebook.internal.C1633a;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.C1547g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.s.c */
public class C1610c {

    /* renamed from: a */
    private static final Map<C1612b, String> f4980a = new C1611a();

    /* renamed from: com.facebook.f0.s.c$a */
    static class C1611a extends HashMap<C1612b, String> {
        C1611a() {
            put(C1612b.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(C1612b.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* renamed from: com.facebook.f0.s.c$b */
    public enum C1612b {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m7096a(C1612b bVar, C1633a aVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f4980a.get(bVar));
        String c = C1547g.m6886c();
        if (c != null) {
            jSONObject.put("app_user_id", c);
        }
        C1698v.m7384a(jSONObject, aVar, str, z);
        try {
            C1698v.m7383a(jSONObject, context);
        } catch (Exception e) {
            C1682p.m7283a(C1845w.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
