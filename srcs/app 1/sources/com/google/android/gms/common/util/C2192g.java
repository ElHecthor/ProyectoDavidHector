package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.common.util.g */
public final class C2192g {
    /* renamed from: a */
    public static boolean m8983a(Context context, Throwable th) {
        return m8984a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m8984a(Context context, Throwable th, int i) {
        try {
            C2148s.m8834a(context);
            C2148s.m8834a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
