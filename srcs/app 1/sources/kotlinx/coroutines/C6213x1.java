package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.x1 */
public class C6213x1 extends C6014b2 implements C6188s {

    /* renamed from: g */
    private final boolean f15322g = m23280s();

    public C6213x1(C6199u1 u1Var) {
        super(true);
        mo15725a(u1Var);
    }

    /* renamed from: s */
    private final boolean m23280s() {
        C6168o oVar = this.parentHandle;
        if (!(oVar instanceof C6172p)) {
            oVar = null;
        }
        C6172p pVar = (C6172p) oVar;
        if (pVar != null) {
            C6014b2 b2Var = (C6014b2) pVar.f14955i;
            if (b2Var != null) {
                while (!b2Var.mo15739h()) {
                    C6168o oVar2 = b2Var.parentHandle;
                    if (!(oVar2 instanceof C6172p)) {
                        oVar2 = null;
                    }
                    C6172p pVar2 = (C6172p) oVar2;
                    if (pVar2 != null) {
                        b2Var = (C6014b2) pVar2.f14955i;
                        if (b2Var == null) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo15739h() {
        return this.f15322g;
    }

    /* renamed from: k */
    public boolean mo15741k() {
        return true;
    }
}
