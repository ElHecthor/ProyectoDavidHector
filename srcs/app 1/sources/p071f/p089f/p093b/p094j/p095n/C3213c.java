package p071f.p089f.p093b.p094j.p095n;

import java.util.ArrayList;
import java.util.Iterator;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3199f;

/* renamed from: f.f.b.j.n.c */
public class C3213c extends C3226m {

    /* renamed from: k */
    ArrayList<C3226m> f9267k = new ArrayList<>();

    /* renamed from: l */
    private int f9268l;

    public C3213c(C3196e eVar, int i) {
        super(eVar);
        this.f9313f = i;
        m13189g();
    }

    /* renamed from: g */
    private void m13189g() {
        C3196e eVar;
        C3196e eVar2 = this.f9309b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.mo10436e(this.f9313f);
        } while (eVar2 != null);
        this.f9309b = eVar;
        this.f9267k.add(eVar.mo10438f(this.f9313f));
        C3196e d = eVar.mo10434d(this.f9313f);
        while (d != null) {
            this.f9267k.add(d.mo10438f(this.f9313f));
            d = d.mo10434d(this.f9313f);
        }
        Iterator it = this.f9267k.iterator();
        while (it.hasNext()) {
            C3226m mVar = (C3226m) it.next();
            int i = this.f9313f;
            if (i == 0) {
                mVar.f9309b.f9148b = this;
            } else if (i == 1) {
                mVar.f9309b.f9150c = this;
            }
        }
        if ((this.f9313f == 0 && ((C3199f) this.f9309b.mo10462r()).mo10480P()) && this.f9267k.size() > 1) {
            ArrayList<C3226m> arrayList = this.f9267k;
            this.f9309b = ((C3226m) arrayList.get(arrayList.size() - 1)).f9309b;
        }
        this.f9268l = this.f9313f == 0 ? this.f9309b.mo10448k() : this.f9309b.mo10467u();
    }

    /* renamed from: h */
    private C3196e m13190h() {
        for (int i = 0; i < this.f9267k.size(); i++) {
            C3226m mVar = (C3226m) this.f9267k.get(i);
            if (mVar.f9309b.mo10470x() != 8) {
                return mVar.f9309b;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C3196e m13191i() {
        for (int size = this.f9267k.size() - 1; size >= 0; size--) {
            C3226m mVar = (C3226m) this.f9267k.get(size);
            if (mVar.f9309b.mo10470x() != 8) {
                return mVar.f9309b;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10548a() {
        /*
            r5 = this;
            java.util.ArrayList<f.f.b.j.n.m> r0 = r5.f9267k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            f.f.b.j.n.m r1 = (p071f.p089f.p093b.p094j.p095n.C3226m) r1
            r1.mo10548a()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<f.f.b.j.n.m> r0 = r5.f9267k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<f.f.b.j.n.m> r2 = r5.f9267k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            f.f.b.j.n.m r2 = (p071f.p089f.p093b.p094j.p095n.C3226m) r2
            f.f.b.j.e r2 = r2.f9309b
            java.util.ArrayList<f.f.b.j.n.m> r4 = r5.f9267k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            f.f.b.j.n.m r0 = (p071f.p089f.p093b.p094j.p095n.C3226m) r0
            f.f.b.j.e r0 = r0.f9309b
            int r4 = r5.f9313f
            if (r4 != 0) goto L_0x0070
            f.f.b.j.d r1 = r2.f9172x
            f.f.b.j.d r0 = r0.f9174z
            f.f.b.j.n.f r2 = r5.mo10576a(r1, r3)
            int r1 = r1.mo10381a()
            f.f.b.j.e r4 = r5.m13190h()
            if (r4 == 0) goto L_0x0052
            f.f.b.j.d r1 = r4.f9172x
            int r1 = r1.mo10381a()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            f.f.b.j.n.f r4 = r5.f9315h
            r5.mo10578a(r4, r2, r1)
        L_0x0059:
            f.f.b.j.n.f r1 = r5.mo10576a(r0, r3)
            int r0 = r0.mo10381a()
            f.f.b.j.e r2 = r5.m13191i()
            if (r2 == 0) goto L_0x006d
            f.f.b.j.d r0 = r2.f9174z
            int r0 = r0.mo10381a()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            f.f.b.j.d r2 = r2.f9173y
            f.f.b.j.d r0 = r0.f9120A
            f.f.b.j.n.f r3 = r5.mo10576a(r2, r1)
            int r2 = r2.mo10381a()
            f.f.b.j.e r4 = r5.m13190h()
            if (r4 == 0) goto L_0x0088
            f.f.b.j.d r2 = r4.f9173y
            int r2 = r2.mo10381a()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            f.f.b.j.n.f r4 = r5.f9315h
            r5.mo10578a(r4, r3, r2)
        L_0x008f:
            f.f.b.j.n.f r1 = r5.mo10576a(r0, r1)
            int r0 = r0.mo10381a()
            f.f.b.j.e r2 = r5.m13191i()
            if (r2 == 0) goto L_0x00a3
            f.f.b.j.d r0 = r2.f9120A
            int r0 = r0.mo10381a()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            f.f.b.j.n.f r2 = r5.f9316i
            int r0 = -r0
            r5.mo10578a(r2, r1, r0)
        L_0x00ab:
            f.f.b.j.n.f r0 = r5.f9315h
            r0.f9277a = r5
            f.f.b.j.n.f r0 = r5.f9316i
            r0.f9277a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3213c.mo10548a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0198, code lost:
        if (r7 != r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c0, code lost:
        if (r7 != r9) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.f9312e.f9286j != false) goto L_0x00d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10549a(p071f.p089f.p093b.p094j.p095n.C3214d r23) {
        /*
            r22 = this;
            r0 = r22
            f.f.b.j.n.f r1 = r0.f9315h
            boolean r1 = r1.f9286j
            if (r1 == 0) goto L_0x03f4
            f.f.b.j.n.f r1 = r0.f9316i
            boolean r1 = r1.f9286j
            if (r1 != 0) goto L_0x0010
            goto L_0x03f4
        L_0x0010:
            f.f.b.j.e r1 = r0.f9309b
            f.f.b.j.e r1 = r1.mo10462r()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p071f.p089f.p093b.p094j.C3199f
            if (r3 == 0) goto L_0x0023
            f.f.b.j.f r1 = (p071f.p089f.p093b.p094j.C3199f) r1
            boolean r1 = r1.mo10480P()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            f.f.b.j.n.f r3 = r0.f9316i
            int r3 = r3.f9283g
            f.f.b.j.n.f r4 = r0.f9315h
            int r4 = r4.f9283g
            int r3 = r3 - r4
            java.util.ArrayList<f.f.b.j.n.m> r4 = r0.f9267k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<f.f.b.j.n.m> r8 = r0.f9267k
            java.lang.Object r8 = r8.get(r5)
            f.f.b.j.n.m r8 = (p071f.p089f.p093b.p094j.p095n.C3226m) r8
            f.f.b.j.e r8 = r8.f9309b
            int r8 = r8.mo10470x()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<f.f.b.j.n.m> r10 = r0.f9267k
            java.lang.Object r10 = r10.get(r9)
            f.f.b.j.n.m r10 = (p071f.p089f.p093b.p094j.p095n.C3226m) r10
            f.f.b.j.e r10 = r10.f9309b
            int r10 = r10.mo10470x()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x0106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0072:
            if (r13 >= r4) goto L_0x00f8
            java.util.ArrayList<f.f.b.j.n.m> r2 = r0.f9267k
            java.lang.Object r2 = r2.get(r13)
            f.f.b.j.n.m r2 = (p071f.p089f.p093b.p094j.p095n.C3226m) r2
            f.f.b.j.e r11 = r2.f9309b
            int r11 = r11.mo10470x()
            if (r11 != r7) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0091
            if (r13 < r5) goto L_0x0091
            f.f.b.j.n.f r11 = r2.f9315h
            int r11 = r11.f9282f
            int r14 = r14 + r11
        L_0x0091:
            f.f.b.j.n.g r11 = r2.f9312e
            int r11 = r11.f9283g
            f.f.b.j.e$b r7 = r2.f9311d
            f.f.b.j.e$b r10 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00be
            int r10 = r0.f9313f
            if (r10 != 0) goto L_0x00af
            f.f.b.j.e r10 = r2.f9309b
            f.f.b.j.n.j r10 = r10.f9152d
            f.f.b.j.n.g r10 = r10.f9312e
            boolean r10 = r10.f9286j
            if (r10 != 0) goto L_0x00af
            return
        L_0x00af:
            int r10 = r0.f9313f
            if (r10 != r12) goto L_0x00d2
            f.f.b.j.e r10 = r2.f9309b
            f.f.b.j.n.l r10 = r10.f9153e
            f.f.b.j.n.g r10 = r10.f9312e
            boolean r10 = r10.f9286j
            if (r10 != 0) goto L_0x00d2
            return
        L_0x00be:
            int r10 = r2.f9308a
            if (r10 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            f.f.b.j.n.g r7 = r2.f9312e
            int r11 = r7.f9298m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            f.f.b.j.n.g r10 = r2.f9312e
            boolean r10 = r10.f9286j
            if (r10 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            if (r7 != 0) goto L_0x00e6
            int r15 = r15 + 1
            f.f.b.j.e r7 = r2.f9309b
            float[] r7 = r7.f9147a0
            int r10 = r0.f9313f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00e7
            float r17 = r17 + r7
            goto L_0x00e7
        L_0x00e6:
            int r14 = r14 + r11
        L_0x00e7:
            if (r13 >= r8) goto L_0x00f1
            if (r13 >= r6) goto L_0x00f1
            f.f.b.j.n.f r2 = r2.f9316i
            int r2 = r2.f9282f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0072
        L_0x00f8:
            if (r14 < r3) goto L_0x0103
            if (r15 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0103:
            r2 = r16
            goto L_0x010b
        L_0x0106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010b:
            f.f.b.j.n.f r7 = r0.f9315h
            int r7 = r7.f9283g
            if (r1 == 0) goto L_0x0115
            f.f.b.j.n.f r7 = r0.f9316i
            int r7 = r7.f9283g
        L_0x0115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0126
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0125
            int r7 = r7 + r10
            goto L_0x0126
        L_0x0125:
            int r7 = r7 - r10
        L_0x0126:
            if (r15 <= 0) goto L_0x022b
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0133:
            if (r13 >= r4) goto L_0x01e0
            java.util.ArrayList<f.f.b.j.n.m> r12 = r0.f9267k
            java.lang.Object r12 = r12.get(r13)
            f.f.b.j.n.m r12 = (p071f.p089f.p093b.p094j.p095n.C3226m) r12
            f.f.b.j.e r9 = r12.f9309b
            int r9 = r9.mo10470x()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L_0x014b
            goto L_0x01cb
        L_0x014b:
            f.f.b.j.e$b r9 = r12.f9311d
            f.f.b.j.e$b r11 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01cb
            f.f.b.j.n.g r9 = r12.f9312e
            boolean r9 = r9.f9286j
            if (r9 != 0) goto L_0x01cb
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x016d
            f.f.b.j.e r11 = r12.f9309b
            float[] r11 = r11.f9147a0
            int r9 = r0.f9313f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L_0x016f
        L_0x016d:
            r9 = r18
        L_0x016f:
            int r11 = r0.f9313f
            if (r11 != 0) goto L_0x019b
            f.f.b.j.e r11 = r12.f9309b
            r19 = r10
            int r10 = r11.f9162n
            int r11 = r11.f9161m
            r20 = r14
            int r14 = r12.f9308a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x018d
            f.f.b.j.n.g r7 = r12.f9312e
            int r7 = r7.f9298m
            int r7 = java.lang.Math.min(r9, r7)
            goto L_0x018e
        L_0x018d:
            r7 = r9
        L_0x018e:
            int r7 = java.lang.Math.max(r11, r7)
            if (r10 <= 0) goto L_0x0198
            int r7 = java.lang.Math.min(r10, r7)
        L_0x0198:
            if (r7 == r9) goto L_0x01c5
            goto L_0x01c2
        L_0x019b:
            r21 = r7
            r19 = r10
            r20 = r14
            f.f.b.j.e r7 = r12.f9309b
            int r10 = r7.f9165q
            int r7 = r7.f9164p
            int r11 = r12.f9308a
            r14 = 1
            if (r11 != r14) goto L_0x01b5
            f.f.b.j.n.g r11 = r12.f9312e
            int r11 = r11.f9298m
            int r11 = java.lang.Math.min(r9, r11)
            goto L_0x01b6
        L_0x01b5:
            r11 = r9
        L_0x01b6:
            int r7 = java.lang.Math.max(r7, r11)
            if (r10 <= 0) goto L_0x01c0
            int r7 = java.lang.Math.min(r10, r7)
        L_0x01c0:
            if (r7 == r9) goto L_0x01c5
        L_0x01c2:
            int r16 = r16 + 1
            r9 = r7
        L_0x01c5:
            f.f.b.j.n.g r7 = r12.f9312e
            r7.mo10565a(r9)
            goto L_0x01d1
        L_0x01cb:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d1:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0133
        L_0x01e0:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x021c
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01ea:
            if (r7 >= r4) goto L_0x021a
            java.util.ArrayList<f.f.b.j.n.m> r10 = r0.f9267k
            java.lang.Object r10 = r10.get(r7)
            f.f.b.j.n.m r10 = (p071f.p089f.p093b.p094j.p095n.C3226m) r10
            f.f.b.j.e r11 = r10.f9309b
            int r11 = r11.mo10470x()
            r12 = 8
            if (r11 != r12) goto L_0x01ff
            goto L_0x0217
        L_0x01ff:
            if (r7 <= 0) goto L_0x0208
            if (r7 < r5) goto L_0x0208
            f.f.b.j.n.f r11 = r10.f9315h
            int r11 = r11.f9282f
            int r9 = r9 + r11
        L_0x0208:
            f.f.b.j.n.g r11 = r10.f9312e
            int r11 = r11.f9283g
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x0217
            if (r7 >= r6) goto L_0x0217
            f.f.b.j.n.f r10 = r10.f9316i
            int r10 = r10.f9282f
            int r10 = -r10
            int r9 = r9 + r10
        L_0x0217:
            int r7 = r7 + 1
            goto L_0x01ea
        L_0x021a:
            r14 = r9
            goto L_0x021e
        L_0x021c:
            r14 = r20
        L_0x021e:
            int r7 = r0.f9268l
            r9 = 2
            if (r7 != r9) goto L_0x0229
            if (r16 != 0) goto L_0x0229
            r7 = 0
            r0.f9268l = r7
            goto L_0x0231
        L_0x0229:
            r7 = 0
            goto L_0x0231
        L_0x022b:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x0231:
            if (r14 <= r3) goto L_0x0235
            r0.f9268l = r9
        L_0x0235:
            if (r2 <= 0) goto L_0x023d
            if (r15 != 0) goto L_0x023d
            if (r5 != r6) goto L_0x023d
            r0.f9268l = r9
        L_0x023d:
            int r9 = r0.f9268l
            r10 = 1
            if (r9 != r10) goto L_0x02ce
            if (r2 <= r10) goto L_0x0248
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r3 = r3 / r2
            goto L_0x024f
        L_0x0248:
            if (r2 != r10) goto L_0x024e
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x024f
        L_0x024e:
            r3 = 0
        L_0x024f:
            if (r15 <= 0) goto L_0x0252
            r3 = 0
        L_0x0252:
            r7 = r21
            r2 = 0
        L_0x0255:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x025e
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x025f
        L_0x025e:
            r9 = r2
        L_0x025f:
            java.util.ArrayList<f.f.b.j.n.m> r10 = r0.f9267k
            java.lang.Object r9 = r10.get(r9)
            f.f.b.j.n.m r9 = (p071f.p089f.p093b.p094j.p095n.C3226m) r9
            f.f.b.j.e r10 = r9.f9309b
            int r10 = r10.mo10470x()
            r11 = 8
            if (r10 != r11) goto L_0x027c
            f.f.b.j.n.f r10 = r9.f9315h
            r10.mo10565a(r7)
            f.f.b.j.n.f r9 = r9.f9316i
            r9.mo10565a(r7)
            goto L_0x02cb
        L_0x027c:
            if (r2 <= 0) goto L_0x0283
            if (r1 == 0) goto L_0x0282
            int r7 = r7 - r3
            goto L_0x0283
        L_0x0282:
            int r7 = r7 + r3
        L_0x0283:
            if (r2 <= 0) goto L_0x0290
            if (r2 < r5) goto L_0x0290
            f.f.b.j.n.f r10 = r9.f9315h
            int r10 = r10.f9282f
            if (r1 == 0) goto L_0x028f
            int r7 = r7 - r10
            goto L_0x0290
        L_0x028f:
            int r7 = r7 + r10
        L_0x0290:
            if (r1 == 0) goto L_0x0295
            f.f.b.j.n.f r10 = r9.f9316i
            goto L_0x0297
        L_0x0295:
            f.f.b.j.n.f r10 = r9.f9315h
        L_0x0297:
            r10.mo10565a(r7)
            f.f.b.j.n.g r10 = r9.f9312e
            int r11 = r10.f9283g
            f.f.b.j.e$b r12 = r9.f9311d
            f.f.b.j.e$b r13 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x02ab
            int r12 = r9.f9308a
            r13 = 1
            if (r12 != r13) goto L_0x02ab
            int r11 = r10.f9298m
        L_0x02ab:
            if (r1 == 0) goto L_0x02af
            int r7 = r7 - r11
            goto L_0x02b0
        L_0x02af:
            int r7 = r7 + r11
        L_0x02b0:
            if (r1 == 0) goto L_0x02b5
            f.f.b.j.n.f r10 = r9.f9315h
            goto L_0x02b7
        L_0x02b5:
            f.f.b.j.n.f r10 = r9.f9316i
        L_0x02b7:
            r10.mo10565a(r7)
            r10 = 1
            r9.f9314g = r10
            if (r2 >= r8) goto L_0x02cb
            if (r2 >= r6) goto L_0x02cb
            f.f.b.j.n.f r9 = r9.f9316i
            int r9 = r9.f9282f
            int r9 = -r9
            if (r1 == 0) goto L_0x02ca
            int r7 = r7 - r9
            goto L_0x02cb
        L_0x02ca:
            int r7 = r7 + r9
        L_0x02cb:
            int r2 = r2 + 1
            goto L_0x0255
        L_0x02ce:
            if (r9 != 0) goto L_0x0352
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r3 = r3 / r2
            if (r15 <= 0) goto L_0x02d7
            r3 = 0
        L_0x02d7:
            r7 = r21
            r2 = 0
        L_0x02da:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x02e3
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x02e4
        L_0x02e3:
            r9 = r2
        L_0x02e4:
            java.util.ArrayList<f.f.b.j.n.m> r10 = r0.f9267k
            java.lang.Object r9 = r10.get(r9)
            f.f.b.j.n.m r9 = (p071f.p089f.p093b.p094j.p095n.C3226m) r9
            f.f.b.j.e r10 = r9.f9309b
            int r10 = r10.mo10470x()
            r11 = 8
            if (r10 != r11) goto L_0x0301
            f.f.b.j.n.f r10 = r9.f9315h
            r10.mo10565a(r7)
            f.f.b.j.n.f r9 = r9.f9316i
            r9.mo10565a(r7)
            goto L_0x034f
        L_0x0301:
            if (r1 == 0) goto L_0x0305
            int r7 = r7 - r3
            goto L_0x0306
        L_0x0305:
            int r7 = r7 + r3
        L_0x0306:
            if (r2 <= 0) goto L_0x0313
            if (r2 < r5) goto L_0x0313
            f.f.b.j.n.f r10 = r9.f9315h
            int r10 = r10.f9282f
            if (r1 == 0) goto L_0x0312
            int r7 = r7 - r10
            goto L_0x0313
        L_0x0312:
            int r7 = r7 + r10
        L_0x0313:
            if (r1 == 0) goto L_0x0318
            f.f.b.j.n.f r10 = r9.f9316i
            goto L_0x031a
        L_0x0318:
            f.f.b.j.n.f r10 = r9.f9315h
        L_0x031a:
            r10.mo10565a(r7)
            f.f.b.j.n.g r10 = r9.f9312e
            int r11 = r10.f9283g
            f.f.b.j.e$b r12 = r9.f9311d
            f.f.b.j.e$b r13 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x0332
            int r12 = r9.f9308a
            r13 = 1
            if (r12 != r13) goto L_0x0332
            int r10 = r10.f9298m
            int r11 = java.lang.Math.min(r11, r10)
        L_0x0332:
            if (r1 == 0) goto L_0x0336
            int r7 = r7 - r11
            goto L_0x0337
        L_0x0336:
            int r7 = r7 + r11
        L_0x0337:
            if (r1 == 0) goto L_0x033c
            f.f.b.j.n.f r10 = r9.f9315h
            goto L_0x033e
        L_0x033c:
            f.f.b.j.n.f r10 = r9.f9316i
        L_0x033e:
            r10.mo10565a(r7)
            if (r2 >= r8) goto L_0x034f
            if (r2 >= r6) goto L_0x034f
            f.f.b.j.n.f r9 = r9.f9316i
            int r9 = r9.f9282f
            int r9 = -r9
            if (r1 == 0) goto L_0x034e
            int r7 = r7 - r9
            goto L_0x034f
        L_0x034e:
            int r7 = r7 + r9
        L_0x034f:
            int r2 = r2 + 1
            goto L_0x02da
        L_0x0352:
            r2 = 2
            if (r9 != r2) goto L_0x03f4
            int r2 = r0.f9313f
            if (r2 != 0) goto L_0x0360
            f.f.b.j.e r2 = r0.f9309b
            float r2 = r2.mo10446j()
            goto L_0x0366
        L_0x0360:
            f.f.b.j.e r2 = r0.f9309b
            float r2 = r2.mo10465t()
        L_0x0366:
            if (r1 == 0) goto L_0x036c
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x036c:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0378
            if (r15 <= 0) goto L_0x0379
        L_0x0378:
            r2 = 0
        L_0x0379:
            if (r1 == 0) goto L_0x037e
            int r2 = r21 - r2
            goto L_0x0380
        L_0x037e:
            int r2 = r21 + r2
        L_0x0380:
            r3 = r2
            r2 = 0
        L_0x0382:
            if (r2 >= r4) goto L_0x03f4
            if (r1 == 0) goto L_0x038b
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L_0x038c
        L_0x038b:
            r7 = r2
        L_0x038c:
            java.util.ArrayList<f.f.b.j.n.m> r9 = r0.f9267k
            java.lang.Object r7 = r9.get(r7)
            f.f.b.j.n.m r7 = (p071f.p089f.p093b.p094j.p095n.C3226m) r7
            f.f.b.j.e r9 = r7.f9309b
            int r9 = r9.mo10470x()
            r10 = 8
            if (r9 != r10) goto L_0x03aa
            f.f.b.j.n.f r9 = r7.f9315h
            r9.mo10565a(r3)
            f.f.b.j.n.f r7 = r7.f9316i
            r7.mo10565a(r3)
            r13 = 1
            goto L_0x03f1
        L_0x03aa:
            if (r2 <= 0) goto L_0x03b7
            if (r2 < r5) goto L_0x03b7
            f.f.b.j.n.f r9 = r7.f9315h
            int r9 = r9.f9282f
            if (r1 == 0) goto L_0x03b6
            int r3 = r3 - r9
            goto L_0x03b7
        L_0x03b6:
            int r3 = r3 + r9
        L_0x03b7:
            if (r1 == 0) goto L_0x03bc
            f.f.b.j.n.f r9 = r7.f9316i
            goto L_0x03be
        L_0x03bc:
            f.f.b.j.n.f r9 = r7.f9315h
        L_0x03be:
            r9.mo10565a(r3)
            f.f.b.j.n.g r9 = r7.f9312e
            int r11 = r9.f9283g
            f.f.b.j.e$b r12 = r7.f9311d
            f.f.b.j.e$b r13 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x03d3
            int r12 = r7.f9308a
            r13 = 1
            if (r12 != r13) goto L_0x03d4
            int r11 = r9.f9298m
            goto L_0x03d4
        L_0x03d3:
            r13 = 1
        L_0x03d4:
            if (r1 == 0) goto L_0x03d8
            int r3 = r3 - r11
            goto L_0x03d9
        L_0x03d8:
            int r3 = r3 + r11
        L_0x03d9:
            if (r1 == 0) goto L_0x03de
            f.f.b.j.n.f r9 = r7.f9315h
            goto L_0x03e0
        L_0x03de:
            f.f.b.j.n.f r9 = r7.f9316i
        L_0x03e0:
            r9.mo10565a(r3)
            if (r2 >= r8) goto L_0x03f1
            if (r2 >= r6) goto L_0x03f1
            f.f.b.j.n.f r7 = r7.f9316i
            int r7 = r7.f9282f
            int r7 = -r7
            if (r1 == 0) goto L_0x03f0
            int r3 = r3 - r7
            goto L_0x03f1
        L_0x03f0:
            int r3 = r3 + r7
        L_0x03f1:
            int r2 = r2 + 1
            goto L_0x0382
        L_0x03f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3213c.mo10549a(f.f.b.j.n.d):void");
    }

    /* renamed from: b */
    public void mo10550b() {
        for (int i = 0; i < this.f9267k.size(); i++) {
            ((C3226m) this.f9267k.get(i)).mo10550b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo10551c() {
        this.f9310c = null;
        Iterator it = this.f9267k.iterator();
        while (it.hasNext()) {
            ((C3226m) it.next()).mo10551c();
        }
    }

    /* renamed from: d */
    public long mo10552d() {
        long j = 0;
        for (int i = 0; i < this.f9267k.size(); i++) {
            C3226m mVar = (C3226m) this.f9267k.get(i);
            j = j + ((long) mVar.f9315h.f9282f) + mVar.mo10552d() + ((long) mVar.f9316i.f9282f);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo10553f() {
        int size = this.f9267k.size();
        for (int i = 0; i < size; i++) {
            if (!((C3226m) this.f9267k.get(i)).mo10553f()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f9313f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f9267k.iterator();
        while (it.hasNext()) {
            C3226m mVar = (C3226m) it.next();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("<");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(mVar);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("> ");
            sb2 = sb7.toString();
        }
        return sb2;
    }
}
