package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5166a;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p280c.C5314s;
import p255io.stashteam.stashapp.utils.p305g.C5716b;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.j */
public final class C5223j implements C5201a<C5716b, C5314s> {

    /* renamed from: a */
    private final C4957b f13632a;

    /* renamed from: b */
    private final C5166a f13633b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.LoadOwnCustomListsInteractor", mo15594f = "LoadOwnCustomListsInteractor.kt", mo15595l = {15, 17, 18}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.j$a */
    static final class C5224a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13634i;

        /* renamed from: j */
        int f13635j;

        /* renamed from: k */
        final /* synthetic */ C5223j f13636k;

        /* renamed from: l */
        Object f13637l;

        /* renamed from: m */
        Object f13638m;

        /* renamed from: n */
        Object f13639n;

        /* renamed from: o */
        Object f13640o;

        C5224a(C5223j jVar, C5866d dVar) {
            this.f13636k = jVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13634i = obj;
            this.f13635j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13636k.mo14718a((C5716b) null, (C5866d<? super C5314s>) this);
        }
    }

    public C5223j(C4957b bVar, C5166a aVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        C5942k.m22327b(aVar, "customListEntityMapper");
        this.f13632a = bVar;
        this.f13633b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.utils.p305g.C5716b r13, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5314s> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j.C5224a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.stashteam.stashapp.e.a.c.j$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j.C5224a) r0
            int r1 = r0.f13635j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13635j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.j$a r0 = new io.stashteam.stashapp.e.a.c.j$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f13634i
            java.lang.Object r8 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f13635j
            r9 = 3
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0065
            if (r1 == r2) goto L_0x0058
            if (r1 == r10) goto L_0x0048
            if (r1 != r9) goto L_0x0040
            java.lang.Object r13 = r0.f13640o
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r13 = r0.f13639n
            io.stashteam.stashapp.data.network.response.PagingResponse r13 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r13
            java.lang.Object r1 = r0.f13638m
            io.stashteam.stashapp.utils.g.b r1 = (p255io.stashteam.stashapp.utils.p305g.C5716b) r1
            java.lang.Object r0 = r0.f13637l
            io.stashteam.stashapp.e.a.c.j r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j) r0
            p308k.C5806n.m22054a(r14)
            goto L_0x00b5
        L_0x0040:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0048:
            java.lang.Object r13 = r0.f13639n
            io.stashteam.stashapp.data.network.response.PagingResponse r13 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r13
            java.lang.Object r1 = r0.f13638m
            io.stashteam.stashapp.utils.g.b r1 = (p255io.stashteam.stashapp.utils.p305g.C5716b) r1
            java.lang.Object r2 = r0.f13637l
            io.stashteam.stashapp.e.a.c.j r2 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j) r2
            p308k.C5806n.m22054a(r14)
            goto L_0x00a0
        L_0x0058:
            java.lang.Object r13 = r0.f13638m
            io.stashteam.stashapp.utils.g.b r13 = (p255io.stashteam.stashapp.utils.p305g.C5716b) r13
            java.lang.Object r1 = r0.f13637l
            io.stashteam.stashapp.e.a.c.j r1 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j) r1
            p308k.C5806n.m22054a(r14)
            r2 = r1
            goto L_0x0085
        L_0x0065:
            p308k.C5806n.m22054a(r14)
            io.stashteam.stashapp.b.d.b r1 = r12.f13632a
            int r14 = r13.mo15349a()
            int r3 = r13.mo15350b()
            r4 = 0
            r6 = 4
            r7 = 0
            r0.f13637l = r12
            r0.f13638m = r13
            r0.f13635j = r2
            r2 = r14
            r5 = r0
            java.lang.Object r14 = p255io.stashteam.stashapp.p256b.p261d.C4957b.m19842a(r1, r2, r3, r4, r5, r6, r7)
            if (r14 != r8) goto L_0x0084
            return r8
        L_0x0084:
            r2 = r12
        L_0x0085:
            io.stashteam.stashapp.data.network.response.PagingResponse r14 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r14
            io.stashteam.stashapp.data.local.db.c.a r1 = r2.f13633b
            java.util.List r3 = r14.getItems()
            r0.f13637l = r2
            r0.f13638m = r13
            r0.f13639n = r14
            r0.f13635j = r10
            java.lang.Object r1 = r1.mo14345a(r3, r0)
            if (r1 != r8) goto L_0x009c
            return r8
        L_0x009c:
            r11 = r1
            r1 = r13
            r13 = r14
            r14 = r11
        L_0x00a0:
            java.util.List r14 = (java.util.List) r14
            io.stashteam.stashapp.b.d.b r3 = r2.f13632a
            r0.f13637l = r2
            r0.f13638m = r1
            r0.f13639n = r13
            r0.f13640o = r14
            r0.f13635j = r9
            java.lang.Object r14 = r3.mo14161a(r14, r0)
            if (r14 != r8) goto L_0x00b5
            return r8
        L_0x00b5:
            int r14 = r13.getLimit()
            int r0 = r13.getOffset()
            int r1 = r13.getTotal()
            java.util.List r13 = r13.getItems()
            int r13 = r13.size()
            io.stashteam.stashapp.e.c.s r2 = new io.stashteam.stashapp.e.c.s
            r2.<init>(r14, r0, r1, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5223j.mo14718a(io.stashteam.stashapp.utils.g.b, k.w.d):java.lang.Object");
    }
}
