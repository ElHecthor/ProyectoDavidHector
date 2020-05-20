package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C2165j;
import com.google.android.gms.common.p051p.C2175c;

/* renamed from: com.google.android.gms.common.util.o */
public final class C2200o {
    /* renamed from: a */
    public static boolean m9013a(Context context, int i) {
        String str = "com.google.android.gms";
        if (!m9014a(context, i, str)) {
            return false;
        }
        try {
            return C2165j.m8914a(context).mo6951a(context.getPackageManager().getPackageInfo(str, 64));
        } catch (NameNotFoundException unused) {
            String str2 = "UidVerifier";
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m9014a(Context context, int i, String str) {
        return C2175c.m8939a(context).mo6962a(i, str);
    }
}
