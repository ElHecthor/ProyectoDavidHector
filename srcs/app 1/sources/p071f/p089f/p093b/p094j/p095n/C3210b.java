package p071f.p089f.p093b.p094j.p095n;

import java.util.ArrayList;
import java.util.Iterator;
import p071f.p089f.p093b.C3183e;
import p071f.p089f.p093b.C3185f;
import p071f.p089f.p093b.p094j.C3193d.C3195b;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;
import p071f.p089f.p093b.p094j.C3199f;
import p071f.p089f.p093b.p094j.C3202h;
import p071f.p089f.p093b.p094j.C3204i;
import p071f.p089f.p093b.p094j.C3206k;
import p071f.p089f.p093b.p094j.C3207l;

/* renamed from: f.f.b.j.n.b */
public class C3210b {

    /* renamed from: a */
    private final ArrayList<C3196e> f9254a = new ArrayList<>();

    /* renamed from: b */
    private C3211a f9255b = new C3211a();

    /* renamed from: c */
    private C3199f f9256c;

    /* renamed from: f.f.b.j.n.b$a */
    public static class C3211a {

        /* renamed from: a */
        public C3198b f9257a;

        /* renamed from: b */
        public C3198b f9258b;

        /* renamed from: c */
        public int f9259c;

        /* renamed from: d */
        public int f9260d;

        /* renamed from: e */
        public int f9261e;

        /* renamed from: f */
        public int f9262f;

        /* renamed from: g */
        public int f9263g;

        /* renamed from: h */
        public boolean f9264h;

        /* renamed from: i */
        public boolean f9265i;

        /* renamed from: j */
        public boolean f9266j;
    }

    /* renamed from: f.f.b.j.n.b$b */
    public interface C3212b {
        /* renamed from: a */
        void mo1997a();

        /* renamed from: a */
        void mo1998a(C3196e eVar, C3211a aVar);
    }

    public C3210b(C3199f fVar) {
        this.f9256c = fVar;
    }

    /* renamed from: a */
    private void m13182a(C3199f fVar, String str, int i, int i2) {
        int q = fVar.mo10460q();
        int p = fVar.mo10458p();
        fVar.mo10453m(0);
        fVar.mo10451l(0);
        fVar.mo10459p(i);
        fVar.mo10443h(i2);
        fVar.mo10453m(q);
        fVar.mo10451l(p);
        this.f9256c.mo10473H();
    }

    /* renamed from: a */
    private boolean m13183a(C3212b bVar, C3196e eVar, boolean z) {
        this.f9255b.f9257a = eVar.mo10450l();
        this.f9255b.f9258b = eVar.mo10468v();
        this.f9255b.f9259c = eVar.mo10471y();
        this.f9255b.f9260d = eVar.mo10444i();
        C3211a aVar = this.f9255b;
        aVar.f9265i = false;
        aVar.f9266j = z;
        boolean z2 = aVar.f9257a == C3198b.MATCH_CONSTRAINT;
        boolean z3 = this.f9255b.f9258b == C3198b.MATCH_CONSTRAINT;
        boolean z4 = z2 && eVar.f9131L > 0.0f;
        boolean z5 = z3 && eVar.f9131L > 0.0f;
        if (z4 && eVar.f9160l[0] == 4) {
            this.f9255b.f9257a = C3198b.FIXED;
        }
        if (z5 && eVar.f9160l[1] == 4) {
            this.f9255b.f9258b = C3198b.FIXED;
        }
        bVar.mo1998a(eVar, this.f9255b);
        eVar.mo10459p(this.f9255b.f9261e);
        eVar.mo10443h(this.f9255b.f9262f);
        eVar.mo10415a(this.f9255b.f9264h);
        eVar.mo10441g(this.f9255b.f9263g);
        C3211a aVar2 = this.f9255b;
        aVar2.f9266j = false;
        return aVar2.f9265i;
    }

    /* renamed from: b */
    private void m13184b(C3199f fVar) {
        int size = fVar.f9253e0.size();
        C3212b J = fVar.mo10474J();
        for (int i = 0; i < size; i++) {
            C3196e eVar = (C3196e) fVar.f9253e0.get(i);
            if (!(eVar instanceof C3202h) && (!eVar.f9152d.f9312e.f9286j || !eVar.f9153e.f9312e.f9286j)) {
                C3198b b = eVar.mo10418b(0);
                boolean z = true;
                C3198b b2 = eVar.mo10418b(1);
                C3198b bVar = C3198b.MATCH_CONSTRAINT;
                if (b != bVar || eVar.f9158j == 1 || b2 != bVar || eVar.f9159k == 1) {
                    z = false;
                }
                if (!z) {
                    m13183a(J, eVar, false);
                }
            }
        }
        J.mo1997a();
    }

    /* renamed from: a */
    public void mo10546a(C3199f fVar) {
        this.f9254a.clear();
        int size = fVar.f9253e0.size();
        for (int i = 0; i < size; i++) {
            C3196e eVar = (C3196e) fVar.f9253e0.get(i);
            if (eVar.mo10450l() == C3198b.MATCH_CONSTRAINT || eVar.mo10450l() == C3198b.MATCH_PARENT || eVar.mo10468v() == C3198b.MATCH_CONSTRAINT || eVar.mo10468v() == C3198b.MATCH_PARENT) {
                this.f9254a.add(eVar);
            }
        }
        fVar.mo10477M();
    }

    /* renamed from: a */
    public void mo10547a(C3199f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        C3212b bVar;
        int i11;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        int i14;
        C3199f fVar2 = fVar;
        int i15 = i;
        int i16 = i4;
        int i17 = i6;
        C3212b J = fVar.mo10474J();
        int size = fVar2.f9253e0.size();
        int y = fVar.mo10471y();
        int i18 = fVar.mo10444i();
        boolean a = C3206k.m13156a(i15, 128);
        boolean z6 = a || C3206k.m13156a(i15, 64);
        if (z6) {
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                C3196e eVar = (C3196e) fVar2.f9253e0.get(i19);
                boolean z7 = (eVar.mo10450l() == C3198b.MATCH_CONSTRAINT) && (eVar.mo10468v() == C3198b.MATCH_CONSTRAINT) && eVar.mo10440g() > 0.0f;
                if ((!eVar.mo10397C() || !z7) && ((!eVar.mo10398D() || !z7) && !(eVar instanceof C3207l))) {
                    i19++;
                }
            }
            z6 = false;
        }
        if (z6) {
            C3185f fVar3 = C3183e.f9020r;
            if (fVar3 != null) {
                fVar3.f9037a++;
            }
        }
        if (z6 && (i16 == 1073741824 && i17 == 1073741824)) {
            int min = Math.min(fVar.mo10456o(), i5);
            int min2 = Math.min(fVar.mo10454n(), i7);
            if (i16 == 1073741824 && fVar.mo10471y() != min) {
                fVar2.mo10459p(min);
                fVar.mo10477M();
            }
            if (i17 == 1073741824 && fVar.mo10444i() != min2) {
                fVar2.mo10443h(min2);
                fVar.mo10477M();
            }
            if (i16 == 1073741824 && i17 == 1073741824) {
                z = fVar2.mo10489d(a);
                i10 = 2;
            } else {
                boolean e = fVar2.mo10490e(a);
                if (i16 == 1073741824) {
                    z5 = e & fVar2.mo10487a(a, 0);
                    i14 = 1;
                } else {
                    z5 = e;
                    i14 = 0;
                }
                if (i17 == 1073741824) {
                    boolean a2 = fVar2.mo10487a(a, 1) & z5;
                    i10 = i14 + 1;
                    z = a2;
                } else {
                    i10 = i14;
                    z = z5;
                }
            }
            if (z) {
                fVar2.mo10416a(i16 == 1073741824, i17 == 1073741824);
            }
        } else {
            fVar2.f9152d.mo10551c();
            fVar2.f9153e.mo10551c();
            Iterator it = fVar.mo10372G().iterator();
            while (it.hasNext()) {
                C3196e eVar2 = (C3196e) it.next();
                eVar2.f9152d.mo10551c();
                eVar2.f9153e.mo10551c();
            }
            z = false;
            i10 = 0;
        }
        if (!z || i10 != 2) {
            if (size > 0) {
                m13184b(fVar);
            }
            int K = fVar.mo10475K();
            int size2 = this.f9254a.size();
            if (size > 0) {
                m13182a(fVar2, "First pass", y, i18);
            }
            if (size2 > 0) {
                boolean z8 = fVar.mo10450l() == C3198b.WRAP_CONTENT;
                boolean z9 = fVar.mo10468v() == C3198b.WRAP_CONTENT;
                int max = Math.max(fVar.mo10471y(), this.f9256c.mo10460q());
                int max2 = Math.max(fVar.mo10444i(), this.f9256c.mo10458p());
                int i20 = 0;
                boolean z10 = false;
                while (i20 < size2) {
                    C3196e eVar3 = (C3196e) this.f9254a.get(i20);
                    if (!(eVar3 instanceof C3207l)) {
                        i13 = K;
                    } else {
                        int y2 = eVar3.mo10471y();
                        int i21 = eVar3.mo10444i();
                        i13 = K;
                        boolean a3 = z10 | m13183a(J, eVar3, true);
                        int y3 = eVar3.mo10471y();
                        boolean z11 = a3;
                        int i22 = eVar3.mo10444i();
                        if (y3 != y2) {
                            eVar3.mo10459p(y3);
                            if (z8 && eVar3.mo10464s() > max) {
                                max = Math.max(max, eVar3.mo10464s() + eVar3.mo10402a(C3195b.RIGHT).mo10381a());
                            }
                            z4 = true;
                        } else {
                            z4 = z11;
                        }
                        if (i22 != i21) {
                            eVar3.mo10443h(i22);
                            if (z9 && eVar3.mo10433d() > max2) {
                                max2 = Math.max(max2, eVar3.mo10433d() + eVar3.mo10402a(C3195b.BOTTOM).mo10381a());
                            }
                            z4 = true;
                        }
                        z10 = z4 | ((C3207l) eVar3).mo10536O();
                    }
                    i20++;
                    K = i13;
                }
                int i23 = K;
                int i24 = 0;
                while (i24 < 2) {
                    int i25 = 0;
                    while (i25 < size2) {
                        C3196e eVar4 = (C3196e) this.f9254a.get(i25);
                        if ((!(eVar4 instanceof C3204i) || (eVar4 instanceof C3207l)) && !(eVar4 instanceof C3202h) && eVar4.mo10470x() != 8 && ((!eVar4.f9152d.f9312e.f9286j || !eVar4.f9153e.f9312e.f9286j) && !(eVar4 instanceof C3207l))) {
                            int y4 = eVar4.mo10471y();
                            int i26 = eVar4.mo10444i();
                            i11 = size2;
                            int c = eVar4.mo10427c();
                            i12 = i24;
                            z10 |= m13183a(J, eVar4, true);
                            int y5 = eVar4.mo10471y();
                            bVar = J;
                            int i27 = eVar4.mo10444i();
                            if (y5 != y4) {
                                eVar4.mo10459p(y5);
                                if (z8 && eVar4.mo10464s() > max) {
                                    max = Math.max(max, eVar4.mo10464s() + eVar4.mo10402a(C3195b.RIGHT).mo10381a());
                                }
                                z10 = true;
                            }
                            if (i27 != i26) {
                                eVar4.mo10443h(i27);
                                if (z9 && eVar4.mo10433d() > max2) {
                                    max2 = Math.max(max2, eVar4.mo10433d() + eVar4.mo10402a(C3195b.BOTTOM).mo10381a());
                                }
                                z10 = true;
                            }
                            if (eVar4.mo10396B() && c != eVar4.mo10427c()) {
                                z10 = true;
                            }
                        } else {
                            i12 = i24;
                            i11 = size2;
                            bVar = J;
                        }
                        i25++;
                        size2 = i11;
                        J = bVar;
                        i24 = i12;
                    }
                    int i28 = i24;
                    int i29 = size2;
                    C3212b bVar2 = J;
                    if (z10) {
                        m13182a(fVar2, "intermediate pass", y, i18);
                        z10 = false;
                    }
                    i24 = i28 + 1;
                    size2 = i29;
                    J = bVar2;
                }
                if (z10) {
                    m13182a(fVar2, "2nd pass", y, i18);
                    if (fVar.mo10471y() < max) {
                        fVar2.mo10459p(max);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fVar.mo10444i() < max2) {
                        fVar2.mo10443h(max2);
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        m13182a(fVar2, "3rd pass", y, i18);
                    }
                }
                K = i23;
            }
            fVar2.mo10492t(K);
        }
    }
}
