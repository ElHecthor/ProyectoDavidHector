package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.lifecycle.a */
class C0495a {

    /* renamed from: c */
    static C0495a f2202c = new C0495a();

    /* renamed from: a */
    private final Map<Class<?>, C0496a> f2203a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f2204b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    static class C0496a {

        /* renamed from: a */
        final Map<C0515a, List<C0497b>> f2205a = new HashMap();

        /* renamed from: b */
        final Map<C0497b, C0515a> f2206b;

        C0496a(Map<C0497b, C0515a> map) {
            this.f2206b = map;
            for (Entry entry : map.entrySet()) {
                C0515a aVar = (C0515a) entry.getValue();
                List list = (List) this.f2205a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2205a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        private static void m2695a(List<C0497b> list, C0523n nVar, C0515a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0497b) list.get(size)).mo3002a(nVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3001a(C0523n nVar, C0515a aVar, Object obj) {
            m2695a((List) this.f2205a.get(aVar), nVar, aVar, obj);
            m2695a((List) this.f2205a.get(C0515a.ON_ANY), nVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    static class C0497b {

        /* renamed from: a */
        final int f2207a;

        /* renamed from: b */
        final Method f2208b;

        C0497b(int i, Method method) {
            this.f2207a = i;
            this.f2208b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3002a(C0523n nVar, C0515a aVar, Object obj) {
            try {
                int i = this.f2207a;
                if (i == 0) {
                    this.f2208b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2208b.invoke(obj, new Object[]{nVar});
                } else if (i == 2) {
                    this.f2208b.invoke(obj, new Object[]{nVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0497b.class != obj.getClass()) {
                return false;
            }
            C0497b bVar = (C0497b) obj;
            if (this.f2207a != bVar.f2207a || !this.f2208b.getName().equals(bVar.f2208b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f2207a * 31) + this.f2208b.getName().hashCode();
        }
    }

    C0495a() {
    }

    /* renamed from: a */
    private C0496a m2690a(Class<?> cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0496a a = mo2999a(superclass);
            if (a != null) {
                hashMap.putAll(a.f2206b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo2999a(a2).f2206b.entrySet()) {
                m2691a(hashMap, (C0497b) entry.getKey(), (C0515a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2692c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0534v vVar = (C0534v) method.getAnnotation(C0534v.class);
            if (vVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0523n.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0515a value = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0515a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0515a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m2691a(hashMap, new C0497b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0496a aVar = new C0496a(hashMap);
        this.f2203a.put(cls, aVar);
        this.f2204b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private void m2691a(Map<C0497b, C0515a> map, C0497b bVar, C0515a aVar, Class<?> cls) {
        C0515a aVar2 = (C0515a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2208b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: c */
    private Method[] m2692c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0496a mo2999a(Class<?> cls) {
        C0496a aVar = (C0496a) this.f2203a.get(cls);
        return aVar != null ? aVar : m2690a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3000b(Class<?> cls) {
        Boolean bool = (Boolean) this.f2204b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m2692c(cls);
        for (Method annotation : c) {
            if (((C0534v) annotation.getAnnotation(C0534v.class)) != null) {
                m2690a(cls, c);
                return true;
            }
        }
        this.f2204b.put(cls, Boolean.valueOf(false));
        return false;
    }
}
