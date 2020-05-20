package p255io.stashteam.stashapp.p281f.p294e;

import androidx.lifecycle.C0532t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.p327a3.C5981f;
import kotlinx.coroutines.p327a3.C5982g;
import kotlinx.coroutines.p328b3.C6020a;
import kotlinx.coroutines.p328b3.C6021b;
import kotlinx.coroutines.p328b3.C6022c;
import p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p287i.C5345a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.e.b */
public final class C5440b extends C5345a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5981f<String> f14220g = C5982g.m22497a(-1);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0532t<List<C5323z>> f14221h = new C0532t<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0532t<Boolean> f14222i = new C0532t<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C0532t<Boolean> f14223j = new C0532t<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5254m f14224k;

    @C5891f(mo15593c = "io.stashteam.stashapp.ui.search.SearchViewModel$1", mo15594f = "SearchViewModel.kt", mo15595l = {55}, mo15596m = "invokeSuspend")
    /* renamed from: io.stashteam.stashapp.f.e.b$a */
    static final class C5441a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f14225j;

        /* renamed from: k */
        Object f14226k;

        /* renamed from: l */
        Object f14227l;

        /* renamed from: m */
        int f14228m;

        /* renamed from: n */
        final /* synthetic */ C5440b f14229n;

        /* renamed from: io.stashteam.stashapp.f.e.b$a$a */
        public static final class C5442a implements C6021b<String> {

            /* renamed from: a */
            final /* synthetic */ C5441a f14230a;

            @C5891f(mo15593c = "io.stashteam.stashapp.ui.search.SearchViewModel$1$invokeSuspend$$inlined$collect$1", mo15594f = "SearchViewModel.kt", mo15595l = {138}, mo15596m = "emit")
            /* renamed from: io.stashteam.stashapp.f.e.b$a$a$a */
            public static final class C5443a extends C5889d {

                /* renamed from: i */
                /* synthetic */ Object f14231i;

                /* renamed from: j */
                int f14232j;

                /* renamed from: k */
                final /* synthetic */ C5442a f14233k;

                /* renamed from: l */
                Object f14234l;

                /* renamed from: m */
                Object f14235m;

                /* renamed from: n */
                Object f14236n;

                /* renamed from: o */
                Object f14237o;

                /* renamed from: p */
                Object f14238p;

                /* renamed from: q */
                Object f14239q;

                public C5443a(C5442a aVar, C5866d dVar) {
                    this.f14233k = aVar;
                    super(dVar);
                }

                /* renamed from: a */
                public final Object mo4016a(Object obj) {
                    this.f14231i = obj;
                    this.f14232j |= RecyclerView.UNDEFINED_DURATION;
                    return this.f14233k.mo15106a(null, this);
                }
            }

            public C5442a(C5441a aVar) {
                this.f14230a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x009f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object mo15106a(java.lang.Object r8, p308k.p316w.C5866d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p255io.stashteam.stashapp.p281f.p294e.C5440b.C5441a.C5442a.C5443a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    io.stashteam.stashapp.f.e.b$a$a$a r0 = (p255io.stashteam.stashapp.p281f.p294e.C5440b.C5441a.C5442a.C5443a) r0
                    int r1 = r0.f14232j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f14232j = r1
                    goto L_0x0018
                L_0x0013:
                    io.stashteam.stashapp.f.e.b$a$a$a r0 = new io.stashteam.stashapp.f.e.b$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f14231i
                    java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
                    int r2 = r0.f14232j
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L_0x0048
                    if (r2 != r4) goto L_0x0040
                    java.lang.Object r8 = r0.f14239q
                    androidx.lifecycle.t r8 = (androidx.lifecycle.C0532t) r8
                    java.lang.Object r1 = r0.f14238p
                    io.stashteam.stashapp.e.a.d.m$a r1 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5254m.C5255a) r1
                    java.lang.Object r1 = r0.f14237o
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.Object r2 = r0.f14236n
                    k.w.d r2 = (p308k.p316w.C5866d) r2
                    java.lang.Object r2 = r0.f14235m
                    java.lang.Object r0 = r0.f14234l
                    io.stashteam.stashapp.f.e.b$a$a r0 = (p255io.stashteam.stashapp.p281f.p294e.C5440b.C5441a.C5442a) r0
                    p308k.C5806n.m22054a(r9)
                    goto L_0x008d
                L_0x0040:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0048:
                    p308k.C5806n.m22054a(r9)
                    r9 = r8
                    java.lang.String r9 = (java.lang.String) r9
                    io.stashteam.stashapp.f.e.b$a r2 = r7.f14230a
                    io.stashteam.stashapp.f.e.b r2 = r2.f14229n
                    androidx.lifecycle.t r2 = r2.f14223j
                    java.lang.Boolean r5 = p308k.p316w.p318j.p319a.C5887b.m22259a(r4)
                    r2.mo2981b(r5)
                    io.stashteam.stashapp.e.a.d.m$a r2 = new io.stashteam.stashapp.e.a.d.m$a
                    r5 = 30
                    r2.<init>(r9, r5, r3)
                    io.stashteam.stashapp.f.e.b$a r5 = r7.f14230a
                    io.stashteam.stashapp.f.e.b r5 = r5.f14229n
                    androidx.lifecycle.t r5 = r5.f14221h
                    io.stashteam.stashapp.f.e.b$a r6 = r7.f14230a
                    io.stashteam.stashapp.f.e.b r6 = r6.f14229n
                    io.stashteam.stashapp.e.a.d.m r6 = r6.f14224k
                    r0.f14234l = r7
                    r0.f14235m = r8
                    r0.f14236n = r0
                    r0.f14237o = r9
                    r0.f14238p = r2
                    r0.f14239q = r5
                    r0.f14232j = r4
                    java.lang.Object r8 = r6.mo14718a(r2, r0)
                    if (r8 != r1) goto L_0x0089
                    return r1
                L_0x0089:
                    r0 = r7
                    r1 = r9
                    r9 = r8
                    r8 = r5
                L_0x008d:
                    r8.mo2981b(r9)
                    io.stashteam.stashapp.f.e.b$a r8 = r0.f14230a
                    io.stashteam.stashapp.f.e.b r8 = r8.f14229n
                    androidx.lifecycle.t r8 = r8.f14222i
                    int r9 = r1.length()
                    if (r9 <= 0) goto L_0x009f
                    goto L_0x00a0
                L_0x009f:
                    r4 = 0
                L_0x00a0:
                    java.lang.Boolean r9 = p308k.p316w.p318j.p319a.C5887b.m22259a(r4)
                    r8.mo2981b(r9)
                    io.stashteam.stashapp.f.e.b$a r8 = r0.f14230a
                    io.stashteam.stashapp.f.e.b r8 = r8.f14229n
                    androidx.lifecycle.t r8 = r8.f14223j
                    java.lang.Boolean r9 = p308k.p316w.p318j.p319a.C5887b.m22259a(r3)
                    r8.mo2981b(r9)
                    k.t r8 = p308k.C5812t.f14872a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p294e.C5440b.C5441a.C5442a.mo15106a(java.lang.Object, k.w.d):java.lang.Object");
            }
        }

        C5441a(C5440b bVar, C5866d dVar) {
            this.f14229n = bVar;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            Object a = C5885d.m22250a();
            int i = this.f14228m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f14225j;
                C6020a a2 = C6022c.m22672a(C6022c.m22671a(this.f14229n.f14220g), 500);
                C5442a aVar = new C5442a(this);
                this.f14226k = g0Var;
                this.f14227l = a2;
                this.f14228m = 1;
                if (a2.mo15758a(aVar, this) == a) {
                    return a;
                }
            } else if (i == 1) {
                C6020a aVar2 = (C6020a) this.f14227l;
                C6089g0 g0Var2 = (C6089g0) this.f14226k;
                C5806n.m22054a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5812t.f14872a;
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C5441a aVar = new C5441a(this.f14229n, dVar);
            aVar.f14225j = (C6089g0) obj;
            return aVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C5441a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.b$b */
    public static final class C5444b {
        private C5444b() {
        }

        public /* synthetic */ C5444b(C5938g gVar) {
            this();
        }
    }

    static {
        new C5444b(null);
    }

    public C5440b(C5254m mVar) {
        C5942k.m22327b(mVar, "searchGameInteractor");
        this.f14224k = mVar;
        C6088g.m22903b(mo15050e(), null, null, new C5441a(this, null), 3, null);
    }

    /* renamed from: b */
    public final void mo15102b(String str) {
        C5942k.m22327b(str, "query");
        this.f14220g.offer(str);
    }

    /* renamed from: f */
    public final LiveData<List<C5323z>> mo15103f() {
        return this.f14221h;
    }

    /* renamed from: g */
    public final LiveData<Boolean> mo15104g() {
        return this.f14223j;
    }

    /* renamed from: h */
    public final LiveData<Boolean> mo15105h() {
        return this.f14222i;
    }
}
