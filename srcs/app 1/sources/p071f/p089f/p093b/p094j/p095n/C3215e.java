package p071f.p089f.p093b.p094j.p095n;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;
import p071f.p089f.p093b.p094j.C3199f;
import p071f.p089f.p093b.p094j.C3202h;
import p071f.p089f.p093b.p094j.C3205j;
import p071f.p089f.p093b.p094j.p095n.C3210b.C3211a;
import p071f.p089f.p093b.p094j.p095n.C3210b.C3212b;

/* renamed from: f.f.b.j.n.e */
public class C3215e {

    /* renamed from: a */
    private C3199f f9269a;

    /* renamed from: b */
    private boolean f9270b = true;

    /* renamed from: c */
    private boolean f9271c = true;

    /* renamed from: d */
    private C3199f f9272d;

    /* renamed from: e */
    private ArrayList<C3226m> f9273e = new ArrayList<>();

    /* renamed from: f */
    private C3212b f9274f;

    /* renamed from: g */
    private C3211a f9275g;

    /* renamed from: h */
    ArrayList<C3223k> f9276h;

    public C3215e(C3199f fVar) {
        new ArrayList();
        this.f9274f = null;
        this.f9275g = new C3211a();
        this.f9276h = new ArrayList<>();
        this.f9269a = fVar;
        this.f9272d = fVar;
    }

    /* renamed from: a */
    private int m13199a(C3199f fVar, int i) {
        int size = this.f9276h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C3223k) this.f9276h.get(i2)).mo10570a(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: a */
    private void m13200a(C3196e eVar, C3198b bVar, int i, C3198b bVar2, int i2) {
        C3211a aVar = this.f9275g;
        aVar.f9257a = bVar;
        aVar.f9258b = bVar2;
        aVar.f9259c = i;
        aVar.f9260d = i2;
        this.f9274f.mo1998a(eVar, aVar);
        eVar.mo10459p(this.f9275g.f9261e);
        eVar.mo10443h(this.f9275g.f9262f);
        eVar.mo10415a(this.f9275g.f9264h);
        eVar.mo10441g(this.f9275g.f9263g);
    }

    /* renamed from: a */
    private void m13201a(C3216f fVar, int i, int i2, C3216f fVar2, ArrayList<C3223k> arrayList, C3223k kVar) {
        C3226m mVar = fVar.f9280d;
        if (mVar.f9310c == null) {
            C3199f fVar3 = this.f9269a;
            if (mVar != fVar3.f9152d && mVar != fVar3.f9153e) {
                if (kVar == null) {
                    kVar = new C3223k(mVar, i2);
                    arrayList.add(kVar);
                }
                mVar.f9310c = kVar;
                kVar.mo10571a(mVar);
                for (C3214d dVar : mVar.f9315h.f9287k) {
                    if (dVar instanceof C3216f) {
                        m13201a((C3216f) dVar, i, 0, fVar2, arrayList, kVar);
                    }
                }
                for (C3214d dVar2 : mVar.f9316i.f9287k) {
                    if (dVar2 instanceof C3216f) {
                        m13201a((C3216f) dVar2, i, 1, fVar2, arrayList, kVar);
                    }
                }
                if (i == 1 && (mVar instanceof C3224l)) {
                    for (C3214d dVar3 : ((C3224l) mVar).f9305k.f9287k) {
                        if (dVar3 instanceof C3216f) {
                            m13201a((C3216f) dVar3, i, 2, fVar2, arrayList, kVar);
                        }
                    }
                }
                for (C3216f fVar4 : mVar.f9315h.f9288l) {
                    if (fVar4 == fVar2) {
                        kVar.f9302a = true;
                    }
                    m13201a(fVar4, i, 0, fVar2, arrayList, kVar);
                }
                for (C3216f fVar5 : mVar.f9316i.f9288l) {
                    if (fVar5 == fVar2) {
                        kVar.f9302a = true;
                    }
                    m13201a(fVar5, i, 1, fVar2, arrayList, kVar);
                }
                if (i == 1 && (mVar instanceof C3224l)) {
                    for (C3216f a : ((C3224l) mVar).f9305k.f9288l) {
                        m13201a(a, i, 2, fVar2, arrayList, kVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m13202a(C3226m mVar, int i, ArrayList<C3223k> arrayList) {
        for (C3214d dVar : mVar.f9315h.f9287k) {
            if (dVar instanceof C3216f) {
                m13201a((C3216f) dVar, i, 0, mVar.f9316i, arrayList, null);
            } else if (dVar instanceof C3226m) {
                m13201a(((C3226m) dVar).f9315h, i, 0, mVar.f9316i, arrayList, null);
            }
        }
        for (C3214d dVar2 : mVar.f9316i.f9287k) {
            if (dVar2 instanceof C3216f) {
                m13201a((C3216f) dVar2, i, 1, mVar.f9315h, arrayList, null);
            } else if (dVar2 instanceof C3226m) {
                m13201a(((C3226m) dVar2).f9316i, i, 1, mVar.f9315h, arrayList, null);
            }
        }
        if (i == 1) {
            for (C3214d dVar3 : ((C3224l) mVar).f9305k.f9287k) {
                if (dVar3 instanceof C3216f) {
                    m13201a((C3216f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01be, code lost:
        if (r3[3].f9104c != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r1.f9159k == 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0148, code lost:
        if (r3[1].f9104c != null) goto L_0x0150;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m13203a(p071f.p089f.p093b.p094j.C3199f r14) {
        /*
            r13 = this;
            java.util.ArrayList<f.f.b.j.e> r0 = r14.f9253e0
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0273
            java.lang.Object r1 = r0.next()
            f.f.b.j.e r1 = (p071f.p089f.p093b.p094j.C3196e) r1
            f.f.b.j.e$b[] r3 = r1.f9127H
            r4 = r3[r2]
            r9 = 1
            r3 = r3[r9]
            int r5 = r1.mo10470x()
            r6 = 8
            if (r5 != r6) goto L_0x0025
        L_0x0022:
            r1.f9146a = r9
            goto L_0x0006
        L_0x0025:
            float r5 = r1.f9163o
            r10 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0034
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0034
            r1.f9158j = r6
        L_0x0034:
            float r5 = r1.f9166r
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0040
            r1.f9159k = r6
        L_0x0040:
            float r5 = r1.mo10440g()
            r7 = 0
            r8 = 3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0079
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0059
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r3 == r5) goto L_0x0056
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r3 != r5) goto L_0x0059
        L_0x0056:
            r1.f9158j = r8
            goto L_0x0079
        L_0x0059:
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0068
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r4 == r5) goto L_0x0065
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r4 != r5) goto L_0x0068
        L_0x0065:
            r1.f9159k = r8
            goto L_0x0079
        L_0x0068:
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0079
            if (r3 != r5) goto L_0x0079
            int r5 = r1.f9158j
            if (r5 != 0) goto L_0x0074
            r1.f9158j = r8
        L_0x0074:
            int r5 = r1.f9159k
            if (r5 != 0) goto L_0x0079
            goto L_0x0065
        L_0x0079:
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x008f
            int r5 = r1.f9158j
            if (r5 != r9) goto L_0x008f
            f.f.b.j.d r5 = r1.f9172x
            f.f.b.j.d r5 = r5.f9104c
            if (r5 == 0) goto L_0x008d
            f.f.b.j.d r5 = r1.f9174z
            f.f.b.j.d r5 = r5.f9104c
            if (r5 != 0) goto L_0x008f
        L_0x008d:
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
        L_0x008f:
            r5 = r4
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00a6
            int r4 = r1.f9159k
            if (r4 != r9) goto L_0x00a6
            f.f.b.j.d r4 = r1.f9173y
            f.f.b.j.d r4 = r4.f9104c
            if (r4 == 0) goto L_0x00a4
            f.f.b.j.d r4 = r1.f9120A
            f.f.b.j.d r4 = r4.f9104c
            if (r4 != 0) goto L_0x00a6
        L_0x00a4:
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
        L_0x00a6:
            r7 = r3
            f.f.b.j.n.j r3 = r1.f9152d
            r3.f9311d = r5
            int r4 = r1.f9158j
            r3.f9308a = r4
            f.f.b.j.n.l r3 = r1.f9153e
            r3.f9311d = r7
            int r4 = r1.f9159k
            r3.f9308a = r4
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r5 == r3) goto L_0x00c3
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r5 == r3) goto L_0x00c3
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r5 != r3) goto L_0x00d1
        L_0x00c3:
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r7 == r3) goto L_0x021e
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r7 == r3) goto L_0x021e
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r7 != r3) goto L_0x00d1
            goto L_0x021e
        L_0x00d1:
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r3) goto L_0x0150
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r7 == r3) goto L_0x00df
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r7 != r3) goto L_0x0150
        L_0x00df:
            int r3 = r1.f9158j
            if (r3 != r8) goto L_0x0102
            f.f.b.j.e$b r2 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r7 != r2) goto L_0x00f0
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r2
            r7 = r2
            r3.m13200a(r4, r5, r6, r7, r8)
        L_0x00f0:
            int r8 = r1.mo10444i()
            float r2 = (float) r8
            float r3 = r1.f9131L
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
        L_0x00fb:
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r3 = r13
            r4 = r1
            r5 = r7
            goto L_0x0258
        L_0x0102:
            if (r3 != r9) goto L_0x0119
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m13200a(r4, r5, r6, r7, r8)
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r1 = r1.mo10471y()
        L_0x0115:
            r2.f9298m = r1
            goto L_0x0006
        L_0x0119:
            if (r3 != r6) goto L_0x013c
            f.f.b.j.e$b[] r3 = r14.f9127H
            r4 = r3[r2]
            f.f.b.j.e$b r12 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r4 == r12) goto L_0x0129
            r3 = r3[r2]
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r3 != r4) goto L_0x0150
        L_0x0129:
            float r2 = r1.f9163o
            int r3 = r14.mo10471y()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            int r8 = r1.mo10444i()
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            goto L_0x0256
        L_0x013c:
            f.f.b.j.d[] r3 = r1.f9125F
            r4 = r3[r2]
            f.f.b.j.d r4 = r4.f9104c
            if (r4 == 0) goto L_0x014a
            r3 = r3[r9]
            f.f.b.j.d r3 = r3.f9104c
            if (r3 != 0) goto L_0x0150
        L_0x014a:
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            goto L_0x0256
        L_0x0150:
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r7 != r3) goto L_0x01c1
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r5 == r3) goto L_0x015c
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r5 != r3) goto L_0x01c1
        L_0x015c:
            int r3 = r1.f9159k
            if (r3 != r8) goto L_0x0182
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r5 != r7) goto L_0x016c
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m13200a(r4, r5, r6, r7, r8)
        L_0x016c:
            int r6 = r1.mo10471y()
            float r2 = r1.f9131L
            int r3 = r1.mo10442h()
            r4 = -1
            if (r3 != r4) goto L_0x017b
            float r2 = r10 / r2
        L_0x017b:
            float r3 = (float) r6
        L_0x017c:
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            goto L_0x00fb
        L_0x0182:
            if (r3 != r9) goto L_0x018f
            r6 = 0
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m13200a(r4, r5, r6, r7, r8)
            goto L_0x0214
        L_0x018f:
            if (r3 != r6) goto L_0x01b2
            f.f.b.j.e$b[] r3 = r14.f9127H
            r4 = r3[r9]
            f.f.b.j.e$b r8 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r4 == r8) goto L_0x019f
            r3 = r3[r9]
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r3 != r4) goto L_0x01c1
        L_0x019f:
            float r2 = r1.f9166r
            int r6 = r1.mo10471y()
            int r3 = r14.mo10444i()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r8 = (int) r2
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            goto L_0x0256
        L_0x01b2:
            f.f.b.j.d[] r3 = r1.f9125F
            r4 = r3[r6]
            f.f.b.j.d r4 = r4.f9104c
            if (r4 == 0) goto L_0x014a
            r3 = r3[r8]
            f.f.b.j.d r3 = r3.f9104c
            if (r3 != 0) goto L_0x01c1
            goto L_0x014a
        L_0x01c1:
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r5 != r3) goto L_0x0006
            if (r7 != r3) goto L_0x0006
            int r3 = r1.f9158j
            if (r3 == r9) goto L_0x0200
            int r4 = r1.f9159k
            if (r4 != r9) goto L_0x01d0
            goto L_0x0200
        L_0x01d0:
            if (r4 != r6) goto L_0x0006
            if (r3 != r6) goto L_0x0006
            f.f.b.j.e$b[] r3 = r14.f9127H
            r4 = r3[r2]
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r4 == r5) goto L_0x01e0
            r2 = r3[r2]
            if (r2 != r5) goto L_0x0006
        L_0x01e0:
            f.f.b.j.e$b[] r2 = r14.f9127H
            r3 = r2[r9]
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r3 == r4) goto L_0x01ec
            r2 = r2[r9]
            if (r2 != r4) goto L_0x0006
        L_0x01ec:
            float r2 = r1.f9163o
            float r3 = r1.f9166r
            int r4 = r14.mo10471y()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r14.mo10444i()
            float r2 = (float) r2
            goto L_0x017c
        L_0x0200:
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m13200a(r4, r5, r6, r7, r8)
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10471y()
            r2.f9298m = r3
        L_0x0214:
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9312e
            int r1 = r1.mo10444i()
            goto L_0x0115
        L_0x021e:
            int r2 = r1.mo10471y()
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r5 != r3) goto L_0x0239
            int r2 = r14.mo10471y()
            f.f.b.j.d r3 = r1.f9172x
            int r3 = r3.f9105d
            int r2 = r2 - r3
            f.f.b.j.d r3 = r1.f9174z
            int r3 = r3.f9105d
            int r2 = r2 - r3
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r6 = r2
            r5 = r3
            goto L_0x023a
        L_0x0239:
            r6 = r2
        L_0x023a:
            int r2 = r1.mo10444i()
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r7 != r3) goto L_0x0255
            int r2 = r14.mo10444i()
            f.f.b.j.d r3 = r1.f9173y
            int r3 = r3.f9105d
            int r2 = r2 - r3
            f.f.b.j.d r3 = r1.f9120A
            int r3 = r3.f9105d
            int r2 = r2 - r3
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r8 = r2
            r7 = r3
            goto L_0x0256
        L_0x0255:
            r8 = r2
        L_0x0256:
            r3 = r13
            r4 = r1
        L_0x0258:
            r3.m13200a(r4, r5, r6, r7, r8)
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10471y()
            r2.mo10565a(r3)
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10444i()
            r2.mo10565a(r3)
            goto L_0x0022
        L_0x0273:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3215e.m13203a(f.f.b.j.f):boolean");
    }

    /* renamed from: a */
    public void mo10555a() {
        mo10557a(this.f9273e);
        this.f9276h.clear();
        C3223k.f9301d = 0;
        m13202a(this.f9269a.f9152d, 0, this.f9276h);
        m13202a(this.f9269a.f9153e, 1, this.f9276h);
        this.f9270b = false;
    }

    /* renamed from: a */
    public void mo10556a(C3212b bVar) {
        this.f9274f = bVar;
    }

    /* renamed from: a */
    public void mo10557a(ArrayList<C3226m> arrayList) {
        Object iVar;
        arrayList.clear();
        this.f9272d.f9152d.mo10551c();
        this.f9272d.f9153e.mo10551c();
        arrayList.add(this.f9272d.f9152d);
        arrayList.add(this.f9272d.f9153e);
        Iterator it = this.f9272d.f9253e0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C3196e eVar = (C3196e) it.next();
            if (eVar instanceof C3202h) {
                iVar = new C3219h(eVar);
            } else {
                if (eVar.mo10397C()) {
                    if (eVar.f9148b == null) {
                        eVar.f9148b = new C3213c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f9148b);
                } else {
                    arrayList.add(eVar.f9152d);
                }
                if (eVar.mo10398D()) {
                    if (eVar.f9150c == null) {
                        eVar.f9150c = new C3213c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f9150c);
                } else {
                    arrayList.add(eVar.f9153e);
                }
                if (eVar instanceof C3205j) {
                    iVar = new C3220i(eVar);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C3226m) it2.next()).mo10551c();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C3226m mVar = (C3226m) it3.next();
            if (mVar.f9309b != this.f9272d) {
                mVar.mo10548a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo10558a(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f9270b || this.f9271c) {
            Iterator it = this.f9269a.f9253e0.iterator();
            while (it.hasNext()) {
                C3196e eVar = (C3196e) it.next();
                eVar.f9146a = false;
                C3221j jVar = eVar.f9152d;
                jVar.f9312e.f9286j = false;
                C3224l lVar = eVar.f9153e;
                lVar.f9312e.f9286j = false;
                jVar.f9314g = false;
                lVar.f9314g = false;
                jVar.mo10568g();
                eVar.f9153e.mo10572g();
            }
            C3199f fVar = this.f9269a;
            fVar.f9146a = false;
            C3221j jVar2 = fVar.f9152d;
            jVar2.f9312e.f9286j = false;
            C3224l lVar2 = fVar.f9153e;
            lVar2.f9312e.f9286j = false;
            jVar2.f9314g = false;
            lVar2.f9314g = false;
            jVar2.mo10568g();
            this.f9269a.f9153e.mo10572g();
            this.f9271c = false;
        }
        if (m13203a(this.f9272d)) {
            return false;
        }
        this.f9269a.mo10461q(0);
        this.f9269a.mo10463r(0);
        C3198b b = this.f9269a.mo10418b(0);
        C3198b b2 = this.f9269a.mo10418b(1);
        if (this.f9270b) {
            mo10555a();
        }
        int z5 = this.f9269a.mo10472z();
        int A = this.f9269a.mo10395A();
        this.f9269a.f9152d.f9315h.mo10565a(z5);
        this.f9269a.f9153e.f9315h.mo10565a(A);
        mo10563d();
        C3198b bVar = C3198b.WRAP_CONTENT;
        if (b == bVar || b2 == bVar) {
            if (z4) {
                Iterator it2 = this.f9273e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((C3226m) it2.next()).mo10553f()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && b == C3198b.WRAP_CONTENT) {
                this.f9269a.mo10411a(C3198b.FIXED);
                C3199f fVar2 = this.f9269a;
                fVar2.mo10459p(m13199a(fVar2, 0));
                C3199f fVar3 = this.f9269a;
                fVar3.f9152d.f9312e.mo10565a(fVar3.mo10471y());
            }
            if (z4 && b2 == C3198b.WRAP_CONTENT) {
                this.f9269a.mo10423b(C3198b.FIXED);
                C3199f fVar4 = this.f9269a;
                fVar4.mo10443h(m13199a(fVar4, 1));
                C3199f fVar5 = this.f9269a;
                fVar5.f9153e.f9312e.mo10565a(fVar5.mo10444i());
            }
        }
        C3198b[] bVarArr = this.f9269a.f9127H;
        if (bVarArr[0] == C3198b.FIXED || bVarArr[0] == C3198b.MATCH_PARENT) {
            int y = this.f9269a.mo10471y() + z5;
            this.f9269a.f9152d.f9316i.mo10565a(y);
            this.f9269a.f9152d.f9312e.mo10565a(y - z5);
            mo10563d();
            C3198b[] bVarArr2 = this.f9269a.f9127H;
            if (bVarArr2[1] == C3198b.FIXED || bVarArr2[1] == C3198b.MATCH_PARENT) {
                int i = this.f9269a.mo10444i() + A;
                this.f9269a.f9153e.f9316i.mo10565a(i);
                this.f9269a.f9153e.f9312e.mo10565a(i - A);
            }
            mo10563d();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.f9273e.iterator();
        while (it3.hasNext()) {
            C3226m mVar = (C3226m) it3.next();
            if (mVar.f9309b != this.f9269a || mVar.f9314g) {
                mVar.mo10550b();
            }
        }
        Iterator it4 = this.f9273e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C3226m mVar2 = (C3226m) it4.next();
            if ((z2 || mVar2.f9309b != this.f9269a) && (!mVar2.f9315h.f9286j || ((!mVar2.f9316i.f9286j && !(mVar2 instanceof C3219h)) || (!mVar2.f9312e.f9286j && !(mVar2 instanceof C3213c) && !(mVar2 instanceof C3219h))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f9269a.mo10411a(b);
        this.f9269a.mo10423b(b2);
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0140 A[EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  
    EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  
    EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0140 A[EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  
    EDGE_INSN: B:78:0x0140->B:64:0x0140 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10559a(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            f.f.b.j.f r1 = r9.f9269a
            r2 = 0
            f.f.b.j.e$b r1 = r1.mo10418b(r2)
            f.f.b.j.f r3 = r9.f9269a
            f.f.b.j.e$b r3 = r3.mo10418b(r0)
            f.f.b.j.f r4 = r9.f9269a
            int r4 = r4.mo10472z()
            f.f.b.j.f r5 = r9.f9269a
            int r5 = r5.mo10395A()
            if (r10 == 0) goto L_0x0086
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0086
        L_0x0023:
            java.util.ArrayList<f.f.b.j.n.m> r6 = r9.f9273e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            f.f.b.j.n.m r7 = (p071f.p089f.p093b.p094j.p095n.C3226m) r7
            int r8 = r7.f9313f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo10553f()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0063
            if (r10 == 0) goto L_0x0086
            f.f.b.j.e$b r10 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0086
            f.f.b.j.f r10 = r9.f9269a
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r10.mo10411a(r6)
            f.f.b.j.f r10 = r9.f9269a
            int r6 = r9.m13199a(r10, r2)
            r10.mo10459p(r6)
            f.f.b.j.f r10 = r9.f9269a
            f.f.b.j.n.j r6 = r10.f9152d
            f.f.b.j.n.g r6 = r6.f9312e
            int r10 = r10.mo10471y()
            goto L_0x0083
        L_0x0063:
            if (r10 == 0) goto L_0x0086
            f.f.b.j.e$b r10 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0086
            f.f.b.j.f r10 = r9.f9269a
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r10.mo10423b(r6)
            f.f.b.j.f r10 = r9.f9269a
            int r6 = r9.m13199a(r10, r0)
            r10.mo10443h(r6)
            f.f.b.j.f r10 = r9.f9269a
            f.f.b.j.n.l r6 = r10.f9153e
            f.f.b.j.n.g r6 = r6.f9312e
            int r10 = r10.mo10444i()
        L_0x0083:
            r6.mo10565a(r10)
        L_0x0086:
            f.f.b.j.f r10 = r9.f9269a
            f.f.b.j.e$b[] r10 = r10.f9127H
            if (r11 != 0) goto L_0x00b3
            r5 = r10[r2]
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r5 == r6) goto L_0x0098
            r10 = r10[r2]
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r10 != r5) goto L_0x00c0
        L_0x0098:
            f.f.b.j.f r10 = r9.f9269a
            int r10 = r10.mo10471y()
            int r10 = r10 + r4
            f.f.b.j.f r5 = r9.f9269a
            f.f.b.j.n.j r5 = r5.f9152d
            f.f.b.j.n.f r5 = r5.f9316i
            r5.mo10565a(r10)
            f.f.b.j.f r5 = r9.f9269a
            f.f.b.j.n.j r5 = r5.f9152d
            f.f.b.j.n.g r5 = r5.f9312e
            int r10 = r10 - r4
            r5.mo10565a(r10)
            goto L_0x00dc
        L_0x00b3:
            r4 = r10[r0]
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            if (r4 == r6) goto L_0x00c2
            r10 = r10[r0]
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_PARENT
            if (r10 != r4) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r10 = 0
            goto L_0x00dd
        L_0x00c2:
            f.f.b.j.f r10 = r9.f9269a
            int r10 = r10.mo10444i()
            int r10 = r10 + r5
            f.f.b.j.f r4 = r9.f9269a
            f.f.b.j.n.l r4 = r4.f9153e
            f.f.b.j.n.f r4 = r4.f9316i
            r4.mo10565a(r10)
            f.f.b.j.f r4 = r9.f9269a
            f.f.b.j.n.l r4 = r4.f9153e
            f.f.b.j.n.g r4 = r4.f9312e
            int r10 = r10 - r5
            r4.mo10565a(r10)
        L_0x00dc:
            r10 = 1
        L_0x00dd:
            r9.mo10563d()
            java.util.ArrayList<f.f.b.j.n.m> r4 = r9.f9273e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0106
            java.lang.Object r5 = r4.next()
            f.f.b.j.n.m r5 = (p071f.p089f.p093b.p094j.p095n.C3226m) r5
            int r6 = r5.f9313f
            if (r6 == r11) goto L_0x00f7
            goto L_0x00e6
        L_0x00f7:
            f.f.b.j.e r6 = r5.f9309b
            f.f.b.j.f r7 = r9.f9269a
            if (r6 != r7) goto L_0x0102
            boolean r6 = r5.f9314g
            if (r6 != 0) goto L_0x0102
            goto L_0x00e6
        L_0x0102:
            r5.mo10550b()
            goto L_0x00e6
        L_0x0106:
            java.util.ArrayList<f.f.b.j.n.m> r4 = r9.f9273e
            java.util.Iterator r4 = r4.iterator()
        L_0x010c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r4.next()
            f.f.b.j.n.m r5 = (p071f.p089f.p093b.p094j.p095n.C3226m) r5
            int r6 = r5.f9313f
            if (r6 == r11) goto L_0x011d
            goto L_0x010c
        L_0x011d:
            if (r10 != 0) goto L_0x0126
            f.f.b.j.e r6 = r5.f9309b
            f.f.b.j.f r7 = r9.f9269a
            if (r6 != r7) goto L_0x0126
            goto L_0x010c
        L_0x0126:
            f.f.b.j.n.f r6 = r5.f9315h
            boolean r6 = r6.f9286j
            if (r6 != 0) goto L_0x012e
        L_0x012c:
            r0 = 0
            goto L_0x0140
        L_0x012e:
            f.f.b.j.n.f r6 = r5.f9316i
            boolean r6 = r6.f9286j
            if (r6 != 0) goto L_0x0135
            goto L_0x012c
        L_0x0135:
            boolean r6 = r5 instanceof p071f.p089f.p093b.p094j.p095n.C3213c
            if (r6 != 0) goto L_0x010c
            f.f.b.j.n.g r5 = r5.f9312e
            boolean r5 = r5.f9286j
            if (r5 != 0) goto L_0x010c
            goto L_0x012c
        L_0x0140:
            f.f.b.j.f r10 = r9.f9269a
            r10.mo10411a(r1)
            f.f.b.j.f r10 = r9.f9269a
            r10.mo10423b(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3215e.mo10559a(boolean, int):boolean");
    }

    /* renamed from: b */
    public void mo10560b() {
        this.f9270b = true;
    }

    /* renamed from: b */
    public boolean mo10561b(boolean z) {
        if (this.f9270b) {
            Iterator it = this.f9269a.f9253e0.iterator();
            while (it.hasNext()) {
                C3196e eVar = (C3196e) it.next();
                eVar.f9146a = false;
                C3221j jVar = eVar.f9152d;
                jVar.f9312e.f9286j = false;
                jVar.f9314g = false;
                jVar.mo10568g();
                C3224l lVar = eVar.f9153e;
                lVar.f9312e.f9286j = false;
                lVar.f9314g = false;
                lVar.mo10572g();
            }
            C3199f fVar = this.f9269a;
            fVar.f9146a = false;
            C3221j jVar2 = fVar.f9152d;
            jVar2.f9312e.f9286j = false;
            jVar2.f9314g = false;
            jVar2.mo10568g();
            C3224l lVar2 = this.f9269a.f9153e;
            lVar2.f9312e.f9286j = false;
            lVar2.f9314g = false;
            lVar2.mo10572g();
            mo10555a();
        }
        if (m13203a(this.f9272d)) {
            return false;
        }
        this.f9269a.mo10461q(0);
        this.f9269a.mo10463r(0);
        this.f9269a.f9152d.f9315h.mo10565a(0);
        this.f9269a.f9153e.f9315h.mo10565a(0);
        return true;
    }

    /* renamed from: c */
    public void mo10562c() {
        this.f9271c = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0008 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10563d() {
        /*
            r11 = this;
            f.f.b.j.f r0 = r11.f9269a
            java.util.ArrayList<f.f.b.j.e> r0 = r0.f9253e0
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d5
            java.lang.Object r1 = r0.next()
            f.f.b.j.e r1 = (p071f.p089f.p093b.p094j.C3196e) r1
            boolean r2 = r1.f9146a
            if (r2 == 0) goto L_0x0019
            goto L_0x0008
        L_0x0019:
            f.f.b.j.e$b[] r2 = r1.f9127H
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f9158j
            int r4 = r1.f9159k
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r8 == r5) goto L_0x0032
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r8 != r5) goto L_0x0030
            if (r2 != r9) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r2 = 0
            goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r10 == r5) goto L_0x003d
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r10 != r5) goto L_0x003e
            if (r4 != r9) goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            f.f.b.j.n.j r4 = r1.f9152d
            f.f.b.j.n.g r4 = r4.f9312e
            boolean r5 = r4.f9286j
            f.f.b.j.n.l r6 = r1.f9153e
            f.f.b.j.n.g r6 = r6.f9312e
            boolean r7 = r6.f9286j
            if (r5 == 0) goto L_0x005f
            if (r7 == 0) goto L_0x005f
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            int r5 = r4.f9283g
            int r8 = r6.f9283g
            r2 = r11
            r3 = r1
            r4 = r7
            r6 = r7
            r7 = r8
            r2.m13200a(r3, r4, r5, r6, r7)
        L_0x005c:
            r1.f9146a = r9
            goto L_0x00c2
        L_0x005f:
            if (r5 == 0) goto L_0x0093
            if (r3 == 0) goto L_0x0093
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r5 = r2.f9283g
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9312e
            int r7 = r2.f9283g
            r2 = r11
            r3 = r1
            r2.m13200a(r3, r4, r5, r6, r7)
            f.f.b.j.e$b r2 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r10 != r2) goto L_0x0087
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10444i()
        L_0x0084:
            r2.f9298m = r3
            goto L_0x00c2
        L_0x0087:
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10444i()
        L_0x008f:
            r2.mo10565a(r3)
            goto L_0x005c
        L_0x0093:
            if (r7 == 0) goto L_0x00c2
            if (r2 == 0) goto L_0x00c2
            f.f.b.j.e$b r4 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r5 = r2.f9283g
            f.f.b.j.e$b r6 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9312e
            int r7 = r2.f9283g
            r2 = r11
            r3 = r1
            r2.m13200a(r3, r4, r5, r6, r7)
            f.f.b.j.e$b r2 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r8 != r2) goto L_0x00b9
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10471y()
            goto L_0x0084
        L_0x00b9:
            f.f.b.j.n.j r2 = r1.f9152d
            f.f.b.j.n.g r2 = r2.f9312e
            int r3 = r1.mo10471y()
            goto L_0x008f
        L_0x00c2:
            boolean r2 = r1.f9146a
            if (r2 == 0) goto L_0x0008
            f.f.b.j.n.l r2 = r1.f9153e
            f.f.b.j.n.g r2 = r2.f9306l
            if (r2 == 0) goto L_0x0008
            int r1 = r1.mo10427c()
            r2.mo10565a(r1)
            goto L_0x0008
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3215e.mo10563d():void");
    }
}
