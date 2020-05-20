package p255io.stashteam.stashapp.p298ui.home;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlinx.coroutines.C6089g0;
import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5236e.C5237a;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.home.c */
public final class C5595c extends C5345a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0532t<C5580a> f14559g = new C0532t<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5236e f14560h;

    /* renamed from: i */
    private final C4940a f14561i;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.home.HomeViewModel$loadHomeData$1", mo15594f = "HomeViewModel.kt", mo15595l = {51, 52, 53}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.ui.home.c$a */
    static final class C5596a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14562j;

        /* renamed from: k */
        Object f14563k;

        /* renamed from: l */
        Object f14564l;

        /* renamed from: m */
        Object f14565m;

        /* renamed from: n */
        Object f14566n;

        /* renamed from: o */
        Object f14567o;

        /* renamed from: p */
        Object f14568p;

        /* renamed from: q */
        Object f14569q;

        /* renamed from: r */
        int f14570r;

        /* renamed from: s */
        final /* synthetic */ C5595c f14571s;

        @C5891f(mo15593c = "io.stashteam.stashapp.ui.home.HomeViewModel$loadHomeData$1$anticipatedGames$1", mo15594f = "HomeViewModel.kt", mo15595l = {37}, mo15596m = "invokeSuspend")
        /* renamed from: io.stashteam.stashapp.ui.home.c$a$a */
        static final class C5597a extends C5898l implements C5922p<C6089g0, C5866d<? super List<? extends C5323z>>, Object> {

            /* renamed from: j */
            private C6089g0 f14572j;

            /* renamed from: k */
            Object f14573k;

            /* renamed from: l */
            int f14574l;

            /* renamed from: m */
            final /* synthetic */ C5596a f14575m;

            C5597a(C5596a aVar, C5866d dVar) {
                this.f14575m = aVar;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f14574l;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    C6089g0 g0Var = this.f14572j;
                    C5236e a2 = this.f14575m.f14571s.f14560h;
                    C5237a aVar = new C5237a(C5305k.ANTICIPATED, 0, 20, null, null, 24, null);
                    this.f14573k = g0Var;
                    this.f14574l = 1;
                    obj = a2.mo14718a(aVar, (C5866d<? super List<C5323z>>) this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    C6089g0 g0Var2 = (C6089g0) this.f14573k;
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C5597a aVar = new C5597a(this.f14575m, dVar);
                aVar.f14572j = (C6089g0) obj;
                return aVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C5597a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        @C5891f(mo15593c = "io.stashteam.stashapp.ui.home.HomeViewModel$loadHomeData$1$latestGames$1", mo15594f = "HomeViewModel.kt", mo15595l = {42}, mo15596m = "invokeSuspend")
        /* renamed from: io.stashteam.stashapp.ui.home.c$a$b */
        static final class C5598b extends C5898l implements C5922p<C6089g0, C5866d<? super List<? extends C5323z>>, Object> {

            /* renamed from: j */
            private C6089g0 f14576j;

            /* renamed from: k */
            Object f14577k;

            /* renamed from: l */
            int f14578l;

            /* renamed from: m */
            final /* synthetic */ C5596a f14579m;

            C5598b(C5596a aVar, C5866d dVar) {
                this.f14579m = aVar;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f14578l;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    C6089g0 g0Var = this.f14576j;
                    C5236e a2 = this.f14579m.f14571s.f14560h;
                    C5237a aVar = new C5237a(C5305k.LATEST_RELEASES, 0, 20, null, null, 24, null);
                    this.f14577k = g0Var;
                    this.f14578l = 1;
                    obj = a2.mo14718a(aVar, (C5866d<? super List<C5323z>>) this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    C6089g0 g0Var2 = (C6089g0) this.f14577k;
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C5598b bVar = new C5598b(this.f14579m, dVar);
                bVar.f14576j = (C6089g0) obj;
                return bVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C5598b) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        @C5891f(mo15593c = "io.stashteam.stashapp.ui.home.HomeViewModel$loadHomeData$1$upcomingGames$1", mo15594f = "HomeViewModel.kt", mo15595l = {47}, mo15596m = "invokeSuspend")
        /* renamed from: io.stashteam.stashapp.ui.home.c$a$c */
        static final class C5599c extends C5898l implements C5922p<C6089g0, C5866d<? super List<? extends C5323z>>, Object> {

            /* renamed from: j */
            private C6089g0 f14580j;

            /* renamed from: k */
            Object f14581k;

            /* renamed from: l */
            int f14582l;

            /* renamed from: m */
            final /* synthetic */ C5596a f14583m;

            C5599c(C5596a aVar, C5866d dVar) {
                this.f14583m = aVar;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f14582l;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    C6089g0 g0Var = this.f14580j;
                    C5236e a2 = this.f14583m.f14571s.f14560h;
                    C5237a aVar = new C5237a(C5305k.UPCOMING, 0, 20, null, null, 24, null);
                    this.f14581k = g0Var;
                    this.f14582l = 1;
                    obj = a2.mo14718a(aVar, (C5866d<? super List<C5323z>>) this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    C6089g0 g0Var2 = (C6089g0) this.f14581k;
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C5599c cVar = new C5599c(this.f14583m, dVar);
                cVar.f14580j = (C6089g0) obj;
                return cVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C5599c) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        C5596a(C5595c cVar, C5866d dVar) {
            this.f14571s = cVar;
            super(2, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00f3 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00f4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo4016a(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
                int r2 = r0.f14570r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x007f
                if (r2 == r5) goto L_0x0062
                if (r2 == r4) goto L_0x003f
                if (r2 != r3) goto L_0x0037
                java.lang.Object r1 = r0.f14569q
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r0.f14568p
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r3 = r0.f14567o
                androidx.lifecycle.t r3 = (androidx.lifecycle.C0532t) r3
                java.lang.Object r4 = r0.f14566n
                kotlinx.coroutines.p0 r4 = (kotlinx.coroutines.C6173p0) r4
                java.lang.Object r4 = r0.f14565m
                kotlinx.coroutines.p0 r4 = (kotlinx.coroutines.C6173p0) r4
                java.lang.Object r4 = r0.f14564l
                kotlinx.coroutines.p0 r4 = (kotlinx.coroutines.C6173p0) r4
                java.lang.Object r4 = r0.f14563k
                kotlinx.coroutines.g0 r4 = (kotlinx.coroutines.C6089g0) r4
                p308k.C5806n.m22054a(r17)
                r5 = r3
                r3 = r17
                goto L_0x00f5
            L_0x0037:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003f:
                java.lang.Object r2 = r0.f14568p
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r4 = r0.f14567o
                androidx.lifecycle.t r4 = (androidx.lifecycle.C0532t) r4
                java.lang.Object r5 = r0.f14566n
                kotlinx.coroutines.p0 r5 = (kotlinx.coroutines.C6173p0) r5
                java.lang.Object r6 = r0.f14565m
                kotlinx.coroutines.p0 r6 = (kotlinx.coroutines.C6173p0) r6
                java.lang.Object r7 = r0.f14564l
                kotlinx.coroutines.p0 r7 = (kotlinx.coroutines.C6173p0) r7
                java.lang.Object r8 = r0.f14563k
                kotlinx.coroutines.g0 r8 = (kotlinx.coroutines.C6089g0) r8
                p308k.C5806n.m22054a(r17)
                r9 = r8
                r8 = r6
                r6 = r5
                r5 = r4
                r4 = r17
                goto L_0x00db
            L_0x0062:
                java.lang.Object r2 = r0.f14567o
                androidx.lifecycle.t r2 = (androidx.lifecycle.C0532t) r2
                java.lang.Object r5 = r0.f14566n
                kotlinx.coroutines.p0 r5 = (kotlinx.coroutines.C6173p0) r5
                java.lang.Object r6 = r0.f14565m
                kotlinx.coroutines.p0 r6 = (kotlinx.coroutines.C6173p0) r6
                java.lang.Object r7 = r0.f14564l
                kotlinx.coroutines.p0 r7 = (kotlinx.coroutines.C6173p0) r7
                java.lang.Object r8 = r0.f14563k
                kotlinx.coroutines.g0 r8 = (kotlinx.coroutines.C6089g0) r8
                p308k.C5806n.m22054a(r17)
                r9 = r8
                r8 = r6
                r6 = r5
                r5 = r17
                goto L_0x00c1
            L_0x007f:
                p308k.C5806n.m22054a(r17)
                kotlinx.coroutines.g0 r2 = r0.f14562j
                r10 = 0
                r11 = 0
                io.stashteam.stashapp.ui.home.c$a$a r12 = new io.stashteam.stashapp.ui.home.c$a$a
                r6 = 0
                r12.<init>(r0, r6)
                r13 = 3
                r14 = 0
                r9 = r2
                kotlinx.coroutines.p0 r7 = kotlinx.coroutines.C6088g.m22901a(r9, r10, r11, r12, r13, r14)
                io.stashteam.stashapp.ui.home.c$a$b r12 = new io.stashteam.stashapp.ui.home.c$a$b
                r12.<init>(r0, r6)
                kotlinx.coroutines.p0 r8 = kotlinx.coroutines.C6088g.m22901a(r9, r10, r11, r12, r13, r14)
                io.stashteam.stashapp.ui.home.c$a$c r12 = new io.stashteam.stashapp.ui.home.c$a$c
                r12.<init>(r0, r6)
                kotlinx.coroutines.p0 r6 = kotlinx.coroutines.C6088g.m22901a(r9, r10, r11, r12, r13, r14)
                io.stashteam.stashapp.ui.home.c r9 = r0.f14571s
                androidx.lifecycle.t r9 = r9.f14559g
                r0.f14563k = r2
                r0.f14564l = r7
                r0.f14565m = r8
                r0.f14566n = r6
                r0.f14567o = r9
                r0.f14570r = r5
                java.lang.Object r5 = r7.mo15956e(r0)
                if (r5 != r1) goto L_0x00be
                return r1
            L_0x00be:
                r15 = r9
                r9 = r2
                r2 = r15
            L_0x00c1:
                java.util.List r5 = (java.util.List) r5
                r0.f14563k = r9
                r0.f14564l = r7
                r0.f14565m = r8
                r0.f14566n = r6
                r0.f14567o = r2
                r0.f14568p = r5
                r0.f14570r = r4
                java.lang.Object r4 = r8.mo15956e(r0)
                if (r4 != r1) goto L_0x00d8
                return r1
            L_0x00d8:
                r15 = r5
                r5 = r2
                r2 = r15
            L_0x00db:
                java.util.List r4 = (java.util.List) r4
                r0.f14563k = r9
                r0.f14564l = r7
                r0.f14565m = r8
                r0.f14566n = r6
                r0.f14567o = r5
                r0.f14568p = r2
                r0.f14569q = r4
                r0.f14570r = r3
                java.lang.Object r3 = r6.mo15956e(r0)
                if (r3 != r1) goto L_0x00f4
                return r1
            L_0x00f4:
                r1 = r4
            L_0x00f5:
                java.util.List r3 = (java.util.List) r3
                io.stashteam.stashapp.ui.home.a r4 = new io.stashteam.stashapp.ui.home.a
                r4.<init>(r2, r1, r3)
                r5.mo2981b(r4)
                k.t r1 = p308k.C5812t.f14872a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.home.C5595c.C5596a.mo4016a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5596a aVar = new C5596a(this.f14571s, dVar);
            aVar.f14562j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5596a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C5595c(C5236e eVar, C4940a aVar) {
        C5942k.m22327b(eVar, "getGameListInteractor");
        C5942k.m22327b(aVar, "preferencesManager");
        this.f14560h = eVar;
        this.f14561i = aVar;
        mo15233h();
    }

    /* renamed from: f */
    public final LiveData<C5580a> mo15231f() {
        return this.f14559g;
    }

    /* renamed from: g */
    public final boolean mo15232g() {
        return this.f14561i.mo14093g();
    }

    /* renamed from: h */
    public final void mo15233h() {
        C5345a.m20868a(this, null, true, new C5596a(this, null), 1, null);
    }

    /* renamed from: i */
    public final void mo15234i() {
        this.f14561i.mo14084a(true);
    }
}
