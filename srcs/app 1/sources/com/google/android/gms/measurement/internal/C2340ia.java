package com.google.android.gms.measurement.internal;

import p147g.p156d.p157a.p167b.p173d.p180g.C4042i0;

/* renamed from: com.google.android.gms.measurement.internal.ia */
final class C2340ia extends C2328ha {

    /* renamed from: g */
    private C4042i0 f6533g;

    /* renamed from: h */
    private final /* synthetic */ C2292ea f6534h;

    C2340ia(C2292ea eaVar, String str, int i, C4042i0 i0Var) {
        this.f6534h = eaVar;
        super(str, i);
        this.f6533g = i0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo7373a() {
        return this.f6533g.mo12522q();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        if (r6.booleanValue() == false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014c, code lost:
        r5.mo7089a(r7, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x039f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7400a(java.lang.Long r18, java.lang.Long r19, p147g.p156d.p157a.p167b.p173d.p180g.C4289y0 r20, long r21, com.google.android.gms.measurement.internal.C2389n r23, boolean r24) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = p147g.p156d.p157a.p167b.p173d.p180g.C4170q9.m16953b()
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.measurement.internal.ea r1 = r0.f6534h
            com.google.android.gms.measurement.internal.b r1 = r1.mo7827m()
            java.lang.String r6 = r0.f6507a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2457t.f6921h0
            boolean r1 = r1.mo7114d(r6, r7)
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            g.d.a.b.d.g.i0 r6 = r0.f6533g
            boolean r6 = r6.mo12531z()
            if (r6 == 0) goto L_0x0032
            r6 = r23
            long r6 = r6.f6695e
            goto L_0x0034
        L_0x0032:
            r6 = r21
        L_0x0034:
            com.google.android.gms.measurement.internal.ea r8 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()
            r9 = 2
            boolean r8 = r8.mo7814a(r9)
            r9 = 0
            if (r8 == 0) goto L_0x0096
            com.google.android.gms.measurement.internal.ea r8 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7810B()
            int r10 = r0.f6508b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            g.d.a.b.d.g.i0 r11 = r0.f6533g
            boolean r11 = r11.mo12520a()
            if (r11 == 0) goto L_0x0065
            g.d.a.b.d.g.i0 r11 = r0.f6533g
            int r11 = r11.mo12522q()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0066
        L_0x0065:
            r11 = r9
        L_0x0066:
            com.google.android.gms.measurement.internal.ea r12 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r12 = r12.mo7824e()
            g.d.a.b.d.g.i0 r13 = r0.f6533g
            java.lang.String r13 = r13.mo12523r()
            java.lang.String r12 = r12.mo7718a(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, event"
            r8.mo7091a(r13, r10, r11, r12)
            com.google.android.gms.measurement.internal.ea r8 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7810B()
            com.google.android.gms.measurement.internal.ea r10 = r0.f6534h
            com.google.android.gms.measurement.internal.r9 r10 = r10.mo7492n()
            g.d.a.b.d.g.i0 r11 = r0.f6533g
            java.lang.String r10 = r10.mo7607a(r11)
            java.lang.String r11 = "Filter definition"
            r8.mo7089a(r11, r10)
        L_0x0096:
            g.d.a.b.d.g.i0 r8 = r0.f6533g
            boolean r8 = r8.mo12520a()
            if (r8 == 0) goto L_0x03e1
            g.d.a.b.d.g.i0 r8 = r0.f6533g
            int r8 = r8.mo12522q()
            r10 = 256(0x100, float:3.59E-43)
            if (r8 <= r10) goto L_0x00aa
            goto L_0x03e1
        L_0x00aa:
            g.d.a.b.d.g.i0 r8 = r0.f6533g
            boolean r8 = r8.mo12528w()
            g.d.a.b.d.g.i0 r10 = r0.f6533g
            boolean r10 = r10.mo12529x()
            g.d.a.b.d.g.i0 r11 = r0.f6533g
            boolean r11 = r11.mo12531z()
            if (r8 != 0) goto L_0x00c5
            if (r10 != 0) goto L_0x00c5
            if (r11 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r8 = 0
            goto L_0x00c6
        L_0x00c5:
            r8 = 1
        L_0x00c6:
            if (r24 == 0) goto L_0x00f2
            if (r8 != 0) goto L_0x00f2
            com.google.android.gms.measurement.internal.ea r1 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7810B()
            int r3 = r0.f6508b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            g.d.a.b.d.g.i0 r4 = r0.f6533g
            boolean r4 = r4.mo12520a()
            if (r4 == 0) goto L_0x00ec
            g.d.a.b.d.g.i0 r4 = r0.f6533g
            int r4 = r4.mo12522q()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
        L_0x00ec:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo7090a(r4, r3, r9)
            return r2
        L_0x00f2:
            g.d.a.b.d.g.i0 r10 = r0.f6533g
            java.lang.String r11 = r20.mo12912r()
            boolean r12 = r10.mo12526u()
            if (r12 == 0) goto L_0x0113
            g.d.a.b.d.g.k0 r12 = r10.mo12527v()
            java.lang.Boolean r6 = com.google.android.gms.measurement.internal.C2328ha.m9436a(r6, r12)
            if (r6 != 0) goto L_0x010b
        L_0x0108:
            r5 = r9
            goto L_0x0388
        L_0x010b:
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0113
            goto L_0x0388
        L_0x0113:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.List r7 = r10.mo12524s()
            java.util.Iterator r7 = r7.iterator()
        L_0x0120:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0158
            java.lang.Object r12 = r7.next()
            g.d.a.b.d.g.j0 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C4057j0) r12
            java.lang.String r13 = r12.mo12559w()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0150
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            java.lang.String r7 = "null or empty param name in filter. event"
        L_0x014c:
            r5.mo7089a(r7, r6)
            goto L_0x0108
        L_0x0150:
            java.lang.String r12 = r12.mo12559w()
            r6.add(r12)
            goto L_0x0120
        L_0x0158:
            f.e.a r7 = new f.e.a
            r7.<init>()
            java.util.List r12 = r20.mo12909a()
            java.util.Iterator r12 = r12.iterator()
        L_0x0165:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01ea
            java.lang.Object r13 = r12.next()
            g.d.a.b.d.g.a1 r13 = (p147g.p156d.p157a.p167b.p173d.p180g.C3909a1) r13
            java.lang.String r14 = r13.mo12057q()
            boolean r14 = r6.contains(r14)
            if (r14 == 0) goto L_0x0165
            boolean r14 = r13.mo12060t()
            if (r14 == 0) goto L_0x0196
            java.lang.String r14 = r13.mo12057q()
            boolean r15 = r13.mo12060t()
            if (r15 == 0) goto L_0x0194
            long r15 = r13.mo12061u()
            java.lang.Long r13 = java.lang.Long.valueOf(r15)
            goto L_0x01bd
        L_0x0194:
            r13 = r9
            goto L_0x01bd
        L_0x0196:
            boolean r14 = r13.mo12062v()
            if (r14 == 0) goto L_0x01af
            java.lang.String r14 = r13.mo12057q()
            boolean r15 = r13.mo12062v()
            if (r15 == 0) goto L_0x0194
            double r15 = r13.mo12063w()
            java.lang.Double r13 = java.lang.Double.valueOf(r15)
            goto L_0x01bd
        L_0x01af:
            boolean r14 = r13.mo12058r()
            if (r14 == 0) goto L_0x01c1
            java.lang.String r14 = r13.mo12057q()
            java.lang.String r13 = r13.mo12059s()
        L_0x01bd:
            r7.put(r14, r13)
            goto L_0x0165
        L_0x01c1:
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r10 = r13.mo12057q()
            java.lang.String r7 = r7.mo7719b(r10)
            java.lang.String r10 = "Unknown value for param. event, param"
        L_0x01e5:
            r5.mo7090a(r10, r6, r7)
            goto L_0x0108
        L_0x01ea:
            java.util.List r6 = r10.mo12524s()
            java.util.Iterator r6 = r6.iterator()
        L_0x01f2:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0387
            java.lang.Object r10 = r6.next()
            g.d.a.b.d.g.j0 r10 = (p147g.p156d.p157a.p167b.p173d.p180g.C4057j0) r10
            boolean r12 = r10.mo12556t()
            if (r12 == 0) goto L_0x020c
            boolean r12 = r10.mo12557u()
            if (r12 == 0) goto L_0x020c
            r12 = 1
            goto L_0x020d
        L_0x020c:
            r12 = 0
        L_0x020d:
            java.lang.String r13 = r10.mo12559w()
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x022f
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            java.lang.String r7 = "Event has empty param name. event"
            goto L_0x014c
        L_0x022f:
            java.lang.Object r14 = r7.get(r13)
            boolean r15 = r14 instanceof java.lang.Long
            if (r15 == 0) goto L_0x0278
            boolean r15 = r10.mo12554r()
            if (r15 != 0) goto L_0x025e
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r7 = r7.mo7719b(r13)
            java.lang.String r10 = "No number filter for long param. event, param"
            goto L_0x01e5
        L_0x025e:
            java.lang.Long r14 = (java.lang.Long) r14
            long r13 = r14.longValue()
            g.d.a.b.d.g.k0 r10 = r10.mo12555s()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.C2328ha.m9436a(r13, r10)
            if (r10 != 0) goto L_0x0270
            goto L_0x0108
        L_0x0270:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L_0x01f2
            goto L_0x0388
        L_0x0278:
            boolean r15 = r14 instanceof java.lang.Double
            if (r15 == 0) goto L_0x02be
            boolean r15 = r10.mo12554r()
            if (r15 != 0) goto L_0x02a4
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r7 = r7.mo7719b(r13)
            java.lang.String r10 = "No number filter for double param. event, param"
            goto L_0x01e5
        L_0x02a4:
            java.lang.Double r14 = (java.lang.Double) r14
            double r13 = r14.doubleValue()
            g.d.a.b.d.g.k0 r10 = r10.mo12555s()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.C2328ha.m9435a(r13, r10)
            if (r10 != 0) goto L_0x02b6
            goto L_0x0108
        L_0x02b6:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L_0x01f2
            goto L_0x0388
        L_0x02be:
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L_0x033f
            boolean r15 = r10.mo12552a()
            if (r15 == 0) goto L_0x02d9
            java.lang.String r14 = (java.lang.String) r14
            g.d.a.b.d.g.m0 r10 = r10.mo12553q()
            com.google.android.gms.measurement.internal.ea r13 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r13 = r13.mo7098j()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.C2328ha.m9440a(r14, r10, r13)
            goto L_0x02ef
        L_0x02d9:
            boolean r15 = r10.mo12554r()
            if (r15 == 0) goto L_0x031d
            java.lang.String r14 = (java.lang.String) r14
            boolean r15 = com.google.android.gms.measurement.internal.C2445r9.m9781a(r14)
            if (r15 == 0) goto L_0x02fb
            g.d.a.b.d.g.k0 r10 = r10.mo12555s()
            java.lang.Boolean r10 = com.google.android.gms.measurement.internal.C2328ha.m9438a(r14, r10)
        L_0x02ef:
            if (r10 != 0) goto L_0x02f3
            goto L_0x0108
        L_0x02f3:
            boolean r10 = r10.booleanValue()
            if (r10 != r12) goto L_0x01f2
            goto L_0x0388
        L_0x02fb:
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r7 = r7.mo7719b(r13)
            java.lang.String r10 = "Invalid param value for number filter. event, param"
            goto L_0x01e5
        L_0x031d:
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r7 = r7.mo7719b(r13)
            java.lang.String r10 = "No filter for String param. event, param"
            goto L_0x01e5
        L_0x033f:
            if (r14 != 0) goto L_0x0365
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r7 = r7.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r9 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r9 = r9.mo7824e()
            java.lang.String r9 = r9.mo7719b(r13)
            java.lang.String r10 = "Missing param for filter. event, param"
            r6.mo7090a(r10, r7, r9)
            goto L_0x0388
        L_0x0365:
            com.google.android.gms.measurement.internal.ea r5 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo7098j()
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7818w()
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r11)
            com.google.android.gms.measurement.internal.ea r7 = r0.f6534h
            com.google.android.gms.measurement.internal.w3 r7 = r7.mo7824e()
            java.lang.String r7 = r7.mo7719b(r13)
            java.lang.String r10 = "Unknown param type. event, param"
            goto L_0x01e5
        L_0x0387:
            r5 = r3
        L_0x0388:
            com.google.android.gms.measurement.internal.ea r6 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r6 = r6.mo7810B()
            if (r5 != 0) goto L_0x0397
            java.lang.String r7 = "null"
            goto L_0x0398
        L_0x0397:
            r7 = r5
        L_0x0398:
            java.lang.String r9 = "Event filter result"
            r6.mo7089a(r9, r7)
            if (r5 != 0) goto L_0x03a0
            return r4
        L_0x03a0:
            r0.f6509c = r3
            boolean r4 = r5.booleanValue()
            if (r4 != 0) goto L_0x03a9
            return r2
        L_0x03a9:
            r0.f6510d = r3
            if (r8 == 0) goto L_0x03e0
            boolean r3 = r20.mo12913s()
            if (r3 == 0) goto L_0x03e0
            long r3 = r20.mo12914t()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            g.d.a.b.d.g.i0 r4 = r0.f6533g
            boolean r4 = r4.mo12529x()
            if (r4 == 0) goto L_0x03d2
            if (r1 == 0) goto L_0x03cf
            g.d.a.b.d.g.i0 r1 = r0.f6533g
            boolean r1 = r1.mo12526u()
            if (r1 == 0) goto L_0x03cf
            r3 = r18
        L_0x03cf:
            r0.f6512f = r3
            goto L_0x03e0
        L_0x03d2:
            if (r1 == 0) goto L_0x03de
            g.d.a.b.d.g.i0 r1 = r0.f6533g
            boolean r1 = r1.mo12526u()
            if (r1 == 0) goto L_0x03de
            r3 = r19
        L_0x03de:
            r0.f6511e = r3
        L_0x03e0:
            return r2
        L_0x03e1:
            com.google.android.gms.measurement.internal.ea r1 = r0.f6534h
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7818w()
            java.lang.String r3 = r0.f6507a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r3)
            g.d.a.b.d.g.i0 r5 = r0.f6533g
            boolean r5 = r5.mo12520a()
            if (r5 == 0) goto L_0x0403
            g.d.a.b.d.g.i0 r5 = r0.f6533g
            int r5 = r5.mo12522q()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
        L_0x0403:
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.String r6 = "Invalid event filter ID. appId, id"
            r1.mo7090a(r6, r3, r5)
            com.google.android.gms.measurement.internal.ea r1 = r0.f6534h
            com.google.android.gms.measurement.internal.b r1 = r1.mo7827m()
            java.lang.String r3 = r0.f6507a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2457t.f6915e0
            boolean r1 = r1.mo7114d(r3, r5)
            if (r1 == 0) goto L_0x041d
            return r4
        L_0x041d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2340ia.mo7400a(java.lang.Long, java.lang.Long, g.d.a.b.d.g.y0, long, com.google.android.gms.measurement.internal.n, boolean):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo7374b() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo7375c() {
        return this.f6533g.mo12526u();
    }
}
