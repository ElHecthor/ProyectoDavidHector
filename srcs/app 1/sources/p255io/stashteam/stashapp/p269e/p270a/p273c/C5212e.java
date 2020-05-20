package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5271i;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.e */
public final class C5212e implements C5201a<C5213a, List<? extends C5323z>> {

    /* renamed from: a */
    private final C4957b f13603a;

    /* renamed from: b */
    private final C5271i f13604b;

    /* renamed from: io.stashteam.stashapp.e.a.c.e$a */
    public static final class C5213a implements C5715a<C5213a> {

        /* renamed from: a */
        private final long f13605a;

        /* renamed from: b */
        private final int f13606b;

        /* renamed from: c */
        private final int f13607c;

        public C5213a(long j, int i, int i2) {
            this.f13605a = j;
            this.f13606b = i;
            this.f13607c = i2;
        }

        /* renamed from: a */
        public static /* synthetic */ C5213a m20529a(C5213a aVar, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = aVar.f13605a;
            }
            if ((i3 & 2) != 0) {
                i = aVar.mo14752a();
            }
            if ((i3 & 4) != 0) {
                i2 = aVar.mo14756c();
            }
            return aVar.mo14754a(j, i, i2);
        }

        /* renamed from: a */
        public int mo14752a() {
            return this.f13606b;
        }

        /* renamed from: a */
        public C5213a m20533a(int i, int i2) {
            return m20529a(this, 0, i, i2, 1, null);
        }

        /* renamed from: a */
        public final C5213a mo14754a(long j, int i, int i2) {
            return new C5213a(j, i, i2);
        }

        /* renamed from: b */
        public final long mo14755b() {
            return this.f13605a;
        }

        /* renamed from: c */
        public int mo14756c() {
            return this.f13607c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (mo14756c() == r6.mo14756c()) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                if (r5 == r6) goto L_0x0027
                boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a
                if (r0 == 0) goto L_0x0025
                io.stashteam.stashapp.e.a.c.e$a r6 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a) r6
                long r0 = r5.f13605a
                long r2 = r6.f13605a
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0025
                int r0 = r5.mo14752a()
                int r1 = r6.mo14752a()
                if (r0 != r1) goto L_0x0025
                int r0 = r5.mo14756c()
                int r6 = r6.mo14756c()
                if (r0 != r6) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r6 = 0
                return r6
            L_0x0027:
                r6 = 1
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((C3085d.m12547a(this.f13605a) * 31) + mo14752a()) * 31) + mo14756c();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listId=");
            sb.append(this.f13605a);
            sb.append(", limit=");
            sb.append(mo14752a());
            sb.append(", offset=");
            sb.append(mo14756c());
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.GetCustomListGamesInteractor", mo15594f = "GetCustomListGamesInteractor.kt", mo15595l = {15, 16}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.e$b */
    static final class C5214b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13608i;

        /* renamed from: j */
        int f13609j;

        /* renamed from: k */
        final /* synthetic */ C5212e f13610k;

        /* renamed from: l */
        Object f13611l;

        /* renamed from: m */
        Object f13612m;

        /* renamed from: n */
        Object f13613n;

        C5214b(C5212e eVar, C5866d dVar) {
            this.f13610k = eVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13608i = obj;
            this.f13609j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13610k.mo14718a((C5213a) null, (C5866d<? super List<C5323z>>) this);
        }
    }

    public C5212e(C4957b bVar, C5271i iVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        C5942k.m22327b(iVar, "shortGameFromApiMapper");
        this.f13603a = bVar;
        this.f13604b = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:19:0x0082, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a r10, p308k.p316w.C5866d<? super java.util.List<p255io.stashteam.stashapp.p269e.p280c.C5323z>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5214b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            io.stashteam.stashapp.e.a.c.e$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5214b) r0
            int r1 = r0.f13609j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13609j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.e$b r0 = new io.stashteam.stashapp.e.a.c.e$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f13608i
            java.lang.Object r7 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f13609j
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004c
            if (r1 == r2) goto L_0x0040
            if (r1 != r8) goto L_0x0038
            java.lang.Object r10 = r0.f13613n
            io.stashteam.stashapp.data.network.response.PagingResponse r10 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r10
            java.lang.Object r10 = r0.f13612m
            io.stashteam.stashapp.e.a.c.e$a r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a) r10
            java.lang.Object r10 = r0.f13611l
            io.stashteam.stashapp.e.a.c.e r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e) r10
            p308k.C5806n.m22054a(r11)
            goto L_0x0085
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            java.lang.Object r10 = r0.f13612m
            io.stashteam.stashapp.e.a.c.e$a r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.C5213a) r10
            java.lang.Object r1 = r0.f13611l
            io.stashteam.stashapp.e.a.c.e r1 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e) r1
            p308k.C5806n.m22054a(r11)
            goto L_0x006e
        L_0x004c:
            p308k.C5806n.m22054a(r11)
            io.stashteam.stashapp.b.d.b r1 = r9.f13603a
            long r3 = r10.mo14755b()
            int r11 = r10.mo14752a()
            int r5 = r10.mo14756c()
            r0.f13611l = r9
            r0.f13612m = r10
            r0.f13609j = r2
            r2 = r3
            r4 = r11
            r6 = r0
            java.lang.Object r11 = r1.mo14156a(r2, r4, r5, r6)
            if (r11 != r7) goto L_0x006d
            return r7
        L_0x006d:
            r1 = r9
        L_0x006e:
            io.stashteam.stashapp.data.network.response.PagingResponse r11 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r11
            io.stashteam.stashapp.e.b.b.i r2 = r1.f13604b
            java.util.List r3 = r11.getItems()
            r0.f13611l = r1
            r0.f13612m = r10
            r0.f13613n = r11
            r0.f13609j = r8
            java.lang.Object r11 = r2.mo14842a(r3, r0)
            if (r11 != r7) goto L_0x0085
            return r7
        L_0x0085:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5212e.mo14718a(io.stashteam.stashapp.e.a.c.e$a, k.w.d):java.lang.Object");
    }
}
