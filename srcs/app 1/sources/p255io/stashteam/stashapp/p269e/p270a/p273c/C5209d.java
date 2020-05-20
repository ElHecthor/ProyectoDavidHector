package p255io.stashteam.stashapp.p269e.p270a.p273c;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4957b;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.c.d */
public final class C5209d implements C5201a<C5210a, C5812t> {

    /* renamed from: a */
    private final C4957b f13595a;

    /* renamed from: io.stashteam.stashapp.e.a.c.d$a */
    public static final class C5210a {

        /* renamed from: a */
        private final long f13596a;

        /* renamed from: b */
        private final long f13597b;

        public C5210a(long j, long j2) {
            this.f13596a = j;
            this.f13597b = j2;
        }

        /* renamed from: a */
        public final long mo14746a() {
            return this.f13597b;
        }

        /* renamed from: b */
        public final long mo14747b() {
            return this.f13596a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5.f13597b == r6.f13597b) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                if (r5 == r6) goto L_0x001b
                boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5210a
                if (r0 == 0) goto L_0x0019
                io.stashteam.stashapp.e.a.c.d$a r6 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5210a) r6
                long r0 = r5.f13596a
                long r2 = r6.f13596a
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0019
                long r0 = r5.f13597b
                long r2 = r6.f13597b
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
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5210a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (C3085d.m12547a(this.f13596a) * 31) + C3085d.m12547a(this.f13597b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(listId=");
            sb.append(this.f13596a);
            sb.append(", gameId=");
            sb.append(this.f13597b);
            sb.append(")");
            return sb.toString();
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.custom_lists.DeleteGameFromCustomListInteractor", mo15594f = "DeleteGameFromCustomListInteractor.kt", mo15595l = {11}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.c.d$b */
    static final class C5211b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13598i;

        /* renamed from: j */
        int f13599j;

        /* renamed from: k */
        final /* synthetic */ C5209d f13600k;

        /* renamed from: l */
        Object f13601l;

        /* renamed from: m */
        Object f13602m;

        C5211b(C5209d dVar, C5866d dVar2) {
            this.f13600k = dVar;
            super(dVar2);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13598i = obj;
            this.f13599j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13600k.mo14718a((C5210a) null, (C5866d<? super C5812t>) this);
        }
    }

    public C5209d(C4957b bVar) {
        C5942k.m22327b(bVar, "customListsRepository");
        this.f13595a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5210a r10, p308k.p316w.C5866d<? super p308k.C5812t> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5211b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            io.stashteam.stashapp.e.a.c.d$b r0 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5211b) r0
            int r1 = r0.f13599j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13599j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.c.d$b r0 = new io.stashteam.stashapp.e.a.c.d$b
            r0.<init>(r9, r11)
        L_0x0018:
            r6 = r0
            java.lang.Object r11 = r6.f13598i
            java.lang.Object r0 = p308k.p316w.p317i.C5885d.m22250a()
            int r1 = r6.f13599j
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            java.lang.Object r10 = r6.f13602m
            io.stashteam.stashapp.e.a.c.d$a r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.C5210a) r10
            java.lang.Object r10 = r6.f13601l
            io.stashteam.stashapp.e.a.c.d r10 = (p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d) r10
            p308k.C5806n.m22054a(r11)
            goto L_0x0056
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            p308k.C5806n.m22054a(r11)
            io.stashteam.stashapp.b.d.b r1 = r9.f13595a
            long r3 = r10.mo14747b()
            long r7 = r10.mo14746a()
            r6.f13601l = r9
            r6.f13602m = r10
            r6.f13599j = r2
            r2 = r3
            r4 = r7
            java.lang.Object r10 = r1.mo14163b(r2, r4, r6)
            if (r10 != r0) goto L_0x0056
            return r0
        L_0x0056:
            k.t r10 = p308k.C5812t.f14872a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p273c.C5209d.mo14718a(io.stashteam.stashapp.e.a.c.d$a, k.w.d):java.lang.Object");
    }
}
