package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p051p.C2175c;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.v0 */
public final class C2155v0 {

    /* renamed from: a */
    private static Object f6113a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f6114b;

    /* renamed from: c */
    private static String f6115c;

    /* renamed from: d */
    private static int f6116d;

    /* renamed from: a */
    public static String m8863a(Context context) {
        m8865c(context);
        return f6115c;
    }

    /* renamed from: b */
    public static int m8864b(Context context) {
        m8865c(context);
        return f6116d;
    }

    /* renamed from: c */
    private static void m8865c(Context context) {
        synchronized (f6113a) {
            if (!f6114b) {
                f6114b = true;
                try {
                    Bundle bundle = C2175c.m8939a(context).mo6959a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f6115c = bundle.getString("com.google.app.id");
                        f6116d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
