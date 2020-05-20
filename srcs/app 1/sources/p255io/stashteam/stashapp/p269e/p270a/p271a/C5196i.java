package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5173f;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.i */
public final class C5196i {

    /* renamed from: a */
    private final C4944a f13550a;

    /* renamed from: b */
    private final C5173f f13551b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.SyncStatisticInteractor", mo15594f = "SyncStatisticInteractor.kt", mo15595l = {13, 14, 16, 17}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.i$a */
    static final class C5197a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13552i;

        /* renamed from: j */
        int f13553j;

        /* renamed from: k */
        final /* synthetic */ C5196i f13554k;

        /* renamed from: l */
        Object f13555l;

        /* renamed from: m */
        Object f13556m;

        /* renamed from: n */
        Object f13557n;

        /* renamed from: o */
        Object f13558o;

        C5197a(C5196i iVar, C5866d dVar) {
            this.f13554k = iVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13552i = obj;
            this.f13553j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13554k.mo14729a(this);
        }
    }

    public C5196i(C4944a aVar, C5173f fVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(fVar, "statisticEntityMapper");
        this.f13550a = aVar;
        this.f13551b = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14729a(p308k.p316w.C5866d<? super p308k.C5812t> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i.C5197a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.stashteam.stashapp.e.a.a.i$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i.C5197a) r0
            int r1 = r0.f13553j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13553j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.i$a r0 = new io.stashteam.stashapp.e.a.a.i$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f13552i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13553j
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 == r6) goto L_0x0069
            if (r2 == r5) goto L_0x005b
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r1 = r0.f13557n
            io.stashteam.stashapp.data.local.db.d.f r1 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r1
            java.lang.Object r1 = r0.f13556m
            io.stashteam.stashapp.data.network.model.StatisticApiModel r1 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r1
            java.lang.Object r0 = r0.f13555l
            io.stashteam.stashapp.e.a.a.i r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i) r0
            p308k.C5806n.m22054a(r9)
            goto L_0x00c7
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0047:
            java.lang.Object r2 = r0.f13558o
            io.stashteam.stashapp.data.local.db.d.f r2 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r2
            java.lang.Object r4 = r0.f13557n
            io.stashteam.stashapp.data.local.db.d.f r4 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r4
            java.lang.Object r5 = r0.f13556m
            io.stashteam.stashapp.data.network.model.StatisticApiModel r5 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r5
            java.lang.Object r6 = r0.f13555l
            io.stashteam.stashapp.e.a.a.i r6 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i) r6
            p308k.C5806n.m22054a(r9)
            goto L_0x00b1
        L_0x005b:
            java.lang.Object r2 = r0.f13556m
            io.stashteam.stashapp.data.network.model.StatisticApiModel r2 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r2
            java.lang.Object r5 = r0.f13555l
            io.stashteam.stashapp.e.a.a.i r5 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i) r5
            p308k.C5806n.m22054a(r9)
            r6 = r5
            r5 = r2
            goto L_0x0098
        L_0x0069:
            java.lang.Object r2 = r0.f13555l
            io.stashteam.stashapp.e.a.a.i r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i) r2
            p308k.C5806n.m22054a(r9)
            goto L_0x0083
        L_0x0071:
            p308k.C5806n.m22054a(r9)
            io.stashteam.stashapp.b.d.a r9 = r8.f13550a
            r0.f13555l = r8
            r0.f13553j = r6
            r2 = 0
            java.lang.Object r9 = p255io.stashteam.stashapp.p256b.p261d.C4944a.m19802b(r9, r2, r0, r6, r2)
            if (r9 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r2 = r8
        L_0x0083:
            io.stashteam.stashapp.data.network.model.StatisticApiModel r9 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r9
            io.stashteam.stashapp.b.d.a r6 = r2.f13550a
            r0.f13555l = r2
            r0.f13556m = r9
            r0.f13553j = r5
            java.lang.Object r5 = r6.mo14142a(r0)
            if (r5 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r6 = r2
            r7 = r5
            r5 = r9
            r9 = r7
        L_0x0098:
            r2 = r9
            io.stashteam.stashapp.data.local.db.d.f r2 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r2
            if (r2 == 0) goto L_0x00c7
            io.stashteam.stashapp.data.local.db.c.f r9 = r6.f13551b
            r0.f13555l = r6
            r0.f13556m = r5
            r0.f13557n = r2
            r0.f13558o = r2
            r0.f13553j = r4
            java.lang.Object r9 = r9.mo14344a(r5, r0)
            if (r9 != r1) goto L_0x00b0
            return r1
        L_0x00b0:
            r4 = r2
        L_0x00b1:
            io.stashteam.stashapp.data.local.db.d.e r9 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e) r9
            r2.mo14396a(r9)
            io.stashteam.stashapp.b.d.a r9 = r6.f13550a
            r0.f13555l = r6
            r0.f13556m = r5
            r0.f13557n = r4
            r0.f13553j = r3
            java.lang.Object r9 = r9.mo14138a(r4, r0)
            if (r9 != r1) goto L_0x00c7
            return r1
        L_0x00c7:
            k.t r9 = p308k.C5812t.f14872a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i.mo14729a(k.w.d):java.lang.Object");
    }
}
