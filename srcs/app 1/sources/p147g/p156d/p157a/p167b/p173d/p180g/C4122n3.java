package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Comparator;

/* renamed from: g.d.a.b.d.g.n3 */
final class C4122n3 implements Comparator<C4092l3> {
    C4122n3() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C4092l3 l3Var = (C4092l3) obj;
        C4092l3 l3Var2 = (C4092l3) obj2;
        C4233u3 u3Var = (C4233u3) l3Var.iterator();
        C4233u3 u3Var2 = (C4233u3) l3Var2.iterator();
        while (u3Var.hasNext() && u3Var2.hasNext()) {
            int compare = Integer.compare(C4092l3.m16740b(u3Var.mo12680a()), C4092l3.m16740b(u3Var2.mo12680a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(l3Var.mo12608a(), l3Var2.mo12608a());
    }
}
