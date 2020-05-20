package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C2204r;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.d */
public class C2182d {

    /* renamed from: a */
    private static C2182d f6160a = new C2182d();

    /* renamed from: b */
    private static Boolean f6161b;

    /* renamed from: a */
    public static C2182d m8960a() {
        return f6160a;
    }

    /* renamed from: a */
    private static void m8961a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(C2180b.f6159a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e) {
            Log.wtf("WakeLockTracker", e);
        }
    }

    /* renamed from: b */
    private static boolean m8962b() {
        if (f6161b == null) {
            f6161b = Boolean.valueOf(false);
        }
        return f6161b.booleanValue();
    }

    /* renamed from: a */
    public void mo6979a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        mo6980a(context, str, i, str2, str3, str4, i2, list, 0);
    }

    /* renamed from: a */
    public void mo6980a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (m8962b()) {
            if (TextUtils.isEmpty(str)) {
                String str5 = "missing wakeLock key. ";
                String valueOf = String.valueOf(str);
                Log.e("WakeLockTracker", valueOf.length() != 0 ? str5.concat(valueOf) : new String(str5));
                return;
            }
            if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, C2181c.m8959a(list), str, SystemClock.elapsedRealtime(), C2204r.m9029a(context), str3, C2181c.m8958a(context.getPackageName()), C2204r.m9030b(context), j, str4, false);
                m8961a(context, wakeLockEvent);
            }
        }
    }
}
