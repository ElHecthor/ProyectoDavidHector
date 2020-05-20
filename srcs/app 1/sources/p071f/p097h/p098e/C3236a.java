package p071f.p097h.p098e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: f.h.e.a */
public class C3236a {

    /* renamed from: a */
    private static final Object f9324a = new Object();

    /* renamed from: b */
    private static TypedValue f9325b;

    /* renamed from: a */
    public static int m13263a(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: a */
    public static int m13264a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: a */
    public static Context m13265a(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m13266a(java.io.File r4) {
        /*
            java.lang.Class<f.h.e.a> r0 = p071f.p097h.p098e.C3236a.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r4
        L_0x0017:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r2.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0036 }
            r2.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0036 }
            r4 = 0
            monitor-exit(r0)
            return r4
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p097h.p098e.C3236a.m13266a(java.io.File):java.io.File");
    }

    /* renamed from: a */
    public static void m13267a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m13268a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: b */
    public static ColorStateList m13269b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static File m13270b(Context context) {
        return VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : m13266a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: c */
    public static Drawable m13271c(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f9324a) {
                if (f9325b == null) {
                    f9325b = new TypedValue();
                }
                context.getResources().getValue(i, f9325b, true);
                i = f9325b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: c */
    public static boolean m13272c(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }
}
