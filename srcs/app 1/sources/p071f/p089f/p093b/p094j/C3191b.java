package p071f.p089f.p093b.p094j;

import p071f.p089f.p093b.C3183e;

/* renamed from: f.f.b.j.b */
class C3191b {
    /* renamed from: a */
    static void m12958a(C3199f fVar, C3183e eVar, int i) {
        C3192c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = fVar.f9189m0;
            cVarArr = fVar.f9192p0;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = fVar.f9190n0;
            cVarArr = fVar.f9191o0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C3192c cVar = cVarArr[i5];
            cVar.mo10380a();
            m12959a(fVar, eVar, i, i3, cVar);
        }
    }

    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r21v1 */
    /* JADX WARNING: type inference failed for: r4v11, types: [f.f.b.i] */
    /* JADX WARNING: type inference failed for: r21v2 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13, types: [f.f.b.i] */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f9144Y == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f9145Z == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x03bf A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m12959a(p071f.p089f.p093b.p094j.C3199f r37, p071f.p089f.p093b.C3183e r38, int r39, int r40, p071f.p089f.p093b.p094j.C3192c r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            f.f.b.j.e r10 = r1.f9082a
            f.f.b.j.e r11 = r1.f9084c
            f.f.b.j.e r12 = r1.f9083b
            f.f.b.j.e r13 = r1.f9085d
            f.f.b.j.e r2 = r1.f9086e
            float r3 = r1.f9092k
            f.f.b.j.e r4 = r1.f9087f
            f.f.b.j.e r4 = r1.f9088g
            f.f.b.j.e$b[] r4 = r0.f9127H
            r4 = r4[r39]
            f.f.b.j.e$b r5 = p071f.p089f.p093b.p094j.C3196e.C3198b.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r39 != 0) goto L_0x0038
            int r8 = r2.f9144Y
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f9144Y
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f9144Y
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f9145Z
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f9145Z
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f9145Z
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r7 = r10
            r15 = r14
            r14 = r8
            r8 = 0
        L_0x0051:
            r21 = 0
            if (r8 != 0) goto L_0x0143
            f.f.b.j.d[] r6 = r7.f9125F
            r6 = r6[r40]
            if (r4 != 0) goto L_0x0061
            if (r5 == 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            r23 = 4
            goto L_0x0063
        L_0x0061:
            r23 = 1
        L_0x0063:
            int r24 = r6.mo10381a()
            r25 = r3
            f.f.b.j.e$b[] r3 = r7.f9127H
            r3 = r3[r39]
            r26 = r8
            f.f.b.j.e$b r8 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x007b
            int[] r3 = r7.f9160l
            r3 = r3[r39]
            if (r3 != 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            f.f.b.j.d r8 = r6.f9104c
            if (r8 == 0) goto L_0x0088
            if (r7 == r10) goto L_0x0088
            int r8 = r8.mo10381a()
            int r24 = r24 + r8
        L_0x0088:
            r8 = r24
            if (r5 == 0) goto L_0x0095
            if (r7 == r10) goto L_0x0095
            if (r7 == r12) goto L_0x0095
            r23 = r15
            r22 = 6
            goto L_0x00a2
        L_0x0095:
            if (r14 == 0) goto L_0x009e
            if (r4 == 0) goto L_0x009e
            r23 = r15
            r22 = 4
            goto L_0x00a2
        L_0x009e:
            r22 = r23
            r23 = r15
        L_0x00a2:
            f.f.b.j.d r15 = r6.f9104c
            if (r15 == 0) goto L_0x00d9
            if (r7 != r12) goto L_0x00b5
            r24 = r14
            f.f.b.i r14 = r6.f9107f
            f.f.b.i r15 = r15.f9107f
            r27 = r2
            r2 = 5
            r9.mo10356b(r14, r15, r8, r2)
            goto L_0x00c1
        L_0x00b5:
            r27 = r2
            r24 = r14
            f.f.b.i r2 = r6.f9107f
            f.f.b.i r14 = r15.f9107f
            r15 = 6
            r9.mo10356b(r2, r14, r8, r15)
        L_0x00c1:
            if (r3 == 0) goto L_0x00cd
            if (r5 != 0) goto L_0x00cd
            f.f.b.j.d r2 = r6.f9104c
            f.f.b.j.e r2 = r2.f9102a
            if (r2 != r0) goto L_0x00cd
            r2 = 5
            goto L_0x00cf
        L_0x00cd:
            r2 = r22
        L_0x00cf:
            f.f.b.i r3 = r6.f9107f
            f.f.b.j.d r6 = r6.f9104c
            f.f.b.i r6 = r6.f9107f
            r9.mo10342a(r3, r6, r8, r2)
            goto L_0x00dd
        L_0x00d9:
            r27 = r2
            r24 = r14
        L_0x00dd:
            if (r4 == 0) goto L_0x0112
            int r2 = r7.mo10470x()
            r3 = 8
            if (r2 == r3) goto L_0x0101
            f.f.b.j.e$b[] r2 = r7.f9127H
            r2 = r2[r39]
            f.f.b.j.e$b r3 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x0101
            f.f.b.j.d[] r2 = r7.f9125F
            int r3 = r40 + 1
            r3 = r2[r3]
            f.f.b.i r3 = r3.f9107f
            r2 = r2[r40]
            f.f.b.i r2 = r2.f9107f
            r6 = 5
            r8 = 0
            r9.mo10356b(r3, r2, r8, r6)
            goto L_0x0102
        L_0x0101:
            r8 = 0
        L_0x0102:
            f.f.b.j.d[] r2 = r7.f9125F
            r2 = r2[r40]
            f.f.b.i r2 = r2.f9107f
            f.f.b.j.d[] r3 = r0.f9125F
            r3 = r3[r40]
            f.f.b.i r3 = r3.f9107f
            r6 = 6
            r9.mo10356b(r2, r3, r8, r6)
        L_0x0112:
            f.f.b.j.d[] r2 = r7.f9125F
            int r3 = r40 + 1
            r2 = r2[r3]
            f.f.b.j.d r2 = r2.f9104c
            if (r2 == 0) goto L_0x0131
            f.f.b.j.e r2 = r2.f9102a
            f.f.b.j.d[] r3 = r2.f9125F
            r6 = r3[r40]
            f.f.b.j.d r6 = r6.f9104c
            if (r6 == 0) goto L_0x0131
            r3 = r3[r40]
            f.f.b.j.d r3 = r3.f9104c
            f.f.b.j.e r3 = r3.f9102a
            if (r3 == r7) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r21 = r2
        L_0x0131:
            if (r21 == 0) goto L_0x0138
            r7 = r21
            r8 = r26
            goto L_0x0139
        L_0x0138:
            r8 = 1
        L_0x0139:
            r15 = r23
            r14 = r24
            r3 = r25
            r2 = r27
            goto L_0x0051
        L_0x0143:
            r27 = r2
            r25 = r3
            r24 = r14
            r23 = r15
            if (r13 == 0) goto L_0x01a9
            f.f.b.j.d[] r2 = r11.f9125F
            int r3 = r40 + 1
            r2 = r2[r3]
            f.f.b.j.d r2 = r2.f9104c
            if (r2 == 0) goto L_0x01a9
            f.f.b.j.d[] r2 = r13.f9125F
            r2 = r2[r3]
            f.f.b.j.e$b[] r6 = r13.f9127H
            r6 = r6[r39]
            f.f.b.j.e$b r7 = p071f.p089f.p093b.p094j.C3196e.C3198b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x016b
            int[] r6 = r13.f9160l
            r6 = r6[r39]
            if (r6 != 0) goto L_0x016b
            r6 = 1
            goto L_0x016c
        L_0x016b:
            r6 = 0
        L_0x016c:
            if (r6 == 0) goto L_0x0181
            if (r5 != 0) goto L_0x0181
            f.f.b.j.d r6 = r2.f9104c
            f.f.b.j.e r7 = r6.f9102a
            if (r7 != r0) goto L_0x0181
            f.f.b.i r7 = r2.f9107f
            f.f.b.i r6 = r6.f9107f
            int r8 = r2.mo10381a()
            int r8 = -r8
            r14 = 5
            goto L_0x0193
        L_0x0181:
            if (r5 == 0) goto L_0x0196
            f.f.b.j.d r6 = r2.f9104c
            f.f.b.j.e r7 = r6.f9102a
            if (r7 != r0) goto L_0x0196
            f.f.b.i r7 = r2.f9107f
            f.f.b.i r6 = r6.f9107f
            int r8 = r2.mo10381a()
            int r8 = -r8
            r14 = 4
        L_0x0193:
            r9.mo10342a(r7, r6, r8, r14)
        L_0x0196:
            f.f.b.i r6 = r2.f9107f
            f.f.b.j.d[] r7 = r11.f9125F
            r3 = r7[r3]
            f.f.b.j.d r3 = r3.f9104c
            f.f.b.i r3 = r3.f9107f
            int r2 = r2.mo10381a()
            int r2 = -r2
            r7 = 5
            r9.mo10359c(r6, r3, r2, r7)
        L_0x01a9:
            if (r4 == 0) goto L_0x01c3
            f.f.b.j.d[] r0 = r0.f9125F
            int r2 = r40 + 1
            r0 = r0[r2]
            f.f.b.i r0 = r0.f9107f
            f.f.b.j.d[] r3 = r11.f9125F
            r4 = r3[r2]
            f.f.b.i r4 = r4.f9107f
            r2 = r3[r2]
            int r2 = r2.mo10381a()
            r3 = 6
            r9.mo10356b(r0, r4, r2, r3)
        L_0x01c3:
            java.util.ArrayList<f.f.b.j.e> r0 = r1.f9089h
            if (r0 == 0) goto L_0x0271
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0271
            boolean r4 = r1.f9098q
            if (r4 == 0) goto L_0x01da
            boolean r4 = r1.f9100s
            if (r4 != 0) goto L_0x01da
            int r4 = r1.f9091j
            float r4 = (float) r4
            goto L_0x01dc
        L_0x01da:
            r4 = r25
        L_0x01dc:
            r6 = 0
            r7 = r21
            r8 = 0
            r29 = 0
        L_0x01e2:
            if (r8 >= r2) goto L_0x0271
            java.lang.Object r14 = r0.get(r8)
            f.f.b.j.e r14 = (p071f.p089f.p093b.p094j.C3196e) r14
            float[] r15 = r14.f9147a0
            r15 = r15[r39]
            int r16 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x020d
            boolean r15 = r1.f9100s
            if (r15 == 0) goto L_0x0209
            f.f.b.j.d[] r14 = r14.f9125F
            int r15 = r40 + 1
            r15 = r14[r15]
            f.f.b.i r15 = r15.f9107f
            r14 = r14[r40]
            f.f.b.i r14 = r14.f9107f
            r3 = 0
            r6 = 4
            r9.mo10342a(r15, r14, r3, r6)
            r6 = 6
            goto L_0x0224
        L_0x0209:
            r6 = 4
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x020e
        L_0x020d:
            r6 = 4
        L_0x020e:
            r3 = 0
            int r19 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r19 != 0) goto L_0x0229
            f.f.b.j.d[] r14 = r14.f9125F
            int r15 = r40 + 1
            r15 = r14[r15]
            f.f.b.i r15 = r15.f9107f
            r14 = r14[r40]
            f.f.b.i r14 = r14.f9107f
            r3 = 0
            r6 = 6
            r9.mo10342a(r15, r14, r3, r6)
        L_0x0224:
            r25 = r0
            r19 = r2
            goto L_0x0267
        L_0x0229:
            r3 = 0
            r6 = 6
            if (r7 == 0) goto L_0x0260
            f.f.b.j.d[] r7 = r7.f9125F
            r3 = r7[r40]
            f.f.b.i r3 = r3.f9107f
            int r19 = r40 + 1
            r7 = r7[r19]
            f.f.b.i r7 = r7.f9107f
            f.f.b.j.d[] r6 = r14.f9125F
            r25 = r0
            r0 = r6[r40]
            f.f.b.i r0 = r0.f9107f
            r6 = r6[r19]
            f.f.b.i r6 = r6.f9107f
            r19 = r2
            f.f.b.b r2 = r38.mo10355b()
            r28 = r2
            r30 = r4
            r31 = r15
            r32 = r3
            r33 = r7
            r34 = r0
            r35 = r6
            r28.mo10315a(r29, r30, r31, r32, r33, r34, r35)
            r9.mo10346a(r2)
            goto L_0x0264
        L_0x0260:
            r25 = r0
            r19 = r2
        L_0x0264:
            r7 = r14
            r29 = r15
        L_0x0267:
            int r8 = r8 + 1
            r2 = r19
            r0 = r25
            r3 = 1
            r6 = 0
            goto L_0x01e2
        L_0x0271:
            if (r12 == 0) goto L_0x02d1
            if (r12 == r13) goto L_0x0277
            if (r5 == 0) goto L_0x02d1
        L_0x0277:
            f.f.b.j.d[] r0 = r10.f9125F
            r1 = r0[r40]
            f.f.b.j.d[] r2 = r11.f9125F
            int r3 = r40 + 1
            r2 = r2[r3]
            r4 = r0[r40]
            f.f.b.j.d r4 = r4.f9104c
            if (r4 == 0) goto L_0x028f
            r0 = r0[r40]
            f.f.b.j.d r0 = r0.f9104c
            f.f.b.i r0 = r0.f9107f
            r4 = r0
            goto L_0x0291
        L_0x028f:
            r4 = r21
        L_0x0291:
            f.f.b.j.d[] r0 = r11.f9125F
            r5 = r0[r3]
            f.f.b.j.d r5 = r5.f9104c
            if (r5 == 0) goto L_0x02a1
            r0 = r0[r3]
            f.f.b.j.d r0 = r0.f9104c
            f.f.b.i r0 = r0.f9107f
            r5 = r0
            goto L_0x02a3
        L_0x02a1:
            r5 = r21
        L_0x02a3:
            if (r12 != r13) goto L_0x02ab
            f.f.b.j.d[] r0 = r12.f9125F
            r1 = r0[r40]
            r2 = r0[r3]
        L_0x02ab:
            if (r4 == 0) goto L_0x04ec
            if (r5 == 0) goto L_0x04ec
            r0 = r27
            if (r39 != 0) goto L_0x02b6
            float r0 = r0.f9138S
            goto L_0x02b8
        L_0x02b6:
            float r0 = r0.f9139T
        L_0x02b8:
            r6 = r0
            int r3 = r1.mo10381a()
            int r7 = r2.mo10381a()
            f.f.b.i r1 = r1.f9107f
            f.f.b.i r8 = r2.f9107f
            r10 = 5
            r0 = r38
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo10350a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04ec
        L_0x02d1:
            if (r24 == 0) goto L_0x03c3
            if (r12 == 0) goto L_0x03c3
            int r0 = r1.f9091j
            if (r0 <= 0) goto L_0x02e0
            int r1 = r1.f9090i
            if (r1 != r0) goto L_0x02e0
            r16 = 1
            goto L_0x02e2
        L_0x02e0:
            r16 = 0
        L_0x02e2:
            r14 = r12
            r15 = r14
        L_0x02e4:
            if (r14 == 0) goto L_0x04ec
            f.f.b.j.e[] r0 = r14.f9151c0
            r0 = r0[r39]
            r8 = r0
        L_0x02eb:
            if (r8 == 0) goto L_0x02fa
            int r0 = r8.mo10470x()
            r6 = 8
            if (r0 != r6) goto L_0x02fc
            f.f.b.j.e[] r0 = r8.f9151c0
            r8 = r0[r39]
            goto L_0x02eb
        L_0x02fa:
            r6 = 8
        L_0x02fc:
            if (r8 != 0) goto L_0x0307
            if (r14 != r13) goto L_0x0301
            goto L_0x0307
        L_0x0301:
            r17 = r8
            r18 = 6
            goto L_0x03b6
        L_0x0307:
            f.f.b.j.d[] r0 = r14.f9125F
            r0 = r0[r40]
            f.f.b.i r1 = r0.f9107f
            f.f.b.j.d r2 = r0.f9104c
            if (r2 == 0) goto L_0x0314
            f.f.b.i r2 = r2.f9107f
            goto L_0x0316
        L_0x0314:
            r2 = r21
        L_0x0316:
            if (r15 == r14) goto L_0x0321
            f.f.b.j.d[] r2 = r15.f9125F
            int r3 = r40 + 1
            r2 = r2[r3]
        L_0x031e:
            f.f.b.i r2 = r2.f9107f
            goto L_0x0334
        L_0x0321:
            if (r14 != r12) goto L_0x0334
            if (r15 != r14) goto L_0x0334
            f.f.b.j.d[] r2 = r10.f9125F
            r3 = r2[r40]
            f.f.b.j.d r3 = r3.f9104c
            if (r3 == 0) goto L_0x0332
            r2 = r2[r40]
            f.f.b.j.d r2 = r2.f9104c
            goto L_0x031e
        L_0x0332:
            r2 = r21
        L_0x0334:
            int r0 = r0.mo10381a()
            f.f.b.j.d[] r3 = r14.f9125F
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.mo10381a()
            if (r8 == 0) goto L_0x0356
            f.f.b.j.d[] r5 = r8.f9125F
            r5 = r5[r40]
            f.f.b.i r7 = r5.f9107f
            f.f.b.j.d[] r6 = r14.f9125F
            r6 = r6[r4]
            f.f.b.i r6 = r6.f9107f
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0369
        L_0x0356:
            f.f.b.j.d[] r5 = r11.f9125F
            r5 = r5[r4]
            f.f.b.j.d r5 = r5.f9104c
            if (r5 == 0) goto L_0x0361
            f.f.b.i r6 = r5.f9107f
            goto L_0x0363
        L_0x0361:
            r6 = r21
        L_0x0363:
            f.f.b.j.d[] r7 = r14.f9125F
            r7 = r7[r4]
            f.f.b.i r7 = r7.f9107f
        L_0x0369:
            if (r5 == 0) goto L_0x0370
            int r5 = r5.mo10381a()
            int r3 = r3 + r5
        L_0x0370:
            if (r15 == 0) goto L_0x037b
            f.f.b.j.d[] r5 = r15.f9125F
            r5 = r5[r4]
            int r5 = r5.mo10381a()
            int r0 = r0 + r5
        L_0x037b:
            if (r1 == 0) goto L_0x0301
            if (r2 == 0) goto L_0x0301
            if (r6 == 0) goto L_0x0301
            if (r7 == 0) goto L_0x0301
            if (r14 != r12) goto L_0x038d
            f.f.b.j.d[] r0 = r12.f9125F
            r0 = r0[r40]
            int r0 = r0.mo10381a()
        L_0x038d:
            r5 = r0
            if (r14 != r13) goto L_0x039b
            f.f.b.j.d[] r0 = r13.f9125F
            r0 = r0[r4]
            int r0 = r0.mo10381a()
            r17 = r0
            goto L_0x039d
        L_0x039b:
            r17 = r3
        L_0x039d:
            if (r16 == 0) goto L_0x03a2
            r19 = 6
            goto L_0x03a4
        L_0x03a2:
            r19 = 4
        L_0x03a4:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r18 = 6
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r19
            r0.mo10350a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x03b6:
            int r0 = r14.mo10470x()
            r8 = 8
            if (r0 == r8) goto L_0x03bf
            r15 = r14
        L_0x03bf:
            r14 = r17
            goto L_0x02e4
        L_0x03c3:
            r8 = 8
            r18 = 6
            if (r23 == 0) goto L_0x04ec
            if (r12 == 0) goto L_0x04ec
            int r0 = r1.f9091j
            if (r0 <= 0) goto L_0x03d6
            int r1 = r1.f9090i
            if (r1 != r0) goto L_0x03d6
            r16 = 1
            goto L_0x03d8
        L_0x03d6:
            r16 = 0
        L_0x03d8:
            r14 = r12
            r15 = r14
        L_0x03da:
            if (r14 == 0) goto L_0x048e
            f.f.b.j.e[] r0 = r14.f9151c0
            r0 = r0[r39]
        L_0x03e0:
            if (r0 == 0) goto L_0x03ed
            int r1 = r0.mo10470x()
            if (r1 != r8) goto L_0x03ed
            f.f.b.j.e[] r0 = r0.f9151c0
            r0 = r0[r39]
            goto L_0x03e0
        L_0x03ed:
            if (r14 == r12) goto L_0x047b
            if (r14 == r13) goto L_0x047b
            if (r0 == 0) goto L_0x047b
            if (r0 != r13) goto L_0x03f8
            r7 = r21
            goto L_0x03f9
        L_0x03f8:
            r7 = r0
        L_0x03f9:
            f.f.b.j.d[] r0 = r14.f9125F
            r0 = r0[r40]
            f.f.b.i r1 = r0.f9107f
            f.f.b.j.d r2 = r0.f9104c
            if (r2 == 0) goto L_0x0405
            f.f.b.i r2 = r2.f9107f
        L_0x0405:
            f.f.b.j.d[] r2 = r15.f9125F
            int r3 = r40 + 1
            r2 = r2[r3]
            f.f.b.i r2 = r2.f9107f
            int r0 = r0.mo10381a()
            f.f.b.j.d[] r4 = r14.f9125F
            r4 = r4[r3]
            int r4 = r4.mo10381a()
            if (r7 == 0) goto L_0x0429
            f.f.b.j.d[] r5 = r7.f9125F
            r5 = r5[r40]
            f.f.b.i r6 = r5.f9107f
            f.f.b.j.d r8 = r5.f9104c
            if (r8 == 0) goto L_0x0426
            goto L_0x0438
        L_0x0426:
            r8 = r21
            goto L_0x043a
        L_0x0429:
            f.f.b.j.d[] r5 = r13.f9125F
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0432
            f.f.b.i r6 = r5.f9107f
            goto L_0x0434
        L_0x0432:
            r6 = r21
        L_0x0434:
            f.f.b.j.d[] r8 = r14.f9125F
            r8 = r8[r3]
        L_0x0438:
            f.f.b.i r8 = r8.f9107f
        L_0x043a:
            if (r5 == 0) goto L_0x0441
            int r5 = r5.mo10381a()
            int r4 = r4 + r5
        L_0x0441:
            r17 = r4
            if (r15 == 0) goto L_0x044e
            f.f.b.j.d[] r4 = r15.f9125F
            r3 = r4[r3]
            int r3 = r3.mo10381a()
            int r0 = r0 + r3
        L_0x044e:
            r3 = r0
            if (r16 == 0) goto L_0x0454
            r19 = 6
            goto L_0x0456
        L_0x0454:
            r19 = 4
        L_0x0456:
            if (r1 == 0) goto L_0x0472
            if (r2 == 0) goto L_0x0472
            if (r6 == 0) goto L_0x0472
            if (r8 == 0) goto L_0x0472
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r6 = r8
            r20 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r19
            r0.mo10350a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0478
        L_0x0472:
            r20 = r7
            r17 = r15
            r15 = 8
        L_0x0478:
            r0 = r20
            goto L_0x047f
        L_0x047b:
            r17 = r15
            r15 = 8
        L_0x047f:
            int r1 = r14.mo10470x()
            if (r1 == r15) goto L_0x0486
            goto L_0x0488
        L_0x0486:
            r14 = r17
        L_0x0488:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x03da
        L_0x048e:
            f.f.b.j.d[] r0 = r12.f9125F
            r0 = r0[r40]
            f.f.b.j.d[] r1 = r10.f9125F
            r1 = r1[r40]
            f.f.b.j.d r1 = r1.f9104c
            f.f.b.j.d[] r2 = r13.f9125F
            int r3 = r40 + 1
            r10 = r2[r3]
            f.f.b.j.d[] r2 = r11.f9125F
            r2 = r2[r3]
            f.f.b.j.d r14 = r2.f9104c
            if (r1 == 0) goto L_0x04db
            if (r12 == r13) goto L_0x04b5
            f.f.b.i r2 = r0.f9107f
            f.f.b.i r1 = r1.f9107f
            int r0 = r0.mo10381a()
            r15 = 4
            r9.mo10342a(r2, r1, r0, r15)
            goto L_0x04dc
        L_0x04b5:
            r15 = 4
            if (r14 == 0) goto L_0x04dc
            f.f.b.i r2 = r0.f9107f
            f.f.b.i r3 = r1.f9107f
            int r4 = r0.mo10381a()
            r5 = 1056964608(0x3f000000, float:0.5)
            f.f.b.i r6 = r10.f9107f
            f.f.b.i r7 = r14.f9107f
            int r8 = r10.mo10381a()
            r16 = 4
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r0.mo10350a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04dc
        L_0x04db:
            r15 = 4
        L_0x04dc:
            if (r14 == 0) goto L_0x04ec
            if (r12 == r13) goto L_0x04ec
            f.f.b.i r0 = r10.f9107f
            f.f.b.i r1 = r14.f9107f
            int r2 = r10.mo10381a()
            int r2 = -r2
            r9.mo10342a(r0, r1, r2, r15)
        L_0x04ec:
            if (r24 != 0) goto L_0x04f0
            if (r23 == 0) goto L_0x0552
        L_0x04f0:
            if (r12 == 0) goto L_0x0552
            f.f.b.j.d[] r0 = r12.f9125F
            r0 = r0[r40]
            f.f.b.j.d[] r1 = r13.f9125F
            int r2 = r40 + 1
            r1 = r1[r2]
            f.f.b.j.d r3 = r0.f9104c
            if (r3 == 0) goto L_0x0503
            f.f.b.i r3 = r3.f9107f
            goto L_0x0505
        L_0x0503:
            r3 = r21
        L_0x0505:
            f.f.b.j.d r4 = r1.f9104c
            if (r4 == 0) goto L_0x050c
            f.f.b.i r4 = r4.f9107f
            goto L_0x050e
        L_0x050c:
            r4 = r21
        L_0x050e:
            if (r11 == r13) goto L_0x051f
            f.f.b.j.d[] r4 = r11.f9125F
            r4 = r4[r2]
            f.f.b.j.d r4 = r4.f9104c
            if (r4 == 0) goto L_0x051c
            f.f.b.i r4 = r4.f9107f
            r21 = r4
        L_0x051c:
            r5 = r21
            goto L_0x0520
        L_0x051f:
            r5 = r4
        L_0x0520:
            if (r12 != r13) goto L_0x052d
            f.f.b.j.d[] r0 = r12.f9125F
            r1 = r0[r40]
            r0 = r0[r2]
            r36 = r1
            r1 = r0
            r0 = r36
        L_0x052d:
            if (r3 == 0) goto L_0x0552
            if (r5 == 0) goto L_0x0552
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo10381a()
            if (r13 != 0) goto L_0x053a
            goto L_0x053b
        L_0x053a:
            r11 = r13
        L_0x053b:
            f.f.b.j.d[] r7 = r11.f9125F
            r2 = r7[r2]
            int r7 = r2.mo10381a()
            f.f.b.i r2 = r0.f9107f
            f.f.b.i r8 = r1.f9107f
            r10 = 5
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo10350a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0552:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p089f.p093b.p094j.C3191b.m12959a(f.f.b.j.f, f.f.b.e, int, int, f.f.b.j.c):void");
    }
}
