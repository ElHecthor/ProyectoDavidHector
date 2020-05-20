package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
final class C0347c {

    /* renamed from: a */
    protected static final Class<?> f1624a = m1785a();

    /* renamed from: b */
    protected static final Field f1625b = m1789b();

    /* renamed from: c */
    protected static final Field f1626c = m1791c();

    /* renamed from: d */
    protected static final Method f1627d = m1790b(f1624a);

    /* renamed from: e */
    protected static final Method f1628e = m1786a(f1624a);

    /* renamed from: f */
    protected static final Method f1629f = m1792c(f1624a);

    /* renamed from: g */
    private static final Handler f1630g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    static class C0348a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0351d f1631f;

        /* renamed from: g */
        final /* synthetic */ Object f1632g;

        C0348a(C0351d dVar, Object obj) {
            this.f1631f = dVar;
            this.f1632g = obj;
        }

        public void run() {
            this.f1631f.f1637f = this.f1632g;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    static class C0349b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Application f1633f;

        /* renamed from: g */
        final /* synthetic */ C0351d f1634g;

        C0349b(Application application, C0351d dVar) {
            this.f1633f = application;
            this.f1634g = dVar;
        }

        public void run() {
            this.f1633f.unregisterActivityLifecycleCallbacks(this.f1634g);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    static class C0350c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f1635f;

        /* renamed from: g */
        final /* synthetic */ Object f1636g;

        C0350c(Object obj, Object obj2) {
            this.f1635f = obj;
            this.f1636g = obj2;
        }

        public void run() {
            try {
                if (C0347c.f1627d != null) {
                    C0347c.f1627d.invoke(this.f1635f, new Object[]{this.f1636g, Boolean.valueOf(false), "AppCompat recreation"});
                    return;
                }
                C0347c.f1628e.invoke(this.f1635f, new Object[]{this.f1636g, Boolean.valueOf(false)});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    private static final class C0351d implements ActivityLifecycleCallbacks {

        /* renamed from: f */
        Object f1637f;

        /* renamed from: g */
        private Activity f1638g;

        /* renamed from: h */
        private boolean f1639h = false;

        /* renamed from: i */
        private boolean f1640i = false;

        /* renamed from: j */
        private boolean f1641j = false;

        C0351d(Activity activity) {
            this.f1638g = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1638g == activity) {
                this.f1638g = null;
                this.f1640i = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1640i && !this.f1641j && !this.f1639h && C0347c.m1788a(this.f1637f, activity)) {
                this.f1641j = true;
                this.f1637f = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1638g == activity) {
                this.f1639h = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    private static Class<?> m1785a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m1786a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m1787a(Activity activity) {
        Application application;
        C0351d dVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m1793d() && f1629f == null) {
            return false;
        } else {
            if (f1628e == null && f1627d == null) {
                return false;
            }
            try {
                Object obj = f1626c.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = f1625b.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0351d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f1630g.post(new C0348a(dVar, obj));
                if (m1793d()) {
                    f1629f.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), Boolean.valueOf(false), null, null, Boolean.valueOf(false), Boolean.valueOf(false)});
                } else {
                    activity.recreate();
                }
                f1630g.post(new C0349b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    protected static boolean m1788a(Object obj, Activity activity) {
        try {
            Object obj2 = f1626c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f1630g.postAtFrontOfQueue(new C0350c(f1625b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: b */
    private static Field m1789b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m1790b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m1791c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m1792c(Class<?> cls) {
        if (m1793d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m1793d() {
        int i = VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
