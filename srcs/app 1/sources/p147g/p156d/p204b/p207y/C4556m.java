package p147g.p156d.p204b.p207y;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: g.d.b.y.m */
public abstract class C4556m {

    /* renamed from: g.d.b.y.m$a */
    static class C4557a extends C4556m {

        /* renamed from: a */
        final /* synthetic */ Method f11981a;

        /* renamed from: b */
        final /* synthetic */ Object f11982b;

        C4557a(Method method, Object obj) {
            this.f11981a = method;
            this.f11982b = obj;
        }

        /* renamed from: a */
        public <T> T mo13475a(Class<T> cls) {
            C4556m.m18451b(cls);
            return this.f11981a.invoke(this.f11982b, new Object[]{cls});
        }
    }

    /* renamed from: g.d.b.y.m$b */
    static class C4558b extends C4556m {

        /* renamed from: a */
        final /* synthetic */ Method f11983a;

        /* renamed from: b */
        final /* synthetic */ int f11984b;

        C4558b(Method method, int i) {
            this.f11983a = method;
            this.f11984b = i;
        }

        /* renamed from: a */
        public <T> T mo13475a(Class<T> cls) {
            C4556m.m18451b(cls);
            return this.f11983a.invoke(null, new Object[]{cls, Integer.valueOf(this.f11984b)});
        }
    }

    /* renamed from: g.d.b.y.m$c */
    static class C4559c extends C4556m {

        /* renamed from: a */
        final /* synthetic */ Method f11985a;

        C4559c(Method method) {
            this.f11985a = method;
        }

        /* renamed from: a */
        public <T> T mo13475a(Class<T> cls) {
            C4556m.m18451b(cls);
            return this.f11985a.invoke(null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: g.d.b.y.m$d */
    static class C4560d extends C4556m {
        C4560d() {
        }

        /* renamed from: a */
        public <T> T mo13475a(Class<T> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot allocate ");
            sb.append(cls);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: a */
    public static C4556m m18450a() {
        String str = "newInstance";
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C4557a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C4558b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C4559c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C4560d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m18451b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo13475a(Class<T> cls);
}
