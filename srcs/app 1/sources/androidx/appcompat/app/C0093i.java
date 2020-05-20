package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.i */
class C0093i {

    /* renamed from: a */
    private static Field f325a;

    /* renamed from: b */
    private static boolean f326b;

    /* renamed from: c */
    private static Class<?> f327c;

    /* renamed from: d */
    private static boolean f328d;

    /* renamed from: e */
    private static Field f329e;

    /* renamed from: f */
    private static boolean f330f;

    /* renamed from: g */
    private static Field f331g;

    /* renamed from: h */
    private static boolean f332h;

    /* renamed from: a */
    static void m424a(Resources resources) {
        int i = VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m428d(resources);
            } else if (i >= 23) {
                m427c(resources);
            } else if (i >= 21) {
                m426b(resources);
            }
        }
    }

    /* renamed from: a */
    private static void m425a(Object obj) {
        String str = "ResourcesFlusher";
        if (!f328d) {
            try {
                f327c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            f328d = true;
        }
        Class<?> cls = f327c;
        if (cls != null) {
            if (!f330f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f329e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f330f = true;
            }
            Field field = f329e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m426b(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f326b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f325a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f326b = true;
        }
        Field field = f325a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m427c(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f326b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f325a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f326b = true;
        }
        Object obj = null;
        Field field = f325a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m425a(obj);
        }
    }

    /* renamed from: d */
    private static void m428d(Resources resources) {
        Object obj;
        String str = "ResourcesFlusher";
        if (!f332h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f331g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f332h = true;
        }
        Field field = f331g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f326b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f325a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(str, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f326b = true;
                }
                Field field2 = f325a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e(str, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m425a(obj2);
                }
            }
        }
    }
}
