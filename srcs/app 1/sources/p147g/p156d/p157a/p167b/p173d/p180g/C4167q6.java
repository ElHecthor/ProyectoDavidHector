package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: g.d.a.b.d.g.q6 */
final class C4167q6 {

    /* renamed from: c */
    private static final C4167q6 f11246c = new C4167q6();

    /* renamed from: a */
    private final C4265w6 f11247a = new C4181r5();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C4236u6<?>> f11248b = new ConcurrentHashMap();

    private C4167q6() {
    }

    /* renamed from: a */
    public static C4167q6 m16944a() {
        return f11246c;
    }

    /* renamed from: a */
    public final <T> C4236u6<T> mo12721a(Class<T> cls) {
        String str = "messageType";
        C4248v4.m17306a(cls, str);
        C4236u6<T> u6Var = (C4236u6) this.f11248b.get(cls);
        if (u6Var != null) {
            return u6Var;
        }
        C4236u6<T> a = this.f11247a.mo12744a(cls);
        C4248v4.m17306a(cls, str);
        C4248v4.m17306a(a, "schema");
        C4236u6 u6Var2 = (C4236u6) this.f11248b.putIfAbsent(cls, a);
        return u6Var2 != null ? u6Var2 : a;
    }

    /* renamed from: a */
    public final <T> C4236u6<T> mo12722a(T t) {
        return mo12721a(t.getClass());
    }
}
