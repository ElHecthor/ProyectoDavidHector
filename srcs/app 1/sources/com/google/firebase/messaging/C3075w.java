package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.p056a.C2861a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.p057e.C2903a;
import com.google.firebase.p057e.C2904b;
import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.p058g.C2911c;
import p147g.p156d.p157a.p158a.C3740c;
import p147g.p156d.p157a.p158a.C3743f;

/* renamed from: com.google.firebase.messaging.w */
public final class C3075w {

    /* renamed from: a */
    private static final C2903a f8736a;

    static {
        C2911c cVar = new C2911c();
        cVar.mo9593a(C3047a.class, (C2905c<? super T>) new C3049c<Object>());
        cVar.mo9593a(C3046a.class, (C2905c<? super T>) new C3048b<Object>());
        f8736a = cVar.mo9592a();
    }

    /* renamed from: a */
    public static void m12477a(Intent intent) {
        if (intent != null) {
            String str = "FirebaseMessaging";
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                C2861a aVar = (C2861a) FirebaseApp.getInstance().mo9509a(C2861a.class);
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    String str2 = "fcm";
                    aVar.mo9528a(str2, "_ln", (Object) stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    aVar.mo9527a(str2, "_cmp", bundle);
                } else {
                    Log.w(str, "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable(str, 3)) {
                Log.d(str, "Received event with track-conversion=false. Do not set user property");
            }
        }
        m12479a("_no", intent);
    }

    /* renamed from: a */
    public static void m12478a(Intent intent, C3743f<String> fVar) {
        m12479a("_nr", intent);
        if (fVar != null) {
            try {
                fVar.mo9806a(C3740c.m15295a(f8736a.mo9584a(new C3047a(new C3046a("MESSAGE_DELIVERED", intent)))));
            } catch (C2904b unused) {
                Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
            }
        }
    }

    /* renamed from: a */
    private static void m12479a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String l = m12494l(intent);
        if (l != null) {
            bundle.putString("_nt", l);
        }
        String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        String str2 = "FirebaseMessaging";
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra5));
            } catch (NumberFormatException e) {
                Log.w(str2, "Error while parsing timestamp in GCM event", e);
            }
        }
        String str3 = "google.c.a.udt";
        String stringExtra6 = intent.hasExtra(str3) ? intent.getStringExtra(str3) : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException e2) {
                Log.w(str2, "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String str4 = (intent.getExtras() == null || !C3077y.m12497a(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str4);
        }
        if (Log.isLoggable(str2, 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(valueOf).length());
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d(str2, sb.toString());
        }
        C2861a aVar = (C2861a) FirebaseApp.getInstance().mo9509a(C2861a.class);
        if (aVar != null) {
            aVar.mo9527a("fcm", str, bundle);
        } else {
            Log.w(str2, "Unable to log event: analytics library is missing");
        }
    }

    /* renamed from: a */
    static boolean m12480a() {
        String str = "delivery_metrics_exported_to_big_query_enabled";
        try {
            FirebaseApp.getInstance();
            Context a = FirebaseApp.getInstance().mo9508a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "export_to_big_query";
            if (sharedPreferences.contains(str2)) {
                return sharedPreferences.getBoolean(str2, false);
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return applicationInfo.metaData.getBoolean(str, false);
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static String m12481b() {
        return FirebaseApp.getInstance().mo9508a().getPackageName();
    }

    /* renamed from: b */
    public static void m12482b(Intent intent) {
        m12479a("_nd", intent);
    }

    /* renamed from: c */
    static String m12483c() {
        return FirebaseInstanceId.getInstance(FirebaseApp.getInstance()).mo9612a();
    }

    /* renamed from: c */
    public static void m12484c(Intent intent) {
        m12479a("_nf", intent);
    }

    /* renamed from: d */
    static String m12485d() {
        FirebaseApp instance = FirebaseApp.getInstance();
        String c = instance.mo9511c().mo9579c();
        if (c != null) {
            return c;
        }
        String b = instance.mo9511c().mo9578b();
        if (!b.startsWith("1:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public static boolean m12486d(Intent intent) {
        if (intent == null || m12496n(intent)) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: e */
    public static boolean m12487e(Intent intent) {
        if (intent == null || m12496n(intent)) {
            return false;
        }
        return m12480a();
    }

    /* renamed from: f */
    static int m12488f(Intent intent) {
        Object obj = intent.getExtras().get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("Invalid TTL: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        return 0;
    }

    /* renamed from: g */
    static String m12489g(Intent intent) {
        return intent.getStringExtra("collapse_key");
    }

    /* renamed from: h */
    static String m12490h(Intent intent) {
        return intent.getStringExtra("google.c.a.c_l");
    }

    /* renamed from: i */
    static String m12491i(Intent intent) {
        return intent.getStringExtra("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m12492j(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: k */
    static String m12493k(Intent intent) {
        return (intent.getExtras() == null || !C3077y.m12497a(intent.getExtras())) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    /* renamed from: l */
    static String m12494l(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    /* renamed from: m */
    static int m12495m(Intent intent) {
        String stringExtra = intent.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(intent.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = intent.getStringExtra("google.priority");
        }
        if ("high".equals(stringExtra)) {
            return 1;
        }
        return "normal".equals(stringExtra) ? 2 : 0;
    }

    /* renamed from: n */
    private static boolean m12496n(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }
}
