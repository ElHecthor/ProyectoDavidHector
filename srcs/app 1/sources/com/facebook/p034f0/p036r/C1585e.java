package com.facebook.p034f0.p036r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.C1845w;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.p038s.C1609b;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.r.e */
public class C1585e {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f4918e = "com.facebook.f0.r.e";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f4919a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Activity> f4920b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Timer f4921c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f4922d = null;

    /* renamed from: com.facebook.f0.r.e$a */
    class C1586a extends TimerTask {
        C1586a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0080 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                com.facebook.f0.r.e r0 = com.facebook.p034f0.p036r.C1585e.this     // Catch:{ Exception -> 0x0093 }
                java.lang.ref.WeakReference r0 = r0.f4920b     // Catch:{ Exception -> 0x0093 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0093 }
                android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Exception -> 0x0093 }
                if (r0 != 0) goto L_0x000f
                return
            L_0x000f:
                java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x0093 }
                java.lang.String r1 = r1.getSimpleName()     // Catch:{ Exception -> 0x0093 }
                android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x0093 }
                android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0093 }
                android.view.View r0 = r0.getRootView()     // Catch:{ Exception -> 0x0093 }
                boolean r2 = com.facebook.p034f0.p036r.C1575b.m6992f()     // Catch:{ Exception -> 0x0093 }
                if (r2 != 0) goto L_0x002a
                return
            L_0x002a:
                boolean r2 = com.facebook.internal.C1679n.m7277b()     // Catch:{ Exception -> 0x0093 }
                if (r2 == 0) goto L_0x0034
                com.facebook.p034f0.p036r.p037g.C1600e.m7046a()     // Catch:{ Exception -> 0x0093 }
                return
            L_0x0034:
                java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ Exception -> 0x0093 }
                com.facebook.f0.r.e$e r3 = new com.facebook.f0.r.e$e     // Catch:{ Exception -> 0x0093 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0093 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0093 }
                com.facebook.f0.r.e r3 = com.facebook.p034f0.p036r.C1585e.this     // Catch:{ Exception -> 0x0093 }
                android.os.Handler r3 = r3.f4919a     // Catch:{ Exception -> 0x0093 }
                r3.post(r2)     // Catch:{ Exception -> 0x0093 }
                java.lang.String r3 = ""
                r4 = 1
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0055 }
                java.lang.Object r2 = r2.get(r4, r6)     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0055 }
                r3 = r2
                goto L_0x005f
            L_0x0055:
                r2 = move-exception
                java.lang.String r4 = com.facebook.p034f0.p036r.C1585e.f4918e     // Catch:{ Exception -> 0x0093 }
                java.lang.String r5 = "Failed to take screenshot."
                android.util.Log.e(r4, r5, r2)     // Catch:{ Exception -> 0x0093 }
            L_0x005f:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0093 }
                r2.<init>()     // Catch:{ Exception -> 0x0093 }
                java.lang.String r4 = "screenname"
                r2.put(r4, r1)     // Catch:{ JSONException -> 0x0080 }
                java.lang.String r1 = "screenshot"
                r2.put(r1, r3)     // Catch:{ JSONException -> 0x0080 }
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0080 }
                r1.<init>()     // Catch:{ JSONException -> 0x0080 }
                org.json.JSONObject r0 = com.facebook.p034f0.p036r.p037g.C1601f.m7056d(r0)     // Catch:{ JSONException -> 0x0080 }
                r1.put(r0)     // Catch:{ JSONException -> 0x0080 }
                java.lang.String r0 = "view"
                r2.put(r0, r1)     // Catch:{ JSONException -> 0x0080 }
                goto L_0x0089
            L_0x0080:
                java.lang.String r0 = com.facebook.p034f0.p036r.C1585e.f4918e     // Catch:{ Exception -> 0x0093 }
                java.lang.String r1 = "Failed to create JSONObject"
                android.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0093 }
            L_0x0089:
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0093 }
                com.facebook.f0.r.e r1 = com.facebook.p034f0.p036r.C1585e.this     // Catch:{ Exception -> 0x0093 }
                r1.m7021a(r0)     // Catch:{ Exception -> 0x0093 }
                goto L_0x009d
            L_0x0093:
                r0 = move-exception
                java.lang.String r1 = com.facebook.p034f0.p036r.C1585e.f4918e
                java.lang.String r2 = "UI Component tree indexing failure!"
                android.util.Log.e(r1, r2, r0)
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.p036r.C1585e.C1586a.run():void");
        }
    }

    /* renamed from: com.facebook.f0.r.e$b */
    class C1587b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ TimerTask f4924f;

        C1587b(TimerTask timerTask) {
            this.f4924f = timerTask;
        }

        public void run() {
            try {
                if (C1585e.this.f4921c != null) {
                    C1585e.this.f4921c.cancel();
                }
                C1585e.this.f4922d = null;
                C1585e.this.f4921c = new Timer();
                C1585e.this.f4921c.scheduleAtFixedRate(this.f4924f, 0, 1000);
            } catch (Exception e) {
                Log.e(C1585e.f4918e, "Error scheduling indexing job", e);
            }
        }
    }

    /* renamed from: com.facebook.f0.r.e$c */
    class C1588c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f4926f;

        C1588c(String str) {
            this.f4926f = str;
        }

        public void run() {
            String str = "is_app_indexing_enabled";
            String d = C1698v.m7402d(this.f4926f);
            C1499a r = C1499a.m6759r();
            if (d == null || !d.equals(C1585e.this.f4922d)) {
                C1797q a = C1585e.m7017a(this.f4926f, r, C1787m.m7745f(), "app_indexing");
                if (a != null) {
                    C1842t a2 = a.mo6168a();
                    try {
                        JSONObject b = a2.mo6291b();
                        if (b != null) {
                            if ("true".equals(b.optString("success"))) {
                                C1682p.m7282a(C1845w.APP_EVENTS, C1585e.f4918e, "Successfully send UI component tree to server");
                                C1585e.this.f4922d = d;
                            }
                            if (b.has(str)) {
                                C1575b.m6988c(Boolean.valueOf(b.getBoolean(str)));
                            }
                        } else {
                            String c = C1585e.f4918e;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error sending UI component tree to Facebook: ");
                            sb.append(a2.mo6290a());
                            Log.e(c, sb.toString());
                        }
                    } catch (JSONException e) {
                        Log.e(C1585e.f4918e, "Error decoding server response.", e);
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.f0.r.e$d */
    static class C1589d implements C1802e {
        C1589d() {
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1585e.f4918e, "App index sent to FB!");
        }
    }

    /* renamed from: com.facebook.f0.r.e$e */
    private static class C1590e implements Callable<String> {

        /* renamed from: f */
        private WeakReference<View> f4928f;

        C1590e(View view) {
            this.f4928f = new WeakReference<>(view);
        }

        public String call() {
            View view = (View) this.f4928f.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public C1585e(Activity activity) {
        this.f4920b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static C1797q m7017a(String str, C1499a aVar, String str2, String str3) {
        if (str == null) {
            return null;
        }
        C1797q a = C1797q.m7765a(aVar, String.format(Locale.US, "%s/app_indexing", new Object[]{str2}), (JSONObject) null, (C1802e) null);
        Bundle h = a.mo6181h();
        if (h == null) {
            h = new Bundle();
        }
        h.putString("tree", str);
        h.putString("app_version", C1609b.m7094c());
        h.putString("platform", "android");
        h.putString("request_type", str3);
        if (str3.equals("app_indexing")) {
            h.putString("device_session_id", C1575b.m6991e());
        }
        a.mo6169a(h);
        a.mo6170a((C1802e) new C1589d());
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7021a(String str) {
        C1787m.m7751l().execute(new C1588c(str));
    }

    /* renamed from: a */
    public void mo5813a() {
        C1787m.m7751l().execute(new C1587b(new C1586a()));
    }

    /* renamed from: b */
    public void mo5814b() {
        if (((Activity) this.f4920b.get()) != null) {
            Timer timer = this.f4921c;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f4921c = null;
                } catch (Exception e) {
                    Log.e(f4918e, "Error unscheduling indexing job", e);
                }
            }
        }
    }
}
