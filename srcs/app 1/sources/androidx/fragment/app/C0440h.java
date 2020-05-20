package androidx.fragment.app;

import androidx.fragment.app.Fragment.C0418e;
import p071f.p088e.C3175g;

/* renamed from: androidx.fragment.app.h */
public class C0440h {

    /* renamed from: a */
    private static final C3175g<String, Class<?>> f1993a = new C3175g<>();

    /* renamed from: b */
    static boolean m2336b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2337c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m2337c(ClassLoader classLoader, String str) {
        Class<?> cls = (Class) f1993a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f1993a.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2338d(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return m2337c(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new C0418e(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new C0418e(sb2.toString(), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo2728a(ClassLoader classLoader, String str) {
        throw null;
    }
}
