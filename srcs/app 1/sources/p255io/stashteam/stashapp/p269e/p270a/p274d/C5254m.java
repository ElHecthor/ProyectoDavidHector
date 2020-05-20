package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.m */
public final class C5254m implements C5201a<C5255a, List<? extends C5323z>> {

    /* renamed from: a */
    private final C4964c f13746a;

    /* renamed from: b */
    private final C5271i f13747b;

    /* renamed from: io.stashteam.stashapp.e.a.d.m$a */
    public static final class C5255a implements C5715a<C5255a> {

        /* renamed from: a */
        private final String f13748a;

        /* renamed from: b */
        private final int f13749b;

        /* renamed from: c */
        private final int f13750c;

        public C5255a(String str, int i, int i2) {
            C5942k.m22327b(str, "query");
            this.f13748a = str;
            this.f13749b = i;
            this.f13750c = i2;
        }

        /* renamed from: a */
        public static /* synthetic */ C5255a m20623a(C5255a aVar, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = aVar.f13748a;
            }
            if ((i3 & 2) != 0) {
                i = aVar.mo14821a();
            }
            if ((i3 & 4) != 0) {
                i2 = aVar.mo14823b();
            }
            return aVar.mo14822a(str, i, i2);
        }

        /* renamed from: a */
        public int mo14821a() {
            return this.f13749b;
        }

        /* renamed from: a */
        public C5255a m20627a(int i, int i2) {
            return m20623a(this, null, i, i2, 1, null);
        }

        /* renamed from: a */
        public final C5255a mo14822a(String str, int i, int i2) {
            C5942k.m22327b(str, "query");
            return new C5255a(str, i, i2);
        }

        /* renamed from: b */
        public int mo14823b() {
            return this.f13750c;
        }

        /* renamed from: c */
        public final String mo14824c() {
            return this.f13748a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (mo14823b() == r3.mo14823b()) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a
                if (r0 == 0) goto L_0x0027
                io.stashteam.stashapp.e.a.d.m$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a) r3
                java.lang.String r0 = r2.f13748a
                java.lang.String r1 = r3.f13748a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0027
                int r0 = r2.mo14821a()
                int r1 = r3.mo14821a()
                if (r0 != r1) goto L_0x0027
                int r0 = r2.mo14823b()
                int r3 = r3.mo14823b()
                if (r0 != r3) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f13748a;
            return ((((str != null ? str.hashCode() : 0) * 31) + mo14821a()) * 31) + mo14823b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(query=");
            sb.append(this.f13748a);
            sb.append(", limit=");
            sb.append(mo14821a());
            sb.append(", offset=");
            sb.append(mo14823b());
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.SearchGameInteractor", mo15594f = "SearchGameInteractor.kt", mo15595l = {16, 18, 20}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.m$b */
    static final class C5256b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13751i;

        /* renamed from: j */
        int f13752j;

        /* renamed from: k */
        final /* synthetic */ C5254m f13753k;

        /* renamed from: l */
        Object f13754l;

        /* renamed from: m */
        Object f13755m;

        /* renamed from: n */
        Object f13756n;

        C5256b(C5254m mVar, C5866d dVar) {
            this.f13753k = mVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13751i = obj;
            this.f13752j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13753k.mo14718a((C5255a) null, (C5866d<? super List<C5323z>>) this);
        }
    }

    public C5254m(C4964c cVar, C5271i iVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(iVar, "shortGameFromApiMapper");
        this.f13746a = cVar;
        this.f13747b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:29:0x00aa, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a r8, p308k.p316w.C5866d<? super java.util.List<p255io.stashteam.stashapp.p269e.p280c.C5323z>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5256b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.stashteam.stashapp.e.a.d.m$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5256b) r0
            int r1 = r0.f13752j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13752j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.m$b r0 = new io.stashteam.stashapp.e.a.d.m$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f13751i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13752j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.f13756n
            io.stashteam.stashapp.data.network.response.PagingResponse r8 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r8
            java.lang.Object r8 = r0.f13755m
            io.stashteam.stashapp.e.a.d.m$a r8 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a) r8
            java.lang.Object r8 = r0.f13754l
            io.stashteam.stashapp.e.a.d.m r8 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m) r8
            p308k.C5806n.m22054a(r9)
            goto L_0x00ad
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.f13755m
            io.stashteam.stashapp.e.a.d.m$a r8 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a) r8
            java.lang.Object r2 = r0.f13754l
            io.stashteam.stashapp.e.a.d.m r2 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m) r2
            p308k.C5806n.m22054a(r9)
            goto L_0x007a
        L_0x0050:
            p308k.C5806n.m22054a(r9)
            java.lang.String r9 = r8.mo14824c()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x005f
            r9 = 1
            goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            if (r9 == 0) goto L_0x007d
            io.stashteam.stashapp.b.d.c r9 = r7.f13746a
            int r2 = r8.mo14821a()
            int r4 = r8.mo14823b()
            r0.f13754l = r7
            r0.f13755m = r8
            r0.f13752j = r5
            java.lang.Object r9 = r9.mo14167a(r2, r4, r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0079:
            r2 = r7
        L_0x007a:
            io.stashteam.stashapp.data.network.response.PagingResponse r9 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r9
            goto L_0x0098
        L_0x007d:
            io.stashteam.stashapp.b.d.c r9 = r7.f13746a
            java.lang.String r2 = r8.mo14824c()
            int r5 = r8.mo14821a()
            int r6 = r8.mo14823b()
            r0.f13754l = r7
            r0.f13755m = r8
            r0.f13752j = r4
            java.lang.Object r9 = r9.mo14173a(r2, r5, r6, r0)
            if (r9 != r1) goto L_0x0079
            return r1
        L_0x0098:
            io.stashteam.stashapp.e.b.b.i r4 = r2.f13747b
            java.util.List r5 = r9.getItems()
            r0.f13754l = r2
            r0.f13755m = r8
            r0.f13756n = r9
            r0.f13752j = r3
            java.lang.Object r9 = r4.mo14842a(r5, r0)
            if (r9 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.mo14718a(io.stashteam.stashapp.e.a.d.m$a, k.w.d):java.lang.Object");
    }
}
