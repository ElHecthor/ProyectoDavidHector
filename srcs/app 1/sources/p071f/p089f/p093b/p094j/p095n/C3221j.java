package p071f.p089f.p093b.p094j.p095n;

import java.util.List;
import p071f.p089f.p093b.p094j.C3193d;
import p071f.p089f.p093b.p094j.C3193d.C3195b;
import p071f.p089f.p093b.p094j.C3196e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;
import p071f.p089f.p093b.p094j.C3204i;

/* renamed from: f.f.b.j.n.j */
public class C3221j extends C3226m {

    /* renamed from: k */
    private static int[] f9299k = new int[2];

    /* renamed from: f.f.b.j.n.j$a */
    static /* synthetic */ class C3222a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9300a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                f.f.b.j.n.m$b[] r0 = p071f.p089f.p093b.p094j.p095n.C3226m.C3228b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9300a = r0
                f.f.b.j.n.m$b r1 = p071f.p089f.p093b.p094j.p095n.C3226m.C3228b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9300a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.j.n.m$b r1 = p071f.p089f.p093b.p094j.p095n.C3226m.C3228b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9300a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.j.n.m$b r1 = p071f.p089f.p093b.p094j.p095n.C3226m.C3228b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3221j.C3222a.<clinit>():void");
        }
    }

    public C3221j(C3196e eVar) {
        super(eVar);
        this.f9315h.f9281e = C3217a.LEFT;
        this.f9316i.f9281e = C3217a.RIGHT;
        this.f9313f = 0;
    }

    /* renamed from: a */
    private void m13230a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            int i10 = (int) ((((float) i6) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i10;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10548a() {
        C3193d dVar;
        C3216f fVar;
        C3216f fVar2;
        C3216f fVar3;
        Object obj;
        List list;
        C3216f fVar4;
        int i;
        C3216f fVar5;
        C3216f fVar6;
        C3196e eVar = this.f9309b;
        if (eVar.f9146a) {
            this.f9312e.mo10565a(eVar.mo10471y());
        }
        if (!this.f9312e.f9286j) {
            C3198b l = this.f9309b.mo10450l();
            this.f9311d = l;
            if (l != C3198b.MATCH_CONSTRAINT) {
                if (l == C3198b.MATCH_PARENT) {
                    C3196e r = this.f9309b.mo10462r();
                    if ((r != null && r.mo10450l() == C3198b.FIXED) || r.mo10450l() == C3198b.MATCH_PARENT) {
                        int y = (r.mo10471y() - this.f9309b.f9172x.mo10381a()) - this.f9309b.f9174z.mo10381a();
                        mo10578a(this.f9315h, r.f9152d.f9315h, this.f9309b.f9172x.mo10381a());
                        mo10578a(this.f9316i, r.f9152d.f9316i, -this.f9309b.f9174z.mo10381a());
                        this.f9312e.mo10565a(y);
                        return;
                    }
                }
                if (this.f9311d == C3198b.FIXED) {
                    this.f9312e.mo10565a(this.f9309b.mo10471y());
                }
            }
        } else if (this.f9311d == C3198b.MATCH_PARENT) {
            C3196e r2 = this.f9309b.mo10462r();
            if ((r2 != null && r2.mo10450l() == C3198b.FIXED) || r2.mo10450l() == C3198b.MATCH_PARENT) {
                mo10578a(this.f9315h, r2.f9152d.f9315h, this.f9309b.f9172x.mo10381a());
                mo10578a(this.f9316i, r2.f9152d.f9316i, -this.f9309b.f9174z.mo10381a());
                return;
            }
        }
        int i2 = 1;
        if (this.f9312e.f9286j) {
            C3196e eVar2 = this.f9309b;
            if (eVar2.f9146a) {
                C3193d[] dVarArr = eVar2.f9125F;
                if (dVarArr[0].f9104c == null || dVarArr[1].f9104c == null) {
                    C3196e eVar3 = this.f9309b;
                    C3193d[] dVarArr2 = eVar3.f9125F;
                    if (dVarArr2[0].f9104c != null) {
                        C3216f a = mo10575a(dVarArr2[0]);
                        if (a != null) {
                            mo10578a(this.f9315h, a, this.f9309b.f9125F[0].mo10381a());
                        }
                    }
                    if (dVarArr2[1].f9104c != null) {
                        C3216f a2 = mo10575a(dVarArr2[1]);
                        if (a2 != null) {
                            mo10578a(this.f9316i, a2, -this.f9309b.f9125F[1].mo10381a());
                            fVar6 = this.f9315h;
                            fVar5 = this.f9316i;
                            i = -this.f9312e.f9283g;
                            mo10578a(fVar6, fVar5, i);
                        }
                    } else if (!(eVar3 instanceof C3204i) && eVar3.mo10462r() != null && this.f9309b.mo10402a(C3195b.CENTER).f9104c == null) {
                        mo10578a(this.f9315h, this.f9309b.mo10462r().f9152d.f9315h, this.f9309b.mo10472z());
                    }
                    fVar6 = this.f9316i;
                    fVar5 = this.f9315h;
                    i = this.f9312e.f9283g;
                    mo10578a(fVar6, fVar5, i);
                } else if (eVar2.mo10397C()) {
                    this.f9315h.f9282f = this.f9309b.f9125F[0].mo10381a();
                    fVar = this.f9316i;
                    dVar = this.f9309b.f9125F[1];
                    fVar.f9282f = -dVar.mo10381a();
                } else {
                    C3216f a3 = mo10575a(this.f9309b.f9125F[0]);
                    if (a3 != null) {
                        mo10578a(this.f9315h, a3, this.f9309b.f9125F[0].mo10381a());
                    }
                    C3216f a4 = mo10575a(this.f9309b.f9125F[1]);
                    if (a4 != null) {
                        mo10578a(this.f9316i, a4, -this.f9309b.f9125F[1].mo10381a());
                    }
                    this.f9315h.f9278b = true;
                    this.f9316i.f9278b = true;
                }
            }
        }
        if (this.f9311d == C3198b.MATCH_CONSTRAINT) {
            C3196e eVar4 = this.f9309b;
            int i3 = eVar4.f9158j;
            if (i3 == 2) {
                C3196e r3 = eVar4.mo10462r();
                if (r3 != null) {
                    C3218g gVar = r3.f9153e.f9312e;
                    this.f9312e.f9288l.add(gVar);
                    gVar.f9287k.add(this.f9312e);
                    C3218g gVar2 = this.f9312e;
                    gVar2.f9278b = true;
                    gVar2.f9287k.add(this.f9315h);
                    list = this.f9312e.f9287k;
                    obj = this.f9316i;
                }
            } else if (i3 == 3) {
                if (eVar4.f9159k == 3) {
                    this.f9315h.f9277a = this;
                    this.f9316i.f9277a = this;
                    C3224l lVar = eVar4.f9153e;
                    lVar.f9315h.f9277a = this;
                    lVar.f9316i.f9277a = this;
                    this.f9312e.f9277a = this;
                    if (eVar4.mo10398D()) {
                        this.f9312e.f9288l.add(this.f9309b.f9153e.f9312e);
                        this.f9309b.f9153e.f9312e.f9287k.add(this.f9312e);
                        C3224l lVar2 = this.f9309b.f9153e;
                        lVar2.f9312e.f9277a = this;
                        this.f9312e.f9288l.add(lVar2.f9315h);
                        this.f9312e.f9288l.add(this.f9309b.f9153e.f9316i);
                        this.f9309b.f9153e.f9315h.f9287k.add(this.f9312e);
                        list = this.f9309b.f9153e.f9316i.f9287k;
                        obj = this.f9312e;
                    } else if (this.f9309b.mo10397C()) {
                        this.f9309b.f9153e.f9312e.f9288l.add(this.f9312e);
                        list = this.f9312e.f9287k;
                        obj = this.f9309b.f9153e.f9312e;
                    } else {
                        fVar4 = this.f9309b.f9153e.f9312e;
                    }
                } else {
                    C3218g gVar3 = eVar4.f9153e.f9312e;
                    this.f9312e.f9288l.add(gVar3);
                    gVar3.f9287k.add(this.f9312e);
                    this.f9309b.f9153e.f9315h.f9287k.add(this.f9312e);
                    this.f9309b.f9153e.f9316i.f9287k.add(this.f9312e);
                    C3218g gVar4 = this.f9312e;
                    gVar4.f9278b = true;
                    gVar4.f9287k.add(this.f9315h);
                    this.f9312e.f9287k.add(this.f9316i);
                    this.f9315h.f9288l.add(this.f9312e);
                    fVar4 = this.f9316i;
                }
                list = fVar4.f9288l;
                obj = this.f9312e;
            }
            list.add(obj);
        }
        C3196e eVar5 = this.f9309b;
        C3193d[] dVarArr3 = eVar5.f9125F;
        if (dVarArr3[0].f9104c == null || dVarArr3[1].f9104c == null) {
            C3196e eVar6 = this.f9309b;
            C3193d[] dVarArr4 = eVar6.f9125F;
            if (dVarArr4[0].f9104c != null) {
                C3216f a5 = mo10575a(dVarArr4[0]);
                if (a5 != null) {
                    mo10578a(this.f9315h, a5, this.f9309b.f9125F[0].mo10381a());
                }
            }
            if (dVarArr4[1].f9104c != null) {
                C3216f a6 = mo10575a(dVarArr4[1]);
                if (a6 != null) {
                    mo10578a(this.f9316i, a6, -this.f9309b.f9125F[1].mo10381a());
                    fVar3 = this.f9315h;
                    fVar2 = this.f9316i;
                    i2 = -1;
                    mo10579a(fVar3, fVar2, i2, this.f9312e);
                }
            } else if (!(eVar6 instanceof C3204i) && eVar6.mo10462r() != null) {
                mo10578a(this.f9315h, this.f9309b.mo10462r().f9152d.f9315h, this.f9309b.mo10472z());
            }
            fVar3 = this.f9316i;
            fVar2 = this.f9315h;
            mo10579a(fVar3, fVar2, i2, this.f9312e);
        } else if (eVar5.mo10397C()) {
            this.f9315h.f9282f = this.f9309b.f9125F[0].mo10381a();
            fVar = this.f9316i;
            dVar = this.f9309b.f9125F[1];
            fVar.f9282f = -dVar.mo10381a();
        } else {
            C3216f a7 = mo10575a(this.f9309b.f9125F[0]);
            C3216f a8 = mo10575a(this.f9309b.f9125F[1]);
            a7.mo10566b(this);
            a8.mo10566b(this);
            this.f9317j = C3228b.CENTER;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x029f, code lost:
        if (r14 != 1) goto L_0x02f7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10549a(p071f.p089f.p093b.p094j.p095n.C3214d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p071f.p089f.p093b.p094j.p095n.C3221j.C3222a.f9300a
            f.f.b.j.n.m$b r1 = r8.f9317j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.d r1 = r0.f9172x
            f.f.b.j.d r0 = r0.f9174z
            r3 = r17
            r8.mo10577a(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo10580b(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo10581c(r17)
        L_0x002e:
            f.f.b.j.n.g r0 = r8.f9312e
            boolean r0 = r0.f9286j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02f7
            f.f.b.j.e$b r0 = r8.f9311d
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02f7
            f.f.b.j.e r0 = r8.f9309b
            int r3 = r0.f9158j
            if (r3 == r1) goto L_0x02d9
            if (r3 == r2) goto L_0x0046
            goto L_0x02f7
        L_0x0046:
            int r1 = r0.f9159k
            r3 = -1
            if (r1 == 0) goto L_0x007d
            if (r1 != r2) goto L_0x004e
            goto L_0x007d
        L_0x004e:
            int r0 = r0.mo10442h()
            if (r0 == r3) goto L_0x006a
            if (r0 == 0) goto L_0x005b
            if (r0 == r9) goto L_0x006a
            r0 = 0
            goto L_0x02f2
        L_0x005b:
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r1 = r0.f9153e
            f.f.b.j.n.g r1 = r1.f9312e
            int r1 = r1.f9283g
            float r1 = (float) r1
            float r0 = r0.mo10440g()
            float r1 = r1 / r0
            goto L_0x0079
        L_0x006a:
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r1 = r0.f9153e
            f.f.b.j.n.g r1 = r1.f9312e
            int r1 = r1.f9283g
            float r1 = (float) r1
            float r0 = r0.mo10440g()
            float r1 = r1 * r0
        L_0x0079:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x02f2
        L_0x007d:
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r1 = r0.f9153e
            f.f.b.j.n.f r12 = r1.f9315h
            f.f.b.j.n.f r13 = r1.f9316i
            f.f.b.j.d r0 = r0.f9172x
            f.f.b.j.d r0 = r0.f9104c
            if (r0 == 0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            f.f.b.j.e r1 = r8.f9309b
            f.f.b.j.d r1 = r1.f9173y
            f.f.b.j.d r1 = r1.f9104c
            if (r1 == 0) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            f.f.b.j.e r2 = r8.f9309b
            f.f.b.j.d r2 = r2.f9174z
            f.f.b.j.d r2 = r2.f9104c
            if (r2 == 0) goto L_0x00a3
            r2 = 1
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            f.f.b.j.e r4 = r8.f9309b
            f.f.b.j.d r4 = r4.f9120A
            f.f.b.j.d r4 = r4.f9104c
            if (r4 == 0) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            f.f.b.j.e r5 = r8.f9309b
            int r14 = r5.mo10442h()
            if (r0 == 0) goto L_0x01f5
            if (r1 == 0) goto L_0x01f5
            if (r2 == 0) goto L_0x01f5
            if (r4 == 0) goto L_0x01f5
            f.f.b.j.e r0 = r8.f9309b
            float r15 = r0.mo10440g()
            boolean r0 = r12.f9286j
            if (r0 == 0) goto L_0x0126
            boolean r0 = r13.f9286j
            if (r0 == 0) goto L_0x0126
            f.f.b.j.n.f r0 = r8.f9315h
            boolean r1 = r0.f9279c
            if (r1 == 0) goto L_0x0125
            f.f.b.j.n.f r1 = r8.f9316i
            boolean r1 = r1.f9279c
            if (r1 != 0) goto L_0x00d8
            goto L_0x0125
        L_0x00d8:
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            f.f.b.j.n.f r1 = r8.f9315h
            int r1 = r1.f9282f
            int r2 = r0 + r1
            f.f.b.j.n.f r0 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            f.f.b.j.n.f r1 = r8.f9316i
            int r1 = r1.f9282f
            int r3 = r0 - r1
            int r0 = r12.f9283g
            int r1 = r12.f9282f
            int r4 = r0 + r1
            int r0 = r13.f9283g
            int r1 = r13.f9282f
            int r5 = r0 - r1
            int[] r1 = f9299k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13230a(r1, r2, r3, r4, r5, r6, r7)
            f.f.b.j.n.g r0 = r8.f9312e
            int[] r1 = f9299k
            r1 = r1[r10]
            r0.mo10565a(r1)
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r0 = r0.f9153e
            f.f.b.j.n.g r0 = r0.f9312e
            int[] r1 = f9299k
            r1 = r1[r9]
            r0.mo10565a(r1)
        L_0x0125:
            return
        L_0x0126:
            f.f.b.j.n.f r0 = r8.f9315h
            boolean r1 = r0.f9286j
            if (r1 == 0) goto L_0x0183
            f.f.b.j.n.f r1 = r8.f9316i
            boolean r2 = r1.f9286j
            if (r2 == 0) goto L_0x0183
            boolean r2 = r12.f9279c
            if (r2 == 0) goto L_0x0182
            boolean r2 = r13.f9279c
            if (r2 != 0) goto L_0x013b
            goto L_0x0182
        L_0x013b:
            int r2 = r0.f9283g
            int r0 = r0.f9282f
            int r2 = r2 + r0
            int r0 = r1.f9283g
            int r1 = r1.f9282f
            int r3 = r0 - r1
            java.util.List<f.f.b.j.n.f> r0 = r12.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            int r1 = r12.f9282f
            int r4 = r0 + r1
            java.util.List<f.f.b.j.n.f> r0 = r13.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            int r1 = r13.f9282f
            int r5 = r0 - r1
            int[] r1 = f9299k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13230a(r1, r2, r3, r4, r5, r6, r7)
            f.f.b.j.n.g r0 = r8.f9312e
            int[] r1 = f9299k
            r1 = r1[r10]
            r0.mo10565a(r1)
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r0 = r0.f9153e
            f.f.b.j.n.g r0 = r0.f9312e
            int[] r1 = f9299k
            r1 = r1[r9]
            r0.mo10565a(r1)
            goto L_0x0183
        L_0x0182:
            return
        L_0x0183:
            f.f.b.j.n.f r0 = r8.f9315h
            boolean r1 = r0.f9279c
            if (r1 == 0) goto L_0x01f4
            f.f.b.j.n.f r1 = r8.f9316i
            boolean r1 = r1.f9279c
            if (r1 == 0) goto L_0x01f4
            boolean r1 = r12.f9279c
            if (r1 == 0) goto L_0x01f4
            boolean r1 = r13.f9279c
            if (r1 != 0) goto L_0x0198
            goto L_0x01f4
        L_0x0198:
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            f.f.b.j.n.f r1 = r8.f9315h
            int r1 = r1.f9282f
            int r2 = r0 + r1
            f.f.b.j.n.f r0 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            f.f.b.j.n.f r1 = r8.f9316i
            int r1 = r1.f9282f
            int r3 = r0 - r1
            java.util.List<f.f.b.j.n.f> r0 = r12.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            int r1 = r12.f9282f
            int r4 = r0 + r1
            java.util.List<f.f.b.j.n.f> r0 = r13.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            int r0 = r0.f9283g
            int r1 = r13.f9282f
            int r5 = r0 - r1
            int[] r1 = f9299k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m13230a(r1, r2, r3, r4, r5, r6, r7)
            f.f.b.j.n.g r0 = r8.f9312e
            int[] r1 = f9299k
            r1 = r1[r10]
            r0.mo10565a(r1)
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r0 = r0.f9153e
            f.f.b.j.n.g r0 = r0.f9312e
            int[] r1 = f9299k
            r1 = r1[r9]
            goto L_0x02d4
        L_0x01f4:
            return
        L_0x01f5:
            if (r0 == 0) goto L_0x026e
            if (r2 == 0) goto L_0x026e
            f.f.b.j.n.f r0 = r8.f9315h
            boolean r0 = r0.f9279c
            if (r0 == 0) goto L_0x026d
            f.f.b.j.n.f r0 = r8.f9316i
            boolean r0 = r0.f9279c
            if (r0 != 0) goto L_0x0206
            goto L_0x026d
        L_0x0206:
            f.f.b.j.e r0 = r8.f9309b
            float r0 = r0.mo10440g()
            f.f.b.j.n.f r1 = r8.f9315h
            java.util.List<f.f.b.j.n.f> r1 = r1.f9288l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.j.n.f r1 = (p071f.p089f.p093b.p094j.p095n.C3216f) r1
            int r1 = r1.f9283g
            f.f.b.j.n.f r2 = r8.f9315h
            int r2 = r2.f9282f
            int r1 = r1 + r2
            f.f.b.j.n.f r2 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r2 = r2.f9288l
            java.lang.Object r2 = r2.get(r10)
            f.f.b.j.n.f r2 = (p071f.p089f.p093b.p094j.p095n.C3216f) r2
            int r2 = r2.f9283g
            f.f.b.j.n.f r4 = r8.f9316i
            int r4 = r4.f9282f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0249
            if (r14 == 0) goto L_0x0249
            if (r14 == r9) goto L_0x0236
            goto L_0x02f7
        L_0x0236:
            int r2 = r2 - r1
            int r1 = r8.mo10574a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10574a(r2, r9)
            if (r2 == r3) goto L_0x025d
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x025b
        L_0x0249:
            int r2 = r2 - r1
            int r1 = r8.mo10574a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10574a(r2, r9)
            if (r2 == r3) goto L_0x025d
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x025b:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x025d:
            f.f.b.j.n.g r0 = r8.f9312e
            r0.mo10565a(r1)
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r0 = r0.f9153e
            f.f.b.j.n.g r0 = r0.f9312e
            r0.mo10565a(r3)
            goto L_0x02f7
        L_0x026d:
            return
        L_0x026e:
            if (r1 == 0) goto L_0x02f7
            if (r4 == 0) goto L_0x02f7
            boolean r0 = r12.f9279c
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r13.f9279c
            if (r0 != 0) goto L_0x027b
            goto L_0x02d8
        L_0x027b:
            f.f.b.j.e r0 = r8.f9309b
            float r0 = r0.mo10440g()
            java.util.List<f.f.b.j.n.f> r1 = r12.f9288l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.j.n.f r1 = (p071f.p089f.p093b.p094j.p095n.C3216f) r1
            int r1 = r1.f9283g
            int r2 = r12.f9282f
            int r1 = r1 + r2
            java.util.List<f.f.b.j.n.f> r2 = r13.f9288l
            java.lang.Object r2 = r2.get(r10)
            f.f.b.j.n.f r2 = (p071f.p089f.p093b.p094j.p095n.C3216f) r2
            int r2 = r2.f9283g
            int r4 = r13.f9282f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02b5
            if (r14 == 0) goto L_0x02a2
            if (r14 == r9) goto L_0x02b5
            goto L_0x02f7
        L_0x02a2:
            int r2 = r2 - r1
            int r1 = r8.mo10574a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10574a(r2, r10)
            if (r2 == r3) goto L_0x02c9
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x02c7
        L_0x02b5:
            int r2 = r2 - r1
            int r1 = r8.mo10574a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo10574a(r2, r10)
            if (r2 == r3) goto L_0x02c9
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x02c7:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02c9:
            f.f.b.j.n.g r0 = r8.f9312e
            r0.mo10565a(r3)
            f.f.b.j.e r0 = r8.f9309b
            f.f.b.j.n.l r0 = r0.f9153e
            f.f.b.j.n.g r0 = r0.f9312e
        L_0x02d4:
            r0.mo10565a(r1)
            goto L_0x02f7
        L_0x02d8:
            return
        L_0x02d9:
            f.f.b.j.e r0 = r0.mo10462r()
            if (r0 == 0) goto L_0x02f7
            f.f.b.j.n.j r0 = r0.f9152d
            f.f.b.j.n.g r0 = r0.f9312e
            boolean r1 = r0.f9286j
            if (r1 == 0) goto L_0x02f7
            f.f.b.j.e r1 = r8.f9309b
            float r1 = r1.f9163o
            int r0 = r0.f9283g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x02f2:
            f.f.b.j.n.g r1 = r8.f9312e
            r1.mo10565a(r0)
        L_0x02f7:
            f.f.b.j.n.f r0 = r8.f9315h
            boolean r1 = r0.f9279c
            if (r1 == 0) goto L_0x0419
            f.f.b.j.n.f r1 = r8.f9316i
            boolean r2 = r1.f9279c
            if (r2 != 0) goto L_0x0305
            goto L_0x0419
        L_0x0305:
            boolean r0 = r0.f9286j
            if (r0 == 0) goto L_0x0314
            boolean r0 = r1.f9286j
            if (r0 == 0) goto L_0x0314
            f.f.b.j.n.g r0 = r8.f9312e
            boolean r0 = r0.f9286j
            if (r0 == 0) goto L_0x0314
            return
        L_0x0314:
            f.f.b.j.n.g r0 = r8.f9312e
            boolean r0 = r0.f9286j
            if (r0 != 0) goto L_0x035e
            f.f.b.j.e$b r0 = r8.f9311d
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x035e
            f.f.b.j.e r0 = r8.f9309b
            int r1 = r0.f9158j
            if (r1 != 0) goto L_0x035e
            boolean r0 = r0.mo10397C()
            if (r0 != 0) goto L_0x035e
            f.f.b.j.n.f r0 = r8.f9315h
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            f.f.b.j.n.f r1 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r1 = r1.f9288l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.j.n.f r1 = (p071f.p089f.p093b.p094j.p095n.C3216f) r1
            int r0 = r0.f9283g
            f.f.b.j.n.f r2 = r8.f9315h
            int r3 = r2.f9282f
            int r0 = r0 + r3
            int r1 = r1.f9283g
            f.f.b.j.n.f r3 = r8.f9316i
            int r3 = r3.f9282f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo10565a(r0)
            f.f.b.j.n.f r0 = r8.f9316i
            r0.mo10565a(r1)
            f.f.b.j.n.g r0 = r8.f9312e
            r0.mo10565a(r3)
            return
        L_0x035e:
            f.f.b.j.n.g r0 = r8.f9312e
            boolean r0 = r0.f9286j
            if (r0 != 0) goto L_0x03c2
            f.f.b.j.e$b r0 = r8.f9311d
            f.f.b.j.e$b r1 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03c2
            int r0 = r8.f9308a
            if (r0 != r9) goto L_0x03c2
            f.f.b.j.n.f r0 = r8.f9315h
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03c2
            f.f.b.j.n.f r0 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03c2
            f.f.b.j.n.f r0 = r8.f9315h
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            f.f.b.j.n.f r1 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r1 = r1.f9288l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.j.n.f r1 = (p071f.p089f.p093b.p094j.p095n.C3216f) r1
            int r0 = r0.f9283g
            f.f.b.j.n.f r2 = r8.f9315h
            int r2 = r2.f9282f
            int r0 = r0 + r2
            int r1 = r1.f9283g
            f.f.b.j.n.f r2 = r8.f9316i
            int r2 = r2.f9282f
            int r1 = r1 + r2
            int r1 = r1 - r0
            f.f.b.j.n.g r0 = r8.f9312e
            int r0 = r0.f9298m
            int r0 = java.lang.Math.min(r1, r0)
            f.f.b.j.e r1 = r8.f9309b
            int r2 = r1.f9162n
            int r1 = r1.f9161m
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03bd
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03bd:
            f.f.b.j.n.g r1 = r8.f9312e
            r1.mo10565a(r0)
        L_0x03c2:
            f.f.b.j.n.g r0 = r8.f9312e
            boolean r0 = r0.f9286j
            if (r0 != 0) goto L_0x03c9
            return
        L_0x03c9:
            f.f.b.j.n.f r0 = r8.f9315h
            java.util.List<f.f.b.j.n.f> r0 = r0.f9288l
            java.lang.Object r0 = r0.get(r10)
            f.f.b.j.n.f r0 = (p071f.p089f.p093b.p094j.p095n.C3216f) r0
            f.f.b.j.n.f r1 = r8.f9316i
            java.util.List<f.f.b.j.n.f> r1 = r1.f9288l
            java.lang.Object r1 = r1.get(r10)
            f.f.b.j.n.f r1 = (p071f.p089f.p093b.p094j.p095n.C3216f) r1
            int r2 = r0.f9283g
            f.f.b.j.n.f r3 = r8.f9315h
            int r3 = r3.f9282f
            int r2 = r2 + r3
            int r3 = r1.f9283g
            f.f.b.j.n.f r4 = r8.f9316i
            int r4 = r4.f9282f
            int r3 = r3 + r4
            f.f.b.j.e r4 = r8.f9309b
            float r4 = r4.mo10446j()
            if (r0 != r1) goto L_0x03f9
            int r2 = r0.f9283g
            int r3 = r1.f9283g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03f9:
            int r3 = r3 - r2
            f.f.b.j.n.g r0 = r8.f9312e
            int r0 = r0.f9283g
            int r3 = r3 - r0
            f.f.b.j.n.f r0 = r8.f9315h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo10565a(r1)
            f.f.b.j.n.f r0 = r8.f9316i
            f.f.b.j.n.f r1 = r8.f9315h
            int r1 = r1.f9283g
            f.f.b.j.n.g r2 = r8.f9312e
            int r2 = r2.f9283g
            int r1 = r1 + r2
            r0.mo10565a(r1)
        L_0x0419:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.p095n.C3221j.mo10549a(f.f.b.j.n.d):void");
    }

    /* renamed from: b */
    public void mo10550b() {
        C3216f fVar = this.f9315h;
        if (fVar.f9286j) {
            this.f9309b.mo10461q(fVar.f9283g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo10551c() {
        this.f9310c = null;
        this.f9315h.mo10564a();
        this.f9316i.mo10564a();
        this.f9312e.mo10564a();
        this.f9314g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo10553f() {
        return this.f9311d != C3198b.MATCH_CONSTRAINT || this.f9309b.f9158j == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo10568g() {
        this.f9314g = false;
        this.f9315h.f9286j = false;
        this.f9316i.f9286j = false;
        this.f9312e.f9286j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(this.f9309b.mo10439f());
        return sb.toString();
    }
}
