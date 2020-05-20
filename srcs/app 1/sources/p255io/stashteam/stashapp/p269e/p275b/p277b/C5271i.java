package p255io.stashteam.stashapp.p269e.p275b.p277b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.data.network.response.ShortGameResponse;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.b.i */
public final class C5271i implements C5257a<ShortGameResponse, C5323z> {

    /* renamed from: a */
    private final C5264c f13802a;

    /* renamed from: b */
    private final C5266e f13803b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.mapper.from_api.ShortGameFromApiMapper", mo15594f = "ShortGameFromApiMapper.kt", mo15595l = {18, 20}, mo15596m = "map")
    /* renamed from: io.stashteam.stashapp.e.b.b.i$a */
    static final class C5272a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13804i;

        /* renamed from: j */
        int f13805j;

        /* renamed from: k */
        final /* synthetic */ C5271i f13806k;

        /* renamed from: l */
        Object f13807l;

        /* renamed from: m */
        Object f13808m;

        /* renamed from: n */
        Object f13809n;

        /* renamed from: o */
        Object f13810o;

        /* renamed from: p */
        Object f13811p;

        /* renamed from: q */
        Object f13812q;

        /* renamed from: r */
        long f13813r;

        C5272a(C5271i iVar, C5866d dVar) {
            this.f13806k = iVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13804i = obj;
            this.f13805j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13806k.mo14344a((ShortGameResponse) null, (C5866d<? super C5323z>) this);
        }
    }

    public C5271i(C5264c cVar, C5266e eVar) {
        C5942k.m22327b(cVar, "gameReviewMapper");
        C5942k.m22327b(eVar, "imageFromApiMapper");
        this.f13802a = cVar;
        this.f13803b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14344a(p255io.stashteam.stashapp.data.network.response.ShortGameResponse r14, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5323z> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i.C5272a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            io.stashteam.stashapp.e.b.b.i$a r0 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i.C5272a) r0
            int r1 = r0.f13805j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13805j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.b.b.i$a r0 = new io.stashteam.stashapp.e.b.b.i$a
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f13804i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13805j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x006a
            if (r2 == r5) goto L_0x0050
            if (r2 != r4) goto L_0x0048
            java.lang.Object r14 = r0.f13812q
            io.stashteam.stashapp.e.c.c r14 = (p255io.stashteam.stashapp.p269e.p280c.C5290c) r14
            java.lang.Object r1 = r0.f13811p
            io.stashteam.stashapp.e.c.p r1 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r1
            long r2 = r0.f13813r
            java.lang.Object r4 = r0.f13810o
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f13809n
            io.stashteam.stashapp.data.network.response.ShortGameResponse r5 = (p255io.stashteam.stashapp.data.network.response.ShortGameResponse) r5
            java.lang.Object r5 = r0.f13808m
            io.stashteam.stashapp.data.network.response.ShortGameResponse r5 = (p255io.stashteam.stashapp.data.network.response.ShortGameResponse) r5
            java.lang.Object r0 = r0.f13807l
            io.stashteam.stashapp.e.b.b.i r0 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i) r0
            p308k.C5806n.m22054a(r15)
            goto L_0x00e5
        L_0x0048:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0050:
            java.lang.Object r14 = r0.f13811p
            io.stashteam.stashapp.data.network.model.ImageApiModel r14 = (p255io.stashteam.stashapp.data.network.model.ImageApiModel) r14
            long r5 = r0.f13813r
            java.lang.Object r14 = r0.f13810o
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r2 = r0.f13809n
            io.stashteam.stashapp.data.network.response.ShortGameResponse r2 = (p255io.stashteam.stashapp.data.network.response.ShortGameResponse) r2
            java.lang.Object r7 = r0.f13808m
            io.stashteam.stashapp.data.network.response.ShortGameResponse r7 = (p255io.stashteam.stashapp.data.network.response.ShortGameResponse) r7
            java.lang.Object r8 = r0.f13807l
            io.stashteam.stashapp.e.b.b.i r8 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i) r8
            p308k.C5806n.m22054a(r15)
            goto L_0x00a4
        L_0x006a:
            p308k.C5806n.m22054a(r15)
            io.stashteam.stashapp.data.network.model.ShortGameApiModel r15 = r14.getGame()
            long r6 = r15.getId()
            io.stashteam.stashapp.data.network.model.ShortGameApiModel r15 = r14.getGame()
            java.lang.String r15 = r15.getName()
            io.stashteam.stashapp.data.network.model.ShortGameApiModel r2 = r14.getGame()
            io.stashteam.stashapp.data.network.model.ImageApiModel r2 = r2.getCover()
            if (r2 == 0) goto L_0x00aa
            io.stashteam.stashapp.e.b.b.e r8 = r13.f13803b
            r0.f13807l = r13
            r0.f13808m = r14
            r0.f13809n = r14
            r0.f13810o = r15
            r0.f13813r = r6
            r0.f13811p = r2
            r0.f13805j = r5
            java.lang.Object r2 = r8.mo14344a(r2, r0)
            if (r2 != r1) goto L_0x009e
            return r1
        L_0x009e:
            r8 = r13
            r5 = r6
            r7 = r14
            r14 = r15
            r15 = r2
            r2 = r7
        L_0x00a4:
            io.stashteam.stashapp.e.c.p r15 = (p255io.stashteam.stashapp.p269e.p280c.C5311p) r15
            r12 = r2
            r2 = r14
            r14 = r12
            goto L_0x00af
        L_0x00aa:
            r8 = r13
            r2 = r15
            r15 = r3
            r5 = r6
            r7 = r14
        L_0x00af:
            io.stashteam.stashapp.e.c.c$a r9 = p255io.stashteam.stashapp.p269e.p280c.C5290c.f13844j
            io.stashteam.stashapp.data.network.model.ShortGameApiModel r10 = r14.getGame()
            int r10 = r10.getCategory()
            io.stashteam.stashapp.e.c.c r9 = r9.mo14868a(r10)
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r10 = r14.getGameReview()
            if (r10 == 0) goto L_0x00ed
            io.stashteam.stashapp.e.b.b.c r3 = r8.f13802a
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r10 = r14.getGameReview()
            r0.f13807l = r8
            r0.f13808m = r7
            r0.f13809n = r14
            r0.f13810o = r2
            r0.f13813r = r5
            r0.f13811p = r15
            r0.f13812q = r9
            r0.f13805j = r4
            java.lang.Object r14 = r3.mo14344a(r10, r0)
            if (r14 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            r1 = r15
            r4 = r2
            r2 = r5
            r15 = r14
            r14 = r9
        L_0x00e5:
            io.stashteam.stashapp.e.c.l r15 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r15
            r10 = r14
            r11 = r15
            r9 = r1
            r6 = r2
            r8 = r4
            goto L_0x00f2
        L_0x00ed:
            r8 = r2
            r11 = r3
            r6 = r5
            r10 = r9
            r9 = r15
        L_0x00f2:
            io.stashteam.stashapp.e.c.z r14 = new io.stashteam.stashapp.e.c.z
            r5 = r14
            r5.<init>(r6, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i.mo14344a(io.stashteam.stashapp.data.network.response.ShortGameResponse, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo14842a(List<ShortGameResponse> list, C5866d<? super List<C5323z>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
