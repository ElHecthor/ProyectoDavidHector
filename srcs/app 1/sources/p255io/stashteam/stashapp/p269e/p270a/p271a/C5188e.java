package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5174g;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p280c.C5287b;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.e */
public final class C5188e implements C5201a<C5189a, C5812t> {

    /* renamed from: a */
    private final C4944a f13522a;

    /* renamed from: b */
    private final C5174g f13523b;

    /* renamed from: io.stashteam.stashapp.e.a.a.e$a */
    public static final class C5189a {

        /* renamed from: a */
        private final String f13524a;

        /* renamed from: b */
        private final C5287b f13525b;

        public C5189a(String str, C5287b bVar) {
            C5942k.m22327b(str, "token");
            C5942k.m22327b(bVar, "method");
            this.f13524a = str;
            this.f13525b = bVar;
        }

        /* renamed from: a */
        public final C5287b mo14722a() {
            return this.f13525b;
        }

        /* renamed from: b */
        public final String mo14723b() {
            return this.f13524a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13525b, (java.lang.Object) r3.f13525b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a
                if (r0 == 0) goto L_0x001d
                io.stashteam.stashapp.e.a.a.e$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a) r3
                java.lang.String r0 = r2.f13524a
                java.lang.String r1 = r3.f13524a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x001d
                io.stashteam.stashapp.e.c.b r0 = r2.f13525b
                io.stashteam.stashapp.e.c.b r3 = r3.f13525b
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f13524a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C5287b bVar = this.f13525b;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(token=");
            sb.append(this.f13524a);
            sb.append(", method=");
            sb.append(this.f13525b);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.SignInInteractor", mo15594f = "SignInInteractor.kt", mo15595l = {16, 17, 19, 20}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.e$b */
    static final class C5190b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13526i;

        /* renamed from: j */
        int f13527j;

        /* renamed from: k */
        final /* synthetic */ C5188e f13528k;

        /* renamed from: l */
        Object f13529l;

        /* renamed from: m */
        Object f13530m;

        /* renamed from: n */
        Object f13531n;

        /* renamed from: o */
        Object f13532o;

        C5190b(C5188e eVar, C5866d dVar) {
            this.f13528k = eVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13526i = obj;
            this.f13527j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13528k.mo14718a((C5189a) null, (C5866d<? super C5812t>) this);
        }
    }

    public C5188e(C4944a aVar, C5174g gVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(gVar, "userEntityMapper");
        this.f13522a = aVar;
        this.f13523b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a r9, p308k.p316w.C5866d<? super p308k.C5812t> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5190b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            io.stashteam.stashapp.e.a.a.e$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5190b) r0
            int r1 = r0.f13527j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13527j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.e$b r0 = new io.stashteam.stashapp.e.a.a.e$b
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f13526i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13527j
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0068
            if (r2 == r6) goto L_0x005c
            if (r2 == r5) goto L_0x005c
            if (r2 == r4) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r9 = r0.f13532o
            io.stashteam.stashapp.data.local.db.d.f r9 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r9
            java.lang.Object r9 = r0.f13531n
            io.stashteam.stashapp.data.network.model.UserApiModel r9 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r9
            java.lang.Object r9 = r0.f13530m
            io.stashteam.stashapp.e.a.a.e$a r9 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a) r9
            java.lang.Object r9 = r0.f13529l
            io.stashteam.stashapp.e.a.a.e r9 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e) r9
            p308k.C5806n.m22054a(r10)
            goto L_0x00d7
        L_0x0043:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004b:
            java.lang.Object r9 = r0.f13531n
            io.stashteam.stashapp.data.network.model.UserApiModel r9 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r9
            java.lang.Object r2 = r0.f13530m
            io.stashteam.stashapp.e.a.a.e$a r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a) r2
            java.lang.Object r4 = r0.f13529l
            io.stashteam.stashapp.e.a.a.e r4 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e) r4
            p308k.C5806n.m22054a(r10)
            goto L_0x00c2
        L_0x005c:
            java.lang.Object r9 = r0.f13530m
            io.stashteam.stashapp.e.a.a.e$a r9 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.C5189a) r9
            java.lang.Object r2 = r0.f13529l
            io.stashteam.stashapp.e.a.a.e r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e) r2
            p308k.C5806n.m22054a(r10)
            goto L_0x00a8
        L_0x0068:
            p308k.C5806n.m22054a(r10)
            io.stashteam.stashapp.e.c.b r10 = r9.mo14722a()
            int[] r2 = p255io.stashteam.stashapp.p269e.p270a.p271a.C5191f.f13533a
            int r10 = r10.ordinal()
            r10 = r2[r10]
            if (r10 == r6) goto L_0x0094
            if (r10 != r5) goto L_0x008e
            io.stashteam.stashapp.b.d.a r10 = r8.f13522a
            java.lang.String r2 = r9.mo14723b()
            r0.f13529l = r8
            r0.f13530m = r9
            r0.f13527j = r5
            java.lang.Object r10 = r10.mo14147b(r2, r0)
            if (r10 != r1) goto L_0x00a7
            return r1
        L_0x008e:
            k.k r9 = new k.k
            r9.<init>()
            throw r9
        L_0x0094:
            io.stashteam.stashapp.b.d.a r10 = r8.f13522a
            java.lang.String r2 = r9.mo14723b()
            r0.f13529l = r8
            r0.f13530m = r9
            r0.f13527j = r6
            java.lang.Object r10 = r10.mo14140a(r2, r0)
            if (r10 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r2 = r8
        L_0x00a8:
            io.stashteam.stashapp.data.network.model.UserApiModel r10 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r10
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
            io.stashteam.stashapp.data.local.db.c.g r5 = r10.f13523b
            r0.f13529l = r10
            r0.f13530m = r2
            r0.f13531n = r9
            r0.f13527j = r4
            java.lang.Object r4 = r5.mo14344a(r9, r0)
            if (r4 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            r7 = r4
            r4 = r10
            r10 = r7
        L_0x00c2:
            io.stashteam.stashapp.data.local.db.d.f r10 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r10
            io.stashteam.stashapp.b.d.a r5 = r4.f13522a
            r0.f13529l = r4
            r0.f13530m = r2
            r0.f13531n = r9
            r0.f13532o = r10
            r0.f13527j = r3
            java.lang.Object r9 = r5.mo14145b(r10, r0)
            if (r9 != r1) goto L_0x00d7
            return r1
        L_0x00d7:
            k.t r9 = p308k.C5812t.f14872a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5188e.mo14718a(io.stashteam.stashapp.e.a.a.e$a, k.w.d):java.lang.Object");
    }
}
