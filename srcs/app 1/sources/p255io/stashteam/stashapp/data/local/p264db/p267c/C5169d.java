package p255io.stashteam.stashapp.data.local.p264db.p267c;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d;
import p255io.stashteam.stashapp.data.network.response.DetailGameResponse;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.local.db.c.d */
public final class C5169d implements C5257a<DetailGameResponse, C5178d> {

    /* renamed from: a */
    private final C5168c f13423a;

    /* renamed from: b */
    private final C5167b f13424b;

    @C5891f(mo15593c = "io.stashteam.stashapp.data.local.db.mapper.ShortGameEntityFromDetailMapper", mo15594f = "ShortGameEntityFromDetailMapper.kt", mo15595l = {18, 19}, mo15596m = "map")
    /* renamed from: io.stashteam.stashapp.data.local.db.c.d$a */
    static final class C5170a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13425i;

        /* renamed from: j */
        int f13426j;

        /* renamed from: k */
        final /* synthetic */ C5169d f13427k;

        /* renamed from: l */
        Object f13428l;

        /* renamed from: m */
        Object f13429m;

        /* renamed from: n */
        Object f13430n;

        /* renamed from: o */
        Object f13431o;

        /* renamed from: p */
        Object f13432p;

        /* renamed from: q */
        Object f13433q;

        /* renamed from: r */
        int f13434r;

        /* renamed from: s */
        long f13435s;

        /* renamed from: t */
        long f13436t;

        C5170a(C5169d dVar, C5866d dVar2) {
            this.f13427k = dVar;
            super(dVar2);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13425i = obj;
            this.f13426j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13427k.mo14344a((DetailGameResponse) null, (C5866d<? super C5178d>) this);
        }
    }

    public C5169d(C5168c cVar, C5167b bVar) {
        C5942k.m22327b(cVar, "imageEntityMapper");
        C5942k.m22327b(bVar, "gameReviewEntityMapper");
        this.f13423a = cVar;
        this.f13424b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14344a(p255io.stashteam.stashapp.data.network.response.DetailGameResponse r22, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d.C5170a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            io.stashteam.stashapp.data.local.db.c.d$a r3 = (p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d.C5170a) r3
            int r4 = r3.f13426j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f13426j = r4
            goto L_0x001e
        L_0x0019:
            io.stashteam.stashapp.data.local.db.c.d$a r3 = new io.stashteam.stashapp.data.local.db.c.d$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f13425i
            java.lang.Object r4 = p308k.p316w.p317i.C5885d.m22250a()
            int r5 = r3.f13426j
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0080
            if (r5 == r8) goto L_0x005a
            if (r5 != r7) goto L_0x0052
            java.lang.Object r1 = r3.f13433q
            io.stashteam.stashapp.data.local.db.d.c r1 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c) r1
            java.lang.Object r4 = r3.f13432p
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r4 = (p255io.stashteam.stashapp.data.network.model.GameReviewApiModel) r4
            long r4 = r3.f13436t
            java.lang.Object r6 = r3.f13431o
            java.lang.String r6 = (java.lang.String) r6
            long r7 = r3.f13435s
            int r9 = r3.f13434r
            java.lang.Object r10 = r3.f13430n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r10 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r10
            java.lang.Object r10 = r3.f13429m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r10 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r10
            java.lang.Object r3 = r3.f13428l
            io.stashteam.stashapp.data.local.db.c.d r3 = (p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d) r3
            p308k.C5806n.m22054a(r2)
            goto L_0x00fc
        L_0x0052:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005a:
            java.lang.Object r1 = r3.f13432p
            io.stashteam.stashapp.data.network.model.ImageApiModel r1 = (p255io.stashteam.stashapp.data.network.model.ImageApiModel) r1
            long r8 = r3.f13436t
            java.lang.Object r1 = r3.f13431o
            java.lang.String r1 = (java.lang.String) r1
            long r10 = r3.f13435s
            int r5 = r3.f13434r
            java.lang.Object r12 = r3.f13430n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r12 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r12
            java.lang.Object r13 = r3.f13429m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r13 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r13
            java.lang.Object r14 = r3.f13428l
            io.stashteam.stashapp.data.local.db.c.d r14 = (p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d) r14
            p308k.C5806n.m22054a(r2)
            r19 = r2
            r2 = r1
            r1 = r12
            r11 = r10
            r9 = r8
            r8 = r19
            goto L_0x00ca
        L_0x0080:
            p308k.C5806n.m22054a(r2)
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r2 = r22.getGame()
            long r9 = r2.getId()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r2 = r22.getGame()
            java.lang.String r2 = r2.getName()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r5 = r22.getGame()
            long r11 = r5.getFirstReleaseDate()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r5 = r22.getGame()
            int r5 = r5.getCategory()
            io.stashteam.stashapp.data.network.model.DetailGameApiModel r13 = r22.getGame()
            io.stashteam.stashapp.data.network.model.ImageApiModel r13 = r13.getCover()
            if (r13 == 0) goto L_0x00cd
            io.stashteam.stashapp.data.local.db.c.c r14 = r0.f13423a
            r3.f13428l = r0
            r3.f13429m = r1
            r3.f13430n = r1
            r3.f13434r = r5
            r3.f13435s = r11
            r3.f13431o = r2
            r3.f13436t = r9
            r3.f13432p = r13
            r3.f13426j = r8
            java.lang.Object r8 = r14.mo14344a(r13, r3)
            if (r8 != r4) goto L_0x00c8
            return r4
        L_0x00c8:
            r14 = r0
            r13 = r1
        L_0x00ca:
            io.stashteam.stashapp.data.local.db.d.c r8 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5177c) r8
            goto L_0x00d0
        L_0x00cd:
            r14 = r0
            r13 = r1
            r8 = r6
        L_0x00d0:
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r15 = r1.getGameReview()
            if (r15 == 0) goto L_0x0108
            io.stashteam.stashapp.data.local.db.c.b r6 = r14.f13424b
            r3.f13428l = r14
            r3.f13429m = r13
            r3.f13430n = r1
            r3.f13434r = r5
            r3.f13435s = r11
            r3.f13431o = r2
            r3.f13436t = r9
            r3.f13432p = r15
            r3.f13433q = r8
            r3.f13426j = r7
            java.lang.Object r1 = r6.mo14344a(r15, r3)
            if (r1 != r4) goto L_0x00f3
            return r4
        L_0x00f3:
            r6 = r2
            r2 = r1
            r1 = r8
            r7 = r11
            r19 = r9
            r9 = r5
            r4 = r19
        L_0x00fc:
            io.stashteam.stashapp.data.local.db.d.b r2 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5176b) r2
            r17 = r1
            r18 = r2
            r11 = r4
            r13 = r6
            r14 = r7
            r16 = r9
            goto L_0x0111
        L_0x0108:
            r13 = r2
            r16 = r5
            r18 = r6
            r17 = r8
            r14 = r11
            r11 = r9
        L_0x0111:
            io.stashteam.stashapp.data.local.db.d.d r1 = new io.stashteam.stashapp.data.local.db.d.d
            r10 = r1
            r10.<init>(r11, r13, r14, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d.mo14344a(io.stashteam.stashapp.data.network.response.DetailGameResponse, k.w.d):java.lang.Object");
    }
}
