package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5274k;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.utils.p305g.C5716b;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.b */
public final class C5183b implements C5201a<C5716b, List<? extends C5294d0>> {

    /* renamed from: a */
    private final C4944a f13503a;

    /* renamed from: b */
    private final C5274k f13504b;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.GetLeaderUsersInteractor", mo15594f = "GetLeaderUsersInteractor.kt", mo15595l = {15, 16}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.b$a */
    static final class C5184a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13505i;

        /* renamed from: j */
        int f13506j;

        /* renamed from: k */
        final /* synthetic */ C5183b f13507k;

        /* renamed from: l */
        Object f13508l;

        /* renamed from: m */
        Object f13509m;

        /* renamed from: n */
        Object f13510n;

        C5184a(C5183b bVar, C5866d dVar) {
            this.f13507k = bVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13505i = obj;
            this.f13506j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13507k.mo14718a((C5716b) null, (C5866d<? super List<C5294d0>>) this);
        }
    }

    public C5183b(C4944a aVar, C5274k kVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(kVar, "userFromApiMapper");
        this.f13503a = aVar;
        this.f13504b = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:19:0x007b, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.utils.p305g.C5716b r7, p308k.p316w.C5866d<? super java.util.List<p255io.stashteam.stashapp.p269e.p280c.C5294d0>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5183b.C5184a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.stashteam.stashapp.e.a.a.b$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5183b.C5184a) r0
            int r1 = r0.f13506j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13506j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.b$a r0 = new io.stashteam.stashapp.e.a.a.b$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f13505i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13506j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.f13510n
            io.stashteam.stashapp.data.network.response.PagingResponse r7 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r7
            java.lang.Object r7 = r0.f13509m
            io.stashteam.stashapp.utils.g.b r7 = (p255io.stashteam.stashapp.utils.p305g.C5716b) r7
            java.lang.Object r7 = r0.f13508l
            io.stashteam.stashapp.e.a.a.b r7 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5183b) r7
            p308k.C5806n.m22054a(r8)
            goto L_0x007e
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.f13509m
            io.stashteam.stashapp.utils.g.b r7 = (p255io.stashteam.stashapp.utils.p305g.C5716b) r7
            java.lang.Object r2 = r0.f13508l
            io.stashteam.stashapp.e.a.a.b r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5183b) r2
            p308k.C5806n.m22054a(r8)
            goto L_0x0067
        L_0x004c:
            p308k.C5806n.m22054a(r8)
            io.stashteam.stashapp.b.d.a r8 = r6.f13503a
            int r2 = r7.mo15349a()
            int r5 = r7.mo15350b()
            r0.f13508l = r6
            r0.f13509m = r7
            r0.f13506j = r4
            java.lang.Object r8 = r8.mo14137a(r2, r5, r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r2 = r6
        L_0x0067:
            io.stashteam.stashapp.data.network.response.PagingResponse r8 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r8
            io.stashteam.stashapp.e.b.b.k r4 = r2.f13504b
            java.util.List r5 = r8.getItems()
            r0.f13508l = r2
            r0.f13509m = r7
            r0.f13510n = r8
            r0.f13506j = r3
            java.lang.Object r8 = r4.mo14845a(r5, r0)
            if (r8 != r1) goto L_0x007e
            return r1
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5183b.mo14718a(io.stashteam.stashapp.utils.g.b, k.w.d):java.lang.Object");
    }
}
