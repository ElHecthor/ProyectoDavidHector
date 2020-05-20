package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
public class C0528q {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f2242a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C0512f>>> f2243b = new HashMap();

    /* renamed from: a */
    private static C0512f m2756a(Constructor<? extends C0512f> constructor, Object obj) {
        try {
            return (C0512f) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    static C0521l m2757a(Object obj) {
        boolean z = obj instanceof C0521l;
        boolean z2 = obj instanceof C0511e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0511e) obj, (C0521l) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0511e) obj, null);
        }
        if (z) {
            return (C0521l) obj;
        }
        Class cls = obj.getClass();
        if (m2760b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f2243b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2756a((Constructor) list.get(0), obj));
        }
        C0512f[] fVarArr = new C0512f[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fVarArr[i] = m2756a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    /* renamed from: a */
    public static String m2758a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: a */
    private static Constructor<? extends C0512f> m2759a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m2758a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0512f> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m2760b(Class<?> cls) {
        Integer num = (Integer) f2242a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int d = m2762d(cls);
        f2242a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m2761c(Class<?> cls) {
        return cls != null && C0522m.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m2762d(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m2759a(cls);
        if (a != null) {
            f2243b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0495a.f2202c.mo3000b(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m2761c(superclass)) {
                if (m2760b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f2243b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m2761c(cls2)) {
                    if (m2760b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f2243b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2243b.put(cls, arrayList);
            return 2;
        }
    }
}
