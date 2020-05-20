package p071f.p097h.p106k;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: f.h.k.c */
public final class C3301c {

    /* renamed from: a */
    private static Method f9467a;

    /* renamed from: b */
    private static Method f9468b;

    static {
        Class<String> cls = String.class;
        String str = "libcore.icu.ICU";
        int i = VERSION.SDK_INT;
        String str2 = "addLikelySubtags";
        if (i < 21) {
            try {
                Class cls2 = Class.forName(str);
                if (cls2 != null) {
                    f9467a = cls2.getMethod("getScript", new Class[]{cls});
                    f9468b = cls2.getMethod(str2, new Class[]{cls});
                }
            } catch (Exception e) {
                f9467a = null;
                f9468b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f9468b = Class.forName(str).getMethod(str2, new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m13502a(String str) {
        String str2 = "ICUCompat";
        try {
            if (f9467a != null) {
                return (String) f9467a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(str2, e);
        }
        return null;
    }

    /* renamed from: a */
    private static String m13503a(Locale locale) {
        String str = "ICUCompat";
        String locale2 = locale.toString();
        try {
            if (f9468b != null) {
                return (String) f9468b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(str, e);
        }
        return locale2;
    }

    /* renamed from: b */
    public static String m13504b(Locale locale) {
        String str = "ICUCompat";
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f9468b.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w(str, e);
                return locale.getScript();
            }
        } else {
            String a = m13503a(locale);
            if (a != null) {
                return m13502a(a);
            }
            return null;
        }
    }
}
