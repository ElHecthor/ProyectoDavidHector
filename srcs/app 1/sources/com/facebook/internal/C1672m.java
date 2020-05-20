package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.internal.C1670l.C1671a;
import com.facebook.p034f0.p036r.p037g.C1600e;
import com.facebook.p034f0.p038s.C1613d;
import com.facebook.p034f0.p038s.C1615e;
import com.facebook.p034f0.p038s.C1616f;
import com.facebook.p034f0.p039t.C1625a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
public final class C1672m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5105a = "m";

    /* renamed from: b */
    private static final String[] f5106b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules"};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C1670l> f5107c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final AtomicReference<C1677e> f5108d = new AtomicReference<>(C1677e.NOT_LOADED);

    /* renamed from: e */
    private static final ConcurrentLinkedQueue<C1678f> f5109e = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f5110f = false;

    /* renamed from: g */
    private static JSONArray f5111g = null;

    /* renamed from: com.facebook.internal.m$a */
    static class C1673a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f5112f;

        /* renamed from: g */
        final /* synthetic */ String f5113g;

        /* renamed from: h */
        final /* synthetic */ String f5114h;

        C1673a(Context context, String str, String str2) {
            this.f5112f = context;
            this.f5113g = str;
            this.f5114h = str2;
        }

        public void run() {
            JSONObject jSONObject;
            SharedPreferences sharedPreferences = this.f5112f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
            C1670l lVar = null;
            String string = sharedPreferences.getString(this.f5113g, null);
            if (!C1698v.m7401c(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    C1698v.m7380a("FacebookSDK", (Exception) e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    lVar = C1672m.m7265b(this.f5114h, jSONObject);
                }
            }
            JSONObject a = C1672m.m7267b(this.f5114h);
            if (a != null) {
                C1672m.m7265b(this.f5114h, a);
                sharedPreferences.edit().putString(this.f5113g, a.toString()).apply();
            }
            if (lVar != null) {
                String g = lVar.mo5911g();
                if (!C1672m.f5110f && g != null && g.length() > 0) {
                    C1672m.f5110f = true;
                    Log.w(C1672m.f5105a, g);
                }
            }
            C1666k.m7234a(this.f5114h, true);
            C1613d.m7102b();
            C1616f.m7111e();
            C1672m.f5108d.set(C1672m.f5107c.containsKey(this.f5114h) ? C1677e.SUCCESS : C1677e.ERROR);
            C1672m.m7273g();
        }
    }

    /* renamed from: com.facebook.internal.m$b */
    static class C1674b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1678f f5115f;

        C1674b(C1678f fVar) {
            this.f5115f = fVar;
        }

        public void run() {
            this.f5115f.mo5921a();
        }
    }

    /* renamed from: com.facebook.internal.m$c */
    static class C1675c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1678f f5116f;

        /* renamed from: g */
        final /* synthetic */ C1670l f5117g;

        C1675c(C1678f fVar, C1670l lVar) {
            this.f5116f = fVar;
            this.f5117g = lVar;
        }

        public void run() {
            this.f5116f.mo5922a(this.f5117g);
        }
    }

    /* renamed from: com.facebook.internal.m$d */
    static class C1676d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ JSONObject f5118f;

        C1676d(JSONObject jSONObject) {
            this.f5118f = jSONObject;
        }

        public void run() {
            C1625a.m7152b(this.f5118f.optString("restrictive_data_filter_params"));
        }
    }

    /* renamed from: com.facebook.internal.m$e */
    enum C1677e {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: com.facebook.internal.m$f */
    public interface C1678f {
        /* renamed from: a */
        void mo5921a();

        /* renamed from: a */
        void mo5922a(C1670l lVar);
    }

    /* renamed from: a */
    public static C1670l m7260a(String str, boolean z) {
        if (!z && f5107c.containsKey(str)) {
            return (C1670l) f5107c.get(str);
        }
        JSONObject b = m7267b(str);
        if (b == null) {
            return null;
        }
        C1670l b2 = m7265b(str, b);
        if (str.equals(C1787m.m7745f())) {
            f5108d.set(C1677e.SUCCESS);
            m7273g();
        }
        return b2;
    }

    /* renamed from: a */
    private static Map<String, Map<String, C1671a>> m7261a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C1671a a = C1671a.m7255a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        String a2 = a.mo5915a();
                        Map map = (Map) hashMap.get(a2);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a2, map);
                        }
                        map.put(a.mo5916b(), a);
                    }
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C1670l m7265b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        C1654g a = optJSONArray == null ? C1654g.m7212a() : C1654g.m7213a(optJSONArray);
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        f5111g = optJSONArray2;
        if (optJSONArray2 != null && C1679n.m7277b()) {
            C1600e.m7047a(optJSONArray2.toString());
        }
        C1670l lVar = r2;
        C1670l lVar2 = new C1670l(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optInt("app_events_session_timeout", C1615e.m7103a()), C1697u.m7351a(jSONObject2.optLong("seamless_login")), m7261a(jSONObject2.optJSONObject("android_dialog_configs")), z, a, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4, jSONObject2.optString("aam_rules"));
        C1670l lVar3 = lVar;
        f5107c.put(str, lVar3);
        C1787m.m7751l().execute(new C1676d(jSONObject2));
        return lVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m7267b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f5106b))));
        C1797q a = C1797q.m7764a((C1499a) null, str, (C1802e) null);
        a.mo6174a(true);
        a.mo6169a(bundle);
        return a.mo6168a().mo6291b();
    }

    /* renamed from: c */
    public static C1670l m7268c(String str) {
        if (str != null) {
            return (C1670l) f5107c.get(str);
        }
        return null;
    }

    /* renamed from: f */
    public static void m7272f() {
        Context e = C1787m.m7744e();
        String f = C1787m.m7745f();
        if (C1698v.m7401c(f)) {
            f5108d.set(C1677e.ERROR);
            m7273g();
        } else if (f5107c.containsKey(f)) {
            f5108d.set(C1677e.SUCCESS);
            m7273g();
        } else {
            if (!(f5108d.compareAndSet(C1677e.NOT_LOADED, C1677e.LOADING) || f5108d.compareAndSet(C1677e.ERROR, C1677e.LOADING))) {
                m7273g();
            } else {
                C1787m.m7751l().execute(new C1673a(e, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{f}), f));
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m7273g() {
        /*
            java.lang.Class<com.facebook.internal.m> r0 = com.facebook.internal.C1672m.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.m$e> r1 = f5108d     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$e r1 = (com.facebook.internal.C1672m.C1677e) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$e r2 = com.facebook.internal.C1672m.C1677e.NOT_LOADED     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x006f
            com.facebook.internal.m$e r2 = com.facebook.internal.C1672m.C1677e.LOADING     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.String r2 = com.facebook.C1787m.m7745f()     // Catch:{ all -> 0x0071 }
            java.util.Map<java.lang.String, com.facebook.internal.l> r3 = f5107c     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.l r2 = (com.facebook.internal.C1670l) r2     // Catch:{ all -> 0x0071 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0071 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$e r4 = com.facebook.internal.C1672m.C1677e.ERROR     // Catch:{ all -> 0x0071 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0054
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.m$f> r1 = f5109e     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.m$f> r1 = f5109e     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$f r1 = (com.facebook.internal.C1672m.C1678f) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$b r2 = new com.facebook.internal.m$b     // Catch:{ all -> 0x0071 }
            r2.<init>(r1)     // Catch:{ all -> 0x0071 }
            r3.post(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0039
        L_0x0052:
            monitor-exit(r0)
            return
        L_0x0054:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.m$f> r1 = f5109e     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x006d
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.m$f> r1 = f5109e     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$f r1 = (com.facebook.internal.C1672m.C1678f) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.m$c r4 = new com.facebook.internal.m$c     // Catch:{ all -> 0x0071 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0071 }
            r3.post(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0054
        L_0x006d:
            monitor-exit(r0)
            return
        L_0x006f:
            monitor-exit(r0)
            return
        L_0x0071:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1672m.m7273g():void");
    }
}
