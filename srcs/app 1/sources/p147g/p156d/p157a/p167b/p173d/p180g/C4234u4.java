package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4219e;

/* renamed from: g.d.a.b.d.g.u4 */
final class C4234u4 implements C3931b6 {

    /* renamed from: a */
    private static final C4234u4 f11340a = new C4234u4();

    private C4234u4() {
    }

    /* renamed from: a */
    public static C4234u4 m17251a() {
        return f11340a;
    }

    /* renamed from: a */
    public final boolean mo12111a(Class<?> cls) {
        return C4214t4.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final C3949c6 mo12112b(Class<?> cls) {
        Class<C4214t4> cls2 = C4214t4.class;
        if (!cls2.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C3949c6) C4214t4.m17149a(cls.asSubclass(cls2)).mo12055a(C4219e.f11317c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
