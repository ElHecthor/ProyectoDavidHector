package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.d */
public final class C5234d implements C5201a<Long, C5298g> {

    /* renamed from: a */
    private final C4964c f13678a;

    /* renamed from: b */
    private final C5261b f13679b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.GetGameInteractor", mo15594f = "GetGameInteractor.kt", mo15595l = {12, 13}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.d$a */
    static final class C5235a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13680i;

        /* renamed from: j */
        int f13681j;

        /* renamed from: k */
        final /* synthetic */ C5234d f13682k;

        /* renamed from: l */
        Object f13683l;

        /* renamed from: m */
        Object f13684m;

        /* renamed from: n */
        long f13685n;

        C5235a(C5234d dVar, C5866d dVar2) {
            this.f13682k = dVar;
            super(dVar2);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13680i = obj;
            this.f13681j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13682k.mo14782a(0, (C5866d<? super C5298g>) this);
        }
    }

    public C5234d(C4964c cVar, C5261b bVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(bVar, "detailGameMapper");
        this.f13678a = cVar;
        this.f13679b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:19:0x006b, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14782a(long r6, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5298g> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5234d.C5235a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.stashteam.stashapp.e.a.d.d$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5234d.C5235a) r0
            int r1 = r0.f13681j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13681j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.d$a r0 = new io.stashteam.stashapp.e.a.d.d$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f13680i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13681j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.f13684m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r6 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r6
            long r6 = r0.f13685n
            java.lang.Object r6 = r0.f13683l
            io.stashteam.stashapp.e.a.d.d r6 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5234d) r6
            p308k.C5806n.m22054a(r8)
            goto L_0x006e
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            long r6 = r0.f13685n
            java.lang.Object r2 = r0.f13683l
            io.stashteam.stashapp.e.a.d.d r2 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5234d) r2
            p308k.C5806n.m22054a(r8)
            goto L_0x005b
        L_0x0048:
            p308k.C5806n.m22054a(r8)
            io.stashteam.stashapp.b.d.c r8 = r5.f13678a
            r0.f13683l = r5
            r0.f13685n = r6
            r0.f13681j = r4
            java.lang.Object r8 = r8.mo14179b(r6, r0)
            if (r8 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r2 = r5
        L_0x005b:
            io.stashteam.stashapp.data.network.response.DetailGameResponse r8 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r8
            io.stashteam.stashapp.e.b.b.b r4 = r2.f13679b
            r0.f13683l = r2
            r0.f13685n = r6
            r0.f13684m = r8
            r0.f13681j = r3
            java.lang.Object r8 = r4.mo14344a(r8, r0)
            if (r8 != r1) goto L_0x006e
            return r1
        L_0x006e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5234d.mo14782a(long, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo14718a(Object obj, C5866d dVar) {
        return mo14782a(((Number) obj).longValue(), dVar);
    }
}
