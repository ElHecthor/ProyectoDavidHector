package com.google.android.gms.common.p051p;

import android.content.Context;
import com.google.android.gms.common.util.C2197l;

/* renamed from: com.google.android.gms.common.p.a */
public class C2173a {

    /* renamed from: a */
    private static Context f6133a;

    /* renamed from: b */
    private static Boolean f6134b;

    /* renamed from: a */
    public static synchronized boolean m8929a(Context context) {
        Boolean valueOf;
        synchronized (C2173a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f6133a == null || f6134b == null || f6133a != applicationContext) {
                f6134b = null;
                if (C2197l.m9007j()) {
                    valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f6134b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        valueOf = Boolean.valueOf(false);
                    }
                    f6133a = applicationContext;
                    boolean booleanValue = f6134b.booleanValue();
                    return booleanValue;
                }
                f6134b = valueOf;
                f6133a = applicationContext;
                boolean booleanValue2 = f6134b.booleanValue();
                return booleanValue2;
            }
            boolean booleanValue3 = f6134b.booleanValue();
            return booleanValue3;
        }
    }
}
