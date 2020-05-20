package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b;
import p255io.stashteam.stashapp.p269e.p275b.p279d.C5283b;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.a */
public final class C5227a implements C5201a<C5228a, C5298g> {

    /* renamed from: a */
    private final C4964c f13649a;

    /* renamed from: b */
    private final C5261b f13650b;

    /* renamed from: c */
    private final C5283b f13651c;

    /* renamed from: d */
    private final C5196i f13652d;

    /* renamed from: io.stashteam.stashapp.e.a.d.a$a */
    public static final class C5228a {

        /* renamed from: a */
        private final long f13653a;

        /* renamed from: b */
        private final C5306l f13654b;

        public C5228a(long j, C5306l lVar) {
            C5942k.m22327b(lVar, "gameReview");
            this.f13653a = j;
            this.f13654b = lVar;
        }

        /* renamed from: a */
        public final long mo14775a() {
            return this.f13653a;
        }

        /* renamed from: b */
        public final C5306l mo14776b() {
            return this.f13654b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r5.f13654b, (java.lang.Object) r6.f13654b) != false) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                if (r5 == r6) goto L_0x001d
                boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a
                if (r0 == 0) goto L_0x001b
                io.stashteam.stashapp.e.a.d.a$a r6 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a) r6
                long r0 = r5.f13653a
                long r2 = r6.f13653a
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001b
                io.stashteam.stashapp.e.c.l r0 = r5.f13654b
                io.stashteam.stashapp.e.c.l r6 = r6.f13654b
                boolean r6 = p308k.p323z.p325d.C5942k.m22326a(r0, r6)
                if (r6 == 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r6 = 0
                return r6
            L_0x001d:
                r6 = 1
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int a = C3085d.m12547a(this.f13653a) * 31;
            C5306l lVar = this.f13654b;
            return a + (lVar != null ? lVar.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(gameId=");
            sb.append(this.f13653a);
            sb.append(", gameReview=");
            sb.append(this.f13654b);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.ChangeStatusInteractor", mo15594f = "ChangeStatusInteractor.kt", mo15595l = {19, 20, 21, 22}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.a$b */
    static final class C5229b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13655i;

        /* renamed from: j */
        int f13656j;

        /* renamed from: k */
        final /* synthetic */ C5227a f13657k;

        /* renamed from: l */
        Object f13658l;

        /* renamed from: m */
        Object f13659m;

        /* renamed from: n */
        Object f13660n;

        /* renamed from: o */
        Object f13661o;

        C5229b(C5227a aVar, C5866d dVar) {
            this.f13657k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13655i = obj;
            this.f13656j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13657k.mo14718a((C5228a) null, (C5866d<? super C5298g>) this);
        }
    }

    public C5227a(C4964c cVar, C5261b bVar, C5283b bVar2, C5196i iVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(bVar, "detailGameMapper");
        C5942k.m22327b(bVar2, "changeStatusRequestMapper");
        C5942k.m22327b(iVar, "syncStatisticInteractor");
        this.f13649a = cVar;
        this.f13650b = bVar;
        this.f13651c = bVar2;
        this.f13652d = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00db A[PHI: r12 
      PHI: (r12v2 java.lang.Object) = (r12v4 java.lang.Object), (r12v1 java.lang.Object) binds: [B:31:0x00d8, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a r11, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5298g> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5229b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            io.stashteam.stashapp.e.a.d.a$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5229b) r0
            int r1 = r0.f13656j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13656j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.a$b r0 = new io.stashteam.stashapp.e.a.d.a$b
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f13655i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13656j
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x007f
            if (r2 == r6) goto L_0x0073
            if (r2 == r5) goto L_0x0060
            if (r2 == r4) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r11 = r0.f13661o
            io.stashteam.stashapp.data.network.response.DetailGameResponse r11 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r11
            java.lang.Object r11 = r0.f13660n
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r11 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r11
            java.lang.Object r11 = r0.f13659m
            io.stashteam.stashapp.e.a.d.a$a r11 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a) r11
            java.lang.Object r11 = r0.f13658l
            io.stashteam.stashapp.e.a.d.a r11 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a) r11
            p308k.C5806n.m22054a(r12)
            goto L_0x00db
        L_0x0043:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004b:
            java.lang.Object r11 = r0.f13661o
            io.stashteam.stashapp.data.network.response.DetailGameResponse r11 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r11
            java.lang.Object r2 = r0.f13660n
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r2 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r2
            java.lang.Object r4 = r0.f13659m
            io.stashteam.stashapp.e.a.d.a$a r4 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a) r4
            java.lang.Object r5 = r0.f13658l
            io.stashteam.stashapp.e.a.d.a r5 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a) r5
            p308k.C5806n.m22054a(r12)
            goto L_0x00c8
        L_0x0060:
            java.lang.Object r11 = r0.f13660n
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r11 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r11
            java.lang.Object r2 = r0.f13659m
            io.stashteam.stashapp.e.a.d.a$a r2 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a) r2
            java.lang.Object r5 = r0.f13658l
            io.stashteam.stashapp.e.a.d.a r5 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a) r5
            p308k.C5806n.m22054a(r12)
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x00b1
        L_0x0073:
            java.lang.Object r11 = r0.f13659m
            io.stashteam.stashapp.e.a.d.a$a r11 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.C5228a) r11
            java.lang.Object r2 = r0.f13658l
            io.stashteam.stashapp.e.a.d.a r2 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a) r2
            p308k.C5806n.m22054a(r12)
            goto L_0x0096
        L_0x007f:
            p308k.C5806n.m22054a(r12)
            io.stashteam.stashapp.e.b.d.b r12 = r10.f13651c
            io.stashteam.stashapp.e.c.l r2 = r11.mo14776b()
            r0.f13658l = r10
            r0.f13659m = r11
            r0.f13656j = r6
            java.lang.Object r12 = r12.mo14344a(r2, r0)
            if (r12 != r1) goto L_0x0095
            return r1
        L_0x0095:
            r2 = r10
        L_0x0096:
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r12 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r12
            io.stashteam.stashapp.b.d.c r6 = r2.f13649a
            long r7 = r11.mo14775a()
            r0.f13658l = r2
            r0.f13659m = r11
            r0.f13660n = r12
            r0.f13656j = r5
            java.lang.Object r5 = r6.mo14169a(r7, r12, r0)
            if (r5 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r9 = r2
            r2 = r12
            r12 = r5
            r5 = r9
        L_0x00b1:
            io.stashteam.stashapp.data.network.response.DetailGameResponse r12 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r12
            io.stashteam.stashapp.e.a.a.i r6 = r5.f13652d
            r0.f13658l = r5
            r0.f13659m = r11
            r0.f13660n = r2
            r0.f13661o = r12
            r0.f13656j = r4
            java.lang.Object r4 = r6.mo14729a(r0)
            if (r4 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            r4 = r11
            r11 = r12
        L_0x00c8:
            io.stashteam.stashapp.e.b.b.b r12 = r5.f13650b
            r0.f13658l = r5
            r0.f13659m = r4
            r0.f13660n = r2
            r0.f13661o = r11
            r0.f13656j = r3
            java.lang.Object r12 = r12.mo14344a(r11, r0)
            if (r12 != r1) goto L_0x00db
            return r1
        L_0x00db:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5227a.mo14718a(io.stashteam.stashapp.e.a.d.a$a, k.w.d):java.lang.Object");
    }
}
