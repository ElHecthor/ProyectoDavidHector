package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C2194i {

    /* renamed from: a */
    private static Boolean f6167a;

    /* renamed from: b */
    private static Boolean f6168b;

    /* renamed from: c */
    private static Boolean f6169c;

    /* renamed from: a */
    public static boolean m8989a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m8990a(Context context) {
        return m8993d(context);
    }

    @TargetApi(20)
    /* renamed from: b */
    public static boolean m8991b(Context context) {
        if (f6167a == null) {
            f6167a = Boolean.valueOf(C2197l.m9004g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f6167a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: c */
    public static boolean m8992c(Context context) {
        return m8991b(context) && (!C2197l.m9006i() || (m8993d(context) && !C2197l.m9007j()));
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m8993d(Context context) {
        if (f6168b == null) {
            f6168b = Boolean.valueOf(C2197l.m9005h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f6168b.booleanValue();
    }

    /* renamed from: e */
    public static boolean m8994e(Context context) {
        if (f6169c == null) {
            f6169c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f6169c.booleanValue();
    }
}
