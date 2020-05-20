package p071f.p089f.p093b.p094j;

/* renamed from: f.f.b.j.a */
public class C3190a extends C3205j {

    /* renamed from: g0 */
    private int f9079g0 = 0;

    /* renamed from: h0 */
    private boolean f9080h0 = true;

    /* renamed from: i0 */
    private int f9081i0 = 0;

    /* renamed from: G */
    public boolean mo10372G() {
        return this.f9080h0;
    }

    /* renamed from: H */
    public int mo10373H() {
        return this.f9079g0;
    }

    /* renamed from: I */
    public int mo10374I() {
        return this.f9081i0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10375a(p071f.p089f.p093b.C3183e r12) {
        /*
            r11 = this;
            f.f.b.j.d[] r0 = r11.f9125F
            f.f.b.j.d r1 = r11.f9172x
            r2 = 0
            r0[r2] = r1
            f.f.b.j.d r1 = r11.f9173y
            r3 = 2
            r0[r3] = r1
            f.f.b.j.d r1 = r11.f9174z
            r4 = 1
            r0[r4] = r1
            f.f.b.j.d r1 = r11.f9120A
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L_0x0017:
            f.f.b.j.d[] r1 = r11.f9125F
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            f.f.b.i r1 = r12.mo10345a(r1)
            r6.f9107f = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r11.f9079g0
            if (r0 < 0) goto L_0x012f
            r6 = 4
            if (r0 >= r6) goto L_0x012f
            r0 = r1[r0]
            r1 = 0
        L_0x0033:
            int r7 = r11.f9243f0
            if (r1 >= r7) goto L_0x0068
            f.f.b.j.e[] r7 = r11.f9242e0
            r7 = r7[r1]
            boolean r8 = r11.f9080h0
            if (r8 != 0) goto L_0x0046
            boolean r8 = r7.mo10376b()
            if (r8 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r8 = r11.f9079g0
            if (r8 == 0) goto L_0x004c
            if (r8 != r4) goto L_0x0056
        L_0x004c:
            f.f.b.j.e$b r8 = r7.mo10450l()
            f.f.b.j.e$b r9 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0069
        L_0x0056:
            int r8 = r11.f9079g0
            if (r8 == r3) goto L_0x005c
            if (r8 != r5) goto L_0x0065
        L_0x005c:
            f.f.b.j.e$b r7 = r7.mo10468v()
            f.f.b.j.e$b r8 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r7 = r11.f9079g0
            if (r7 == 0) goto L_0x007d
            if (r7 != r4) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            f.f.b.j.e r7 = r11.mo10462r()
            f.f.b.j.e$b r7 = r7.mo10468v()
            f.f.b.j.e$b r8 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r7 != r8) goto L_0x008a
            goto L_0x0089
        L_0x007d:
            f.f.b.j.e r7 = r11.mo10462r()
            f.f.b.j.e$b r7 = r7.mo10450l()
            f.f.b.j.e$b r8 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            if (r7 != r8) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r7 = 0
        L_0x008b:
            int r8 = r11.f9243f0
            if (r7 >= r8) goto L_0x00c7
            f.f.b.j.e[] r8 = r11.f9242e0
            r8 = r8[r7]
            boolean r9 = r11.f9080h0
            if (r9 != 0) goto L_0x009e
            boolean r9 = r8.mo10376b()
            if (r9 != 0) goto L_0x009e
            goto L_0x00c4
        L_0x009e:
            f.f.b.j.d[] r9 = r8.f9125F
            int r10 = r11.f9079g0
            r9 = r9[r10]
            f.f.b.i r9 = r12.mo10345a(r9)
            f.f.b.j.d[] r8 = r8.f9125F
            int r10 = r11.f9079g0
            r8 = r8[r10]
            r8.f9107f = r9
            if (r10 == 0) goto L_0x00bd
            if (r10 != r3) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            f.f.b.i r8 = r0.f9107f
            int r10 = r11.f9081i0
            r12.mo10351a(r8, r9, r10, r1)
            goto L_0x00c4
        L_0x00bd:
            f.f.b.i r8 = r0.f9107f
            int r10 = r11.f9081i0
            r12.mo10357b(r8, r9, r10, r1)
        L_0x00c4:
            int r7 = r7 + 1
            goto L_0x008b
        L_0x00c7:
            int r0 = r11.f9079g0
            r7 = 6
            if (r0 != 0) goto L_0x00e7
            f.f.b.j.d r0 = r11.f9174z
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.d r3 = r11.f9172x
            f.f.b.i r3 = r3.f9107f
            r12.mo10342a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012f
            f.f.b.j.d r0 = r11.f9172x
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.e r1 = r11.f9128I
            f.f.b.j.d r1 = r1.f9174z
        L_0x00e1:
            f.f.b.i r1 = r1.f9107f
            r12.mo10342a(r0, r1, r2, r6)
            goto L_0x012f
        L_0x00e7:
            if (r0 != r4) goto L_0x00ff
            f.f.b.j.d r0 = r11.f9172x
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.d r3 = r11.f9174z
            f.f.b.i r3 = r3.f9107f
            r12.mo10342a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012f
            f.f.b.j.d r0 = r11.f9172x
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.e r1 = r11.f9128I
            f.f.b.j.d r1 = r1.f9172x
            goto L_0x00e1
        L_0x00ff:
            if (r0 != r3) goto L_0x0117
            f.f.b.j.d r0 = r11.f9120A
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.d r3 = r11.f9173y
            f.f.b.i r3 = r3.f9107f
            r12.mo10342a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012f
            f.f.b.j.d r0 = r11.f9173y
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.e r1 = r11.f9128I
            f.f.b.j.d r1 = r1.f9120A
            goto L_0x00e1
        L_0x0117:
            if (r0 != r5) goto L_0x012f
            f.f.b.j.d r0 = r11.f9173y
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.d r3 = r11.f9120A
            f.f.b.i r3 = r3.f9107f
            r12.mo10342a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x012f
            f.f.b.j.d r0 = r11.f9173y
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.e r1 = r11.f9128I
            f.f.b.j.d r1 = r1.f9173y
            goto L_0x00e1
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3190a.mo10375a(f.f.b.e):void");
    }

    /* renamed from: b */
    public boolean mo10376b() {
        return true;
    }

    /* renamed from: d */
    public void mo10377d(boolean z) {
        this.f9080h0 = z;
    }

    /* renamed from: s */
    public void mo10378s(int i) {
        this.f9079g0 = i;
    }

    /* renamed from: t */
    public void mo10379t(int i) {
        this.f9081i0 = i;
    }
}
