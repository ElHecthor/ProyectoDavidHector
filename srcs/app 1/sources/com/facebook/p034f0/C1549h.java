package com.facebook.p034f0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.C1499a;
import com.facebook.C1631i;
import com.facebook.C1787m;
import com.facebook.C1845w;
import com.facebook.internal.C1666k;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import com.facebook.p034f0.C1547g.C1548a;
import com.facebook.p034f0.p038s.C1602a;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.facebook.f0.h */
class C1549h {

    /* renamed from: c */
    private static final String f4821c = "com.facebook.f0.h";

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f4822d;

    /* renamed from: e */
    private static C1548a f4823e = C1548a.AUTO;

    /* renamed from: f */
    private static final Object f4824f = new Object();

    /* renamed from: g */
    private static String f4825g;

    /* renamed from: h */
    private static boolean f4826h;

    /* renamed from: i */
    private static String f4827i;

    /* renamed from: a */
    private final String f4828a;

    /* renamed from: b */
    private final C1528a f4829b;

    /* renamed from: com.facebook.f0.h$a */
    static class C1550a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f4830f;

        /* renamed from: g */
        final /* synthetic */ C1549h f4831g;

        C1550a(Context context, C1549h hVar) {
            this.f4830f = context;
            this.f4831g = hVar;
        }

        public void run() {
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            for (int i2 = 0; i2 < 10; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = this.f4830f.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String str3 = "kitsBitmask";
            if (sharedPreferences.getInt(str3, 0) != i) {
                sharedPreferences.edit().putInt(str3, i).apply();
                this.f4831g.mo5761a("fb_sdk_initialize", (Double) null, bundle);
            }
        }
    }

    /* renamed from: com.facebook.f0.h$b */
    static class C1551b implements Runnable {
        C1551b() {
        }

        public void run() {
            HashSet<String> hashSet = new HashSet<>();
            for (C1528a b : C1538e.m6873e()) {
                hashSet.add(b.mo5736b());
            }
            for (String a : hashSet) {
                C1672m.m7260a(a, true);
            }
        }
    }

    C1549h(Context context, String str, C1499a aVar) {
        this(C1698v.m7393b(context), str, aVar);
    }

    C1549h(String str, String str2, C1499a aVar) {
        C1528a aVar2;
        C1703w.m7430c();
        this.f4828a = str;
        if (aVar == null) {
            aVar = C1499a.m6759r();
        }
        if (!C1499a.m6760s() || (str2 != null && !str2.equals(aVar.mo5681a()))) {
            if (str2 == null) {
                str2 = C1698v.m7397c(C1787m.m7744e());
            }
            aVar2 = new C1528a(null, str2);
        } else {
            aVar2 = new C1528a(aVar);
        }
        this.f4829b = aVar2;
        m6901g();
    }

    /* renamed from: a */
    static String m6890a(Context context) {
        if (f4825g == null) {
            synchronized (f4824f) {
                if (f4825g == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    f4825g = string;
                    if (string == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XZ");
                        sb.append(UUID.randomUUID().toString());
                        f4825g = sb.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f4825g).apply();
                    }
                }
            }
        }
        return f4825g;
    }

    /* renamed from: a */
    static void m6891a(Application application, String str) {
        if (C1787m.m7758s()) {
            C1531b.m6844d();
            C1563p.m6948g();
            if (str == null) {
                str = C1787m.m7745f();
            }
            C1787m.m7740b(application, str);
            C1602a.m7070a(application, str);
            return;
        }
        throw new C1631i("The Facebook sdk must be initialized before calling activateApp");
    }

    /* renamed from: a */
    static void m6892a(Context context, String str) {
        if (C1787m.m7747h()) {
            f4822d.execute(new C1550a(context, new C1549h(context, str, (C1499a) null)));
        }
    }

    /* renamed from: a */
    private static void m6893a(C1533c cVar, C1528a aVar) {
        C1538e.m6865a(aVar, cVar);
        if (!cVar.mo5740a() && !f4826h) {
            if (cVar.mo5742c().equals("fb_mobile_activate_app")) {
                f4826h = true;
            } else {
                C1682p.m7282a(C1845w.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    /* renamed from: a */
    private static void m6894a(String str) {
        C1682p.m7282a(C1845w.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: b */
    static void m6895b() {
        if (m6898d() != C1548a.EXPLICIT_ONLY) {
            C1538e.m6867a(C1555j.EAGER_FLUSHING_EVENT);
        }
    }

    /* renamed from: b */
    static void m6896b(String str) {
        SharedPreferences sharedPreferences = C1787m.m7744e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (str != null) {
            sharedPreferences.edit().putString("install_referrer", str).apply();
        }
    }

    /* renamed from: c */
    static Executor m6897c() {
        if (f4822d == null) {
            m6901g();
        }
        return f4822d;
    }

    /* renamed from: d */
    static C1548a m6898d() {
        C1548a aVar;
        synchronized (f4824f) {
            aVar = f4823e;
        }
        return aVar;
    }

    /* renamed from: e */
    static String m6899e() {
        return C1787m.m7744e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
    }

    /* renamed from: f */
    static String m6900f() {
        String str;
        synchronized (f4824f) {
            str = f4827i;
        }
        return str;
    }

    /* renamed from: g */
    private static void m6901g() {
        synchronized (f4824f) {
            if (f4822d == null) {
                f4822d = new ScheduledThreadPoolExecutor(1);
                f4822d.scheduleAtFixedRate(new C1551b(), 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: h */
    static void m6902h() {
        C1538e.m6874f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5758a() {
        C1538e.m6867a(C1555j.EXPLICIT);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5759a(String str, double d, Bundle bundle) {
        mo5762a(str, Double.valueOf(d), bundle, false, C1602a.m7086l());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5760a(String str, Bundle bundle) {
        mo5762a(str, null, bundle, false, C1602a.m7086l());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5761a(String str, Double d, Bundle bundle) {
        mo5762a(str, d, bundle, true, C1602a.m7086l());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5762a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (str != null && !str.isEmpty()) {
            String str2 = "AppEvents";
            if (C1666k.m7237a("app_events_killswitch", C1787m.m7745f(), false)) {
                C1682p.m7283a(C1845w.APP_EVENTS, str2, "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                C1533c cVar = new C1533c(this.f4828a, str, d, bundle, z, C1602a.m7088n(), uuid);
                m6893a(cVar, this.f4829b);
            } catch (JSONException e) {
                C1682p.m7283a(C1845w.APP_EVENTS, str2, "JSON encoding for app event failed: '%s'", e.toString());
            } catch (C1631i e2) {
                C1682p.m7283a(C1845w.APP_EVENTS, str2, "Invalid app event: %s", e2.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5763a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (bigDecimal == null || currency == null) {
            C1698v.m7399c(f4821c, "purchaseAmount and currency cannot be null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("fb_currency", currency.getCurrencyCode());
        mo5762a(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, C1602a.m7086l());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5764a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        mo5765a(bigDecimal, currency, bundle, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5765a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            m6894a("purchaseAmount cannot be null");
        } else if (currency == null) {
            m6894a("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            mo5762a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C1602a.m7086l());
            m6895b();
        }
    }
}
