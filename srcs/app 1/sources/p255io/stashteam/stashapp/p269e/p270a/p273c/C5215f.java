package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p275b.p277b.C5260a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.f */
public final class C5215f implements C5201a<C5216a, List<? extends C5297f>> {

    /* renamed from: a */
    private final C4957b f13614a;

    /* renamed from: b */
    private final C5260a f13615b;

    /* renamed from: io.stashteam.stashapp.e.a.c.f$a */
    public static final class C5216a implements C5715a<C5216a> {

        /* renamed from: a */
        private final int f13616a;

        /* renamed from: b */
        private final int f13617b;

        /* renamed from: c */
        private final String f13618c;

        public C5216a(int i, int i2, String str) {
            this.f13616a = i;
            this.f13617b = i2;
            this.f13618c = str;
        }

        public /* synthetic */ C5216a(int i, int i2, String str, int i3, C5938g gVar) {
            if ((i3 & 4) != 0) {
                str = null;
            }
            this(i, i2, str);
        }

        /* renamed from: a */
        public static /* synthetic */ C5216a m20539a(C5216a aVar, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = aVar.mo14763b();
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.mo14764c();
            }
            if ((i3 & 4) != 0) {
                str = aVar.f13618c;
            }
            return aVar.mo14761a(i, i2, str);
        }

        /* renamed from: a */
        public C5216a m20542a(int i, int i2) {
            return m20539a(this, i, i2, null, 4, null);
        }

        /* renamed from: a */
        public final C5216a mo14761a(int i, int i2, String str) {
            return new C5216a(i, i2, str);
        }

        /* renamed from: a */
        public final String mo14762a() {
            return this.f13618c;
        }

        /* renamed from: b */
        public int mo14763b() {
            return this.f13616a;
        }

        /* renamed from: c */
        public int mo14764c() {
            return this.f13617b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13618c, (java.lang.Object) r3.f13618c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a
                if (r0 == 0) goto L_0x0027
                io.stashteam.stashapp.e.a.c.f$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a) r3
                int r0 = r2.mo14763b()
                int r1 = r3.mo14763b()
                if (r0 != r1) goto L_0x0027
                int r0 = r2.mo14764c()
                int r1 = r3.mo14764c()
                if (r0 != r1) goto L_0x0027
                java.lang.String r0 = r2.f13618c
                java.lang.String r3 = r3.f13618c
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int b = ((mo14763b() * 31) + mo14764c()) * 31;
            String str = this.f13618c;
            return b + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(limit=");
            sb.append(mo14763b());
            sb.append(", offset=");
            sb.append(mo14764c());
            sb.append(", filterQuery=");
            sb.append(this.f13618c);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.GetCustomListsInteractor", mo15594f = "GetCustomListsInteractor.kt", mo15595l = {18, 21}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.f$b */
    static final class C5217b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13619i;

        /* renamed from: j */
        int f13620j;

        /* renamed from: k */
        final /* synthetic */ C5215f f13621k;

        /* renamed from: l */
        Object f13622l;

        /* renamed from: m */
        Object f13623m;

        /* renamed from: n */
        Object f13624n;

        C5217b(C5215f fVar, C5866d dVar) {
            this.f13621k = fVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13619i = obj;
            this.f13620j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13621k.mo14718a((C5216a) null, (C5866d<? super List<C5297f>>) this);
        }
    }

    public C5215f(C4957b bVar, C5260a aVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        C5942k.m22327b(aVar, "customListFromApiMapper");
        this.f13614a = bVar;
        this.f13615b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:19:0x007f, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a r8, p308k.p316w.C5866d<? super java.util.List<p255io.stashteam.stashapp.p269e.p280c.C5297f>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5217b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.stashteam.stashapp.e.a.c.f$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5217b) r0
            int r1 = r0.f13620j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13620j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.f$b r0 = new io.stashteam.stashapp.e.a.c.f$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f13619i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13620j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r8 = r0.f13624n
            io.stashteam.stashapp.data.network.response.PagingResponse r8 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r8
            java.lang.Object r8 = r0.f13623m
            io.stashteam.stashapp.e.a.c.f$a r8 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a) r8
            java.lang.Object r8 = r0.f13622l
            io.stashteam.stashapp.e.a.c.f r8 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f) r8
            p308k.C5806n.m22054a(r9)
            goto L_0x0082
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.f13623m
            io.stashteam.stashapp.e.a.c.f$a r8 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.C5216a) r8
            java.lang.Object r2 = r0.f13622l
            io.stashteam.stashapp.e.a.c.f r2 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f) r2
            p308k.C5806n.m22054a(r9)
            goto L_0x006b
        L_0x004c:
            p308k.C5806n.m22054a(r9)
            io.stashteam.stashapp.b.d.b r9 = r7.f13614a
            int r2 = r8.mo14763b()
            int r5 = r8.mo14764c()
            java.lang.String r6 = r8.mo14762a()
            r0.f13622l = r7
            r0.f13623m = r8
            r0.f13620j = r4
            java.lang.Object r9 = r9.mo14155a(r2, r5, r6, r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r2 = r7
        L_0x006b:
            io.stashteam.stashapp.data.network.response.PagingResponse r9 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r9
            io.stashteam.stashapp.e.b.b.a r4 = r2.f13615b
            java.util.List r5 = r9.getItems()
            r0.f13622l = r2
            r0.f13623m = r8
            r0.f13624n = r9
            r0.f13620j = r3
            java.lang.Object r9 = r4.mo14829a(r5, r0)
            if (r9 != r1) goto L_0x0082
            return r1
        L_0x0082:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5215f.mo14718a(io.stashteam.stashapp.e.a.c.f$a, k.w.d):java.lang.Object");
    }
}
