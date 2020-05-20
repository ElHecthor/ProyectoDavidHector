package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.a6 */
final class C3915a6 implements C4280x5 {
    C3915a6() {
    }

    /* renamed from: a */
    public final int mo12081a(int i, Object obj, Object obj2) {
        C4295y5 y5Var = (C4295y5) obj;
        C4264w5 w5Var = (C4264w5) obj2;
        if (y5Var.isEmpty()) {
            return 0;
        }
        Iterator it = y5Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Entry entry = (Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public final Object mo12082a(Object obj, Object obj2) {
        C4295y5 y5Var = (C4295y5) obj;
        C4295y5 y5Var2 = (C4295y5) obj2;
        if (!y5Var2.isEmpty()) {
            if (!y5Var.mo12942d()) {
                y5Var = y5Var.mo12939b();
            }
            y5Var.mo12938a(y5Var2);
        }
        return y5Var;
    }

    /* renamed from: a */
    public final Map<?, ?> mo12083a(Object obj) {
        return (C4295y5) obj;
    }

    /* renamed from: b */
    public final Object mo12084b(Object obj) {
        ((C4295y5) obj).mo12940c();
        return obj;
    }

    /* renamed from: c */
    public final boolean mo12085c(Object obj) {
        return !((C4295y5) obj).mo12942d();
    }

    /* renamed from: d */
    public final Map<?, ?> mo12086d(Object obj) {
        return (C4295y5) obj;
    }

    /* renamed from: e */
    public final C4249v5<?, ?> mo12087e(Object obj) {
        C4264w5 w5Var = (C4264w5) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: f */
    public final Object mo12088f(Object obj) {
        return C4295y5.m17602a().mo12939b();
    }
}
