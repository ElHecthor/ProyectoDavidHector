package p337m.p338f0.p345i.p346i;

import java.lang.reflect.Method;
import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.i.i.e */
public final class C6390e {

    /* renamed from: d */
    public static final C6391a f15846d = new C6391a(null);

    /* renamed from: a */
    private final Method f15847a;

    /* renamed from: b */
    private final Method f15848b;

    /* renamed from: c */
    private final Method f15849c;

    /* renamed from: m.f0.i.i.e$a */
    public static final class C6391a {
        private C6391a() {
        }

        public /* synthetic */ C6391a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C6390e mo16494a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C6390e(method3, method, method2);
        }
    }

    public C6390e(Method method, Method method2, Method method3) {
        this.f15847a = method;
        this.f15848b = method2;
        this.f15849c = method3;
    }

    /* renamed from: a */
    public final Object mo16492a(String str) {
        C5942k.m22327b(str, "closer");
        Method method = this.f15847a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f15848b;
                if (method2 != null) {
                    method2.invoke(invoke, new Object[]{str});
                    return invoke;
                }
                C5942k.m22323a();
                throw null;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo16493a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f15849c;
            if (method != null) {
                method.invoke(obj, new Object[0]);
                return true;
            }
            C5942k.m22323a();
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }
}
