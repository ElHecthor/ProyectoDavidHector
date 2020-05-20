package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.ea */
final class C2292ea extends C2363k9 {

    /* renamed from: d */
    private String f6389d;

    /* renamed from: e */
    private Set<Integer> f6390e;

    /* renamed from: f */
    private Map<Integer, C2316ga> f6391f;

    /* renamed from: g */
    private Long f6392g;

    /* renamed from: h */
    private Long f6393h;

    C2292ea(C2399n9 n9Var) {
        super(n9Var);
    }

    /* renamed from: a */
    private final C2316ga m9323a(int i) {
        if (this.f6391f.containsKey(Integer.valueOf(i))) {
            return (C2316ga) this.f6391f.get(Integer.valueOf(i));
        }
        C2316ga gaVar = new C2316ga(this, this.f6389d, null);
        this.f6391f.put(Integer.valueOf(i), gaVar);
        return gaVar;
    }

    /* renamed from: a */
    private final boolean m9324a(int i, int i2) {
        if (this.f6391f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return ((C2316ga) this.f6391f.get(Integer.valueOf(i))).f6482d.get(i2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0604, code lost:
        if (r8.mo12597a() == false) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0606, code lost:
        r8 = java.lang.Integer.valueOf(r8.mo12598q());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x060f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0610, code lost:
        r7.mo7090a("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x02b8 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p147g.p156d.p157a.p167b.p173d.p180g.C4258w0> mo7272a(java.lang.String r47, java.util.List<p147g.p156d.p157a.p167b.p173d.p180g.C4289y0> r48, java.util.List<p147g.p156d.p157a.p167b.p173d.p180g.C4012g1> r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            r46 = this;
            r10 = r46
            com.google.android.gms.common.internal.C2148s.m8844b(r47)
            com.google.android.gms.common.internal.C2148s.m8834a(r48)
            com.google.android.gms.common.internal.C2148s.m8834a(r49)
            r0 = r47
            r10.f6389d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f6390e = r0
            f.e.a r0 = new f.e.a
            r0.<init>()
            r10.f6391f = r0
            r0 = r50
            r10.f6392g = r0
            r0 = r51
            r10.f6393h = r0
            java.util.Iterator r0 = r48.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            g.d.a.b.d.g.y0 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r1
            java.lang.String r1 = r1.mo12912r()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4170q9.m16953b()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.b r0 = r46.mo7827m()
            java.lang.String r2 = r10.f6389d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2457t.f6921h0
            boolean r0 = r0.mo7114d(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4170q9.m16953b()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.b r0 = r46.mo7827m()
            java.lang.String r2 = r10.f6389d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C2457t.f6919g0
            boolean r0 = r0.mo7114d(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.c r2 = r46.mo7493o()
            java.lang.String r3 = r10.f6389d
            r2.mo7459r()
            r2.mo7274c()
            com.google.android.gms.common.internal.C2148s.m8844b(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo7183v()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r7[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo7098j()
            com.google.android.gms.measurement.internal.a4 r2 = r2.mo7815t()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.mo7090a(r4, r3, r0)
        L_0x00b5:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.c r0 = r46.mo7493o()
            java.lang.String r2 = r10.f6389d
            java.util.Map r0 = r0.mo7174e(r2)
        L_0x00c7:
            com.google.android.gms.measurement.internal.c r2 = r46.mo7493o()
            java.lang.String r3 = r10.f6389d
            java.util.Map r15 = r2.mo7177g(r3)
            if (r15 == 0) goto L_0x0353
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x00db
            goto L_0x0353
        L_0x00db:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01be
            java.lang.String r1 = r10.f6389d
            com.google.android.gms.common.internal.C2148s.m8844b(r1)
            com.google.android.gms.common.internal.C2148s.m8834a(r15)
            f.e.a r3 = new f.e.a
            r3.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01bc
            com.google.android.gms.measurement.internal.c r4 = r46.mo7493o()
            java.util.Map r1 = r4.mo7175f(r1)
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0109:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01bc
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r15.get(r6)
            g.d.a.b.d.g.e1 r6 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01b2
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0137
            goto L_0x01b2
        L_0x0137:
            com.google.android.gms.measurement.internal.r9 r8 = r46.mo7492n()
            java.util.List r9 = r6.mo12371r()
            java.util.List r8 = r8.mo7609a(r9, r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0109
            g.d.a.b.d.g.t4$b r9 = r6.mo12813l()
            g.d.a.b.d.g.e1$a r9 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1.C3980a) r9
            r9.mo12384p()
            r9.mo12381b(r8)
            com.google.android.gms.measurement.internal.r9 r8 = r46.mo7492n()
            java.util.List r11 = r6.mo12367a()
            java.util.List r8 = r8.mo7609a(r11, r7)
            r9.mo12377a()
            r9.mo12379a(r8)
            r8 = 0
        L_0x0168:
            int r11 = r6.mo12374u()
            if (r8 >= r11) goto L_0x0186
            g.d.a.b.d.g.x0 r11 = r6.mo12368b(r8)
            int r11 = r11.mo12901q()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x0183
            r9.mo12378a(r8)
        L_0x0183:
            int r8 = r8 + 1
            goto L_0x0168
        L_0x0186:
            r8 = 0
        L_0x0187:
            int r11 = r6.mo12376w()
            if (r8 >= r11) goto L_0x01a5
            g.d.a.b.d.g.f1 r11 = r6.mo12369c(r8)
            int r11 = r11.mo12441q()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x01a2
            r9.mo12380b(r8)
        L_0x01a2:
            int r8 = r8 + 1
            goto L_0x0187
        L_0x01a5:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            g.d.a.b.d.g.e6 r6 = r9.mo12346f()
            g.d.a.b.d.g.t4 r6 = (p147g.p156d.p157a.p167b.p173d.p180g.C4214t4) r6
            g.d.a.b.d.g.e1 r6 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1) r6
            goto L_0x01b6
        L_0x01b2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x01b6:
            r3.put(r5, r6)
            r11 = 0
            goto L_0x0109
        L_0x01bc:
            r11 = r3
            goto L_0x01bf
        L_0x01be:
            r11 = r15
        L_0x01bf:
            java.util.Iterator r16 = r2.iterator()
        L_0x01c3:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0353
            java.lang.Object r1 = r16.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r17 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r11.get(r1)
            g.d.a.b.d.g.e1 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            f.e.a r7 = new f.e.a
            r7.<init>()
            if (r1 == 0) goto L_0x022b
            int r2 = r1.mo12374u()
            if (r2 != 0) goto L_0x01f5
            goto L_0x022b
        L_0x01f5:
            java.util.List r2 = r1.mo12373t()
            java.util.Iterator r2 = r2.iterator()
        L_0x01fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = r2.next()
            g.d.a.b.d.g.x0 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4273x0) r3
            boolean r4 = r3.mo12900a()
            if (r4 == 0) goto L_0x01fd
            int r4 = r3.mo12901q()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.mo12902r()
            if (r8 == 0) goto L_0x0226
            long r8 = r3.mo12903s()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0227
        L_0x0226:
            r3 = 0
        L_0x0227:
            r7.put(r4, r3)
            goto L_0x01fd
        L_0x022b:
            f.e.a r8 = new f.e.a
            r8.<init>()
            if (r1 == 0) goto L_0x0272
            int r2 = r1.mo12376w()
            if (r2 != 0) goto L_0x0239
            goto L_0x0272
        L_0x0239:
            java.util.List r2 = r1.mo12375v()
            java.util.Iterator r2 = r2.iterator()
        L_0x0241:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0272
            java.lang.Object r3 = r2.next()
            g.d.a.b.d.g.f1 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C3995f1) r3
            boolean r4 = r3.mo12439a()
            if (r4 == 0) goto L_0x0241
            int r4 = r3.mo12443s()
            if (r4 <= 0) goto L_0x0241
            int r4 = r3.mo12441q()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r9 = r3.mo12443s()
            int r9 = r9 - r12
            long r18 = r3.mo12440b(r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r4, r3)
            goto L_0x0241
        L_0x0272:
            if (r1 == 0) goto L_0x02bc
            r2 = 0
        L_0x0275:
            int r3 = r1.mo12370q()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x02bc
            java.util.List r3 = r1.mo12367a()
            boolean r3 = com.google.android.gms.measurement.internal.C2445r9.m9782a(r3, r2)
            if (r3 == 0) goto L_0x02ae
            com.google.android.gms.measurement.internal.y3 r3 = r46.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7810B()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.String r12 = "Filter already evaluated. audience ID, filter ID"
            r3.mo7090a(r12, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.mo12371r()
            boolean r3 = com.google.android.gms.measurement.internal.C2445r9.m9782a(r3, r2)
            if (r3 == 0) goto L_0x02ae
            r5.set(r2)
            r3 = 1
            goto L_0x02af
        L_0x02ae:
            r3 = 0
        L_0x02af:
            if (r3 != 0) goto L_0x02b8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02b8:
            int r2 = r2 + 1
            r12 = 1
            goto L_0x0275
        L_0x02bc:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r15.get(r1)
            r4 = r1
            g.d.a.b.d.g.e1 r4 = (p147g.p156d.p157a.p167b.p173d.p180g.C3979e1) r4
            if (r14 == 0) goto L_0x0337
            if (r13 == 0) goto L_0x0337
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0337
            java.lang.Long r2 = r10.f6393h
            if (r2 == 0) goto L_0x0337
            java.lang.Long r2 = r10.f6392g
            if (r2 != 0) goto L_0x02e0
            goto L_0x0337
        L_0x02e0:
            java.util.Iterator r1 = r1.iterator()
        L_0x02e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0337
            java.lang.Object r2 = r1.next()
            g.d.a.b.d.g.i0 r2 = (p147g.p156d.p157a.p167b.p173d.p180g.C4042i0) r2
            int r3 = r2.mo12522q()
            java.lang.Long r9 = r10.f6393h
            long r18 = r9.longValue()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r20
            boolean r2 = r2.mo12529x()
            if (r2 == 0) goto L_0x030c
            java.lang.Long r2 = r10.f6392g
            long r18 = r2.longValue()
            long r18 = r18 / r20
        L_0x030c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0321
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
            r7.put(r2, r9)
        L_0x0321:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x02e4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r2, r3)
            goto L_0x02e4
        L_0x0337:
            com.google.android.gms.measurement.internal.ga r12 = new com.google.android.gms.measurement.internal.ga
            java.lang.String r3 = r10.f6389d
            r9 = 0
            r1 = r12
            r2 = r46
            r18 = r11
            r11 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.ga> r1 = r10.f6391f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1.put(r2, r12)
            r11 = r18
            r12 = 1
            goto L_0x01c3
        L_0x0353:
            r11 = 0
            boolean r0 = r48.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x04d2
            com.google.android.gms.measurement.internal.fa r0 = new com.google.android.gms.measurement.internal.fa
            r0.<init>(r10, r11)
            f.e.a r2 = new f.e.a
            r2.<init>()
            java.util.Iterator r3 = r48.iterator()
        L_0x036a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r4 = r3.next()
            g.d.a.b.d.g.y0 r4 = (p147g.p156d.p157a.p167b.p173d.p180g.C4289y0) r4
            java.lang.String r5 = r10.f6389d
            g.d.a.b.d.g.y0 r5 = r0.mo7353a(r5, r4)
            if (r5 == 0) goto L_0x036a
            com.google.android.gms.measurement.internal.c r6 = r46.mo7493o()
            java.lang.String r13 = r10.f6389d
            java.lang.String r7 = r5.mo12912r()
            java.lang.String r8 = r4.mo12912r()
            com.google.android.gms.measurement.internal.n r8 = r6.mo7151a(r13, r8)
            if (r8 != 0) goto L_0x03ca
            com.google.android.gms.measurement.internal.y3 r8 = r6.mo7098j()
            com.google.android.gms.measurement.internal.a4 r8 = r8.mo7818w()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r13)
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo7824e()
            java.lang.String r6 = r6.mo7718a(r7)
            java.lang.String r7 = "Event aggregate wasn't created during raw event logging. appId, event"
            r8.mo7090a(r7, r9, r6)
            com.google.android.gms.measurement.internal.n r6 = new com.google.android.gms.measurement.internal.n
            r12 = r6
            java.lang.String r14 = r4.mo12912r()
            r15 = 1
            r17 = 1
            r19 = 1
            long r21 = r4.mo12914t()
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)
            goto L_0x03ff
        L_0x03ca:
            com.google.android.gms.measurement.internal.n r6 = new com.google.android.gms.measurement.internal.n
            r29 = r6
            java.lang.String r4 = r8.f6691a
            r30 = r4
            java.lang.String r4 = r8.f6692b
            r31 = r4
            long r12 = r8.f6693c
            r14 = 1
            long r32 = r12 + r14
            long r12 = r8.f6694d
            long r34 = r12 + r14
            long r12 = r8.f6695e
            long r36 = r12 + r14
            long r12 = r8.f6696f
            r38 = r12
            long r12 = r8.f6697g
            r40 = r12
            java.lang.Long r4 = r8.f6698h
            r42 = r4
            java.lang.Long r4 = r8.f6699i
            r43 = r4
            java.lang.Long r4 = r8.f6700j
            r44 = r4
            java.lang.Boolean r4 = r8.f6701k
            r45 = r4
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
        L_0x03ff:
            com.google.android.gms.measurement.internal.c r4 = r46.mo7493o()
            r4.mo7158a(r6)
            long r7 = r6.f6693c
            java.lang.String r4 = r5.mo12912r()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x0428
            com.google.android.gms.measurement.internal.c r9 = r46.mo7493o()
            java.lang.String r12 = r10.f6389d
            java.util.Map r9 = r9.mo7176f(r12, r4)
            if (r9 != 0) goto L_0x0425
            f.e.a r9 = new f.e.a
            r9.<init>()
        L_0x0425:
            r2.put(r4, r9)
        L_0x0428:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0430:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x036a
            java.lang.Object r12 = r4.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r15 = r12.intValue()
            java.util.Set<java.lang.Integer> r12 = r10.f6390e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x045c
            com.google.android.gms.measurement.internal.y3 r12 = r46.mo7098j()
            com.google.android.gms.measurement.internal.a4 r12 = r12.mo7810B()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r12.mo7089a(r1, r13)
            goto L_0x0430
        L_0x045c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.Object r12 = r9.get(r12)
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r20 = r12.iterator()
            r12 = 1
        L_0x046b:
            boolean r13 = r20.hasNext()
            if (r13 == 0) goto L_0x04bf
            java.lang.Object r12 = r20.next()
            g.d.a.b.d.g.i0 r12 = (p147g.p156d.p157a.p167b.p173d.p180g.C4042i0) r12
            com.google.android.gms.measurement.internal.ia r14 = new com.google.android.gms.measurement.internal.ia
            java.lang.String r13 = r10.f6389d
            r14.<init>(r10, r13, r15, r12)
            java.lang.Long r13 = r10.f6392g
            java.lang.Long r11 = r10.f6393h
            int r12 = r12.mo12522q()
            boolean r19 = r10.m9324a(r15, r12)
            r12 = r14
            r21 = r0
            r0 = r14
            r14 = r11
            r11 = r15
            r15 = r5
            r16 = r7
            r18 = r6
            boolean r12 = r12.mo7400a(r13, r14, r15, r16, r18, r19)
            com.google.android.gms.measurement.internal.b r13 = r46.mo7827m()
            java.lang.String r14 = r10.f6389d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C2457t.f6915e0
            boolean r13 = r13.mo7114d(r14, r15)
            if (r13 == 0) goto L_0x04b3
            if (r12 != 0) goto L_0x04b3
            java.util.Set<java.lang.Integer> r0 = r10.f6390e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r0.add(r13)
            goto L_0x04c2
        L_0x04b3:
            com.google.android.gms.measurement.internal.ga r13 = r10.m9323a(r11)
            r13.mo7362a(r0)
            r15 = r11
            r0 = r21
            r11 = 0
            goto L_0x046b
        L_0x04bf:
            r21 = r0
            r11 = r15
        L_0x04c2:
            if (r12 != 0) goto L_0x04cd
            java.util.Set<java.lang.Integer> r0 = r10.f6390e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.add(r11)
        L_0x04cd:
            r0 = r21
            r11 = 0
            goto L_0x0430
        L_0x04d2:
            boolean r0 = r49.isEmpty()
            if (r0 != 0) goto L_0x0627
            f.e.a r0 = new f.e.a
            r0.<init>()
            java.util.Iterator r2 = r49.iterator()
        L_0x04e1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0627
            java.lang.Object r3 = r2.next()
            g.d.a.b.d.g.g1 r3 = (p147g.p156d.p157a.p167b.p173d.p180g.C4012g1) r3
            java.lang.String r4 = r3.mo12468r()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x050d
            com.google.android.gms.measurement.internal.c r5 = r46.mo7493o()
            java.lang.String r6 = r10.f6389d
            java.util.Map r5 = r5.mo7178g(r6, r4)
            if (r5 != 0) goto L_0x050a
            f.e.a r5 = new f.e.a
            r5.<init>()
        L_0x050a:
            r0.put(r4, r5)
        L_0x050d:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0515:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04e1
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r10.f6390e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0541
            com.google.android.gms.measurement.internal.y3 r3 = r46.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7810B()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.mo7089a(r1, r4)
            goto L_0x04e1
        L_0x0541:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x0550:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x061a
            java.lang.Object r8 = r7.next()
            g.d.a.b.d.g.l0 r8 = (p147g.p156d.p157a.p167b.p173d.p180g.C4088l0) r8
            com.google.android.gms.measurement.internal.y3 r9 = r46.mo7098j()
            r11 = 2
            boolean r9 = r9.mo7814a(r11)
            if (r9 == 0) goto L_0x05a9
            com.google.android.gms.measurement.internal.y3 r9 = r46.mo7098j()
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7810B()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r12 = r8.mo12597a()
            if (r12 == 0) goto L_0x0582
            int r12 = r8.mo12598q()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0583
        L_0x0582:
            r12 = 0
        L_0x0583:
            com.google.android.gms.measurement.internal.w3 r13 = r46.mo7824e()
            java.lang.String r14 = r8.mo12599r()
            java.lang.String r13 = r13.mo7720c(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.mo7091a(r14, r11, r12, r13)
            com.google.android.gms.measurement.internal.y3 r9 = r46.mo7098j()
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7810B()
            com.google.android.gms.measurement.internal.r9 r11 = r46.mo7492n()
            java.lang.String r11 = r11.mo7608a(r8)
            java.lang.String r12 = "Filter definition"
            r9.mo7089a(r12, r11)
        L_0x05a9:
            boolean r9 = r8.mo12597a()
            if (r9 == 0) goto L_0x05f2
            int r9 = r8.mo12598q()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x05b8
            goto L_0x05f2
        L_0x05b8:
            com.google.android.gms.measurement.internal.ka r9 = new com.google.android.gms.measurement.internal.ka
            java.lang.String r11 = r10.f6389d
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.f6392g
            java.lang.Long r12 = r10.f6393h
            int r8 = r8.mo12598q()
            boolean r8 = r10.m9324a(r6, r8)
            boolean r8 = r9.mo7461a(r11, r12, r3, r8)
            com.google.android.gms.measurement.internal.b r11 = r46.mo7827m()
            java.lang.String r12 = r10.f6389d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C2457t.f6915e0
            boolean r11 = r11.mo7114d(r12, r13)
            if (r11 == 0) goto L_0x05e9
            if (r8 != 0) goto L_0x05e9
            java.util.Set<java.lang.Integer> r7 = r10.f6390e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x061a
        L_0x05e9:
            com.google.android.gms.measurement.internal.ga r11 = r10.m9323a(r6)
            r11.mo7362a(r9)
            goto L_0x0550
        L_0x05f2:
            com.google.android.gms.measurement.internal.y3 r7 = r46.mo7098j()
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7818w()
            java.lang.String r9 = r10.f6389d
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r9)
            boolean r11 = r8.mo12597a()
            if (r11 == 0) goto L_0x060f
            int r8 = r8.mo12598q()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0610
        L_0x060f:
            r8 = 0
        L_0x0610:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.mo7090a(r11, r9, r8)
            r8 = 0
        L_0x061a:
            if (r8 != 0) goto L_0x0515
            java.util.Set<java.lang.Integer> r7 = r10.f6390e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            goto L_0x0515
        L_0x0627:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.ga> r0 = r10.f6391f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f6390e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x063b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06cb
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.ga> r3 = r10.f6391f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.ga r3 = (com.google.android.gms.measurement.internal.C2316ga) r3
            g.d.a.b.d.g.w0 r3 = r3.mo7361a(r0)
            r1.add(r3)
            com.google.android.gms.measurement.internal.c r4 = r46.mo7493o()
            java.lang.String r5 = r10.f6389d
            g.d.a.b.d.g.e1 r3 = r3.mo12876r()
            r4.mo7459r()
            r4.mo7274c()
            com.google.android.gms.common.internal.C2148s.m8844b(r5)
            com.google.android.gms.common.internal.C2148s.m8834a(r3)
            byte[] r3 = r3.mo12245g()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.mo7183v()     // Catch:{ SQLiteException -> 0x06b6 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x06b4 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x063b
            com.google.android.gms.measurement.internal.y3 r0 = r4.mo7098j()     // Catch:{ SQLiteException -> 0x06b4 }
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7815t()     // Catch:{ SQLiteException -> 0x06b4 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)     // Catch:{ SQLiteException -> 0x06b4 }
            r0.mo7089a(r3, r6)     // Catch:{ SQLiteException -> 0x06b4 }
            goto L_0x063b
        L_0x06b4:
            r0 = move-exception
            goto L_0x06b8
        L_0x06b6:
            r0 = move-exception
            r8 = 0
        L_0x06b8:
            com.google.android.gms.measurement.internal.y3 r3 = r4.mo7098j()
            com.google.android.gms.measurement.internal.a4 r3 = r3.mo7815t()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2516y3.m10125a(r5)
            java.lang.String r5 = "Error storing filter results. appId"
            r3.mo7090a(r5, r4, r0)
            goto L_0x063b
        L_0x06cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2292ea.mo7272a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo7181t() {
        return false;
    }
}
