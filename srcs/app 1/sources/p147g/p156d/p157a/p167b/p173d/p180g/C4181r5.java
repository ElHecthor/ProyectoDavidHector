package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4219e;

/* renamed from: g.d.a.b.d.g.r5 */
final class C4181r5 implements C4265w6 {

    /* renamed from: b */
    private static final C3931b6 f11259b = new C4235u5();

    /* renamed from: a */
    private final C3931b6 f11260a;

    public C4181r5() {
        this(new C4221t5(C4234u4.m17251a(), m16985a()));
    }

    private C4181r5(C3931b6 b6Var) {
        C4248v4.m17306a(b6Var, "messageInfoFactory");
        this.f11260a = b6Var;
    }

    /* renamed from: a */
    private static C3931b6 m16985a() {
        try {
            return (C3931b6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f11259b;
        }
    }

    /* renamed from: a */
    private static boolean m16986a(C3949c6 c6Var) {
        return c6Var.mo12282a() == C4219e.f11323i;
    }

    /* renamed from: a */
    public final <T> C4236u6<T> mo12744a(Class<T> cls) {
        Class<C4214t4> cls2 = C4214t4.class;
        C4250v6.m17326a(cls);
        C3949c6 b = this.f11260a.mo12112b(cls);
        if (b.mo12283b()) {
            return cls2.isAssignableFrom(cls) ? C4080k6.m16701a(C4250v6.m17338c(), C4047i4.m16534a(), b.mo12284c()) : C4080k6.m16701a(C4250v6.m17316a(), C4047i4.m16535b(), b.mo12284c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean a = m16986a(b);
            C4125n6 b2 = C4153p6.m16923b();
            C4138o5 b3 = C4138o5.m16890b();
            C4096l7 c = C4250v6.m17338c();
            if (a) {
                return C4049i6.m16547a(cls, b, b2, b3, c, C4047i4.m16534a(), C4310z5.m17647b());
            }
            return C4049i6.m16547a(cls, b, b2, b3, c, null, C4310z5.m17647b());
        }
        boolean a2 = m16986a(b);
        C4125n6 a3 = C4153p6.m16922a();
        C4138o5 a4 = C4138o5.m16889a();
        if (a2) {
            return C4049i6.m16547a(cls, b, a3, a4, C4250v6.m17316a(), C4047i4.m16535b(), C4310z5.m17646a());
        }
        return C4049i6.m16547a(cls, b, a3, a4, C4250v6.m17332b(), null, C4310z5.m17646a());
    }
}
