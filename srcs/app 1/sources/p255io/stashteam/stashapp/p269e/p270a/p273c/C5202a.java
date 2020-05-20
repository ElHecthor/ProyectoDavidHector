package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.a */
public final class C5202a implements C5201a<C5203a, C5812t> {

    /* renamed from: a */
    private final C4957b f13573a;

    /* renamed from: io.stashteam.stashapp.e.a.c.a$a */
    public static final class C5203a {

        /* renamed from: a */
        private final long f13574a;

        /* renamed from: b */
        private final long f13575b;

        public C5203a(long j, long j2) {
            this.f13574a = j;
            this.f13575b = j2;
        }

        /* renamed from: a */
        public final long mo14738a() {
            return this.f13575b;
        }

        /* renamed from: b */
        public final long mo14739b() {
            return this.f13574a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5.f13575b == r6.f13575b) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                if (r5 == r6) goto L_0x001b
                boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5203a
                if (r0 == 0) goto L_0x0019
                io.stashteam.stashapp.e.a.c.a$a r6 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5203a) r6
                long r0 = r5.f13574a
                long r2 = r6.f13574a
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0019
                long r0 = r5.f13575b
                long r2 = r6.f13575b
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 != 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r6 = 0
                return r6
            L_0x001b:
                r6 = 1
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5203a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (C3085d.m12547a(this.f13574a) * 31) + C3085d.m12547a(this.f13575b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listId=");
            sb.append(this.f13574a);
            sb.append(", gameId=");
            sb.append(this.f13575b);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.AddGameToCustomListInteractor", mo15594f = "AddGameToCustomListInteractor.kt", mo15595l = {11}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.a$b */
    static final class C5204b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13576i;

        /* renamed from: j */
        int f13577j;

        /* renamed from: k */
        final /* synthetic */ C5202a f13578k;

        /* renamed from: l */
        Object f13579l;

        /* renamed from: m */
        Object f13580m;

        C5204b(C5202a aVar, C5866d dVar) {
            this.f13578k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13576i = obj;
            this.f13577j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13578k.mo14718a((C5203a) null, (C5866d<? super C5812t>) this);
        }
    }

    public C5202a(C4957b bVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        this.f13573a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5203a r10, p308k.p316w.C5866d<? super p308k.C5812t> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5204b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            io.stashteam.stashapp.e.a.c.a$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5204b) r0
            int r1 = r0.f13577j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13577j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.a$b r0 = new io.stashteam.stashapp.e.a.c.a$b
            r0.<init>(r9, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.f13576i
            java.lang.Object r0 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r6.f13577j
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r10 = r6.f13580m
            io.stashteam.stashapp.e.a.c.a$a r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.C5203a) r10
            java.lang.Object r10 = r6.f13579l
            io.stashteam.stashapp.e.a.c.a r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a) r10
            p308k.C5806n.m22054a(r11)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            p308k.C5806n.m22054a(r11)
            io.stashteam.stashapp.b.d.b r1 = r9.f13573a
            long r3 = r10.mo14739b()
            long r7 = r10.mo14738a()
            r6.f13579l = r9
            r6.f13580m = r10
            r6.f13577j = r2
            r2 = r3
            r4 = r7
            java.lang.Object r10 = r1.mo14157a(r2, r4, r6)
            if (r10 != r0) goto L_0x0056
            return r0
        L_0x0056:
            k.t r10 = p308k.C5812t.f14872a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5202a.mo14718a(io.stashteam.stashapp.e.a.c.a$a, k.w.d):java.lang.Object");
    }
}
