package p071f.p089f.p093b.p094j;

import java.util.ArrayList;
import p071f.p089f.p093b.C3183e;
import p071f.p089f.p093b.p094j.C3196e.C3198b;

/* renamed from: f.f.b.j.g */
public class C3200g extends C3207l {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public int f9196A0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public int f9197B0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public int f9198C0 = 2;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public int f9199D0 = 2;

    /* renamed from: E0 */
    private int f9200E0 = 0;

    /* renamed from: F0 */
    private int f9201F0 = -1;

    /* renamed from: G0 */
    private int f9202G0 = 0;

    /* renamed from: H0 */
    private ArrayList<C3201a> f9203H0 = new ArrayList<>();

    /* renamed from: I0 */
    private C3196e[] f9204I0 = null;

    /* renamed from: J0 */
    private C3196e[] f9205J0 = null;

    /* renamed from: K0 */
    private int[] f9206K0 = null;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public int f9207o0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public int f9208p0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f9209q0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public int f9210r0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public int f9211s0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f9212t0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public float f9213u0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public float f9214v0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public float f9215w0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public float f9216x0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public float f9217y0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public float f9218z0 = 0.5f;

    /* renamed from: f.f.b.j.g$a */
    private class C3201a {

        /* renamed from: a */
        private int f9219a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C3196e f9220b = null;

        /* renamed from: c */
        int f9221c = 0;

        /* renamed from: d */
        private C3193d f9222d;

        /* renamed from: e */
        private C3193d f9223e;

        /* renamed from: f */
        private C3193d f9224f;

        /* renamed from: g */
        private C3193d f9225g;

        /* renamed from: h */
        private int f9226h = 0;

        /* renamed from: i */
        private int f9227i = 0;

        /* renamed from: j */
        private int f9228j = 0;

        /* renamed from: k */
        private int f9229k = 0;

        /* renamed from: l */
        private int f9230l = 0;

        /* renamed from: m */
        private int f9231m = 0;

        /* renamed from: n */
        private int f9232n = 0;

        /* renamed from: o */
        private int f9233o = 0;

        public C3201a(int i, C3193d dVar, C3193d dVar2, C3193d dVar3, C3193d dVar4) {
            this.f9219a = i;
            this.f9222d = dVar;
            this.f9223e = dVar2;
            this.f9224f = dVar3;
            this.f9225g = dVar4;
            this.f9226h = C3200g.this.mo10532K();
            this.f9227i = C3200g.this.mo10534M();
            this.f9228j = C3200g.this.mo10533L();
            this.f9229k = C3200g.this.mo10531J();
        }

        /* renamed from: a */
        public void mo10513a() {
            this.f9221c = 0;
            this.f9220b = null;
            this.f9230l = 0;
            this.f9231m = 0;
            this.f9232n = 0;
            this.f9233o = 0;
        }

        /* renamed from: a */
        public void mo10514a(int i) {
            this.f9232n = i;
        }

        /* renamed from: a */
        public void mo10515a(int i, C3193d dVar, C3193d dVar2, C3193d dVar3, C3193d dVar4, int i2, int i3, int i4, int i5) {
            this.f9219a = i;
            this.f9222d = dVar;
            this.f9223e = dVar2;
            this.f9224f = dVar3;
            this.f9225g = dVar4;
            this.f9226h = i2;
            this.f9227i = i3;
            this.f9228j = i4;
            this.f9229k = i5;
        }

        /* renamed from: a */
        public void mo10516a(C3196e eVar) {
            int i = 0;
            if (this.f9219a == 0) {
                int a = C3200g.this.m13094d(eVar);
                int a2 = C3200g.this.f9196A0;
                if (eVar.mo10470x() != 8) {
                    i = a2;
                }
                this.f9230l += a + i;
                int b = C3200g.this.m13090c(eVar);
                if (this.f9220b == null || this.f9221c < b) {
                    this.f9220b = eVar;
                    this.f9221c = b;
                    this.f9231m = b;
                }
            } else {
                int a3 = C3200g.this.m13094d(eVar);
                int b2 = C3200g.this.m13090c(eVar);
                int b3 = C3200g.this.f9197B0;
                if (eVar.mo10470x() != 8) {
                    i = b3;
                }
                this.f9231m += b2 + i;
                if (this.f9220b == null || this.f9221c < a3) {
                    this.f9220b = eVar;
                    this.f9221c = a3;
                    this.f9230l = a3;
                }
            }
            this.f9233o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:112:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10517a(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f9233o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0017
                f.f.b.j.g r4 = p071f.p089f.p093b.p094j.C3200g.this
                f.f.b.j.e[] r4 = r4.f9242e0
                int r5 = r0.f9232n
                int r5 = r5 + r3
                r4 = r4[r5]
                r4.mo10400F()
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0017:
                if (r1 == 0) goto L_0x02e1
                f.f.b.j.e r3 = r0.f9220b
                if (r3 != 0) goto L_0x001f
                goto L_0x02e1
            L_0x001f:
                if (r19 == 0) goto L_0x0025
                if (r18 != 0) goto L_0x0025
                r4 = 1
                goto L_0x0026
            L_0x0025:
                r4 = 0
            L_0x0026:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x002a:
                if (r6 >= r1) goto L_0x0049
                if (r17 == 0) goto L_0x0032
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0033
            L_0x0032:
                r9 = r6
            L_0x0033:
                f.f.b.j.g r10 = p071f.p089f.p093b.p094j.C3200g.this
                f.f.b.j.e[] r10 = r10.f9242e0
                int r11 = r0.f9232n
                int r11 = r11 + r9
                r9 = r10[r11]
                int r9 = r9.mo10470x()
                if (r9 != 0) goto L_0x0046
                if (r7 != r5) goto L_0x0045
                r7 = r6
            L_0x0045:
                r8 = r6
            L_0x0046:
                int r6 = r6 + 1
                goto L_0x002a
            L_0x0049:
                r6 = 0
                int r9 = r0.f9219a
                if (r9 != 0) goto L_0x01a0
                f.f.b.j.e r9 = r0.f9220b
                f.f.b.j.g r10 = p071f.p089f.p093b.p094j.C3200g.this
                int r10 = r10.f9208p0
                r9.mo10455n(r10)
                int r10 = r0.f9227i
                if (r18 <= 0) goto L_0x0064
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                int r11 = r11.f9197B0
                int r10 = r10 + r11
            L_0x0064:
                f.f.b.j.d r11 = r9.f9173y
                f.f.b.j.d r12 = r0.f9223e
                r11.mo10385a(r12, r10)
                if (r19 == 0) goto L_0x0076
                f.f.b.j.d r10 = r9.f9120A
                f.f.b.j.d r11 = r0.f9225g
                int r12 = r0.f9229k
                r10.mo10385a(r11, r12)
            L_0x0076:
                if (r18 <= 0) goto L_0x0083
                f.f.b.j.d r10 = r0.f9223e
                f.f.b.j.e r10 = r10.f9102a
                f.f.b.j.d r10 = r10.f9120A
                f.f.b.j.d r11 = r9.f9173y
                r10.mo10385a(r11, r2)
            L_0x0083:
                f.f.b.j.g r10 = p071f.p089f.p093b.p094j.C3200g.this
                int r10 = r10.f9199D0
                r11 = 3
                if (r10 != r11) goto L_0x00af
                boolean r10 = r9.mo10396B()
                if (r10 != 0) goto L_0x00af
                r10 = 0
            L_0x0093:
                if (r10 >= r1) goto L_0x00af
                if (r17 == 0) goto L_0x009b
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x009c
            L_0x009b:
                r12 = r10
            L_0x009c:
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                f.f.b.j.e[] r13 = r13.f9242e0
                int r14 = r0.f9232n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.mo10396B()
                if (r13 == 0) goto L_0x00ac
                goto L_0x00b0
            L_0x00ac:
                int r10 = r10 + 1
                goto L_0x0093
            L_0x00af:
                r12 = r9
            L_0x00b0:
                r10 = 0
            L_0x00b1:
                if (r10 >= r1) goto L_0x02e1
                if (r17 == 0) goto L_0x00b9
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00ba
            L_0x00b9:
                r13 = r10
            L_0x00ba:
                f.f.b.j.g r14 = p071f.p089f.p093b.p094j.C3200g.this
                f.f.b.j.e[] r14 = r14.f9242e0
                int r15 = r0.f9232n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r10 != 0) goto L_0x00ce
                f.f.b.j.d r15 = r14.f9172x
                f.f.b.j.d r11 = r0.f9222d
                int r3 = r0.f9226h
                r14.mo10410a(r15, r11, r3)
            L_0x00ce:
                if (r13 != 0) goto L_0x0111
                f.f.b.j.g r3 = p071f.p089f.p093b.p094j.C3200g.this
                int r3 = r3.f9207o0
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                float r11 = r11.f9213u0
                int r13 = r0.f9232n
                if (r13 != 0) goto L_0x00f5
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                int r13 = r13.f9209q0
                if (r13 == r5) goto L_0x00f5
                f.f.b.j.g r3 = p071f.p089f.p093b.p094j.C3200g.this
                int r3 = r3.f9209q0
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                float r11 = r11.f9215w0
                goto L_0x010b
            L_0x00f5:
                if (r19 == 0) goto L_0x010b
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                int r13 = r13.f9211s0
                if (r13 == r5) goto L_0x010b
                f.f.b.j.g r3 = p071f.p089f.p093b.p094j.C3200g.this
                int r3 = r3.f9211s0
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                float r11 = r11.f9217y0
            L_0x010b:
                r14.mo10445i(r3)
                r14.mo10403a(r11)
            L_0x0111:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x011e
                f.f.b.j.d r3 = r14.f9174z
                f.f.b.j.d r11 = r0.f9224f
                int r13 = r0.f9228j
                r14.mo10410a(r3, r11, r13)
            L_0x011e:
                if (r6 == 0) goto L_0x0149
                f.f.b.j.d r3 = r14.f9172x
                f.f.b.j.d r11 = r6.f9174z
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                int r13 = r13.f9196A0
                r3.mo10385a(r11, r13)
                if (r10 != r7) goto L_0x0136
                f.f.b.j.d r3 = r14.f9172x
                int r11 = r0.f9226h
                r3.mo10382a(r11)
            L_0x0136:
                f.f.b.j.d r3 = r6.f9174z
                f.f.b.j.d r11 = r14.f9172x
                r3.mo10385a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x0149
                f.f.b.j.d r3 = r6.f9174z
                int r6 = r0.f9228j
                r3.mo10382a(r6)
            L_0x0149:
                if (r14 == r9) goto L_0x0199
                f.f.b.j.g r3 = p071f.p089f.p093b.p094j.C3200g.this
                int r3 = r3.f9199D0
                r6 = 3
                if (r3 != r6) goto L_0x0167
                boolean r3 = r12.mo10396B()
                if (r3 == 0) goto L_0x0167
                if (r14 == r12) goto L_0x0167
                boolean r3 = r14.mo10396B()
                if (r3 == 0) goto L_0x0167
                f.f.b.j.d r3 = r14.f9121B
                f.f.b.j.d r11 = r12.f9121B
                goto L_0x0195
            L_0x0167:
                f.f.b.j.g r3 = p071f.p089f.p093b.p094j.C3200g.this
                int r3 = r3.f9199D0
                if (r3 == 0) goto L_0x0191
                r11 = 1
                if (r3 == r11) goto L_0x018c
                f.f.b.j.d r3 = r14.f9173y
                if (r4 == 0) goto L_0x0187
                f.f.b.j.d r11 = r0.f9223e
                int r13 = r0.f9227i
                r3.mo10385a(r11, r13)
                f.f.b.j.d r3 = r14.f9120A
                f.f.b.j.d r11 = r0.f9225g
                int r13 = r0.f9229k
                r3.mo10385a(r11, r13)
                goto L_0x019a
            L_0x0187:
                f.f.b.j.d r11 = r9.f9173y
                r3.mo10385a(r11, r2)
            L_0x018c:
                f.f.b.j.d r3 = r14.f9120A
                f.f.b.j.d r11 = r9.f9120A
                goto L_0x0195
            L_0x0191:
                f.f.b.j.d r3 = r14.f9173y
                f.f.b.j.d r11 = r9.f9173y
            L_0x0195:
                r3.mo10385a(r11, r2)
                goto L_0x019a
            L_0x0199:
                r6 = 3
            L_0x019a:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00b1
            L_0x01a0:
                f.f.b.j.e r3 = r0.f9220b
                f.f.b.j.g r9 = p071f.p089f.p093b.p094j.C3200g.this
                int r9 = r9.f9208p0
                r3.mo10445i(r9)
                int r9 = r0.f9226h
                if (r18 <= 0) goto L_0x01b6
                f.f.b.j.g r10 = p071f.p089f.p093b.p094j.C3200g.this
                int r10 = r10.f9196A0
                int r9 = r9 + r10
            L_0x01b6:
                if (r17 == 0) goto L_0x01d5
                f.f.b.j.d r10 = r3.f9174z
                f.f.b.j.d r11 = r0.f9224f
                r10.mo10385a(r11, r9)
                if (r19 == 0) goto L_0x01ca
                f.f.b.j.d r9 = r3.f9172x
                f.f.b.j.d r10 = r0.f9222d
                int r11 = r0.f9228j
                r9.mo10385a(r10, r11)
            L_0x01ca:
                if (r18 <= 0) goto L_0x01f4
                f.f.b.j.d r9 = r0.f9224f
                f.f.b.j.e r9 = r9.f9102a
                f.f.b.j.d r9 = r9.f9172x
                f.f.b.j.d r10 = r3.f9174z
                goto L_0x01f1
            L_0x01d5:
                f.f.b.j.d r10 = r3.f9172x
                f.f.b.j.d r11 = r0.f9222d
                r10.mo10385a(r11, r9)
                if (r19 == 0) goto L_0x01e7
                f.f.b.j.d r9 = r3.f9174z
                f.f.b.j.d r10 = r0.f9224f
                int r11 = r0.f9228j
                r9.mo10385a(r10, r11)
            L_0x01e7:
                if (r18 <= 0) goto L_0x01f4
                f.f.b.j.d r9 = r0.f9222d
                f.f.b.j.e r9 = r9.f9102a
                f.f.b.j.d r9 = r9.f9174z
                f.f.b.j.d r10 = r3.f9172x
            L_0x01f1:
                r9.mo10385a(r10, r2)
            L_0x01f4:
                r9 = 0
            L_0x01f5:
                if (r9 >= r1) goto L_0x02e1
                f.f.b.j.g r10 = p071f.p089f.p093b.p094j.C3200g.this
                f.f.b.j.e[] r10 = r10.f9242e0
                int r11 = r0.f9232n
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r9 != 0) goto L_0x024c
                f.f.b.j.d r11 = r10.f9173y
                f.f.b.j.d r12 = r0.f9223e
                int r13 = r0.f9227i
                r10.mo10410a(r11, r12, r13)
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                int r11 = r11.f9208p0
                f.f.b.j.g r12 = p071f.p089f.p093b.p094j.C3200g.this
                float r12 = r12.f9214v0
                int r13 = r0.f9232n
                if (r13 != 0) goto L_0x0230
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                int r13 = r13.f9210r0
                if (r13 == r5) goto L_0x0230
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                int r11 = r11.f9210r0
                f.f.b.j.g r12 = p071f.p089f.p093b.p094j.C3200g.this
                float r12 = r12.f9216x0
                goto L_0x0246
            L_0x0230:
                if (r19 == 0) goto L_0x0246
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                int r13 = r13.f9212t0
                if (r13 == r5) goto L_0x0246
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                int r11 = r11.f9212t0
                f.f.b.j.g r12 = p071f.p089f.p093b.p094j.C3200g.this
                float r12 = r12.f9218z0
            L_0x0246:
                r10.mo10455n(r11)
                r10.mo10429c(r12)
            L_0x024c:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x0259
                f.f.b.j.d r11 = r10.f9120A
                f.f.b.j.d r12 = r0.f9225g
                int r13 = r0.f9229k
                r10.mo10410a(r11, r12, r13)
            L_0x0259:
                if (r6 == 0) goto L_0x0284
                f.f.b.j.d r11 = r10.f9173y
                f.f.b.j.d r12 = r6.f9120A
                f.f.b.j.g r13 = p071f.p089f.p093b.p094j.C3200g.this
                int r13 = r13.f9197B0
                r11.mo10385a(r12, r13)
                if (r9 != r7) goto L_0x0271
                f.f.b.j.d r11 = r10.f9173y
                int r12 = r0.f9227i
                r11.mo10382a(r12)
            L_0x0271:
                f.f.b.j.d r11 = r6.f9120A
                f.f.b.j.d r12 = r10.f9173y
                r11.mo10385a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x0284
                f.f.b.j.d r6 = r6.f9120A
                int r11 = r0.f9229k
                r6.mo10382a(r11)
            L_0x0284:
                if (r10 == r3) goto L_0x02db
                r6 = 2
                f.f.b.j.g r11 = p071f.p089f.p093b.p094j.C3200g.this
                int r11 = r11.f9198C0
                if (r17 == 0) goto L_0x02ac
                if (r11 == 0) goto L_0x02a4
                r12 = 1
                if (r11 == r12) goto L_0x029f
                if (r11 == r6) goto L_0x0297
                goto L_0x02db
            L_0x0297:
                f.f.b.j.d r6 = r10.f9172x
                f.f.b.j.d r11 = r3.f9172x
                r6.mo10385a(r11, r2)
                goto L_0x02a4
            L_0x029f:
                f.f.b.j.d r6 = r10.f9172x
                f.f.b.j.d r11 = r3.f9172x
                goto L_0x02a8
            L_0x02a4:
                f.f.b.j.d r6 = r10.f9174z
                f.f.b.j.d r11 = r3.f9174z
            L_0x02a8:
                r6.mo10385a(r11, r2)
                goto L_0x02db
            L_0x02ac:
                r12 = 1
                if (r11 == 0) goto L_0x02d3
                if (r11 == r12) goto L_0x02ce
                if (r11 == r6) goto L_0x02b4
                goto L_0x02dc
            L_0x02b4:
                f.f.b.j.d r6 = r10.f9172x
                if (r4 == 0) goto L_0x02c9
                f.f.b.j.d r11 = r0.f9222d
                int r13 = r0.f9226h
                r6.mo10385a(r11, r13)
                f.f.b.j.d r6 = r10.f9174z
                f.f.b.j.d r11 = r0.f9224f
                int r13 = r0.f9228j
                r6.mo10385a(r11, r13)
                goto L_0x02dc
            L_0x02c9:
                f.f.b.j.d r11 = r3.f9172x
                r6.mo10385a(r11, r2)
            L_0x02ce:
                f.f.b.j.d r6 = r10.f9174z
                f.f.b.j.d r11 = r3.f9174z
                goto L_0x02d7
            L_0x02d3:
                f.f.b.j.d r6 = r10.f9172x
                f.f.b.j.d r11 = r3.f9172x
            L_0x02d7:
                r6.mo10385a(r11, r2)
                goto L_0x02dc
            L_0x02db:
                r12 = 1
            L_0x02dc:
                int r9 = r9 + 1
                r6 = r10
                goto L_0x01f5
            L_0x02e1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3200g.C3201a.mo10517a(boolean, int, boolean):void");
        }

        /* renamed from: b */
        public int mo10518b() {
            return this.f9219a == 1 ? this.f9231m - C3200g.this.f9197B0 : this.f9231m;
        }

        /* renamed from: c */
        public int mo10519c() {
            return this.f9219a == 0 ? this.f9230l - C3200g.this.f9196A0 : this.f9230l;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
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
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* renamed from: a */
    private void m13086a(p071f.p089f.p093b.p094j.C3196e[] r12, int r13, int r14, int[] r15) {
        /*
            r11 = this;
            r0 = 0
            int r1 = r11.f9201F0
            if (r13 != 0) goto L_0x0028
            if (r1 > 0) goto L_0x0025
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000a:
            int r4 = r11.f9243f0
            if (r2 >= r4) goto L_0x0025
            if (r2 <= 0) goto L_0x0013
            int r4 = r11.f9196A0
            int r3 = r3 + r4
        L_0x0013:
            r4 = r12[r2]
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            int r4 = r11.m13094d(r4)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r1 = r1 + 1
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0025:
            r2 = r1
            r1 = 0
            goto L_0x0049
        L_0x0028:
            if (r1 > 0) goto L_0x0048
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x002d:
            int r4 = r11.f9243f0
            if (r2 >= r4) goto L_0x0048
            if (r2 <= 0) goto L_0x0036
            int r4 = r11.f9197B0
            int r3 = r3 + r4
        L_0x0036:
            r4 = r12[r2]
            if (r4 != 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            int r4 = r11.m13090c(r4)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            int r1 = r1 + 1
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x002d
        L_0x0048:
            r2 = 0
        L_0x0049:
            int[] r3 = r11.f9206K0
            if (r3 != 0) goto L_0x0052
            r3 = 2
            int[] r3 = new int[r3]
            r11.f9206K0 = r3
        L_0x0052:
            r3 = 1
            if (r1 != 0) goto L_0x0057
            if (r13 == r3) goto L_0x005b
        L_0x0057:
            if (r2 != 0) goto L_0x005d
            if (r13 != 0) goto L_0x005d
        L_0x005b:
            r4 = 1
            goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            if (r4 != 0) goto L_0x0127
            if (r13 != 0) goto L_0x006e
            int r1 = r11.f9243f0
            float r1 = (float) r1
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0079
        L_0x006e:
            int r2 = r11.f9243f0
            float r2 = (float) r2
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0079:
            f.f.b.j.e[] r5 = r11.f9205J0
            r6 = 0
            if (r5 == 0) goto L_0x0086
            int r7 = r5.length
            if (r7 >= r2) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            java.util.Arrays.fill(r5, r6)
            goto L_0x008a
        L_0x0086:
            f.f.b.j.e[] r5 = new p071f.p089f.p093b.p094j.C3196e[r2]
            r11.f9205J0 = r5
        L_0x008a:
            f.f.b.j.e[] r5 = r11.f9204I0
            if (r5 == 0) goto L_0x0096
            int r7 = r5.length
            if (r7 >= r1) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            java.util.Arrays.fill(r5, r6)
            goto L_0x009a
        L_0x0096:
            f.f.b.j.e[] r5 = new p071f.p089f.p093b.p094j.C3196e[r1]
            r11.f9204I0 = r5
        L_0x009a:
            r5 = 0
        L_0x009b:
            if (r5 >= r2) goto L_0x00e3
            r6 = 0
        L_0x009e:
            if (r6 >= r1) goto L_0x00e0
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a8
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a8:
            int r8 = r12.length
            if (r7 < r8) goto L_0x00ac
            goto L_0x00dd
        L_0x00ac:
            r7 = r12[r7]
            if (r7 != 0) goto L_0x00b1
            goto L_0x00dd
        L_0x00b1:
            int r8 = r11.m13094d(r7)
            f.f.b.j.e[] r9 = r11.f9205J0
            r10 = r9[r5]
            if (r10 == 0) goto L_0x00c3
            r9 = r9[r5]
            int r9 = r9.mo10471y()
            if (r9 >= r8) goto L_0x00c7
        L_0x00c3:
            f.f.b.j.e[] r8 = r11.f9205J0
            r8[r5] = r7
        L_0x00c7:
            int r8 = r11.m13090c(r7)
            f.f.b.j.e[] r9 = r11.f9204I0
            r10 = r9[r6]
            if (r10 == 0) goto L_0x00d9
            r9 = r9[r6]
            int r9 = r9.mo10444i()
            if (r9 >= r8) goto L_0x00dd
        L_0x00d9:
            f.f.b.j.e[] r8 = r11.f9204I0
            r8[r6] = r7
        L_0x00dd:
            int r6 = r6 + 1
            goto L_0x009e
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x009b
        L_0x00e3:
            r5 = 0
            r6 = 0
        L_0x00e5:
            if (r5 >= r2) goto L_0x00fa
            f.f.b.j.e[] r7 = r11.f9205J0
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00f7
            if (r5 <= 0) goto L_0x00f2
            int r8 = r11.f9196A0
            int r6 = r6 + r8
        L_0x00f2:
            int r7 = r11.m13094d(r7)
            int r6 = r6 + r7
        L_0x00f7:
            int r5 = r5 + 1
            goto L_0x00e5
        L_0x00fa:
            r5 = 0
            r7 = 0
        L_0x00fc:
            if (r5 >= r1) goto L_0x0111
            f.f.b.j.e[] r8 = r11.f9204I0
            r8 = r8[r5]
            if (r8 == 0) goto L_0x010e
            if (r5 <= 0) goto L_0x0109
            int r9 = r11.f9197B0
            int r7 = r7 + r9
        L_0x0109:
            int r8 = r11.m13090c(r8)
            int r7 = r7 + r8
        L_0x010e:
            int r5 = r5 + 1
            goto L_0x00fc
        L_0x0111:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x011f
            if (r6 <= r14) goto L_0x005b
            if (r2 <= r3) goto L_0x005b
            int r2 = r2 + -1
            goto L_0x005e
        L_0x011f:
            if (r7 <= r14) goto L_0x005b
            if (r1 <= r3) goto L_0x005b
            int r1 = r1 + -1
            goto L_0x005e
        L_0x0127:
            int[] r12 = r11.f9206K0
            r12[r0] = r2
            r12[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3200g.m13086a(f.f.b.j.e[], int, int, int[]):void");
    }

    /* renamed from: b */
    private void m13089b(C3196e[] eVarArr, int i, int i2, int[] iArr) {
        C3193d dVar;
        int i3;
        int i4;
        C3193d dVar2;
        int i5;
        C3193d dVar3;
        int i6 = i2;
        int i7 = this.f9243f0;
        if (i7 != 0) {
            this.f9203H0.clear();
            C3201a aVar = new C3201a(i, this.f9172x, this.f9173y, this.f9174z, this.f9120A);
            this.f9203H0.add(aVar);
            if (i == 0) {
                int i8 = this.f9196A0 * 2;
                for (int i9 = 0; i9 < i7; i9++) {
                    C3196e eVar = eVarArr[i9];
                    int d = m13094d(eVar);
                    boolean z = (i8 + d) + this.f9196A0 > i6 && aVar.f9220b != null;
                    if (!z && i9 > 0) {
                        int i10 = this.f9201F0;
                        if (i10 > 0 && i9 % i10 == 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        int i11 = this.f9196A0 * 2;
                        C3201a aVar2 = new C3201a(i, this.f9172x, this.f9173y, this.f9174z, this.f9120A);
                        aVar2.mo10514a(i9);
                        this.f9203H0.add(aVar2);
                        i8 = i11;
                        aVar = aVar2;
                    }
                    i8 += d + this.f9196A0;
                    aVar.mo10516a(eVar);
                }
            } else {
                int i12 = this.f9197B0 * 2;
                for (int i13 = 0; i13 < i7; i13++) {
                    C3196e eVar2 = eVarArr[i13];
                    int c = m13090c(eVar2);
                    boolean z2 = (i12 + c) + this.f9197B0 > i6 && aVar.f9220b != null;
                    if (!z2 && i13 > 0) {
                        int i14 = this.f9201F0;
                        if (i14 > 0 && i13 % i14 == 0) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        int i15 = this.f9197B0 * 2;
                        C3201a aVar3 = new C3201a(i, this.f9172x, this.f9173y, this.f9174z, this.f9120A);
                        aVar3.mo10514a(i13);
                        this.f9203H0.add(aVar3);
                        i12 = i15;
                        aVar = aVar3;
                    }
                    i12 += c;
                    aVar.mo10516a(eVar2);
                }
            }
            int size = this.f9203H0.size();
            C3193d dVar4 = this.f9172x;
            C3193d dVar5 = this.f9173y;
            C3193d dVar6 = this.f9174z;
            C3193d dVar7 = this.f9120A;
            int K = mo10532K();
            int M = mo10534M();
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            C3193d dVar8 = dVar4;
            C3193d dVar9 = dVar5;
            int L = mo10533L();
            int J = mo10531J();
            while (i18 < size) {
                C3201a aVar4 = (C3201a) this.f9203H0.get(i18);
                if (i == 0) {
                    if (i18 < size - 1) {
                        dVar3 = ((C3201a) this.f9203H0.get(i18 + 1)).f9220b.f9173y;
                        i5 = 0;
                    } else {
                        dVar3 = this.f9120A;
                        i5 = mo10531J();
                    }
                    C3193d dVar10 = dVar9;
                    C3193d dVar11 = dVar6;
                    C3193d dVar12 = dVar6;
                    int i19 = i16;
                    C3193d dVar13 = dVar3;
                    C3193d dVar14 = dVar3;
                    int i20 = i17;
                    dVar = aVar4.f9220b.f9120A;
                    i3 = i18;
                    aVar4.mo10515a(i, dVar8, dVar10, dVar11, dVar13, K, M, L, i5);
                    int max = Math.max(i20, aVar4.mo10519c());
                    i16 = i19 + aVar4.mo10518b();
                    if (i3 > 0) {
                        i16 += this.f9197B0;
                    }
                    dVar6 = dVar12;
                    i17 = max;
                    J = i5;
                    M = 0;
                    dVar7 = dVar14;
                } else {
                    int i21 = J;
                    C3193d dVar15 = dVar9;
                    int i22 = i16;
                    int i23 = i17;
                    i3 = i18;
                    if (i3 < size - 1) {
                        dVar2 = ((C3201a) this.f9203H0.get(i3 + 1)).f9220b.f9172x;
                        i4 = 0;
                    } else {
                        dVar2 = this.f9174z;
                        i4 = mo10533L();
                    }
                    dVar8 = aVar4.f9220b.f9174z;
                    aVar4.mo10515a(i, dVar8, dVar15, dVar2, dVar7, K, M, i4, i21);
                    i17 = i23 + aVar4.mo10519c();
                    int max2 = Math.max(i22, aVar4.mo10518b());
                    if (i3 > 0) {
                        i17 += this.f9196A0;
                    }
                    i16 = max2;
                    J = i21;
                    dVar6 = dVar2;
                    K = 0;
                    dVar = dVar15;
                    L = i4;
                }
                i18 = i3 + 1;
                dVar9 = dVar;
            }
            int i24 = i16;
            iArr[0] = i17;
            iArr[1] = i24;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final int m13090c(C3196e eVar) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo10468v() == C3198b.MATCH_CONSTRAINT && eVar.f9159k == 0) {
            return 0;
        }
        return eVar.mo10444i();
    }

    /* renamed from: c */
    private void m13092c(C3196e[] eVarArr, int i, int i2, int[] iArr) {
        C3201a aVar;
        int i3 = this.f9243f0;
        if (i3 != 0) {
            if (this.f9203H0.size() == 0) {
                aVar = new C3201a(i, this.f9172x, this.f9173y, this.f9174z, this.f9120A);
                this.f9203H0.add(aVar);
            } else {
                C3201a aVar2 = (C3201a) this.f9203H0.get(0);
                aVar2.mo10513a();
                aVar = aVar2;
                aVar.mo10515a(i, this.f9172x, this.f9173y, this.f9174z, this.f9120A, mo10532K(), mo10534M(), mo10533L(), mo10531J());
            }
            for (int i4 = 0; i4 < i3; i4++) {
                aVar.mo10516a(eVarArr[i4]);
            }
            iArr[0] = aVar.mo10519c();
            iArr[1] = aVar.mo10518b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m13094d(C3196e eVar) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.mo10450l() == C3198b.MATCH_CONSTRAINT && eVar.f9158j == 0) {
            return 0;
        }
        return eVar.mo10471y();
    }

    /* renamed from: e */
    private void m13096e(boolean z) {
        if (this.f9206K0 != null && this.f9205J0 != null && this.f9204I0 != null) {
            for (int i = 0; i < this.f9243f0; i++) {
                this.f9242e0[i].mo10400F();
            }
            int[] iArr = this.f9206K0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C3196e eVar = null;
            for (int i4 = 0; i4 < i2; i4++) {
                C3196e eVar2 = this.f9205J0[z ? (i2 - i4) - 1 : i4];
                if (eVar2 != null) {
                    if (i4 == 0) {
                        eVar2.mo10410a(eVar2.f9172x, this.f9172x, mo10532K());
                        eVar2.mo10445i(this.f9207o0);
                        eVar2.mo10403a(this.f9213u0);
                    }
                    if (i4 == i2 - 1) {
                        eVar2.mo10410a(eVar2.f9174z, this.f9174z, mo10533L());
                    }
                    if (i4 > 0) {
                        eVar2.mo10410a(eVar2.f9172x, eVar.f9174z, this.f9196A0);
                        eVar.mo10410a(eVar.f9174z, eVar2.f9172x, 0);
                    }
                    eVar = eVar2;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                C3196e eVar3 = this.f9204I0[i5];
                if (eVar3 != null) {
                    if (i5 == 0) {
                        eVar3.mo10410a(eVar3.f9173y, this.f9173y, mo10534M());
                        eVar3.mo10455n(this.f9208p0);
                        eVar3.mo10429c(this.f9214v0);
                    }
                    if (i5 == i3 - 1) {
                        eVar3.mo10410a(eVar3.f9120A, this.f9120A, mo10531J());
                    }
                    if (i5 > 0) {
                        eVar3.mo10410a(eVar3.f9173y, eVar.f9120A, this.f9197B0);
                        eVar.mo10410a(eVar.f9120A, eVar3.f9173y, 0);
                    }
                    eVar = eVar3;
                }
            }
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i7 * i2) + i6;
                    if (this.f9202G0 == 1) {
                        i8 = (i6 * i3) + i7;
                    }
                    C3196e[] eVarArr = this.f9242e0;
                    if (i8 < eVarArr.length) {
                        C3196e eVar4 = eVarArr[i8];
                        if (eVar4 != null) {
                            C3196e eVar5 = this.f9205J0[i6];
                            C3196e eVar6 = this.f9204I0[i7];
                            if (eVar4 != eVar5) {
                                eVar4.mo10410a(eVar4.f9172x, eVar5.f9172x, 0);
                                eVar4.mo10410a(eVar4.f9174z, eVar5.f9174z, 0);
                            }
                            if (eVar4 != eVar6) {
                                eVar4.mo10410a(eVar4.f9173y, eVar6.f9173y, 0);
                                eVar4.mo10410a(eVar4.f9120A, eVar6.f9120A, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public void mo10493A(int i) {
        this.f9196A0 = i;
    }

    /* renamed from: B */
    public void mo10494B(int i) {
        this.f9207o0 = i;
    }

    /* renamed from: C */
    public void mo10495C(int i) {
        this.f9211s0 = i;
    }

    /* renamed from: D */
    public void mo10496D(int i) {
        this.f9212t0 = i;
    }

    /* renamed from: E */
    public void mo10497E(int i) {
        this.f9201F0 = i;
    }

    /* renamed from: F */
    public void mo10498F(int i) {
        this.f9202G0 = i;
    }

    /* renamed from: G */
    public void mo10499G(int i) {
        this.f9199D0 = i;
    }

    /* renamed from: H */
    public void mo10500H(int i) {
        this.f9197B0 = i;
    }

    /* renamed from: I */
    public void mo10501I(int i) {
        this.f9208p0 = i;
    }

    /* renamed from: J */
    public void mo10502J(int i) {
        this.f9200E0 = i;
    }

    /* renamed from: a */
    public void mo10375a(C3183e eVar) {
        super.mo10375a(eVar);
        boolean P = mo10462r() != null ? ((C3199f) mo10462r()).mo10480P() : false;
        int i = this.f9200E0;
        if (i != 0) {
            if (i == 1) {
                int size = this.f9203H0.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C3201a) this.f9203H0.get(i2)).mo10517a(P, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                m13096e(P);
            }
        } else if (this.f9203H0.size() > 0) {
            ((C3201a) this.f9203H0.get(0)).mo10517a(P, 0, true);
        }
        mo10538d(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r11.f9208p0 == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r11.f9208p0 == -1) goto L_0x004a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10503b(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.f9243f0
            r1 = 0
            if (r0 <= 0) goto L_0x0012
            boolean r0 = r11.mo10535N()
            if (r0 != 0) goto L_0x0012
            r11.mo10537d(r1, r1)
            r11.mo10538d(r1)
            return
        L_0x0012:
            int r0 = r11.mo10532K()
            int r2 = r11.mo10533L()
            int r3 = r11.mo10534M()
            int r4 = r11.mo10531J()
            r5 = 2
            int[] r6 = new int[r5]
            int r7 = r13 - r0
            int r7 = r7 - r2
            int r8 = r11.f9202G0
            r9 = 1
            if (r8 != r9) goto L_0x0030
            int r7 = r15 - r3
            int r7 = r7 - r4
        L_0x0030:
            int r8 = r11.f9202G0
            r10 = -1
            if (r8 != 0) goto L_0x0040
            int r8 = r11.f9207o0
            if (r8 != r10) goto L_0x003b
            r11.f9207o0 = r1
        L_0x003b:
            int r8 = r11.f9208p0
            if (r8 != r10) goto L_0x004c
            goto L_0x004a
        L_0x0040:
            int r8 = r11.f9207o0
            if (r8 != r10) goto L_0x0046
            r11.f9207o0 = r1
        L_0x0046:
            int r8 = r11.f9208p0
            if (r8 != r10) goto L_0x004c
        L_0x004a:
            r11.f9208p0 = r1
        L_0x004c:
            int r8 = r11.f9200E0
            if (r8 == 0) goto L_0x0065
            if (r8 == r9) goto L_0x005d
            if (r8 == r5) goto L_0x0055
            goto L_0x006c
        L_0x0055:
            f.f.b.j.e[] r5 = r11.f9242e0
            int r8 = r11.f9202G0
            r11.m13086a(r5, r8, r7, r6)
            goto L_0x006c
        L_0x005d:
            f.f.b.j.e[] r5 = r11.f9242e0
            int r8 = r11.f9202G0
            r11.m13089b(r5, r8, r7, r6)
            goto L_0x006c
        L_0x0065:
            f.f.b.j.e[] r5 = r11.f9242e0
            int r8 = r11.f9202G0
            r11.m13092c(r5, r8, r7, r6)
        L_0x006c:
            r5 = r6[r1]
            int r5 = r5 + r0
            int r5 = r5 + r2
            r0 = r6[r9]
            int r0 = r0 + r3
            int r0 = r0 + r4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 != r3) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            if (r12 != r2) goto L_0x0082
            int r13 = java.lang.Math.min(r5, r13)
            goto L_0x0087
        L_0x0082:
            if (r12 != 0) goto L_0x0086
            r13 = r5
            goto L_0x0087
        L_0x0086:
            r13 = 0
        L_0x0087:
            if (r14 != r3) goto L_0x008a
            goto L_0x0096
        L_0x008a:
            if (r14 != r2) goto L_0x0091
            int r15 = java.lang.Math.min(r0, r15)
            goto L_0x0096
        L_0x0091:
            if (r14 != 0) goto L_0x0095
            r15 = r0
            goto L_0x0096
        L_0x0095:
            r15 = 0
        L_0x0096:
            r11.mo10537d(r13, r15)
            int r12 = r11.f9243f0
            if (r12 <= 0) goto L_0x009e
            r1 = 1
        L_0x009e:
            r11.mo10538d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3200g.mo10503b(int, int, int, int):void");
    }

    /* renamed from: e */
    public void mo10504e(float f) {
        this.f9215w0 = f;
    }

    /* renamed from: f */
    public void mo10505f(float f) {
        this.f9216x0 = f;
    }

    /* renamed from: g */
    public void mo10506g(float f) {
        this.f9213u0 = f;
    }

    /* renamed from: h */
    public void mo10507h(float f) {
        this.f9217y0 = f;
    }

    /* renamed from: i */
    public void mo10508i(float f) {
        this.f9218z0 = f;
    }

    /* renamed from: j */
    public void mo10509j(float f) {
        this.f9214v0 = f;
    }

    /* renamed from: x */
    public void mo10510x(int i) {
        this.f9209q0 = i;
    }

    /* renamed from: y */
    public void mo10511y(int i) {
        this.f9210r0 = i;
    }

    /* renamed from: z */
    public void mo10512z(int i) {
        this.f9198C0 = i;
    }
}
