package p071f.p089f.p093b.p094j;

import p071f.p089f.p093b.C3183e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;

/* renamed from: f.f.b.j.k */
public class C3206k {

    /* renamed from: a */
    static boolean[] f9244a = new boolean[3];

    /* renamed from: a */
    static void m13155a(C3199f fVar, C3183e eVar, C3196e eVar2) {
        eVar2.f9156h = -1;
        eVar2.f9157i = -1;
        if (fVar.f9127H[0] != C3198b.WRAP_CONTENT && eVar2.f9127H[0] == C3198b.MATCH_PARENT) {
            int i = eVar2.f9172x.f9105d;
            int y = fVar.mo10471y() - eVar2.f9174z.f9105d;
            C3193d dVar = eVar2.f9172x;
            dVar.f9107f = eVar.mo10345a((Object) dVar);
            C3193d dVar2 = eVar2.f9174z;
            dVar2.f9107f = eVar.mo10345a((Object) dVar2);
            eVar.mo10349a(eVar2.f9172x.f9107f, i);
            eVar.mo10349a(eVar2.f9174z.f9107f, y);
            eVar2.f9156h = 2;
            eVar2.mo10404a(i, y);
        }
        if (fVar.f9127H[1] != C3198b.WRAP_CONTENT && eVar2.f9127H[1] == C3198b.MATCH_PARENT) {
            int i2 = eVar2.f9173y.f9105d;
            int i3 = fVar.mo10444i() - eVar2.f9120A.f9105d;
            C3193d dVar3 = eVar2.f9173y;
            dVar3.f9107f = eVar.mo10345a((Object) dVar3);
            C3193d dVar4 = eVar2.f9120A;
            dVar4.f9107f = eVar.mo10345a((Object) dVar4);
            eVar.mo10349a(eVar2.f9173y.f9107f, i2);
            eVar.mo10349a(eVar2.f9120A.f9107f, i3);
            if (eVar2.f9135P > 0 || eVar2.mo10470x() == 8) {
                C3193d dVar5 = eVar2.f9121B;
                dVar5.f9107f = eVar.mo10345a((Object) dVar5);
                eVar.mo10349a(eVar2.f9121B.f9107f, eVar2.f9135P + i2);
            }
            eVar2.f9157i = 2;
            eVar2.mo10430c(i2, i3);
        }
    }

    /* renamed from: a */
    public static final boolean m13156a(int i, int i2) {
        return (i & i2) == i2;
    }
}
