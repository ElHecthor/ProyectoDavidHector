package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5268g;
import p255io.stashteam.stashapp.p269e.p280c.C5320w;
import p255io.stashteam.stashapp.p269e.p280c.C5321x;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.j */
public final class C5247j implements C5201a<C5248a, List<? extends C5320w>> {

    /* renamed from: a */
    private final C4964c f13720a;

    /* renamed from: b */
    private final C5268g f13721b;

    /* renamed from: io.stashteam.stashapp.e.a.d.j$a */
    public static final class C5248a implements C5715a<C5248a> {

        /* renamed from: a */
        private final C5321x f13722a;

        /* renamed from: b */
        private final long f13723b;

        /* renamed from: c */
        private final int f13724c;

        /* renamed from: d */
        private final int f13725d;

        public C5248a(C5321x xVar, long j, int i, int i2) {
            C5942k.m22327b(xVar, "listType");
            this.f13722a = xVar;
            this.f13723b = j;
            this.f13724c = i;
            this.f13725d = i2;
        }

        /* renamed from: a */
        public static /* synthetic */ C5248a m20601a(C5248a aVar, C5321x xVar, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                xVar = aVar.f13722a;
            }
            if ((i3 & 2) != 0) {
                j = aVar.f13723b;
            }
            long j2 = j;
            if ((i3 & 4) != 0) {
                i = aVar.mo14805b();
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = aVar.mo14807d();
            }
            return aVar.mo14804a(xVar, j2, i4, i2);
        }

        /* renamed from: a */
        public final long mo14803a() {
            return this.f13723b;
        }

        /* renamed from: a */
        public C5248a m20605a(int i, int i2) {
            return m20601a(this, null, 0, i, i2, 3, null);
        }

        /* renamed from: a */
        public final C5248a mo14804a(C5321x xVar, long j, int i, int i2) {
            C5942k.m22327b(xVar, "listType");
            C5248a aVar = new C5248a(xVar, j, i, i2);
            return aVar;
        }

        /* renamed from: b */
        public int mo14805b() {
            return this.f13724c;
        }

        /* renamed from: c */
        public final C5321x mo14806c() {
            return this.f13722a;
        }

        /* renamed from: d */
        public int mo14807d() {
            return this.f13725d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
            if (mo14807d() == r6.mo14807d()) goto L_0x0031;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                if (r5 == r6) goto L_0x0031
                boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a
                if (r0 == 0) goto L_0x002f
                io.stashteam.stashapp.e.a.d.j$a r6 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a) r6
                io.stashteam.stashapp.e.c.x r0 = r5.f13722a
                io.stashteam.stashapp.e.c.x r1 = r6.f13722a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x002f
                long r0 = r5.f13723b
                long r2 = r6.f13723b
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x002f
                int r0 = r5.mo14805b()
                int r1 = r6.mo14805b()
                if (r0 != r1) goto L_0x002f
                int r0 = r5.mo14807d()
                int r6 = r6.mo14807d()
                if (r0 != r6) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                r6 = 0
                return r6
            L_0x0031:
                r6 = 1
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C5321x xVar = this.f13722a;
            return ((((((xVar != null ? xVar.hashCode() : 0) * 31) + C3085d.m12547a(this.f13723b)) * 31) + mo14805b()) * 31) + mo14807d();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listType=");
            sb.append(this.f13722a);
            sb.append(", gameId=");
            sb.append(this.f13723b);
            sb.append(", limit=");
            sb.append(mo14805b());
            sb.append(", offset=");
            sb.append(mo14807d());
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.GetReviewsInteractor", mo15594f = "GetReviewsInteractor.kt", mo15595l = {16, 35}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.j$b */
    static final class C5249b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13726i;

        /* renamed from: j */
        int f13727j;

        /* renamed from: k */
        final /* synthetic */ C5247j f13728k;

        /* renamed from: l */
        Object f13729l;

        /* renamed from: m */
        Object f13730m;

        /* renamed from: n */
        Object f13731n;

        C5249b(C5247j jVar, C5866d dVar) {
            this.f13728k = jVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13726i = obj;
            this.f13727j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13728k.mo14718a((C5248a) null, (C5866d<? super List<C5320w>>) this);
        }
    }

    public C5247j(C4964c cVar, C5268g gVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(gVar, "reviewMapper");
        this.f13720a = cVar;
        this.f13721b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf A[PHI: r13 
      PHI: (r13v2 java.lang.Object) = (r13v5 java.lang.Object), (r13v1 java.lang.Object) binds: [B:31:0x00bc, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a r12, p308k.p316w.C5866d<? super java.util.List<p255io.stashteam.stashapp.p269e.p280c.C5320w>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5249b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            io.stashteam.stashapp.e.a.d.j$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5249b) r0
            int r1 = r0.f13727j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13727j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.j$b r0 = new io.stashteam.stashapp.e.a.d.j$b
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f13726i
            java.lang.Object r8 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f13727j
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 == r10) goto L_0x0041
            if (r1 != r9) goto L_0x0039
            java.lang.Object r12 = r0.f13731n
            io.stashteam.stashapp.data.network.response.PagingResponse r12 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r12
            java.lang.Object r12 = r0.f13730m
            io.stashteam.stashapp.e.a.d.j$a r12 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a) r12
            java.lang.Object r12 = r0.f13729l
            io.stashteam.stashapp.e.a.d.j r12 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j) r12
            p308k.C5806n.m22054a(r13)
            goto L_0x00bf
        L_0x0039:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0041:
            java.lang.Object r12 = r0.f13730m
            io.stashteam.stashapp.e.a.d.j$a r12 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.C5248a) r12
            java.lang.Object r1 = r0.f13729l
            io.stashteam.stashapp.e.a.d.j r1 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j) r1
            p308k.C5806n.m22054a(r13)
            goto L_0x0075
        L_0x004d:
            p308k.C5806n.m22054a(r13)
            io.stashteam.stashapp.b.d.c r1 = r11.f13720a
            io.stashteam.stashapp.e.c.x r13 = r12.mo14806c()
            java.lang.String r2 = r13.mo15009h()
            long r3 = r12.mo14803a()
            int r5 = r12.mo14805b()
            int r6 = r12.mo14807d()
            r0.f13729l = r11
            r0.f13730m = r12
            r0.f13727j = r10
            r7 = r0
            java.lang.Object r13 = r1.mo14174a(r2, r3, r5, r6, r7)
            if (r13 != r8) goto L_0x0074
            return r8
        L_0x0074:
            r1 = r11
        L_0x0075:
            io.stashteam.stashapp.data.network.response.PagingResponse r13 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r13
            io.stashteam.stashapp.e.b.b.g r2 = r1.f13721b
            java.util.List r3 = r13.getItems()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0086:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r5 = r3.next()
            r6 = r5
            io.stashteam.stashapp.data.network.response.ReviewResponse r6 = (p255io.stashteam.stashapp.data.network.response.ReviewResponse) r6
            io.stashteam.stashapp.data.network.model.UserApiModel r7 = r6.getUser()
            if (r7 == 0) goto L_0x00a1
            io.stashteam.stashapp.data.network.model.GameReviewApiModel r6 = r6.getReview()
            if (r6 == 0) goto L_0x00a1
            r6 = 1
            goto L_0x00a2
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            java.lang.Boolean r6 = p308k.p316w.p318j.p319a.C5887b.m22259a(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0086
            r4.add(r5)
            goto L_0x0086
        L_0x00b0:
            r0.f13729l = r1
            r0.f13730m = r12
            r0.f13731n = r13
            r0.f13727j = r9
            java.lang.Object r13 = r2.mo14839a(r4, r0)
            if (r13 != r8) goto L_0x00bf
            return r8
        L_0x00bf:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5247j.mo14718a(io.stashteam.stashapp.e.a.d.j$a, k.w.d):java.lang.Object");
    }
}
