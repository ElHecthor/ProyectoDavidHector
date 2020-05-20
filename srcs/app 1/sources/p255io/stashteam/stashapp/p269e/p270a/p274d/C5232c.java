package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.c */
public final class C5232c implements C5201a<C5305k, C5812t> {

    /* renamed from: a */
    private final C4964c f13671a;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.DeleteUserGamesInteractor", mo15594f = "DeleteUserGamesInteractor.kt", mo15595l = {10}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.c$a */
    static final class C5233a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13672i;

        /* renamed from: j */
        int f13673j;

        /* renamed from: k */
        final /* synthetic */ C5232c f13674k;

        /* renamed from: l */
        Object f13675l;

        /* renamed from: m */
        Object f13676m;

        /* renamed from: n */
        Object f13677n;

        C5233a(C5232c cVar, C5866d dVar) {
            this.f13674k = cVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13672i = obj;
            this.f13673j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13674k.mo14718a((C5305k) null, (C5866d<? super C5812t>) this);
        }
    }

    public C5232c(C4964c cVar) {
        C5942k.m22327b(cVar, "gameRepository");
        this.f13671a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p280c.C5305k r5, p308k.p316w.C5866d<? super p308k.C5812t> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5232c.C5233a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.stashteam.stashapp.e.a.d.c$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5232c.C5233a) r0
            int r1 = r0.f13673j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13673j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.c$a r0 = new io.stashteam.stashapp.e.a.d.c$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13672i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13673j
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r5 = r0.f13677n
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f13676m
            io.stashteam.stashapp.e.c.k r5 = (p255io.stashteam.stashapp.p269e.p280c.C5305k) r5
            java.lang.Object r5 = r0.f13675l
            io.stashteam.stashapp.e.a.d.c r5 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5232c) r5
            p308k.C5806n.m22054a(r6)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003d:
            p308k.C5806n.m22054a(r6)
            java.lang.String r6 = r5.mo14956g()
            if (r6 == 0) goto L_0x005a
            io.stashteam.stashapp.b.d.c r2 = r4.f13671a
            r0.f13675l = r4
            r0.f13676m = r5
            r0.f13677n = r6
            r0.f13673j = r3
            java.lang.Object r5 = r2.mo14175a(r6, r0)
            if (r5 != r1) goto L_0x0057
            return r1
        L_0x0057:
            k.t r5 = p308k.C5812t.f14872a
            return r5
        L_0x005a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't support "
            r0.append(r1)
            java.lang.String r5 = r5.name()
            r0.append(r5)
            java.lang.String r5 = " type."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5232c.mo14718a(io.stashteam.stashapp.e.c.k, k.w.d):java.lang.Object");
    }
}
