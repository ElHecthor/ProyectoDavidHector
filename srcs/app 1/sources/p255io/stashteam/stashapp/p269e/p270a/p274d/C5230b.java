package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p271a.C5196i;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5261b;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.b */
public final class C5230b implements C5201a<Long, C5298g> {

    /* renamed from: a */
    private final C4964c f13662a;

    /* renamed from: b */
    private final C5261b f13663b;

    /* renamed from: c */
    private final C5196i f13664c;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.DeleteStatusInteractor", mo15594f = "DeleteStatusInteractor.kt", mo15595l = {16, 17, 18}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.b$a */
    static final class C5231a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13665i;

        /* renamed from: j */
        int f13666j;

        /* renamed from: k */
        final /* synthetic */ C5230b f13667k;

        /* renamed from: l */
        Object f13668l;

        /* renamed from: m */
        Object f13669m;

        /* renamed from: n */
        long f13670n;

        C5231a(C5230b bVar, C5866d dVar) {
            this.f13667k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13665i = obj;
            this.f13666j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13667k.mo14780a(0, (C5866d<? super C5298g>) this);
        }
    }

    public C5230b(C4964c cVar, C5261b bVar, C5196i iVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(bVar, "detailGameMapper");
        C5942k.m22327b(iVar, "syncStatisticInteractor");
        this.f13662a = cVar;
        this.f13663b = bVar;
        this.f13664c = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:25:0x0090, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14780a(long r7, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5298g> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b.C5231a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.stashteam.stashapp.e.a.d.b$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b.C5231a) r0
            int r1 = r0.f13666j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13666j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.b$a r0 = new io.stashteam.stashapp.e.a.d.b$a
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f13665i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13666j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r5) goto L_0x004f
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r7 = r0.f13669m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r7 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r7
            long r7 = r0.f13670n
            java.lang.Object r7 = r0.f13668l
            io.stashteam.stashapp.e.a.d.b r7 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b) r7
            p308k.C5806n.m22054a(r9)
            goto L_0x0093
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            java.lang.Object r7 = r0.f13669m
            io.stashteam.stashapp.data.network.response.DetailGameResponse r7 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r7
            long r4 = r0.f13670n
            java.lang.Object r8 = r0.f13668l
            io.stashteam.stashapp.e.a.d.b r8 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b) r8
            p308k.C5806n.m22054a(r9)
            goto L_0x0082
        L_0x004f:
            long r7 = r0.f13670n
            java.lang.Object r2 = r0.f13668l
            io.stashteam.stashapp.e.a.d.b r2 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b) r2
            p308k.C5806n.m22054a(r9)
            goto L_0x006c
        L_0x0059:
            p308k.C5806n.m22054a(r9)
            io.stashteam.stashapp.b.d.c r9 = r6.f13662a
            r0.f13668l = r6
            r0.f13670n = r7
            r0.f13666j = r5
            java.lang.Object r9 = r9.mo14171a(r7, r0)
            if (r9 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r6
        L_0x006c:
            io.stashteam.stashapp.data.network.response.DetailGameResponse r9 = (p255io.stashteam.stashapp.data.network.response.DetailGameResponse) r9
            io.stashteam.stashapp.e.a.a.i r5 = r2.f13664c
            r0.f13668l = r2
            r0.f13670n = r7
            r0.f13669m = r9
            r0.f13666j = r4
            java.lang.Object r4 = r5.mo14729a(r0)
            if (r4 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r4 = r7
            r7 = r9
            r8 = r2
        L_0x0082:
            io.stashteam.stashapp.e.b.b.b r9 = r8.f13663b
            r0.f13668l = r8
            r0.f13670n = r4
            r0.f13669m = r7
            r0.f13666j = r3
            java.lang.Object r9 = r9.mo14344a(r7, r0)
            if (r9 != r1) goto L_0x0093
            return r1
        L_0x0093:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5230b.mo14780a(long, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo14718a(Object obj, C5866d dVar) {
        return mo14780a(((Number) obj).longValue(), dVar);
    }
}
