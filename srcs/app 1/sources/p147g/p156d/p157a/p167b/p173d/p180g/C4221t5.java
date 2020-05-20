package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.t5 */
final class C4221t5 implements C3931b6 {

    /* renamed from: a */
    private C3931b6[] f11327a;

    C4221t5(C3931b6... b6VarArr) {
        this.f11327a = b6VarArr;
    }

    /* renamed from: a */
    public final boolean mo12111a(Class<?> cls) {
        for (C3931b6 a : this.f11327a) {
            if (a.mo12111a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C3949c6 mo12112b(Class<?> cls) {
        C3931b6[] b6VarArr;
        for (C3931b6 b6Var : this.f11327a) {
            if (b6Var.mo12111a(cls)) {
                return b6Var.mo12112b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
