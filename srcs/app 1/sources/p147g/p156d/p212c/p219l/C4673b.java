package p147g.p156d.p212c.p219l;

/* renamed from: g.d.c.l.b */
public final class C4673b extends C4686n {

    /* renamed from: a */
    private static final char[] f12261a;

    /* renamed from: b */
    private static final char[] f12262b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    private static final char[] f12263c = {'/', ':', '+', '.'};

    /* renamed from: d */
    private static final char f12264d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f12261a = cArr;
        f12264d = cArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean[] mo13645a(java.lang.String r11) {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 >= r3) goto L_0x0020
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x000e:
            char r3 = f12264d
            r0.append(r3)
            r0.append(r11)
            char r11 = f12264d
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            goto L_0x007f
        L_0x0020:
            char r0 = r11.charAt(r1)
            char r0 = java.lang.Character.toUpperCase(r0)
            int r3 = r11.length()
            int r3 = r3 - r2
            char r3 = r11.charAt(r3)
            char r3 = java.lang.Character.toUpperCase(r3)
            char[] r4 = f12261a
            boolean r4 = p147g.p156d.p212c.p219l.C4672a.m18867a(r4, r0)
            char[] r5 = f12261a
            boolean r5 = p147g.p156d.p212c.p219l.C4672a.m18867a(r5, r3)
            char[] r6 = f12262b
            boolean r0 = p147g.p156d.p212c.p219l.C4672a.m18867a(r6, r0)
            char[] r6 = f12262b
            boolean r3 = p147g.p156d.p212c.p219l.C4672a.m18867a(r6, r3)
            java.lang.String r6 = "Invalid start/end guards: "
            if (r4 == 0) goto L_0x0062
            if (r5 == 0) goto L_0x0054
            goto L_0x007f
        L_0x0054:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x0062:
            if (r0 == 0) goto L_0x0075
            if (r3 == 0) goto L_0x0067
            goto L_0x007f
        L_0x0067:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        L_0x0075:
            if (r5 != 0) goto L_0x0150
            if (r3 != 0) goto L_0x0150
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x000e
        L_0x007f:
            r0 = 20
            r3 = 1
        L_0x0082:
            int r4 = r11.length()
            int r4 = r4 - r2
            if (r3 >= r4) goto L_0x00d5
            char r4 = r11.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L_0x00d0
            char r4 = r11.charAt(r3)
            r5 = 45
            if (r4 == r5) goto L_0x00d0
            char r4 = r11.charAt(r3)
            r5 = 36
            if (r4 != r5) goto L_0x00a4
            goto L_0x00d0
        L_0x00a4:
            char[] r4 = f12263c
            char r5 = r11.charAt(r3)
            boolean r4 = p147g.p156d.p212c.p219l.C4672a.m18867a(r4, r5)
            if (r4 == 0) goto L_0x00b3
            int r0 = r0 + 10
            goto L_0x00d2
        L_0x00b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot encode : '"
            r1.<init>(r2)
            char r11 = r11.charAt(r3)
            r1.append(r11)
            r11 = 39
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x00d0:
            int r0 = r0 + 9
        L_0x00d2:
            int r3 = r3 + 1
            goto L_0x0082
        L_0x00d5:
            int r3 = r11.length()
            int r3 = r3 - r2
            int r0 = r0 + r3
            boolean[] r0 = new boolean[r0]
            r3 = 0
            r4 = 0
        L_0x00df:
            int r5 = r11.length()
            if (r3 >= r5) goto L_0x014f
            char r5 = r11.charAt(r3)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r3 == 0) goto L_0x00f6
            int r6 = r11.length()
            int r6 = r6 - r2
            if (r3 != r6) goto L_0x0112
        L_0x00f6:
            r6 = 42
            if (r5 == r6) goto L_0x0110
            r6 = 69
            if (r5 == r6) goto L_0x010d
            r6 = 78
            if (r5 == r6) goto L_0x010a
            r6 = 84
            if (r5 == r6) goto L_0x0107
            goto L_0x0112
        L_0x0107:
            r5 = 65
            goto L_0x0112
        L_0x010a:
            r5 = 66
            goto L_0x0112
        L_0x010d:
            r5 = 68
            goto L_0x0112
        L_0x0110:
            r5 = 67
        L_0x0112:
            r6 = 0
        L_0x0113:
            char[] r7 = p147g.p156d.p212c.p219l.C4672a.f12259a
            int r8 = r7.length
            if (r6 >= r8) goto L_0x0124
            char r7 = r7[r6]
            if (r5 != r7) goto L_0x0121
            int[] r5 = p147g.p156d.p212c.p219l.C4672a.f12260b
            r5 = r5[r6]
            goto L_0x0125
        L_0x0121:
            int r6 = r6 + 1
            goto L_0x0113
        L_0x0124:
            r5 = 0
        L_0x0125:
            r6 = 0
            r7 = 1
        L_0x0127:
            r8 = 0
        L_0x0128:
            r9 = 7
            if (r6 >= r9) goto L_0x0141
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r2
            if (r9 == 0) goto L_0x013c
            if (r8 != r2) goto L_0x0139
            goto L_0x013c
        L_0x0139:
            int r8 = r8 + 1
            goto L_0x0128
        L_0x013c:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            goto L_0x0127
        L_0x0141:
            int r5 = r11.length()
            int r5 = r5 - r2
            if (r3 >= r5) goto L_0x014c
            r0[r4] = r1
            int r4 = r4 + 1
        L_0x014c:
            int r3 = r3 + 1
            goto L_0x00df
        L_0x014f:
            return r0
        L_0x0150:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r6.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p212c.p219l.C4673b.mo13645a(java.lang.String):boolean[]");
    }
}
