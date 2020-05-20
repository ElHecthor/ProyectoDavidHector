package p255io.stashteam.stashapp.p269e.p270a.p274d;

import androidx.recyclerview.widget.RecyclerView;
import p255io.stashteam.stashapp.p256b.p261d.C4964c;
import p255io.stashteam.stashapp.p269e.p270a.p272b.C5201a;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.a.d.i */
public final class C5245i implements C5201a<C5305k, Integer> {

    /* renamed from: a */
    private final C4964c f13713a;

    @C5891f(mo15593c = "io.stashteam.stashapp.domain.interactors.game.GetOwnGamesCountInteractor", mo15594f = "GetOwnGamesCountInteractor.kt", mo15595l = {10}, mo15596m = "invoke")
    /* renamed from: io.stashteam.stashapp.e.a.d.i$a */
    static final class C5246a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13714i;

        /* renamed from: j */
        int f13715j;

        /* renamed from: k */
        final /* synthetic */ C5245i f13716k;

        /* renamed from: l */
        Object f13717l;

        /* renamed from: m */
        Object f13718m;

        /* renamed from: n */
        Object f13719n;

        C5246a(C5245i iVar, C5866d dVar) {
            this.f13716k = iVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13714i = obj;
            this.f13715j |= RecyclerView.UNDEFINED_DURATION;
            return this.f13716k.mo14718a((C5305k) null, (C5866d<? super Integer>) this);
        }
    }

    public C5245i(C4964c cVar) {
        C5942k.m22327b(cVar, "gameRepository");
        this.f13713a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo14718a(p255io.stashteam.stashapp.p269e.p280c.C5305k r5, p308k.p316w.C5866d<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p255io.stashteam.stashapp.p269e.p270a.p274d.C5245i.C5246a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.stashteam.stashapp.e.a.d.i$a r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5245i.C5246a) r0
            int r1 = r0.f13715j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13715j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.e.a.d.i$a r0 = new io.stashteam.stashapp.e.a.d.i$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13714i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13715j
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r5 = r0.f13719n
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f13718m
            io.stashteam.stashapp.e.c.k r5 = (p255io.stashteam.stashapp.p269e.p280c.C5305k) r5
            java.lang.Object r0 = r0.f13717l
            io.stashteam.stashapp.e.a.d.i r0 = (p255io.stashteam.stashapp.p269e.p270a.p274d.C5245i) r0
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
            if (r6 == 0) goto L_0x006c
            io.stashteam.stashapp.b.d.c r2 = r4.f13713a
            r0.f13717l = r4
            r0.f13718m = r5
            r0.f13719n = r6
            r0.f13715j = r3
            java.lang.Object r6 = r2.mo14180b(r6, r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Integer r6 = p308k.p316w.p318j.p319a.C5887b.m22260a(r6)
            if (r6 == 0) goto L_0x006c
            int r5 = r6.intValue()
            java.lang.Integer r5 = p308k.p316w.p318j.p319a.C5887b.m22260a(r5)
            return r5
        L_0x006c:
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
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p270a.p274d.C5245i.mo14718a(io.stashteam.stashapp.e.c.k, k.w.d):java.lang.Object");
    }
}
