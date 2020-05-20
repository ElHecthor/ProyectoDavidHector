package p071f.p089f.p093b.p094j;

import p071f.p089f.p093b.p094j.C3196e.C3198b;
import p071f.p089f.p093b.p094j.p095n.C3210b.C3211a;
import p071f.p089f.p093b.p094j.p095n.C3210b.C3212b;

/* renamed from: f.f.b.j.l */
public class C3207l extends C3205j {

    /* renamed from: g0 */
    private int f9245g0 = 0;

    /* renamed from: h0 */
    private int f9246h0 = 0;

    /* renamed from: i0 */
    private int f9247i0 = 0;

    /* renamed from: j0 */
    private int f9248j0 = 0;

    /* renamed from: k0 */
    private boolean f9249k0 = false;

    /* renamed from: l0 */
    private int f9250l0 = 0;

    /* renamed from: m0 */
    private int f9251m0 = 0;

    /* renamed from: n0 */
    protected C3211a f9252n0 = new C3211a();

    /* renamed from: G */
    public void mo10372G() {
        for (int i = 0; i < this.f9243f0; i++) {
            C3196e eVar = this.f9242e0[i];
            if (eVar != null) {
                eVar.mo10432c(true);
            }
        }
    }

    /* renamed from: H */
    public int mo10529H() {
        return this.f9251m0;
    }

    /* renamed from: I */
    public int mo10530I() {
        return this.f9250l0;
    }

    /* renamed from: J */
    public int mo10531J() {
        return this.f9246h0;
    }

    /* renamed from: K */
    public int mo10532K() {
        return this.f9247i0;
    }

    /* renamed from: L */
    public int mo10533L() {
        return this.f9248j0;
    }

    /* renamed from: M */
    public int mo10534M() {
        return this.f9245g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo10535N() {
        C3196e eVar = this.f9128I;
        C3212b J = eVar != null ? ((C3199f) eVar).mo10474J() : null;
        if (J == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f9243f0) {
                return true;
            }
            C3196e eVar2 = this.f9242e0[i];
            if (eVar2 != null && !(eVar2 instanceof C3202h)) {
                C3198b b = eVar2.mo10418b(0);
                C3198b b2 = eVar2.mo10418b(1);
                C3198b bVar = C3198b.MATCH_CONSTRAINT;
                if (b != bVar || eVar2.f9158j == 1 || b2 != bVar || eVar2.f9159k == 1) {
                    z = false;
                }
                if (!z) {
                    if (b == C3198b.MATCH_CONSTRAINT) {
                        b = C3198b.WRAP_CONTENT;
                    }
                    if (b2 == C3198b.MATCH_CONSTRAINT) {
                        b2 = C3198b.WRAP_CONTENT;
                    }
                    C3211a aVar = this.f9252n0;
                    aVar.f9257a = b;
                    aVar.f9258b = b2;
                    aVar.f9259c = eVar2.mo10471y();
                    this.f9252n0.f9260d = eVar2.mo10444i();
                    J.mo1998a(eVar2, this.f9252n0);
                    eVar2.mo10459p(this.f9252n0.f9261e);
                    eVar2.mo10443h(this.f9252n0.f9262f);
                    eVar2.mo10441g(this.f9252n0.f9263g);
                }
            }
            i++;
        }
    }

    /* renamed from: O */
    public boolean mo10536O() {
        return this.f9249k0;
    }

    /* renamed from: a */
    public void mo10528a(C3199f fVar) {
        mo10372G();
    }

    /* renamed from: b */
    public void mo10503b(int i, int i2, int i3, int i4) {
    }

    /* renamed from: d */
    public void mo10537d(int i, int i2) {
        this.f9250l0 = i;
        this.f9251m0 = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10538d(boolean z) {
        this.f9249k0 = z;
    }

    /* renamed from: s */
    public void mo10378s(int i) {
        this.f9247i0 = i;
        this.f9245g0 = i;
        this.f9248j0 = i;
        this.f9246h0 = i;
    }

    /* renamed from: t */
    public void mo10539t(int i) {
        this.f9246h0 = i;
    }

    /* renamed from: u */
    public void mo10540u(int i) {
        this.f9247i0 = i;
    }

    /* renamed from: v */
    public void mo10541v(int i) {
        this.f9248j0 = i;
    }

    /* renamed from: w */
    public void mo10542w(int i) {
        this.f9245g0 = i;
    }
}
