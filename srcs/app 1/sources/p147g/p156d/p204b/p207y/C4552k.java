package p147g.p156d.p204b.p207y;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.d.b.y.k */
public final class C4552k {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f11977a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m18445a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m18445a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m18445a(hashMap, hashMap2, Character.TYPE, Character.class);
        m18445a(hashMap, hashMap2, Double.TYPE, Double.class);
        m18445a(hashMap, hashMap2, Float.TYPE, Float.class);
        m18445a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m18445a(hashMap, hashMap2, Long.TYPE, Long.class);
        m18445a(hashMap, hashMap2, Short.TYPE, Short.class);
        m18445a(hashMap, hashMap2, Void.TYPE, Void.class);
        f11977a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static <T> Class<T> m18444a(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f11977a;
        C4517a.m18364a(cls);
        Class cls2 = (Class) map.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: a */
    private static void m18445a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m18446a(Type type) {
        return f11977a.containsKey(type);
    }
}
