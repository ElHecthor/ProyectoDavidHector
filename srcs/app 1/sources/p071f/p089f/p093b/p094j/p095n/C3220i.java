package p071f.p089f.p093b.p094j.p095n;

import p071f.p089f.p093b.p094j.C3190a;
import p071f.p089f.p093b.p094j.C3196e;

/* renamed from: f.f.b.j.n.i */
class C3220i extends C3226m {
    public C3220i(C3196e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    private void m13224a(C3216f fVar) {
        this.f9315h.f9287k.add(fVar);
        fVar.f9288l.add(this.f9315h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10548a() {
        C3226m mVar;
        C3196e eVar = this.f9309b;
        if (eVar instanceof C3190a) {
            this.f9315h.f9278b = true;
            C3190a aVar = (C3190a) eVar;
            int H = aVar.mo10373H();
            boolean G = aVar.mo10372G();
            int i = 0;
            if (H == 0) {
                this.f9315h.f9281e = C3217a.LEFT;
                while (i < aVar.f9243f0) {
                    C3196e eVar2 = aVar.f9242e0[i];
                    if (G || eVar2.mo10470x() != 8) {
                        C3216f fVar = eVar2.f9152d.f9315h;
                        fVar.f9287k.add(this.f9315h);
                        this.f9315h.f9288l.add(fVar);
                    }
                    i++;
                }
            } else if (H != 1) {
                if (H == 2) {
                    this.f9315h.f9281e = C3217a.TOP;
                    while (i < aVar.f9243f0) {
                        C3196e eVar3 = aVar.f9242e0[i];
                        if (G || eVar3.mo10470x() != 8) {
                            C3216f fVar2 = eVar3.f9153e.f9315h;
                            fVar2.f9287k.add(this.f9315h);
                            this.f9315h.f9288l.add(fVar2);
                        }
                        i++;
                    }
                } else if (H == 3) {
                    this.f9315h.f9281e = C3217a.BOTTOM;
                    while (i < aVar.f9243f0) {
                        C3196e eVar4 = aVar.f9242e0[i];
                        if (G || eVar4.mo10470x() != 8) {
                            C3216f fVar3 = eVar4.f9153e.f9316i;
                            fVar3.f9287k.add(this.f9315h);
                            this.f9315h.f9288l.add(fVar3);
                        }
                        i++;
                    }
                } else {
                    return;
                }
                m13224a(this.f9309b.f9153e.f9315h);
                mVar = this.f9309b.f9153e;
                m13224a(mVar.f9316i);
            } else {
                this.f9315h.f9281e = C3217a.RIGHT;
                while (i < aVar.f9243f0) {
                    C3196e eVar5 = aVar.f9242e0[i];
                    if (G || eVar5.mo10470x() != 8) {
                        C3216f fVar4 = eVar5.f9152d.f9316i;
                        fVar4.f9287k.add(this.f9315h);
                        this.f9315h.f9288l.add(fVar4);
                    }
                    i++;
                }
            }
            m13224a(this.f9309b.f9152d.f9315h);
            mVar = this.f9309b.f9152d;
            m13224a(mVar.f9316i);
        }
    }

    /* renamed from: a */
    public void mo10549a(C3214d dVar) {
        C3190a aVar = (C3190a) this.f9309b;
        int H = aVar.mo10373H();
        int i = 0;
        int i2 = -1;
        for (C3216f fVar : this.f9315h.f9288l) {
            int i3 = fVar.f9283g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (H == 0 || H == 2) {
            this.f9315h.mo10565a(i2 + aVar.mo10374I());
        } else {
            this.f9315h.mo10565a(i + aVar.mo10374I());
        }
    }

    /* renamed from: b */
    public void mo10550b() {
        C3196e eVar = this.f9309b;
        if (eVar instanceof C3190a) {
            int H = ((C3190a) eVar).mo10373H();
            if (H == 0 || H == 1) {
                this.f9309b.mo10461q(this.f9315h.f9283g);
            } else {
                this.f9309b.mo10463r(this.f9315h.f9283g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo10551c() {
        this.f9310c = null;
        this.f9315h.mo10564a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo10553f() {
        return false;
    }
}
