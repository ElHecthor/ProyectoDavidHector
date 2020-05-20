package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4220f;

/* renamed from: g.d.a.b.d.g.f4 */
public class C3999f4 {

    /* renamed from: b */
    private static volatile C3999f4 f10930b;

    /* renamed from: c */
    private static volatile C3999f4 f10931c;

    /* renamed from: d */
    private static final C3999f4 f10932d = new C3999f4(true);

    /* renamed from: a */
    private final Map<C4000a, C4220f<?, ?>> f10933a;

    /* renamed from: g.d.a.b.d.g.f4$a */
    static final class C4000a {

        /* renamed from: a */
        private final Object f10934a;

        /* renamed from: b */
        private final int f10935b;

        C4000a(Object obj, int i) {
            this.f10934a = obj;
            this.f10935b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4000a)) {
                return false;
            }
            C4000a aVar = (C4000a) obj;
            return this.f10934a == aVar.f10934a && this.f10935b == aVar.f10935b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10934a) * 65535) + this.f10935b;
        }
    }

    C3999f4() {
        this.f10933a = new HashMap();
    }

    private C3999f4(boolean z) {
        this.f10933a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C3999f4 m16366a() {
        C3999f4 f4Var = f10930b;
        if (f4Var == null) {
            synchronized (C3999f4.class) {
                f4Var = f10930b;
                if (f4Var == null) {
                    f4Var = f10932d;
                    f10930b = f4Var;
                }
            }
        }
        return f4Var;
    }

    /* renamed from: b */
    public static C3999f4 m16367b() {
        Class<C3999f4> cls = C3999f4.class;
        C3999f4 f4Var = f10931c;
        if (f4Var != null) {
            return f4Var;
        }
        synchronized (cls) {
            C3999f4 f4Var2 = f10931c;
            if (f4Var2 != null) {
                return f4Var2;
            }
            C3999f4 a = C4180r4.m16983a(cls);
            f10931c = a;
            return a;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends C3985e6> C4220f<ContainingType, ?> mo12451a(ContainingType containingtype, int i) {
        return (C4220f) this.f10933a.get(new C4000a(containingtype, i));
    }
}
