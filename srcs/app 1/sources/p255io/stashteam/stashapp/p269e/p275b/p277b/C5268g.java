package p255io.stashteam.stashapp.p269e.p275b.p277b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.data.network.response.ReviewResponse;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a;
import p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a;
import p255io.stashteam.stashapp.p269e.p280c.C5320w;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.b.b.g */
public final class C5268g implements C5257a<ReviewResponse, C5320w> {

    /* renamed from: a */
    private final C5274k f13792a;

    /* renamed from: b */
    private final C5264c f13793b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.mapper.from_api.ReviewMapper", mo15594f = "ReviewMapper.kt", mo15595l = {17, 19}, mo15596m = "map")
    /* renamed from: io.stashteam.stashapp.e.b.b.g$a */
    static final class C5269a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13794i;

        /* renamed from: j */
        int f13795j;

        /* renamed from: k */
        final /* synthetic */ C5268g f13796k;

        /* renamed from: l */
        Object f13797l;

        /* renamed from: m */
        Object f13798m;

        /* renamed from: n */
        Object f13799n;

        /* renamed from: o */
        Object f13800o;

        /* renamed from: p */
        Object f13801p;

        C5269a(C5268g gVar, C5866d dVar) {
            this.f13796k = gVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13794i = obj;
            this.f13795j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13796k.mo14344a((ReviewResponse) null, (C5866d<? super C5320w>) this);
        }
    }

    public C5268g(C5274k kVar, C5264c cVar) {
        C5942k.m22327b(kVar, "userFromApiMapper");
        C5942k.m22327b(cVar, "gameReviewFromApiMapper");
        this.f13792a = kVar;
        this.f13793b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14344a(p255io.stashteam.stashapp.data.network.response.ReviewResponse r9, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5320w> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p255io.stashteam.stashapp.p269e.p275b.p277b.C5268g.C5269a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            io.stashteam.stashapp.e.b.b.g$a r0 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5268g.C5269a) r0
            int r1 = r0.f13795j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13795j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.b.b.g$a r0 = new io.stashteam.stashapp.e.b.b.g$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f13794i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13795j
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x005c
            if (r2 == r3) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            java.lang.Object r9 = r0.f13801p
            io.stashteam.stashapp.e.c.d0 r9 = (p255io.stashteam.stashapp.p269e.p280c.C5294d0) r9
            java.lang.Object r1 = r0.f13800o
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r1 = (p255io.stashteam.stashapp.data.network.model.GameReviewApiModel) r1
            java.lang.Object r1 = r0.f13799n
            io.stashteam.stashapp.data.network.response.ReviewResponse r1 = (p255io.stashteam.stashapp.data.network.response.ReviewResponse) r1
            java.lang.Object r1 = r0.f13798m
            io.stashteam.stashapp.data.network.response.ReviewResponse r1 = (p255io.stashteam.stashapp.data.network.response.ReviewResponse) r1
            java.lang.Object r0 = r0.f13797l
            io.stashteam.stashapp.e.b.b.g r0 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5268g) r0
            p308k.C5806n.m22054a(r10)
            goto L_0x00a2
        L_0x0040:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0048:
            java.lang.Object r9 = r0.f13800o
            io.stashteam.stashapp.data.network.model.UserApiModel r9 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r9
            java.lang.Object r9 = r0.f13799n
            io.stashteam.stashapp.data.network.response.ReviewResponse r9 = (p255io.stashteam.stashapp.data.network.response.ReviewResponse) r9
            java.lang.Object r2 = r0.f13798m
            io.stashteam.stashapp.data.network.response.ReviewResponse r2 = (p255io.stashteam.stashapp.data.network.response.ReviewResponse) r2
            java.lang.Object r3 = r0.f13797l
            io.stashteam.stashapp.e.b.b.g r3 = (p255io.stashteam.stashapp.p269e.p275b.p277b.C5268g) r3
            p308k.C5806n.m22054a(r10)
            goto L_0x0080
        L_0x005c:
            p308k.C5806n.m22054a(r10)
            io.stashteam.stashapp.data.network.model.UserApiModel r10 = r9.getUser()
            if (r10 == 0) goto L_0x00b4
            io.stashteam.stashapp.e.b.b.k r2 = r8.f13792a
            io.stashteam.stashapp.data.network.model.AccountDataApiModel r5 = new io.stashteam.stashapp.data.network.model.AccountDataApiModel
            r6 = 0
            r5.<init>(r10, r6, r4, r6)
            r0.f13797l = r8
            r0.f13798m = r9
            r0.f13799n = r9
            r0.f13800o = r10
            r0.f13795j = r3
            java.lang.Object r10 = r2.mo14344a(r5, r0)
            if (r10 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r3 = r8
            r2 = r9
        L_0x0080:
            io.stashteam.stashapp.e.c.d0 r10 = (p255io.stashteam.stashapp.p269e.p280c.C5294d0) r10
            if (r10 == 0) goto L_0x00b4
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r5 = r9.getReview()
            if (r5 == 0) goto L_0x00ac
            io.stashteam.stashapp.e.b.b.c r6 = r3.f13793b
            r0.f13797l = r3
            r0.f13798m = r2
            r0.f13799n = r9
            r0.f13800o = r5
            r0.f13801p = r10
            r0.f13795j = r4
            java.lang.Object r9 = r6.mo14344a(r5, r0)
            if (r9 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00a2:
            io.stashteam.stashapp.e.c.l r10 = (p255io.stashteam.stashapp.p269e.p280c.C5306l) r10
            if (r10 == 0) goto L_0x00ac
            io.stashteam.stashapp.e.c.w r0 = new io.stashteam.stashapp.e.c.w
            r0.<init>(r9, r10)
            return r0
        L_0x00ac:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "GameReview can't be null."
            r9.<init>(r10)
            throw r9
        L_0x00b4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "User can't be null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p275b.p277b.C5268g.mo14344a(io.stashteam.stashapp.data.network.response.ReviewResponse, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo14839a(List<ReviewResponse> list, C5866d<? super List<C5320w>> dVar) {
        return C5258a.m20632a(this, list, dVar);
    }
}
