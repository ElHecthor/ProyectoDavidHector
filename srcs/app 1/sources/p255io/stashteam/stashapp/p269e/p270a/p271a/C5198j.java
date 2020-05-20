package p255io.stashteam.stashapp.p269e.p270a.p271a;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.data.local.p264db.p267c.C5174g;
import p255io.stashteam.stashapp.p256b.p261d.C4944a;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.a.j */
public final class C5198j implements C5201a<C5199a, C5812t> {

    /* renamed from: a */
    private final C4944a f13559a;

    /* renamed from: b */
    private final C5174g f13560b;

    /* renamed from: io.stashteam.stashapp.e.a.a.j$a */
    public static final class C5199a {

        /* renamed from: a */
        private final String f13561a;

        /* renamed from: b */
        private final String f13562b;

        /* renamed from: c */
        private final boolean f13563c;

        public C5199a(String str, String str2, boolean z) {
            C5942k.m22327b(str, "fullName");
            C5942k.m22327b(str2, "login");
            this.f13561a = str;
            this.f13562b = str2;
            this.f13563c = z;
        }

        /* renamed from: a */
        public final String mo14731a() {
            return this.f13561a;
        }

        /* renamed from: b */
        public final String mo14732b() {
            return this.f13562b;
        }

        /* renamed from: c */
        public final boolean mo14733c() {
            return this.f13563c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
            if (r2.f13563c == r3.f13563c) goto L_0x0025;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0025
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a
                if (r0 == 0) goto L_0x0023
                io.stashteam.stashapp.e.a.a.j$a r3 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a) r3
                java.lang.String r0 = r2.f13561a
                java.lang.String r1 = r3.f13561a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0023
                java.lang.String r0 = r2.f13562b
                java.lang.String r1 = r3.f13562b
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0023
                boolean r0 = r2.f13563c
                boolean r3 = r3.f13563c
                if (r0 != r3) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r3 = 0
                return r3
            L_0x0025:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f13561a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f13562b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f13563c;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(fullName=");
            sb.append(this.f13561a);
            sb.append(", login=");
            sb.append(this.f13562b);
            sb.append(", isClosed=");
            sb.append(this.f13563c);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.account.UpdateAccountInteractor", mo15594f = "UpdateAccountInteractor.kt", mo15595l = {18, 19, 20, 21}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.a.j$b */
    static final class C5200b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13564i;

        /* renamed from: j */
        int f13565j;

        /* renamed from: k */
        final /* synthetic */ C5198j f13566k;

        /* renamed from: l */
        Object f13567l;

        /* renamed from: m */
        Object f13568m;

        /* renamed from: n */
        Object f13569n;

        /* renamed from: o */
        Object f13570o;

        /* renamed from: p */
        Object f13571p;

        /* renamed from: q */
        Object f13572q;

        C5200b(C5198j jVar, C5866d dVar) {
            this.f13566k = jVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13564i = obj;
            this.f13565j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13566k.mo14718a((C5199a) null, (C5866d<? super C5812t>) this);
        }
    }

    public C5198j(C4944a aVar, C5174g gVar) {
        C5942k.m22327b(aVar, "accountRepository");
        C5942k.m22327b(gVar, "userEntityMapper");
        this.f13559a = aVar;
        this.f13560b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0135 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a r11, p308k.p316w.C5866d<? super p308k.C5812t> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5200b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            io.stashteam.stashapp.e.a.a.j$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5200b) r0
            int r1 = r0.f13565j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13565j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.a.j$b r0 = new io.stashteam.stashapp.e.a.a.j$b
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f13564i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13565j
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0098
            if (r2 == r6) goto L_0x0084
            if (r2 == r5) goto L_0x006c
            if (r2 == r4) goto L_0x004f
            if (r2 != r3) goto L_0x0047
            java.lang.Object r11 = r0.f13571p
            io.stashteam.stashapp.data.local.db.d.f r11 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r11
            java.lang.Object r11 = r0.f13570o
            io.stashteam.stashapp.data.network.model.UserApiModel r11 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r11
            java.lang.Object r11 = r0.f13569n
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r11 = r0.f13568m
            io.stashteam.stashapp.e.a.a.j$a r11 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a) r11
            java.lang.Object r11 = r0.f13567l
            io.stashteam.stashapp.e.a.a.j r11 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j) r11
            p308k.C5806n.m22054a(r12)
            goto L_0x0136
        L_0x0047:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004f:
            java.lang.Object r11 = r0.f13572q
            io.stashteam.stashapp.data.local.db.d.f r11 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r11
            java.lang.Object r2 = r0.f13571p
            io.stashteam.stashapp.data.local.db.d.f r2 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r2
            java.lang.Object r4 = r0.f13570o
            io.stashteam.stashapp.data.network.model.UserApiModel r4 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r4
            java.lang.Object r5 = r0.f13569n
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r6 = r0.f13568m
            io.stashteam.stashapp.e.a.a.j$a r6 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a) r6
            java.lang.Object r7 = r0.f13567l
            io.stashteam.stashapp.e.a.a.j r7 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j) r7
            p308k.C5806n.m22054a(r12)
            goto L_0x0114
        L_0x006c:
            java.lang.Object r11 = r0.f13570o
            io.stashteam.stashapp.data.network.model.UserApiModel r11 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r11
            java.lang.Object r2 = r0.f13569n
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r5 = r0.f13568m
            io.stashteam.stashapp.e.a.a.j$a r5 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a) r5
            java.lang.Object r6 = r0.f13567l
            io.stashteam.stashapp.e.a.a.j r6 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j) r6
            p308k.C5806n.m22054a(r12)
            r7 = r6
            r6 = r5
            r5 = r2
            goto L_0x00f7
        L_0x0084:
            java.lang.Object r11 = r0.f13569n
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.Object r2 = r0.f13568m
            io.stashteam.stashapp.e.a.a.j$a r2 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.C5199a) r2
            java.lang.Object r6 = r0.f13567l
            io.stashteam.stashapp.e.a.a.j r6 = (p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j) r6
            p308k.C5806n.m22054a(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L_0x00dc
        L_0x0098:
            p308k.C5806n.m22054a(r12)
            k.l[] r12 = new p308k.C5802l[r4]
            r2 = 0
            java.lang.String r7 = r11.mo14731a()
            java.lang.String r8 = "fullName"
            k.l r7 = p308k.C5808p.m22056a(r8, r7)
            r12[r2] = r7
            java.lang.String r2 = r11.mo14732b()
            java.lang.String r7 = "login"
            k.l r2 = p308k.C5808p.m22056a(r7, r2)
            r12[r6] = r2
            boolean r2 = r11.mo14733c()
            java.lang.Boolean r2 = p308k.p316w.p318j.p319a.C5887b.m22259a(r2)
            java.lang.String r7 = "closed"
            k.l r2 = p308k.C5808p.m22056a(r7, r2)
            r12[r5] = r2
            java.util.HashMap r12 = p308k.p314u.C5823c0.m22072a(r12)
            io.stashteam.stashapp.b.d.a r2 = r10.f13559a
            r0.f13567l = r10
            r0.f13568m = r11
            r0.f13569n = r12
            r0.f13565j = r6
            java.lang.Object r2 = r2.mo14141a(r12, r0)
            if (r2 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r6 = r10
        L_0x00dc:
            io.stashteam.stashapp.data.network.model.UserApiModel r2 = (p255io.stashteam.stashapp.data.network.model.UserApiModel) r2
            io.stashteam.stashapp.data.local.db.c.g r7 = r6.f13560b
            r0.f13567l = r6
            r0.f13568m = r11
            r0.f13569n = r12
            r0.f13570o = r2
            r0.f13565j = r5
            java.lang.Object r5 = r7.mo14344a(r2, r0)
            if (r5 != r1) goto L_0x00f1
            return r1
        L_0x00f1:
            r7 = r6
            r6 = r11
            r11 = r2
            r9 = r5
            r5 = r12
            r12 = r9
        L_0x00f7:
            io.stashteam.stashapp.data.local.db.d.f r12 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r12
            io.stashteam.stashapp.b.d.a r2 = r7.f13559a
            r0.f13567l = r7
            r0.f13568m = r6
            r0.f13569n = r5
            r0.f13570o = r11
            r0.f13571p = r12
            r0.f13572q = r12
            r0.f13565j = r4
            java.lang.Object r2 = r2.mo14142a(r0)
            if (r2 != r1) goto L_0x0110
            return r1
        L_0x0110:
            r4 = r11
            r11 = r12
            r12 = r2
            r2 = r11
        L_0x0114:
            io.stashteam.stashapp.data.local.db.d.f r12 = (p255io.stashteam.stashapp.data.local.p264db.p268d.C5180f) r12
            if (r12 == 0) goto L_0x011d
            io.stashteam.stashapp.data.local.db.d.e r12 = r12.mo14403g()
            goto L_0x011e
        L_0x011d:
            r12 = 0
        L_0x011e:
            r11.mo14396a(r12)
            io.stashteam.stashapp.b.d.a r11 = r7.f13559a
            r0.f13567l = r7
            r0.f13568m = r6
            r0.f13569n = r5
            r0.f13570o = r4
            r0.f13571p = r2
            r0.f13565j = r3
            java.lang.Object r11 = r11.mo14138a(r2, r0)
            if (r11 != r1) goto L_0x0136
            return r1
        L_0x0136:
            k.t r11 = p308k.C5812t.f14872a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p271a.C5198j.mo14718a(io.stashteam.stashapp.e.a.a.j$a, k.w.d):java.lang.Object");
    }
}
