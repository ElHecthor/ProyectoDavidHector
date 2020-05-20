package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.C1787m;
import com.facebook.C1794n;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.w */
public final class C1703w {

    /* renamed from: a */
    private static final String f5172a = "com.facebook.internal.w";

    /* renamed from: a */
    public static String m7421a() {
        String f = C1787m.m7745f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7422a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            m7423a(r3, r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.facebook.FacebookActivity"
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 != 0) goto L_0x002b
            java.lang.String r3 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 != 0) goto L_0x0025
            java.lang.String r4 = f5172a
            android.util.Log.w(r4, r3)
            goto L_0x002b
        L_0x0025:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1703w.m7422a(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public static void m7423a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m7424a(String str, String str2) {
        if (C1698v.m7401c(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument '");
            sb.append(str2);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static <T> void m7425a(Collection<T> collection, String str) {
        m7423a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Container '");
                sb.append(str);
                sb.append("' cannot contain null values");
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static boolean m7426a(Context context) {
        List<ResolveInfo> list;
        m7423a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder sb = new StringBuilder();
            sb.append("fb");
            sb.append(C1787m.m7745f());
            sb.append("://authorize");
            intent.setData(Uri.parse(sb.toString()));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        boolean z = false;
        if (list != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }

    /* renamed from: b */
    public static String m7427b() {
        String j = C1787m.m7749j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: b */
    public static void m7428b(Context context, boolean z) {
        m7423a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            String str = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
            if (!z) {
                Log.w(f5172a, str);
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static <T> void m7429b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Container '");
            sb.append(str);
            sb.append("' cannot be empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static void m7430c() {
        if (!C1787m.m7758s()) {
            throw new C1794n("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: c */
    public static <T> void m7431c(Collection<T> collection, String str) {
        m7425a(collection, str);
        m7429b(collection, str);
    }
}
