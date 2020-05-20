package com.facebook.p034f0.p036r;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.internal.C1633a;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.p036r.C1591f.C1592a;
import com.facebook.p034f0.p038s.C1609b;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.r.b */
public final class C1575b {

    /* renamed from: a */
    private static final C1591f f4886a = new C1591f();

    /* renamed from: b */
    private static SensorManager f4887b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C1585e f4888c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f4889d;

    /* renamed from: e */
    private static final AtomicBoolean f4890e = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Boolean f4891f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static volatile Boolean f4892g;

    /* renamed from: com.facebook.f0.r.b$a */
    static class C1576a implements C1592a {

        /* renamed from: a */
        final /* synthetic */ C1670l f4893a;

        /* renamed from: b */
        final /* synthetic */ String f4894b;

        C1576a(C1670l lVar, String str) {
            this.f4893a = lVar;
            this.f4894b = str;
        }

        /* renamed from: a */
        public void mo5798a() {
            C1670l lVar = this.f4893a;
            boolean z = true;
            boolean z2 = lVar != null && lVar.mo5906b();
            if (!C1787m.m7750k()) {
                z = false;
            }
            if (z2 && z) {
                C1575b.m6989c(this.f4894b);
            }
        }
    }

    /* renamed from: com.facebook.f0.r.b$b */
    static class C1577b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f4895f;

        C1577b(String str) {
            this.f4895f = str;
        }

        public void run() {
            boolean z = true;
            C1797q a = C1797q.m7765a((C1499a) null, String.format(Locale.US, "%s/app_indexing_session", new Object[]{this.f4895f}), (JSONObject) null, (C1802e) null);
            Bundle h = a.mo6181h();
            if (h == null) {
                h = new Bundle();
            }
            C1633a d = C1633a.m7170d(C1787m.m7744e());
            JSONArray jSONArray = new JSONArray();
            String str = Build.MODEL;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONArray.put(str);
            if (d == null || d.mo5876a() == null) {
                jSONArray.put(str2);
            } else {
                jSONArray.put(d.mo5876a());
            }
            String str3 = "0";
            jSONArray.put(str3);
            if (C1609b.m7095d()) {
                str3 = "1";
            }
            jSONArray.put(str3);
            Locale c = C1698v.m7398c();
            StringBuilder sb = new StringBuilder();
            sb.append(c.getLanguage());
            sb.append("_");
            sb.append(c.getCountry());
            jSONArray.put(sb.toString());
            String jSONArray2 = jSONArray.toString();
            h.putString("device_session_id", C1575b.m6991e());
            h.putString("extinfo", jSONArray2);
            a.mo6169a(h);
            JSONObject b = a.mo6168a().mo6291b();
            if (b == null || !b.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            C1575b.f4891f = Boolean.valueOf(z);
            if (!C1575b.f4891f.booleanValue()) {
                C1575b.f4889d = null;
            } else if (C1575b.f4888c != null) {
                C1575b.f4888c.mo5813a();
            }
            C1575b.f4892g = Boolean.valueOf(false);
        }
    }

    static {
        Boolean valueOf = Boolean.valueOf(false);
        f4891f = valueOf;
        f4892g = valueOf;
    }

    /* renamed from: a */
    public static void m6980a(Activity activity) {
        C1578c.m6997b().mo5801b(activity);
    }

    /* renamed from: b */
    public static void m6985b(Activity activity) {
        if (f4890e.get()) {
            C1578c.m6997b().mo5802c(activity);
            C1585e eVar = f4888c;
            if (eVar != null) {
                eVar.mo5814b();
            }
            SensorManager sensorManager = f4887b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(f4886a);
            }
        }
    }

    /* renamed from: c */
    public static void m6986c() {
        f4890e.set(false);
    }

    /* renamed from: c */
    public static void m6987c(Activity activity) {
        if (f4890e.get()) {
            C1578c.m6997b().mo5800a(activity);
            Context applicationContext = activity.getApplicationContext();
            String f = C1787m.m7745f();
            C1670l c = C1672m.m7268c(f);
            if (c != null && c.mo5906b()) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                f4887b = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    f4888c = new C1585e(activity);
                    f4886a.mo5819a(new C1576a(c, f));
                    f4887b.registerListener(f4886a, defaultSensor, 2);
                    if (c != null && c.mo5906b()) {
                        f4888c.mo5813a();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    static void m6988c(Boolean bool) {
        f4891f = bool;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m6989c(String str) {
        if (!f4892g.booleanValue()) {
            f4892g = Boolean.valueOf(true);
            C1787m.m7751l().execute(new C1577b(str));
        }
    }

    /* renamed from: d */
    public static void m6990d() {
        f4890e.set(true);
    }

    /* renamed from: e */
    static String m6991e() {
        if (f4889d == null) {
            f4889d = UUID.randomUUID().toString();
        }
        return f4889d;
    }

    /* renamed from: f */
    static boolean m6992f() {
        return f4891f.booleanValue();
    }
}
