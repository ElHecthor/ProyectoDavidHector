package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5274k;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.c */
public final class C5185c implements C5201a<Long, C5294d0> {

    /* renamed from: a */
    private final C4944a f13511a;

    /* renamed from: b */
    private final C5274k f13512b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.LoadAccountInteractor", mo15594f = "LoadAccountInteractor.kt", mo15595l = {15, 16, 17}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.c$a */
    static final class C5186a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13513i;

        /* renamed from: j */
        int f13514j;

        /* renamed from: k */
        final /* synthetic */ C5185c f13515k;

        /* renamed from: l */
        Object f13516l;

        /* renamed from: m */
        Object f13517m;

        /* renamed from: n */
        Object f13518n;

        /* renamed from: o */
        long f13519o;

        C5186a(C5185c cVar, C5866d dVar) {
            this.f13515k = cVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13513i = obj;
            this.f13514j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13515k.mo14719a(0, (C5866d<? super C5294d0>) this);
        }
    }

    public C5185c(C4944a aVar, C5274k kVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(kVar, "userFromApiMapper");
        this.f13511a = aVar;
        this.f13512b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab A[PHI: r12 
      PHI: (r12v2 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:25:0x00a8, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14719a(long r10, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5294d0> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c.C5186a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            io.stashteam.stashapp.e.a.a.c$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c.C5186a) r0
            int r1 = r0.f13514j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13514j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.c$a r0 = new io.stashteam.stashapp.e.a.a.c$a
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f13513i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13514j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r5) goto L_0x0054
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r10 = r0.f13518n
            io.stashteam.stashapp.data.network.model.StatisticApiModel r10 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r10
            java.lang.Object r10 = r0.f13517m
            io.stashteam.stashapp.data.network.model.UserApiModel r10 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r10
            long r10 = r0.f13519o
            java.lang.Object r10 = r0.f13516l
            io.stashteam.stashapp.e.a.a.c r10 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c) r10
            p308k.C5806n.m22054a(r12)
            goto L_0x00ab
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            java.lang.Object r10 = r0.f13517m
            io.stashteam.stashapp.data.network.model.UserApiModel r10 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r10
            long r4 = r0.f13519o
            java.lang.Object r11 = r0.f13516l
            io.stashteam.stashapp.e.a.a.c r11 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c) r11
            p308k.C5806n.m22054a(r12)
            goto L_0x0091
        L_0x0054:
            long r10 = r0.f13519o
            java.lang.Object r2 = r0.f13516l
            io.stashteam.stashapp.e.a.a.c r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c) r2
            p308k.C5806n.m22054a(r12)
            goto L_0x0075
        L_0x005e:
            p308k.C5806n.m22054a(r12)
            io.stashteam.stashapp.b.d.a r12 = r9.f13511a
            java.lang.Long r2 = p308k.p316w.p318j.p319a.C5887b.m22261a(r10)
            r0.f13516l = r9
            r0.f13519o = r10
            r0.f13514j = r5
            java.lang.Object r12 = r12.mo14139a(r2, r0)
            if (r12 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r2 = r9
        L_0x0075:
            io.stashteam.stashapp.data.network.model.UserApiModel r12 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r12
            io.stashteam.stashapp.b.d.a r5 = r2.f13511a
            java.lang.Long r6 = p308k.p316w.p318j.p319a.C5887b.m22261a(r10)
            r0.f13516l = r2
            r0.f13519o = r10
            r0.f13517m = r12
            r0.f13514j = r4
            java.lang.Object r4 = r5.mo14146b(r6, r0)
            if (r4 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r7 = r10
            r10 = r12
            r11 = r2
            r12 = r4
            r4 = r7
        L_0x0091:
            io.stashteam.stashapp.data.network.model.StatisticApiModel r12 = (p255io.stashteam.stashapp.data.network.model.StatisticApiModel) r12
            io.stashteam.stashapp.e.b.b.k r2 = r11.f13512b
            io.stashteam.stashapp.data.network.model.AccountDataApiModel r6 = new io.stashteam.stashapp.data.network.model.AccountDataApiModel
            r6.<init>(r10, r12)
            r0.f13516l = r11
            r0.f13519o = r4
            r0.f13517m = r10
            r0.f13518n = r12
            r0.f13514j = r3
            java.lang.Object r12 = r2.mo14344a(r6, r0)
            if (r12 != r1) goto L_0x00ab
            return r1
        L_0x00ab:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5185c.mo14719a(long, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo14718a(Object obj, C5866d dVar) {
        return mo14719a(((Number) obj).longValue(), dVar);
    }
}
