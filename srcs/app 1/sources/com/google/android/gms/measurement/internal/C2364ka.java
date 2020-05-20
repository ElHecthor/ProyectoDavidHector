package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4088l0;

/* renamed from: com.google.android.gms.measurement.internal.ka */
final class C2364ka extends C2328ha {

    /* renamed from: g */
    private C4088l0 f6603g;

    /* renamed from: h */
    private final /* synthetic */ C2292ea f6604h;

    C2364ka(C2292ea eaVar, String str, int i, C4088l0 l0Var) {
        this.f6604h = eaVar;
        super(str, i);
        this.f6603g = l0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo7373a() {
        return this.f6603g.mo12598q();
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7461a(java.lang.Long r11, java.lang.Long r12, p147g.p156d.p157a.p167b.p173d.p180g.C4012g1 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4170q9.m16953b()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.ea r0 = r10.f6604h
            com.google.android.gms.measurement.internal.b r0 = r0.mo7827m()
            java.lang.String r3 = r10.f6507a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2457t.f6917f0
            boolean r0 = r0.mo7114d(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            g.d.a.b.d.g.l0 r3 = r10.f6603g
            boolean r3 = r3.mo12601t()
            g.d.a.b.d.g.l0 r4 = r10.f6603g
            boolean r4 = r4.mo12602u()
            g.d.a.b.d.g.l0 r5 = r10.f6603g
            boolean r5 = r5.mo12604w()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.ea r11 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r11 = r11.mo7098j()
            com.google.android.gms.measurement.internal.a4 r11 = r11.mo7810B()
            int r12 = r10.f6508b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            g.d.a.b.d.g.l0 r13 = r10.f6603g
            boolean r13 = r13.mo12597a()
            if (r13 == 0) goto L_0x005e
            g.d.a.b.d.g.l0 r13 = r10.f6603g
            int r13 = r13.mo12598q()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.mo7090a(r13, r12, r4)
            return r2
        L_0x0064:
            g.d.a.b.d.g.l0 r6 = r10.f6603g
            g.d.a.b.d.g.j0 r6 = r6.mo12600s()
            boolean r7 = r6.mo12557u()
            boolean r8 = r13.mo12471u()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.mo12554r()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.ea r6 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7818w()
            com.google.android.gms.measurement.internal.ea r7 = r10.f6604h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r8 = r13.mo12468r()
            java.lang.String r7 = r7.mo7720c(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.mo7089a(r8, r7)
            goto L_0x0175
        L_0x0099:
            long r8 = r13.mo12472v()
            g.d.a.b.d.g.k0 r4 = r6.mo12555s()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2328ha.m9436a(r8, r4)
        L_0x00a5:
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2328ha.m9437a(r4, r7)
            goto L_0x0175
        L_0x00ab:
            boolean r8 = r13.mo12473w()
            if (r8 == 0) goto L_0x00df
            boolean r8 = r6.mo12554r()
            if (r8 != 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ea r6 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7818w()
            com.google.android.gms.measurement.internal.ea r7 = r10.f6604h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r8 = r13.mo12468r()
            java.lang.String r7 = r7.mo7720c(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d2:
            double r8 = r13.mo12474x()
            g.d.a.b.d.g.k0 r4 = r6.mo12555s()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2328ha.m9435a(r8, r4)
            goto L_0x00a5
        L_0x00df:
            boolean r8 = r13.mo12469s()
            if (r8 == 0) goto L_0x0159
            boolean r8 = r6.mo12552a()
            if (r8 != 0) goto L_0x0145
            boolean r8 = r6.mo12554r()
            if (r8 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.ea r6 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7818w()
            com.google.android.gms.measurement.internal.ea r7 = r10.f6604h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r8 = r13.mo12468r()
            java.lang.String r7 = r7.mo7720c(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x010c:
            java.lang.String r8 = r13.mo12470t()
            boolean r8 = com.google.android.gms.measurement.internal.C2445r9.m9781a(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = r13.mo12470t()
            g.d.a.b.d.g.k0 r6 = r6.mo12555s()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2328ha.m9438a(r4, r6)
            goto L_0x00a5
        L_0x0123:
            com.google.android.gms.measurement.internal.ea r6 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7818w()
            com.google.android.gms.measurement.internal.ea r7 = r10.f6604h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r8 = r13.mo12468r()
            java.lang.String r7 = r7.mo7720c(r8)
            java.lang.String r8 = r13.mo12470t()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.mo7090a(r9, r7, r8)
            goto L_0x0175
        L_0x0145:
            java.lang.String r4 = r13.mo12470t()
            g.d.a.b.d.g.m0 r6 = r6.mo12553q()
            com.google.android.gms.measurement.internal.ea r8 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C2328ha.m9440a(r4, r6, r8)
            goto L_0x00a5
        L_0x0159:
            com.google.android.gms.measurement.internal.ea r6 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7818w()
            com.google.android.gms.measurement.internal.ea r7 = r10.f6604h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r8 = r13.mo12468r()
            java.lang.String r7 = r7.mo7720c(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0175:
            com.google.android.gms.measurement.internal.ea r6 = r10.f6604h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()
            if (r4 != 0) goto L_0x0184
            java.lang.String r7 = "null"
            goto L_0x0185
        L_0x0184:
            r7 = r4
        L_0x0185:
            java.lang.String r8 = "Property filter result"
            r6.mo7089a(r8, r7)
            if (r4 != 0) goto L_0x018d
            return r1
        L_0x018d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r10.f6509c = r1
            if (r5 == 0) goto L_0x019c
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x019c
            return r2
        L_0x019c:
            if (r14 == 0) goto L_0x01a6
            g.d.a.b.d.g.l0 r14 = r10.f6603g
            boolean r14 = r14.mo12601t()
            if (r14 == 0) goto L_0x01a8
        L_0x01a6:
            r10.f6510d = r4
        L_0x01a8:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01ed
            if (r3 == 0) goto L_0x01ed
            boolean r14 = r13.mo12466a()
            if (r14 == 0) goto L_0x01ed
            long r13 = r13.mo12467q()
            if (r11 == 0) goto L_0x01c0
            long r13 = r11.longValue()
        L_0x01c0:
            if (r0 == 0) goto L_0x01d8
            g.d.a.b.d.g.l0 r11 = r10.f6603g
            boolean r11 = r11.mo12601t()
            if (r11 == 0) goto L_0x01d8
            g.d.a.b.d.g.l0 r11 = r10.f6603g
            boolean r11 = r11.mo12602u()
            if (r11 != 0) goto L_0x01d8
            if (r12 == 0) goto L_0x01d8
            long r13 = r12.longValue()
        L_0x01d8:
            g.d.a.b.d.g.l0 r11 = r10.f6603g
            boolean r11 = r11.mo12602u()
            if (r11 == 0) goto L_0x01e7
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f6512f = r11
            goto L_0x01ed
        L_0x01e7:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f6511e = r11
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2364ka.mo7461a(java.lang.Long, java.lang.Long, g.d.a.b.d.g.g1, boolean):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo7374b() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo7375c() {
        return false;
    }
}
