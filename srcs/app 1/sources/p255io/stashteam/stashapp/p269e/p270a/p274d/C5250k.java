package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5171e;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5314s;
import p255io.stashteam.stashapp.utils.p305g.C5715a;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.k */
public final class C5250k implements C5201a<C5251a, C5314s> {

    /* renamed from: a */
    private final C4964c f13732a;

    /* renamed from: b */
    private final C5171e f13733b;

    /* renamed from: io.stashteam.stashapp.e.a.d.k$a */
    public static final class C5251a implements C5715a<C5251a> {

        /* renamed from: a */
        private final C5305k f13734a;

        /* renamed from: b */
        private final C5299h f13735b;

        /* renamed from: c */
        private final int f13736c;

        /* renamed from: d */
        private final int f13737d;

        public C5251a(C5305k kVar, C5299h hVar, int i, int i2) {
            C5942k.m22327b(kVar, "listType");
            C5942k.m22327b(hVar, "filterData");
            this.f13734a = kVar;
            this.f13735b = hVar;
            this.f13736c = i;
            this.f13737d = i2;
        }

        /* renamed from: a */
        public static /* synthetic */ C5251a m20612a(C5251a aVar, C5305k kVar, C5299h hVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                kVar = aVar.f13734a;
            }
            if ((i3 & 2) != 0) {
                hVar = aVar.f13735b;
            }
            if ((i3 & 4) != 0) {
                i = aVar.mo14814b();
            }
            if ((i3 & 8) != 0) {
                i2 = aVar.mo14816d();
            }
            return aVar.mo14812a(kVar, hVar, i, i2);
        }

        /* renamed from: a */
        public C5251a m20616a(int i, int i2) {
            return m20612a(this, null, null, i, i2, 3, null);
        }

        /* renamed from: a */
        public final C5251a mo14812a(C5305k kVar, C5299h hVar, int i, int i2) {
            C5942k.m22327b(kVar, "listType");
            C5942k.m22327b(hVar, "filterData");
            return new C5251a(kVar, hVar, i, i2);
        }

        /* renamed from: a */
        public final C5299h mo14813a() {
            return this.f13735b;
        }

        /* renamed from: b */
        public int mo14814b() {
            return this.f13736c;
        }

        /* renamed from: c */
        public final C5305k mo14815c() {
            return this.f13734a;
        }

        /* renamed from: d */
        public int mo14816d() {
            return this.f13737d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (mo14816d() == r3.mo14816d()) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a
                if (r0 == 0) goto L_0x0031
                io.stashteam.stashapp.e.a.d.k$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a) r3
                io.stashteam.stashapp.e.c.k r0 = r2.f13734a
                io.stashteam.stashapp.e.c.k r1 = r3.f13734a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0031
                io.stashteam.stashapp.e.c.h r0 = r2.f13735b
                io.stashteam.stashapp.e.c.h r1 = r3.f13735b
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0031
                int r0 = r2.mo14814b()
                int r1 = r3.mo14814b()
                if (r0 != r1) goto L_0x0031
                int r0 = r2.mo14816d()
                int r3 = r3.mo14816d()
                if (r0 != r3) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C5305k kVar = this.f13734a;
            int i = 0;
            int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
            C5299h hVar = this.f13735b;
            if (hVar != null) {
                i = hVar.hashCode();
            }
            return ((((hashCode + i) * 31) + mo14814b()) * 31) + mo14816d();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listType=");
            sb.append(this.f13734a);
            sb.append(", filterData=");
            sb.append(this.f13735b);
            sb.append(", limit=");
            sb.append(mo14814b());
            sb.append(", offset=");
            sb.append(mo14816d());
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.LoadOwnGameListInteractor", mo15594f = "LoadOwnGameListInteractor.kt", mo15595l = {24, 28, 29}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.k$b */
    static final class C5252b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13738i;

        /* renamed from: j */
        int f13739j;

        /* renamed from: k */
        final /* synthetic */ C5250k f13740k;

        /* renamed from: l */
        Object f13741l;

        /* renamed from: m */
        Object f13742m;

        /* renamed from: n */
        Object f13743n;

        /* renamed from: o */
        Object f13744o;

        C5252b(C5250k kVar, C5866d dVar) {
            this.f13740k = kVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13738i = obj;
            this.f13739j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13740k.mo14718a((C5251a) null, (C5866d<? super C5314s>) this);
        }
    }

    public C5250k(C4964c cVar, C5171e eVar) {
        C5942k.m22327b(cVar, "gameRepository");
        C5942k.m22327b(eVar, "shortGameEntityMapper");
        this.f13732a = cVar;
        this.f13733b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        if (r5 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        if (r6 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a r14, p308k.p316w.C5866d<? super p255io.stashteam.stashapp.p269e.p280c.C5314s> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5252b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            io.stashteam.stashapp.e.a.d.k$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5252b) r0
            int r1 = r0.f13739j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13739j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.k$b r0 = new io.stashteam.stashapp.e.a.d.k$b
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f13738i
            java.lang.Object r9 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r0.f13739j
            r10 = 3
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0067
            if (r1 == r2) goto L_0x0059
            if (r1 == r11) goto L_0x0048
            if (r1 != r10) goto L_0x0040
            java.lang.Object r14 = r0.f13744o
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r0.f13743n
            io.stashteam.stashapp.data.network.response.PagingResponse r14 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r14
            java.lang.Object r1 = r0.f13742m
            io.stashteam.stashapp.e.a.d.k$a r1 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a) r1
            java.lang.Object r0 = r0.f13741l
            io.stashteam.stashapp.e.a.d.k r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k) r0
            p308k.C5806n.m22054a(r15)
            goto L_0x012f
        L_0x0040:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0048:
            java.lang.Object r14 = r0.f13743n
            io.stashteam.stashapp.data.network.response.PagingResponse r14 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r14
            java.lang.Object r1 = r0.f13742m
            io.stashteam.stashapp.e.a.d.k$a r1 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a) r1
            java.lang.Object r2 = r0.f13741l
            io.stashteam.stashapp.e.a.d.k r2 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k) r2
            p308k.C5806n.m22054a(r15)
            goto L_0x011a
        L_0x0059:
            java.lang.Object r14 = r0.f13742m
            io.stashteam.stashapp.e.a.d.k$a r14 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.C5251a) r14
            java.lang.Object r1 = r0.f13741l
            io.stashteam.stashapp.e.a.d.k r1 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k) r1
            p308k.C5806n.m22054a(r15)
            r2 = r1
            goto L_0x00ff
        L_0x0067:
            p308k.C5806n.m22054a(r15)
            io.stashteam.stashapp.e.c.k r15 = r14.mo14815c()
            int[] r1 = p255io.stashteam.stashapp.p269e.p270a.p274d.C5253l.f13745a
            int r15 = r15.ordinal()
            r15 = r1[r15]
            if (r15 == r2) goto L_0x00a1
            if (r15 == r11) goto L_0x00a1
            if (r15 != r10) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't support "
            r0.append(r1)
            io.stashteam.stashapp.e.c.k r14 = r14.mo14815c()
            java.lang.String r14 = r14.name()
            r0.append(r14)
            java.lang.String r14 = " type."
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
        L_0x00a1:
            io.stashteam.stashapp.b.d.c r1 = r13.f13732a
            io.stashteam.stashapp.e.c.k r15 = r14.mo14815c()
            java.lang.String r15 = r15.mo14958i()
            int r3 = r14.mo14814b()
            int r4 = r14.mo14816d()
            io.stashteam.stashapp.e.c.h r5 = r14.mo14813a()
            io.stashteam.stashapp.e.c.b0 r5 = r5.mo14938h()
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = r5.mo14861f()
            if (r5 == 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            io.stashteam.stashapp.e.c.b0 r5 = p255io.stashteam.stashapp.p269e.p280c.C5288b0.ADDED_DATE
            java.lang.String r5 = r5.mo14861f()
        L_0x00ca:
            io.stashteam.stashapp.e.c.h r6 = r14.mo14813a()
            io.stashteam.stashapp.e.c.b0 r6 = r6.mo14938h()
            if (r6 == 0) goto L_0x00e1
            io.stashteam.stashapp.e.c.a0 r6 = r6.mo14863h()
            if (r6 == 0) goto L_0x00e1
            java.lang.String r6 = r6.mo14860f()
            if (r6 == 0) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            io.stashteam.stashapp.e.c.a0 r6 = p255io.stashteam.stashapp.p269e.p280c.C5286a0.f13825h
            java.lang.String r6 = r6.mo14860f()
        L_0x00e7:
            io.stashteam.stashapp.e.c.h r7 = r14.mo14813a()
            java.lang.String r7 = r7.mo14930a()
            r0.f13741l = r13
            r0.f13742m = r14
            r0.f13739j = r2
            r2 = r15
            r8 = r0
            java.lang.Object r15 = r1.mo14172a(r2, r3, r4, r5, r6, r7, r8)
            if (r15 != r9) goto L_0x00fe
            return r9
        L_0x00fe:
            r2 = r13
        L_0x00ff:
            io.stashteam.stashapp.data.network.response.PagingResponse r15 = (p255io.stashteam.stashapp.data.network.response.PagingResponse) r15
            io.stashteam.stashapp.data.local.db.c.e r1 = r2.f13733b
            java.util.List r3 = r15.getItems()
            r0.f13741l = r2
            r0.f13742m = r14
            r0.f13743n = r15
            r0.f13739j = r11
            java.lang.Object r1 = r1.mo14350a(r3, r0)
            if (r1 != r9) goto L_0x0116
            return r9
        L_0x0116:
            r12 = r1
            r1 = r14
            r14 = r15
            r15 = r12
        L_0x011a:
            java.util.List r15 = (java.util.List) r15
            io.stashteam.stashapp.b.d.c r3 = r2.f13732a
            r0.f13741l = r2
            r0.f13742m = r1
            r0.f13743n = r14
            r0.f13744o = r15
            r0.f13739j = r10
            java.lang.Object r15 = r3.mo14176a(r15, r0)
            if (r15 != r9) goto L_0x012f
            return r9
        L_0x012f:
            int r15 = r14.getLimit()
            int r0 = r14.getOffset()
            int r1 = r14.getTotal()
            java.util.List r14 = r14.getItems()
            int r14 = r14.size()
            io.stashteam.stashapp.e.c.s r2 = new io.stashteam.stashapp.e.c.s
            r2.<init>(r15, r0, r1, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5250k.mo14718a(io.stashteam.stashapp.e.a.d.k$a, k.w.d):java.lang.Object");
    }
}
