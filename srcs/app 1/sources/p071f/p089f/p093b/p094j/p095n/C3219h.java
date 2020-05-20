package p071f.p089f.p093b.p094j.p095n;

import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3202h;

/* renamed from: f.f.b.j.n.h */
class C3219h extends C3226m {
    public C3219h(C3196e eVar) {
        super(eVar);
        eVar.f9152d.mo10551c();
        eVar.f9153e.mo10551c();
        this.f9313f = ((C3202h) eVar).mo10372G();
    }

    /* renamed from: a */
    private void m13218a(C3216f fVar) {
        this.f9315h.f9287k.add(fVar);
        fVar.f9288l.add(this.f9315h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10548a() {
        C3226m mVar;
        C3216f fVar;
        C3216f fVar2;
        C3202h hVar = (C3202h) this.f9309b;
        int H = hVar.mo10520H();
        int I = hVar.mo10521I();
        hVar.mo10522J();
        if (hVar.mo10372G() == 1) {
            C3216f fVar3 = this.f9315h;
            if (H != -1) {
                fVar3.f9288l.add(this.f9309b.f9128I.f9152d.f9315h);
                this.f9309b.f9128I.f9152d.f9315h.f9287k.add(this.f9315h);
                fVar2 = this.f9315h;
            } else if (I != -1) {
                fVar3.f9288l.add(this.f9309b.f9128I.f9152d.f9316i);
                this.f9309b.f9128I.f9152d.f9316i.f9287k.add(this.f9315h);
                fVar2 = this.f9315h;
                H = -I;
            } else {
                fVar3.f9278b = true;
                fVar3.f9288l.add(this.f9309b.f9128I.f9152d.f9316i);
                this.f9309b.f9128I.f9152d.f9316i.f9287k.add(this.f9315h);
                m13218a(this.f9309b.f9152d.f9315h);
                mVar = this.f9309b.f9152d;
            }
            fVar2.f9282f = H;
            m13218a(this.f9309b.f9152d.f9315h);
            mVar = this.f9309b.f9152d;
        } else {
            C3216f fVar4 = this.f9315h;
            if (H != -1) {
                fVar4.f9288l.add(this.f9309b.f9128I.f9153e.f9315h);
                this.f9309b.f9128I.f9153e.f9315h.f9287k.add(this.f9315h);
                fVar = this.f9315h;
            } else if (I != -1) {
                fVar4.f9288l.add(this.f9309b.f9128I.f9153e.f9316i);
                this.f9309b.f9128I.f9153e.f9316i.f9287k.add(this.f9315h);
                fVar = this.f9315h;
                H = -I;
            } else {
                fVar4.f9278b = true;
                fVar4.f9288l.add(this.f9309b.f9128I.f9153e.f9316i);
                this.f9309b.f9128I.f9153e.f9316i.f9287k.add(this.f9315h);
                m13218a(this.f9309b.f9153e.f9315h);
                mVar = this.f9309b.f9153e;
            }
            fVar.f9282f = H;
            m13218a(this.f9309b.f9153e.f9315h);
            mVar = this.f9309b.f9153e;
        }
        m13218a(mVar.f9316i);
    }

    /* renamed from: a */
    public void mo10549a(C3214d dVar) {
        C3216f fVar = this.f9315h;
        if (fVar.f9279c && !fVar.f9286j) {
            this.f9315h.mo10565a((int) ((((float) ((C3216f) fVar.f9288l.get(0)).f9283g) * ((C3202h) this.f9309b).mo10522J()) + 0.5f));
        }
    }

    /* renamed from: b */
    public void mo10550b() {
        if (((C3202h) this.f9309b).mo10372G() == 1) {
            this.f9309b.mo10461q(this.f9315h.f9283g);
        } else {
            this.f9309b.mo10463r(this.f9315h.f9283g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo10551c() {
        this.f9315h.mo10564a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo10553f() {
        return false;
    }
}
