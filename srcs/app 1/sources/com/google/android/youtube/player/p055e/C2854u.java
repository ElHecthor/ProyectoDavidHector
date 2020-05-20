package com.google.android.youtube.player.p055e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: com.google.android.youtube.player.e.u */
public final class C2854u {

    /* renamed from: a */
    private static final String[] f8302a = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    static {
        Uri.parse("http://play.google.com/store/apps/details");
    }

    /* renamed from: a */
    public static String m11846a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : f8302a) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str), 0);
            if (resolveService != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (serviceInfo != null) {
                    String str2 = serviceInfo.packageName;
                    if (str2 != null) {
                        return str2;
                    }
                } else {
                    continue;
                }
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    /* renamed from: a */
    public static boolean m11847a(Context context, String str) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (str.equals("com.google.android.youtube.googletvdev")) {
                str = "com.google.android.youtube.googletv";
            }
            int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", str);
            return identifier == 0 || 12 > resourcesForApplication.getInteger(identifier) / 100;
        } catch (NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static Context m11848b(Context context) {
        try {
            return context.createPackageContext(m11846a(context), 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static int m11849c(Context context) {
        Context b = m11848b(context);
        int identifier = b != null ? b.getResources().getIdentifier("clientTheme", "style", m11846a(context)) : 0;
        if (identifier != 0) {
            return identifier;
        }
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            return 16974120;
        }
        return i >= 11 ? 16973931 : 16973829;
    }

    /* renamed from: d */
    public static String m11850d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }
}
