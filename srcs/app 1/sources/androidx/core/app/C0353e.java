package androidx.core.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.e */
public final class C0353e {

    /* renamed from: androidx.core.app.e$a */
    static class C0354a {

        /* renamed from: a */
        private static Method f1642a;

        /* renamed from: b */
        private static boolean f1643b;

        /* renamed from: c */
        private static Method f1644c;

        /* renamed from: d */
        private static boolean f1645d;

        /* renamed from: a */
        public static IBinder m1798a(Bundle bundle, String str) {
            String str2 = "BundleCompatBaseImpl";
            if (!f1643b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f1642a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve getIBinder method", e);
                }
                f1643b = true;
            }
            Method method2 = f1642a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke getIBinder via reflection", e2);
                    f1642a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m1799a(Bundle bundle, String str, IBinder iBinder) {
            String str2 = "BundleCompatBaseImpl";
            if (!f1645d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f1644c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve putIBinder method", e);
                }
                f1645d = true;
            }
            Method method2 = f1644c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke putIBinder via reflection", e2);
                    f1644c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m1796a(Bundle bundle, String str) {
        return VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0354a.m1798a(bundle, str);
    }

    /* renamed from: a */
    public static void m1797a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0354a.m1799a(bundle, str, iBinder);
        }
    }
}
