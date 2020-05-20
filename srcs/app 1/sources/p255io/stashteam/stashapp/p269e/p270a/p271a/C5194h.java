package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5173f;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5174g;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.h */
public final class C5194h {

    /* renamed from: a */
    private final C4944a f13539a;

    /* renamed from: b */
    private final C5174g f13540b;

    /* renamed from: c */
    private final C5173f f13541c;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.SyncAccountInteractor", mo15594f = "SyncAccountInteractor.kt", mo15595l = {15, 16, 18, 19, 21}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.h$a */
    static final class C5195a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13542i;

        /* renamed from: j */
        int f13543j;

        /* renamed from: k */
        final /* synthetic */ C5194h f13544k;

        /* renamed from: l */
        Object f13545l;

        /* renamed from: m */
        Object f13546m;

        /* renamed from: n */
        Object f13547n;

        /* renamed from: o */
        Object f13548o;

        /* renamed from: p */
        Object f13549p;

        C5195a(C5194h hVar, C5866d dVar) {
            this.f13544k = hVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13542i = obj;
            this.f13543j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13544k.mo14728a(this);
        }
    }

    public C5194h(C4944a aVar, C5174g gVar, C5173f fVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(gVar, "userEntityMapper");
        C5942k.m22327b(fVar, "statisticEntityMapper");
        this.f13539a = aVar;
        this.f13540b = gVar;
        this.f13541c = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14728a(p308k.p316w.C5866d<? super p308k.C5812t> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h.C5195a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            io.stashteam.stashapp.e.a.a.h$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h.C5195a) r0
            int r1 = r0.f13543j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13543j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.h$a r0 = new io.stashteam.stashapp.e.a.a.h$a
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f13542i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13543j
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x008f
            if (r2 == r8) goto L_0x0087
            if (r2 == r6) goto L_0x007b
            if (r2 == r5) goto L_0x0068
            if (r2 == r4) goto L_0x004f
            if (r2 != r3) goto L_0x0047
            java.lang.Object r1 = r0.f13548o
            io.stashteam.stashapp.data.local.db.d.f r1 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r1
            java.lang.Object r1 = r0.f13547n
            io.stashteam.stashapp.data.network.model.StatisticApiModel r1 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r1
            java.lang.Object r1 = r0.f13546m
            io.stashteam.stashapp.data.network.model.UserApiModel r1 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r1
            java.lang.Object r0 = r0.f13545l
            io.stashteam.stashapp.e.a.a.h r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h) r0
            p308k.C5806n.m22054a(r12)
            goto L_0x00fe
        L_0x0047:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x004f:
            java.lang.Object r2 = r0.f13549p
            io.stashteam.stashapp.data.local.db.d.f r2 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r2
            java.lang.Object r4 = r0.f13548o
            io.stashteam.stashapp.data.local.db.d.f r4 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r4
            java.lang.Object r5 = r0.f13547n
            io.stashteam.stashapp.data.network.model.StatisticApiModel r5 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r5
            java.lang.Object r6 = r0.f13546m
            io.stashteam.stashapp.data.network.model.UserApiModel r6 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r6
            java.lang.Object r7 = r0.f13545l
            io.stashteam.stashapp.e.a.a.h r7 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h) r7
            p308k.C5806n.m22054a(r12)
            goto L_0x00e6
        L_0x0068:
            java.lang.Object r2 = r0.f13547n
            io.stashteam.stashapp.data.network.model.StatisticApiModel r2 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r2
            java.lang.Object r5 = r0.f13546m
            io.stashteam.stashapp.data.network.model.UserApiModel r5 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r5
            java.lang.Object r6 = r0.f13545l
            io.stashteam.stashapp.e.a.a.h r6 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h) r6
            p308k.C5806n.m22054a(r12)
            r7 = r6
            r6 = r5
            r5 = r2
            goto L_0x00cd
        L_0x007b:
            java.lang.Object r2 = r0.f13546m
            io.stashteam.stashapp.data.network.model.UserApiModel r2 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r2
            java.lang.Object r6 = r0.f13545l
            io.stashteam.stashapp.e.a.a.h r6 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h) r6
            p308k.C5806n.m22054a(r12)
            goto L_0x00b5
        L_0x0087:
            java.lang.Object r2 = r0.f13545l
            io.stashteam.stashapp.e.a.a.h r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h) r2
            p308k.C5806n.m22054a(r12)
            goto L_0x00a0
        L_0x008f:
            p308k.C5806n.m22054a(r12)
            io.stashteam.stashapp.b.d.a r12 = r11.f13539a
            r0.f13545l = r11
            r0.f13543j = r8
            java.lang.Object r12 = p255io.stashteam.stashapp.p256b.p261d.C4944a.m19799a(r12, r7, r0, r8, r7)
            if (r12 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r11
        L_0x00a0:
            io.stashteam.stashapp.data.network.model.UserApiModel r12 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r12
            io.stashteam.stashapp.b.d.a r9 = r2.f13539a
            r0.f13545l = r2
            r0.f13546m = r12
            r0.f13543j = r6
            java.lang.Object r6 = p255io.stashteam.stashapp.p256b.p261d.C4944a.m19802b(r9, r7, r0, r8, r7)
            if (r6 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r10 = r2
            r2 = r12
            r12 = r6
            r6 = r10
        L_0x00b5:
            io.stashteam.stashapp.data.network.model.StatisticApiModel r12 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r12
            io.stashteam.stashapp.data.local.db.c.g r7 = r6.f13540b
            r0.f13545l = r6
            r0.f13546m = r2
            r0.f13547n = r12
            r0.f13543j = r5
            java.lang.Object r5 = r7.mo14344a(r2, r0)
            if (r5 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            r7 = r6
            r6 = r2
            r10 = r5
            r5 = r12
            r12 = r10
        L_0x00cd:
            r2 = r12
            io.stashteam.stashapp.data.local.db.d.f r2 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r2
            io.stashteam.stashapp.data.local.db.c.f r12 = r7.f13541c
            r0.f13545l = r7
            r0.f13546m = r6
            r0.f13547n = r5
            r0.f13548o = r2
            r0.f13549p = r2
            r0.f13543j = r4
            java.lang.Object r12 = r12.mo14344a(r5, r0)
            if (r12 != r1) goto L_0x00e5
            return r1
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            io.stashteam.stashapp.data.local.db.d.e r12 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5179e) r12
            r2.mo14396a(r12)
            io.stashteam.stashapp.b.d.a r12 = r7.f13539a
            r0.f13545l = r7
            r0.f13546m = r6
            r0.f13547n = r5
            r0.f13548o = r4
            r0.f13543j = r3
            java.lang.Object r12 = r12.mo14138a(r4, r0)
            if (r12 != r1) goto L_0x00fe
            return r1
        L_0x00fe:
            k.t r12 = p308k.C5812t.f14872a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5194h.mo14728a(k.w.d):java.lang.Object");
    }
}
