package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2134m0;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2194i;

/* renamed from: com.google.android.gms.common.f */
public class C2087f {

    /* renamed from: a */
    public static final int f5982a = C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    private static final C2087f f5983b = new C2087f();

    C2087f() {
    }

    /* renamed from: a */
    public static C2087f m8630a() {
        return f5983b;
    }

    /* renamed from: b */
    private static String m8631b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f5982a);
        String str2 = "-";
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(str2);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(str2);
        if (context != null) {
            try {
                sb.append(C2175c.m8939a(context).mo6964b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo6812a(Context context) {
        return C2090i.getApkVersion(context);
    }

    /* renamed from: a */
    public int mo6797a(Context context, int i) {
        int isGooglePlayServicesAvailable = C2090i.isGooglePlayServicesAvailable(context, i);
        if (C2090i.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    /* renamed from: a */
    public PendingIntent mo6799a(Context context, int i, int i2) {
        return mo6813a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo6813a(Context context, int i, int i2, String str) {
        Intent a = mo6801a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: a */
    public Intent mo6801a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            return (context == null || !C2194i.m8992c(context)) ? C2134m0.m8800a(str2, m8631b(context, str)) : C2134m0.m8798a();
        }
        if (i != 3) {
            return null;
        }
        return C2134m0.m8799a(str2);
    }

    /* renamed from: a */
    public String mo6803a(int i) {
        return C2090i.getErrorString(i);
    }

    /* renamed from: a */
    public boolean mo6814a(Context context, String str) {
        return C2090i.isUninstalledAppPossiblyUpdating(context, str);
    }

    /* renamed from: b */
    public int mo6806b(Context context) {
        return mo6797a(context, f5982a);
    }

    /* renamed from: b */
    public boolean mo6808b(int i) {
        return C2090i.isUserRecoverableError(i);
    }
}
