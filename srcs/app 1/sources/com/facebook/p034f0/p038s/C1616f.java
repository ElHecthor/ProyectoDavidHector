package com.facebook.p034f0.p038s;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.C1787m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.s.f */
public class C1616f {

    /* renamed from: a */
    private static final String f4989a = "com.facebook.f0.s.f";

    /* renamed from: b */
    private static final AtomicBoolean f4990b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Boolean f4991c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Boolean f4992d = null;

    /* renamed from: e */
    private static ServiceConnection f4993e;

    /* renamed from: f */
    private static ActivityLifecycleCallbacks f4994f;

    /* renamed from: g */
    private static Intent f4995g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Object f4996h;

    /* renamed from: com.facebook.f0.s.f$a */
    static class C1617a implements ServiceConnection {
        C1617a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1616f.f4996h = C1621g.m7113a(C1787m.m7744e(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.facebook.f0.s.f$b */
    static class C1618b implements ActivityLifecycleCallbacks {

        /* renamed from: com.facebook.f0.s.f$b$a */
        class C1619a implements Runnable {
            C1619a(C1618b bVar) {
            }

            public void run() {
                Context e = C1787m.m7744e();
                C1616f.m7108b(e, C1621g.m7123b(e, C1616f.f4996h), false);
                C1616f.m7108b(e, C1621g.m7128c(e, C1616f.f4996h), true);
            }
        }

        /* renamed from: com.facebook.f0.s.f$b$b */
        class C1620b implements Runnable {
            C1620b(C1618b bVar) {
            }

            public void run() {
                Context e = C1787m.m7744e();
                ArrayList b = C1621g.m7123b(e, C1616f.f4996h);
                if (b.isEmpty()) {
                    b = C1621g.m7116a(e, C1616f.f4996h);
                }
                C1616f.m7108b(e, b, false);
            }
        }

        C1618b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            try {
                C1787m.m7751l().execute(new C1619a(this));
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            try {
                if (C1616f.f4992d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    C1787m.m7751l().execute(new C1620b(this));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m7108b(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(f4989a, "Error parsing in-app purchase data.", e);
                }
            }
            for (Entry entry : C1621g.m7119a(context, arrayList2, f4996h, z).entrySet()) {
                C1613d.m7100a((String) hashMap.get(entry.getKey()), (String) entry.getValue(), z);
            }
        }
    }

    /* renamed from: c */
    private static void m7109c() {
        if (f4991c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                f4991c = Boolean.valueOf(true);
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    f4992d = Boolean.valueOf(true);
                } catch (ClassNotFoundException unused) {
                    f4992d = Boolean.valueOf(false);
                }
                C1621g.m7120a();
                f4995g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                f4993e = new C1617a();
                f4994f = new C1618b();
            } catch (ClassNotFoundException unused2) {
                f4991c = Boolean.valueOf(false);
            }
        }
    }

    /* renamed from: d */
    private static void m7110d() {
        if (f4990b.compareAndSet(false, true)) {
            Context e = C1787m.m7744e();
            if (e instanceof Application) {
                ((Application) e).registerActivityLifecycleCallbacks(f4994f);
                e.bindService(f4995g, f4993e, 1);
            }
        }
    }

    /* renamed from: e */
    public static void m7111e() {
        m7109c();
        if (f4991c.booleanValue() && C1613d.m7101a()) {
            m7110d();
        }
    }
}
