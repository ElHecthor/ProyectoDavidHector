package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.k */
public final class C1666k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f5085a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final ConcurrentLinkedQueue<C1669c> f5086b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private static final Map<String, JSONObject> f5087c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Long f5088d;

    /* renamed from: com.facebook.internal.k$a */
    static class C1667a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f5089f;

        /* renamed from: g */
        final /* synthetic */ Context f5090g;

        /* renamed from: h */
        final /* synthetic */ String f5091h;

        C1667a(String str, Context context, String str2) {
            this.f5089f = str;
            this.f5090g = context;
            this.f5091h = str2;
        }

        public void run() {
            JSONObject a = C1666k.m7239b(this.f5089f);
            if (a != null) {
                C1666k.m7240b(this.f5089f, a);
                this.f5090g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f5091h, a.toString()).apply();
                C1666k.f5088d = Long.valueOf(System.currentTimeMillis());
            }
            C1666k.m7243d();
            C1666k.f5085a.set(false);
        }
    }

    /* renamed from: com.facebook.internal.k$b */
    static class C1668b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1669c f5092f;

        C1668b(C1669c cVar) {
            this.f5092f = cVar;
        }

        public void run() {
            this.f5092f.mo5900a();
        }
    }

    /* renamed from: com.facebook.internal.k$c */
    public interface C1669c {
        /* renamed from: a */
        void mo5900a();
    }

    /* renamed from: a */
    static JSONObject m7234a(String str, boolean z) {
        if (!z && f5087c.containsKey(str)) {
            return (JSONObject) f5087c.get(str);
        }
        JSONObject b = m7239b(str);
        if (b == null) {
            return null;
        }
        Context e = C1787m.m7744e();
        e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), b.toString()).apply();
        return m7240b(str, b);
    }

    /* renamed from: a */
    static synchronized void m7236a(C1669c cVar) {
        synchronized (C1666k.class) {
            if (cVar != null) {
                f5086b.add(cVar);
            }
            if (m7241b(f5088d)) {
                m7243d();
                return;
            }
            Context e = C1787m.m7744e();
            String f = C1787m.m7745f();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{f});
            if (e != null) {
                JSONObject jSONObject = null;
                String string = e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
                if (!C1698v.m7401c(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e2) {
                        C1698v.m7380a("FacebookSDK", (Exception) e2);
                    }
                    if (jSONObject != null) {
                        m7240b(f, jSONObject);
                    }
                }
                Executor l = C1787m.m7751l();
                if (l != null) {
                    if (f5085a.compareAndSet(false, true)) {
                        l.execute(new C1667a(f, e, format));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m7237a(String str, String str2, boolean z) {
        m7242c();
        return (str2 == null || !f5087c.containsKey(str2)) ? z : ((JSONObject) f5087c.get(str2)).optBoolean(str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m7239b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C1787m.m7755p());
        bundle.putString("fields", "gatekeepers");
        C1797q a = C1797q.m7764a((C1499a) null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (C1802e) null);
        a.mo6174a(true);
        a.mo6169a(bundle);
        return a.mo6168a().mo6291b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized JSONObject m7240b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C1666k.class) {
            jSONObject2 = f5087c.containsKey(str) ? (JSONObject) f5087c.get(str) : new JSONObject();
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e) {
                        C1698v.m7380a("FacebookSDK", (Exception) e);
                    }
                }
            }
            f5087c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* renamed from: b */
    private static boolean m7241b(Long l) {
        boolean z = false;
        if (l == null) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < 3600000) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    static void m7242c() {
        m7236a((C1669c) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m7243d() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (!f5086b.isEmpty()) {
            C1669c cVar = (C1669c) f5086b.poll();
            if (cVar != null) {
                handler.post(new C1668b(cVar));
            }
        }
    }
}
