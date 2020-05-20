package p071f.p089f.p093b.p094j;

import java.util.Arrays;
import p071f.p089f.p093b.C3183e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;
import p071f.p089f.p093b.p094j.p095n.C3210b;
import p071f.p089f.p093b.p094j.p095n.C3210b.C3212b;
import p071f.p089f.p093b.p094j.p095n.C3215e;

/* renamed from: f.f.b.j.f */
public class C3199f extends C3208m {

    /* renamed from: f0 */
    C3210b f9182f0 = new C3210b(this);

    /* renamed from: g0 */
    public C3215e f9183g0 = new C3215e(this);

    /* renamed from: h0 */
    private C3212b f9184h0 = null;

    /* renamed from: i0 */
    private boolean f9185i0 = false;

    /* renamed from: j0 */
    protected C3183e f9186j0 = new C3183e();

    /* renamed from: k0 */
    int f9187k0;

    /* renamed from: l0 */
    int f9188l0;

    /* renamed from: m0 */
    int f9189m0 = 0;

    /* renamed from: n0 */
    int f9190n0 = 0;

    /* renamed from: o0 */
    C3192c[] f9191o0 = new C3192c[4];

    /* renamed from: p0 */
    C3192c[] f9192p0 = new C3192c[4];

    /* renamed from: q0 */
    private int f9193q0 = 7;

    /* renamed from: r0 */
    private boolean f9194r0 = false;

    /* renamed from: s0 */
    private boolean f9195s0 = false;

    /* renamed from: S */
    private void m13058S() {
        this.f9189m0 = 0;
        this.f9190n0 = 0;
    }

    /* renamed from: d */
    private void m13059d(C3196e eVar) {
        int i = this.f9189m0 + 1;
        C3192c[] cVarArr = this.f9192p0;
        if (i >= cVarArr.length) {
            this.f9192p0 = (C3192c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f9192p0[this.f9189m0] = new C3192c(eVar, 0, mo10480P());
        this.f9189m0++;
    }

    /* renamed from: e */
    private void m13060e(C3196e eVar) {
        int i = this.f9190n0 + 1;
        C3192c[] cVarArr = this.f9191o0;
        if (i >= cVarArr.length) {
            this.f9191o0 = (C3192c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f9191o0[this.f9190n0] = new C3192c(eVar, 1, mo10480P());
        this.f9190n0++;
    }

    /* renamed from: E */
    public void mo10399E() {
        this.f9186j0.mo10362f();
        this.f9187k0 = 0;
        this.f9188l0 = 0;
        super.mo10399E();
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v28 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v7, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 206
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10473H() {
        /*
            r17 = this;
            r1 = r17
            r2 = 0
            r1.f9133N = r2
            r1.f9134O = r2
            int r0 = r17.mo10471y()
            int r3 = java.lang.Math.max(r2, r0)
            int r0 = r17.mo10444i()
            int r4 = java.lang.Math.max(r2, r0)
            r1.f9194r0 = r2
            r1.f9195s0 = r2
            r0 = 64
            boolean r0 = r1.mo10378s(r0)
            r5 = 1
            if (r0 != 0) goto L_0x002f
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r1.mo10378s(r0)
            if (r0 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = 0
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            f.f.b.e r6 = r1.f9186j0
            r6.f9027g = r2
            r6.f9028h = r2
            int r7 = r1.f9193q0
            if (r7 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            r6.f9028h = r5
        L_0x003e:
            f.f.b.j.e$b[] r0 = r1.f9127H
            r6 = r0[r5]
            r7 = r0[r2]
            java.util.ArrayList<f.f.b.j.e> r8 = r1.f9253e0
            f.f.b.j.e$b r0 = r17.mo10450l()
            f.f.b.j.e$b r9 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r0 == r9) goto L_0x0059
            f.f.b.j.e$b r0 = r17.mo10468v()
            f.f.b.j.e$b r9 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r0 != r9) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r9 = 0
            goto L_0x005a
        L_0x0059:
            r9 = 1
        L_0x005a:
            r17.m13058S()
            java.util.ArrayList<f.f.b.j.e> r0 = r1.f9253e0
            int r10 = r0.size()
            r0 = 0
        L_0x0064:
            if (r0 >= r10) goto L_0x007a
            java.util.ArrayList<f.f.b.j.e> r11 = r1.f9253e0
            java.lang.Object r11 = r11.get(r0)
            f.f.b.j.e r11 = (p071f.p089f.p093b.p094j.C3196e) r11
            boolean r12 = r11 instanceof p071f.p089f.p093b.p094j.C3208m
            if (r12 == 0) goto L_0x0077
            f.f.b.j.m r11 = (p071f.p089f.p093b.p094j.C3208m) r11
            r11.mo10473H()
        L_0x0077:
            int r0 = r0 + 1
            goto L_0x0064
        L_0x007a:
            r0 = 0
            r11 = 1
            r12 = 0
        L_0x007d:
            if (r11 == 0) goto L_0x01d3
            int r13 = r0 + 1
            f.f.b.e r0 = r1.f9186j0     // Catch:{ Exception -> 0x00af }
            r0.mo10362f()     // Catch:{ Exception -> 0x00af }
            r17.m13058S()     // Catch:{ Exception -> 0x00af }
            f.f.b.e r0 = r1.f9186j0     // Catch:{ Exception -> 0x00af }
            r1.mo10422b(r0)     // Catch:{ Exception -> 0x00af }
            r0 = 0
        L_0x008f:
            if (r0 >= r10) goto L_0x00a1
            java.util.ArrayList<f.f.b.j.e> r14 = r1.f9253e0     // Catch:{ Exception -> 0x00af }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x00af }
            f.f.b.j.e r14 = (p071f.p089f.p093b.p094j.C3196e) r14     // Catch:{ Exception -> 0x00af }
            f.f.b.e r15 = r1.f9186j0     // Catch:{ Exception -> 0x00af }
            r14.mo10422b(r15)     // Catch:{ Exception -> 0x00af }
            int r0 = r0 + 1
            goto L_0x008f
        L_0x00a1:
            f.f.b.e r0 = r1.f9186j0     // Catch:{ Exception -> 0x00af }
            boolean r11 = r1.mo10488d(r0)     // Catch:{ Exception -> 0x00af }
            if (r11 == 0) goto L_0x00c9
            f.f.b.e r0 = r1.f9186j0     // Catch:{ Exception -> 0x00af }
            r0.mo10361e()     // Catch:{ Exception -> 0x00af }
            goto L_0x00c9
        L_0x00af:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r14 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "EXCEPTION : "
            r15.append(r5)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r14.println(r0)
        L_0x00c9:
            f.f.b.e r0 = r1.f9186j0
            if (r11 == 0) goto L_0x00d3
            boolean[] r5 = p071f.p089f.p093b.p094j.C3206k.f9244a
            r1.mo10484a(r0, r5)
            goto L_0x00e9
        L_0x00d3:
            r1.mo10431c(r0)
            r0 = 0
        L_0x00d7:
            if (r0 >= r10) goto L_0x00e9
            java.util.ArrayList<f.f.b.j.e> r5 = r1.f9253e0
            java.lang.Object r5 = r5.get(r0)
            f.f.b.j.e r5 = (p071f.p089f.p093b.p094j.C3196e) r5
            f.f.b.e r11 = r1.f9186j0
            r5.mo10431c(r11)
            int r0 = r0 + 1
            goto L_0x00d7
        L_0x00e9:
            if (r9 == 0) goto L_0x0157
            r0 = 8
            if (r13 >= r0) goto L_0x0157
            boolean[] r0 = p071f.p089f.p093b.p094j.C3206k.f9244a
            r5 = 2
            boolean r0 = r0[r5]
            if (r0 == 0) goto L_0x0157
            r0 = 0
            r5 = 0
            r11 = 0
        L_0x00f9:
            if (r0 >= r10) goto L_0x011d
            java.util.ArrayList<f.f.b.j.e> r14 = r1.f9253e0
            java.lang.Object r14 = r14.get(r0)
            f.f.b.j.e r14 = (p071f.p089f.p093b.p094j.C3196e) r14
            int r15 = r14.f9133N
            int r16 = r14.mo10471y()
            int r15 = r15 + r16
            int r5 = java.lang.Math.max(r5, r15)
            int r15 = r14.f9134O
            int r14 = r14.mo10444i()
            int r15 = r15 + r14
            int r11 = java.lang.Math.max(r11, r15)
            int r0 = r0 + 1
            goto L_0x00f9
        L_0x011d:
            int r0 = r1.f9136Q
            int r0 = java.lang.Math.max(r0, r5)
            int r5 = r1.f9137R
            int r5 = java.lang.Math.max(r5, r11)
            f.f.b.j.e$b r11 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r7 != r11) goto L_0x013f
            int r11 = r17.mo10471y()
            if (r11 >= r0) goto L_0x013f
            r1.mo10459p(r0)
            f.f.b.j.e$b[] r0 = r1.f9127H
            f.f.b.j.e$b r11 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r0[r2] = r11
            r0 = 1
            r12 = 1
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            f.f.b.j.e$b r11 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r6 != r11) goto L_0x0158
            int r11 = r17.mo10444i()
            if (r11 >= r5) goto L_0x0158
            r1.mo10443h(r5)
            f.f.b.j.e$b[] r0 = r1.f9127H
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r11 = 1
            r0[r11] = r5
            r0 = 1
            r12 = 1
            goto L_0x0158
        L_0x0157:
            r0 = 0
        L_0x0158:
            int r5 = r1.f9136Q
            int r11 = r17.mo10471y()
            int r5 = java.lang.Math.max(r5, r11)
            int r11 = r17.mo10471y()
            if (r5 <= r11) goto L_0x0173
            r1.mo10459p(r5)
            f.f.b.j.e$b[] r0 = r1.f9127H
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r0[r2] = r5
            r0 = 1
            r12 = 1
        L_0x0173:
            int r5 = r1.f9137R
            int r11 = r17.mo10444i()
            int r5 = java.lang.Math.max(r5, r11)
            int r11 = r17.mo10444i()
            if (r5 <= r11) goto L_0x0190
            r1.mo10443h(r5)
            f.f.b.j.e$b[] r0 = r1.f9127H
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r11 = 1
            r0[r11] = r5
            r0 = 1
            r12 = 1
            goto L_0x0191
        L_0x0190:
            r11 = 1
        L_0x0191:
            if (r12 != 0) goto L_0x01ce
            f.f.b.j.e$b[] r5 = r1.f9127H
            r5 = r5[r2]
            f.f.b.j.e$b r14 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r5 != r14) goto L_0x01b0
            if (r3 <= 0) goto L_0x01b0
            int r5 = r17.mo10471y()
            if (r5 <= r3) goto L_0x01b0
            r1.f9194r0 = r11
            f.f.b.j.e$b[] r0 = r1.f9127H
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r0[r2] = r5
            r1.mo10459p(r3)
            r0 = 1
            r12 = 1
        L_0x01b0:
            f.f.b.j.e$b[] r5 = r1.f9127H
            r5 = r5[r11]
            f.f.b.j.e$b r14 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r5 != r14) goto L_0x01ce
            if (r4 <= 0) goto L_0x01ce
            int r5 = r17.mo10444i()
            if (r5 <= r4) goto L_0x01ce
            r1.f9195s0 = r11
            f.f.b.j.e$b[] r0 = r1.f9127H
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.FIXED
            r0[r11] = r5
            r1.mo10443h(r4)
            r11 = 1
            r12 = 1
            goto L_0x01cf
        L_0x01ce:
            r11 = r0
        L_0x01cf:
            r0 = r13
            r5 = 1
            goto L_0x007d
        L_0x01d3:
            r1.f9253e0 = r8
            if (r12 == 0) goto L_0x01de
            f.f.b.j.e$b[] r0 = r1.f9127H
            r0[r2] = r7
            r2 = 1
            r0[r2] = r6
        L_0x01de:
            f.f.b.e r0 = r1.f9186j0
            f.f.b.c r0 = r0.mo10360d()
            r1.mo10407a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3199f.mo10473H():void");
    }

    /* renamed from: J */
    public C3212b mo10474J() {
        return this.f9184h0;
    }

    /* renamed from: K */
    public int mo10475K() {
        return this.f9193q0;
    }

    /* renamed from: L */
    public boolean mo10476L() {
        return false;
    }

    /* renamed from: M */
    public void mo10477M() {
        this.f9183g0.mo10560b();
    }

    /* renamed from: N */
    public void mo10478N() {
        this.f9183g0.mo10562c();
    }

    /* renamed from: O */
    public boolean mo10479O() {
        return this.f9195s0;
    }

    /* renamed from: P */
    public boolean mo10480P() {
        return this.f9185i0;
    }

    /* renamed from: Q */
    public boolean mo10481Q() {
        return this.f9194r0;
    }

    /* renamed from: R */
    public void mo10482R() {
        this.f9182f0.mo10546a(this);
    }

    /* renamed from: a */
    public void mo10483a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f9187k0 = i10;
        int i11 = i9;
        this.f9188l0 = i11;
        this.f9182f0.mo10547a(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a */
    public void mo10484a(C3183e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo10431c(eVar);
        int size = this.f9253e0.size();
        for (int i = 0; i < size; i++) {
            ((C3196e) this.f9253e0.get(i)).mo10431c(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10485a(C3196e eVar, int i) {
        if (i == 0) {
            m13059d(eVar);
        } else if (i == 1) {
            m13060e(eVar);
        }
    }

    /* renamed from: a */
    public void mo10486a(C3212b bVar) {
        this.f9184h0 = bVar;
        this.f9183g0.mo10556a(bVar);
    }

    /* renamed from: a */
    public void mo10416a(boolean z, boolean z2) {
        super.mo10416a(z, z2);
        int size = this.f9253e0.size();
        for (int i = 0; i < size; i++) {
            ((C3196e) this.f9253e0.get(i)).mo10416a(z, z2);
        }
    }

    /* renamed from: a */
    public boolean mo10487a(boolean z, int i) {
        return this.f9183g0.mo10559a(z, i);
    }

    /* renamed from: d */
    public boolean mo10488d(C3183e eVar) {
        mo10375a(eVar);
        int size = this.f9253e0.size();
        for (int i = 0; i < size; i++) {
            C3196e eVar2 = (C3196e) this.f9253e0.get(i);
            if (eVar2 instanceof C3207l) {
                eVar2.mo10375a(eVar);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            C3196e eVar3 = (C3196e) this.f9253e0.get(i2);
            if (eVar3 instanceof C3199f) {
                C3198b[] bVarArr = eVar3.f9127H;
                C3198b bVar = bVarArr[0];
                C3198b bVar2 = bVarArr[1];
                if (bVar == C3198b.WRAP_CONTENT) {
                    eVar3.mo10411a(C3198b.FIXED);
                }
                if (bVar2 == C3198b.WRAP_CONTENT) {
                    eVar3.mo10423b(C3198b.FIXED);
                }
                eVar3.mo10375a(eVar);
                if (bVar == C3198b.WRAP_CONTENT) {
                    eVar3.mo10411a(bVar);
                }
                if (bVar2 == C3198b.WRAP_CONTENT) {
                    eVar3.mo10423b(bVar2);
                }
            } else {
                C3206k.m13155a(this, eVar, eVar3);
                if (!(eVar3 instanceof C3207l)) {
                    eVar3.mo10375a(eVar);
                }
            }
        }
        if (this.f9189m0 > 0) {
            C3191b.m12958a(this, eVar, 0);
        }
        if (this.f9190n0 > 0) {
            C3191b.m12958a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo10489d(boolean z) {
        return this.f9183g0.mo10558a(z);
    }

    /* renamed from: e */
    public boolean mo10490e(boolean z) {
        return this.f9183g0.mo10561b(z);
    }

    /* renamed from: f */
    public void mo10491f(boolean z) {
        this.f9185i0 = z;
    }

    /* renamed from: s */
    public boolean mo10378s(int i) {
        return (this.f9193q0 & i) == i;
    }

    /* renamed from: t */
    public void mo10492t(int i) {
        this.f9193q0 = i;
    }
}
