package p255io.stashteam.stashapp.p256b.p261d;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p071f.p131r.C3490d.C3492b;
import p071f.p133t.p134a.C3544e;
import p255io.stashteam.stashapp.data.local.p264db.InMemoryDatabase;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5169d;
import p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d;
import p255io.stashteam.stashapp.data.network.model.GameStatisticApiModel;
import p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest;
import p255io.stashteam.stashapp.data.network.response.DetailGameResponse;
import p255io.stashteam.stashapp.data.network.response.PagingResponse;
import p255io.stashteam.stashapp.data.network.response.ReviewResponse;
import p255io.stashteam.stashapp.data.network.response.ShortGameResponse;
import p255io.stashteam.stashapp.p256b.p260c.C4942a;
import p255io.stashteam.stashapp.p256b.p260c.C4942a.C4943a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.b.d.c */
public final class C4964c {

    /* renamed from: a */
    private final C4942a f12944a;

    /* renamed from: b */
    private final InMemoryDatabase f12945b;

    /* renamed from: c */
    private final C5169d f12946c;

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.GameRepository", mo15594f = "GameRepository.kt", mo15595l = {40, 41, 42}, mo15596m = "changeGameStatus")
    /* renamed from: io.stashteam.stashapp.b.d.c$a */
    static final class C4965a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12947i;

        /* renamed from: j */
        int f12948j;

        /* renamed from: k */
        final /* synthetic */ C4964c f12949k;

        /* renamed from: l */
        Object f12950l;

        /* renamed from: m */
        Object f12951m;

        /* renamed from: n */
        Object f12952n;

        /* renamed from: o */
        Object f12953o;

        /* renamed from: p */
        long f12954p;

        C4965a(C4964c cVar, C5866d dVar) {
            this.f12949k = cVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12947i = obj;
            this.f12948j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12949k.mo14169a(0, (ChangeStatusRequest) null, (C5866d<? super DetailGameResponse>) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.repository.GameRepository", mo15594f = "GameRepository.kt", mo15595l = {47, 48}, mo15596m = "deleteGameStatus")
    /* renamed from: io.stashteam.stashapp.b.d.c$b */
    static final class C4966b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f12955i;

        /* renamed from: j */
        int f12956j;

        /* renamed from: k */
        final /* synthetic */ C4964c f12957k;

        /* renamed from: l */
        Object f12958l;

        /* renamed from: m */
        Object f12959m;

        /* renamed from: n */
        long f12960n;

        C4966b(C4964c cVar, C5866d dVar) {
            this.f12957k = cVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f12955i = obj;
            this.f12956j |= RecyclerView.UNDEFINED_DURATION;
            return this.f12957k.mo14171a(0, (C5866d<? super DetailGameResponse>) this);
        }
    }

    public C4964c(C4942a aVar, InMemoryDatabase inMemoryDatabase, C5169d dVar) {
        C5942k.m22327b(aVar, "apiRestService");
        C5942k.m22327b(inMemoryDatabase, "inMemoryDatabase");
        C5942k.m22327b(dVar, "shortGameEntityFromDetailMapper");
        this.f12944a = aVar;
        this.f12945b = inMemoryDatabase;
        this.f12946c = dVar;
    }

    /* renamed from: a */
    public final C3492b<Integer, C5178d> mo14165a(C3544e eVar) {
        C5942k.m22327b(eVar, "query");
        return this.f12945b.mo14282q().mo14309a(eVar);
    }

    /* renamed from: a */
    public final Object mo14166a(int i, int i2, String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14126c(i, i2, str, dVar);
    }

    /* renamed from: a */
    public final Object mo14167a(int i, int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14119b(i, i2, dVar);
    }

    /* renamed from: a */
    public final Object mo14168a(long j, int i, int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return C4943a.m19796a(this.f12944a, j, i, i2, "RELEASE_DATE", "DESC", null, dVar, 32, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb A[PHI: r9 
      PHI: (r9v1 io.stashteam.stashapp.data.network.response.DetailGameResponse) = (r9v2 io.stashteam.stashapp.data.network.response.DetailGameResponse), (r9v13 io.stashteam.stashapp.data.network.response.DetailGameResponse) binds: [B:25:0x00b8, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14169a(long r9, p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest r11, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.network.response.DetailGameResponse> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof p255io.stashteam.stashapp.p256b.p261d.C4964c.C4965a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            io.stashteam.stashapp.b.d.c$a r0 = (p255io.stashteam.stashapp.p256b.p261d.C4964c.C4965a) r0
            int r1 = r0.f12948j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12948j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.c$a r0 = new io.stashteam.stashapp.b.d.c$a
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f12947i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12948j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x006f
            if (r2 == r5) goto L_0x005c
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r9 = r0.f12953o
            io.stashteam.stashapp.data.local.db.d.d r9 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d) r9
            java.lang.Object r9 = r0.f12952n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r9 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r9
            java.lang.Object r10 = r0.f12951m
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r10 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r10
            long r10 = r0.f12954p
            java.lang.Object r10 = r0.f12950l
            io.stashteam.stashapp.b.d.c r10 = (p255io.stashteam.stashapp.p256b.p261d.C4964c) r10
            p308k.C5806n.m22054a(r12)
            goto L_0x00bb
        L_0x0042:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004a:
            java.lang.Object r9 = r0.f12952n
            io.stashteam.stashapp.data.network.response.DetailGameResponse r9 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r9
            java.lang.Object r10 = r0.f12951m
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r10 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r10
            long r4 = r0.f12954p
            java.lang.Object r11 = r0.f12950l
            io.stashteam.stashapp.b.d.c r11 = (p255io.stashteam.stashapp.p256b.p261d.C4964c) r11
            p308k.C5806n.m22054a(r12)
            goto L_0x00a0
        L_0x005c:
            java.lang.Object r9 = r0.f12951m
            r11 = r9
            io.stashteam.stashapp.data.network.request.ChangeStatusRequest r11 = (p255io.stashteam.stashapp.data.network.request.ChangeStatusRequest) r11
            long r9 = r0.f12954p
            java.lang.Object r2 = r0.f12950l
            io.stashteam.stashapp.b.d.c r2 = (p255io.stashteam.stashapp.p256b.p261d.C4964c) r2
            p308k.C5806n.m22054a(r12)
            r6 = r12
            r12 = r11
            r11 = r2
            r2 = r6
            goto L_0x0086
        L_0x006f:
            p308k.C5806n.m22054a(r12)
            io.stashteam.stashapp.b.c.a r12 = r8.f12944a
            r0.f12950l = r8
            r0.f12954p = r9
            r0.f12951m = r11
            r0.f12948j = r5
            java.lang.Object r12 = r12.mo14107a(r9, r11, r0)
            if (r12 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r12
            r12 = r11
            r11 = r8
        L_0x0086:
            io.stashteam.stashapp.data.network.response.DetailGameResponse r2 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r2
            io.stashteam.stashapp.data.local.db.c.d r5 = r11.f12946c
            r0.f12950l = r11
            r0.f12954p = r9
            r0.f12951m = r12
            r0.f12952n = r2
            r0.f12948j = r4
            java.lang.Object r4 = r5.mo14344a(r2, r0)
            if (r4 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r6 = r9
            r10 = r12
            r9 = r2
            r12 = r4
            r4 = r6
        L_0x00a0:
            io.stashteam.stashapp.data.local.db.d.d r12 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5178d) r12
            io.stashteam.stashapp.data.local.db.InMemoryDatabase r2 = r11.f12945b
            io.stashteam.stashapp.data.local.db.b.d r2 = r2.mo14282q()
            r0.f12950l = r11
            r0.f12954p = r4
            r0.f12951m = r10
            r0.f12952n = r9
            r0.f12953o = r12
            r0.f12948j = r3
            java.lang.Object r10 = r2.mo14291b(r12, r0)
            if (r10 != r1) goto L_0x00bb
            return r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4964c.mo14169a(long, io.stashteam.stashapp.data.network.request.ChangeStatusRequest, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo14170a(long j, String str, int i, int i2, String str2, String str3, String str4, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14108a(j, str, i, i2, str2, str3, str4, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo14171a(long r6, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.data.network.response.DetailGameResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p255io.stashteam.stashapp.p256b.p261d.C4964c.C4966b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.stashteam.stashapp.b.d.c$b r0 = (p255io.stashteam.stashapp.p256b.p261d.C4964c.C4966b) r0
            int r1 = r0.f12956j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12956j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.b.d.c$b r0 = new io.stashteam.stashapp.b.d.c$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f12955i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f12956j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.f12959m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r6 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r6
            long r1 = r0.f12960n
            java.lang.Object r7 = r0.f12958l
            io.stashteam.stashapp.b.d.c r7 = (p255io.stashteam.stashapp.p256b.p261d.C4964c) r7
            p308k.C5806n.m22054a(r8)
            goto L_0x0073
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            long r6 = r0.f12960n
            java.lang.Object r2 = r0.f12958l
            io.stashteam.stashapp.b.d.c r2 = (p255io.stashteam.stashapp.p256b.p261d.C4964c) r2
            p308k.C5806n.m22054a(r8)
            goto L_0x005b
        L_0x0048:
            p308k.C5806n.m22054a(r8)
            io.stashteam.stashapp.b.c.a r8 = r5.f12944a
            r0.f12958l = r5
            r0.f12960n = r6
            r0.f12956j = r4
            java.lang.Object r8 = r8.mo14109a(r6, r0)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r5
        L_0x005b:
            io.stashteam.stashapp.data.network.response.DetailGameResponse r8 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r8
            io.stashteam.stashapp.data.local.db.InMemoryDatabase r4 = r2.f12945b
            io.stashteam.stashapp.data.local.db.b.d r4 = r4.mo14282q()
            r0.f12958l = r2
            r0.f12960n = r6
            r0.f12959m = r8
            r0.f12956j = r3
            java.lang.Object r6 = r4.mo14310a(r6, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r6 = r8
        L_0x0073:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p256b.p261d.C4964c.mo14171a(long, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo14172a(String str, int i, int i2, String str2, String str3, String str4, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14111a(str, i, i2, str2, str3, str4, dVar);
    }

    /* renamed from: a */
    public final Object mo14173a(String str, int i, int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14112a(str, i, i2, dVar);
    }

    /* renamed from: a */
    public final Object mo14174a(String str, long j, int i, int i2, C5866d<? super PagingResponse<ReviewResponse>> dVar) {
        return this.f12944a.mo14113a(str, j, i, i2, "DATE_ADDED", "DESC", dVar);
    }

    /* renamed from: a */
    public final Object mo14175a(String str, C5866d<? super C5812t> dVar) {
        Object a = this.f12945b.mo14282q().mo14311a(str, dVar);
        return a == C5885d.m22250a() ? a : C5812t.f14872a;
    }

    /* renamed from: a */
    public final Object mo14176a(List<C5178d> list, C5866d<? super C5812t> dVar) {
        Object a = this.f12945b.mo14282q().mo14290a(list, dVar);
        return a == C5885d.m22250a() ? a : C5812t.f14872a;
    }

    /* renamed from: b */
    public final Object mo14177b(int i, int i2, String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14117b(i, i2, "POPULARITY", "DESC", str, dVar);
    }

    /* renamed from: b */
    public final Object mo14178b(long j, int i, int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14120b(j, i, i2, "RELEASE_DATE", "DESC", dVar);
    }

    /* renamed from: b */
    public final Object mo14179b(long j, C5866d<? super DetailGameResponse> dVar) {
        return this.f12944a.mo14128c(j, dVar);
    }

    /* renamed from: b */
    public final Object mo14180b(String str, C5866d<? super Integer> dVar) {
        return this.f12945b.mo14282q().mo14313b(str, dVar);
    }

    /* renamed from: c */
    public final Object mo14181c(int i, int i2, String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14130d(i, i2, str, dVar);
    }

    /* renamed from: c */
    public final Object mo14182c(long j, int i, int i2, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14127c(j, i, i2, "RELEASE_DATE", "DESC", dVar);
    }

    /* renamed from: c */
    public final Object mo14183c(long j, C5866d<? super GameStatisticApiModel> dVar) {
        return this.f12944a.mo14135f(j, dVar);
    }

    /* renamed from: d */
    public final Object mo14184d(int i, int i2, String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14102a(i, i2, str, dVar);
    }

    /* renamed from: e */
    public final Object mo14185e(int i, int i2, String str, C5866d<? super PagingResponse<ShortGameResponse>> dVar) {
        return this.f12944a.mo14118b(i, i2, str, dVar);
    }
}
