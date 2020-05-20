package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.e */
public final class C5236e implements C5201a<C5237a, List<? extends C5323z>> {

    /* renamed from: a */
    private final C4964c f13686a;

    /* renamed from: b */
    private final C5271i f13687b;

    /* renamed from: io.stashteam.stashapp.e.a.d.e$a */
    public static final class C5237a implements C5715a<C5237a> {

        /* renamed from: a */
        private final C5305k f13688a;

        /* renamed from: b */
        private final int f13689b;

        /* renamed from: c */
        private final int f13690c;

        /* renamed from: d */
        private final C5299h f13691d;

        /* renamed from: e */
        private final Long f13692e;

        public C5237a(C5305k kVar, int i, int i2, C5299h hVar, Long l) {
            C5942k.m22327b(kVar, "listType");
            this.f13688a = kVar;
            this.f13689b = i;
            this.f13690c = i2;
            this.f13691d = hVar;
            this.f13692e = l;
        }

        public /* synthetic */ C5237a(C5305k kVar, int i, int i2, C5299h hVar, Long l, int i3, C5938g gVar) {
            this(kVar, i, i2, (i3 & 8) != 0 ? null : hVar, (i3 & 16) != 0 ? null : l);
        }

        /* renamed from: a */
        public static /* synthetic */ C5237a m20577a(C5237a aVar, C5305k kVar, int i, int i2, C5299h hVar, Long l, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                kVar = aVar.f13688a;
            }
            if ((i3 & 2) != 0) {
                i = aVar.mo14789e();
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = aVar.mo14787c();
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                hVar = aVar.f13691d;
            }
            C5299h hVar2 = hVar;
            if ((i3 & 16) != 0) {
                l = aVar.f13692e;
            }
            return aVar.mo14784a(kVar, i4, i5, hVar2, l);
        }

        /* renamed from: a */
        public C5237a m20581a(int i, int i2) {
            return m20577a(this, null, i2, i, null, null, 25, null);
        }

        /* renamed from: a */
        public final C5237a mo14784a(C5305k kVar, int i, int i2, C5299h hVar, Long l) {
            C5942k.m22327b(kVar, "listType");
            C5237a aVar = new C5237a(kVar, i, i2, hVar, l);
            return aVar;
        }

        /* renamed from: a */
        public final C5299h mo14785a() {
            return this.f13691d;
        }

        /* renamed from: b */
        public final Long mo14786b() {
            return this.f13692e;
        }

        /* renamed from: c */
        public int mo14787c() {
            return this.f13690c;
        }

        /* renamed from: d */
        public final C5305k mo14788d() {
            return this.f13688a;
        }

        /* renamed from: e */
        public int mo14789e() {
            return this.f13689b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13692e, (java.lang.Object) r3.f13692e) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a
                if (r0 == 0) goto L_0x003b
                io.stashteam.stashapp.e.a.d.e$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a) r3
                io.stashteam.stashapp.e.c.k r0 = r2.f13688a
                io.stashteam.stashapp.e.c.k r1 = r3.f13688a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x003b
                int r0 = r2.mo14789e()
                int r1 = r3.mo14789e()
                if (r0 != r1) goto L_0x003b
                int r0 = r2.mo14787c()
                int r1 = r3.mo14787c()
                if (r0 != r1) goto L_0x003b
                io.stashteam.stashapp.e.c.h r0 = r2.f13691d
                io.stashteam.stashapp.e.c.h r1 = r3.f13691d
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.Long r0 = r2.f13692e
                java.lang.Long r3 = r3.f13692e
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C5305k kVar = this.f13688a;
            int i = 0;
            int hashCode = (((((kVar != null ? kVar.hashCode() : 0) * 31) + mo14789e()) * 31) + mo14787c()) * 31;
            C5299h hVar = this.f13691d;
            int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
            Long l = this.f13692e;
            if (l != null) {
                i = l.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listType=");
            sb.append(this.f13688a);
            sb.append(", offset=");
            sb.append(mo14789e());
            sb.append(", limit=");
            sb.append(mo14787c());
            sb.append(", filterData=");
            sb.append(this.f13691d);
            sb.append(", keyId=");
            sb.append(this.f13692e);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.GetGameListInteractor", mo15594f = "GetGameListInteractor.kt", mo15595l = {18, 22, 26, 29, 32, 35, 38, 41, 54, 58}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.e$b */
    static final class C5238b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13693i;

        /* renamed from: j */
        int f13694j;

        /* renamed from: k */
        final /* synthetic */ C5236e f13695k;

        /* renamed from: l */
        Object f13696l;

        /* renamed from: m */
        Object f13697m;

        /* renamed from: n */
        Object f13698n;

        C5238b(C5236e eVar, C5866d dVar) {
            this.f13695k = eVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13693i = obj;
            this.f13694j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13695k.mo14718a((C5237a) null, (C5866d<? super List<C5323z>>) this);
        }
    }

    public C5236e(C4964c cVar, C5271i iVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(iVar, "shortGameFromApiMapper");
        this.f13686a = cVar;
        this.f13687b = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        if (r2 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r2 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0275 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0276 A[PHI: r14 
      PHI: (r14v2 java.lang.Object) = (r14v5 java.lang.Object), (r14v1 java.lang.Object) binds: [B:94:0x0273, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a r13, p308k.p316w.C5866d<? super java.util.List<p255io.stashteam.stashapp.p269e.p280c.C5323z>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5238b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.stashteam.stashapp.e.a.d.e$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5238b) r0
            int r1 = r0.f13694j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13694j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.e$b r0 = new io.stashteam.stashapp.e.a.d.e$b
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f13693i
            java.lang.Object r11 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f13694j
            switch(r1) {
                case 0: goto L_0x0049;
                case 1: goto L_0x003c;
                case 2: goto L_0x003c;
                case 3: goto L_0x003c;
                case 4: goto L_0x003c;
                case 5: goto L_0x003c;
                case 6: goto L_0x003c;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                case 9: goto L_0x003c;
                case 10: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x002b:
            java.lang.Object r13 = r0.f13698n
            io.stashteam.stashapp.data.network.response.PagingResponse r13 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r13
            java.lang.Object r13 = r0.f13697m
            io.stashteam.stashapp.e.a.d.e$a r13 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a) r13
            java.lang.Object r13 = r0.f13696l
            io.stashteam.stashapp.e.a.d.e r13 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e) r13
            p308k.C5806n.m22054a(r14)
            goto L_0x0276
        L_0x003c:
            java.lang.Object r13 = r0.f13697m
            io.stashteam.stashapp.e.a.d.e$a r13 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a) r13
            java.lang.Object r1 = r0.f13696l
            io.stashteam.stashapp.e.a.d.e r1 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e) r1
            p308k.C5806n.m22054a(r14)
            goto L_0x025d
        L_0x0049:
            p308k.C5806n.m22054a(r14)
            io.stashteam.stashapp.e.c.k r14 = r13.mo14788d()
            int[] r1 = p255io.stashteam.stashapp.p269e.p270a.p274d.C5239f.f13699a
            int r14 = r14.ordinal()
            r14 = r1[r14]
            java.lang.String r1 = "game_id must not be null fo "
            java.lang.String r2 = " type."
            r3 = 0
            switch(r14) {
                case 1: goto L_0x0235;
                case 2: goto L_0x01f2;
                case 3: goto L_0x01ad;
                case 4: goto L_0x018b;
                case 5: goto L_0x0169;
                case 6: goto L_0x0147;
                case 7: goto L_0x0125;
                case 8: goto L_0x0102;
                case 9: goto L_0x0066;
                case 10: goto L_0x0066;
                case 11: goto L_0x0066;
                default: goto L_0x0060;
            }
        L_0x0060:
            k.k r13 = new k.k
            r13.<init>()
            throw r13
        L_0x0066:
            java.lang.Long r14 = r13.mo14786b()
            if (r14 == 0) goto L_0x00e4
            io.stashteam.stashapp.b.d.c r1 = r12.f13686a
            java.lang.Long r14 = r13.mo14786b()
            long r4 = r14.longValue()
            io.stashteam.stashapp.e.c.k r14 = r13.mo14788d()
            java.lang.String r14 = r14.mo14958i()
            int r6 = r13.mo14787c()
            int r7 = r13.mo14789e()
            io.stashteam.stashapp.e.c.h r2 = r13.mo14785a()
            if (r2 == 0) goto L_0x0099
            io.stashteam.stashapp.e.c.b0 r2 = r2.mo14938h()
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = r2.mo14861f()
            if (r2 == 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            io.stashteam.stashapp.e.c.b0 r2 = p255io.stashteam.stashapp.p269e.p280c.C5288b0.ADDED_DATE
            java.lang.String r2 = r2.mo14861f()
        L_0x009f:
            r8 = r2
            io.stashteam.stashapp.e.c.h r2 = r13.mo14785a()
            if (r2 == 0) goto L_0x00b9
            io.stashteam.stashapp.e.c.b0 r2 = r2.mo14938h()
            if (r2 == 0) goto L_0x00b9
            io.stashteam.stashapp.e.c.a0 r2 = r2.mo14863h()
            if (r2 == 0) goto L_0x00b9
            java.lang.String r2 = r2.mo14860f()
            if (r2 == 0) goto L_0x00b9
            goto L_0x00bf
        L_0x00b9:
            io.stashteam.stashapp.e.c.a0 r2 = p255io.stashteam.stashapp.p269e.p280c.C5286a0.f13825h
            java.lang.String r2 = r2.mo14860f()
        L_0x00bf:
            r9 = r2
            io.stashteam.stashapp.e.c.h r2 = r13.mo14785a()
            if (r2 == 0) goto L_0x00cc
            java.lang.String r2 = r2.mo14930a()
            r10 = r2
            goto L_0x00cd
        L_0x00cc:
            r10 = r3
        L_0x00cd:
            r0.f13696l = r12
            r0.f13697m = r13
            r2 = 9
            r0.f13694j = r2
            r2 = r4
            r4 = r14
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r0
            java.lang.Object r14 = r1.mo14170a(r2, r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x00e4:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "user_id must not be null fo "
            r0.append(r1)
            io.stashteam.stashapp.e.c.k r13 = r13.mo14788d()
            r0.append(r13)
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x0102:
            io.stashteam.stashapp.b.d.c r14 = r12.f13686a
            int r1 = r13.mo14787c()
            int r2 = r13.mo14789e()
            io.stashteam.stashapp.e.c.h r4 = r13.mo14785a()
            if (r4 == 0) goto L_0x0116
            java.lang.String r3 = r4.mo14930a()
        L_0x0116:
            r0.f13696l = r12
            r0.f13697m = r13
            r4 = 8
            r0.f13694j = r4
            java.lang.Object r14 = r14.mo14177b(r1, r2, r3, r0)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x0125:
            io.stashteam.stashapp.b.d.c r14 = r12.f13686a
            int r1 = r13.mo14787c()
            int r2 = r13.mo14789e()
            io.stashteam.stashapp.e.c.h r4 = r13.mo14785a()
            if (r4 == 0) goto L_0x0139
            java.lang.String r3 = r4.mo14930a()
        L_0x0139:
            r0.f13696l = r12
            r0.f13697m = r13
            r4 = 7
            r0.f13694j = r4
            java.lang.Object r14 = r14.mo14184d(r1, r2, r3, r0)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x0147:
            io.stashteam.stashapp.b.d.c r14 = r12.f13686a
            int r1 = r13.mo14787c()
            int r2 = r13.mo14789e()
            io.stashteam.stashapp.e.c.h r4 = r13.mo14785a()
            if (r4 == 0) goto L_0x015b
            java.lang.String r3 = r4.mo14930a()
        L_0x015b:
            r0.f13696l = r12
            r0.f13697m = r13
            r4 = 6
            r0.f13694j = r4
            java.lang.Object r14 = r14.mo14185e(r1, r2, r3, r0)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x0169:
            io.stashteam.stashapp.b.d.c r14 = r12.f13686a
            int r1 = r13.mo14787c()
            int r2 = r13.mo14789e()
            io.stashteam.stashapp.e.c.h r4 = r13.mo14785a()
            if (r4 == 0) goto L_0x017d
            java.lang.String r3 = r4.mo14930a()
        L_0x017d:
            r0.f13696l = r12
            r0.f13697m = r13
            r4 = 5
            r0.f13694j = r4
            java.lang.Object r14 = r14.mo14166a(r1, r2, r3, r0)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x018b:
            io.stashteam.stashapp.b.d.c r14 = r12.f13686a
            int r1 = r13.mo14787c()
            int r2 = r13.mo14789e()
            io.stashteam.stashapp.e.c.h r4 = r13.mo14785a()
            if (r4 == 0) goto L_0x019f
            java.lang.String r3 = r4.mo14930a()
        L_0x019f:
            r0.f13696l = r12
            r0.f13697m = r13
            r4 = 4
            r0.f13694j = r4
            java.lang.Object r14 = r14.mo14181c(r1, r2, r3, r0)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x01ad:
            java.lang.Long r14 = r13.mo14786b()
            if (r14 == 0) goto L_0x01d4
            io.stashteam.stashapp.b.d.c r1 = r12.f13686a
            java.lang.Long r14 = r13.mo14786b()
            long r2 = r14.longValue()
            int r4 = r13.mo14787c()
            int r5 = r13.mo14789e()
            r0.f13696l = r12
            r0.f13697m = r13
            r14 = 3
            r0.f13694j = r14
            r6 = r0
            java.lang.Object r14 = r1.mo14182c(r2, r4, r5, r6)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x01d4:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "developer_id must not be null fo "
            r0.append(r1)
            io.stashteam.stashapp.e.c.k r13 = r13.mo14788d()
            r0.append(r13)
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x01f2:
            java.lang.Long r14 = r13.mo14786b()
            if (r14 == 0) goto L_0x0219
            io.stashteam.stashapp.b.d.c r1 = r12.f13686a
            java.lang.Long r14 = r13.mo14786b()
            long r2 = r14.longValue()
            int r4 = r13.mo14787c()
            int r5 = r13.mo14789e()
            r0.f13696l = r12
            r0.f13697m = r13
            r14 = 2
            r0.f13694j = r14
            r6 = r0
            java.lang.Object r14 = r1.mo14168a(r2, r4, r5, r6)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x0219:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            io.stashteam.stashapp.e.c.k r13 = r13.mo14788d()
            r0.append(r13)
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x0235:
            java.lang.Long r14 = r13.mo14786b()
            if (r14 == 0) goto L_0x0277
            io.stashteam.stashapp.b.d.c r1 = r12.f13686a
            java.lang.Long r14 = r13.mo14786b()
            long r2 = r14.longValue()
            int r4 = r13.mo14787c()
            int r5 = r13.mo14789e()
            r0.f13696l = r12
            r0.f13697m = r13
            r14 = 1
            r0.f13694j = r14
            r6 = r0
            java.lang.Object r14 = r1.mo14178b(r2, r4, r5, r6)
            if (r14 != r11) goto L_0x025c
            return r11
        L_0x025c:
            r1 = r12
        L_0x025d:
            io.stashteam.stashapp.data.network.response.PagingResponse r14 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r14
            io.stashteam.stashapp.e.b.b.i r2 = r1.f13687b
            java.util.List r3 = r14.getItems()
            r0.f13696l = r1
            r0.f13697m = r13
            r0.f13698n = r14
            r13 = 10
            r0.f13694j = r13
            java.lang.Object r14 = r2.mo14842a(r3, r0)
            if (r14 != r11) goto L_0x0276
            return r11
        L_0x0276:
            return r14
        L_0x0277:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            io.stashteam.stashapp.e.c.k r13 = r13.mo14788d()
            r0.append(r13)
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.mo14718a(io.stashteam.stashapp.e.a.d.e$a, k.w.d):java.lang.Object");
    }
}
