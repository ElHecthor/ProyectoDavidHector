package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C1797q.C1802e;
import com.facebook.internal.C1633a;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.C1558m;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.e0 */
final class C1524e0 {

    /* renamed from: a */
    private static final String f4766a = "com.facebook.e0";

    /* renamed from: b */
    private static AtomicBoolean f4767b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static AtomicBoolean f4768c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C1526b f4769d = new C1526b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    private static C1526b f4770e = new C1526b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C1526b f4771f = new C1526b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C1526b f4772g = new C1526b(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static SharedPreferences f4773h;

    /* renamed from: i */
    private static Editor f4774i;

    /* renamed from: com.facebook.e0$a */
    static class C1525a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f4775f;

        C1525a(long j) {
            this.f4775f = j;
        }

        public void run() {
            if (C1524e0.f4771f.mo5734a()) {
                C1670l a = C1672m.m7260a(C1787m.m7745f(), false);
                if (a != null && a.mo5906b()) {
                    C1633a d = C1633a.m7170d(C1787m.m7744e());
                    if (((d == null || d.mo5876a() == null) ? null : d.mo5876a()) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", d.mo5876a());
                        String str = "auto_event_setup_enabled";
                        bundle.putString("fields", str);
                        C1797q a2 = C1797q.m7764a((C1499a) null, C1787m.m7745f(), (C1802e) null);
                        a2.mo6174a(true);
                        a2.mo6169a(bundle);
                        JSONObject b = a2.mo6168a().mo6291b();
                        if (b != null) {
                            C1524e0.f4772g.f4777b = Boolean.valueOf(b.optBoolean(str, false));
                            C1524e0.f4772g.f4779d = this.f4775f;
                            C1524e0.m6828d(C1524e0.f4772g);
                        }
                    }
                }
            }
            C1524e0.f4768c.set(false);
        }
    }

    /* renamed from: com.facebook.e0$b */
    private static class C1526b {

        /* renamed from: a */
        String f4776a;

        /* renamed from: b */
        Boolean f4777b;

        /* renamed from: c */
        boolean f4778c;

        /* renamed from: d */
        long f4779d;

        C1526b(boolean z, String str) {
            this.f4778c = z;
            this.f4776a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5734a() {
            Boolean bool = this.f4777b;
            return bool == null ? this.f4778c : bool.booleanValue();
        }
    }

    /* renamed from: a */
    private static void m6823a(C1526b... bVarArr) {
        for (C1526b bVar : bVarArr) {
            if (bVar == f4772g) {
                m6833h();
            } else if (bVar.f4777b == null) {
                m6827c(bVar);
                if (bVar.f4777b == null) {
                    m6825b(bVar);
                }
            } else {
                m6828d(bVar);
            }
        }
    }

    /* renamed from: b */
    private static void m6825b(C1526b bVar) {
        m6837l();
        try {
            Context e = C1787m.m7744e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(bVar.f4776a)) {
                bVar.f4777b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.f4776a, bVar.f4778c));
            }
        } catch (NameNotFoundException e2) {
            C1698v.m7380a(f4766a, (Exception) e2);
        }
    }

    /* renamed from: c */
    private static void m6827c(C1526b bVar) {
        m6837l();
        try {
            String string = f4773h.getString(bVar.f4776a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                bVar.f4777b = Boolean.valueOf(jSONObject.getBoolean("value"));
                bVar.f4779d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException e) {
            C1698v.m7380a(f4766a, (Exception) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m6828d(C1526b bVar) {
        m6837l();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", bVar.f4777b);
            jSONObject.put("last_timestamp", bVar.f4779d);
            f4774i.putString(bVar.f4776a, jSONObject.toString()).commit();
            m6835j();
        } catch (JSONException e) {
            C1698v.m7380a(f4766a, (Exception) e);
        }
    }

    /* renamed from: d */
    public static boolean m6829d() {
        m6834i();
        return f4771f.mo5734a();
    }

    /* renamed from: e */
    public static boolean m6830e() {
        m6834i();
        return f4769d.mo5734a();
    }

    /* renamed from: f */
    public static boolean m6831f() {
        m6834i();
        return f4770e.mo5734a();
    }

    /* renamed from: g */
    public static boolean m6832g() {
        m6834i();
        return f4772g.mo5734a();
    }

    /* renamed from: h */
    private static void m6833h() {
        m6827c(f4772g);
        long currentTimeMillis = System.currentTimeMillis();
        C1526b bVar = f4772g;
        if (bVar.f4777b == null || currentTimeMillis - bVar.f4779d >= 604800000) {
            C1526b bVar2 = f4772g;
            bVar2.f4777b = null;
            bVar2.f4779d = 0;
            if (f4768c.compareAndSet(false, true)) {
                C1787m.m7751l().execute(new C1525a(currentTimeMillis));
            }
        }
    }

    /* renamed from: i */
    public static void m6834i() {
        if (C1787m.m7758s() && f4767b.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = C1787m.m7744e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            f4773h = sharedPreferences;
            f4774i = sharedPreferences.edit();
            m6823a(f4770e, f4771f, f4769d);
            m6833h();
            m6836k();
            m6835j();
        }
    }

    /* renamed from: j */
    private static void m6835j() {
        int i;
        if (f4767b.get() && C1787m.m7758s()) {
            Context e = C1787m.m7744e();
            int i2 = 0;
            int i3 = ((f4769d.mo5734a() ? 1 : 0) << false) | 0 | ((f4770e.mo5734a() ? 1 : 0) << true) | ((f4771f.mo5734a() ? 1 : 0) << true);
            String str = "com.facebook.sdk.USER_SETTINGS_BITMASK";
            int i4 = f4773h.getInt(str, 0);
            if (i4 != i3) {
                f4774i.putInt(str, i3).commit();
                try {
                    ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        boolean[] zArr = {true, true, true};
                        int i5 = 0;
                        int i6 = 0;
                        i = 0;
                        while (i5 < 3) {
                            try {
                                i |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                i6 |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                i5++;
                            } catch (NameNotFoundException unused) {
                            }
                        }
                        i2 = i6;
                        C1558m mVar = new C1558m(e);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        mVar.mo5776b("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i = 0;
                C1558m mVar2 = new C1558m(e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i4);
                bundle2.putInt("current", i3);
                mVar2.mo5776b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    /* renamed from: k */
    private static void m6836k() {
        try {
            Context e = C1787m.m7744e();
            ApplicationInfo applicationInfo = e.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f4766a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f4766a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!m6829d()) {
                    Log.w(f4766a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: l */
    private static void m6837l() {
        if (!f4767b.get()) {
            throw new C1794n("The UserSettingManager has not been initialized successfully");
        }
    }
}
